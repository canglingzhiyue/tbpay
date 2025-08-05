package com.mobile.auth.gatewayauth.utils;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O000000o {
    public static boolean O000000o = true;

    public static String O000000o() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
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

    public static String O000000o(int i) {
        try {
            if (i == 0) {
                return O000000o();
            }
            return O000000o() + "-" + i + "-" + (Calendar.getInstance().get(11) / i);
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

    public static String O000000o(String str, String str2) {
        try {
            HashMap hashMap = new HashMap(2);
            hashMap.put("code", str);
            hashMap.put("msg", str2);
            return new JSONObject(hashMap).toString();
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

    public static boolean O000000o(String str) {
        try {
            return O000000o().equals(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
