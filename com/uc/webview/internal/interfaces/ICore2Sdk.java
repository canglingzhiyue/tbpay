package com.uc.webview.internal.interfaces;

import com.uc.webview.base.IExtender;
import com.uc.webview.internal.a;

/* loaded from: classes9.dex */
public interface ICore2Sdk extends IExtender {

    /* loaded from: classes9.dex */
    public interface ExtenderID {
        public static final int ON_PROCESS_LIB_CRASHED = 1;
    }

    /* loaded from: classes9.dex */
    public static final class Instance {
        public static ICore2Sdk get() {
            return a.a();
        }
    }

    void onActivityStatus(int i);

    void onInitStatus(int i, boolean z);

    void onPageView(int i, String str);

    void postTask(String str, Runnable runnable);
}
