package com.alipay.mobile.common.transport.monitor.networkqos;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.QoeModel;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes3.dex */
public class QoeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static QoeManager b;

    /* renamed from: a  reason: collision with root package name */
    private QoeModel[] f5605a;
    private int c = 6;

    public static QoeManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QoeManager) ipChange.ipc$dispatch("bb91f1ce", new Object[0]);
        }
        QoeManager qoeManager = b;
        if (qoeManager != null) {
            return qoeManager;
        }
        synchronized (QoeManager.class) {
            if (b == null) {
                b = new QoeManager();
            }
        }
        return b;
    }

    private QoeManager() {
        this.f5605a = null;
        this.f5605a = new QoeModel[this.c];
        for (int i = 0; i < this.c; i++) {
            this.f5605a[i] = new QoeModel();
        }
    }

    public void estimate(double d, byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428c262d", new Object[]{this, new Double(d), new Byte(b2)});
            return;
        }
        try {
            int networkType = NetworkUtils.getNetworkType(TransportEnvUtil.getContext());
            this.f5605a[networkType].estimate(d);
            if (!MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                return;
            }
            LogCatUtil.printInfo("QoeManager", "from=" + ((int) b2) + ",netType=" + networkType + ",input: rtt=" + d + ",output: rtt_o=" + this.f5605a[networkType].rtt_o + ",rtt_s=" + this.f5605a[networkType].rtt_s + ",rtt_d=" + this.f5605a[networkType].rtt_d);
        } catch (Throwable th) {
            LogCatUtil.error("QoeManager", "estimate ex= " + th.toString());
        }
    }

    public void resetRtoWhenNetchange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401dfd7c", new Object[]{this});
            return;
        }
        try {
            int networkType = NetworkUtils.getNetworkType(TransportEnvUtil.getContext());
            if (networkType != 3) {
                return;
            }
            this.f5605a[networkType].reset();
        } catch (Throwable th) {
            LogCatUtil.error("QoeManager", "resetRtoWhenNetchange ex= " + th.toString());
        }
    }

    public double getRto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98777c2c", new Object[]{this})).doubleValue();
        }
        try {
            return this.f5605a[NetworkUtils.getNetworkType(TransportEnvUtil.getContext())].rtt_o;
        } catch (Throwable th) {
            LogCatUtil.error("QoeManager", "getRto ex= " + th.toString());
            return mto.a.GEO_NOT_SUPPORT;
        }
    }
}
