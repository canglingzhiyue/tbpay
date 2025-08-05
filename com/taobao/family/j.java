package com.taobao.family;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Map;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]) : Globals.getApplication().getSharedPreferences("family", 0);
    }

    public static boolean a(String str, String str2) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (a2 = a()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putString(str, str2);
        return edit.commit();
    }

    public static boolean a(Map<String, String> map) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue();
        }
        if (map == null || map.isEmpty() || (a2 = a()) == null) {
            return false;
        }
        SharedPreferences.Editor edit = a2.edit();
        for (String str : map.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = map.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    edit.putString(str, str2);
                }
            }
        }
        return edit.commit();
    }

    public static String a(String str) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : (!TextUtils.isEmpty(str) && (a2 = a()) != null) ? a2.getString(str, "") : "";
    }
}
