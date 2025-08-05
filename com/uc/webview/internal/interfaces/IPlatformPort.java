package com.uc.webview.internal.interfaces;

import com.uc.webview.base.IExtender;

/* loaded from: classes9.dex */
public interface IPlatformPort extends IExtender {

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile IPlatformPort sInstance;

        public static IPlatformPort get() {
            return sInstance;
        }

        public static void set(IPlatformPort iPlatformPort) {
            sInstance = iPlatformPort;
        }
    }

    void onDestroy();

    void onLowMemory();

    void onOrientationChanged();

    void onPause();

    void onResume();

    void onScreenLock();

    void onScreenUnLock();

    void onTrimMemory(int i);

    void onWindowSizeChanged();
}
