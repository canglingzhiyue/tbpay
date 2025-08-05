package com.alipay.mobile.common.transport.monitor.networkqos;

import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;
import tb.riy;

/* loaded from: classes3.dex */
public class DeviceTrafficManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DeviceTrafficManager c;

    /* renamed from: a  reason: collision with root package name */
    private double f5604a = mto.a.GEO_NOT_SUPPORT;
    private double b = mto.a.GEO_NOT_SUPPORT;

    public static DeviceTrafficManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficManager) ipChange.ipc$dispatch("2638e74e", new Object[0]);
        }
        DeviceTrafficManager deviceTrafficManager = c;
        if (deviceTrafficManager != null) {
            return deviceTrafficManager;
        }
        synchronized (DeviceTrafficManager.class) {
            if (c == null) {
                c = new DeviceTrafficManager();
            }
        }
        return c;
    }

    private DeviceTrafficManager() {
    }

    public DeviceTrafficStateInfo startTrafficMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceTrafficStateInfo) ipChange.ipc$dispatch("a3d6cc76", new Object[]{this}) : new DeviceTrafficStateInfo();
    }

    public DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta stopTrafficMonitor(DeviceTrafficStateInfo deviceTrafficStateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta) ipChange.ipc$dispatch("c312902e", new Object[]{this, deviceTrafficStateInfo});
        }
        if (deviceTrafficStateInfo != null) {
            return deviceTrafficStateInfo.getDiff(new DeviceTrafficStateInfo());
        }
        return null;
    }

    public void setSpeed(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3f86b2", new Object[]{this, new Double(d)});
        } else {
            this.f5604a = d;
        }
    }

    public void setBandwidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a356a788", new Object[]{this, new Double(d)});
        } else {
            this.b = d;
        }
    }

    public double getSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d747a86", new Object[]{this})).doubleValue() : this.f5604a;
    }

    public double getBandwidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59a840f0", new Object[]{this})).doubleValue() : this.b;
    }

    public void calcSpeedAndBandwidth(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e1d46d", new Object[]{this, new Long(j), new Double(d)});
        } else if (d == mto.a.GEO_NOT_SUPPORT) {
        } else {
            this.f5604a = (j << 3) / ((d * 1024.0d) * 1024.0d);
            this.b = WestWoodManager.getInstance().calBw(j, d);
            LogCatUtil.debug("DTrafficManager", "input: traffic=[" + j + " byte] delta=[" + d + " s] speed=[" + String.format("%.4f", Double.valueOf(this.f5604a)) + "] bandwidth=[" + String.format("%.4f", Double.valueOf(this.b)) + riy.ARRAY_END_STR);
        }
    }
}
