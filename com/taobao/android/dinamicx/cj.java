package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ery;
import tb.erz;
import tb.esa;
import tb.kge;

/* loaded from: classes5.dex */
public class cj extends an {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ery h = new ery();
    public erz p = new erz(new esa());

    static {
        kge.a(-682048476);
    }

    @Override // com.taobao.android.dinamicx.an, com.taobao.android.dinamicx.DXRenderPipelineFlow
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
        return this.h.a(this.g, this.i, z);
    }

    @Override // com.taobao.android.dinamicx.an, com.taobao.android.dinamicx.DXRenderPipelineFlow
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

    @Override // com.taobao.android.dinamicx.an, com.taobao.android.dinamicx.DXRenderPipelineFlow
    public View a(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("735571ba", new Object[]{this, dXRenderOptions});
        }
        if (this.g != null && this.q != null && this.i != null) {
            return this.p.a(this.g, this.q, a(), this.i, 1, dXRenderOptions);
        }
        return null;
    }
}
