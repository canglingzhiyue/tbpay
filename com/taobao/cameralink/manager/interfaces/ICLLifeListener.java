package com.taobao.cameralink.manager.interfaces;

/* loaded from: classes3.dex */
public interface ICLLifeListener {

    /* renamed from: com.taobao.cameralink.manager.interfaces.ICLLifeListener$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static void $default$onInitializing(ICLLifeListener iCLLifeListener, String str, Object obj) {
        }
    }

    void onInitializing(String str, Object obj);

    void onResourceProgress(int i);

    void onStart();

    void onStop();
}
