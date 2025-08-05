package com.ali.alihadeviceevaluator.old;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        String lowerCase = Build.BRAND.toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return 1;
        }
        if (lowerCase.contains("samsung") || lowerCase.contains("google")) {
            return 10;
        }
        if (lowerCase.contains("huawei") || lowerCase.contains("honor") || lowerCase.contains("xiaomi")) {
            return 9;
        }
        if (lowerCase.contains("meizu") || lowerCase.contains("vivo") || lowerCase.contains("oppo") || lowerCase.contains("lge") || lowerCase.contains("verizon")) {
            return 8;
        }
        if (lowerCase.contains("motorola") || lowerCase.contains(DeviceProperty.ALIAS_ZTE) || lowerCase.contains("sony") || lowerCase.contains("zuk") || lowerCase.contains("smartisan")) {
            return 7;
        }
        if (lowerCase.contains("gionee") || lowerCase.contains("letv") || lowerCase.contains(DeviceProperty.ALIAS_LEECO) || lowerCase.contains(DeviceProperty.ALIAS_COOLPAD) || lowerCase.contains("htc")) {
            return 6;
        }
        return (lowerCase.contains(DeviceProperty.ALIAS_NUBIA) || lowerCase.contains(DeviceProperty.ALIAS_ONEPLUS) || lowerCase.contains(DeviceProperty.ALIAS_QIKU) || lowerCase.contains("360") || lowerCase.contains("lenovo") || lowerCase.contains("cmcc") || lowerCase.contains("asus")) ? 5 : 4;
    }
}
