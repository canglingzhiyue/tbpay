package com.alipay.android.app.template;

/* loaded from: classes3.dex */
public interface EventHandler {

    /* loaded from: classes3.dex */
    public enum EventType {
        GENERIC,
        CLICK,
        ASYNC_EVENT
    }

    boolean onAsyncEvent(EventType eventType, String str, ITemplateClickCallback iTemplateClickCallback);

    boolean onEvent(EventType eventType, String str, Object obj, Object obj2);

    String onGetCustomAttr(Object obj, String str);
}
