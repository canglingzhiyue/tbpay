package com.taobao.tao.log.statistics;

/* loaded from: classes8.dex */
public enum UploadReason {
    UNKNOWN(0),
    SERVER_PULL(1),
    LOCAL_PUSH(2);
    
    private int value;

    UploadReason(int i) {
        this.value = i;
    }

    public String getValue() {
        return String.valueOf(this.value);
    }
}
