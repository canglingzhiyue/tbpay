package com.taobao.themis.kernel.plugininfo.request;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import com.taobao.themis.kernel.basic.a;
import com.taobao.themis.kernel.network.c;
import java.util.List;
import java.util.Map;

@DefaultAdapterImpl("com.taobao.themis.plugininfo.request.PluginDefaultSyncRequestClient")
/* loaded from: classes9.dex */
public interface IPluginInfoRequestClient extends a {
    c<List<PluginModel>, JSONObject> requestPluginInfo(String str, String str2, Map<String, String> map, JSONObject jSONObject);
}
