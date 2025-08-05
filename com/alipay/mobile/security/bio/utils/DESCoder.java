package com.alipay.mobile.security.bio.utils;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class DESCoder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALGORITHM = "DESede";

    public static byte[] decryptMode(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4c4b3735", new Object[]{bArr, str});
        }
        return null;
    }

    public static byte[] encryptMode(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5e292d5d", new Object[]{bArr, str});
        }
        return null;
    }

    public static byte[] decryptBASE64(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("7408c7d0", new Object[]{str}) : Base64.decode(str, 0);
    }

    public static String encryptBASE64(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4fc7745e", new Object[]{bArr}) : Base64.encodeToString(bArr, 0);
    }
}
