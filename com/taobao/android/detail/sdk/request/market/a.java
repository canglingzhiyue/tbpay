package com.taobao.android.detail.sdk.request.market;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.request.mtop.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mrm;
import tb.tpc;

/* loaded from: classes4.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f10323a;
    private String b;
    private String c;
    private String d;

    static {
        kge.a(-263297784);
        kge.a(-1500195920);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public /* synthetic */ Map toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : a();
    }

    public a(String str, String str2, String str3, String str4) {
        this.f10323a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        tpc.a("com.taobao.android.detail.sdk.request.market.MarketRecommendRequestParams");
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String str = this.f10323a;
        if (str != null) {
            hashMap.put("itemId", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            hashMap.put("sellerId", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            hashMap.put("logica", str3);
        }
        if (!StringUtils.isEmpty(this.d)) {
            hashMap.put(mrm.KEY_AREA_ID, this.d);
        }
        hashMap.put("appId", "2015052019,2015052020");
        hashMap.put("resultSize", "8");
        hashMap.put("detail_v", "3.1.8");
        return hashMap;
    }
}
