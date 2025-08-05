package com.alibaba.ability.impl.file;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    static {
        kge.a(640296939);
        INSTANCE = new e();
    }

    private e() {
    }

    public final String a(String text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, text});
        }
        q.d(text, "text");
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (messageDigest == null) {
            return null;
        }
        char[] charArray = text.toCharArray();
        q.b(charArray, "(this as java.lang.String).toCharArray()");
        byte[] bArr = new byte[charArray.length];
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = messageDigest.digest(bArr);
        StringBuffer stringBuffer = new StringBuffer();
        q.b(md5Bytes, "md5Bytes");
        for (byte b : md5Bytes) {
            int i2 = b & 255;
            if (i2 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i2));
        }
        return stringBuffer.toString();
    }

    public final String a(byte[] bytes) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{this, bytes});
        }
        q.d(bytes, "bytes");
        String str = "";
        for (byte b : bytes) {
            String hexString = Integer.toHexString(b & 255);
            q.b(hexString, "Integer.toHexString(bytes[n].toInt() and 0XFF)");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString);
            str = sb.toString();
        }
        Locale locale = Locale.ENGLISH;
        q.b(locale, "Locale.ENGLISH");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        q.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
