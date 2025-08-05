package com.taobao.android.change.app.icon.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f9325a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ScheduledThreadPoolExecutor c = (ScheduledThreadPoolExecutor) VExecutors.newSingleThreadScheduledExecutor($$Lambda$f$OB7ZLWzgrdy1eADeE3O35Cs2TO4.INSTANCE);

    static {
        kge.a(-1673594190);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : igc.TAG;
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("3adbbe31", new Object[0]);
        }
        if (f9325a == null) {
            synchronized (f.class) {
                if (f9325a == null) {
                    f9325a = new f();
                }
            }
        }
        return f9325a;
    }

    private f() {
        this.c.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.c.allowCoreThreadTimeOut(true);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.c.execute(runnable);
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else {
            this.b.post(runnable);
        }
    }
}
