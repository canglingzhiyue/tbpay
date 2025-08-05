package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetManagerBeanFactory;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.model.AskConnStateCallback;
import com.alipay.mobile.common.amnet.service.ipcservice.OutEventNotifyServiceImpl;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AmnetServiceOperationHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static class InnerActivateAmnetCallback implements AskConnStateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.amnet.api.model.AskConnStateCallback
        public void callback(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5331c237", new Object[]{this, new Integer(i)});
            } else if (i == 0 || i == -1) {
                AmnetManagerBeanFactory.getSingletonAmnetManager().activateAmnet(new InnerAmnetResult());
                LogCatUtil.info("AmnetServiceOperationHelper", "[InnerActivateAmnetCallback#callback] activateAmnet finish");
            } else {
                LogCatUtil.info("AmnetServiceOperationHelper", "[InnerActivateAmnetCallback#callback] state: " + i + ", return.");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InnerAmnetResult implements AmnetResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
        public void notifyResult(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z)});
            } else if (z) {
                AmnetServiceOperationHelper.notifyFirstEvent2Amnet();
                LogCatUtil.info("AmnetServiceOperationHelper", "[InnerAmnetResult] Invoked notifyFirstEvent2Amnet.");
            } else {
                LogCatUtil.info("AmnetServiceOperationHelper", "[InnerAmnetResult#notifyResult] Activate amnet result: " + z);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class InnerStopAmnetCallback implements AskConnStateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.amnet.api.model.AskConnStateCallback
        public void callback(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5331c237", new Object[]{this, new Integer(i)});
            } else if (i == -1) {
            } else {
                AmnetManagerBeanFactory.getSingletonAmnetManager().shutdownAmnet(new DefaultAmnetResult());
                ((OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance()).resetEventStates();
                MasterProxyGeneralListener.getInstance().notifyAmnetLifeChange((byte) 1);
                LogCatUtil.debug("AmnetServiceOperationHelper", "[stopAmnetConnect] Stop amnet finish");
            }
        }
    }

    public static final void startAmnetConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97959642", new Object[0]);
            return;
        }
        LogCatUtil.warn("AmnetServiceOperationHelper", "[startAmnetConnect] Enter");
        AmnetManagerBeanFactory.getSingletonAmnetManager().askConnState(new InnerActivateAmnetCallback());
    }

    public static final void notifyFirstEvent2Amnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd27019", new Object[0]);
            return;
        }
        boolean isVisibleAlipay = AlipayVisibleHelper.isVisibleAlipay();
        LogCatUtil.debug("AmnetServiceOperationHelper", "[notifyFirstEvent2Amnet] visibleAlipay=" + isVisibleAlipay);
        if (AmnetServiceLifeCycleListener.getInstance().isBindedMainProc()) {
            ((OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance()).notifyMainProcExistStateChanged(1);
        }
        if (MiscUtils.isScreenOn(AmnetEnvHelper.getAppContext())) {
            OutEventNotifyServiceImpl.getInstance().notifySeceenOnEvent();
        }
        if (MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext())) {
            OutEventNotifyServiceImpl.getInstance().notifyAppResumeEvent();
        }
        AmnetLinkStrategy.getInstance().notifySwitchSmartHeartBeat();
        AmnetLinkStrategy.getInstance().notifySwitchOrtt();
        AmnetLinkStrategy.getInstance().notifySwitchDelayHandshake();
        LogCatUtil.debug("AmnetServiceOperationHelper", "[notifyFirstEvent2Amnet] =====notifyFirstEvent2Amnet ,Amnet is actived=====");
        MasterProxyGeneralListener.getInstance().notifyAmnetLifeChange((byte) 2);
    }

    public static final void stopAmnetConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8599e2", new Object[0]);
            return;
        }
        LogCatUtil.debug("AmnetServiceOperationHelper", "[stopAmnetConnect] Enter");
        AmnetManagerBeanFactory.getSingletonAmnetManager().askConnState(new InnerStopAmnetCallback());
    }

    public static void preConnect(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42135da", new Object[]{str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        try {
            LogCatUtil.debug("AmnetServiceOperationHelper", "[preConnect] Enter,host=" + str);
            AmnetManagerBeanFactory.getSingletonAmnetManager().preConnect(str, i, z, i2);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetServiceOperationHelper", "preConnect ex=" + th.toString());
        }
    }
}
