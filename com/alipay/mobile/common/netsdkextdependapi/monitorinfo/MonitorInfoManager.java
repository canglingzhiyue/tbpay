package com.alipay.mobile.common.netsdkextdependapi.monitorinfo;

import java.util.Map;

/* loaded from: classes3.dex */
public interface MonitorInfoManager {
    void doUploadMonitorLog();

    void endLinkRecordPhase(String str, String str2, Map<String, String> map);

    void flushMonitorLog();

    void footprint(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    boolean isTraficConsumeAccept(String str);

    void kickOnNetworkBindService(String str, boolean z, String str2);

    void kickOnNetworkDiagnose(boolean z, String str);

    void noteTraficConsume(TraficConsumeModel traficConsumeModel);

    void record(MonitorLoggerModel monitorLoggerModel);

    void recordException(Throwable th);

    void recordUnavailable(String str, String str2, String str3, Map<String, String> map);

    void setUploadSizeOfFootprint(int i);

    void startLinkRecordPhase(String str, String str2, Map<String, String> map);
}
