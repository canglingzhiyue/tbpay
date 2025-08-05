package com.taobao.message.biz.share;

/* loaded from: classes7.dex */
public enum ShareType {
    GOODS(0);
    
    private int value;

    ShareType(int i) {
        this.value = i;
    }

    public static ShareType valueOf(int i) {
        return i != 0 ? GOODS : GOODS;
    }

    public int getValue() {
        return this.value;
    }
}
