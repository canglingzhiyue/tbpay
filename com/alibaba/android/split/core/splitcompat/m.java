package com.alibaba.android.split.core.splitcompat;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public final class m implements com.alibaba.android.split.o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f2457a;

    static {
        kge.a(-939513709);
        kge.a(638413706);
    }

    public m(j jVar) {
        this.f2457a = jVar;
    }

    @Override // com.alibaba.android.split.o
    public final Set<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : this.f2457a.f();
    }
}
