package com.taobao.android.detail.datasdk.model.viewmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.Props2Node;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.epb;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class TitleViewModel extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f10064a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public ShareType l;
    public String m;
    public ArrayList<Props2Node.a> n;

    /* loaded from: classes4.dex */
    public enum ShareType {
        SHARE_TYPE_DEFAULT(1),
        SHARE_TYPE_PRESENT(2),
        SHARE_TYPE_GIFT(3),
        SHARE_TYPE_AWARD(4);
        
        private int value;

        ShareType(int i) {
            this.value = i;
        }

        public static ShareType getEnum(int i) {
            return values()[i - 1];
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        kge.a(355896583);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel";
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "title_share";
    }

    public TitleViewModel(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        this.l = ShareType.SHARE_TYPE_DEFAULT;
        a(bVar);
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
            return;
        }
        FeatureNode f = eqb.f(bVar);
        ItemNode c = eqb.c(bVar);
        PriceNode m = eqb.m(bVar);
        ResourceNode l = eqb.l(bVar);
        Props2Node n = eqb.n(bVar);
        this.b = c.title;
        this.c = c.subtitle;
        this.d = f.showSubTitle;
        this.e = c.titleIcon;
        this.g = c.itemId;
        this.k = c.shareIcon;
        this.h = m.price.priceText;
        this.m = c.shortTitle;
        this.n = n.importantProps;
        if (!c.images.isEmpty()) {
            this.f = c.images.get(0);
        }
        if (!m.extraPrices.isEmpty()) {
            this.i = m.extraPrices.get(0).priceText;
        }
        if (l.share == null) {
            return;
        }
        this.j = l.share.f10012a;
        this.l = ShareType.getEnum(l.share.b);
    }

    public TitleViewModel(ComponentModel componentModel, epb epbVar) {
        super(componentModel);
        this.l = ShareType.SHARE_TYPE_DEFAULT;
        this.b = epbVar.b;
        this.e = "";
        this.g = "";
        f10064a = epbVar.d;
    }

    public TitleViewModel(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.l = ShareType.SHARE_TYPE_DEFAULT;
        a(bVar);
    }
}
