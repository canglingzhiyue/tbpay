package com.taobao.message.kit.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class UIHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Handler sUIHandler;

    static {
        kge.a(-1304574947);
        sUIHandler = new Handler(Looper.getMainLooper());
    }

    public static void postMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e0cfe", new Object[]{runnable});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            sUIHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void postFront(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfba33ee", new Object[]{runnable});
        } else {
            sUIHandler.postAtFrontOfQueue(runnable);
        }
    }

    public static void post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{runnable});
        } else {
            sUIHandler.post(runnable);
        }
    }

    public static void postDelayed(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{runnable, new Long(j)});
        } else {
            sUIHandler.postDelayed(runnable, j);
        }
    }

    public static void postDelayed(Runnable runnable, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f268ee1", new Object[]{runnable, obj, new Long(j)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            sUIHandler.postDelayed(runnable, obj, j);
        } else {
            sUIHandler.postDelayed(runnable, j);
        }
    }

    public static void removeCallbacks(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270f6c2f", new Object[]{runnable});
        } else {
            sUIHandler.removeCallbacks(runnable);
        }
    }

    public static void removeCallbacksAndMessages(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82cd0d1c", new Object[]{obj});
        } else {
            sUIHandler.removeCallbacksAndMessages(obj);
        }
    }
}
