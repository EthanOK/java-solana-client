package org.utils;

import org.sol4k.Base58;
import org.sol4k.Keypair;

public class KeypairUtil {
    public static Keypair genetateKeypair() {
        Keypair keypair = Keypair.generate();
        return keypair;
    }

    /**
     * Get Keypair
     * 
     * @param privateKey Must be Base58 String
     * @return Keypair
     */
    public static Keypair getKeypair(String privateKey) {
        Keypair keypair = Keypair.fromSecretKey(Base58.decode(privateKey));
        return keypair;

    }

    public static String getPrivatekey(Keypair keypair) {
        return Base58.encode(keypair.getSecret());

    }

    public static String getPublickey(Keypair keypair) {
        return keypair.getPublicKey().toBase58();

    }

}
