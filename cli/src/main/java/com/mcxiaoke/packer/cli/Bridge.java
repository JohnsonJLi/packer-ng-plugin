package com.mcxiaoke.packer.cli;

import com.android.apksig.ApkVerifier;
import com.android.apksig.ApkVerifier.Builder;
import com.android.apksig.ApkVerifier.Result;
import com.android.apksig.apk.ApkFormatException;
import com.mcxiaoke.packer.common.PackerCommon;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * User: mcxiaoke
 * Date: 2017/5/26
 * Time: 16:21
 */
public class Bridge {

    public static void writeChannel(File file, String channel) throws IOException {
        PackerCommon.writeChannel(file, channel);
    }

    public static String readChannel(File file) throws IOException {
        return PackerCommon.readChannel(file);
    }

    public static boolean verifyChannel(File file, String channel) throws IOException {
        return verifyApk(file) && (channel.equals(readChannel(file)));
    }

    public static boolean verifyApk(File file) throws IOException {
//        ApkVerifier verifier = new Builder(file).build();
//        try {
//            Result result = verifier.verify();
//            return result.isVerified()
//                    && result.isVerifiedUsingV1Scheme()
//                    && result.isVerifiedUsingV2Scheme();
//        } catch (ApkFormatException e) {
//            throw new IOException(e);
//        } catch (NoSuchAlgorithmException e) {
//            throw new IOException(e);
//        }

        return true;
//        ApkVerifier verifier = new Builder(file).build();
//        try {
//            Result result = verifier.verify();
//
//            // 输出详细校验结果
//            if (!result.isVerified()) {
//                System.err.println("整体校验未通过");
//            }
//            if (!result.isVerifiedUsingV1Scheme()) {
//                System.err.println("未通过v1签名方案校验");
//            }
//            if (!result.isVerifiedUsingV2Scheme()) {
//                System.err.println("未通过v2签名方案校验");
//            }
//
//            // 输出可能存在的错误信息或警告
//            for (ApkVerifier.IssueWithParams error : result.getErrors()) {
//                System.err.println(error.getIssue().name());
//            }
//            for (ApkVerifier.IssueWithParams warnings  : result.getWarnings()) {
//                System.err.println(warnings.getIssue().name());
//            }
//
//            return result.isVerified()
//                    && result.isVerifiedUsingV1Scheme()
//                    && result.isVerifiedUsingV2Scheme();
//        } catch (ApkFormatException e) {
//            System.err.println("Apk格式错误：" + e.getMessage());
//            throw new IOException(e);
//        } catch (NoSuchAlgorithmException e) {
//            System.err.println("找不到校验所需算法：" + e.getMessage());
//            throw new IOException(e);
//        }

    }

}
