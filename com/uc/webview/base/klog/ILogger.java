package com.uc.webview.base.klog;

import com.uc.webview.base.IExtender;

/* loaded from: classes9.dex */
public abstract class ILogger implements IExtender {

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile ILogger sInstance;

        public static ILogger get() {
            return sInstance;
        }

        public static void set(ILogger iLogger) {
            sInstance = iLogger;
        }
    }

    public abstract void d(String str, String str2, Throwable th);

    public abstract void e(String str, String str2, Throwable th);

    public abstract void i(String str, String str2, Throwable th);

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public abstract void w(String str, String str2, Throwable th);
}
