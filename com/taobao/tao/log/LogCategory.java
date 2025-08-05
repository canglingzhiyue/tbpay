package com.taobao.tao.log;

import com.taobao.tao.log.logger.EventLogger;

/* loaded from: classes.dex */
public enum LogCategory {
    CodeLog("CodeLog", 1),
    TraceEventLog("TraceEventLog", 2),
    SceneLog("SceneLog", 3),
    PageLog("PageLog", 4),
    EventLog(EventLogger.TAG, 5),
    MetricLog("MetricLog", 6),
    SpanLog("SpanLog", 7);
    
    private int index;
    private String name;

    LogCategory(String str, int i) {
        this.name = str;
        this.index = i;
    }

    protected static String getName(int i) {
        LogCategory[] values;
        for (LogCategory logCategory : values()) {
            if (logCategory.getIndex() == i) {
                return logCategory.name;
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
