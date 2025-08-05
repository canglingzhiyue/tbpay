package com.alipay.android.msp.plugin.engine;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface IDataCollectorEngine {

    /* loaded from: classes3.dex */
    public interface IJSApi {
        JSONObject execute(JSONObject jSONObject);
    }

    void addErrorNode(String str, String str2, String str3, String str4, String str5);

    void addErrorNode(String str, String str2, String str3, String str4, String str5, String str6);

    boolean addFlowNode(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr);

    boolean addFlowNode(String str, String str2, String str3, String str4, String str5, String[] strArr);

    Object getAvailableWorker();

    String newInstance(String str);

    String newInstance(String str, String str2);

    void registerJSApi(String str, IJSApi iJSApi);

    void sessionEnd(String str, String str2);

    boolean setSectionNode(String str, String str2, String str3, Map<String, String> map);
}
