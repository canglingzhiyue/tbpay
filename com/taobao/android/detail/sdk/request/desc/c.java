package com.taobao.android.detail.sdk.request.desc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.d;
import java.util.HashMap;
import java.util.Map;
import tb.ewu;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f10318a;

    static {
        kge.a(-808963376);
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
        if (!ewu.a(this.f10318a)) {
            hashMap.putAll(this.f10318a);
        }
        return hashMap;
    }
}
