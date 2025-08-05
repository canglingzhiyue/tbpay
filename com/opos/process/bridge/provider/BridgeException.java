package com.opos.process.bridge.provider;

import tb.kge;

/* loaded from: classes4.dex */
public class BridgeException extends Exception {
    public int code;

    static {
        kge.a(-566669326);
    }

    public BridgeException(String str, int i) {
        super(str);
        this.code = i;
    }

    public BridgeException(String str, Throwable th, int i) {
        super(str, th);
        this.code = i;
    }

    public BridgeException(Throwable th, int i) {
        super(th);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
