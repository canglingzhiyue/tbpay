package com.alibaba.android.split.scene;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes2.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f2501a;

    static {
        kge.a(822653855);
        f2501a = new AtomicReference(null);
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("f26f6f2c", new Object[0]) : (f) f2501a.get();
    }

    public static void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4a396c", new Object[]{fVar});
        } else {
            f2501a.compareAndSet(null, fVar);
        }
    }
}
