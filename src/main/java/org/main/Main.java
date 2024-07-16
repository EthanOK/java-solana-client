package org.main;

import java.math.BigInteger;

import org.sol4k.Connection;
import org.sol4k.api.AccountInfo;
import org.tests.*;
import org.utils.ConnectionUtil;
import org.utils.KeypairUtil;

public class Main {
    public static void main(String[] args) {

        long lamports = 1_000_000_000;

        String privateKey_Test = "3EzBkP4ghYEARRHJGC5SRJSX52uWXy2p2zHS8eeN8A4Gm84pCnSNjMFuDadLnoKK65jTXq1iPnvVCvwxGYDud981";

        String address = KeypairUtil.getPublickeyString(privateKey_Test);

        System.out.println("Hello Solana!");

        // TestVerifySignature.testVerifySignature();

        // TestGenerateKeypair.testGenerateKeypair();

        // ConnectionUtil.requestAirdrop(address, lamports);

        Connection connection = ConnectionUtil.getTestNetConnection();

        AccountInfo accountInfo = connection.getAccountInfo(KeypairUtil.getPublickey(privateKey_Test));
        System.out.println(accountInfo);

    }
}