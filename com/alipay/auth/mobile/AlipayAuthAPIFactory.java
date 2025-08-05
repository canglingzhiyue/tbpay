package com.alipay.auth.mobile;

import android.content.Context;
import com.alipay.auth.mobile.api.IAlipayAuthAPI;
import com.alipay.auth.mobile.api.IAlipayAuthMonitor;
import com.alipay.auth.mobile.common.LoggerUtils;
import com.alipay.auth.mobile.common.MonitorAlipayAuth;
import com.alipay.auth.mobile.exception.AlipayAuthIllegalArgumentException;
import com.alipay.auth.mobile.impl.AlipayAuthApiImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayAuthAPIFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static IAlipayAuthAPI createAlipayAuthApi(Context context, IAlipayAuthMonitor iAlipayAuthMonitor) throws AlipayAuthIllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayAuthAPI) ipChange.ipc$dispatch("75a3a51b", new Object[]{context, iAlipayAuthMonitor});
        }
        if (context == null || iAlipayAuthMonitor == null) {
            LoggerUtils.d("AlipayAuthAPIFactory", "createAlipayAuthApi param is null");
            throw new AlipayAuthIllegalArgumentException("createAlipayAuthApi param context or monitor is null");
        }
        LoggerUtils.d("AlipayAuthAPIFactory", "createAlipayAuthApi normal");
        MonitorAlipayAuth.getInstance().monitorAlipayAuth(iAlipayAuthMonitor, "AliPayAuth_Init");
        return new AlipayAuthApiImpl(context, iAlipayAuthMonitor);
    }
}
