package com.taobao.android.alinnkit.core;

/* loaded from: classes4.dex */
public enum MNNCVImageFormat {
    RGBA(0),
    RGB(1),
    BGR(2),
    GRAY(3),
    BGRA(4),
    YUV_NV21(11);
    
    public int format;

    MNNCVImageFormat(int i) {
        this.format = i;
    }
}
