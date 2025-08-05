package com.taobao.android.detail.core.request.desc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;
import tb.rjr;

/* loaded from: classes4.dex */
public class DescDynamicParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apiName;
    private HashMap<String, String> data;
    private JSONObject mApiUnit;
    public boolean needEcode;
    public boolean needSession;
    public String version;
    public boolean wua;

    static {
        kge.a(1248193467);
        kge.a(-1214933880);
    }

    public DescDynamicParams(JSONObject jSONObject) {
        emu.a("com.taobao.android.detail.core.request.desc.DescDynamicParams");
        this.mApiUnit = jSONObject;
        JSONObject parseObject = JSON.parseObject(this.mApiUnit.getString("value"));
        if (parseObject == null) {
            return;
        }
        this.apiName = parseObject.getString(com.taobao.android.detail.sdk.vmodel.main.c.K_API_NAME);
        this.version = parseObject.getString(com.taobao.android.detail.sdk.vmodel.main.c.K_API_VERSION);
        this.needSession = "true".equals(parseObject.getString("needLogin"));
        this.needEcode = "true".equals(rjr.a(parseObject.get(ICallService.KEY_NEED_ECODE)));
        this.wua = "true".equals(parseObject.getString("wua"));
        this.data = new HashMap<>();
        JSONObject jSONObject2 = parseObject.getJSONObject("params");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            this.data.putAll(epw.a(jSONObject2, new epy<String>() { // from class: com.taobao.android.detail.core.request.desc.DescDynamicParams.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // tb.epy
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                }
            }));
        }
        JSONObject jSONObject3 = parseObject.getJSONObject("exParams");
        if (jSONObject3 == null || jSONObject3.isEmpty()) {
            return;
        }
        this.data.putAll(epw.a(jSONObject3, new epy<String>() { // from class: com.taobao.android.detail.core.request.desc.DescDynamicParams.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        }));
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this}) : this.data;
    }
}
