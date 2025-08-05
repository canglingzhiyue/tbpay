package com.mobile.auth.gatewayauth.utils;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class O0000Oo {
    private static Pattern O000000o = Pattern.compile("^[-\\+]?[\\d]*$");

    public static String O000000o(long j) {
        try {
            try {
                return new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss.SSS").format(new Date(j));
            } catch (Exception unused) {
                return String.valueOf(j);
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
}
