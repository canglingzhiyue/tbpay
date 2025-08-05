package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.transport.httpdns.ipc.MainProcReloadDnsService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes3.dex */
public class MasterProxyHttpDnsUpListener implements Observer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            return;
        }
        try {
            ((MainProcReloadDnsService) PushIpcHelper.getIpcProxy(MainProcReloadDnsService.class)).notifyReloadDns();
            LogCatUtil.debug("MasterProxyHttpDnsUpListener", "notifyReloadDns finish!");
            LogCatUtil.debug("MasterProxyHttpDnsUpListener", "notifyUpdateAllDnsInfo");
            AmnetLinkStrategy.getInstance().notifyUpdateAllDnsInfo();
        } catch (Exception e) {
            LogCatUtil.warn("MasterProxyHttpDnsUpListener", " notifyReloadDns exception: " + e.toString());
        }
    }
}
