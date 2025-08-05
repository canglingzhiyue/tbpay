package com.taobao.android.detail.wrapper.ext.preload;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailPreloadRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_COMMON_PARAMS = "commonParams";
    private static final String K_ITEM_PARAMS = "itemParams";
    private Map<String, String> commonParams;
    private Map<String, String> itemParams;

    static {
        kge.a(-1098128520);
        kge.a(-1214933880);
    }

    public DetailPreloadRequestParams(Map<String, String> map, Map<String, String> map2) {
        this.itemParams = map;
        this.commonParams = map2;
        emu.a("com.taobao.android.detail.wrapper.ext.preload.DetailPreloadRequestParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(com.taobao.android.detail.core.request.b.f9819a, com.taobao.android.detail.core.request.b.b);
        Map<String, String> map = this.itemParams;
        if (map != null) {
            hashMap.put(K_ITEM_PARAMS, JSONObject.toJSONString(map));
        }
        Map<String, String> map2 = this.commonParams;
        if (map2 != null) {
            hashMap.put(K_COMMON_PARAMS, JSONObject.toJSONString(map2));
        }
        return hashMap;
    }
}
