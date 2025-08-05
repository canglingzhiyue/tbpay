package com.alipay.mobile.common.transportext.biz.mmtp;

import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MMTPSceneManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setScene(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ad1dd9", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            ((OutEventNotifyService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(OutEventNotifyService.class)).notifySceneEvent(str, z);
        } catch (Throwable th) {
            LogCatUtil.error("MMTPSceneManager", th);
        }
    }
}
