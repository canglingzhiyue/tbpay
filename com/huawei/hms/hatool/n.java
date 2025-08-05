package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;
import tb.cyc;
import tb.cyi;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7476a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str) {
        if (str == null || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, 32);
        return new Pair<>(cyi.a(substring), str.substring(32));
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> a2 = a(str);
        return new String(cyc.b(cyi.a((String) a2.second), cyi.a(str2), (byte[]) a2.first), f7476a);
    }

    public static String a(byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length == 0 || str == null) {
            str2 = "cbc encrypt(byte) param is not right";
        } else {
            byte[] a2 = cyi.a(str);
            if (a2.length >= 16) {
                return cyi.a(cyc.a(bArr, a2));
            }
            str2 = "key length is not right";
        }
        v.b("AesCipher", str2);
        return "";
    }

    public static String b(String str, String str2) {
        return cyi.a(cyc.a(str.getBytes(f7476a), cyi.a(str2)));
    }
}
