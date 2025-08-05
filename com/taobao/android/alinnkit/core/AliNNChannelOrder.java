package com.taobao.android.alinnkit.core;

/* loaded from: classes4.dex */
public enum AliNNChannelOrder {
    PIXEL_RGBA2BGR(0),
    PIXEL_RGBA2RGB(1);
    
    public int type;

    AliNNChannelOrder(int i) {
        this.type = i;
    }
}
