package com.taobao.themis.ability_taobao.share;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class GetShareInfoParam extends RequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-694768528);
    }

    public GetShareInfoParam(String str) {
        super(str);
        this.api = "mtop.taobao.miniapp.shareinfo.get";
        this.version = "1.0";
    }

    @Override // com.taobao.themis.kernel.network.RequestParams
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", getAppId());
        return hashMap;
    }
}
