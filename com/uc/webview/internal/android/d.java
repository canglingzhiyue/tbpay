package com.uc.webview.internal.android;

import com.uc.webview.export.JsPromptResult;

/* loaded from: classes9.dex */
final class d implements JsPromptResult {

    /* renamed from: a  reason: collision with root package name */
    private android.webkit.JsPromptResult f23860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(android.webkit.JsPromptResult jsPromptResult) {
        this.f23860a = jsPromptResult;
    }

    @Override // com.uc.webview.export.JsPromptResult, com.uc.webview.export.JsResult
    public final void cancel() {
        this.f23860a.cancel();
    }

    @Override // com.uc.webview.export.JsPromptResult, com.uc.webview.export.JsResult
    public final void confirm() {
        this.f23860a.confirm();
    }

    @Override // com.uc.webview.export.JsPromptResult
    public final void confirm(String str) {
        this.f23860a.confirm(str);
    }
}
