package com.huawei.hms.base.ui;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class LogUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f7367a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    private static String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (f7367a.matcher(String.valueOf(charAt)).matches()) {
                if (i % 2 == 0) {
                    charAt = '*';
                }
                i++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String a(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!StringUtils.isEmpty(str)) {
            if (z) {
                str = a(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void e(String str, String str2) {
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, false));
    }

    public static void e(String str, String str2, boolean z) {
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, z));
    }
}
