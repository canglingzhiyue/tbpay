package com.alibaba.fastjson2.time;

import tb.kge;

/* loaded from: classes2.dex */
public class DateTimeException extends RuntimeException {
    private final int errorIndex;

    static {
        kge.a(2144623348);
    }

    public DateTimeException(String str) {
        super(str);
        this.errorIndex = 0;
    }

    public DateTimeException(String str, String str2, int i) {
        super(str);
        this.errorIndex = i;
    }
}
