package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class z implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.jsi.standard.d f3145a;
    private final w b;

    static {
        kge.a(-1507387188);
        kge.a(1203844208);
    }

    public z(com.alibaba.jsi.standard.d dVar, w wVar, boolean z) {
        this.f3145a = dVar;
        this.b = wVar;
        if (z) {
            com.alibaba.jsi.standard.f.a(dVar, this);
        }
    }

    public w a(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("9a011fd3", new Object[]{this, dVar});
        }
        w wVar = this.b;
        if (wVar == null) {
            return null;
        }
        return wVar.j(dVar);
    }

    @Override // com.alibaba.jsi.standard.js.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.jsi.standard.f.b(this.f3145a, this);
        w wVar = this.b;
        if (wVar == null) {
            return;
        }
        wVar.a();
    }
}
