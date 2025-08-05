package com.taobao.android.detail.sdk.request.isv;

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
    private HashMap f10319a;

    static {
        kge.a(1515450317);
        kge.a(-1500195920);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public /* synthetic */ Map toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : a();
    }

    public a(Map map) {
        this.f10319a = (HashMap) map;
        tpc.a("com.taobao.android.detail.sdk.request.isv.QueryIsvUrlRequestParams");
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap hashMap = this.f10319a;
        if (hashMap != null) {
            hashMap.put("detail_v", "3.1.8");
        }
        return this.f10319a;
    }
}
