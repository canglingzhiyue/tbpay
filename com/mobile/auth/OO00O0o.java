package com.mobile.auth;

import android.util.Base64;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tb.riy;

/* loaded from: classes4.dex */
public class OO00O0o {
    public static String O000000o(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace(riy.PLUS, "%20").replace("*", "%2A").replace("%7E", Constants.WAVE_SEPARATOR);
        } catch (Exception unused) {
            return "";
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

    public static String O000000o(StringBuilder sb, String str) {
        try {
            try {
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(new SecretKeySpec(str.getBytes("utf-8"), "HmacSHA1"));
                return Base64.encodeToString(mac.doFinal(sb.toString().getBytes("utf-8")), 2);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            } catch (InvalidKeyException e2) {
                throw new IllegalArgumentException(e2.toString());
            } catch (NoSuchAlgorithmException e3) {
                throw new IllegalArgumentException(e3.toString());
            }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Field> O000000o(Class cls) {
        Class superclass;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            if (!cls.getName().equals(OO00O.class.getName()) && (superclass = cls.getSuperclass()) != null && !superclass.getName().equals(Object.class.getName())) {
                arrayList.addAll(O000000o(superclass));
            }
            return arrayList;
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
