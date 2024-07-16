
package org.utils;

import org.sol4k.Connection;
import org.sol4k.PublicKey;
import org.sol4k.RpcUrl;

public class ConnectionUtil {
    public static Connection getTestNetConnection() {
        Connection connection = new Connection(RpcUrl.TESTNET);
        return connection;
    }

    public static Connection getMainNetConnection() {
        Connection connection = new Connection(RpcUrl.MAINNNET);
        return connection;
    }

    public static Connection getDevNetConnection() {
        Connection connection = new Connection(RpcUrl.DEVNET);
        return connection;
    }

    public static Connection getConnection(String rpcUrl) {
        Connection connection = new Connection(rpcUrl);
        return connection;
    }

    public static void requestAirdrop(String address, long lamports) {
        Connection connection = ConnectionUtil.getTestNetConnection();
        String hash = connection.requestAirdrop(new PublicKey(address), lamports);
        System.out.println(hash);
    }
}
