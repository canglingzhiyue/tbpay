package com.taobao.mrt.thread;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a b;

    /* renamed from: a  reason: collision with root package name */
    private Handler f18260a;

    static {
        kge.a(467942069);
        b = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("76f5f28a", new Object[0]) : b;
    }

    public void a(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91bcdd", new Object[]{this, runnable, new Integer(i)});
            return;
        }
        if (this.f18260a == null) {
            synchronized (a.class) {
                if (this.f18260a == null) {
                    HandlerThread handlerThread = new HandlerThread("mrt");
                    handlerThread.start();
                    this.f18260a = new Handler(handlerThread.getLooper());
                }
            }
        }
        this.f18260a.postDelayed(runnable, i);
    }
}
