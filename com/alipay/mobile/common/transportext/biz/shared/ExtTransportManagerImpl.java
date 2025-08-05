package com.alipay.mobile.common.transportext.biz.shared;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportClient;
import com.alipay.mobile.common.transport.ext.MainProcConfigListenService;
import com.alipay.mobile.common.transport.httpdns.ipc.MainProcReloadDnsService;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.api.ExtTransportManager;
import com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkCheck;
import com.alipay.mobile.common.transportext.biz.httpdns.MainProcReloadDnsServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.BindEventListenerManger;
import com.alipay.mobile.common.transportext.biz.mmtp.MMTPTransportManager;
import com.alipay.mobile.common.transportext.biz.mmtp.MainProcNetInfoReceiver;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalTunnelManager;
import com.alipay.mobile.common.transportext.biz.shared.config.MainProcConfigListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.shared.config.SharedSwitchChangedListener;
import com.alipay.mobile.common.transportext.biz.shared.spdy.SpdyAvalibleObservable;
import com.alipay.mobile.common.transportext.biz.sync.SyncSpdyAvalibleListener;
import com.alipay.mobile.common.transportext.biz.sync.SyncTunnelChgListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ExtTransportManagerImpl extends ExtTransportManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f5696a;
    private ExtTransportManager b;
    private ExtTransportManager c;
    private ExtTransAppVisibleReceiver e;
    private boolean d = false;
    private volatile boolean f = true;
    private boolean g = true;

    public static /* synthetic */ Object ipc$super(ExtTransportManagerImpl extTransportManagerImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerAdapter, com.alipay.mobile.common.transportext.api.ExtTransportManager
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.d) {
        } else {
            this.d = true;
            this.f5696a = context;
            ExtTransportEnv.setAppContext(this.f5696a);
            a(context);
            NwSharedSwitchUtil.addSwitchChangedListener(new SharedSwitchChangedListener());
            h();
            SpdyAvalibleObservable.getInstance().addSpdyAvalibleListener(new SyncSpdyAvalibleListener());
            NetworkCheck.initNetworkCheck(this.f5696a);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (MiscUtils.isOtherProcess(context)) {
            LogCatUtil.info("ExtTransportManagerImpl", "init.  Other process don't first init transportManager");
        } else {
            initTransportManager(context);
            i();
            f();
            e();
            g();
            bindService();
            MainProcNetInfoReceiver.getInstance(this.f5696a).register();
        }
    }

    public void initTransportManager(Context context) {
        ExtTransportManager spdyTransportManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c2382d", new Object[]{this, context});
        } else if (MiscUtils.isOtherProcess(context)) {
            LogCatUtil.info("ExtTransportManagerImpl", "init.  Other process don't first init transportManager");
        } else {
            getMMTPTransportManager().init(context);
            if (NetworkTunnelStrategy.getInstance().isCanUseAmnet() || !NetworkTunnelStrategy.getInstance().isCanUseSpdy() || (spdyTransportManager = getSpdyTransportManager()) == null) {
                return;
            }
            spdyTransportManager.init(context);
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerAdapter, com.alipay.mobile.common.transportext.api.ExtTransportManager
    public ExtTransportClient getExtTransportClient(Context context, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportClient) ipChange.ipc$dispatch("a5b8e4cb", new Object[]{this, context, transportContext});
        }
        init(context);
        ExtTransportStrategy.configInit(context, transportContext);
        if (transportContext.currentReqInfo == null || !transportContext.currentReqInfo.use) {
            if (!MiscUtils.isDebugger(context)) {
                return null;
            }
            LogCatUtil.debug("ExtTransportManagerImpl", "getExtTransportClient.   transportContext.currentReqInfo == null || transportContext.currentReqInfo.use == false. return null.");
            return null;
        }
        ExtTransportClient a2 = a(context, transportContext);
        fillCurrentReqInfo(transportContext, a2);
        return a2;
    }

    public void fillCurrentReqInfo(TransportContext transportContext, ExtTransportClient extTransportClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c594e8a2", new Object[]{this, transportContext, extTransportClient});
        } else if (extTransportClient == null) {
        } else {
            if (extTransportClient.getModuleCategory() == 0) {
                transportContext.currentReqInfo.protocol = "spdy";
            } else {
                transportContext.currentReqInfo.protocol = ExtTransportStrategy.EXT_PROTO_MRPC;
            }
        }
    }

    private ExtTransportClient a(Context context, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportClient) ipChange.ipc$dispatch("dffc7b43", new Object[]{this, context, transportContext});
        }
        if (2 == transportContext.choseExtLinkType) {
            ExtTransportManager spdyTransportManager = getSpdyTransportManager();
            if (NetworkTunnelStrategy.getInstance().isCanUseSpdy() && spdyTransportManager != null) {
                return spdyTransportManager.getExtTransportClient(context, transportContext);
            }
            return null;
        } else if (4 == transportContext.choseExtLinkType && AmnetLocalTunnelManager.getInstance().isCanLocalAmnet()) {
            transportContext.transportByLocalAmnet = true;
            return getMMTPTransportManager().getExtTransportClient(context, transportContext);
        } else {
            ExtTransportManager a2 = a();
            if (a2 != null) {
                return a2.getExtTransportClient(context, transportContext);
            }
            return null;
        }
    }

    public ExtTransportManager getMMTPTransportManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportManager) ipChange.ipc$dispatch("a6357967", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new MMTPTransportManager();
        }
        return this.c;
    }

    public ExtTransportManager getSpdyTransportManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExtTransportManager) ipChange.ipc$dispatch("c01bc79d", new Object[]{this}) : this.b;
    }

    private ExtTransportManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportManager) ipChange.ipc$dispatch("4751aa32", new Object[]{this});
        }
        ExtTransportManager c = c();
        if (c != null) {
            return c;
        }
        ExtTransportManager b = b();
        if (b != null) {
            return b;
        }
        d();
        if (AmnetHelper.isAmnetActivite()) {
            ExtTransportTunnelWatchdog.getInstance().mrpcFailureRest();
            return getMMTPTransportManager();
        }
        LogCatUtil.info("ExtTransportManagerImpl", "[getExtRpcManager] isAmnetActivite==false");
        ExtTransportTunnelWatchdog.getInstance().mrpcFailureTick();
        return null;
    }

    private ExtTransportManager b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportManager) ipChange.ipc$dispatch("231325f3", new Object[]{this});
        }
        if (!AmnetLocalTunnelManager.getInstance().isCanLocalAmnet()) {
            LogCatUtil.info("ExtTransportManagerImpl", "[getLocalMMTPTransportManager] Can not use local amnet");
            return null;
        }
        TransportContext value = TransportContextThreadLocalUtils.getValue();
        if (TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
            value.transportByLocalAmnet = true;
            LogCatUtil.info("ExtTransportManagerImpl", "[getLocalMMTPTransportManager] network run single process, use local amnet.");
            return getMMTPTransportManager();
        } else if (value.urgentFlag && !AmnetHelper.isBinded()) {
            value.transportByLocalAmnet = true;
            LogCatUtil.info("ExtTransportManagerImpl", "[getLocalMMTPTransportManager] urgent rpc, use local amnet.");
            return getMMTPTransportManager();
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            value.transportByLocalAmnet = true;
            LogCatUtil.info("ExtTransportManagerImpl", "[getLocalMMTPTransportManager] Can't use amnet, hit local ament.");
            return getMMTPTransportManager();
        } else if (ExtTransportTunnelWatchdog.getInstance().isDowngraded()) {
            value.transportByLocalAmnet = true;
            AmnetLocalTunnelManager.getInstance().startCheck();
            LogCatUtil.info("ExtTransportManagerImpl", "[getLocalMMTPTransportManager] Downgraded, can't use amnet, hit local ament.");
            return getMMTPTransportManager();
        } else if (!AmnetHelper.isBinded()) {
            value.transportByLocalAmnet = true;
            LogCatUtil.info("ExtTransportManagerImpl", "[getLocalMMTPTransportManager] Hit local ament.");
            return getMMTPTransportManager();
        } else {
            if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                LogCatUtil.info("ExtTransportManagerImpl", "[getLocalMMTPTransportManager] Local amnet preconditions are not met.");
            }
            return null;
        }
    }

    private ExtTransportManager c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportManager) ipChange.ipc$dispatch("fed4a1b4", new Object[]{this});
        }
        if (NetworkTunnelStrategy.getInstance().isCanUseAmnet() || AmnetLocalTunnelManager.getInstance().isCanLocalAmnet() || !NetworkTunnelStrategy.getInstance().isCanUseSpdy()) {
            return null;
        }
        return getSpdyTransportManager();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
        } finally {
            try {
                this.f = false;
                LogCatUtil.info("ExtTransportManagerImpl", " awaitAmnetActivation finish ");
            } finally {
            }
        }
        if (MiscUtils.isOtherProcess(this.f5696a)) {
            LogCatUtil.warn("ExtTransportManagerImpl", "[awaitAmnetActivation] Other process don't awaitAmnetActivation");
        } else if (!AmnetHelper.isAmnetActivite()) {
            if (!this.f) {
                return;
            }
            synchronized (this) {
                LogCatUtil.info("ExtTransportManagerImpl", " start awaitAmnetActivation ");
                if (!this.f) {
                    LogCatUtil.info("ExtTransportManagerImpl", "[awaitAmnetActivation] Waiting to expire.");
                } else if (!AmnetHelper.isAmnetActivite()) {
                    for (int i = 0; this.f && !AmnetHelper.isAmnetActivite() && i < 10; i++) {
                        try {
                            LogCatUtil.info("ExtTransportManagerImpl", "[awaitAmnetActivation] isAmnetActivite==false await...");
                            ExtTransportTunnelWatchdog.getInstance().mrpcFailureTick();
                        } catch (Throwable th) {
                            LogCatUtil.warn("ExtTransportManagerImpl", "[awaitAmnetActivation] mrpcFailureTick exception:" + th.toString());
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Throwable th2) {
                            LogCatUtil.warn("ExtTransportManagerImpl", "[awaitAmnetActivation] sleep exception:" + th2.toString());
                        }
                    }
                    this.f = false;
                    LogCatUtil.info("ExtTransportManagerImpl", " awaitAmnetActivation finish ");
                }
            }
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerAdapter, com.alipay.mobile.common.transportext.api.ExtTransportManager
    public boolean isInited() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue() : this.d;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (MiscUtils.isOtherProcess(this.f5696a)) {
            LogCatUtil.info("ExtTransportManagerImpl", "init.  Other process don't setIPCRetryHandler");
        } else {
            try {
                IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().setIPCCallRetryHandler(new ExtTransIPCRetryHandler());
                IPCApiFactory.getSingletonIPCContextManager().getLocalCallManager().setLocalCallRetryHandler(new ExtTransLocalCallRetryHandler());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        NetworkTunnelStrategy.getInstance().addNetworkTunnelChangedListener((NetworkTunnelChangedListener) NetBeanFactory.getBean(ExtTunnelChgListener.class));
        NetworkTunnelStrategy.getInstance().addNetworkTunnelChangedListener((NetworkTunnelChangedListener) NetBeanFactory.getBean(SyncTunnelChgListener.class));
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ServiceBeanManager singletonServiceBeanManager = IPCApiFactory.getSingletonServiceBeanManager();
        singletonServiceBeanManager.register(MainProcConfigListenService.class.getName(), MainProcConfigListenServiceImpl.getInstance());
        singletonServiceBeanManager.register(MainProcReloadDnsService.class.getName(), new MainProcReloadDnsServiceImpl());
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.e != null) {
        } else {
            this.e = new ExtTransAppVisibleReceiver();
            this.e.regiester();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (MiscUtils.isOtherProcess(this.f5696a)) {
            LogCatUtil.info("ExtTransportManagerImpl", "init.  Other process don't execute 'regProcBindedEvent'");
        } else {
            BindPushServiceManager.BindPushServiceFactory.getInstance().addBindEventListener(BindEventListenerManger.getInstance());
            LogCatUtil.info("ExtTransportManagerImpl", "regProcBindedEvent finish");
        }
    }

    public void bindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780e543f", new Object[]{this});
            return;
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 2) {
            LogCatUtil.info("ExtTransportManagerImpl", " Don't start push process ahead of time. cpu proc = " + availableProcessors);
        } else if (TransportStrategy.isNetworkRunInSingleProcess(ExtTransportEnv.getAppContext())) {
            LogCatUtil.info("ExtTransportManagerImpl", "network run in single process,do not start push process");
        } else {
            BindPushServiceManager bindPushServiceFactory = BindPushServiceManager.BindPushServiceFactory.getInstance();
            if (bindPushServiceFactory.isBindedService()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bindPushServiceFactory.bindService();
            LogCatUtil.info("ExtTransportManagerImpl", "Invoked bindService, cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }
}
