package com.taobao.android.detail.sdk.request.main;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.d;
import java.util.HashMap;
import java.util.Map;
import tb.ewu;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f10322a;
    private String b;

    static {
        kge.a(1791250886);
        kge.a(-1535221011);
    }

    @Override // com.taobao.android.detail.sdk.request.d
    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("detail_v", "3.1.8");
        String str = this.b;
        if (str != null) {
            hashMap.put("itemNumId", str);
        }
        if (!ewu.a(this.f10322a)) {
            hashMap.put("exParams", JSONObject.toJSONString(this.f10322a));
        }
        return hashMap;
    }
}
