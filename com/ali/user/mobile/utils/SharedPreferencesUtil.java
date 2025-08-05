package com.ali.user.mobile.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import tb.kge;

/* loaded from: classes2.dex */
public class SharedPreferencesUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FILE_NAME = "userinfo";

    static {
        kge.a(153087695);
    }

    public static void saveData(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66618de0", new Object[]{context, str, obj});
        } else if (obj == null) {
        } else {
            String simpleName = obj.getClass().getSimpleName();
            SharedPreferences.Editor edit = context.getSharedPreferences("userinfo", 0).edit();
            if ("Integer".equals(simpleName)) {
                edit.putInt(str, ((Integer) obj).intValue());
            } else if (a.ATOM_Boolean.equals(simpleName)) {
                edit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (a.ATOM_String.equals(simpleName)) {
                edit.putString(str, (String) obj);
            } else if ("Float".equals(simpleName)) {
                edit.putFloat(str, ((Float) obj).floatValue());
            } else if ("Long".equals(simpleName)) {
                edit.putLong(str, ((Long) obj).longValue());
            }
            edit.apply();
        }
    }

    public static Object getData(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fe40b26b", new Object[]{context, str, obj});
        }
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences sharedPreferences = context.getSharedPreferences("userinfo", 0);
        if ("Integer".equals(simpleName)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (a.ATOM_Boolean.equals(simpleName)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (a.ATOM_String.equals(simpleName)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Float".equals(simpleName)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (!"Long".equals(simpleName)) {
            return null;
        }
        return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
    }
}
