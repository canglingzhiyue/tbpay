package me.ele.bridge;

import android.app.Application;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes9.dex */
public interface PizzaApi {
    void sendPizza(Application application, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, JSONObject jSONObject4, JSONObject jSONObject5, String str4, BridgeCallback bridgeCallback);
}
