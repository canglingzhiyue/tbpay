package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes3.dex */
public class QoeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double rtt_s = mto.a.GEO_NOT_SUPPORT;
    public double rtt_d = mto.a.GEO_NOT_SUPPORT;
    public double rtt_o = 500.0d;

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.rtt_o = mto.a.GEO_NOT_SUPPORT;
        this.rtt_d = mto.a.GEO_NOT_SUPPORT;
        this.rtt_s = mto.a.GEO_NOT_SUPPORT;
    }

    public void estimate(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfc406f", new Object[]{this, new Double(d)});
            return;
        }
        double d2 = this.rtt_s;
        if (d2 == mto.a.GEO_NOT_SUPPORT) {
            this.rtt_s = d;
            this.rtt_d = d * 0.25d;
            double d3 = this.rtt_d;
            if (d3 <= 500.0d) {
                d3 = 500.0d;
            }
            this.rtt_d = d3;
        } else {
            this.rtt_s = d2 + ((d - d2) * 0.1d);
            double d4 = d - this.rtt_s;
            if (d4 < mto.a.GEO_NOT_SUPPORT) {
                d4 = -d4;
            }
            this.rtt_d = (this.rtt_d * 0.75d) + (d4 * 0.25d);
        }
        this.rtt_o = (this.rtt_s * 1.0d) + (this.rtt_d * 4.0d);
    }
}
