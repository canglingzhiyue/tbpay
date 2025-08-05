package com.taobao.mrt.thread;

/* loaded from: classes7.dex */
public enum MRTThreadPriority {
    LOW("low", 8),
    HIGH("high", 10);
    
    private final String name;
    private final int threadPriority;

    MRTThreadPriority(String str, int i) {
        this.name = str;
        this.threadPriority = i;
    }

    public String getName() {
        return this.name;
    }

    public int getThreadPriority() {
        return this.threadPriority;
    }
}
