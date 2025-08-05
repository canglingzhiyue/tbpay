package com.taobao.android.detail.core.request.cart;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.request.mtop.b;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f9820a;
    private String b;
    private String c;
    private String d;
    private String e;

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public /* synthetic */ Map toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : a();
    }

    static {
        kge.a(-540744052);
        kge.a(-1500195920);
        f9820a = "3625";
    }

    public a(String str, String str2, String str3, String str4) {
        this.c = str2;
        this.b = str;
        this.d = str3;
        this.e = str4;
        emu.a("com.taobao.android.detail.core.request.cart.RecommendBuyMoreRequestParams");
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("appId", f9820a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("user_id", this.b);
        hashMap2.put("item_id", this.d);
        hashMap2.put("seller_id", this.e);
        hashMap2.put("sku_id", this.c);
        hashMap.put("params", JSONObject.toJSONString(hashMap2));
        hashMap.put(com.taobao.android.detail.core.request.b.f9819a, com.taobao.android.detail.core.request.b.b);
        return hashMap;
    }
}
