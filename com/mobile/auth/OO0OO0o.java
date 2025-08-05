package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.HashSet;
import tb.riy;

/* loaded from: classes4.dex */
public abstract class OO0OO0o {
    public static String O000000o() {
        try {
            try {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                if (hashSet.size() > 0) {
                    Object[] array = hashSet.toArray();
                    int min = Math.min(array.length, 5);
                    for (int i = 0; i < min; i++) {
                        sb.append((String) array[i]);
                        if (i < min - 1) {
                            sb.append("-");
                        }
                    }
                    sb3.append("&private_ip=" + sb.toString());
                }
                if (hashSet2.size() > 0) {
                    Object[] array2 = hashSet2.toArray();
                    int min2 = Math.min(array2.length, 5);
                    for (int i2 = 0; i2 < min2; i2++) {
                        String str = (String) array2[i2];
                        if (str.contains(riy.MOD)) {
                            str = str.substring(0, str.indexOf(riy.MOD));
                        }
                        sb2.append(str);
                        if (i2 < min2 - 1) {
                            sb2.append("-");
                        }
                    }
                    sb3.append("&private_ip_v6=" + sb2.toString());
                }
                return sb3.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
