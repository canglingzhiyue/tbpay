package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ag extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ResourceNode.ShopPromotion> f10412a;
    public int b;
    public String c;

    static {
        kge.a(1044533669);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_SHOP_PROMOTION_2;
    }

    public ag(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.b = 0;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.ShopPromotion2ViewModel");
        if (nodeBundle.resourceNode.shopPromotions != null && !nodeBundle.resourceNode.shopPromotions.isEmpty()) {
            this.f10412a = nodeBundle.resourceNode.shopPromotions;
        } else {
            this.f10412a = nodeBundle.priceNode.shopPromotions;
        }
        this.b = nodeBundle.itemNode.showShopActivitySize;
        this.c = componentModel.mapping.getString("rightIcon");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        ArrayList<ResourceNode.ShopPromotion> arrayList = this.f10412a;
        return arrayList != null && arrayList.size() > 0 && this.b > 0;
    }
}
