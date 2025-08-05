package com.taobao.android.engine.expression;

import tb.kge;

/* loaded from: classes5.dex */
public class ExecuteException extends RuntimeException {
    static {
        kge.a(-386084137);
    }

    public ExecuteException() {
    }

    public ExecuteException(String str) {
        super(str);
    }

    public ExecuteException(String str, Throwable th) {
        super(str, th);
    }

    public ExecuteException(Throwable th) {
        super(th);
    }
}
