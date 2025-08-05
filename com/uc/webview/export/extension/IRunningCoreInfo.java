package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.internal.e;

/* loaded from: classes9.dex */
public abstract class IRunningCoreInfo implements IExtender {

    /* loaded from: classes9.dex */
    public interface FailedInfo {
        int errorCode();

        UCKnownException exception();

        String reason();
    }

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile IRunningCoreInfo sInstance;

        public static final IRunningCoreInfo get() {
            e.a();
            return sInstance;
        }

        public static final void set(IRunningCoreInfo iRunningCoreInfo) {
            sInstance = iRunningCoreInfo;
        }
    }

    public abstract ClassLoader coreClassLoader();

    public abstract ICoreVersion coreVersion();

    public abstract FailedInfo failedInfo();

    public abstract int integrationType();

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public abstract boolean isFirstUsed();

    public abstract boolean isReUsed();

    public abstract String libPath();

    public abstract String path();

    public abstract ClassLoader sdkClassLoader();
}
