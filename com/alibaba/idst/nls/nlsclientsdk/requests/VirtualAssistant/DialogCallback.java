package com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant;

/* loaded from: classes2.dex */
public interface DialogCallback {
    void onChannelClosed(String str, int i);

    void onDialogResultGenerated(String str);

    void onRecognizedCompleted(String str);

    void onRecognizedResultChanged(String str);

    void onTaskFailed(String str, int i);

    void onTaskStarted();
}
