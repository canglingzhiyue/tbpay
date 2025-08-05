package com.alipay.mobile.common.transportext.amnet;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AmnetUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CTX_MTLS = 1;
    public static final int CTX_STD = 0;

    public static byte[] convert(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("df1a4159", new Object[]{str});
        }
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String convert(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8faf7bf", new Object[]{bArr});
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }
}
