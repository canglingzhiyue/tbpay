package com.taobao.android.dinamicx_v4.loader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;
import tb.fwr;
import tb.gfi;
import tb.gfj;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f12225a;
    private List<gfi> b = new ArrayList();

    static {
        kge.a(-1686213073);
        kge.a(-202982083);
    }

    public List<gfi> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public d(h hVar) {
        this.f12225a = hVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        fwrVar.c(this.f12225a.g());
        int f = fwrVar.f();
        if (f > 0) {
            for (int i = 0; i < f; i++) {
                gfj gfjVar = null;
                if (fwrVar.e() == 1) {
                    gfjVar = new gfj(fwrVar.f());
                }
                if (gfjVar != null) {
                    this.b.add(gfjVar);
                }
            }
        }
        return true;
    }
}
