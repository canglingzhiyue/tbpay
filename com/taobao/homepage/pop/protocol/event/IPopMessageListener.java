package com.taobao.homepage.pop.protocol.event;

import com.alibaba.fastjson.JSONObject;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface IPopMessageListener {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopMessageType {
    }

    void onMessage(String str, IPopData iPopData, JSONObject jSONObject);
}
