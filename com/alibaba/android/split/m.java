package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<l> f2493a;

    static {
        kge.a(-1727178036);
        f2493a = new AtomicReference<>(null);
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("873eea83", new Object[0]) : f2493a.get();
    }

    public static void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533fed43", new Object[]{lVar});
        } else {
            f2493a.compareAndSet(null, lVar);
        }
    }
}
