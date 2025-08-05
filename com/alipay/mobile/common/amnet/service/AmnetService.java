package com.alipay.mobile.common.amnet.service;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetManager;
import com.alipay.mobile.common.amnet.api.AmnetManagerBeanFactory;
import com.alipay.mobile.common.amnet.service.events.ServiceLifeCycleEventManager;
import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.amnet.service.util.TransCtrlConfigHepler;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsInitRunnable;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.APNetworkStartupUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AmnetService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f5372a;
    public boolean shadowMode = false;
    private boolean b = false;

    public static /* synthetic */ Object ipc$super(AmnetService amnetService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1403599891) {
            super.startForeground(((Number) objArr[0]).intValue(), (Notification) objArr[1]);
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 1992651935) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
    }

    public static /* synthetic */ void access$000(AmnetService amnetService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48439c0", new Object[]{amnetService});
        } else {
            amnetService.a();
        }
    }

    public static /* synthetic */ long access$100(AmnetService amnetService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea880513", new Object[]{amnetService})).longValue() : amnetService.b();
    }

    public static /* synthetic */ void access$201(AmnetService amnetService, int i, Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273e42fc", new Object[]{amnetService, new Integer(i), notification});
        } else {
            super.startForeground(i, notification);
        }
    }

    public static /* synthetic */ void access$300(AmnetService amnetService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68f9bdd", new Object[]{amnetService});
        } else {
            amnetService.d();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        LogCatUtil.info("AmnetService", "[onCreate] Enter");
        this.f5372a = getApplicationContext();
        init();
        ServiceLifeCycleEventManager.getInstance().notifyStateChanged(1);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        LogCatUtil.info("AmnetService", "[onStartCommand] Enter");
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        try {
            LogCatUtil.info("AmnetService", "[onBind] Enter");
            return (IBinder) IPCApiFactory.getSingletonIPCManager();
        } catch (Throwable th) {
            try {
                LogCatUtil.error("AmnetService", "[onBind] Exception" + th.toString(), th);
                ServiceLifeCycleEventManager.getInstance().notifyStateChanged(2);
                return null;
            } finally {
                ServiceLifeCycleEventManager.getInstance().notifyStateChanged(2);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LogCatUtil.info("AmnetService", "[onDestroy] Enter");
        ServiceLifeCycleEventManager.getInstance().notifyStateChanged(5);
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ed1273", new Object[]{this, intent});
            return;
        }
        LogCatUtil.info("AmnetService", "[onRebind] Enter");
        ServiceLifeCycleEventManager.getInstance().notifyStateChanged(3);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        LogCatUtil.info("AmnetService", "[onUnbind] Enter");
        ServiceLifeCycleEventManager.getInstance().notifyStateChanged(4);
        return true;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LogCatUtil.info("AmnetService", "[init] Enter");
        initAmnetEvents();
        initTransportEnv();
        APNetworkStartupUtil.notifyNetworkStartupListener();
        initConfigWithStrategy();
        initIpcContext();
        if (!this.shadowMode) {
            c();
        }
        LogCatUtil.info("AmnetService", "[init] Execution finish.");
    }

    public void initAmnetEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f5c2c1", new Object[]{this});
            return;
        }
        getAmnetManager().removeGeneraEventListener(MasterProxyGeneralListener.getInstance());
        getAmnetManager().addGeneraEventListener(MasterProxyGeneralListener.getInstance());
        getAmnetManager().removeRpcAcceptDataListener();
        getAmnetManager().removeSyncAcceptDataListener();
        getAmnetManager().removeSyncDirectAcceptDataListener();
        getAmnetManager().addRpcAcceptDataListener(MasterProxyDataListener.getInstance());
        getAmnetManager().addSyncAcceptDataListener(MasterProxyDataListener.getInstance());
        getAmnetManager().addSyncDirectAcceptDataListener(MasterProxyDataListener.getInstance());
        LogCatUtil.info("AmnetService", "[initAmnetEvents] Execution finish.");
    }

    public void initTransportEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47da48bb", new Object[]{this});
            return;
        }
        try {
            TransportEnvUtil.setContext(getAppContext());
            AmnetEnvHelper.setAppContext(getAppContext());
        } catch (Throwable th) {
            LogCatUtil.error("AmnetService", "[initTransportEnv] Exception: " + th.toString(), th);
        }
    }

    public void initConfigWithStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18752af2", new Object[]{this});
            return;
        }
        TransportConfigureManager.getInstance().updateConfig(getApplicationContext());
        TransportConfigureManager.getInstance().removeConfigureChangedListener(MasterConfigureChangedListener.getInstance());
        TransportConfigureManager.getInstance().addConfigureChangedListener(MasterConfigureChangedListener.getInstance());
        NetworkTunnelStrategy.getInstance().removeNetworkTunnelChangedListener(PushProcAmnetSelfTunnelChangedListener.getInstance());
        NetworkTunnelStrategy.getInstance().addNetworkTunnelChangedListener(PushProcAmnetSelfTunnelChangedListener.getInstance());
        NetworkTunnelStrategy.getInstance().init(getAppContext(), DeviceInfoUtil.getDeviceId());
        ExtTransportTunnelWatchdog.getInstance().pushProcCrashTick(getApplicationContext());
        AmnetServiceLifeCycleListener amnetServiceLifeCycleListener = AmnetServiceLifeCycleListener.getInstance();
        ServiceLifeCycleEventManager.getInstance().removeStateListener(amnetServiceLifeCycleListener);
        ServiceLifeCycleEventManager.getInstance().addStateListener(amnetServiceLifeCycleListener);
        initHttpdns();
        TransCtrlConfigHepler.testNotifyConfigUpdate();
        NetworkTunnelUpgradeManager.lightUp();
        LogCatUtil.info("AmnetService", "[initConfigWithStrategy] Execution finish.");
    }

    public void initIpcContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8d862a", new Object[]{this});
            return;
        }
        try {
            PushIpcHelper.init(getApplicationContext());
            PushIpcHelper.registerDefault();
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetService", "[initIpcContext] Exception: " + th.toString(), th);
        }
        LogCatUtil.info("AmnetService", "[initIpcContext] Execution finish.");
    }

    public void initHttpdns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b59478", new Object[]{this});
        } else if (this.b) {
            LogCatUtil.warn("AmnetService", "[initHttpdns] Inited, return.");
        } else {
            synchronized (this) {
                if (this.b) {
                    LogCatUtil.warn("AmnetService", "[initHttpdns] Sync inited, return.");
                    return;
                }
                this.b = true;
                new AlipayHttpDnsInitRunnable(getApplicationContext(), 0, false).run();
                AlipayHttpDnsClient.getDnsClient().addHttpDnsUpdateObserver(new MasterProxyHttpDnsUpListener());
                NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.AmnetService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AmnetService.access$000(AmnetService.this);
                        }
                    }
                }, 8000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.AmnetService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TransCtrlConfigHepler.startRequestDnsTimer();
                    if (System.currentTimeMillis() - AmnetService.access$100(AmnetService.this) < Long.valueOf(TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.HTTPDNS_REQUEST_INTERVAL)).longValue()) {
                        LogCatUtil.info("HTTP_DNS_NotificationService", "initHttpdns, (System.currentTimeMillis() - reqLastTime) < 10m, return.");
                    } else {
                        AlipayHttpDnsClient.getDnsClient().refreshAll();
                    }
                }
            });
        }
    }

    private long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : SharedPreUtils.getLonggData(this.f5372a, "http_dns_last_time");
    }

    public Context getAppContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[]{this}) : this.f5372a;
    }

    public AmnetManager getAmnetManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetManager) ipChange.ipc$dispatch("813e8c6d", new Object[]{this}) : AmnetManagerBeanFactory.getSingletonAmnetManager();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (Build.VERSION.SDK_INT < 18) {
            startForeground(5768, new Notification());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.AmnetService.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (Build.VERSION.SDK_INT < 24) {
                    z = true;
                }
                if (!z) {
                    LogCatUtil.debug("AmnetService", "LauncherService.onCreate.shouldNotStart");
                    return;
                }
                LogCatUtil.debug("AmnetService", "LauncherService.onCreate.shouldStart");
                AmnetService.access$201(AmnetService.this, 168816883, new Notification());
                if (Build.VERSION.SDK_INT < 18) {
                    return;
                }
                AmnetService.access$300(AmnetService.this);
            }
        }, 5000L);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LogCatUtil.debug("AmnetService", "LauncherService.startInnerService");
        try {
            this.f5372a.startService(new Intent(this.f5372a, InnerService.class));
        } catch (Throwable th) {
            LogCatUtil.error("AmnetService", "startInnerService error");
            LogCatUtil.printError("AmnetService", th);
        }
    }

    /* loaded from: classes3.dex */
    public static class InnerService extends Service {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(InnerService innerService, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1504501726) {
                super.onDestroy();
                return null;
            } else if (hashCode != 413640386) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onCreate();
                return null;
            }
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
            }
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
                return;
            }
            LogCatUtil.debug("AmnetService", "InnerService.onCreate");
            super.onCreate();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
            }
            LogCatUtil.debug("AmnetService", "InnerService.onStartCommand");
            try {
                startForeground(168816883, new Notification());
                LogCatUtil.debug("AmnetService", "InnerService.startForeground: " + Build.VERSION.SDK_INT);
            } catch (Throwable th) {
                LogCatUtil.printError("AmnetService", th);
            }
            try {
                stopSelf();
                LogCatUtil.debug("AmnetService", "InnerService.stopSelf: " + Build.VERSION.SDK_INT);
            } catch (Throwable th2) {
                LogCatUtil.printError("AmnetService", th2);
            }
            return 2;
        }

        @Override // android.app.Service
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            LogCatUtil.debug("AmnetService", "InnerService.onDestroy");
            try {
                stopForeground(true);
                LogCatUtil.debug("AmnetService", "InnerService.stopForeground: " + Build.VERSION.SDK_INT);
            } catch (Throwable th) {
                LogCatUtil.printError("AmnetService", th);
            }
            super.onDestroy();
        }
    }
}
