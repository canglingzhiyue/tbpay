package com.taobao.android.detail.wrapper.ext.request.redpacket;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class OpenRedPacketParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject data;
    public String apiName = "mtop.taobao.pagani.api.freshman.hongbao.get";
    public String version = "1.0";

    static {
        kge.a(-1207977718);
        kge.a(-1214933880);
    }

    public OpenRedPacketParams(JSONObject jSONObject) {
        this.data = jSONObject;
        emu.a("com.taobao.android.detail.wrapper.ext.request.redpacket.OpenRedPacketParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>(16);
        JSONObject jSONObject = this.data;
        if (jSONObject != null) {
            hashMap.putAll((Map) JSONObject.toJavaObject(jSONObject, Map.class));
        }
        return hashMap;
    }
}
