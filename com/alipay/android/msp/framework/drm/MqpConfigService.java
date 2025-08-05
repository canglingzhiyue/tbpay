package com.alipay.android.msp.framework.drm;

import android.text.TextUtils;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MqpConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean isFalse(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("94ae77ee", new Object[]{str})).booleanValue() : !isTrue(str);
    }

    public static boolean isTrue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471b1a6d", new Object[]{str})).booleanValue();
        }
        return "true".equals(TextUtils.isEmpty(str) ? null : PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_".concat(String.valueOf(str))));
    }
}
