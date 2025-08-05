package com.alipay.birdnest.tool;

import com.alipay.android.app.template.FBContext;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface FBToolEnv {

    /* loaded from: classes3.dex */
    public interface FinishNotifier<T> {
        void onFail(Throwable th);

        void onFinish(T t);

        void onNotSupport();
    }

    boolean canHandle(Map<String, String> map, String str);

    void closeTemplate(Map<String, String> map, FinishNotifier<Void> finishNotifier, FBContext fBContext, String str);

    void dropEnvironment(Map<String, String> map, FinishNotifier<Void> finishNotifier);

    void prepareEnvironment(Map<String, String> map, FinishNotifier<Void> finishNotifier);

    void renderTemplate(Map<String, String> map, FinishNotifier<FBContext> finishNotifier, JSONObject jSONObject, String str, JSONObject jSONObject2);
}
