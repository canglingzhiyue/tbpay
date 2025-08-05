package com.taobao.android.dinamicx.eventchain;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.monitor.i;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dkt;
import tb.dle;
import tb.fqi;
import tb.fuw;
import tb.gbh;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f11850a;
    private WeakReference<DXRuntimeContext> b;
    private WeakReference<dle> c;
    private WeakReference<i> d;
    private h e;
    private com.taobao.analysis.v3.g h;
    private com.taobao.analysis.v3.h i;
    private com.taobao.analysis.v3.p j;
    private i.c m;
    private i.a n;
    private k o;
    private boolean p;
    private boolean q;
    private boolean f = false;
    private int g = 0;
    private String k = "";
    private final AtomicInteger l = new AtomicInteger(0);

    static {
        kge.a(-94399457);
    }

    public DXRuntimeContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("61e8221f", new Object[]{this});
        }
        WeakReference<DXRuntimeContext> weakReference = this.b;
        DXRuntimeContext dXRuntimeContext = weakReference == null ? null : weakReference.get();
        if (dXRuntimeContext == null) {
            dXRuntimeContext = v();
        }
        if (dXRuntimeContext != null && dXRuntimeContext.E() == null) {
            dXRuntimeContext.a(this.e);
        }
        return dXRuntimeContext;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WeakReference<DXRuntimeContext> weakReference = this.b;
        DXRuntimeContext dXRuntimeContext = weakReference == null ? null : weakReference.get();
        if (dXRuntimeContext == null) {
            dXRuntimeContext = v();
        }
        if (dXRuntimeContext == null) {
            return;
        }
        dXRuntimeContext.a(this.e);
    }

    private DXRuntimeContext v() {
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("34d2c2aa", new Object[]{this});
        }
        WeakReference<View> weakReference = this.f11850a;
        if (weakReference != null && weakReference.get() != null && (b = gbh.b(this.f11850a.get())) != null && b.getReferenceNode() != null) {
            return b.getReferenceNode().getDXRuntimeContext();
        }
        return null;
    }

    public dle c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dle) ipChange.ipc$dispatch("1e67069f", new Object[]{this});
        }
        WeakReference<dle> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f = true;
        h hVar = this.e;
        if (hVar == null) {
            return;
        }
        hVar.a(true);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f11850a = new WeakReference<>(view);
        }
    }

    public void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else {
            this.b = new WeakReference<>(dXRuntimeContext);
        }
    }

    public void a(dle dleVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55a60db", new Object[]{this, dleVar});
        } else {
            this.c = new WeakReference<>(dleVar);
        }
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee03bbc3", new Object[]{this, iVar});
        } else {
            this.d = new WeakReference<>(iVar);
        }
    }

    public dkt f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkt) ipChange.ipc$dispatch("357bf4cc", new Object[]{this});
        }
        WeakReference<i> weakReference = this.d;
        if (weakReference == null || weakReference.get() == null) {
            fuw.d("DXEventChainContext", "getAbilityEngine : dxEventChainManager is null");
            return null;
        }
        return this.d.get().d();
    }

    public k g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("3a150e01", new Object[]{this});
        }
        if (this.o != null && fqi.u() && this.p) {
            return this.o;
        }
        DXRuntimeContext a2 = a();
        if (a2 != null && a2.d() != null && a2.d().queryRootWidgetNode() != null) {
            return a2.d().queryRootWidgetNode().getDxEventChains();
        }
        return null;
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8650a6a6", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            fuw.d("DXEventChainContext", "getEventChain : eventchain name is null");
            return null;
        }
        k g = g();
        if (g != null) {
            return g.a(str);
        }
        return null;
    }

    public a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2d9de07d", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            fuw.d("DXEventChainContext", "getAtomicNode : eventchain name  or atomic name is null");
        }
        b a2 = a(str);
        if (a2 != null) {
            return a2.a(str2);
        }
        return null;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee034764", new Object[]{this, hVar});
        } else {
            this.e = hVar;
        }
    }

    public h h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("f38c9b43", new Object[]{this}) : this.e;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.l.set(0);
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.l.getAndIncrement();
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.l.get();
    }

    public i.c l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i.c) ipChange.ipc$dispatch("2a979b24", new Object[]{this}) : this.m;
    }

    public void a(i.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233ea059", new Object[]{this, cVar});
        } else {
            this.m = cVar;
        }
    }

    public i.a m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i.a) ipChange.ipc$dispatch("c5385d67", new Object[]{this}) : this.n;
    }

    public void a(i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233db79b", new Object[]{this, aVar});
        } else {
            this.n = aVar;
        }
    }

    public com.taobao.analysis.v3.g n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.analysis.v3.g) ipChange.ipc$dispatch("1623f1fb", new Object[]{this}) : this.h;
    }

    public com.taobao.analysis.v3.h o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.analysis.v3.h) ipChange.ipc$dispatch("16d09db9", new Object[]{this}) : this.i;
    }

    public void a(com.taobao.analysis.v3.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4ff8e2", new Object[]{this, gVar});
        } else {
            this.h = gVar;
        }
    }

    public void a(com.taobao.analysis.v3.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d506d41", new Object[]{this, hVar});
        } else {
            this.i = hVar;
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        fuw.a("DXFullTrace", "getReferenceCount ", Integer.valueOf(this.g));
        return this.g;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.g++;
        fuw.a("DXFullTrace", "addReferenceCount ", Integer.valueOf(this.g));
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        int i = this.g;
        if (i > 0) {
            this.g = i - 1;
        }
        fuw.a("DXFullTrace", "subReferenceCount ", Integer.valueOf(this.g));
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.g = 0;
        fuw.a("DXFullTrace", "clearReferenceCount ", Integer.valueOf(this.g));
    }

    public String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : TextUtils.isEmpty(this.k) ? "" : this.k;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public com.taobao.analysis.v3.p u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.analysis.v3.p) ipChange.ipc$dispatch("1adca46b", new Object[]{this}) : this.j;
    }

    public void a(com.taobao.analysis.v3.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d541039", new Object[]{this, pVar});
        } else {
            this.j = pVar;
        }
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee04a481", new Object[]{this, kVar});
        } else {
            this.o = kVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.q;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }
}
