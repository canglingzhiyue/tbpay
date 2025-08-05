package com.alibaba.poplayer.exception;

import tb.kge;

/* loaded from: classes3.dex */
public class PoplayerException extends RuntimeException {
    private static final long serialVersionUID = 1;

    static {
        kge.a(-1576149663);
    }

    public PoplayerException() {
    }

    public PoplayerException(String str, Throwable th) {
        super(str, th);
    }

    public PoplayerException(String str) {
        super(str);
    }

    public PoplayerException(Throwable th) {
        super(th);
    }
}
