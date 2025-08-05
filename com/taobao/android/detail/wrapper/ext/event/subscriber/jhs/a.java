package com.taobao.android.detail.wrapper.ext.event.subscriber.jhs;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.eqb;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11288a;

    static {
        kge.a(783532310);
    }

    public a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        if (bVar != null) {
            this.f11288a = eqb.c(bVar).itemId;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.JhsCouponEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f11288a;
    }
}
