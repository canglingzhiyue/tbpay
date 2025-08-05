package anet.channel.analysis;

import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.k;
import com.taobao.analysis.v3.n;
import com.taobao.analysis.v3.r;
import java.util.Map;
import tb.kge;
import tb.mys;

/* loaded from: classes.dex */
public class DefaultFullTraceAnalysisV3 implements IFullTraceAnalysisV3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "network";
    private static final String SCENE = "Network_UnknownScene";
    private static final String TAG = "awcn.DefaultFullTraceAnalysisV3";
    private n appStatusSpan;
    private boolean isAnalysisValid;
    private boolean isFalcoValid = false;
    private r falcoTracer = null;

    static {
        kge.a(-124708030);
        kge.a(-502817090);
    }

    public DefaultFullTraceAnalysisV3() {
        this.isAnalysisValid = false;
        try {
            Class.forName("com.taobao.analysis.v3.FalcoGlobalTracer");
            this.isAnalysisValid = true;
            tryGetFalcoTracer();
            ALog.e(TAG, "[AnalysisV3] DefaultFullTraceAnalysisV3", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "isFalcoValid", Boolean.valueOf(this.isFalcoValid));
        } catch (Throwable th) {
            ALog.e(TAG, "[AnalysisV3] not support FullTraceAnalysis v3", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "error", th);
        }
    }

    private void tryGetFalcoTracer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04a4fd6", new Object[]{this});
            return;
        }
        try {
            if (this.isFalcoValid) {
                return;
            }
            this.falcoTracer = FalcoGlobalTracer.get();
            if (this.falcoTracer != null) {
                this.isFalcoValid = true;
            }
            ALog.e(TAG, "[AnalysisV3] tryGetFalcoTracer", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "isFalcoValid", Boolean.valueOf(this.isFalcoValid));
        } catch (Throwable th) {
            ALog.e(TAG, "[AnalysisV3] tryGetFalcoTracer error", null, "isAnalysisValid", Boolean.valueOf(this.isAnalysisValid), "error", th);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public IFullTraceAnalysisV3.ISpan createRequest(Map<String, String> map) {
        mys a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFullTraceAnalysisV3.ISpan) ipChange.ipc$dispatch("403cf90f", new Object[]{this, map});
        }
        if (!this.isAnalysisValid) {
            ALog.e(TAG, "[AnalysisV3] createRequest, isAnalysisValid=false", null, new Object[0]);
            return null;
        } else if (!this.isFalcoValid) {
            ALog.e(TAG, "[AnalysisV3] createRequest, isFalcoValid=false", null, new Object[0]);
            return null;
        } else {
            r.a a3 = this.falcoTracer.a("network", SCENE);
            if (map != null && !map.isEmpty() && (a2 = this.falcoTracer.a(map)) != null) {
                a3.a(a2);
            }
            k d = a3.d();
            if (d == null) {
                ALog.e(TAG, "[AnalysisV3] createRequest, networkSpan=null", null, new Object[0]);
            }
            d.g("process_request");
            return new SpanProxy(d);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void setRequestStage(IFullTraceAnalysisV3.ISpan iSpan, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d792305e", new Object[]{this, iSpan, str, new Long(j)});
        } else if (!this.isAnalysisValid || !this.isFalcoValid || iSpan == null) {
        } else {
            k kVar = (k) iSpan.mo70getSpan();
            if ("netReqStart".equals(str)) {
                kVar.a(Long.valueOf(j));
            } else if ("netReqProcessStart".equals(str)) {
                kVar.b(Long.valueOf(j));
            } else if ("netReqSendStart".equals(str)) {
                kVar.c(Long.valueOf(j));
            } else if (IFullTraceAnalysisV3.Stage.RSP_RECV_START.equals(str)) {
                kVar.d(Long.valueOf(j));
            } else if ("netRspRecvEnd".equals(str)) {
                kVar.e(Long.valueOf(j));
            } else if ("netRspCbDispatch".equals(str)) {
                kVar.g(Long.valueOf(j));
            } else if ("netRspCbStart".equals(str)) {
                kVar.h(Long.valueOf(j));
            } else if ("netRspCbEnd".equals(str)) {
                kVar.i(Long.valueOf(j));
            } else if (!"serverRT".equals(str)) {
            } else {
                kVar.a(j);
            }
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void finishRequest(IFullTraceAnalysisV3.ISpan iSpan, RequestStatistic requestStatistic) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de0c17", new Object[]{this, iSpan, requestStatistic});
        } else if (!this.isAnalysisValid) {
        } else {
            tryGetFalcoTracer();
            if (!this.isFalcoValid || requestStatistic == null || iSpan == null) {
                return;
            }
            setRequestStage(iSpan, "netReqStart", requestStatistic.netReqStart);
            setRequestStage(iSpan, "netReqProcessStart", requestStatistic.reqStart);
            setRequestStage(iSpan, "netReqSendStart", requestStatistic.sendStart);
            setRequestStage(iSpan, "serverRT", requestStatistic.serverRT);
            setRequestStage(iSpan, IFullTraceAnalysisV3.Stage.RSP_RECV_START, requestStatistic.rspStart);
            setRequestStage(iSpan, "netRspRecvEnd", requestStatistic.rspEnd);
            setRequestStage(iSpan, "netRspCbDispatch", requestStatistic.rspCbDispatch);
            setRequestStage(iSpan, "netRspCbStart", requestStatistic.rspCbStart);
            setRequestStage(iSpan, "netRspCbEnd", requestStatistic.rspCbEnd);
            k kVar = (k) iSpan.mo70getSpan();
            k.HOST.a(kVar, requestStatistic.host);
            k.URL.a(kVar, requestStatistic.url);
            k.IP.a(kVar, requestStatistic.ip);
            k.BIZ_ID.a(kVar, requestStatistic.bizId);
            k.RETRY_TIMES.a(kVar, Integer.valueOf(requestStatistic.retryTimes));
            k.PROTOCOL_TYPE.a(kVar, requestStatistic.protocolType);
            k.ERROR_CODE.a(kVar, String.valueOf(requestStatistic.statusCode));
            k.IS_CB_MAIN.a(kVar, 0);
            k.IS_REQ_MAIN.a(kVar, Integer.valueOf(requestStatistic.isReqMain ? 1 : 0));
            k.IS_REQ_SYNC.a(kVar, Integer.valueOf(requestStatistic.isReqSync ? 1 : 0));
            k.RET.a(kVar, Integer.valueOf(requestStatistic.ret));
            k.NET_TYPE.a(kVar, requestStatistic.netType);
            k.SEND_DATA_TIME.a(kVar, Long.valueOf(requestStatistic.sendDataTime));
            k.FIRST_DATA_TIME.a(kVar, Long.valueOf(requestStatistic.firstDataTime));
            k.REQ_DEFLATE_SIZE.a(kVar, Long.valueOf(requestStatistic.reqHeadDeflateSize + requestStatistic.reqBodyDeflateSize));
            k.REQ_INFLATE_SIZE.a(kVar, Long.valueOf(requestStatistic.reqHeadInflateSize + requestStatistic.reqBodyInflateSize));
            k.RSP_DEFLATE_SIZE.a(kVar, Long.valueOf(requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize));
            k.RSP_INFLATE_SIZE.a(kVar, Long.valueOf(requestStatistic.rspHeadInflateSize + requestStatistic.rspBodyInflateSize));
            if (requestStatistic.extra != null) {
                kVar.a("firstIp", requestStatistic.extra.optString("firstIp"));
            } else {
                kVar.a("firstIp", requestStatistic.ip);
            }
            if (requestStatistic.retryTimes > 0) {
                kVar.a("firstProtocol", requestStatistic.firstProtocol);
                kVar.a("firstErrorCode", Integer.valueOf(requestStatistic.firstErrorCode));
            } else {
                kVar.a("firstProtocol", requestStatistic.protocolType);
                kVar.a("firstErrorCode", Integer.valueOf(requestStatistic.statusCode));
            }
            kVar.a("isTunnel", Integer.valueOf(requestStatistic.isTunnel ? 1 : 0));
            kVar.a("tunnelInfo", requestStatistic.tunnelInfo);
            kVar.a("cid", requestStatistic.cid);
            kVar.a("ipStackType", Integer.valueOf(requestStatistic.ipStackType));
            kVar.a("isBg", Integer.valueOf(!"fg".equalsIgnoreCase(requestStatistic.isBg) ? 1 : 0));
            kVar.a("falcoId", requestStatistic.falcoId);
            kVar.a("httpMethod", requestStatistic.httpMethod);
            kVar.a("connTimeoutInterval", Long.valueOf(requestStatistic.connTimeoutInterval));
            kVar.a("socketTimeoutInterval", Long.valueOf(requestStatistic.socketTimeoutInterval));
            if (requestStatistic.ret == 0) {
                str = "failed";
            } else {
                str = requestStatistic.ret == 1 ? "succeed" : "cancel";
            }
            kVar.b(str);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void log(IFullTraceAnalysisV3.ISpan iSpan, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8841c77d", new Object[]{this, iSpan, str, str2});
        } else if (!this.isAnalysisValid) {
            ALog.e(TAG, "[AnalysisV3] log, isAnalysisValid=false", null, new Object[0]);
        } else if (!this.isFalcoValid) {
            ALog.e(TAG, "[AnalysisV3] log, isFalcoValid=false", null, new Object[0]);
        } else if (iSpan == null) {
            ALog.e(TAG, "[AnalysisV3] log, span=null", null, new Object[0]);
        } else {
            ((k) iSpan.mo70getSpan()).a("module=network,stage=" + str + ",content=" + str2);
        }
    }

    @Override // anet.channel.fulltrace.IFullTraceAnalysisV3
    public void recordAppStatus(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad5503d", new Object[]{this, str, str2});
        } else if (!this.isAnalysisValid || !this.isFalcoValid) {
        } else {
            if (this.appStatusSpan == null) {
                this.appStatusSpan = this.falcoTracer.a("network", "Network_App_Status").d();
            }
            n nVar = this.appStatusSpan;
            nVar.f(str + "|" + str2);
        }
    }

    /* loaded from: classes.dex */
    public class SpanProxy implements IFullTraceAnalysisV3.ISpan<k> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final k span;

        static {
            kge.a(1672960578);
            kge.a(-1647071795);
        }

        public SpanProxy(k kVar) {
            this.span = kVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // anet.channel.fulltrace.IFullTraceAnalysisV3.ISpan
        /* renamed from: getSpan */
        public k mo70getSpan() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("6fbdec65", new Object[]{this}) : this.span;
        }
    }
}
