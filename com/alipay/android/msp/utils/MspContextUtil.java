package com.alipay.android.msp.utils;

import android.content.Context;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspContextUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : PhoneCashierMspEngine.getMspBase().getContext();
    }

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]) : PhoneCashierMspEngine.getMspWallet().getUserId();
    }

    public static void resetResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a718484", new Object[0]);
        } else {
            PhoneCashierMspEngine.getMspBase().resetResource();
        }
    }
}
