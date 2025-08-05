package com.alipay.mobile.common.transport.utils;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetworkMiscUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean isBindedPushProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38cb6fba", new Object[0])).booleanValue();
        }
        try {
            return ExtTransportOffice.getInstance().isBindedPushProcess();
        } catch (Throwable unused) {
            LogCatUtil.error("NetworkMiscUtils", "isBindedPushProcess ex");
            return false;
        }
    }
}
