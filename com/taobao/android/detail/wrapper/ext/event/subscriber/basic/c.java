package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import com.taobao.android.detail.datasdk.model.datamodel.node.CouponNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import tb.emu;
import tb.eoc;
import tb.eqb;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends eoc {

    /* renamed from: a  reason: collision with root package name */
    public String f11272a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(268223614);
    }

    public c(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.OpenCouponInfoEvent");
        if (bVar == null) {
            return;
        }
        ResourceNode l = eqb.l(bVar);
        ItemNode c = eqb.c(bVar);
        SellerNode d = eqb.d(bVar);
        if (l == null) {
            return;
        }
        CouponNode couponNode = l.couponNode;
        if (d != null) {
            this.c = d.userId;
        }
        if (c != null) {
            this.d = c.itemId;
        }
        this.f11272a = couponNode.mtopUrl;
        this.b = couponNode.linkUrl;
    }
}
