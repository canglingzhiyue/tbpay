package com.taobao.android.alinnkit.core;

/* loaded from: classes4.dex */
public enum AliNNBufferType {
    NCHW(0),
    NHWC(1);
    
    public int type;

    AliNNBufferType(int i) {
        this.type = i;
    }
}
