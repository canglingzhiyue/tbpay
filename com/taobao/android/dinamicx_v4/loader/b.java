package com.taobao.android.dinamicx_v4.loader;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.m;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fwr;
import tb.gez;
import tb.ggy;
import tb.kge;

/* loaded from: classes.dex */
public class b implements ggy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f12222a;
    public gez b;
    public h c;
    public f d;
    public i e;
    public e f;
    public j g;
    public d h;
    public c i;
    public DXExtensionSectionLoader j;
    public a k;
    public fwr l;

    static {
        kge.a(182018804);
        kge.a(-1466334825);
    }

    @Override // tb.ghd
    public /* synthetic */ Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f12222a = new g();
        this.b = new gez(this.f12222a);
        this.c = new h();
        this.f = new e(this.c);
        this.d = new f(this.c);
        this.g = new j(this.c, this.f);
        this.h = new d(this.c);
        this.i = new c(this.c, this.f);
        this.k = new a(this.f);
        this.j = new DXExtensionSectionLoader(this.f12222a, this.c, this.f, this.k, this.b);
        this.e = new i(this.c, this.f, this.d, this.g, this.h, this.j, this.k, this.b);
        this.l = new fwr();
    }

    @Override // tb.ggy
    public DXWidgetNode a(byte[] bArr, DXRuntimeContext dXRuntimeContext, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("9c4ba98b", new Object[]{this, bArr, dXRuntimeContext, context, new Boolean(z)});
        }
        boolean a2 = a(bArr, dXRuntimeContext);
        this.i.a(dXRuntimeContext, context);
        if (!a2) {
            return null;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        DXWidgetNode a3 = this.e.a(this.l, dXRuntimeContext, true, atomicBoolean);
        if (atomicBoolean.get()) {
            a(a3);
        }
        if (a3 == null) {
            fux.b("loadFromBufferV4 null1 ");
        }
        fux.b("loadFromBufferV4 null2 ");
        return a3;
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else {
            a(dXWidgetNode, dXWidgetNode);
        }
    }

    public void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddbf248", new Object[]{this, dXWidgetNode, dXWidgetNode2});
        } else if (dXWidgetNode2 != null) {
            if (dXWidgetNode2 instanceof ac) {
                ac acVar = (ac) dXWidgetNode2;
                if (acVar.e() == 2) {
                    String str = acVar.f() + ":" + acVar.h();
                    if (this.i.f12223a == null || this.i.f12223a.size() <= 0) {
                        if (DinamicXEngine.j()) {
                            throw new RuntimeException("取不到childTemplate " + str);
                        }
                        fux.b("取不到childTemplate " + str);
                        return;
                    }
                    DXWidgetNode dXWidgetNode3 = this.i.f12223a.get(str);
                    if (dXWidgetNode3 != null) {
                        if (DinamicXEngine.j()) {
                            fuw.a("取到childTemplate:" + str);
                        }
                        if (fqi.aT()) {
                            if (bx.o()) {
                                acVar.addChild(dXWidgetNode3.deepCloneForEmbed(dXWidgetNode3.getDXRuntimeContext()), false);
                            } else {
                                acVar.addChild(dXWidgetNode3.deepClone(dXWidgetNode3.getDXRuntimeContext()), false);
                            }
                        } else {
                            acVar.addChild(dXWidgetNode3, false);
                        }
                    }
                    dXWidgetNode = dXWidgetNode3;
                } else if (acVar.e() == 1) {
                    if (acVar.getChildrenCount() != 1) {
                        fux.b("内联的子模版有问题，其getChildrenCount() != 1");
                    } else {
                        DXWidgetNode childAt = acVar.getChildAt(0);
                        childAt.setDxEventChains(dXWidgetNode.getDxEventChains());
                        childAt.setAnimation(dXWidgetNode.getAnimation());
                        childAt.setDxExprBytes(dXWidgetNode.getDxExprBytes());
                        if (childAt.isV4Node() && dXWidgetNode.isV4Node()) {
                            childAt.getDxv4Properties().b(dXWidgetNode.getDxv4Properties().h());
                            childAt.getDxv4Properties().a(dXWidgetNode.getDxv4Properties().b());
                            childAt.getDxv4Properties().a(dXWidgetNode.getDxv4Properties().j());
                        }
                        dXWidgetNode = childAt;
                    }
                } else {
                    acVar.j();
                }
            }
            if (!(dXWidgetNode2 instanceof m) && dXWidgetNode2.getChildrenCount() <= 0) {
                return;
            }
            for (int i = 0; i < dXWidgetNode2.getChildrenCount(); i++) {
                a(dXWidgetNode, dXWidgetNode2.getChildAt(i));
            }
        }
    }

    private boolean a(byte[] bArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d780c64", new Object[]{this, bArr, dXRuntimeContext})).booleanValue();
        }
        c();
        this.l.a(bArr);
        this.f12222a.a(0);
        boolean a2 = this.f12222a.a(this.l, dXRuntimeContext) & true & this.b.a(this.l, dXRuntimeContext);
        this.f12222a.b(this.l.b());
        this.c.a(this.l.b());
        boolean a3 = a2 & this.c.a(this.l, dXRuntimeContext);
        this.c.b(this.l.b());
        return a3 & this.e.a(this.l, dXRuntimeContext) & this.d.a(this.l, dXRuntimeContext) & this.f.a(this.l, dXRuntimeContext) & this.g.a(this.l, dXRuntimeContext) & this.h.a(this.l, dXRuntimeContext) & this.j.a(this.l, dXRuntimeContext) & this.i.a(this.l, dXRuntimeContext);
    }

    public ggy<b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ggy) ipChange.ipc$dispatch("f0508a5", new Object[]{this}) : new b();
    }
}
