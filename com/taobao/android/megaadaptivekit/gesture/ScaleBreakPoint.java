package com.taobao.android.megaadaptivekit.gesture;

/* loaded from: classes6.dex */
public enum ScaleBreakPoint {
    Default(1.1f, 0.9f);
    
    private float scaleFactorMax;
    private float scaleFactorMin;

    ScaleBreakPoint(float f, float f2) {
        this.scaleFactorMax = f;
        this.scaleFactorMin = f2;
    }

    public float getScaleFactorMax() {
        return this.scaleFactorMax;
    }

    public float getScaleFactorMin() {
        return this.scaleFactorMin;
    }
}
