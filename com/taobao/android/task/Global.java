package com.taobao.android.task;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class Global {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Context sContext;

    static {
        kge.a(-1798745382);
    }

    private Global() {
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : sContext;
    }

    public static void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (context == null || sContext != null) {
        } else {
            sContext = context;
        }
    }
}
