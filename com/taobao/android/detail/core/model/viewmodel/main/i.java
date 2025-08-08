package com.taobao.android.detail.core.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class i extends com.taobao.android.detail.datasdk.model.viewmodel.main.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PriceNode.PriceData f9772a;
    public PriceNode.PriceData b;
    public ArrayList<PriceNode.PriceData> c;
    public ArrayList<PriceNode.b> d;
    public PriceNode.PriceData e;
    public PriceNode.PriceData f;
    public ResourceNode.a g;

    static {
        kge.a(1994120399);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.UniformPriceViewModel";
    }

    public i(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        a(bVar);
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
            return;
        }
        PriceNode m = eqb.m(bVar);
        this.f9772a = m.price;
        this.b = m.subPrice;
        this.c = m.newExtraPrices;
        if ((m.newExtraPrices == null || m.newExtraPrices.isEmpty()) && StringUtils.isEmpty(m.sugPromPrice.priceText)) {
            this.c = m.extraPrices;
        }
        this.d = m.priceTags;
        this.e = m.sugPromPrice;
        this.f = m.depositPrice;
        this.g = eqb.l(bVar).newBigPromotion;
    }

    public i(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        a(bVar);
    }
}
