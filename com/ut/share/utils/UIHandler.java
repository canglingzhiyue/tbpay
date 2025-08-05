package com.ut.share.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class UIHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Handler sUIHandler;

    static {
        kge.a(-1677191834);
        sUIHandler = new Handler(Looper.getMainLooper());
    }

    public static void runMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a67069", new Object[]{runnable});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            sUIHandler.post(runnable);
        } else {
            runnable.run();
        }
    }
}
