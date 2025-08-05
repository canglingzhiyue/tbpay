package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;

/* loaded from: classes9.dex */
public abstract class IStatsHandler implements IExtender {

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile IStatsHandler sInstance;

        public static IStatsHandler get() {
            return sInstance;
        }

        public static void set(IStatsHandler iStatsHandler) {
            sInstance = iStatsHandler;
        }
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public abstract boolean stat(String str);
}
