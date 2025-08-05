package com.alipay.birdnest.tool;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface FBToolAppEnv {

    /* loaded from: classes3.dex */
    public interface FinishNotifier<T> {
        void onFail(Throwable th);

        void onFinish(T t);

        void onNotSupport();
    }

    boolean canHandle(Map<String, String> map, String str);

    void dropEnvironment(Map<String, String> map, FinishNotifier<Void> finishNotifier);

    void endApp(Map<String, String> map, FinishNotifier<Void> finishNotifier, Object obj, String str);

    void prepareEnvironment(Map<String, String> map, FinishNotifier<Void> finishNotifier);

    void startApp(Map<String, String> map, FinishNotifier<Object> finishNotifier, String str, JSONObject jSONObject);
}
