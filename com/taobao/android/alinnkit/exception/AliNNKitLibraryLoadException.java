package com.taobao.android.alinnkit.exception;

import tb.kge;

/* loaded from: classes4.dex */
public class AliNNKitLibraryLoadException extends AliNNKitBaseException {
    static {
        kge.a(-1170043478);
    }

    public AliNNKitLibraryLoadException() {
        super("alinnkit library load error or current device not support neon!");
    }
}
