package com.taobao.android.dinamicx.template.download;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class e implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f11933a;
    public long b;
    private final Runnable c;

    static {
        kge.a(-2120064838);
        kge.a(-1390502639);
    }

    public e(int i, Runnable runnable) {
        this.f11933a = i;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.c.run();
        }
    }
}
