package com.taobao.android.home.component.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f12732a;

    static {
        kge.a(-1037464872);
        f12732a = new HashMap();
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (context == null) {
        } else {
            SharedPreferences.Editor edit = context.getSharedPreferences("home_dx_data", 0).edit();
            edit.putString(str, str2);
            edit.apply();
            f12732a.put(str, str2);
            e.e("DxDataStoreUtil", "saveData to sp: key = " + str + ", value = " + str2);
        }
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context != null) {
            return context.getSharedPreferences("home_dx_data", 0).getString(str, "");
        }
        return null;
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        if (f12732a.containsKey(str)) {
            return f12732a.get(str);
        }
        String a2 = a(context, str);
        f12732a.put(str, a2);
        return a2;
    }
}
