package org.utils;

import org.sol4k.Connection;
import org.sol4k.PublicKey;
import org.sol4k.Transaction;
import org.sol4k.instruction.TransferInstruction;

public class TransferUtil {
    public static String transferSOL(Connection connection, String from_privatekey, String to, long lamports) {
        String recentBlockhash = connection.getLatestBlockhash();
        PublicKey from = KeypairUtil.getPublickey(from_privatekey);
        PublicKey to_ = new PublicKey(to);
        TransferInstruction instruction = new TransferInstruction(from, to_, lamports);
        Transaction transaction = new Transaction(recentBlockhash, instruction, from);

        transaction.sign(KeypairUtil.getKeypair(from_privatekey));

        String transactionHash = connection.sendTransaction(transaction);

        return transactionHash;
    }

    public static String transferSOL(Connection connection, String from_privatekey, String to, long lamports,
            String feePayer_privatekey) {
        String recentBlockhash = connection.getLatestBlockhash();
        PublicKey from = KeypairUtil.getPublickey(from_privatekey);
        PublicKey to_ = new PublicKey(to);
        PublicKey feePayer = KeypairUtil.getPublickey(feePayer_privatekey);
        TransferInstruction instruction = new TransferInstruction(from, to_, lamports);
        Transaction transaction = new Transaction(recentBlockhash, instruction, feePayer);

        // TODO: feePayer 先对交易进行签名
        transaction.sign(KeypairUtil.getKeypair(feePayer_privatekey));

        transaction.sign(KeypairUtil.getKeypair(from_privatekey));

        String transactionHash = connection.sendTransaction(transaction);

        return transactionHash;
    }
}
