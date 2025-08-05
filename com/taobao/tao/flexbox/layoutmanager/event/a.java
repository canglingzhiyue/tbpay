package com.taobao.tao.flexbox.layoutmanager.event;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f20389a;
    private Runnable b = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.event.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ogg.a("[EventExecuteMonitor] time out " + a.this);
            a.this.a();
        }
    };
    private boolean c = false;

    @Override // com.taobao.tao.flexbox.layoutmanager.event.b
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        }
    }

    public abstract void b();

    static {
        kge.a(-1787892447);
        kge.a(1238869043);
        f20389a = new Handler(Looper.getMainLooper());
    }

    public a() {
        f20389a.postDelayed(this.b, 5000L);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ogg.a("[EventExecuteMonitor] execute: " + this.c + "  " + this);
        if (this.c) {
            return;
        }
        this.c = true;
        f20389a.removeCallbacks(this.b);
        b();
    }
}
