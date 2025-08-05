package com.uc.webview.internal.android;

import com.uc.webview.export.JsResult;

/* loaded from: classes9.dex */
final class e implements JsResult {

    /* renamed from: a  reason: collision with root package name */
    private android.webkit.JsResult f23861a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(android.webkit.JsResult jsResult) {
        this.f23861a = jsResult;
    }

    @Override // com.uc.webview.export.JsResult
    public final void cancel() {
        this.f23861a.cancel();
    }

    @Override // com.uc.webview.export.JsResult
    public final void confirm() {
        this.f23861a.confirm();
    }
}
