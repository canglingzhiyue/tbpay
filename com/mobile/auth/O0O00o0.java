package com.mobile.auth;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class O0O00o0 {
    public static String O000000o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return O000000o(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String O000000o(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return O0OO0Oo.O000000o(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }
}
