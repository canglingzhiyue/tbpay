package com.mobile.auth;

import mtopsdk.common.util.StringUtils;
import com.cmic.sso.sdk.a;
import com.taobao.tao.image.d;
import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: classes4.dex */
public class O0OO0Oo {
    private static final char[] O000000o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F'};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String O000000o(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = O000000o;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static void O000000o(a aVar, String str) {
        if (StringUtils.isEmpty(aVar.b("interfaceType", ""))) {
            aVar.a("interfaceType", str);
            return;
        }
        aVar.a("interfaceType", aVar.b("interfaceType") + ";" + str);
    }

    public static boolean O000000o(O00O0Oo o00O0Oo) {
        return O0O0o00.O000000o("logCloseTime", 0L) + ((long) (((o00O0Oo.O0000Ooo() * 60) * 60) * 1000)) >= System.currentTimeMillis();
    }

    public static byte[] O000000o() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String O00000Oo() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void O00000Oo(a aVar, String str) {
        if (StringUtils.isEmpty(aVar.b("interfaceCode", ""))) {
            aVar.a("interfaceCode", str);
            return;
        }
        aVar.a("interfaceCode", aVar.b("interfaceCode") + ";" + str);
    }

    private static String O00000o() {
        return UUID.randomUUID().toString();
    }

    public static String O00000o0() {
        return O00000o().replace("-", "");
    }

    public static void O00000o0(a aVar, String str) {
        if (StringUtils.isEmpty(aVar.b("interfaceElasped", ""))) {
            aVar.a("interfaceElasped", str);
            return;
        }
        aVar.a("interfaceElasped", aVar.b("interfaceElasped") + ";" + str);
    }
}
