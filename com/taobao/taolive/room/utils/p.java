package com.taobao.taolive.room.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tb.kge;

/* loaded from: classes8.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(879069939);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("DailyFirstTimePrefs", 0);
        String string = sharedPreferences.getString("lastOpenDate", "");
        String a2 = a();
        if (a2.equals(string)) {
            return false;
        }
        sharedPreferences.edit().putString("lastOpenDate", a2).apply();
        return true;
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }
}
