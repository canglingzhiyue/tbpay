package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* loaded from: classes4.dex */
public class O0000o00 {
    private static int[] O000000o = {3, 10, 13, 0, 14, 5, 1, 8, 9, 4, 6, 7, -1, 2, 11, 12};

    public static String O000000o(Context context, String str) {
        try {
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().getAssets().open(str), "ISO_8859_1");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        inputStreamReader.close();
                        bufferedReader.close();
                        return sb.toString();
                    }
                    sb.append(readLine);
                }
            } catch (Exception e) {
                O0000Oo0.O000000o(e);
                return null;
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
