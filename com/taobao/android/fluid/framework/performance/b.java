package com.taobao.android.fluid.framework.performance;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.son;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f12613a;
    private static Handler b;

    static {
        kge.a(1030467085);
        f12613a = new Handler(Looper.getMainLooper());
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (!son.l()) {
            runnable.run();
        } else {
            if (b == null) {
                HandlerThread handlerThread = new HandlerThread("TBVideoExcutor-single", 5);
                handlerThread.start();
                b = new Handler(handlerThread.getLooper());
            }
            b.post(runnable);
        }
    }
}
