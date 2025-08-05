package com.alipay.ariver.utils;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.remoterpc.serivce.RVRpcEnviromentService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AppInfoUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getAppId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94038553", new Object[0]) : ((RVRpcEnviromentService) RVProxy.get(RVRpcEnviromentService.class)).getAppId();
    }

    public static String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[0]) : ((RVRpcEnviromentService) RVProxy.get(RVRpcEnviromentService.class)).getAppKey();
    }
}
