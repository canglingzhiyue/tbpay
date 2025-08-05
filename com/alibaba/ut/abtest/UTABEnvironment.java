package com.alibaba.ut.abtest;

/* loaded from: classes3.dex */
public enum UTABEnvironment {
    Product(0),
    Prepare(1),
    Daily(2);
    
    private final int value;

    UTABEnvironment(int i) {
        this.value = i;
    }

    public static UTABEnvironment valueOf(int i) {
        UTABEnvironment[] values;
        for (UTABEnvironment uTABEnvironment : values()) {
            if (uTABEnvironment.getValue() == i) {
                return uTABEnvironment;
            }
        }
        return Product;
    }

    public int getValue() {
        return this.value;
    }
}
