package com.alipay.mobile.common.transport.monitor.networkqos;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class WestWoodModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Double ERROR = Double.valueOf(-100.0d);

    /* renamed from: a  reason: collision with root package name */
    private static int f5608a;
    private static double b;
    private static double c;

    public synchronized double calBw(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("610974f8", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        } else if (Math.abs(d2) < 5.0E-5d) {
            LogCatUtil.debug("WestWoodModel", "calBw error,ts can't small than 0.5ms");
            return ERROR.doubleValue();
        } else {
            b = a(d, d2);
            if (f5608a == 0) {
                f5608a++;
                double d3 = (d / d2) * 7.62939453125E-6d;
                c = d3;
                return d3;
            }
            f5608a++;
            double d4 = (c * 0.75d) + (b * 0.25d);
            c = d4;
            return d4;
        }
    }

    private double a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa16", new Object[]{this, new Double(d), new Double(d2)})).doubleValue();
        }
        if (f5608a == 0) {
            double d3 = (d / d2) * 7.62939453125E-6d;
            b = d3;
            return d3;
        }
        double d4 = (b * 0.75d) + (((d * 0.25d) / d2) * 7.62939453125E-6d);
        b = d4;
        return d4;
    }
}
