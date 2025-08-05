package com.mobile.auth;

import android.support.v4.view.InputDeviceCompat;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.taobao.tao.image.d;

/* loaded from: classes4.dex */
public class O0000Oo {
    private static final String O000000o = "O0000Oo";
    private static final char[] O00000Oo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F'};

    public static String O000000o(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length == 0) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < bArr.length; i++) {
                    sb.append(O00000Oo[(bArr[i] >> 4) & 15]);
                    sb.append(O00000Oo[bArr[i] & 15]);
                }
                return sb.toString();
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }
        return "";
    }

    public static byte[] O000000o(String str) {
        if (str == null) {
            return null;
        }
        try {
            char[] charArray = str.toCharArray();
            int length = charArray.length / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
                if (digit > 127) {
                    digit += InputDeviceCompat.SOURCE_ANY;
                }
                bArr[i] = (byte) digit;
            }
            return bArr;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static byte[] O00000Oo(String str) {
        try {
            byte[] bArr = new byte[0];
            return str.getBytes("UTF-8");
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
