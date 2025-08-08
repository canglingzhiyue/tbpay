package com.taobao.android.detail.datasdk.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.epb;
import tb.epw;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PriceNode.PriceData f10066a;
    public PriceNode.PriceData b;
    public ArrayList<PriceNode.PriceData> c;
    public ArrayList<PriceNode.b> d;
    public ArrayList<PriceNode.a> e;

    static {
        kge.a(1605254454);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.datasdk.model.viewmodel.main.PriceViewModel";
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "price";
    }

    public c(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        PriceNode m = eqb.m(bVar);
        this.f10066a = m.price;
        this.b = m.subPrice;
        this.c = m.extraPrices;
        this.d = m.priceTags;
        this.e = m.wholePriceDescs;
    }

    public c(ComponentModel componentModel, epb epbVar) {
        super(componentModel);
        String str;
        String str2;
        String str3;
        String trim = epw.a(epbVar.c).trim();
        if (StringUtils.isEmpty(trim)) {
            str = "";
            str3 = str;
            str2 = str3;
        } else {
            char charAt = trim.charAt(0);
            if (Character.isDigit(charAt)) {
                str = trim;
                str3 = "元";
                str2 = "¥";
            } else {
                String valueOf = String.valueOf(charAt);
                String substring = trim.substring(1);
                if ("¥".equals(valueOf)) {
                    str = substring;
                    str2 = valueOf;
                    str3 = "元";
                } else {
                    str = substring;
                    str2 = valueOf;
                    str3 = "";
                }
            }
        }
        this.f10066a = new PriceNode.PriceData(str, "", "", "", str3, str2, 0L, 0, false, "");
    }

    public c(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        PriceNode m = eqb.m(bVar);
        this.f10066a = m.price;
        this.b = m.subPrice;
        this.c = m.extraPrices;
        this.d = m.priceTags;
        this.e = m.wholePriceDescs;
    }
}
