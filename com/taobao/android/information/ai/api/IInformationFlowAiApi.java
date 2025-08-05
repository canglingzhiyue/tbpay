package com.taobao.android.information.ai.api;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.Map;
import tb.ljs;

/* loaded from: classes5.dex */
public interface IInformationFlowAiApi {
    void a();

    void a(IContainerDataModel<?> iContainerDataModel);

    void a(Map<String, String> map);

    void b();

    void c();

    void create(ljs ljsVar);

    JSONObject createAiRefreshRequestParams(String str, String str2, Map<String, Object> map);
}
