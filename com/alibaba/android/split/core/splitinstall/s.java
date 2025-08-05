package com.alibaba.android.split.core.splitinstall;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public final class s implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f2478a;
    private m b;
    private int c;
    private int d;
    private com.alibaba.android.split.core.listener.a e;

    static {
        kge.a(158335715);
        kge.a(-1390502639);
    }

    public s(com.alibaba.android.split.core.listener.a aVar, m mVar, int i, int i2, int i3) {
        this.e = aVar;
        this.b = mVar;
        this.c = i;
        this.f2478a = i2;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        n nVar = new n(this.b.a(), this.c, this.f2478a, this.d, this.b.e(), this.b.f(), this.b.g(), this.b.h(), this.b.i(), (ArrayList) this.b.j());
        Log.e("StateUpdateRunnable", "onStateUpdate: " + nVar.toString());
        this.e.a((com.alibaba.android.split.core.listener.a) nVar);
    }
}
