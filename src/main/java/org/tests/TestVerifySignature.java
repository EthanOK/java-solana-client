package org.tests;

import org.utils.SolanaSignature;

public class TestVerifySignature {
    public static void testVerifySignature() {
        // 示例消息、签名和公钥
        String message = "Welcome to ethan-yungou.vercel.app!";

        String signature = "ASkzqDLqe1AsxiWMELTb2b3DHdtXqpWzoBcxRq1Wkit4ZnjkwKJZPpeonag94CFjcF2oCHWXTZYwVTEbJQ1dChs";

        String walletAddress = "AQAMLqdN3LSvaHx5tCVeWZWDRTGqL7QuvNgojCb3pS6Z";

        // 执行数字签名验证
        boolean isValid = SolanaSignature.verifySolanaSignature(message, signature, walletAddress);

        System.out.println("签名验证结果：" + isValid);

        // 输出验证结果

        if (isValid) {
            System.out.println("Signature is valid.");
        } else {
            System.out.println("Signature is NOT valid.");
        }
    }

}
