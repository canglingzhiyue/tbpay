package com.taobao.android.detail.core.request.desc;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.eqg;
import tb.kge;

/* loaded from: classes4.dex */
public class DescMtopStaticRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> moduleDescParams;

    static {
        kge.a(-895862827);
        kge.a(-1214933880);
    }

    public DescMtopStaticRequestParams(Map<String, String> map) {
        this.moduleDescParams = map;
        emu.a("com.taobao.android.detail.core.request.desc.DescMtopStaticRequestParams");
    }

    public DescMtopStaticRequestParams(d dVar) {
        this.moduleDescParams = new HashMap();
        if (!eqg.a(dVar.d)) {
            this.moduleDescParams.putAll(dVar.d);
        }
        if (!eqg.a(dVar.e)) {
            this.moduleDescParams.putAll(dVar.e);
        }
        emu.a("com.taobao.android.detail.core.request.desc.DescMtopStaticRequestParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(com.taobao.android.detail.core.request.b.f9819a, com.taobao.android.detail.core.request.b.b);
        if (!eqg.a(this.moduleDescParams)) {
            hashMap.putAll(this.moduleDescParams);
        }
        return hashMap;
    }
}
