package com.taobao.android.alinnkit.core;

/* loaded from: classes4.dex */
public enum AliNNScaleFilterMode {
    NONE(0),
    LINEAR(1),
    BILINEAR(2),
    BOX(3);
    
    public int type;

    AliNNScaleFilterMode(int i) {
        this.type = i;
    }
}
