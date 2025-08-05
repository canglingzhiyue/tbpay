package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ai extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10414a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;

    static {
        kge.a(-1804397613);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30012;
    }

    public ai(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        boolean z = false;
        this.g = false;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.SkuPickerViewModel");
        this.f = nodeBundle.featureNode.showSku;
        this.f10414a = nodeBundle.itemNode.skuText;
        this.b = "";
        this.c = nodeBundle.shippingNode.to;
        if (nodeBundle.verticalNode != null && nodeBundle.verticalNode.superMarketNode != null && nodeBundle.verticalNode.presaleNode == null) {
            z = true;
        }
        this.d = z;
        this.e = nodeBundle.featureNode.secKill;
        if (nodeBundle.verticalNode != null && nodeBundle.verticalNode.presaleNode != null && (2 == nodeBundle.verticalNode.presaleNode.status || 3 == nodeBundle.verticalNode.presaleNode.status)) {
            this.g = true;
        }
        if (nodeBundle.resourceNode == null || nodeBundle.resourceNode.sizeChart == null) {
            return;
        }
        this.h = nodeBundle.resourceNode.sizeChart.recommendTip;
    }
}
