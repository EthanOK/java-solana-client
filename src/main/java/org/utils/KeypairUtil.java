package org.utils;

import org.sol4k.Base58;
import org.sol4k.Keypair;
import org.sol4k.PublicKey;

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

    public static String getPublickeyString(String secret) {
        return Keypair.fromSecretKey(Base58.decode(secret)).getPublicKey().toBase58();
    }

    public static PublicKey getPublickey(String secret) {
        return Keypair.fromSecretKey(Base58.decode(secret)).getPublicKey();
    }

}
