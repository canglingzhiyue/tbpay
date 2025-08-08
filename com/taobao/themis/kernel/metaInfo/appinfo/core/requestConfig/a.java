package com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class a extends AbsAppInfoRequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<AbsAppInfoRequestConfig.BasicRequestParam> e;

    static {
        kge.a(7990297);
    }

    public a(List<AbsAppInfoRequestConfig.BasicRequestParam> list) {
        this.e = list;
        this.d = true;
    }

    @Override // com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig
    public JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
        }
        List<AbsAppInfoRequestConfig.BasicRequestParam> list = this.e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam : this.e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", (Object) basicRequestParam.appId);
            if (!"*".equals(basicRequestParam.version)) {
                jSONObject.put("version", (Object) basicRequestParam.version);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("params", (Object) jSONObject2);
            if (this.c != null) {
                jSONObject2.put("request_scene", (Object) this.c.getName());
            }
            if (!StringUtils.isEmpty(basicRequestParam.url)) {
                jSONObject2.put("url", (Object) basicRequestParam.url);
            }
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }
}
