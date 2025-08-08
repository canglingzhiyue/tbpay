package anet.channel.analysis;

import mtopsdk.common.util.StringUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.IFullTraceAnalysis;
import anet.channel.fulltrace.SceneInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.b;
import com.network.diagnosis.c;
import com.network.diagnosis.e;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.scene.SceneIdentifier;
import java.util.HashMap;
import tb.kge;
import tb.sad;

/* loaded from: classes.dex */
public class DefaultFullTraceAnalysis implements IFullTraceAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REQ_TYPE = "network";
    private static final String TAG = "awcn.DefaultFullTraceAnalysis";
    private boolean isAnalysisValid;
    private boolean isDiagnosisValid;

    static {
        kge.a(-1166608923);
        kge.a(2104502369);
    }

    public DefaultFullTraceAnalysis() {
        try {
            Class.forName("com.taobao.analysis.fulltrace.FullTraceAnalysis");
            SceneIdentifier.setContext(GlobalAppRuntimeInfo.getContext());
            this.isAnalysisValid = true;
            sad.a(SceneIdentifier.getDeviceLevel());
        } catch (Exception unused) {
            this.isAnalysisValid = false;
            ALog.e(TAG, "not support FullTraceAnalysis", null, new Object[0]);
        }
        try {
            e.a(GlobalAppRuntimeInfo.getContext());
            b a2 = e.a();
            if (a2 != null) {
                a2.a(GlobalAppRuntimeInfo.getContext());
            }
            this.isDiagnosisValid = true;
        } catch (Exception unused2) {
            this.isDiagnosisValid = false;
            ALog.e(TAG, "not support NetworkDiagnosis", null, new Object[0]);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public String createRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57145ee6", new Object[]{this});
        }
        if (!this.isAnalysisValid) {
            return null;
        }
        return FullTraceAnalysis.getInstance().createRequest("network");
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void commitRequest(String str, RequestStatistic requestStatistic) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5943df", new Object[]{this, str, requestStatistic});
            return;
        }
        if (this.isAnalysisValid) {
            if (requestStatistic == null || StringUtils.isEmpty(str)) {
                return;
            }
            com.taobao.analysis.fulltrace.b bVar = new com.taobao.analysis.fulltrace.b();
            bVar.b = requestStatistic.host;
            bVar.d = requestStatistic.bizId;
            bVar.f8567a = requestStatistic.url;
            bVar.c = requestStatistic.retryTimes;
            bVar.e = requestStatistic.netType;
            bVar.f = requestStatistic.protocolType;
            bVar.g = requestStatistic.ret;
            bVar.H = false;
            bVar.J = requestStatistic.isReqMain;
            bVar.I = requestStatistic.isReqSync;
            if (requestStatistic.statusCode == -304) {
                bVar.K = String.valueOf(requestStatistic.tnetErrorCode);
            } else {
                bVar.K = String.valueOf(requestStatistic.statusCode);
            }
            bVar.M = requestStatistic.pTraceId;
            bVar.j = requestStatistic.netReqStart;
            bVar.k = requestStatistic.reqServiceTransmissionEnd;
            bVar.l = requestStatistic.reqStart;
            bVar.m = requestStatistic.sendStart;
            bVar.n = requestStatistic.rspEnd;
            bVar.o = requestStatistic.rspCbDispatch;
            bVar.p = requestStatistic.rspCbStart;
            bVar.q = requestStatistic.rspCbEnd;
            bVar.w = requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize;
            bVar.v = requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize;
            bVar.x = requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize;
            bVar.y = requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize;
            bVar.z = requestStatistic.serverRT;
            bVar.C = requestStatistic.sendDataTime;
            bVar.D = requestStatistic.firstDataTime;
            bVar.E = requestStatistic.recDataTime;
            bVar.Q = requestStatistic.useMultiPath;
            bVar.P = requestStatistic.multiNetworkStatus;
            bVar.R = requestStatistic.pageReferer;
            FullTraceAnalysis.getInstance().commitRequest(str, "network", bVar);
        }
        if (!this.isDiagnosisValid || (a2 = e.a()) == null) {
            return;
        }
        c b = a2.b();
        HashMap hashMap = new HashMap();
        hashMap.put("host", requestStatistic.host);
        hashMap.put("url", requestStatistic.url);
        hashMap.put("serverRT", Long.valueOf(requestStatistic.serverRT));
        hashMap.put("protocol", requestStatistic.protocolType);
        hashMap.put(c.IP, requestStatistic.ip);
        hashMap.put(c.EAGLE_EYE_ID, requestStatistic.eagleEyeId);
        hashMap.put("code", Integer.valueOf(requestStatistic.statusCode));
        b.a(hashMap);
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public SceneInfo getSceneInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SceneInfo) ipChange.ipc$dispatch("b76919f8", new Object[]{this});
        }
        if (!this.isAnalysisValid) {
            return null;
        }
        SceneInfo sceneInfo = new SceneInfo();
        sceneInfo.isUrlLaunch = SceneIdentifier.isUrlLaunch();
        sceneInfo.appLaunchTime = SceneIdentifier.getAppLaunchTime();
        sceneInfo.lastLaunchTime = SceneIdentifier.getLastLaunchTime();
        sceneInfo.deviceLevel = SceneIdentifier.getDeviceLevel();
        sceneInfo.startType = SceneIdentifier.getStartType();
        sceneInfo.speedBucket = SceneIdentifier.getBucketInfo();
        sceneInfo.abTestBucket = ABTestCenter.getUTABTestBucketId("networksdk");
        return sceneInfo;
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysis
    public void log(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c228169", new Object[]{this, str, str2, str3});
        } else if (!this.isAnalysisValid) {
        } else {
            FullTraceAnalysis.getInstance().log(str, "network", str2, str3);
        }
    }
}
