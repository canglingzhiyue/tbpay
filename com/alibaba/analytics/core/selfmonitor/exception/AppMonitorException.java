package com.alibaba.analytics.core.selfmonitor.exception;

import tb.kge;

/* loaded from: classes2.dex */
public class AppMonitorException extends RuntimeException {
    static {
        kge.a(721516047);
    }

    public AppMonitorException() {
    }

    public AppMonitorException(String str) {
        super(str);
    }

    public AppMonitorException(String str, Throwable th) {
        super(str, th);
    }

    public AppMonitorException(Throwable th) {
        super(th);
    }
}
