package org.android.spdy;

/* loaded from: classes.dex */
public enum RequestPriority {
    HIGHEST(1),
    HIGH(2),
    MEDIUM(3),
    LOW(4),
    LOWEST(5),
    IDLE(6),
    DEFAULT_PRIORITY(3);
    
    private int priority;

    RequestPriority(int i) {
        this.priority = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPriorityInt() {
        return this.priority;
    }
}
