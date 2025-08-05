package com.uc.webview.internal.android;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.uc.webview.internal.interfaces.IWebViewDatabase;

/* loaded from: classes9.dex */
public final class o implements IWebViewDatabase {

    /* renamed from: a  reason: collision with root package name */
    private WebViewDatabase f23880a;

    public o(Context context) {
        this.f23880a = WebViewDatabase.getInstance(context);
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final void clearFormData() {
        this.f23880a.clearFormData();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final void clearHttpAuthUsernamePassword() {
        this.f23880a.clearHttpAuthUsernamePassword();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final void clearUsernamePassword() {
        this.f23880a.clearUsernamePassword();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final boolean hasFormData() {
        return this.f23880a.hasFormData();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final boolean hasHttpAuthUsernamePassword() {
        return this.f23880a.hasHttpAuthUsernamePassword();
    }

    @Override // com.uc.webview.internal.interfaces.IWebViewDatabase
    public final boolean hasUsernamePassword() {
        return this.f23880a.hasUsernamePassword();
    }
}
