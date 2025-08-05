package com.alipay.mobile.common.amnet.biz;

import com.alipay.mobile.common.amnet.api.AcceptDataListener;
import com.alipay.mobile.common.amnet.api.AcceptDataManager;
import com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager;
import com.alipay.mobile.common.amnet.api.AmnetGeneralListener;
import com.alipay.mobile.common.amnet.api.AmnetManager;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsEventManager;
import com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsListener;
import com.alipay.mobile.common.amnet.api.OutEventNotifyManager;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.AppEvent;
import com.alipay.mobile.common.amnet.api.model.AskConnStateCallback;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AmnetManagerImpl implements AmnetManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void addRpcAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3899c69", new Object[]{this, acceptDataListener});
        } else {
            getAcceptDataManager().addRpcAcceptDataListener(acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void addSyncAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b73f611", new Object[]{this, acceptDataListener});
        } else {
            getAcceptDataManager().addSyncAcceptDataListener(acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void addSyncDirectAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ebc1a8", new Object[]{this, acceptDataListener});
        } else {
            getAcceptDataManager().addSyncDirectAcceptDataListener(acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void addPushAcceptDataListener(AcceptDataListener acceptDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d5ff2", new Object[]{this, acceptDataListener});
        } else {
            getAcceptDataManager().addPushAcceptDataListener(acceptDataListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void addSetActivatingParamsListener(AmnetSetActivatingParamsListener amnetSetActivatingParamsListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81746753", new Object[]{this, amnetSetActivatingParamsListener});
        } else {
            getAmnetSetActivatingParamsEventManager().addListener(amnetSetActivatingParamsListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void removeRpcAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa0cd4e", new Object[]{this});
        } else {
            getAcceptDataManager().removeRpcAcceptDataListener();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void removeSyncAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb6154c", new Object[]{this});
        } else {
            getAcceptDataManager().removeSyncAcceptDataListener();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void removeSyncDirectAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d9c555", new Object[]{this});
        } else {
            getAcceptDataManager().removeSyncDirectAcceptDataListener();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void removePushAcceptDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b768b08b", new Object[]{this});
        } else {
            getAcceptDataManager().removePushAcceptDataListener();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void addGeneraEventListener(AmnetGeneralListener amnetGeneralListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672f43e5", new Object[]{this, amnetGeneralListener});
        } else {
            getAmnetGeneralEventManager().addGeneraEventListener(amnetGeneralListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void removeGeneraEventListener(AmnetGeneralListener amnetGeneralListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ba05c8", new Object[]{this, amnetGeneralListener});
        } else {
            getAmnetGeneralEventManager().removeGeneraEventListener(amnetGeneralListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void activateAmnet(AmnetResult amnetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0103e7", new Object[]{this, amnetResult});
        } else {
            getAmnetOperationManager().activateAmnet(amnetResult);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void shutdownAmnet(AmnetResult amnetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d01e3e4", new Object[]{this, amnetResult});
        } else {
            getAmnetOperationManager().shutdownAmnet(amnetResult);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void post(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad854cc", new Object[]{this, amnetPost});
        } else {
            getAmnetOperationManager().post(amnetPost);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void notifyAppEvent(AppEvent appEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6869b8", new Object[]{this, appEvent});
        } else {
            getAmnetOperationManager().notifyAppEvent(appEvent);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void notifyResultFeedback(ResultFeedback resultFeedback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c4f226", new Object[]{this, resultFeedback});
        } else {
            getAmnetOperationManager().notifyRespResult(resultFeedback);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public OutEventNotifyManager getOutEventNotifyManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutEventNotifyManager) ipChange.ipc$dispatch("c42e2145", new Object[]{this}) : (OutEventNotifyManager) NetBeanFactory.getBean(OutEventNotifyManagerImpl.class);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public AcceptDataManager getAcceptDataManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AcceptDataManager) ipChange.ipc$dispatch("66f9753f", new Object[]{this}) : (AcceptDataManager) NetBeanFactory.getBean(AcceptDataManagerImpl.class);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public AmnetGeneralEventManager getAmnetGeneralEventManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetGeneralEventManager) ipChange.ipc$dispatch("dd0d982d", new Object[]{this}) : (AmnetGeneralEventManager) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public AmnetSetActivatingParamsEventManager getAmnetSetActivatingParamsEventManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetSetActivatingParamsEventManager) ipChange.ipc$dispatch("1ee84b2d", new Object[]{this}) : AmnetSetActivatingParamsEventManager.getInstance();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public boolean isActivated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e27854d2", new Object[]{this})).booleanValue() : ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).isActivated();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void askConnState(AskConnStateCallback askConnStateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd683056", new Object[]{this, askConnStateCallback});
        } else {
            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).askConnState(askConnStateCallback);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void reconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61e9c5e", new Object[]{this});
        } else {
            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).reconnect();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public String getAmnetAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f96ad560", new Object[]{this}) : ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getAmnetAddress();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public String getAmnetDnsInfos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc16dc22", new Object[]{this}) : ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getAmnetDnsInfos();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public String getAmnetDnsInfosForShort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c14c3af", new Object[]{this}) : ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getAmnetDnsInfosForShort();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public String getAmnetDnsInfosForMultiplex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5a156e43", new Object[]{this}) : ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getAmnetDnsInfoForMultiplex();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void detect(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63780647", new Object[]{this, amnetNetworkDiagnoseListener});
        } else {
            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).detect(amnetNetworkDiagnoseListener);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public Map<String, String> postWithResult(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9e060064", new Object[]{this, amnetPost}) : getAmnetOperationManager().postWithResult(amnetPost);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public boolean isNotifyLoginOut() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3d9e5e3", new Object[]{this})).booleanValue() : ((AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class)).isNotifyLoginOut();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetManager
    public void preConnect(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42135da", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).preConnect(str, i, z, i2);
        }
    }

    public AmnetOperationManager getAmnetOperationManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetOperationManager) ipChange.ipc$dispatch("332f64ee", new Object[]{this}) : (AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class);
    }
}
