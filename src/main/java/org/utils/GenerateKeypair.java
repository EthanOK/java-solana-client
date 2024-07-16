package org.utils;

import org.sol4k.Base58;
import org.sol4k.Keypair;

public class GenerateKeypair {
    public static Keypair genetateKeypair() {
        Keypair keypair = Keypair.generate();
        return keypair;
    }

    public static String getPrivatekey(Keypair keypair) {
        return Base58.encode(keypair.getSecret());

    }

    public static String getPublickey(Keypair keypair) {
        return keypair.getPublicKey().toBase58();

    }

}
