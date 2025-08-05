package com.alibaba.triver.cannal_engine.widgetInfo;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@DefaultImpl("com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetterImpl")
/* loaded from: classes3.dex */
public interface TRWidgetInfoGetter extends Proxiable {

    /* loaded from: classes3.dex */
    public interface a {
        void a(JSONArray jSONArray);

        void a(String str, String str2, String str3);
    }

    void request(JSONObject jSONObject, a aVar);

    void request(JSONObject jSONObject, Boolean bool, a aVar);
}
