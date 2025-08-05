package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.gff;
import tb.ghc;
import tb.kge;

/* loaded from: classes.dex */
public class an extends DXRenderPipelineFlow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bc l = new bc();
    public x m = new x();
    public ar n = new ar();
    public gff o = new gff((ghc) null, this.l);

    static {
        kge.a(-1606981313);
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public DXWidgetNode j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("cf06f710", new Object[]{this});
        }
        if (this.g == null || this.i == null) {
            return this.g;
        }
        if (this.f11779a == 1) {
            this.l.a(this.g);
        } else {
            this.o.b(this.g, this.g.getDXRuntimeContext(), null);
        }
        return this.g;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public DXWidgetNode k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5c41a891", new Object[]{this});
        }
        if (this.g == null || this.i == null) {
            return this.g;
        }
        this.m.a(this.g, this.j, this.k, this.i);
        return this.g;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public DXWidgetNode l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("e97c5a12", new Object[]{this});
        }
        if (this.g == null || this.i == null) {
            return this.g;
        }
        this.m.a(this.g, this.i);
        return this.g;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public com.taobao.android.dinamicx.widget.bi f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("e2796a3f", new Object[]{this});
        }
        if (this.g == null || this.i == null) {
            return this.g;
        }
        if (this.i.C() != null && this.i.C().a() != null) {
            z = this.i.C().a().f();
        }
        return this.m.a(this.g, this.i, z);
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public com.taobao.android.dinamicx.widget.bi g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("c7bad900", new Object[]{this});
        }
        if (this.g != null && this.q != null && a() != null) {
            return this.q;
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public View a(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("735571ba", new Object[]{this, dXRenderOptions});
        }
        if (this.g != null && this.q != null && this.i != null) {
            return this.n.a(this.g, (DXWidgetNode) this.q, a(), this.i, 1, dXRenderOptions);
        }
        return null;
    }
}
