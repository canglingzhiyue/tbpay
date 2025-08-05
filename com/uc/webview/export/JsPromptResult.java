package com.uc.webview.export;

/* loaded from: classes9.dex */
public interface JsPromptResult extends JsResult {
    @Override // com.uc.webview.export.JsResult
    void cancel();

    @Override // com.uc.webview.export.JsResult
    void confirm();

    void confirm(String str);
}
