package com.taobao.android.weex_framework;

/* loaded from: classes6.dex */
public interface g {
    void onDestroyed(MUSDKInstance mUSDKInstance);

    void onFatalException(p pVar, int i, String str);

    void onForeground(p pVar);

    void onJSException(p pVar, int i, String str);

    void onPrepareSuccess(p pVar);

    void onRefreshFailed(p pVar, int i, String str, boolean z);

    void onRefreshSuccess(p pVar);

    void onRenderFailed(p pVar, int i, String str, boolean z);

    void onRenderSuccess(p pVar);
}
