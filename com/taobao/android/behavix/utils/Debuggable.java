package com.taobao.android.behavix.utils;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class Debuggable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean DEBUG;

    static {
        kge.a(-1740895995);
        DEBUG = false;
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue() : DEBUG;
    }

    public static void init(Application application) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            DEBUG = z;
        } catch (Exception unused) {
        }
    }
}
