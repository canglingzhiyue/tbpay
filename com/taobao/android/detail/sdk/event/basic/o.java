package com.taobao.android.detail.sdk.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import java.util.List;
import tb.evl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class o extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<ResourceNode.ShopPromotion> f10232a;

    static {
        kge.a(2058957869);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20022;
    }

    @Override // tb.evl, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public o(JSONObject jSONObject) {
        this.f10232a = null;
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenShopPromotionEvent");
        if (jSONObject == null || !jSONObject.containsKey("open_sale_promotion")) {
            return;
        }
        this.f10232a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getJSONArray("open_sale_promotion"), new com.taobao.android.detail.sdk.utils.g<ResourceNode.ShopPromotion>() { // from class: com.taobao.android.detail.sdk.event.basic.o.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.ResourceNode$ShopPromotion, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ ResourceNode.ShopPromotion b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public ResourceNode.ShopPromotion a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ResourceNode.ShopPromotion) ipChange.ipc$dispatch("c51cf1d5", new Object[]{this, obj}) : new ResourceNode.ShopPromotion((JSONObject) obj);
            }
        });
    }

    public o(NodeBundle nodeBundle) {
        this.f10232a = null;
        if (nodeBundle.resourceNode.shopPromotions != null && !nodeBundle.resourceNode.shopPromotions.isEmpty()) {
            this.f10232a = nodeBundle.resourceNode.shopPromotions;
        } else {
            this.f10232a = nodeBundle.priceNode.shopPromotions;
        }
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenShopPromotionEvent");
    }
}
