package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.erx;
import tb.ery;
import tb.erz;
import tb.kge;

/* loaded from: classes5.dex */
public class at extends am {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public erx o;
    public ery p;
    public erz q;
    private aw r;

    static {
        kge.a(2000248580);
    }

    public at(r rVar, aw awVar) {
        super(rVar, awVar);
        this.r = null;
        this.o = new erx();
        this.p = new ery();
        this.q = new erz(new erx());
    }

    @Override // com.taobao.android.dinamicx.am
    public com.taobao.android.dinamicx.widget.bi a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.bi) ipChange.ipc$dispatch("4e239fee", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)}) : this.p.a(dXWidgetNode, dXRuntimeContext, z);
    }

    @Override // com.taobao.android.dinamicx.am
    public View a(DXWidgetNode dXWidgetNode, com.taobao.android.dinamicx.widget.bi biVar, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7bb68a67", new Object[]{this, dXWidgetNode, biVar, view, dXRuntimeContext, new Integer(i), dXRenderOptions}) : this.q.a(dXWidgetNode, biVar, view, dXRuntimeContext, i, dXRenderOptions);
    }
}
