package com.uc.webview.internal.setup.component;

import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.task.c;
import com.uc.webview.internal.setup.component.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class s extends c.b {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f23935a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(j.a aVar, int i) {
        this.f23935a = aVar;
        this.b = i;
    }

    @Override // com.uc.webview.base.task.c.b
    public final void a() {
    }

    @Override // com.uc.webview.base.task.c.b
    public final void a(UCKnownException uCKnownException) {
        this.f23935a.a(this.b, uCKnownException);
    }
}
