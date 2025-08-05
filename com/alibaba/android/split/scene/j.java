package com.alibaba.android.split.scene;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f2500a;

    static {
        kge.a(1683485070);
        f2500a = new AtomicReference(null);
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("f26f6f4b", new Object[0]) : (g) f2500a.get();
    }

    public static void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4aadcb", new Object[]{gVar});
        } else {
            f2500a.compareAndSet(null, gVar);
        }
    }
}
