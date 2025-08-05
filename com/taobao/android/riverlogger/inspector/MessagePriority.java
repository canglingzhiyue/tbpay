package com.taobao.android.riverlogger.inspector;

/* loaded from: classes6.dex */
public enum MessagePriority {
    Normal(0),
    Low(1);
    
    public final int value;

    MessagePriority(int i) {
        this.value = i;
    }

    public static MessagePriority valueOf(int i) {
        return i == 1 ? Low : Normal;
    }
}
