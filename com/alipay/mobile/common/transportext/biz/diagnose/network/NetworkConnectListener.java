package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transportext.util.NwRigorousNetworkConnReceiver;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetworkConnectListener extends NwRigorousNetworkConnReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static NetworkConnectListener f5666a;

    private NetworkConnectListener(Context context) {
        super(context);
    }

    public static NetworkConnectListener instance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkConnectListener) ipChange.ipc$dispatch("52e89160", new Object[]{context});
        }
        if (f5666a == null) {
            f5666a = new NetworkConnectListener(context);
        }
        return f5666a;
    }

    public static boolean hasInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18c9965a", new Object[0])).booleanValue() : f5666a != null;
    }

    @Override // com.alipay.mobile.common.transportext.util.NwRigorousNetworkConnReceiver
    public void onReceivee(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30528f9d", new Object[]{this, context, intent});
        } else if (context == null) {
            LogCatUtil.warn("DIAGNOSE-LISTENER", "context is null.");
        } else if (!NetworkUtils.isNetworkAvailable(context)) {
            SpeedTestManager.netErrCode = -2;
            LogCatUtil.warn("DIAGNOSE-LISTENER", "network is unavailable.");
        } else {
            synchronized (NetworkCheck.class) {
                if (NetworkCheck.currentState != 1) {
                    LogCatUtil.info("DIAGNOSE-LISTENER", "network change, but already has a detect. this will ignore.");
                    return;
                }
                NetworkCheck.currentState = 2;
                final NetworkCheck networkCheck = new NetworkCheck();
                NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkConnectListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LogCatUtil.info("DIAGNOSE-LISTENER", "network change. begin to check network by Link.");
                        try {
                            networkCheck.checkNetwork();
                        } catch (Throwable th) {
                            try {
                                LogCatUtil.warn("DIAGNOSE-LISTENER", "network change throwable. " + th.toString());
                            } finally {
                                NetworkCheck.currentState = 1;
                            }
                        }
                    }
                });
            }
        }
    }
}
