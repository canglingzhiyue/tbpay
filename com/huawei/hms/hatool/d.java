package com.huawei.hms.hatool;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public class d {
    public static long a(Context context, String str, String str2, long j) {
        if (context == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getLong(str2, j) : j;
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getString(str2, str3) : str3;
    }

    public static Map<String, ?> a(Context context, String str) {
        return b(context, str).getAll();
    }

    public static void a(Context context, String str, String... strArr) {
        if (context == null || StringUtils.isEmpty(str)) {
            v.f("hmsSdk", "clearData(): parameter error.context,spname");
        } else if (strArr == null) {
            v.f("hmsSdk", "clearData(): No data need to be deleted,keys is null");
        } else {
            SharedPreferences b = b(context, str);
            if (b == null) {
                return;
            }
            SharedPreferences.Editor edit = b.edit();
            if (strArr.length == 0) {
                edit.clear();
                edit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (b.contains(str2)) {
                    edit.remove(str2);
                    edit.commit();
                }
            }
        }
    }

    private static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(c(context, str), 0);
    }

    public static void b(Context context, String str, String str2, long j) {
        if (context == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b == null) {
            return;
        }
        SharedPreferences.Editor edit = b.edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            v.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b == null) {
            return;
        }
        SharedPreferences.Editor edit = b.edit();
        edit.putString(str2, str3);
        edit.commit();
    }

    public static String c(Context context, String str) {
        String packageName = context.getPackageName();
        String n = a1.n("_hms_config_tag", "oper");
        if (StringUtils.isEmpty(n)) {
            return "hms_" + str + "_" + packageName;
        }
        return "hms_" + str + "_" + packageName + "_" + n;
    }
}
