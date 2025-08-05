package com.alipay.mobile.common.ipc.biz;

import com.alipay.mobile.common.ipc.api.IPCResultDesc;
import com.alipay.mobile.common.ipc.api.LocalCallManager;
import com.alipay.mobile.common.ipc.api.aidl.IIPCCallBack;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.riy;

/* loaded from: classes3.dex */
public class IPCManagerService extends IIPCManager.Stub {
    private static final String TAG = "IPC_IPCManagerService";
    private LocalCallManager localCallManager;
    private EnhanceRemoteCallbackList<IIPCCallBack> ipcCallbackContainer = new EnhanceRemoteCallbackList<>();
    private Lock callLock = new ReentrantLock();

    @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
    public IPCResult call(IPCParameter iPCParameter) {
        LogCatUtil.debugOrLose(TAG, "IPCParameter=[" + iPCParameter.toString() + riy.ARRAY_END_STR);
        LocalCallManager localCallManager = this.localCallManager;
        if (localCallManager == null) {
            IPCResult iPCResult = new IPCResult();
            iPCResult.resultCode = 108;
            iPCResult.resultMsg = IPCResultDesc.RETURN_LOCAL_CALL_MNG_IS_NULL_MSG;
            LogCatUtil.error(TAG, "[call] localCallManager is null, so return.");
            return iPCResult;
        }
        return localCallManager.call(iPCParameter);
    }

    @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
    public void registerCallBack(IIPCCallBack iIPCCallBack) {
        boolean register;
        if (iIPCCallBack == null) {
            LogCatUtil.debug(TAG, "Register ipcCallBack is null");
            return;
        }
        synchronized (this) {
            preCheckCallbacks();
            register = this.ipcCallbackContainer.register(iIPCCallBack);
        }
        LogCatUtil.debugOrLose(TAG, "ipcCallBack register finish, result=[" + register + "]!");
    }

    @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
    public void unregisterCallBack(IIPCCallBack iIPCCallBack) {
        if (iIPCCallBack == null) {
            LogCatUtil.debug(TAG, "unregister fail.   ipcCallBack is null");
            return;
        }
        boolean unregister = this.ipcCallbackContainer.unregister(iIPCCallBack);
        LogCatUtil.debugOrLose(TAG, "ipcCallBack unregister finish, result=[" + unregister + "]!");
    }

    @Override // com.alipay.mobile.common.ipc.api.aidl.IIPCManager
    public boolean hashRegister() {
        boolean z = this.ipcCallbackContainer.getRegisteredCallbackCount() > 0;
        LogCatUtil.debugOrLose(TAG, "hashRegister=" + z);
        return z;
    }

    public IPCResult callback(IPCParameter iPCParameter) {
        LogCatUtil.info(TAG, "callback, ipcParameter=" + iPCParameter.toString());
        try {
            if (!hashRegister()) {
                LogCatUtil.info(TAG, "No registrant, return null!");
                return null;
            }
            IIPCCallBack broadcastItem = this.ipcCallbackContainer.getBroadcastItem(0);
            if (broadcastItem == null) {
                LogCatUtil.error(TAG, "iPCCallBack is null,  ipcParameter=" + iPCParameter.toString());
                return null;
            }
            this.callLock.lock();
            IPCResult call = broadcastItem.call(iPCParameter);
            this.callLock.unlock();
            return call;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "iPCCallBack.call exception,  ipcParameter=" + iPCParameter.toString(), th);
            perfIPCException(th);
            return null;
        }
    }

    public void setLocalCallManager(LocalCallManager localCallManager) {
        this.localCallManager = localCallManager;
    }

    protected void preCheckCallbacks() {
        int registeredCallbackCount = this.ipcCallbackContainer.getRegisteredCallbackCount();
        if (registeredCallbackCount <= 0) {
            return;
        }
        EnhanceRemoteCallbackList<IIPCCallBack> enhanceRemoteCallbackList = this.ipcCallbackContainer;
        this.ipcCallbackContainer = new EnhanceRemoteCallbackList<>();
        enhanceRemoteCallbackList.kill();
        perfLog(registeredCallbackCount + 1);
    }

    private void perfLog(final int i) {
        if (i <= 0) {
            return;
        }
        NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.ipc.biz.IPCManagerService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    LogCatUtil.debug(IPCManagerService.TAG, "callbackSize=" + i);
                    MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                    monitorLoggerModel.setSubType("IPC");
                    monitorLoggerModel.setParam1(a.ATOM_EXT_bind);
                    monitorLoggerModel.getExtPramas().put("callbackSize", String.valueOf(i));
                    MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
                    LogCatUtil.debug(IPCManagerService.TAG, "IPC perf:" + monitorLoggerModel.toString());
                } catch (Throwable th) {
                    LogCatUtil.error(IPCManagerService.TAG, "ex:" + th.toString());
                }
            }
        });
    }

    private void perfIPCException(final Throwable th) {
        if (th == null) {
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.ipc.biz.IPCManagerService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Throwable rootCause = MiscUtils.getRootCause(th);
                    if (rootCause == null) {
                        return;
                    }
                    MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                    monitorLoggerModel.setSubType("IPC");
                    monitorLoggerModel.setParam1(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
                    monitorLoggerModel.setParam2("callback");
                    monitorLoggerModel.getExtPramas().put("exmsg", rootCause.toString());
                    MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
                    LogCatUtil.debug(IPCManagerService.TAG, "IPC callback:" + monitorLoggerModel.toString());
                }
            });
        } catch (Throwable th2) {
            LogCatUtil.error(TAG, "perfIPCException ex:" + th2.toString());
        }
    }
}
