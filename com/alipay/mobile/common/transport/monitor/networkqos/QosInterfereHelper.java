package com.alipay.mobile.common.transport.monitor.networkqos;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class QosInterfereHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double QOE_NET_INTERFERENCE = 100.0d;
    private static double b = 0.68d;
    private static double c = 0.27d;
    private static double d = (1.0d - b) - c;
    private static QosInterfereHelper i = null;

    /* renamed from: a  reason: collision with root package name */
    private long f5606a;
    private double e = -1.0d;
    private double f = -1.0d;
    private double g = -1.0d;
    private int h = 0;

    public static QosInterfereHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QosInterfereHelper) ipChange.ipc$dispatch("ba1f440d", new Object[0]);
        }
        QosInterfereHelper qosInterfereHelper = i;
        if (qosInterfereHelper != null) {
            return qosInterfereHelper;
        }
        synchronized (QosInterfereHelper.class) {
            if (i == null) {
                i = new QosInterfereHelper();
            }
        }
        return i;
    }

    private QosInterfereHelper() {
        this.f5606a = 0L;
        this.f5606a = 0L;
    }

    public double interferInputRtt(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96753346", new Object[]{this, new Double(d2)})).doubleValue();
        }
        try {
            if (!a()) {
                return d2;
            }
            if (this.f5606a == 0) {
                this.g = d2;
                this.f = d2;
                this.e = d2;
            }
            this.g = this.f;
            this.f = this.e;
            this.e = d2;
            double d3 = (b * this.e) + (c * this.f) + (d * this.g);
            this.f5606a++;
            double a2 = a(d3);
            LogCatUtil.debug("QosInterfereHelper", "input:" + d2 + ",result=" + a2);
            return a2;
        } catch (Throwable th) {
            LogCatUtil.error("QosInterfereHelper", "interferInputRtt ex:" + th.toString());
            return d2;
        }
    }

    public void interferOutputRtt(double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f005541", new Object[]{this, new Double(d2), new Double(d3)});
            return;
        }
        try {
            if (!a()) {
                return;
            }
            if (AlipayQosService.getInstance().getRtoLevel(d3) != 4) {
                this.h = 0;
            } else if (d2 >= 200.0d) {
                this.h = 0;
            } else {
                this.h++;
                if (this.h < 5) {
                    return;
                }
                LogCatUtil.debug("QosInterfereHelper", "it's time to interfereQos");
                AlipayQosService.getInstance().estimate(100.0d, (byte) 6);
                LogCatUtil.debug("QosInterfereHelper", "after interferOutputRtt:" + AlipayQosService.getInstance().getRto());
                this.h = 0;
            }
        } catch (Throwable th) {
            LogCatUtil.error("QosInterfereHelper", "interferOutputRtt ex:" + th.toString());
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.equals("T", TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NET_QOS_INTERFER));
    }

    private static double a(double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d2)})).doubleValue() : Math.round(d2 * 100.0d) / 100.0d;
    }
}
