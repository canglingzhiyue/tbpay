package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.i;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
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
        kge.a(-2126482830);
        kge.a(395113271);
    }

    public DescDynamicParams(JSONObject jSONObject) {
        this.mApiUnit = jSONObject;
        JSONObject parseObject = JSON.parseObject(this.mApiUnit.getString("value"));
        if (parseObject == null) {
            return;
        }
        this.apiName = parseObject.getString(com.taobao.android.detail.sdk.vmodel.main.c.K_API_NAME);
        this.version = parseObject.getString(com.taobao.android.detail.sdk.vmodel.main.c.K_API_VERSION);
        this.needSession = "true".equals(parseObject.getString("needLogin"));
        this.needEcode = "true".equals(a.a(parseObject.get(ICallService.KEY_NEED_ECODE)));
        this.wua = "true".equals(parseObject.getString("wua"));
        this.data = new HashMap<>();
        JSONObject jSONObject2 = parseObject.getJSONObject("params");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            this.data.putAll(i.a(jSONObject2, new k<String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescDynamicParams.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
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
        this.data.putAll(i.a(jSONObject3, new k<String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.DescDynamicParams.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
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

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("add28f54", new Object[]{this}) : JSON.toJSONString(this.data);
    }
}
