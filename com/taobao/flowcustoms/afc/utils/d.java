package com.taobao.flowcustoms.afc.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static d b;

    /* renamed from: a  reason: collision with root package name */
    public Handler f17188a;
    private HandlerThread c = new HandlerThread("FlowCustomsNonUIThread");

    static {
        kge.a(-376397628);
        b = new d();
    }

    private d() {
        this.c.start();
        this.f17188a = new Handler(this.c.getLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f17188a.post(runnable);
        }
    }

    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else {
            this.f17188a.postDelayed(runnable, j);
        }
    }
}
