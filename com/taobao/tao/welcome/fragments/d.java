package com.taobao.tao.welcome.fragments;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1239884757);
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d51141ee", new Object[]{context, str, new Boolean(z)})).booleanValue() : context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).getBoolean(str, z);
    }
}
