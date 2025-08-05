package com.alibaba.security.realidentity;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.f;

/* loaded from: classes3.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{context, strArr})).booleanValue();
        }
        for (String str : strArr) {
            if (!a(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static void a(Activity activity, String[] strArr, int i, String str, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519cdec4", new Object[]{activity, strArr, new Integer(i), str, runnable, runnable2});
        } else if (!a()) {
            ActivityCompat.requestPermissions(activity, strArr, i);
        } else {
            a(activity, strArr, str, runnable, runnable2);
        }
    }

    public static void a(Activity activity, String[] strArr, String str, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff1daab", new Object[]{activity, strArr, str, runnable, runnable2});
            return;
        }
        f.a a2 = com.taobao.runtimepermission.f.a(activity, strArr);
        a2.a(str);
        a2.a(true);
        a2.b(f2.f3401a);
        a2.b(runnable2);
        a2.a(runnable);
        a2.a();
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue() : ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            Class.forName("com.taobao.runtimepermission.f");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
