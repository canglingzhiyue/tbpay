package com.taobao.statistic.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.apw;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Device s_device;

    static {
        kge.a(232768290);
        s_device = null;
    }

    @Deprecated
    public static Device getDevice(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Device) ipChange.ipc$dispatch("49aafc7c", new Object[]{context});
        }
        Device device = s_device;
        if (device != null) {
            return device;
        }
        Device device2 = new Device();
        device2.setImei(apw.a(context));
        device2.setImsi(apw.b(context));
        device2.setUdid(UTDevice.getUtdid(context));
        s_device = device2;
        return device2;
    }
}
