package org.utils;

import org.sol4k.Base58;
import org.sol4k.PublicKey;

public class VerifySolanaSignature {

    public static boolean verifySolanaSignature(String message, String signature, String walletAddress) {
        byte[] messageBytes = message.getBytes();
        PublicKey publicKey = new PublicKey(walletAddress);
        byte[] signatureBytes = Base58.decode(signature);
        return publicKey.verify(signatureBytes, messageBytes);

    }

}

// <dependency>
// <groupId>org.sol4k</groupId>
// <artifactId>sol4k</artifactId>
// <version>0.4.1</version>
// </dependency>
