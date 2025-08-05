package com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.utils.o;
import java.util.Arrays;
import java.util.List;
import tb.gkl;
import tb.kge;

/* loaded from: classes9.dex */
public class b extends AbsAppInfoRequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<String> g;
    public InstanceStartParams e;
    private final AbsAppInfoRequestConfig.BasicRequestParam f;

    static {
        kge.a(641193968);
        g = Arrays.asList("nbsn", "nbsource", "nbsv", "query");
    }

    public b(AbsAppInfoRequestConfig.BasicRequestParam basicRequestParam) {
        this.f = basicRequestParam;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f.appId;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f.version;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f.templateId;
    }

    @Override // com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig
    public JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", (Object) this.f.appId);
        if (!"*".equals(this.f.version)) {
            jSONObject.put("version", (Object) this.f.version);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("params", (Object) jSONObject2);
        jSONObject2.put("url", (Object) this.f.url);
        if (!TextUtils.isEmpty(this.f.url)) {
            Uri b = o.b(this.f.url);
            for (String str : g) {
                if (!TextUtils.isEmpty(b.getQueryParameter(str))) {
                    jSONObject2.put(str, (Object) b.getQueryParameter(str));
                }
            }
        }
        if (this.c != null) {
            jSONObject2.put("request_scene", (Object) this.c.getName());
        }
        InstanceStartParams instanceStartParams = this.e;
        if (instanceStartParams != null) {
            String string = instanceStartParams.getExtraData().getString("sellerId");
            String string2 = this.e.getExtraData().getString("sceneId");
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(string)) {
                jSONObject3.put("sellerId", (Object) string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject3.put("sceneId", (Object) string2);
            }
            jSONObject.put(gkl.DP_BIZ_CONTEXT, (Object) jSONObject3);
        }
        jSONArray.add(jSONObject);
        return jSONArray;
    }
}
