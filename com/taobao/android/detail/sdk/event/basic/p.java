package com.taobao.android.detail.sdk.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import tb.evl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class p extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private NodeBundle f10234a;

    static {
        kge.a(-309514498);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20031;
    }

    public p() {
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenTaxDescEvent");
    }

    public p(NodeBundle nodeBundle) {
        this.f10234a = nodeBundle;
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenTaxDescEvent");
    }
}
