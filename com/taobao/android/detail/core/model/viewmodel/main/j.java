package com.taobao.android.detail.core.model.viewmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class j extends com.taobao.android.detail.datasdk.model.viewmodel.main.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9773a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;

    static {
        kge.a(-1976777711);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.XSkuPickerViewModel";
    }

    public j(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        this.g = false;
        a(bVar);
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
            return;
        }
        FeatureNode f = eqb.f(bVar);
        ItemNode c = eqb.c(bVar);
        ShippingNode h = eqb.h(bVar);
        VerticalNode g = eqb.g(bVar);
        ResourceNode l = eqb.l(bVar);
        this.f = f.showSku;
        this.f9773a = c.skuText;
        this.b = "";
        this.c = h.to;
        if (g != null && g.superMarketNode != null && g.presaleNode == null) {
            z = true;
        }
        this.d = z;
        this.e = f.secKill;
        if (g != null && g.presaleNode != null && (2 == g.presaleNode.status || 3 == g.presaleNode.status)) {
            this.g = true;
        }
        if (l == null || l.sizeChart == null) {
            return;
        }
        this.h = l.sizeChart.f10017a;
    }

    public j(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.g = false;
        a(bVar);
    }
}
