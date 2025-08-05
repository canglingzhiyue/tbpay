package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fpz;
import tb.kge;
import tb.ldj;
import tb.ljd;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f17435a;
    private long b = -1;
    private final boolean c = ldj.a("orange_key_force_direct_run_cover_task", false);

    static {
        kge.a(-311578594);
    }

    public static /* synthetic */ long a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1648f097", new Object[]{jVar})).longValue() : jVar.f17435a;
    }

    public static /* synthetic */ Activity a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2f4ef248", new Object[]{context}) : b(context);
    }

    private long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        if (this.b < 0) {
            this.b = ldj.a("orange_key_cover_view_jump_delay_time", 260);
        }
        return this.b;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f17435a = SystemClock.uptimeMillis();
        }
    }

    private static Activity b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("72da1009", new Object[]{context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof fpz)) {
            return null;
        }
        Context a2 = ((fpz) context).a();
        if (!(a2 instanceof Activity)) {
            return null;
        }
        return (Activity) a2;
    }

    private Runnable a(final Runnable runnable, final Context context, final long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("3d02d2f2", new Object[]{this, runnable, context, new Long(j)}) : new Runnable() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                Activity a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (j < j.a(j.this) || (a2 = j.a(context)) == null) {
                } else {
                    if (Build.VERSION.SDK_INT >= 17 && (a2.isDestroyed() || a2.isFinishing())) {
                        return;
                    }
                    runnable.run();
                }
            }
        };
    }

    public void a(Runnable runnable, Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55667a2", new Object[]{this, runnable, context});
        } else if (this.c) {
            runnable.run();
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            Activity b = b(context);
            int i = -1;
            if (b != null && (intent = b.getIntent()) != null) {
                i = intent.getIntExtra("dispatch_invisible_event_type", -1);
            }
            if (i == 30010) {
                ljd.a().a(a(runnable, context, uptimeMillis), b());
            } else {
                runnable.run();
            }
            this.f17435a = uptimeMillis;
        }
    }
}
