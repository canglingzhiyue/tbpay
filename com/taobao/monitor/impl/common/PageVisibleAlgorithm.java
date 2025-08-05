package com.taobao.monitor.impl.common;

/* loaded from: classes7.dex */
public enum PageVisibleAlgorithm {
    CANVAS(0),
    SPECIFIC_VIEW_AREA(1),
    SHADOW(2);
    
    private final int value;

    PageVisibleAlgorithm(int i) {
        this.value = i;
    }

    public static PageVisibleAlgorithm valueOf(int i) {
        PageVisibleAlgorithm[] values;
        for (PageVisibleAlgorithm pageVisibleAlgorithm : values()) {
            if (pageVisibleAlgorithm.getValue() == i) {
                return pageVisibleAlgorithm;
            }
        }
        return CANVAS;
    }

    public int getValue() {
        return this.value;
    }
}
