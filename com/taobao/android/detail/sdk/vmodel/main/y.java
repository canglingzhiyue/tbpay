package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.PriceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class y extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PriceNode.PriceData f10450a;
    public PriceNode.PriceData b;
    public ArrayList<PriceNode.PriceData> c;
    public ArrayList<PriceNode.PriceTag> d;
    public ArrayList<PriceNode.PriceDescData> e;

    static {
        kge.a(1148562773);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30003;
    }

    public y(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.f10450a = nodeBundle.priceNode.price;
        this.b = nodeBundle.priceNode.subPrice;
        this.c = nodeBundle.priceNode.extraPrices;
        this.d = nodeBundle.priceNode.priceTags;
        this.e = nodeBundle.priceNode.wholePriceDescs;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.PriceViewModel");
    }
}
