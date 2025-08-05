package com.taobao.monitor.procedure;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class r implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static r f18232a = new r();
    private h b;

    private r() {
    }

    public r a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("ffbe4c44", new Object[]{this, hVar});
        }
        this.b = hVar;
        return this;
    }

    @Override // com.taobao.monitor.procedure.h
    public g a(String str, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a01797ed", new Object[]{this, str, pVar});
        }
        h hVar = this.b;
        if (hVar == null) {
            return g.DEFAULT;
        }
        return hVar.a(str, pVar);
    }
}
