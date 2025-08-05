package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.amnet.api.model.DnsInfo;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface AmnetGeneralEventManager {
    void addGeneraEventListener(AmnetGeneralListener amnetGeneralListener);

    void asyncNotifyAfterAmnetActivation(boolean z);

    void asyncNotifyBeforeFirstAmnetActivation();

    int getLatestConnState();

    void notifyAfterAmnetActivation(boolean z);

    void notifyBeforeFirstAmnetActivation();

    void notifyCollectInitInfo(Map<Byte, Map<String, String>> map);

    void notifyCollectInitInfoV2(Map<Byte, byte[]> map);

    void notifyConnStateChange(int i);

    void notifyError(int i, String str);

    void notifyFinalError(long j, int i, String str, Map<String, String> map);

    void notifyGift(String str, String str2);

    void notifyInitOk();

    void notifyInitResponse(Initialization.RspInit rspInit);

    void notifyReconnect();

    void notifyReport(String str, double d);

    void notifyReportIpPort(String str, String str2, String str3, String str4);

    void notifyResendSessionid();

    void notifyRestrict(int i, String str);

    void notifySessionInvalid();

    void notifyUpdateConfig(Map<String, String> map);

    void notifyUpdateDnsInfo(List<DnsInfo> list);

    void removeGeneraEventListener(AmnetGeneralListener amnetGeneralListener);
}
