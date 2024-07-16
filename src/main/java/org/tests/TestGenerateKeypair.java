package org.tests;

import org.sol4k.Keypair;
import org.utils.GenerateKeypair;
import org.utils.SolanaSignature;

public class TestGenerateKeypair {
    public static void testGenerateKeypair() {
        System.out.println("```GenerateKeypair```");
        Keypair keypair = GenerateKeypair.genetateKeypair();
        String privateKey = GenerateKeypair.getPrivatekey(keypair);
        String publicKey = keypair.getPublicKey().toBase58();
        System.out.println("Private Key: " + privateKey);
        System.out.println("Public Key: " + publicKey);

        System.out.println("```Sign Message```");
        String message = "Hello World";
        System.out.println("Message: " + message);
        String signature = SolanaSignature.signMessage(privateKey, message);
        System.out.println("Signature: " + signature);
        System.out.println("```Verify Signature```");
        boolean verifyResult = SolanaSignature.verifySolanaSignature(message, signature, publicKey);
        System.out.println("Verify result: " + verifyResult);
    }
}
