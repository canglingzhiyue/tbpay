package com.uc.webview.export.extension;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.internal.b;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.ISdk2Core;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Sdk2CoreHost {
    private static String TAG = "Sdk2CoreHost";
    private static Sdk2CoreHost sInstance;
    private ISdk2Core mSdk2CoreHostImpl;

    private Sdk2CoreHost() {
        e.b();
        if (!b.b()) {
            ErrorCode.U4_INIT_FAILED.report();
        }
        this.mSdk2CoreHostImpl = b.c();
    }

    public static ISdk2Core impl() {
        return instance().mSdk2CoreHostImpl;
    }

    public static Sdk2CoreHost instance() {
        if (sInstance == null) {
            synchronized (Sdk2CoreHost.class) {
                if (sInstance == null) {
                    sInstance = new Sdk2CoreHost();
                }
            }
        }
        return sInstance;
    }

    public final void setGpuContextEventCallback(ValueCallback<Bundle> valueCallback) {
        impl().setGpuContextEventCallback(valueCallback);
    }

    public final void setMultiProcessStatusCallback(IMultiProcessStatus iMultiProcessStatus) {
        impl().setMultiProcessStatusCallback(iMultiProcessStatus);
    }

    public final void setThreadNotRespondingCallback(ValueCallback<Map<String, Object>> valueCallback) {
        impl().setThreadNotRespondingCallback(valueCallback);
    }
}
