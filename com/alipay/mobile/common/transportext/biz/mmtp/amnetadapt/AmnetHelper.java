package com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt;

import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.mobile.common.amnet.api.AmnetBeanFactory;
import com.alipay.mobile.common.amnet.api.AmnetManager;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.ipc.api.IPCException;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.api.ExtTransportManager;
import com.alipay.mobile.common.transportext.biz.mmtp.BindEventListenerManger;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetClientLocalAdapter;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcStream;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AmnetHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetManager f5678a = null;
    private static boolean b = false;
    private static ThreadPoolExecutor c;

    /* loaded from: classes3.dex */
    public static class AmnetPostRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public AmnetPost amnetPost;

        public AmnetPostRunnable(AmnetPost amnetPost) {
            this.amnetPost = amnetPost;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AmnetHelper.post(this.amnetPost);
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetHelper", "post fail. " + th.toString());
            }
        }
    }

    public static final AmnetManager getAmnetManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetManager) ipChange.ipc$dispatch("813e8c6d", new Object[0]);
        }
        AmnetManager amnetManager = f5678a;
        if (amnetManager != null) {
            return amnetManager;
        }
        AmnetManager amnetManager2 = AmnetBeanFactory.getAmnetManager();
        f5678a = amnetManager2;
        return amnetManager2;
    }

    public static final void asyncPost(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6a968", new Object[]{amnetPost});
        } else {
            a().execute(new AmnetPostRunnable(amnetPost));
        }
    }

    public static final void post(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad854cc", new Object[]{amnetPost});
            return;
        }
        try {
            initMmtp();
            amnetPost.secret = true;
            amnetPost.ts = System.nanoTime();
            amnetPost.ipcM2p = System.currentTimeMillis();
            if (amnetPost.localAmnet) {
                AmnetClientLocalAdapter.getInstance().post(amnetPost);
            } else {
                a(amnetPost);
            }
        } catch (MMTPException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("AmnetHelper", "post exception", th);
        }
    }

    private static void a(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dd858d", new Object[]{amnetPost});
            return;
        }
        checkBindService();
        try {
            a(amnetPost, ((AmnetClientService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(AmnetClientService.class)).postWithResult(amnetPost));
        } catch (Throwable th) {
            LogCatUtil.error("AmnetHelper", "postToPushProcess exception = " + th.toString());
            if (th instanceof IPCException) {
                ExtTransportTunnelWatchdog.getInstance().startTunnelDowngrade(ExtTransportTunnelWatchdog.DOWNGRADE_REASON_AMNETPOST);
                throw new MMTPException(1003, "AMNET fails to active, will switch to SPDY");
            }
            String th2 = th.toString();
            MMTPException mMTPException = new MMTPException(th2, th);
            mMTPException.errorCode = 1004;
            mMTPException.errorMesage = th2;
            throw mMTPException;
        }
    }

    private static void a(AmnetPost amnetPost, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670ea58", new Object[]{amnetPost, map});
        } else if (map == null || amnetPost.channel != 1) {
        } else {
            LogCatUtil.debug("AmnetHelper", "RPCID:" + amnetPost.reqSeqId + ",IPC_TIME1:" + map.get(RPCDataItems.IPC_TIME1));
            TransportContext value = TransportContextThreadLocalUtils.getValue();
            if (value == null) {
                return;
            }
            value.getCurrentDataContainer().putDataItem(RPCDataItems.IPC_TIME1, map.get(RPCDataItems.IPC_TIME1));
            map.clear();
        }
    }

    public static void waitToBind() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac8e934", new Object[0]);
            return;
        }
        checkBindService();
        BindEventListenerManger bindEventListenerManger = BindEventListenerManger.getInstance();
        bindEventListenerManger.waitToBinded();
        if (bindEventListenerManger.isBinded() && isAmnetActivite()) {
            return;
        }
        while (true) {
            if (i >= 15) {
                break;
            }
            Thread.sleep(1000L);
            if (bindEventListenerManger.isBinded() && isAmnetActivite()) {
                LogCatUtil.debug("AmnetHelper", "Service is binded and Amnet is activated after:" + (i * 1000) + " secs;Bind status:" + bindEventListenerManger.isBinded() + " AMNET active:" + isAmnetActivite());
                break;
            }
            LogCatUtil.verbose("AmnetHelper", "waiting for bindservice and amnet to be ready... [" + i + "]; Bind status:" + bindEventListenerManger.isBinded() + " AMNET active:" + isAmnetActivite());
            i++;
        }
        if (i != 15) {
            return;
        }
        LogCatUtil.debug("AmnetHelper", "Bind status:" + bindEventListenerManger.isBinded() + " AMNET active:" + isAmnetActivite());
        LogCatUtil.debug("AmnetHelper", "AMNET is not activated while post, will downgrade the Ext-tunnel");
        ExtTransportTunnelWatchdog.getInstance().startTunnelDowngrade(ExtTransportTunnelWatchdog.DOWNGRADE_REASON_AMNETPOST);
        throw new MMTPException(1003, "AMNET fails to active, will switch to SPDY");
    }

    public static void checkBindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a57617", new Object[0]);
        } else if (BindPushServiceManager.BindPushServiceFactory.getInstance().isBindedService()) {
        } else {
            BindPushServiceManager.BindPushServiceFactory.getInstance().bindService();
        }
    }

    public static void initMmtp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143703d3", new Object[0]);
        } else if (b) {
        } else {
            synchronized (AmnetHelper.class) {
                if (b) {
                    return;
                }
                b = true;
                ExtTransportManager mMTPTransportManager = ((ExtTransportManagerImpl) ExtTransportOffice.getInstance().getExtTransportManager()).getMMTPTransportManager();
                if (mMTPTransportManager == null || mMTPTransportManager.isInited()) {
                    return;
                }
                mMTPTransportManager.init(ExtTransportEnv.getAppContext());
            }
        }
    }

    public static final int getConnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cf11709", new Object[0])).intValue();
        }
        try {
            BindEventListenerManger.getInstance().waitToBinded();
            return ((AmnetClientService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(AmnetClientService.class)).getConnState();
        } catch (Exception e) {
            LogCatUtil.error("AmnetHelper", e);
            return -1;
        }
    }

    public static final boolean isLastAmnetActivite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fe2ff97", new Object[0])).booleanValue();
        }
        return BindPushServiceManager.BindPushServiceFactory.getInstance().isBindedService() && ((GeneralEventListenServiceImpl) GeneralEventListenServiceImpl.getInstance()).isAmnetActived();
    }

    public static final boolean isBinded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d43a68f1", new Object[0])).booleanValue() : BindPushServiceManager.BindPushServiceFactory.getInstance().isBindedService();
    }

    public static final boolean isAmnetActivite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64837e8d", new Object[0])).booleanValue();
        }
        if (isLastAmnetActivite()) {
            if (!BindEventListenerManger.getInstance().isBinded()) {
                BindEventListenerManger.getInstance().binded();
                LogCatUtil.info("AmnetHelper", "[isAmnetActivite] 1. Correct the bind status.");
            }
            return true;
        }
        GeneralEventListenServiceImpl generalEventListenServiceImpl = (GeneralEventListenServiceImpl) GeneralEventListenServiceImpl.getInstance();
        try {
            if (((AmnetClientService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(AmnetClientService.class)).isAmnetActiveted()) {
                if (!BindEventListenerManger.getInstance().isBinded()) {
                    BindEventListenerManger.getInstance().binded();
                    LogCatUtil.info("AmnetHelper", "[isAmnetActivite] 2. Correct the bind status.");
                }
                generalEventListenServiceImpl.setAmnetLifeState((byte) 2);
                return true;
            }
            LogCatUtil.debug("AmnetHelper", "isAmnetActivite return false");
            generalEventListenServiceImpl.setAmnetLifeState((byte) 1);
            return false;
        } catch (Exception e) {
            LogCatUtil.error("AmnetHelper", "isAmnetActivite Exception = " + e.toString());
            return false;
        }
    }

    public static void asyncNotifyResultFeedback(final ResultFeedback resultFeedback, final MRpcStream mRpcStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4324b56", new Object[]{resultFeedback, mRpcStream});
        } else {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AmnetHelper.notifyResultFeedback(ResultFeedback.this, mRpcStream);
                    }
                }
            });
        }
    }

    public static void notifyResultFeedback(ResultFeedback resultFeedback, MRpcStream mRpcStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ffcfba", new Object[]{resultFeedback, mRpcStream});
            return;
        }
        try {
            if (mRpcStream.isLocalAmnet()) {
                AmnetClientLocalAdapter.getInstance().notifyResultFeedback(resultFeedback);
                return;
            }
            BindEventListenerManger.getInstance().waitToBinded();
            ((AmnetClientService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(AmnetClientService.class)).notifyResultFeedback(resultFeedback);
        } catch (Exception e) {
            LogCatUtil.error("AmnetHelper", e);
        }
    }

    private static ThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("26487748", new Object[0]);
        }
        ThreadPoolExecutor threadPoolExecutor = c;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        synchronized (AmnetHelper.class) {
            if (c != null) {
                return c;
            }
            c = new ThreadPoolExecutor(1, 1, 2L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            c.allowCoreThreadTimeOut(true);
            return c;
        }
    }

    public static void preConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9079ce", new Object[0]);
            return;
        }
        try {
            a(DnsValue.DOMAIN_MOBILE_GW, 443, true, 4);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetHelper", "1preConnect ex=" + th.toString());
        }
    }

    private static void a(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c702c780", new Object[]{str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        try {
            if (!TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
                return;
            }
            AmnetClientLocalAdapter.getInstance().preConnect(str, i, z, i2);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetHelper", "2preConnect ex=" + th.toString());
        }
    }
}
