package com.taobao.android.detail.sdk.request.size;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.request.mtop.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10325a;
    public String b;
    public String c;
    public HashMap<String, String> d;

    static {
        kge.a(1064907757);
        kge.a(-1500195920);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public /* synthetic */ Map toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : a();
    }

    public a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        this.f10325a = str;
        this.b = str2;
        this.c = str3;
        this.d = hashMap;
        tpc.a("com.taobao.android.detail.sdk.request.size.TBEditSizeParams");
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!StringUtils.isEmpty(this.f10325a)) {
            hashMap.put("userId", this.f10325a);
        }
        if (!StringUtils.isEmpty(this.b)) {
            hashMap.put("roleId", this.b);
        }
        if (!StringUtils.isEmpty(this.c)) {
            hashMap.put("sizeType", this.c);
        }
        HashMap<String, String> hashMap2 = this.d;
        if (hashMap2 != null) {
            hashMap.put("data", JSONObject.toJSONString(hashMap2));
        }
        hashMap.put("detail_v", "3.1.8");
        return hashMap;
    }
}
