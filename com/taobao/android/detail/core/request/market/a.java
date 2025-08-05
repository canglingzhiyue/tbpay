package com.taobao.android.detail.core.request.market;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ultronengine.event.s;
import com.taobao.android.trade.boost.request.mtop.b;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f9834a;
    private String b;

    static {
        kge.a(-639910198);
        kge.a(-1500195920);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public /* synthetic */ Map toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : a();
    }

    public a(String str, String str2) {
        this.f9834a = str;
        this.b = str2;
        emu.a("com.taobao.android.detail.core.request.market.MarketBagPriceRequestParams");
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("cartFrom", "tsm_client_native");
        hashMap.put("sellerId", this.b);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(s.DIVISION_CODE, this.f9834a);
        hashMap.put("exParams", JSON.toJSONString(hashMap2));
        hashMap.put(com.taobao.android.detail.core.request.b.f9819a, com.taobao.android.detail.core.request.b.b);
        return hashMap;
    }
}
