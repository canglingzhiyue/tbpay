package com.taobao.android.detail.sdk.request.o2o;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.request.mtop.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_ITEM_ID = "itemNumId";
    public static final String K_LATITUDE = "latitude";
    public static final String K_LONGITUDE = "longitude";
    public static final String K_STOREID = "storeId";

    /* renamed from: a  reason: collision with root package name */
    private String f10324a;
    private String b;
    private String c;
    private String d;

    static {
        kge.a(-700770706);
        kge.a(-1500195920);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public /* synthetic */ Map toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : a();
    }

    public a(String str, String str2, String str3, String str4) {
        this.f10324a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        tpc.a("com.taobao.android.detail.sdk.request.o2o.QueryO2ORequestParams");
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String str = this.f10324a;
        if (str != null) {
            hashMap.put("itemNumId", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            hashMap.put("longitude", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            hashMap.put("latitude", str3);
        }
        hashMap.put("detail_v", "3.1.8");
        return hashMap;
    }
}
