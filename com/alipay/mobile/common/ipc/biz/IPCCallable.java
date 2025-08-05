package com.alipay.mobile.common.ipc.biz;

import android.os.DeadObjectException;
import com.alipay.mobile.common.ipc.api.IPCResultDesc;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class IPCCallable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IIPCManager f5394a;
    private Lock b = new ReentrantLock();

    public IPCCallable(IIPCManager iIPCManager) {
        this.f5394a = iIPCManager;
    }

    public IPCResult call(IPCParameter iPCParameter) {
        String message;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCResult) ipChange.ipc$dispatch("700b181f", new Object[]{this, iPCParameter});
        }
        try {
            if (this.f5394a == null) {
                IPCResult iPCResult = new IPCResult();
                iPCResult.resultCode = 107;
                iPCResult.resultMsg = IPCResultDesc.RETURN_LOCAL_IPCMANAGER_IS_NULL_MSG;
                LogCatUtil.error("IPCCallable", "[call] ipcManager obj is null.");
                return iPCResult;
            } else if (!(this.f5394a instanceof IPCManagerService)) {
                this.b.lock();
                IPCResult call = this.f5394a.call(iPCParameter);
                this.b.unlock();
                if (call == null) {
                    throw new IllegalStateException("remote return ipcResult is null!");
                }
                return call;
            } else {
                IPCManagerService iPCManagerService = (IPCManagerService) this.f5394a;
                if (iPCManagerService.hashRegister()) {
                    return iPCManagerService.callback(iPCParameter);
                }
                IPCResult iPCResult2 = new IPCResult();
                iPCResult2.resultCode = 1;
                iPCResult2.resultMsg = "Peer not registered";
                return iPCResult2;
            }
        } catch (Exception e) {
            LogCatUtil.error("IPCCallable", "[call] Exception: " + e.toString(), e);
            IPCResult iPCResult3 = new IPCResult();
            if (e instanceof DeadObjectException) {
                iPCResult3.resultCode = 201;
                message = "android.os.DeadObjectException";
            } else {
                iPCResult3.resultCode = 200;
                message = e.getMessage();
            }
            iPCResult3.resultMsg = message;
            return iPCResult3;
        }
    }
}
