package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.AppEvent;
import com.alipay.mobile.common.amnet.api.model.AskConnStateCallback;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import java.util.Map;

/* loaded from: classes3.dex */
public interface AmnetManager {
    void activateAmnet(AmnetResult amnetResult);

    void addGeneraEventListener(AmnetGeneralListener amnetGeneralListener);

    void addPushAcceptDataListener(AcceptDataListener acceptDataListener);

    void addRpcAcceptDataListener(AcceptDataListener acceptDataListener);

    void addSetActivatingParamsListener(AmnetSetActivatingParamsListener amnetSetActivatingParamsListener);

    void addSyncAcceptDataListener(AcceptDataListener acceptDataListener);

    void addSyncDirectAcceptDataListener(AcceptDataListener acceptDataListener);

    void askConnState(AskConnStateCallback askConnStateCallback);

    void detect(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener);

    AcceptDataManager getAcceptDataManager();

    String getAmnetAddress();

    String getAmnetDnsInfos();

    String getAmnetDnsInfosForMultiplex();

    String getAmnetDnsInfosForShort();

    AmnetGeneralEventManager getAmnetGeneralEventManager();

    AmnetSetActivatingParamsEventManager getAmnetSetActivatingParamsEventManager();

    OutEventNotifyManager getOutEventNotifyManager();

    boolean isActivated();

    boolean isNotifyLoginOut();

    void notifyAppEvent(AppEvent appEvent);

    void notifyResultFeedback(ResultFeedback resultFeedback);

    void post(AmnetPost amnetPost);

    Map<String, String> postWithResult(AmnetPost amnetPost);

    void preConnect(String str, int i, boolean z, int i2);

    void reconnect();

    void removeGeneraEventListener(AmnetGeneralListener amnetGeneralListener);

    void removePushAcceptDataListener();

    void removeRpcAcceptDataListener();

    void removeSyncAcceptDataListener();

    void removeSyncDirectAcceptDataListener();

    void shutdownAmnet(AmnetResult amnetResult);
}
