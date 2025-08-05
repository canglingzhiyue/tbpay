package com.alibaba.ariver.integration.embedview;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* loaded from: classes2.dex */
public interface a {
    Page getOuterPage();

    Resource getResource(String str);

    String getViewId();

    void onCreate(Map<String, String> map);

    void onDestroy();

    void onParamChanged(String[] strArr, String[] strArr2);

    void sendEvent(String str, String str2, JSONObject jSONObject, IEmbedCallback iEmbedCallback);
}
