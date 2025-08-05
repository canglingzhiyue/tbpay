package com.taobao.android.tbuprofen.log;

/* loaded from: classes.dex */
public enum TBPLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);
    
    private final int mLevel;

    TBPLogLevel(int i) {
        this.mLevel = i;
    }
}
