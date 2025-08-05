package com.taobao.android.tstudio;

/* loaded from: classes6.dex */
public interface TStudioInterface {

    /* loaded from: classes6.dex */
    public interface a {
    }

    <T> boolean addDecorView(Class<T> cls, Object obj, boolean z);

    void destroy();

    void enableAssistant(boolean z);

    boolean isEnabled();

    void onCreate();

    void onPause();

    void onResume();

    void register(a aVar);

    void sendMessage(com.taobao.android.tstudio.a aVar);

    void unregister();
}
