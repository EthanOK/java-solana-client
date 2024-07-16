package org.utils;

import org.sol4k.Base58;
import org.sol4k.Keypair;
import org.sol4k.PublicKey;

public class SolanaSignature {
    /**
     * Verify Solana Signature
     */
    public static boolean verifySolanaSignature(String message, String signature, String walletAddress) {
        byte[] messageBytes = message.getBytes();
        PublicKey publicKey = new PublicKey(walletAddress);
        byte[] signatureBytes = Base58.decode(signature);
        return publicKey.verify(signatureBytes, messageBytes);

    }

    /**
     * Sign Message
     */
    public static String signMessage(String privateKey, String message) {
        Keypair keypair = Keypair.fromSecretKey(Base58.decode(privateKey));
        byte[] signatureBytes = keypair.sign(message.getBytes());
        String signature = Base58.encode(signatureBytes);
        return signature;
    }

}

// <dependency>
// <groupId>org.sol4k</groupId>
// <artifactId>sol4k</artifactId>
// <version>0.4.1</version>
// </dependency>
