package com.taobao.themis.kernel.plugininfo.request;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.c;
import com.taobao.themis.kernel.network.d;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class PluginDefaultSyncRequestClient extends d<PluginRequestParam, List<PluginModel>, JSONObject> implements IPluginInfoRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class DataDO implements Serializable {
        public ResultDO data;

        static {
            kge.a(2127512662);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class ResultDO implements Serializable {
        public List<PluginModel> result;

        static {
            kge.a(-1989105719);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-903261885);
        kge.a(605025250);
    }

    @Override // com.taobao.themis.kernel.network.d
    public List<PluginModel> configSuccessResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98931077", new Object[]{this, bArr});
        }
        DataDO dataDO = (DataDO) JSONObject.parseObject(bArr, DataDO.class, new Feature[0]);
        if (dataDO != null && dataDO.data != null) {
            return dataDO.data.result;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.themis.kernel.network.d
    /* renamed from: configFailureResponse */
    public JSONObject mo1502configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f162f037", new Object[]{this, bArr});
        }
        JSONObject parseObject = JSONObject.parseObject(new String(bArr));
        if (parseObject == null) {
            return null;
        }
        return parseObject.getJSONObject("data");
    }

    @Override // com.taobao.themis.kernel.plugininfo.request.IPluginInfoRequestClient
    public c<List<PluginModel>, JSONObject> requestPluginInfo(String str, String str2, Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("39a8c669", new Object[]{this, str, str2, map, jSONObject}) : execute(new PluginRequestParam(str, str2, map, jSONObject));
    }

    /* loaded from: classes9.dex */
    public static class PluginRequestParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String loadType;
        private String params;
        private String scene;
        private Map<String, String> templateParam;

        static {
            kge.a(913353522);
        }

        public PluginRequestParam(String str, String str2, Map<String, String> map, JSONObject jSONObject) {
            super(str);
            this.params = null;
            String str3 = "default";
            this.scene = str3;
            this.loadType = str3;
            this.params = str2;
            this.api = "mtop.taobao.miniapp.dynamic.plugin.get";
            this.needLogin = false;
            this.version = "1.0";
            this.templateParam = map;
            this.scene = jSONObject != null ? jSONObject.getString("scene") : str3;
            this.loadType = jSONObject != null ? jSONObject.getString(b.KEY_LOAD_TYPE) : str3;
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("params", this.params);
            hashMap.putAll(this.templateParam);
            hashMap.put("scene", this.scene);
            hashMap.put(b.KEY_LOAD_TYPE, this.loadType);
            return hashMap;
        }
    }
}
