package com.taobao.metrickit;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class c implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final c f18069a = new c();
    private e b;

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9d93f56", new Object[0]) : f18069a;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9a49ce", new Object[]{this, eVar});
        } else {
            this.b = eVar;
        }
    }

    @Override // com.taobao.metrickit.e
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.a(str, obj);
    }
}
