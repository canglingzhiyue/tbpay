package android.taobao.windvane.extra.performance2;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface IPerformance {
    String getCachedUrl();

    WVPerformance getPerformanceDelegate();

    boolean isPreInit();

    boolean isReportedFSP();

    void receiveJSMessageForCustomizedFSP(long j);

    void receiveJSMessageForCustomizedStage(long j, String str);

    void receiveJSMessageForFP(long j);

    void receiveJSMessageForFSP(long j);

    void receiveJSMessageForTTI(long j);

    void receiveOnProperty(JSONObject jSONObject);

    void receiveOnStage(String str);

    void setPreInitState(boolean z);

    void setReportedFSP(boolean z);
}
