package com.opos.process.bridge.provider;

import tb.kge;

/* loaded from: classes4.dex */
public class BridgeBizException extends BridgeExecuteException {
    static {
        kge.a(-1106464263);
    }

    public BridgeBizException(String str, int i) {
        super(str, i);
    }

    public BridgeBizException(String str, Throwable th, int i) {
        super(str, th, i);
    }

    public BridgeBizException(Throwable th, int i) {
        super(th, i);
    }
}
