package com.alipay.mobile.verifyidentity.common;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ExportBeacon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean gotThis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fdffcd5", new Object[0])).booleanValue();
        }
        return true;
    }
}
