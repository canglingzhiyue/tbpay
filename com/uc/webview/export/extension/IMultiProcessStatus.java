package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;
import com.uc.webview.base.Log;

/* loaded from: classes9.dex */
public abstract class IMultiProcessStatus implements IExtender {
    public static final int PROCESS_MODE_ISOLATE = 2;
    public static final int PROCESS_MODE_ISOLATE_WITHOUT_SECCOMP = 12;
    public static final int PROCESS_MODE_NONE = 0;
    public static final int PROCESS_MODE_NORMAL = 1;
    public static final int PROCESS_MODE_NORMAL_WITHOUT_SECCOMP = 11;
    public static final int PROCESS_TYPE_GPU = 1;
    public static final int PROCESS_TYPE_RENDER = 0;

    /* loaded from: classes9.dex */
    public static final class Instance {
        public static void set(IMultiProcessStatus iMultiProcessStatus) {
            try {
                Sdk2CoreHost.impl().setMultiProcessStatusCallback(iMultiProcessStatus);
            } catch (Throwable th) {
                Log.w("sandbox", "setMultiProcessStatusCallback failed", th);
            }
        }
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public void onProcessGone(int i, boolean z, int i2) {
    }

    public void onProcessReady(int i, int i2) {
    }
}
