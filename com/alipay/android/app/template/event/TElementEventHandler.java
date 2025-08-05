package com.alipay.android.app.template.event;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.ITemplateClickCallback;

/* loaded from: classes3.dex */
public interface TElementEventHandler {

    /* loaded from: classes3.dex */
    public enum EventType {
        GENERIC,
        CLICK,
        ASYNC_EVENT
    }

    boolean onAsyncEvent(EventType eventType, String str, ITemplateClickCallback iTemplateClickCallback);

    boolean onEvent(EventType eventType, String str, JSONObject jSONObject, Object obj);

    String onGetCustomAttr(Object obj, String str);
}
