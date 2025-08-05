package com.alibaba.security.realidentity.service.sensor.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class SensorInfo implements Serializable {
    public float lightBrightness;
    public float proximityValue;

    public SensorInfo(float f) {
        this.lightBrightness = f;
    }

    public SensorInfo(float f, float f2) {
        this.lightBrightness = f;
        this.proximityValue = f2;
    }
}
