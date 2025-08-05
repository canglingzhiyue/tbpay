package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class DescMtopStaticRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> moduleDescParams;

    static {
        kge.a(-570358324);
        kge.a(395113271);
    }

    public DescMtopStaticRequestParams(Map<String, String> map) {
        this.moduleDescParams = map;
    }

    public DescMtopStaticRequestParams(e eVar) {
        this.moduleDescParams = new HashMap();
        if (!com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(eVar.d)) {
            this.moduleDescParams.putAll(eVar.d);
        }
        if (!com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(eVar.e)) {
            this.moduleDescParams.putAll(eVar.e);
        }
    }

    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("detail_v", "3.3.2");
        if (!com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(this.moduleDescParams)) {
            hashMap.putAll(this.moduleDescParams);
        }
        return hashMap;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("add28f54", new Object[]{this}) : JSON.toJSONString(toMap());
    }
}
