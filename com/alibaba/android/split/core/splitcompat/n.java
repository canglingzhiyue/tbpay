package com.alibaba.android.split.core.splitcompat;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class n implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2458a;

    static {
        kge.a(-1922794164);
        kge.a(-1390502639);
    }

    public n(Context context) {
        this.f2458a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            com.alibaba.android.split.core.splitinstall.f.a(this.f2458a).a(true);
        }
    }
}
