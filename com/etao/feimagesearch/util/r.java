package com.etao.feimagesearch.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tb.kge;

/* loaded from: classes4.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f7033a;

    static {
        kge.a(-1265309502);
        f7033a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(f7033a[(bArr[i] & 240) >>> 4]);
            sb.append(f7033a[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        byte[] c = c(bArr);
        return c != null ? a(c) : EncryptUtils.IV_PARAMETER_SPEC;
    }

    public static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f6d5d94c", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return b(str.getBytes("utf-8"));
        } catch (Exception unused) {
            Log.e("MD5Util", "md5 error");
            return "";
        }
    }
}
