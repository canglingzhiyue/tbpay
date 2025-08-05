package com.alipay.mobile.common.ipc.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.api.push.BindEventListener;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class BindPushServiceManagerImpl implements BindPushServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PushServiceConnection b;
    private Context c;
    private boolean d;
    private IPCManagerDeathRecipient f;

    /* renamed from: a  reason: collision with root package name */
    private List<BindEventListener> f5399a = new ArrayList(1);
    private String e = null;

    /* loaded from: classes3.dex */
    public class IPCManagerDeathRecipient implements IBinder.DeathRecipient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public IPCManagerDeathRecipient() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                return;
            }
            LogCatUtil.info("IPC_BindPushServiceManager", "IPCManagerDeathRecipient#binderDied");
            BindPushServiceManagerImpl.access$500(BindPushServiceManagerImpl.this);
            BindPushServiceManagerImpl.this.setBindedService(false);
            BindPushServiceManagerImpl.access$600(BindPushServiceManagerImpl.this);
            BindPushServiceManagerImpl.this.bindService();
        }
    }

    public static /* synthetic */ List access$000(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2bf5dbe4", new Object[]{bindPushServiceManagerImpl}) : bindPushServiceManagerImpl.f5399a;
    }

    public static /* synthetic */ IPCManagerDeathRecipient access$100(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPCManagerDeathRecipient) ipChange.ipc$dispatch("5867f7de", new Object[]{bindPushServiceManagerImpl}) : bindPushServiceManagerImpl.e();
    }

    public static /* synthetic */ Context access$200(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3f78efd", new Object[]{bindPushServiceManagerImpl}) : bindPushServiceManagerImpl.d();
    }

    public static /* synthetic */ void access$400(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef9ce07", new Object[]{bindPushServiceManagerImpl});
        } else {
            bindPushServiceManagerImpl.b();
        }
    }

    public static /* synthetic */ void access$500(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804b5d88", new Object[]{bindPushServiceManagerImpl});
        } else {
            bindPushServiceManagerImpl.g();
        }
    }

    public static /* synthetic */ void access$600(BindPushServiceManagerImpl bindPushServiceManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719ced09", new Object[]{bindPushServiceManagerImpl});
        } else {
            bindPushServiceManagerImpl.a();
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void bindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780e543f", new Object[]{this});
            return;
        }
        LogCatUtil.info("IPC_BindPushServiceManager", "bindService");
        try {
            Intent intent = new Intent(d(), Class.forName(f()));
            intent.setPackage(d().getPackageName());
            this.c.bindService(intent, c(), 1);
            LogCatUtil.info("IPC_BindPushServiceManager", "push bind finish");
        } catch (Exception e) {
            LogCatUtil.error("IPC_BindPushServiceManager", e);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public boolean isBindedService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db710d7a", new Object[]{this})).booleanValue() : this.d;
    }

    public void setBindedService(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8aa556", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void unbindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e2086", new Object[]{this});
            return;
        }
        try {
            LogCatUtil.info("IPC_BindPushServiceManager", "unbindService");
            PushServiceConnection c = c();
            if (c.getIpcManager() == null) {
                return;
            }
            synchronized (this) {
                if (c.getIpcManager() == null) {
                    return;
                }
                c.reset();
                d().unbindService(c);
            }
        } catch (Exception e) {
            LogCatUtil.error("IPC_BindPushServiceManager", e);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void addBindEventListener(BindEventListener bindEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f72bc78", new Object[]{this, bindEventListener});
        } else {
            this.f5399a.add(bindEventListener);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindPushServiceManager
    public void removeBindEventListener(BindEventListener bindEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7a9b1b", new Object[]{this, bindEventListener});
        } else {
            this.f5399a.remove(bindEventListener);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int size = BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).size();
                    for (int i = 0; i < size; i++) {
                        try {
                            ((BindEventListener) BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).get(i)).unBinde();
                        } catch (Exception e) {
                            LogCatUtil.error("IPC_BindPushServiceManager", e);
                        }
                    }
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int size = BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).size();
                    for (int i = 0; i < size; i++) {
                        try {
                            ((BindEventListener) BindPushServiceManagerImpl.access$000(BindPushServiceManagerImpl.this).get(i)).binded();
                        } catch (Exception e) {
                            LogCatUtil.error("IPC_BindPushServiceManager", e);
                        }
                    }
                }
            });
        }
    }

    private PushServiceConnection c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PushServiceConnection) ipChange.ipc$dispatch("3dfca7a3", new Object[]{this});
        }
        PushServiceConnection pushServiceConnection = this.b;
        if (pushServiceConnection != null) {
            return pushServiceConnection;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new PushServiceConnection();
            }
        }
        return this.b;
    }

    private Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f183c0e3", new Object[]{this});
        }
        if (this.c == null) {
            this.c = TransportEnvUtil.getContext();
        }
        return this.c;
    }

    private IPCManagerDeathRecipient e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPCManagerDeathRecipient) ipChange.ipc$dispatch("b5a3c4c6", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new IPCManagerDeathRecipient();
        }
        return this.f;
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        if (TransportStrategy.isUseAmnetService()) {
            this.e = "com.alipay.mobile.common.amnet.service.AmnetService";
        } else {
            this.e = "com.alipay.pushsdk.push.NotificationService";
        }
        LogCatUtil.info("IPC_BindPushServiceManager", "[getTargetService] mTargetService: " + this.e);
        return this.e;
    }

    /* loaded from: classes3.dex */
    public class PushServiceConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private IIPCManager f5400a = null;

        public PushServiceConnection() {
        }

        public static /* synthetic */ IIPCManager access$300(PushServiceConnection pushServiceConnection) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IIPCManager) ipChange.ipc$dispatch("a55ad391", new Object[]{pushServiceConnection}) : pushServiceConnection.f5400a;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            this.f5400a = IIPCManager.Stub.asInterface(iBinder);
            try {
                this.f5400a.asBinder().linkToDeath(BindPushServiceManagerImpl.access$100(BindPushServiceManagerImpl.this), 0);
            } catch (RemoteException e) {
                LogCatUtil.error("IPC_BindPushServiceManager", e);
            }
            try {
                NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.ipc.push.BindPushServiceManagerImpl.PushServiceConnection.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            IPCApiFactory.getSingletonIPCContextManager().init(BindPushServiceManagerImpl.access$200(BindPushServiceManagerImpl.this), PushServiceConnection.access$300(PushServiceConnection.this));
                            BindPushServiceManagerImpl.this.setBindedService(true);
                            BindPushServiceManagerImpl.access$400(BindPushServiceManagerImpl.this);
                            LogCatUtil.info("IPC_BindPushServiceManager", "onServiceConnected finish");
                        } catch (Exception e2) {
                            LogCatUtil.error("IPC_BindPushServiceManager", "init ipcContextManager", e2);
                        }
                    }
                });
            } catch (Exception e2) {
                LogCatUtil.error("IPC_BindPushServiceManager", e2);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            if (this.f5400a != null) {
                LogCatUtil.info("IPC_BindPushServiceManager", "onServiceDisconnected ipcManager != null");
            }
            BindPushServiceManagerImpl.access$500(BindPushServiceManagerImpl.this);
            BindPushServiceManagerImpl.access$600(BindPushServiceManagerImpl.this);
            reset();
            BindPushServiceManagerImpl.this.setBindedService(false);
            LogCatUtil.info("IPC_BindPushServiceManager", "onServiceDisconnected finish. ");
            BindPushServiceManagerImpl.this.bindService();
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else {
                this.f5400a = null;
            }
        }

        public IIPCManager getIpcManager() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IIPCManager) ipChange.ipc$dispatch("1d33c90e", new Object[]{this}) : this.f5400a;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            IPCApiFactory.getSingletonIPCContextManager().resetIIPCManager();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
