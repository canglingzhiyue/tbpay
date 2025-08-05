package com.taobao.android.dinamicx_v4.loader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;
import tb.fwr;
import tb.gfh;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f12221a;
    private List<gfh> b;

    static {
        kge.a(-254147050);
        kge.a(-202982083);
    }

    public a(e eVar) {
        this.f12221a = eVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        this.b = new ArrayList();
        short e = fwrVar.e();
        for (int i = 0; i < e; i++) {
            this.b.add(new gfh(fwrVar.d(), this.f12221a.a(fwrVar.f()), fwrVar.f(), fwrVar.f(), fwrVar.f()));
        }
        return true;
    }

    public List<gfh> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }
}
