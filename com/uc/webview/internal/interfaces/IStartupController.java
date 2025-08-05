package com.uc.webview.internal.interfaces;

import android.content.Context;
import com.uc.webview.base.IExtender;
import com.uc.webview.base.g;

/* loaded from: classes9.dex */
public interface IStartupController extends IExtender {
    public static final String CORE_CLASS_STARTUP_CONTROLLER = "com.uc.sdk_glue.extension.StartupController";

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile IStartupController sInstance;

        public static final IStartupController get() {
            if (sInstance != null) {
                return sInstance;
            }
            synchronized (Instance.class) {
                if (sInstance != null) {
                    return sInstance;
                }
                sInstance = (IStartupController) g.b(IStartupController.CORE_CLASS_STARTUP_CONTROLLER, "getInstance");
                return sInstance;
            }
        }
    }

    void checkAuthorization(Context context, String[] strArr);

    void checkCompatiable(String str, String str2);

    void initCoreEngine(Context context);

    void initCoreLauncherThread();

    void initIcu();

    void initWebViewProvider(Context context);

    boolean loadCoreLibrary(Context context, String str);

    void onDexReady(Context context);

    void onSdkReady();

    void preStartCoreEngine(Context context);

    void preloadCoreClass();
}
