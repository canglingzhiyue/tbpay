package com.uc.webview.export.internal.setup;

import com.uc.webview.base.UCKnownException;

@Deprecated
/* loaded from: classes9.dex */
public class UCSetupException extends UCKnownException {
    public UCSetupException(int i, String str) {
        this(i, str, null);
    }

    public UCSetupException(int i, String str, Throwable th) {
        super(i, str, th);
    }

    public UCSetupException(Throwable th) {
        this(-1, null, th);
    }
}
