package com.taobao.tao.tbmainfragment;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBMainLog;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f21130a;
    private static SharedPreferences b;

    static {
        kge.a(-328108330);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        b = c(context).getSharedPreferences("homepage_fragment_sp", 0);
        return true;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        Boolean bool = f21130a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (b == null && !a(context)) {
            return false;
        }
        f21130a = Boolean.valueOf(b.getBoolean("isFragmentOpenByHomePage", false));
        TBMainLog.tlog("FragmentSPStorage", "is Fragment open by home page : " + f21130a);
        return f21130a.booleanValue();
    }

    public static Context c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("db91a096", new Object[]{context}) : context instanceof Activity ? context.getApplicationContext() : context;
    }
}
