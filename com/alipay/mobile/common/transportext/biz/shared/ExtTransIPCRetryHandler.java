package com.alipay.mobile.common.transportext.biz.shared;

import android.os.SystemClock;
import com.alipay.mobile.common.ipc.api.IPCException;
import com.alipay.mobile.common.ipc.api.IPCRetryHandler;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.mmtp.BindEventListenerManger;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class ExtTransIPCRetryHandler implements IPCRetryHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f5694a = {"isAmnetActiveted"};

    @Override // com.alipay.mobile.common.ipc.api.IPCRetryHandler
    public boolean retryIPCCall(Method method, Object[] objArr, IPCException iPCException, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a52ef99f", new Object[]{this, method, objArr, iPCException, new Integer(i)})).booleanValue();
        }
        LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. method=[" + method.getName() + "], ipcException=" + iPCException.toString() + ", retryTimes:" + i);
        if (i > 5) {
            LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. retryTimes > 5 , no retry");
            return false;
        } else if (iPCException == null) {
            LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. ipcException == null , no retry");
            return false;
        } else if (iPCException.errorCode == 201) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            BindPushServiceManager bindPushServiceFactory = BindPushServiceManager.BindPushServiceFactory.getInstance();
            bindPushServiceFactory.unbindService();
            BindEventListenerManger.getInstance().waitToUnBinded();
            bindPushServiceFactory.bindService();
            BindEventListenerManger.getInstance().waitToBinded();
            LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. errorCode=DEAD_OBJECT_ERROR,  retry result = " + bindPushServiceFactory.isBindedService() + ", cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            return true;
        } else if (iPCException.errorCode != 2) {
            return false;
        } else {
            BindPushServiceManager bindPushServiceFactory2 = BindPushServiceManager.BindPushServiceFactory.getInstance();
            int i2 = 0;
            while (true) {
                String[] strArr = f5694a;
                if (i2 >= strArr.length) {
                    z = true;
                    break;
                }
                String str = strArr[i2];
                if (str.equals(method.getName())) {
                    LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "[retryIPCCall] No more retry. methodName = " + str);
                    z = false;
                    break;
                }
                i2++;
            }
            if (!z) {
                bindPushServiceFactory2.bindService();
                return true;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            for (int i3 = 0; i3 < 3 && !bindPushServiceFactory2.isBindedService(); i3++) {
                bindPushServiceFactory2.bindService();
                BindEventListenerManger.getInstance().waitToBinded();
            }
            LogCatUtil.info("IPC_ExtTransIPCRetryHandler", "retryIPCCall. errorCode=IPC_NO_BINDER_CODE, retry result = " + bindPushServiceFactory2.isBindedService() + ", cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime2));
            return true;
        }
    }
}
