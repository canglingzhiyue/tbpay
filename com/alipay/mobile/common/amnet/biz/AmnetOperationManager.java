package com.alipay.mobile.common.amnet.biz;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.bifrost.StnLogicICallBackImpl;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetLoggerListener;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsEventManager;
import com.alipay.mobile.common.amnet.api.configs.AmnetRpcGlobalParamConfigHelper;
import com.alipay.mobile.common.amnet.api.exception.AmnetException;
import com.alipay.mobile.common.amnet.api.model.ActivatingParams;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.AppEvent;
import com.alipay.mobile.common.amnet.api.model.AskConnStateCallback;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.amnet.api.monitor.TrafficMonitorService;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.alipay.mobile.common.amnet.biz.inner.AmnetNetInfoReceiver;
import com.alipay.mobile.common.amnet.biz.inner.NetTestAdapter;
import com.alipay.mobile.common.amnet.biz.inner.PermissionBroadcastReceiver;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.config.UserNetworkPreferencesManager;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.Transport;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.riy;

/* loaded from: classes3.dex */
public class AmnetOperationManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AMNET_HOST = "mygw.alipay.com";
    public static final String AMNET_HOST_SHORT = "mygwshort.alipay.com";
    public static final String AMNET_PORT = "443";
    public static final String AMNET_PORT_SHORT = "80";
    public static final String AMNET_RC_HOST = "mygwrc.alipay.com";
    public static final String H2_HOST = "myh2.alipay.com";
    public static final String H2_PORT = "443";
    private static boolean c = true;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5363a = false;
    private long b = -1;
    private Set<Long> d = Collections.synchronizedSet(new HashSet());
    private StnLogicHttpDnsCallbackImpl e = new StnLogicHttpDnsCallbackImpl();

    /* loaded from: classes3.dex */
    public class StnLogicHttpDnsCallbackImpl implements StnLogicICallBackImpl.HttpDnsCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public StnLogicHttpDnsCallbackImpl() {
        }

        @Override // com.alipay.bifrost.StnLogicICallBackImpl.HttpDnsCallback
        public String httpDns(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96ecb78e", new Object[]{this, str}) : AmnetOperationManager.access$100(AmnetOperationManager.this, str);
        }
    }

    public String getAmnetShortAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("912d0926", new Object[]{this}) : "mygwshort.alipay.com:80";
    }

    public static /* synthetic */ boolean access$002(AmnetOperationManager amnetOperationManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("545f9f7f", new Object[]{amnetOperationManager, new Boolean(z)})).booleanValue();
        }
        amnetOperationManager.f5363a = z;
        return z;
    }

    public static /* synthetic */ String access$100(AmnetOperationManager amnetOperationManager, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("509f831e", new Object[]{amnetOperationManager, str}) : amnetOperationManager.a(str);
    }

    public Set<Long> getRpcidSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d273a22e", new Object[]{this}) : this.d;
    }

    public final Transport getAmnetTransport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transport) ipChange.ipc$dispatch("be8ee7c6", new Object[]{this}) : Transport.instance();
    }

    public final void reconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61e9c5e", new Object[]{this});
            return;
        }
        Transport.Activating activating = new Transport.Activating();
        if (!a(activating, true, false)) {
            return;
        }
        getAmnetTransport().activate(activating, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.common.transportext.Transport.Result
            public void notify(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                    return;
                }
                LogCatUtil.debug("AmnetOperationManager", "ReConnection result=[" + z + riy.ARRAY_END_STR);
            }
        });
    }

    public final void activateAmnet(final AmnetResult amnetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0103e7", new Object[]{this, amnetResult});
            return;
        }
        LogCatUtil.info("AmnetOperationManager", " AmnetHelper begin init. activated=" + this.f5363a);
        if (c) {
            c = false;
            TransportConfigureManager.getInstance().addConfigureChangedListener(AmnetSwitchManagerImpl.getInstance().getConfigureChangedListener());
            AmnetTunnelManager.getInstance().procActivateTick();
            ((AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class)).asyncNotifyBeforeFirstAmnetActivation();
        }
        final boolean canUseBifrost = AmnetTunnelManager.getInstance().canUseBifrost();
        if (this.f5363a) {
            if (amnetResult != null) {
                NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            amnetResult.notifyResult(true);
                        }
                    }
                });
            }
            LogCatUtil.warn("AmnetOperationManager", "activateAmnet break, cause activated is true");
            return;
        }
        Transport.Activating activating = new Transport.Activating();
        if (!a(activating, false, canUseBifrost)) {
            if (amnetResult == null) {
                return;
            }
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        amnetResult.notifyResult(false);
                    }
                }
            });
            return;
        }
        AmnetGeneralEventManagerImpl amnetGeneralEventManagerImpl = (AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class);
        AmnetMonitorLoggerListener amnetMonitorLoggerListener = (AmnetMonitorLoggerListener) NetBeanFactory.getBean(AmnetMonitorLoggerListener.class);
        amnetGeneralEventManagerImpl.removeGeneraEventListener(amnetMonitorLoggerListener);
        amnetGeneralEventManagerImpl.addGeneraEventListener(amnetMonitorLoggerListener);
        PermissionBroadcastReceiver.registerBroadcast(AmnetEnvHelper.getAppContext());
        final AmnetLoggerListener amnetLoggerListener = (AmnetLoggerListener) NetBeanFactory.getBean(AmnetLoggerListener.class);
        if (!amnetLoggerListener.listened) {
            getAmnetTransport().register(amnetLoggerListener, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    if (z) {
                        amnetLoggerListener.listened = true;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "register  AmnetLoggerListener result=[" + z + riy.ARRAY_END_STR);
                }
            });
        }
        try {
            this.b = System.currentTimeMillis();
            getAmnetTransport().activate(activating, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    if (z) {
                        if (canUseBifrost) {
                            AmnetTunnelManager.getInstance().setState(2);
                        } else {
                            AmnetTunnelManager.getInstance().setState(1);
                        }
                        AmnetOperationManager.access$002(AmnetOperationManager.this, true);
                        LogCatUtil.debug("AmnetOperationManager", "activateAmnet,activated is true");
                        AmnetNetInfoReceiver.start();
                    } else {
                        AmnetTunnelManager.getInstance().setState(0);
                        AmnetOperationManager.access$002(AmnetOperationManager.this, false);
                        LogCatUtil.debug("AmnetOperationManager", "activateAmnet,activated is false");
                    }
                    ((AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class)).asyncNotifyAfterAmnetActivation(z);
                    amnetResult.notifyResult(z);
                    LogCatUtil.debug("AmnetOperationManager", "Connection result=[" + z + riy.ARRAY_END_STR);
                }
            });
            LogCatUtil.info("AmnetOperationManager", " AmnetHelper end init. url = " + activating.domainLongLink);
            TrafficMonitorService.getInstance().setScene(TrafficMonitorService.SCENE_APP_START);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "activate error", th);
            throw new AmnetException("activate error", th);
        }
    }

    public boolean isInForegound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f46c5923", new Object[]{this})).booleanValue();
        }
        Transport.Activating activating = new Transport.Activating();
        setWalletProcState(activating);
        return activating.master && activating.ground && activating.screen;
    }

    public void setWalletProcState(Transport.Activating activating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113440c2", new Object[]{this, activating});
            return;
        }
        Map<String, String> walletProcState = MiscUtils.getWalletProcState(AmnetEnvHelper.getAppContext());
        try {
            if (StringUtils.equals(walletProcState.get("top"), "true")) {
                activating.ground = true;
            }
        } catch (Throwable unused) {
        }
        try {
            if (StringUtils.equals(walletProcState.get(MiscUtils.KEY_RUNNING), "true")) {
                activating.master = true;
            }
        } catch (Throwable unused2) {
        }
        if (!MiscUtils.isScreenOn(AmnetEnvHelper.getAppContext())) {
            return;
        }
        activating.screen = true;
    }

    public final void shutdownAmnet(final AmnetResult amnetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d01e3e4", new Object[]{this, amnetResult});
        } else {
            getAmnetTransport().inactivate(1L, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "shutdown amnet result=[" + z + riy.ARRAY_END_STR);
                    if (z) {
                        AmnetTunnelManager.getInstance().setState(0);
                        AmnetOperationManager.access$002(AmnetOperationManager.this, false);
                        LogCatUtil.debug("AmnetOperationManager", "shutdownAmnet,activated is false");
                        ((AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class)).resetConnState();
                    }
                    amnetResult.notifyResult(z);
                }
            });
        }
    }

    public final void post(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad854cc", new Object[]{this, amnetPost});
            return;
        }
        a(amnetPost);
        final Transport.Posting posting = new Transport.Posting();
        posting.body = amnetPost.body;
        posting.channel = amnetPost.channel;
        posting.id = 1L;
        posting.receipt = amnetPost.reqSeqId;
        posting.secret = amnetPost.secret;
        posting.important = amnetPost.important;
        posting.nearing = !amnetPost.toBizSys;
        posting.stamp = amnetPost.ts;
        posting.params = amnetPost.params;
        posting.multiplex = amnetPost.multiplex;
        posting.isUrgent = amnetPost.isUrgent;
        a(amnetPost, posting);
        posting.header = amnetPost.header;
        try {
            getAmnetTransport().post(posting, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "post result=[" + z + "] channel=[" + ((int) posting.channel) + "] receipt=[" + posting.receipt + "] important=[" + posting.important + riy.ARRAY_END_STR);
                }
            });
            LogCatUtil.debug("AmnetOperationManager", "finish post. ");
        } catch (Throwable th) {
            if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.error("AmnetOperationManager", "post error", th);
            }
            throw new AmnetException("post error", th);
        }
    }

    private void a(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268a2776", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            if (amnetPost.header != null && !amnetPost.header.isEmpty()) {
                posting.fwdip = amnetPost.header.get(AmnetPost.MMTP_EXT_FORWARD_IP);
                amnetPost.header.remove(AmnetPost.MMTP_EXT_FORWARD_IP);
                b(amnetPost, posting);
                c(amnetPost, posting);
                d(amnetPost, posting);
                a(posting, amnetPost);
                a(posting);
                e(amnetPost, posting);
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processTransportInnerHeaders ex:" + th.toString());
        }
    }

    private void a(Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8854c8fb", new Object[]{this, posting});
            return;
        }
        try {
            if (!AmnetTunnelManager.getInstance().isInBifrostStdH2Model() || !TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
                return;
            }
            posting.multiplex = true;
            LogCatUtil.info("AmnetOperationManager", "[setMultiplexParam4Taobao] set post by multiplex=============");
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "setMultiplexParam4Taobao ex:" + th.toString());
        }
    }

    private void b(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2335595", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            String str = amnetPost.header.get(HeaderConstant.HEADER_KEY_PARAM_TRACEID);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            LogCatUtil.debug("AmnetOperationManager", "TRACEID:" + str);
            posting.traceid = str;
            if (amnetPost.channel != 1) {
                return;
            }
            amnetPost.header.remove(HeaderConstant.HEADER_KEY_PARAM_TRACEID);
            this.d.add(Long.valueOf(amnetPost.reqSeqId));
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processTraceid ex:" + th.toString());
        }
    }

    public void setBindHost(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb73522", new Object[]{this, str, str2});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] domain si null.");
                return;
            }
            LogCatUtil.info("AmnetOperationManager", "[setBindHost] Enter. domain = " + str + ", hostInfo = " + str2);
            if (!isActivated()) {
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] No activated");
            } else if (!AmnetTunnelManager.getInstance().isNowUseBifrost()) {
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] No activated");
            } else {
                if (str2 == null) {
                    str2 = "";
                }
                StnLogic.setDebugIP(str, str2);
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] Finished. domain = " + str + ", hostInfo = " + str2);
            }
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetOperationManager", "[setBindHost] Exception: " + th.toString(), th);
        }
    }

    private void a(Transport.Posting posting, AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3143cea0", new Object[]{this, posting, amnetPost});
        } else if (amnetPost.header == null) {
        } else {
            String str = amnetPost.header.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE);
            if (!AmnetRpcGlobalParamConfigHelper.isIndependentChannel(str)) {
                return;
            }
            if (posting.params == null) {
                posting.params = new HashMap(2);
            }
            posting.multiplex = true;
            LogCatUtil.info("AmnetOperationManager", "[setMultiplexParamByGlobalParamConfig] set post by multiplex,  operationType:" + str);
        }
    }

    private void c(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddc83b4", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            if (!AmnetSwitchManagerImpl.getInstance().isEnableZstd()) {
                return;
            }
            String str = amnetPost.header.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE);
            if (StringUtils.isEmpty(str) || amnetPost.channel != 1 || !TransportStrategy.isSupportZstd(str)) {
                return;
            }
            int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.ZSTD_TOPLIMIT);
            if (posting.body != null && posting.body.length > intValue) {
                LogCatUtil.warn("AmnetOperationManager", "zstd toplimit:" + intValue + " , now:" + posting.body.length);
                return;
            }
            amnetPost.header.put(AmnetConstant.KEY_SUPPORT_ZSTD, AmnetConstant.VAL_SUPPORT_ZSTD);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processZstd ex:" + th.toString());
        }
    }

    private void d(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5985b1d3", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            String str = amnetPost.header.get(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            if (StringUtils.equals(str, "1")) {
                posting.multiplex = true;
            }
            amnetPost.header.remove(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processMultiplexLinkByRequestHeader ex:" + th.toString());
        }
    }

    public final Map<String, String> postWithResult(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e060064", new Object[]{this, amnetPost});
        }
        post(amnetPost);
        HashMap hashMap = new HashMap(1);
        if (amnetPost.channel == 1) {
            hashMap.put(RPCDataItems.IPC_TIME1, String.valueOf(amnetPost.ipcM2p));
        }
        return hashMap;
    }

    public void notifyAppEvent(AppEvent appEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6869b8", new Object[]{this, appEvent});
        } else if (!isActivated()) {
            LogCatUtil.info("AmnetOperationManager", "notifyAppEvent. It's not active amnet. status=[" + appEvent.status + riy.ARRAY_END_STR);
        } else {
            final Transport.Altering a2 = a(appEvent);
            try {
                getAmnetTransport().alter(a2, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.common.transportext.Transport.Result
                    public void notify(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("notifyAppEvent. result=[");
                        sb.append(z);
                        sb.append("] status=[");
                        sb.append(a2.status);
                        sb.append("] infMajor=[");
                        sb.append(a2.infMajor);
                        sb.append("]  infMinor=[");
                        sb.append(a2.infMinor != null ? a2.infMinor : " no exist");
                        sb.append(riy.ARRAY_END_STR);
                        LogCatUtil.info("AmnetOperationManager", sb.toString());
                    }
                });
            } catch (Throwable th) {
                if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                    LogCatUtil.error("AmnetOperationManager", "notifyAppEvent error", th);
                }
                throw new AmnetException("notifyAppEvent error", th);
            }
        }
    }

    public void notifyRespResult(ResultFeedback resultFeedback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe0103b", new Object[]{this, resultFeedback});
            return;
        }
        try {
            Transport.Alerting alerting = new Transport.Alerting();
            alerting.id = resultFeedback.id;
            alerting.duration = resultFeedback.duration;
            alerting.receipt = resultFeedback.receipt;
            getAmnetTransport().alert(alerting, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z2)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "notifyRespResult result=[" + z2 + riy.ARRAY_END_STR);
                }
            });
            if (alerting.receipt < 0) {
                return;
            }
            AmnetTunnelManager amnetTunnelManager = AmnetTunnelManager.getInstance();
            if (alerting.duration >= 0) {
                z = false;
            }
            amnetTunnelManager.processRpcResult(z);
            this.d.remove(Long.valueOf(alerting.receipt));
        } catch (Throwable th) {
            if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.error("AmnetOperationManager", "notifyRespResult error", th);
            }
            throw new AmnetException("notifyRespResult error", th);
        }
    }

    public boolean isActivated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e27854d2", new Object[]{this})).booleanValue() : this.f5363a;
    }

    public void askConnState(final AskConnStateCallback askConnStateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd683056", new Object[]{this, askConnStateCallback});
        } else if (!isActivated()) {
            LogCatUtil.info("AmnetOperationManager", "askConnState. It's not active amnet.");
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AmnetTunnelManager.getInstance().isStateIdle()) {
                        askConnStateCallback.callback(-1);
                    } else {
                        askConnStateCallback.callback(-2);
                    }
                }
            });
        } else {
            Transport.Asking asking = new Transport.Asking() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Asking
                public void answer(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea99665e", new Object[]{this, new Integer(i)});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetOperationManager", "askConnState callbak state=" + i);
                    askConnStateCallback.callback(i);
                }
            };
            asking.id = 1L;
            getAmnetTransport().ask(asking, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                    } else if (z) {
                    } else {
                        LogCatUtil.printInfo("AmnetOperationManager", "askConnState callbak fail");
                        askConnStateCallback.callback(-1);
                    }
                }
            });
        }
    }

    public String getAmnetAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f96ad560", new Object[]{this});
        }
        if (MiscUtils.isSandboxChannel()) {
            return getAmnetAddressForSandbox();
        }
        if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
            return TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MMTP_URL);
        }
        return MiscUtils.isRCVersion(AmnetEnvHelper.getAppContext()) ? "mygwrc.alipay.com:443" : "mygw.alipay.com:443";
    }

    public String getAmnetAddressForSandbox() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7365582", new Object[]{this});
        }
        String amnetServerAddressFromMetaData = MiscUtils.getAmnetServerAddressFromMetaData();
        return !StringUtils.isEmpty(amnetServerAddressFromMetaData) ? amnetServerAddressFromMetaData : "mygw.alipaydev.com:8000";
    }

    public String getAmnetDnsInfos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc16dc22", new Object[]{this}) : a(getAmnetHost());
    }

    public String getAmnetDnsInfosForShort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c14c3af", new Object[]{this}) : a(AMNET_HOST_SHORT);
    }

    public String getAmnetDnsInfoForMultiplex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae09715e", new Object[]{this}) : a(getH2Host());
    }

    public String getAmnetHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e11656", new Object[]{this});
        }
        String amnetAddress = getAmnetAddress();
        return amnetAddress.substring(0, amnetAddress.indexOf(":"));
    }

    public String getAmnetShortHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3af2e850", new Object[]{this});
        }
        String amnetShortAddress = getAmnetShortAddress();
        return amnetShortAddress.substring(0, amnetShortAddress.indexOf(":"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getH2Address() {
        String str = "AmnetOperationManager";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1de2e265", new Object[]{this});
        }
        String str2 = "";
        try {
            if (MiscUtils.isInAlipayClient(AmnetEnvHelper.getAppContext()) && !TransportStrategy.isEnabledOnlyUseBifrostH2(AmnetEnvHelper.getAppContext())) {
                if (!MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                    return "myh2.alipay.com:443";
                }
                str2 = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_H2_URL);
                boolean isEmpty = StringUtils.isEmpty(str2);
                str = isEmpty;
                if (isEmpty != 0) {
                    return "myh2.alipay.com:443";
                }
            } else {
                String a2 = a();
                try {
                    if (!MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                        return a2;
                    }
                    str2 = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_H2_URL);
                    if (StringUtils.isEmpty(str2)) {
                        return a2;
                    }
                    LogCatUtil.info(str, "[getH2Address] From transport configure url = " + str2);
                    str = str;
                } catch (Throwable th) {
                    str2 = a2;
                    th = th;
                    LogCatUtil.error(str, th);
                    return str2;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return str2;
    }

    public String getH2Host() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e62af71", new Object[]{this});
        }
        String h2Address = getH2Address();
        return h2Address.substring(0, h2Address.indexOf(":"));
    }

    private void a(Transport.Activating activating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5534303", new Object[]{this, activating});
            return;
        }
        try {
            Context appContext = AmnetEnvHelper.getAppContext();
            AppEvent convert2AppEvent = OutEventNotifyManagerImpl.convert2AppEvent(true, NetworkUtils.getNetworkType(appContext), ConnectionUtil.getConnType(appContext));
            activating.netMajor = convert2AppEvent.major;
            activating.netMinor = convert2AppEvent.minor;
        } catch (Exception e) {
            LogCatUtil.error("AmnetOperationManager", e);
        }
    }

    public void detect(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63780647", new Object[]{this, amnetNetworkDiagnoseListener});
            return;
        }
        Transport.Detecting detecting = new Transport.Detecting();
        detecting.id = 1L;
        detecting.report = new NetTestAdapter(amnetNetworkDiagnoseListener);
        getAmnetTransport().detect(detecting, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.common.transportext.Transport.Result
            public void notify(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                    return;
                }
                LogCatUtil.info("AmnetOperationManager", "detect result=[" + z + "] ");
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private final boolean a(com.alipay.mobile.common.transportext.Transport.Activating r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.a(com.alipay.mobile.common.transportext.Transport$Activating, boolean, boolean):boolean");
    }

    private void a(ActivatingParams activatingParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c117051c", new Object[]{this, activatingParams});
        } else {
            AmnetSetActivatingParamsEventManager.getInstance().onAfterSetActivatingParamsEvent(activatingParams);
        }
    }

    private void b(Transport.Activating activating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5312bb04", new Object[]{this, activating});
            return;
        }
        Map<String, Pair<String, Integer>> allBindHostPairs = UserNetworkPreferencesManager.getInstance().getAllBindHostPairs();
        if (allBindHostPairs == null || allBindHostPairs.isEmpty()) {
            return;
        }
        LogCatUtil.info("AmnetOperationManager", "[setBindedHostsInfo2Activating] allBindHostPairs len : " + allBindHostPairs.size());
        activating.addExtParam(Baggage.Amnet.KEY_BIND_HOSTS, allBindHostPairs);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            String gwfurl = ReadSettingServerUrl.getInstance().getGWFURL(AmnetEnvHelper.getAppContext());
            if (StringUtils.isEmpty(gwfurl)) {
                return "";
            }
            URL url = new URL(gwfurl);
            String host = url.getHost();
            int port = url.getPort();
            String protocol = url.getProtocol();
            if (port < 0) {
                if ("https".equals(protocol)) {
                    port = 443;
                } else if ("http".equals(protocol)) {
                    port = 80;
                } else {
                    z = false;
                }
            }
            if (StringUtils.equals(protocol, "http")) {
                TransportConfigureManager.getInstance().setValue(TransportConfigureItem.AMNET_HS, UTConstant.Args.UT_SUCCESS_F);
            }
            if (!z) {
                return host;
            }
            return host + ":" + String.valueOf(port);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", th);
            return "";
        }
    }

    private String a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        try {
            str = getAmnetAddress();
            try {
                a(str.substring(0, str.indexOf(":")), map);
                return str;
            } catch (Exception e) {
                e = e;
                throw new RuntimeException("amnetAddress=[" + str + riy.ARRAY_END_STR, e);
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
    }

    private String b(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        try {
            str = getAmnetShortAddress();
            try {
                a(str.substring(0, str.indexOf(":")), map);
                return str;
            } catch (Exception e) {
                e = e;
                throw new RuntimeException("amnetShortAddress=[" + str + riy.ARRAY_END_STR, e);
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
    }

    private String c(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{this, map});
        }
        try {
            str = getH2Address();
            try {
                a(str.substring(0, str.indexOf(":")), map);
            } catch (Exception e) {
                e = e;
                LogCatUtil.error("AmnetOperationManager", "getH2Url error, h2Address=[" + str + "], ", e);
                return str;
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
        return str;
    }

    private String a(String str) {
        HttpDns.HttpdnsIP queryLocalIPByHost;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        LogCatUtil.info("AmnetOperationManager", "getAmnetDnsInfos host=" + str);
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
        if (dnsClient == null) {
            LogCatUtil.info("AmnetOperationManager", "getAmnetDnsInfos.host=" + str + ",dnsClient is null.");
            return "";
        }
        try {
            queryLocalIPByHost = dnsClient.queryLocalIPByHost(str);
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetOperationManager", th);
        }
        if (queryLocalIPByHost == null) {
            LogCatUtil.info("AmnetOperationManager", "getAmnetDnsInfos. host=" + str + ",ipInfoByHost is null.");
            if (dnsClient.isHttpdnsDie()) {
                b();
            }
            return "";
        } else if (!StringUtils.isEmpty(queryLocalIPByHost.getCname())) {
            StringBuilder sb = new StringBuilder();
            InetAddress[] allByName = DnsUtil.getAllByName(queryLocalIPByHost.getCname());
            while (i < allByName.length) {
                sb.append(allByName[i].getHostAddress());
                sb.append(":");
                sb.append("443");
                sb.append(",");
                i++;
            }
            LogCatUtil.debug("AmnetOperationManager", "host=" + str + ",cname is available,cname:" + queryLocalIPByHost.getCname() + " ,ips:" + sb.toString());
            return sb.toString();
        } else {
            if (queryLocalIPByHost.getIpEntries() != null) {
                StringBuilder sb2 = new StringBuilder();
                HttpdnsIPEntry[] ipEntries = queryLocalIPByHost.getIpEntries();
                boolean isNowUseBifrost = AmnetTunnelManager.getInstance().isNowUseBifrost();
                boolean c2 = c();
                if (isNowUseBifrost && c2) {
                    boolean z = true;
                    for (int i2 = 0; i2 < ipEntries.length; i2++) {
                        if (ipEntries[i2].ipType != HttpDns.IP_TYPE_V6) {
                            sb2.append(ipEntries[i2].getIpWithPort());
                            sb2.append(",");
                        } else if (z) {
                            sb2.append(ipEntries[i2].getIpWithPort());
                            sb2.append(",");
                            z = false;
                        }
                    }
                } else {
                    LogCatUtil.debug("AmnetOperationManager", "filter-out ipv6,isNowUseBifrost= " + isNowUseBifrost + ", allowIPv6= " + c2);
                    while (i < ipEntries.length) {
                        if (ipEntries[i].ipType == HttpDns.IP_TYPE_V4) {
                            sb2.append(ipEntries[i].getIpWithPort());
                            sb2.append(",");
                        }
                        i++;
                    }
                }
                LogCatUtil.debug("AmnetOperationManager", "getAmnetDnsInfos2,host:" + str + " ,ips: " + sb2.toString());
                return sb2.toString();
            }
            return "";
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            LogCatUtil.debug("AmnetOperationManager", "httpdns die,notifyClearDns");
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AppEvent appEvent = new AppEvent();
                    appEvent.id = 1L;
                    appEvent.status = 8;
                    appEvent.major = Baggage.Amnet.ADDRESS_ALL;
                    appEvent.minor = "";
                    AmnetOperationManager.this.notifyAppEvent(appEvent);
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "notifyClearDns ex:" + th.toString());
        }
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            map.put(Baggage.Amnet.CFG_ADDR, a(str));
        }
    }

    private Transport.Altering a(AppEvent appEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport.Altering) ipChange.ipc$dispatch("97fb8c1c", new Object[]{this, appEvent});
        }
        Transport.Altering altering = new Transport.Altering();
        altering.id = appEvent.id;
        altering.infMinor = appEvent.minor;
        altering.infMajor = appEvent.major;
        altering.status = appEvent.status;
        altering.extMap = appEvent.extMap;
        return altering;
    }

    public long getActivateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bafba651", new Object[]{this})).longValue() : this.b;
    }

    public void setActivateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800fa87b", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    private void a(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dd858d", new Object[]{this, amnetPost});
            return;
        }
        try {
            if (!StringUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_URGENT_CONNECT), "T") || !this.f5363a || amnetPost.channel != 1 || !AmnetTunnelManager.getInstance().isNowUseBifrost()) {
                return;
            }
            if (!amnetPost.isUrgent && !MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext())) {
                return;
            }
            StnLogic.makesureLongLinkConnected();
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "preProcessBeforePost ex:" + th.toString());
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MAINLINK_ALLOW_IPV6));
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "allowIPv6MainLink ex:" + th.toString());
            return false;
        }
    }

    private void e(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152edff2", new Object[]{this, amnetPost, posting});
        } else if (amnetPost == null || posting == null || amnetPost.params == null) {
        } else {
            String str = amnetPost.params.get("url");
            if (StringUtils.isEmpty(str)) {
                return;
            }
            posting.multiplex = true;
            posting.params.put("url", str);
            LogCatUtil.info("AmnetOperationManager", "[setPostUrlToPosting] postUrl = " + str);
        }
    }

    public void preConnect(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42135da", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
        } else if (StringUtils.isEmpty(str)) {
            LogCatUtil.warn("AmnetOperationManager", "preConnect host is null");
        } else {
            getAmnetTransport().preConnect(1L, str, i, z, i2, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z2)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "preConnect result=[" + z2 + riy.ARRAY_END_STR);
                }
            });
        }
    }
}
