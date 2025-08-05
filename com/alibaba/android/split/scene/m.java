package com.alibaba.android.split.scene;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes2.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference f2502a;

    static {
        kge.a(-86026863);
        f2502a = new AtomicReference(null);
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("f26f6f89", new Object[0]) : (i) f2502a.get();
    }

    public static void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4b9689", new Object[]{iVar});
        } else {
            f2502a.compareAndSet(null, iVar);
        }
    }
}
