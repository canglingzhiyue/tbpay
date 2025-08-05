package com.taobao.accs.utl;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import tb.kge;

/* loaded from: classes.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2077730051);
    }

    public static String a(Context context, String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71a8a593", new Object[]{context, str, new Integer(i), str2, str3});
        }
        if (context == null) {
            ALog.e("AccsSpUtil-", "getString context null", new Object[0]);
            return str3;
        }
        try {
            return APreferencesManager.getSharedPreferences(context, str, i).getString(str2, str3);
        } catch (Throwable th) {
            ALog.e("AccsSpUtil-", "getString err:", th, new Object[0]);
            return str3;
        }
    }
}
