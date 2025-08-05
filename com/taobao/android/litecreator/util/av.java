package com.taobao.android.litecreator.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-712239893);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            a(runnable, null);
        }
    }

    public static void a(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f8e64", new Object[]{runnable, runnable2});
            return;
        }
        try {
            try {
                runnable.run();
            } catch (Throwable unused) {
                runnable2.run();
            }
        } catch (Throwable unused2) {
        }
    }
}
