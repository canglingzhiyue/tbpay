package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes.dex */
public final class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f2507a;

    static {
        kge.a(753765935);
        f2507a = new AtomicReference(null);
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("873eea07", new Object[0]) : (h) f2507a.get();
    }

    public static void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533e1bc7", new Object[]{hVar});
        } else {
            f2507a.compareAndSet(null, hVar);
        }
    }
}
