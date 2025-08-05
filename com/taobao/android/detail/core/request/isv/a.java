package com.taobao.android.detail.core.request.isv;

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
    private HashMap f9833a;

    static {
        kge.a(-334282926);
        kge.a(-1500195920);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public /* synthetic */ Map toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this}) : a();
    }

    public a(Map map) {
        this.f9833a = (HashMap) map;
        emu.a("com.taobao.android.detail.core.request.isv.QueryIsvUrlRequestParams");
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap hashMap = this.f9833a;
        if (hashMap != null) {
            hashMap.put(com.taobao.android.detail.core.request.b.f9819a, com.taobao.android.detail.core.request.b.b);
        }
        return this.f9833a;
    }
}
