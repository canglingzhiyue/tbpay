package com.alipay.mobile.common.transport.monitor.networkqos;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class WestWoodManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static WestWoodManager b;

    /* renamed from: a  reason: collision with root package name */
    private WestWoodModel f5607a = new WestWoodModel();

    public static WestWoodManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WestWoodManager) ipChange.ipc$dispatch("f0c67671", new Object[0]);
        }
        WestWoodManager westWoodManager = b;
        if (westWoodManager != null) {
            return westWoodManager;
        }
        synchronized (WestWoodManager.class) {
            if (b == null) {
                b = new WestWoodManager();
            }
        }
        return b;
    }

    private WestWoodManager() {
    }

    public double calBw(double d, double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("610974f8", new Object[]{this, new Double(d), new Double(d2)})).doubleValue() : this.f5607a.calBw(d, d2);
    }
}
