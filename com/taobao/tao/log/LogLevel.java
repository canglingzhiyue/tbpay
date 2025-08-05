package com.taobao.tao.log;

import com.ali.user.mobile.app.constant.UTConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* loaded from: classes.dex */
public enum LogLevel {
    ALL("ALL", 0),
    V("V", 0),
    D(TLogTracker.LEVEL_DEBUG, 1),
    I(TLogTracker.LEVEL_INFO, 2),
    W("W", 3),
    E("E", 4),
    F(UTConstant.Args.UT_SUCCESS_F, 5),
    N("N", 6),
    L("L", 6);
    
    private int index;
    private String name;

    LogLevel(String str, int i) {
        this.name = str;
        this.index = i;
    }

    protected static String getName(int i) {
        LogLevel[] values;
        for (LogLevel logLevel : values()) {
            if (logLevel.getIndex() == i) {
                return logLevel.name;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }
}
