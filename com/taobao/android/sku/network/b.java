package com.taobao.android.sku.network;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15183a = "mtop.trade.addBag";
    private String b = "3.1";
    private String c = "UNIT_TRADE";
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    static {
        kge.a(976456976);
        kge.a(-1697337541);
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.d = str5;
    }

    @Override // com.taobao.android.sku.network.a
    public MtopRequest getMtopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(c());
        mtopRequest.setApiName(a());
        mtopRequest.setVersion(b());
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        return mtopRequest;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f15183a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cartFrom", this.d);
        hashMap.put("itemId", this.e);
        hashMap.put("skuId", this.f);
        hashMap.put("quantity", this.g);
        hashMap.put("exParams", this.h);
        return JSONObject.toJSONString(hashMap);
    }

    @Override // com.taobao.android.sku.network.a
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : this.c;
    }
}
