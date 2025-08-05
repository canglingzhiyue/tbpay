package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.PriceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class f extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f10425a;
    public long b;
    public int c;
    public int d;
    public String e;
    public PriceNode.PriceData f;
    public ArrayList<PriceNode.PriceData> g;

    static {
        kge.a(-1032610588);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 80001;
    }

    public f(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.f = nodeBundle.priceNode.price;
        this.g = nodeBundle.priceNode.extraPrices;
        this.f10425a = nodeBundle.verticalNode.packTradeNode.endTime;
        this.b = nodeBundle.verticalNode.packTradeNode.startTime;
        this.c = nodeBundle.verticalNode.packTradeNode.currentAmount;
        this.d = nodeBundle.verticalNode.packTradeNode.targetAmount;
        this.e = nodeBundle.verticalNode.packTradeNode.amountText;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.CtPackTradeViewModel");
    }
}
