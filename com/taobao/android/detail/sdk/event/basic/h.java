package com.taobao.android.detail.sdk.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.CouponNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import tb.evl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class h extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10224a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(1783101734);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20030;
    }

    public h(NodeBundle nodeBundle) {
        if (nodeBundle != null && nodeBundle.resourceNode != null) {
            CouponNode couponNode = nodeBundle.resourceNode.couponNode;
            if (nodeBundle.sellerNode != null) {
                this.c = nodeBundle.sellerNode.userId;
            }
            if (nodeBundle.itemNode != null) {
                this.d = nodeBundle.itemNode.itemId;
            }
            this.f10224a = couponNode.mtopUrl;
            this.b = couponNode.linkUrl;
        }
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenCouponInfoEvent");
    }
}
