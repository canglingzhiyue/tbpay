package com.taobao.android.remoteso.component;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f14797a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Thread.currentThread() != f14797a.getLooper().getThread()) {
            f14797a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void a(Runnable runnable, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7882c9c2", new Object[]{runnable, obj, new Long(j)});
        } else {
            f14797a.postAtTime(runnable, obj, SystemClock.uptimeMillis() + j);
        }
    }

    public static void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
        } else {
            f14797a.removeCallbacksAndMessages(obj);
        }
    }
}
