package com.alipay.mobile.common.ipc.api.util;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HexUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String bytesToHexString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33bf8aac", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
