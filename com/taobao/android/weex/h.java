package com.taobao.android.weex;

/* loaded from: classes6.dex */
public interface h {
    void onDestroyed(WeexInstance weexInstance);

    void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str);

    void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str);

    void onExecuteSuccess(WeexInstance weexInstance);

    void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str);

    void onInitSuccess(WeexInstance weexInstance, boolean z);

    void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str);

    void onRenderSuccess(WeexInstance weexInstance, boolean z);

    void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str);
}
