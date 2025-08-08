package com.alipay.mobile.common.transportext.biz.shared;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService;
import com.alipay.mobile.common.ipc.api.LocalCallRetryHandler;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.transport.ext.MainProcConfigListenService;
import com.alipay.mobile.common.transport.httpdns.ipc.MainProcReloadDnsService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.httpdns.MainProcReloadDnsServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.AcceptDataListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.shared.config.MainProcConfigListenServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ExtTransLocalCallRetryHandler implements LocalCallRetryHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.ipc.api.LocalCallRetryHandler
    public boolean retryLocalCall(IPCParameter iPCParameter, IPCResult iPCResult, ServiceBeanManager serviceBeanManager, int i) {
        StringBuilder sb;
        String sb2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afdb0f4", new Object[]{this, iPCParameter, iPCResult, serviceBeanManager, new Integer(i)})).booleanValue();
        }
        if (iPCResult.resultCode != 100) {
            str = "Only support SERVICE_NOT_FOUND_CODE retry!";
        } else if (!StringUtils.isEmpty(iPCParameter.className)) {
            if (serviceBeanManager.getServiceBean(iPCParameter.className) != null) {
                sb2 = "serviceBean is not null.  return true;";
            } else {
                if (MainProcDataListenService.class.getName().equals(iPCParameter.className)) {
                    serviceBeanManager.register(MainProcDataListenService.class.getName(), AcceptDataListenServiceImpl.getInstance());
                    sb = new StringBuilder();
                } else if (MainProcGeneralListenService.class.getName().equals(iPCParameter.className)) {
                    serviceBeanManager.register(MainProcGeneralListenService.class.getName(), GeneralEventListenServiceImpl.getInstance());
                    sb = new StringBuilder();
                } else if (MainProcConfigListenService.class.getName().equals(iPCParameter.className)) {
                    serviceBeanManager.register(MainProcConfigListenService.class.getName(), MainProcConfigListenServiceImpl.getInstance());
                    sb = new StringBuilder();
                } else if (!MainProcReloadDnsService.class.getName().equals(iPCParameter.className)) {
                    return false;
                } else {
                    serviceBeanManager.register(MainProcReloadDnsService.class.getName(), new MainProcReloadDnsServiceImpl());
                    sb = new StringBuilder();
                }
                sb.append("register ");
                sb.append(iPCParameter.className);
                sb2 = sb.toString();
            }
            LogCatUtil.info("IPC_ExtTransLocalCallRetryHandler", sb2);
            return true;
        } else {
            str = "className is null!";
        }
        LogCatUtil.warn("IPC_ExtTransLocalCallRetryHandler", str);
        return false;
    }
}
