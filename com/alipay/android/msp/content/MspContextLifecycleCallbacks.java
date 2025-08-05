package com.alipay.android.msp.content;

/* loaded from: classes3.dex */
public interface MspContextLifecycleCallbacks {
    void didEnterBackground();

    void onContextCreated();

    void onRestart();

    void onStart();

    void onStop();

    void willEnterForeground();
}
