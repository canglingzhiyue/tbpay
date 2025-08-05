package com.taobao.media.connectionclass;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class ExponentialGeometricAverage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mCount;
    private final int mCutover;
    private final double mDecayConstant;
    private double mValue = -1.0d;

    static {
        kge.a(-540983506);
    }

    public ExponentialGeometricAverage(double d) {
        this.mDecayConstant = d;
        this.mCutover = d == mto.a.GEO_NOT_SUPPORT ? Integer.MAX_VALUE : (int) Math.ceil(1.0d / d);
    }

    public void addMeasurement(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b2e11c", new Object[]{this, new Double(d)});
            return;
        }
        double d2 = 1.0d - this.mDecayConstant;
        int i = this.mCount;
        if (i > this.mCutover) {
            this.mValue = Math.exp((d2 * Math.log(this.mValue)) + (this.mDecayConstant * Math.log(d)));
        } else if (i > 0) {
            double d3 = (d2 * i) / (i + 1.0d);
            this.mValue = Math.exp((d3 * Math.log(this.mValue)) + ((1.0d - d3) * Math.log(d)));
        } else {
            this.mValue = d;
        }
        this.mCount++;
    }

    public double getAverage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("604252dc", new Object[]{this})).doubleValue() : this.mValue;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mValue = -1.0d;
        this.mCount = 0;
    }
}
