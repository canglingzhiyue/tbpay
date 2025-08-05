package com.taobao.android.detail2.core.framework.base.media.frame;

import tb.emh;

/* loaded from: classes5.dex */
public enum DimensionEnum {
    ONE_ONE(emh.sDefaultDimension, 750.0d, 1.0d),
    THREE_FOUR(b.VALUE_THREE_FOUR_RATIO, 1000.0d, 0.75d),
    NINE_SIXTEEN("9:16", 1333.0d, 0.5625d),
    SIXTEEN_NINE(b.VALUE_SIXTEEN_NINE_RATIO, 421.875d, 1.7778d);
    
    private String dimensionRatio;
    private double height;
    private double value;

    DimensionEnum(String str, double d, double d2) {
        this.dimensionRatio = str;
        this.height = d;
        this.value = d2;
    }

    public String getDimensionRatio() {
        return this.dimensionRatio;
    }

    public double getHeight() {
        return this.height;
    }

    public double getValue() {
        return this.value;
    }
}
