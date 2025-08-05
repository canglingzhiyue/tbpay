package com.taobao.taobao.scancode.gateway.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1691521454);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("scan_switcher", "previewDisable4G", "0");
        if (!TextUtils.isEmpty(config)) {
            try {
                if (Integer.valueOf(config).intValue() == 1) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
