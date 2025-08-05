package com.alipay.mobile.common.amnet.service.util;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CourierServiceConnection implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            return;
        }
        LogCatUtil.info("CourierServiceConnection", "[onServiceConnected] bind success.");
        try {
            TransportEnvUtil.getContext().unbindService(this);
        } catch (Throwable th) {
            LogCatUtil.warn("CourierServiceConnection", "[onServiceConnected] unbind service exception = " + th.toString());
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            return;
        }
        LogCatUtil.info("CourierServiceConnection", "[onServiceDisconnected] disconnect success.");
        try {
            TransportEnvUtil.getContext().unbindService(this);
        } catch (Throwable th) {
            LogCatUtil.warn("CourierServiceConnection", "[onServiceDisconnected] unbind service exception = " + th.toString());
        }
    }
}
