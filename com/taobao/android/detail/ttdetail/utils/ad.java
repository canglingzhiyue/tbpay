package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class ad {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFERENCE_FILE_NAME = "TB_Detail";

    static {
        kge.a(1551070171);
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("TB_Detail", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue() : b(context, str, false);
    }

    public static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d49adbef", new Object[]{context, str, new Boolean(z)})).booleanValue() : context.getApplicationContext().getSharedPreferences("TB_Detail", 0).getBoolean(str, z);
    }
}
