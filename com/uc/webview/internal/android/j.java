package com.uc.webview.internal.android;

import android.webkit.WebMessage;

/* loaded from: classes9.dex */
public final class j extends WebMessage {

    /* renamed from: a  reason: collision with root package name */
    private com.uc.webview.export.WebMessage f23872a;

    public j(com.uc.webview.export.WebMessage webMessage) {
        super(webMessage.getData());
        this.f23872a = webMessage;
    }

    @Override // android.webkit.WebMessage
    public final String getData() {
        return this.f23872a.getData();
    }
}
