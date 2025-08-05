package com.taobao.android.tschedule;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f15664a;
    public Handler b;
    public Handler c;

    /* loaded from: classes6.dex */
    public static class a {
        public static final i instance;

        static {
            kge.a(-1192354270);
            instance = new i();
        }
    }

    static {
        kge.a(1009840975);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f15664a != null) {
        } else {
            try {
                this.f15664a = new HandlerThread("TScheduleThread");
                this.f15664a.start();
                this.b = new Handler(this.f15664a.getLooper());
                this.c = new Handler(Looper.getMainLooper());
            } catch (Throwable unused) {
                this.f15664a = null;
            }
        }
    }

    public Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : this.b;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == this.f15664a) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        }
    }

    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            this.b.postDelayed(runnable, j);
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.c.post(runnable);
            }
        }
    }

    public static i b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("8fd4210a", new Object[0]) : a.instance;
    }

    private i() {
        c();
    }
}
