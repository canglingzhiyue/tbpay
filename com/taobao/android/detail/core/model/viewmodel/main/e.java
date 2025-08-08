package com.taobao.android.detail.core.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.JhsNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.LadyGoNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.epw;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends com.taobao.android.detail.datasdk.model.viewmodel.main.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PriceNode.PriceData f9768a;
    public ArrayList<PriceNode.PriceData> b;
    public String c;
    public String d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public JhsNode.a i;
    public ArrayList<String> j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public String o;

    static {
        kge.a(1949218896);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.JhsPriceViewModel";
    }

    public e(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        boolean z = true;
        this.g = true;
        PriceNode m = eqb.m(bVar);
        VerticalNode g = eqb.g(bVar);
        this.f9768a = m.price;
        this.b = m.extraPrices;
        if (g.pintuanNode != null) {
            this.h = 6L;
            this.g = false;
            this.f9768a = m.price;
            this.e = System.currentTimeMillis() - 1000;
            this.f = g.pintuanNode.endTimeMillis;
            this.g = StringUtils.equals("GROUP_WAITING", g.pintuanNode.groupStatus);
            if (m.priceTags != null && !m.priceTags.isEmpty()) {
                try {
                    this.o = m.priceTags.get(0).f9987a;
                } catch (Exception unused) {
                }
            }
            JSONObject jSONObject = componentModel.mapping;
            if (jSONObject != null) {
                this.n = epw.a(jSONObject.getString("pintuanExtraPriceTitle"));
                this.m = epw.a(jSONObject.getString("pintuanTip"));
                return;
            }
            this.n = "单独购买";
            this.m = "拼团优惠价";
        } else if (g.jhsNode != null) {
            this.c = g.jhsNode.soldCount;
            this.d = g.jhsNode.remindCount;
            this.g = g.jhsNode.status == 0 ? false : z;
            this.e = g.jhsNode.startTime;
            this.f = g.jhsNode.endTime;
            this.h = g.jhsNode.verticalBiz;
            this.i = g.jhsNode.globalInfo;
            this.j = g.jhsNode.goodsWayDesc;
            this.k = g.jhsNode.hasIntervalPrice;
        } else if (g.ladyGoNode != null) {
            this.c = "";
            this.d = "";
            String str = g.ladyGoNode.mainPrice;
            String str2 = g.ladyGoNode.tagPrice;
            String str3 = g.ladyGoNode.tagPriceTitle;
            if (!StringUtils.isEmpty(str)) {
                this.f9768a = new PriceNode.PriceData();
                this.f9768a.priceText = str;
            }
            if (!StringUtils.isEmpty(str2)) {
                PriceNode.PriceData priceData = new PriceNode.PriceData();
                priceData.priceText = str2;
                priceData.priceTitle = str3;
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                this.b.clear();
                this.b.add(priceData);
            }
            this.h = 4L;
            this.g = g.ladyGoNode.status != LadyGoNode.AVAILABLE ? false : z;
            this.e = g.ladyGoNode.startTime.longValue();
            this.f = g.ladyGoNode.endTime.longValue();
            this.j = g.ladyGoNode.tags;
        } else if (g.meiLiHuiNode != null) {
            this.c = "";
            this.d = "";
            this.f9768a = m.price;
            this.b = m.extraPrices;
            this.l = true;
            this.g = g.meiLiHuiNode.status != 1 ? false : z;
            this.e = g.meiLiHuiNode.startTime;
            this.f = g.meiLiHuiNode.endTime;
            this.j = g.meiLiHuiNode.tags;
        } else {
            this.c = "";
            this.d = "";
            this.g = true;
            this.e = 0L;
            this.f = 0L;
        }
    }

    public e(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        boolean z = true;
        this.g = true;
        PriceNode m = eqb.m(bVar);
        VerticalNode g = eqb.g(bVar);
        this.f9768a = m.price;
        this.b = m.extraPrices;
        if (g.pintuanNode != null) {
            this.h = 6L;
            this.g = false;
            this.f9768a = m.price;
            this.e = System.currentTimeMillis() - 1000;
            this.f = g.pintuanNode.endTimeMillis;
            this.g = StringUtils.equals("GROUP_WAITING", g.pintuanNode.groupStatus);
            if (m.priceTags != null && !m.priceTags.isEmpty()) {
                try {
                    this.o = m.priceTags.get(0).f9987a;
                } catch (Exception unused) {
                }
            }
            JSONObject fields = iDMComponent.getFields();
            if (fields != null) {
                this.n = epw.a(fields.getString("pintuanExtraPriceTitle"));
                this.m = epw.a(fields.getString("pintuanTip"));
                return;
            }
            this.n = "单独购买";
            this.m = "拼团优惠价";
        } else if (g.jhsNode != null) {
            this.c = g.jhsNode.soldCount;
            this.d = g.jhsNode.remindCount;
            this.g = g.jhsNode.status == 0 ? false : z;
            this.e = g.jhsNode.startTime;
            this.f = g.jhsNode.endTime;
            this.h = g.jhsNode.verticalBiz;
            this.i = g.jhsNode.globalInfo;
            this.j = g.jhsNode.goodsWayDesc;
            this.k = g.jhsNode.hasIntervalPrice;
        } else if (g.ladyGoNode != null) {
            this.c = "";
            this.d = "";
            String str = g.ladyGoNode.mainPrice;
            String str2 = g.ladyGoNode.tagPrice;
            String str3 = g.ladyGoNode.tagPriceTitle;
            if (!StringUtils.isEmpty(str)) {
                this.f9768a = new PriceNode.PriceData();
                this.f9768a.priceText = str;
            }
            if (!StringUtils.isEmpty(str2)) {
                PriceNode.PriceData priceData = new PriceNode.PriceData();
                priceData.priceText = str2;
                priceData.priceTitle = str3;
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                this.b.clear();
                this.b.add(priceData);
            }
            this.h = 4L;
            this.g = g.ladyGoNode.status != LadyGoNode.AVAILABLE ? false : z;
            this.e = g.ladyGoNode.startTime.longValue();
            this.f = g.ladyGoNode.endTime.longValue();
            this.j = g.ladyGoNode.tags;
        } else if (g.meiLiHuiNode != null) {
            this.c = "";
            this.d = "";
            this.f9768a = m.price;
            this.b = m.extraPrices;
            this.l = true;
            this.g = g.meiLiHuiNode.status != 1 ? false : z;
            this.e = g.meiLiHuiNode.startTime;
            this.f = g.meiLiHuiNode.endTime;
            this.j = g.meiLiHuiNode.tags;
        } else {
            this.c = "";
            this.d = "";
            this.g = true;
            this.e = 0L;
            this.f = 0L;
        }
    }
}
