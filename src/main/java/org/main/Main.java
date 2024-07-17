package org.main;

import java.math.BigInteger;

import org.sol4k.Connection;
import org.sol4k.api.AccountInfo;
import org.tests.*;
import org.utils.ConnectionUtil;
import org.utils.KeypairUtil;
import org.utils.TransferUtil;

public class Main {
    public static void main(String[] args) {

        long lamports = 1_000_000_000;

        String privateKey_Test = "3EzBkP4ghYEARRHJGC5SRJSX52uWXy2p2zHS8eeN8A4Gm84pCnSNjMFuDadLnoKK65jTXq1iPnvVCvwxGYDud981";

        String feePayer_privatekey = "4RtKx7PbmnLSJfFVYzsD6AkEJr761mS4TVXAf74cZ6c3tPYe3sCLQG8bGbG1d7zd9Ze31aznP91RZt9qHQggaaTr";

        String account = KeypairUtil.getPublickeyString(privateKey_Test);

        String receiver = "BdJXRoWCqBmMQVu8hCLmq3KC5M9LMCiHhVEHdiEJ3E4p";

        System.out.println("Hello Solana!");

        // TestVerifySignature.testVerifySignature();

        // TestGenerateKeypair.testGenerateKeypair();

        // ConnectionUtil.requestAirdrop(account, lamports);

        Connection connection = ConnectionUtil.getTestNetConnection();

        // AccountInfo accountInfo =
        // connection.getAccountInfo(KeypairUtil.getPublickey(privateKey_Test));
        // System.out.println(accountInfo);

        String txhash = TransferUtil.transferSOL(connection, privateKey_Test, receiver, 1000000, feePayer_privatekey);
        System.out.println(txhash);

    }
}