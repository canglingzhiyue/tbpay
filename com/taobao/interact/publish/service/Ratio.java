package com.taobao.interact.publish.service;

/* loaded from: classes7.dex */
public enum Ratio {
    CROP_RATIO_FREE(0, 0),
    CROP_RATIO_1x1(1, 1),
    CROP_RATIO_3x4(3, 4),
    CROP_RATIO_4x3(4, 3),
    CROP_RATIO_16x9(16, 9),
    CROP_RATIO_9x16(9, 16);
    
    private int ratioX;
    private int ratioY;

    Ratio(int i, int i2) {
        this.ratioX = i;
        this.ratioY = i2;
    }

    public static AspectRatio parseRatio(Ratio ratio) {
        return new AspectRatio(ratio.ratioX, ratio.ratioY);
    }
}
