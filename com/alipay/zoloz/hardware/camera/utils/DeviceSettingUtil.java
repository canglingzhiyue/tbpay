package com.alipay.zoloz.hardware.camera.utils;

import android.os.Build;
import com.alipay.zoloz.hardware.DeviceSetting;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DeviceSettingUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static DeviceSetting getPropertyDeviceSetting(DeviceSetting[] deviceSettingArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DeviceSetting) ipChange.ipc$dispatch("149e61e5", new Object[]{deviceSettingArr});
        }
        DeviceSetting deviceSetting = null;
        if (deviceSettingArr != null) {
            int parseInt = Integer.parseInt(Build.VERSION.SDK);
            int length = deviceSettingArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                DeviceSetting deviceSetting2 = deviceSettingArr[i];
                if (parseInt >= deviceSetting2.getMinApiLevel() && parseInt <= deviceSetting2.getMaxApiLevel()) {
                    deviceSetting = deviceSetting2;
                    break;
                }
                i++;
            }
        }
        return deviceSetting == null ? new DeviceSetting() : deviceSetting;
    }
}
