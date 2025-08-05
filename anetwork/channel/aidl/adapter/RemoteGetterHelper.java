package anetwork.channel.aidl.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import anet.channel.util.ALog;
import anetwork.channel.aidl.IRemoteNetworkGetter;
import anetwork.channel.aidl.NetworkService;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public class RemoteGetterHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.RemoteGetter";
    public static volatile boolean bBindFailed;
    public static volatile boolean bBinding;
    private static ServiceConnection conn;
    public static Handler handler;
    public static volatile IRemoteNetworkGetter mGetter;
    public static volatile CountDownLatch mServiceBindLock;

    static {
        kge.a(1565776688);
        bBindFailed = false;
        bBinding = false;
        mServiceBindLock = null;
        handler = new Handler(Looper.getMainLooper());
        conn = new ServiceConnection() { // from class: anetwork.channel.aidl.adapter.RemoteGetterHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    return;
                }
                if (ALog.isPrintLog(2)) {
                    ALog.i(RemoteGetterHelper.TAG, "ANet_Service Disconnected", null, new Object[0]);
                }
                RemoteGetterHelper.mGetter = null;
                RemoteGetterHelper.bBinding = false;
                if (RemoteGetterHelper.mServiceBindLock == null) {
                    return;
                }
                RemoteGetterHelper.mServiceBindLock.countDown();
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    return;
                }
                if (ALog.isPrintLog(2)) {
                    ALog.i(RemoteGetterHelper.TAG, "[onServiceConnected]ANet_Service start success. ANet run with service mode", null, new Object[0]);
                }
                synchronized (RemoteGetterHelper.class) {
                    RemoteGetterHelper.mGetter = IRemoteNetworkGetter.Stub.asInterface(iBinder);
                    if (RemoteGetterHelper.mServiceBindLock != null) {
                        RemoteGetterHelper.mServiceBindLock.countDown();
                    }
                }
                RemoteGetterHelper.bBindFailed = false;
                RemoteGetterHelper.bBinding = false;
            }
        };
    }

    public static void initRemoteGetterAndWait(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0f6f1e", new Object[]{context, new Boolean(z)});
        } else if (mGetter != null || bBindFailed) {
        } else {
            asyncBindService(context);
            if (bBindFailed || !z) {
                return;
            }
            try {
                synchronized (RemoteGetterHelper.class) {
                    if (mGetter != null) {
                        return;
                    }
                    if (mServiceBindLock == null) {
                        mServiceBindLock = new CountDownLatch(1);
                    }
                    ALog.i(TAG, "[initRemoteGetterAndWait]begin to wait", null, new Object[0]);
                    if (mServiceBindLock.await(NetworkConfigCenter.getServiceBindWaitTime(), TimeUnit.SECONDS)) {
                        ALog.i(TAG, "mServiceBindLock count down to 0", null, new Object[0]);
                    } else {
                        ALog.i(TAG, "mServiceBindLock wait timeout", null, new Object[0]);
                    }
                }
            } catch (InterruptedException unused) {
                ALog.e(TAG, "mServiceBindLock wait interrupt", null, new Object[0]);
            }
        }
    }

    public static IRemoteNetworkGetter getRemoteGetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRemoteNetworkGetter) ipChange.ipc$dispatch("f652f87c", new Object[0]) : mGetter;
    }

    private static void asyncBindService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88dbe705", new Object[]{context});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "[asyncBindService] mContext:" + context + " bBindFailed:" + bBindFailed + " bBinding:" + bBinding, null, new Object[0]);
        }
        if (context == null || bBindFailed || bBinding) {
            return;
        }
        bBinding = true;
        Intent intent = new Intent(context, NetworkService.class);
        intent.setAction(IRemoteNetworkGetter.class.getName());
        intent.addCategory("android.intent.category.DEFAULT");
        boolean z = !context.bindService(intent, conn, 1);
        bBindFailed = z;
        if (z) {
            bBinding = false;
            ALog.e(TAG, "[asyncBindService]ANet_Service start not success. ANet run with local mode!", null, new Object[0]);
        }
        handler.postDelayed(new Runnable() { // from class: anetwork.channel.aidl.adapter.RemoteGetterHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!RemoteGetterHelper.bBinding) {
                } else {
                    RemoteGetterHelper.bBinding = false;
                    ALog.e(RemoteGetterHelper.TAG, "binding service timeout. reset status!", null, new Object[0]);
                }
            }
        }, 10000L);
    }
}
