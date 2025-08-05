package com.taobao.android.trade.event;

import tb.kge;

/* loaded from: classes6.dex */
public class EventCenterException extends RuntimeException {
    private static final long serialVersionUID = -2912559384646531479L;

    static {
        kge.a(-561911725);
    }

    public EventCenterException(String str) {
        super(str);
    }

    public EventCenterException(Throwable th) {
        super(th);
    }

    public EventCenterException(String str, Throwable th) {
        super(str, th);
    }
}
