package com.ali.user.mobile.app.init;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class Debuggable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean DEBUG;

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue() : DEBUG;
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            DEBUG = z;
        } catch (Exception unused) {
        }
    }

    static {
        kge.a(1778406455);
        DEBUG = false;
    }
}
