package com.alibaba.android.split.core.splitcompat;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes2.dex */
public final class d implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f2449a;

    static {
        kge.a(1757206772);
        kge.a(-458118459);
    }

    public d(e eVar) {
        this.f2449a = eVar;
    }

    @Override // com.alibaba.android.split.core.splitcompat.i
    public void a(f fVar, File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f968bdf", new Object[]{this, fVar, file, new Boolean(z)});
            return;
        }
        this.f2449a.b.add(file);
        if (z) {
            return;
        }
        this.f2449a.c.set(false);
    }
}
