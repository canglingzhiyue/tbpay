package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes.dex */
public final class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f2495a;

    static {
        kge.a(-396831274);
        f2495a = new AtomicReference(null);
    }

    public static o a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("873eeae0", new Object[0]) : (o) f2495a.get();
    }

    public static void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53414a60", new Object[]{oVar});
        } else {
            f2495a.compareAndSet(null, oVar);
        }
    }
}
