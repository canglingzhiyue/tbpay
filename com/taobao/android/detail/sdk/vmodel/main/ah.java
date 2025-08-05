package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ah extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10413a;
    public ArrayList<ResourceNode.ShopPromotion> b;
    public String c;
    public String d;

    static {
        kge.a(-634006831);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30011;
    }

    public ah(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.ShopPromotionViewModel");
        if (nodeBundle.resourceNode.shopPromotions != null && !nodeBundle.resourceNode.shopPromotions.isEmpty()) {
            this.b = nodeBundle.resourceNode.shopPromotions;
        } else {
            this.b = nodeBundle.priceNode.shopPromotions;
        }
        this.f10413a = a();
        this.c = "" + nodeBundle.itemNode.itemPoint;
        this.d = nodeBundle.itemNode.pointTimes;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : (this.b.isEmpty() || this.b.get(0).content.isEmpty()) ? "" : this.b.get(0).content.get(0);
    }
}
