package com.uc.webview.internal.interfaces;

import com.uc.webview.base.IExtender;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class ICoreStatsHandler implements IExtender {
    public static String CATEGORY = "core";
    public static String EVENT_CATEGORY = "u4";

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile ICoreStatsHandler sInstance;

        public static ICoreStatsHandler get() {
            return sInstance;
        }

        public static void set(ICoreStatsHandler iCoreStatsHandler) {
            sInstance = iCoreStatsHandler;
        }
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public abstract void stat(String str, String str2, String str3, Map<String, String> map);
}
