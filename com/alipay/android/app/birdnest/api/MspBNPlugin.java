package com.alipay.android.app.birdnest.api;

import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes3.dex */
public interface MspBNPlugin {
    void destroy();

    int getBizId();

    View getView();

    void sendMessage(String str, JSONObject jSONObject, MessageListener messageListener);
}
