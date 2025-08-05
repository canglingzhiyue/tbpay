package com.alipay.android.app.birdnest.api;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes3.dex */
public interface MspViewMessageListener {
    void onReceiveMessage(String str, JSONObject jSONObject, MessageListener messageListener);
}
