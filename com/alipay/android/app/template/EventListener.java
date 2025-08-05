package com.alipay.android.app.template;

/* loaded from: classes3.dex */
public interface EventListener {

    /* loaded from: classes3.dex */
    public interface EventCallback {
        void onEventReturn(String str);
    }

    /* loaded from: classes3.dex */
    public enum EventType {
        GENERIC,
        CLICK,
        ASYNC_EVENT
    }

    boolean onAsyncEvent(EventType eventType, String str, EventCallback eventCallback);

    boolean onEvent(EventType eventType, String str, Object obj, Object obj2);

    String onGetCustomAttr(Object obj, String str);
}
