package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import tb.kge;

/* loaded from: classes4.dex */
public final class e {
    private static char[] ak;
    private static byte[] al;

    static {
        kge.a(-1099068);
        ak = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
        al = new byte[256];
        for (int i = 0; i < 256; i++) {
            al[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            al[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            al[i3] = (byte) ((i3 + 26) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            al[i4] = (byte) ((i4 + 52) - 48);
        }
        byte[] bArr = al;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public static int a(int i, Context context) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String b(Context context, String str) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return d.a(signatureArr[0].toByteArray());
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        boolean z;
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) << 2];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = (bArr[i] & 255) << 8;
            int i4 = i + 1;
            boolean z2 = true;
            if (i4 < bArr.length) {
                i3 |= bArr[i4] & 255;
                z = true;
            } else {
                z = false;
            }
            int i5 = i3 << 8;
            int i6 = i + 2;
            if (i6 < bArr.length) {
                i5 |= bArr[i6] & 255;
            } else {
                z2 = false;
            }
            int i7 = 64;
            bArr2[i2 + 3] = (byte) ak[z2 ? i5 & 63 : 64];
            int i8 = i5 >> 6;
            int i9 = i2 + 2;
            char[] cArr = ak;
            if (z) {
                i7 = i8 & 63;
            }
            bArr2[i9] = (byte) cArr[i7];
            int i10 = i8 >> 6;
            char[] cArr2 = ak;
            bArr2[i2 + 1] = (byte) cArr2[i10 & 63];
            bArr2[i2] = (byte) cArr2[(i10 >> 6) & 63];
            i += 3;
            i2 += 4;
        }
        return bArr2;
    }

    public static Bundle g(String str) {
        try {
            return i(new URL(str).getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bundle h(String str) {
        try {
            return i(new URI(str).getQuery());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Bundle i(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                    } else if (split.length == 1) {
                        bundle.putString(URLDecoder.decode(split[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return bundle;
    }

    public static String o() {
        return Build.MANUFACTURER + "-" + Build.MODEL + "_" + Build.VERSION.RELEASE + "_weibosdk_0041005000_android";
    }
}
