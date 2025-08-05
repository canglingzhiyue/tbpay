package com.flybird.support.basics;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public final class AppContextHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static Context f7228a = null;
    public static boolean b = false;

    public static void _feedForTools(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3301c752", new Object[]{context});
        } else if (context == null) {
        } else {
            f7228a = context.getApplicationContext();
            b = true;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static void feedAppContext(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db68815", new Object[]{context});
        } else if (f7228a != null || context == null) {
        } else {
            Context applicationContext = context.getApplicationContext();
            f7228a = applicationContext;
            try {
                if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                b = z;
            } catch (Throwable unused) {
            }
        }
    }
}
