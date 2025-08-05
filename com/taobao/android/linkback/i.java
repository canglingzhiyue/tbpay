package com.taobao.android.linkback;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static i b = new i();

    /* renamed from: a  reason: collision with root package name */
    public Handler f13304a;
    private HandlerThread c = new HandlerThread("LinkBackNonUIThread");

    private i() {
        this.c.start();
        this.f13304a = new Handler(this.c.getLooper());
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f13304a.post(runnable);
        }
    }
}
