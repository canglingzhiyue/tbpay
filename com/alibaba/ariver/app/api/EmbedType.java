package com.alibaba.ariver.app.api;

/* loaded from: classes2.dex */
public enum EmbedType {
    NO(0),
    FULL(1),
    MINI(2);
    
    private int mType;

    EmbedType(int i) {
        this.mType = i;
    }

    public static EmbedType parse(int i) {
        return i == 1 ? FULL : i == 2 ? MINI : NO;
    }

    public int getTypeValue() {
        return this.mType;
    }

    public boolean isEmbedPage() {
        return this.mType != NO.getTypeValue();
    }
}
