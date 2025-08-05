package com.taobao.android.detail.sdk.vmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.JhsNode;
import com.taobao.android.detail.sdk.model.node.LadyGoNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.PriceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class m extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PriceNode.PriceData f10433a;
    public ArrayList<PriceNode.PriceData> b;
    public String c;
    public String d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public JhsNode.GlobalInfo i;
    public ArrayList<String> j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public String o;

    static {
        kge.a(1158388534);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 40002;
    }

    public m(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        boolean z = true;
        this.g = true;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.JhsPriceViewModel");
        this.f10433a = nodeBundle.priceNode.price;
        this.b = nodeBundle.priceNode.extraPrices;
        if (nodeBundle.verticalNode.pintuanNode != null) {
            this.h = 6L;
            this.g = false;
            this.f10433a = nodeBundle.priceNode.price;
            this.e = System.currentTimeMillis() - 1000;
            this.f = nodeBundle.verticalNode.pintuanNode.endTimeMillis;
            this.g = TextUtils.equals("GROUP_WAITING", nodeBundle.verticalNode.pintuanNode.groupStatus);
            if (nodeBundle.priceNode.priceTags != null && !nodeBundle.priceNode.priceTags.isEmpty()) {
                try {
                    this.o = nodeBundle.priceNode.priceTags.get(0).text;
                } catch (Exception unused) {
                }
            }
            JSONObject jSONObject = componentModel.mapping;
            if (jSONObject != null) {
                this.n = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("pintuanExtraPriceTitle"));
                this.m = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("pintuanTip"));
                return;
            }
            this.n = "单独购买";
            this.m = "拼团优惠价";
        } else if (nodeBundle.verticalNode.jhsNode != null) {
            this.c = nodeBundle.verticalNode.jhsNode.soldCount;
            this.d = nodeBundle.verticalNode.jhsNode.remindCount;
            this.g = nodeBundle.verticalNode.jhsNode.status == 0 ? false : z;
            this.e = nodeBundle.verticalNode.jhsNode.startTime;
            this.f = nodeBundle.verticalNode.jhsNode.endTime;
            this.h = nodeBundle.verticalNode.jhsNode.verticalBiz;
            this.i = nodeBundle.verticalNode.jhsNode.globalInfo;
            this.j = nodeBundle.verticalNode.jhsNode.goodsWayDesc;
            this.k = nodeBundle.verticalNode.jhsNode.hasIntervalPrice;
        } else if (nodeBundle.verticalNode.ladyGoNode != null) {
            this.c = "";
            this.d = "";
            String str = nodeBundle.verticalNode.ladyGoNode.mainPrice;
            String str2 = nodeBundle.verticalNode.ladyGoNode.tagPrice;
            String str3 = nodeBundle.verticalNode.ladyGoNode.tagPriceTitle;
            if (!TextUtils.isEmpty(str)) {
                this.f10433a = new PriceNode.PriceData();
                this.f10433a.priceText = str;
            }
            if (!TextUtils.isEmpty(str2)) {
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
            this.g = nodeBundle.verticalNode.ladyGoNode.status != LadyGoNode.AVAILABLE ? false : z;
            this.e = nodeBundle.verticalNode.ladyGoNode.startTime.longValue();
            this.f = nodeBundle.verticalNode.ladyGoNode.endTime.longValue();
            this.j = nodeBundle.verticalNode.ladyGoNode.tags;
        } else if (nodeBundle.verticalNode.meiLiHuiNode != null) {
            this.c = "";
            this.d = "";
            this.f10433a = nodeBundle.priceNode.price;
            this.b = nodeBundle.priceNode.extraPrices;
            this.l = true;
            this.g = nodeBundle.verticalNode.meiLiHuiNode.status != 1 ? false : z;
            this.e = nodeBundle.verticalNode.meiLiHuiNode.startTime;
            this.f = nodeBundle.verticalNode.meiLiHuiNode.endTime;
            this.j = nodeBundle.verticalNode.meiLiHuiNode.tags;
        } else {
            this.c = "";
            this.d = "";
            this.g = true;
            this.e = 0L;
            this.f = 0L;
        }
    }
}
