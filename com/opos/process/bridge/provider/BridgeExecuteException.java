package com.opos.process.bridge.provider;

import tb.kge;

/* loaded from: classes4.dex */
public class BridgeExecuteException extends BridgeException {
    static {
        kge.a(783859543);
    }

    public BridgeExecuteException(String str, int i) {
        super(str, i);
    }

    public BridgeExecuteException(String str, Throwable th, int i) {
        super(str, th, i);
    }

    public BridgeExecuteException(Throwable th, int i) {
        super(th, i);
    }
}
