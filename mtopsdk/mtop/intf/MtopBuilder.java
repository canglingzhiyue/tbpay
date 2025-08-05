package mtopsdk.mtop.intf;

import android.os.Handler;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.k;
import com.taobao.analysis.v3.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.DefaultMtopCallback;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.common.listener.MtopBaseListenerProxy;
import mtopsdk.mtop.common.listener.MtopCacheListenerProxy;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.stat.PrefetchStatistics;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.mtop.util.RequestIdGenerator;
import mtopsdk.security.util.c;
import tb.kge;
import tb.mys;
import tb.ryh;
import tb.ryl;
import tb.tms;

/* loaded from: classes.dex */
public class MtopBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopBuilder";
    private Class<?> clazz;
    public MtopListener listener;
    public a mtopContext;
    public Mtop mtopInstance;
    public MtopPrefetch mtopPrefetch;
    public final MtopNetworkProp mtopProp;
    public MtopRequest request;
    @Deprecated
    public Object requestContext;
    public String requestId;
    public MtopStatistics stat;
    private boolean supportStreamJson;
    private boolean supportZstdDictionary;
    private boolean upstreamCompress;

    static {
        kge.a(-946863771);
    }

    @Deprecated
    /* renamed from: securitySignDegraded */
    public MtopBuilder mo1307securitySignDegraded(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("daa4780e", new Object[]{this, new Boolean(z)}) : this;
    }

    public MtopBuilder(Mtop mtop, IMTOPDataObject iMTOPDataObject, String str) {
        this(mtop, MtopConvert.inputDoToMtopRequest(iMTOPDataObject), str);
    }

    public MtopBuilder(Mtop mtop, MtopRequest mtopRequest, String str) {
        this.mtopProp = new MtopNetworkProp();
        this.listener = null;
        this.requestContext = null;
        this.stat = null;
        this.supportStreamJson = false;
        this.upstreamCompress = false;
        this.supportZstdDictionary = false;
        this.mtopInstance = mtop;
        this.request = mtopRequest;
        this.mtopProp.ttid = str;
        this.requestId = RequestIdGenerator.getRequestId();
        this.mtopProp.pageName = mtopsdk.xstate.a.a("PageName");
        this.mtopProp.pageUrl = mtopsdk.xstate.a.a("PageUrl");
        this.mtopProp.backGround = mtopsdk.xstate.a.b();
        this.stat = new MtopStatistics(mtop.getMtopConfig().uploadStats, mtop.getMtopConfig().mtopStatsListener, this.mtopProp);
    }

    @Deprecated
    public MtopBuilder(Mtop mtop, Object obj, String str) {
        this(mtop, MtopConvert.inputDoToMtopRequest(obj), str);
    }

    @Deprecated
    public MtopBuilder(IMTOPDataObject iMTOPDataObject, String str) {
        this(Mtop.instance(null), iMTOPDataObject, str);
    }

    @Deprecated
    public MtopBuilder(MtopRequest mtopRequest, String str) {
        this(Mtop.instance(null), mtopRequest, str);
    }

    @Deprecated
    public MtopBuilder(Object obj, String str) {
        this(Mtop.instance(null), obj, str);
    }

    /* renamed from: ttid */
    public MtopBuilder mo1332ttid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("bb33f3d8", new Object[]{this, str});
        }
        this.mtopProp.ttid = str;
        return this;
    }

    /* renamed from: reqContext */
    public MtopBuilder mo1338reqContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("cba91b00", new Object[]{this, obj});
        }
        this.mtopProp.reqContext = obj;
        return this;
    }

    public Object getReqContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5d3a0c4", new Object[]{this}) : this.mtopProp.reqContext;
    }

    public Mtop getMtopInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("3adfdfb5", new Object[]{this}) : this.mtopInstance;
    }

    public a getMtopContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("139fa7e9", new Object[]{this}) : this.mtopContext;
    }

    public MtopPrefetch getMtopPrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopPrefetch) ipChange.ipc$dispatch("122a29dc", new Object[]{this}) : this.mtopPrefetch;
    }

    /* renamed from: retryTime */
    public MtopBuilder mo1339retryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9abae993", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.retryTimes = i;
        return this;
    }

    /* renamed from: headers */
    public MtopBuilder mo1297headers(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("94930dc4", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            if (this.mtopProp.requestHeaders != null) {
                this.mtopProp.requestHeaders.putAll(map);
            } else {
                this.mtopProp.requestHeaders = map;
            }
        }
        return this;
    }

    /* renamed from: setCacheControlNoCache */
    public MtopBuilder mo1311setCacheControlNoCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9c41a4b7", new Object[]{this});
        }
        Map<String, String> map = this.mtopProp.requestHeaders;
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("cache-control", HttpHeaderConstant.NO_CACHE);
        this.mtopProp.requestHeaders = map;
        return this;
    }

    /* renamed from: protocol */
    public MtopBuilder mo1303protocol(ProtocolEnum protocolEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("5aec2180", new Object[]{this, protocolEnum});
        }
        if (protocolEnum != null) {
            this.mtopProp.protocol = protocolEnum;
        }
        return this;
    }

    public MtopBuilder setRouterId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("11ce5983", new Object[]{this, str});
        }
        this.mtopProp.routerId = str;
        return this;
    }

    public MtopBuilder setPlaceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("c351657d", new Object[]{this, str});
        }
        this.mtopProp.placeId = str;
        return this;
    }

    /* renamed from: allowSwitchToPOST */
    public MtopBuilder mo1293allowSwitchToPOST(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ed5c9481", new Object[]{this, new Boolean(z)});
        }
        this.mtopProp.allowSwitchToPOST = z;
        return this;
    }

    /* renamed from: setCustomDomain */
    public MtopBuilder mo1313setCustomDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("e9b9b354", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.customDomain = str;
        }
        return this;
    }

    /* renamed from: setCustomDomain */
    public MtopBuilder mo1314setCustomDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9e8ab968", new Object[]{this, str, str2, str3});
        }
        if (StringUtils.isNotBlank(str)) {
            this.mtopProp.customOnlineDomain = str;
        }
        if (StringUtils.isNotBlank(str2)) {
            this.mtopProp.customPreDomain = str2;
        }
        if (StringUtils.isNotBlank(str3)) {
            this.mtopProp.customDailyDomain = str3;
        }
        return this;
    }

    /* renamed from: setUnitStrategy */
    public MtopBuilder mo1328setUnitStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("f55b3fd6", new Object[]{this, str});
        }
        if (str != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -366328735) {
                if (hashCode != -354420023) {
                    if (hashCode == 1399582576 && str.equals(MtopUnitStrategy.UNIT_CENTER)) {
                        c = 2;
                    }
                } else if (str.equals("UNIT_TRADE")) {
                    c = 0;
                }
            } else if (str.equals("UNIT_GUIDE")) {
                c = 1;
            }
            if (c == 0) {
                mo1314setCustomDomain(MtopUnitStrategy.TRADE_ONLINE_DOMAIN, MtopUnitStrategy.TRADE_PRE_DOMAIN, MtopUnitStrategy.TRADE_DAILY_DOMAIN);
            } else if (c == 1) {
                mo1314setCustomDomain(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, MtopUnitStrategy.GUIDE_DAILY_DOMAIN);
            } else if (c == 2) {
                mo1314setCustomDomain(MtopUnitStrategy.CENTER_ONLINE_DOMAIN, MtopUnitStrategy.CENTER_PRE_DOMAIN, MtopUnitStrategy.CENTER_DAILY_DOMAIN);
            }
        }
        return this;
    }

    /* renamed from: addListener */
    public MtopBuilder mo1337addListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("87445341", new Object[]{this, mtopListener});
        }
        this.listener = mtopListener;
        return this;
    }

    /* renamed from: setNetInfo */
    public MtopBuilder mo1316setNetInfo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ed7c817f", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.netParam = i;
        return this;
    }

    /* renamed from: addMteeUa */
    public MtopBuilder mo1291addMteeUa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("7cb36731", new Object[]{this, str});
        }
        mo1289addHttpQueryParameter(MspGlobalDefine.UA, str);
        return this;
    }

    /* renamed from: addHttpQueryParameter */
    public MtopBuilder mo1289addHttpQueryParameter(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("62e92331", new Object[]{this, str, str2});
        }
        if (StringUtils.isBlank(str) || StringUtils.isBlank(str2)) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d(TAG, "[addHttpQueryParameter]add HttpQueryParameter error,key=" + str + ",value=" + str2);
            }
            return this;
        }
        if (this.mtopProp.queryParameterMap == null) {
            this.mtopProp.queryParameterMap = new HashMap();
        }
        this.mtopProp.queryParameterMap.put(str, str2);
        return this;
    }

    /* renamed from: handler */
    public MtopBuilder mo1296handler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("460204ad", new Object[]{this, handler});
        }
        this.mtopProp.handler = handler;
        return this;
    }

    /* renamed from: useCache */
    public MtopBuilder mo1334useCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("a35c7eae", new Object[]{this});
        }
        this.mtopProp.useCache = true;
        return this;
    }

    /* renamed from: forceRefreshCache */
    public MtopBuilder mo1295forceRefreshCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("8d418ea5", new Object[]{this});
        }
        this.mtopProp.forceRefreshCache = true;
        return this;
    }

    /* renamed from: useWua */
    public MtopBuilder mo1335useWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("1d74b66f", new Object[]{this}) : mo1336useWua(4);
    }

    @Deprecated
    /* renamed from: useWua */
    public MtopBuilder mo1336useWua(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("e977378c", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.wuaFlag = i;
        return this;
    }

    /* renamed from: reqMethod */
    public MtopBuilder mo1305reqMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("8bc358de", new Object[]{this, methodEnum});
        }
        if (methodEnum != null) {
            this.mtopProp.method = methodEnum;
        }
        return this;
    }

    /* renamed from: addCacheKeyParamBlackList */
    public MtopBuilder mo1288addCacheKeyParamBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("fb8550f2", new Object[]{this, list});
        }
        if (list != null) {
            this.mtopProp.cacheKeyBlackList = list;
        }
        return this;
    }

    /* renamed from: setJsonType */
    public MtopBuilder mo1315setJsonType(JsonTypeEnum jsonTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ad118c42", new Object[]{this, jsonTypeEnum});
        }
        if (jsonTypeEnum != null) {
            mo1289addHttpQueryParameter("type", jsonTypeEnum.getJsonType());
        }
        return this;
    }

    /* renamed from: addOpenApiParams */
    public MtopBuilder mo1292addOpenApiParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("2c73dbfc", new Object[]{this, str, str2});
        }
        this.mtopProp.apiType = ApiTypeEnum.ISV_OPEN_API;
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        mtopNetworkProp.openAppKey = str;
        mtopNetworkProp.accessToken = str2;
        return this;
    }

    /* renamed from: setConnectionTimeoutMilliSecond */
    public MtopBuilder mo1312setConnectionTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("d9e3efc8", new Object[]{this, new Integer(i)});
        }
        if (i > 0) {
            this.mtopProp.connTimeout = i;
        }
        return this;
    }

    /* renamed from: setSocketTimeoutMilliSecond */
    public MtopBuilder mo1326setSocketTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("4fae5153", new Object[]{this, new Integer(i)});
        }
        if (i > 0) {
            this.mtopProp.socketTimeout = i;
        }
        return this;
    }

    @Deprecated
    /* renamed from: setBizId */
    public MtopBuilder mo1340setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("5a33d7c", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.bizId = i;
        return this;
    }

    /* renamed from: setBizId */
    public MtopBuilder mo1309setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("396f8009", new Object[]{this, str});
        }
        this.mtopProp.bizIdStr = str;
        return this;
    }

    /* renamed from: setPageIndex */
    public MtopBuilder mo1319setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("d23cf667", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.pageIndex = i;
        return this;
    }

    /* renamed from: setBizTopic */
    public MtopBuilder mo1310setBizTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("cb1adf1b", new Object[]{this, str});
        }
        this.mtopProp.bizTopic = str;
        return this;
    }

    /* renamed from: setPTraceId */
    public MtopBuilder mo1318setPTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("b6213fef", new Object[]{this, str});
        }
        this.mtopProp.pTraceId = str;
        return this;
    }

    /* renamed from: setTraceId */
    public MtopBuilder mo1327setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("53b7233b", new Object[]{this, str});
        }
        this.mtopProp.fullTraceId = str;
        return this;
    }

    /* renamed from: setOpenTracingContext */
    public MtopBuilder mo1317setOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("67a8231", new Object[]{this, map});
        }
        this.mtopProp.openTraceContext = map;
        return this;
    }

    /* renamed from: setReqBizExt */
    public MtopBuilder mo1323setReqBizExt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("c907eec7", new Object[]{this, str});
        }
        this.mtopProp.reqBizExt = str;
        return this;
    }

    /* renamed from: setReqUserId */
    public MtopBuilder mo1325setReqUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("420fd8ff", new Object[]{this, str});
        }
        this.mtopProp.reqUserId = str;
        return this;
    }

    /* renamed from: setReqAppKey */
    public MtopBuilder mo1322setReqAppKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("688c7ac1", new Object[]{this, str, str2});
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        mtopNetworkProp.reqAppKey = str;
        mtopNetworkProp.authCode = str2;
        return this;
    }

    /* renamed from: setPageUrl */
    public MtopBuilder mo1321setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9bfdc25b", new Object[]{this, str});
        }
        if (str != null) {
            MtopNetworkProp mtopNetworkProp = this.mtopProp;
            mtopNetworkProp.pageUrl = str;
            this.stat.pageUrl = mtopNetworkProp.pageUrl;
        }
        return this;
    }

    /* renamed from: setPageName */
    public MtopBuilder mo1320setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("91cf29f9", new Object[]{this, str});
        }
        if (str != null) {
            MtopNetworkProp mtopNetworkProp = this.mtopProp;
            mtopNetworkProp.pageName = str;
            this.stat.pageName = mtopNetworkProp.pageName;
        }
        return this;
    }

    /* renamed from: setReqSource */
    public MtopBuilder mo1324setReqSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("4bc8cfd1", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.reqSource = i;
        return this;
    }

    /* renamed from: enableProgressListener */
    public MtopBuilder mo1294enableProgressListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("63dc7fd7", new Object[]{this});
        }
        this.mtopProp.enableProgressListener = true;
        return this;
    }

    public MtopBuilder setOpenBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("49e915e4", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.openBiz = str;
        }
        return this;
    }

    public MtopBuilder setMiniAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("25bc87f4", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.miniAppKey = str;
        }
        return this;
    }

    public MtopBuilder setRequestSourceAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("12857da3", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.requestSourceAppKey = str;
        }
        return this;
    }

    public MtopBuilder setOpenBizData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ba689d2e", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.openBizData = str;
        }
        return this;
    }

    /* renamed from: prefetch */
    public MtopBuilder mo1299prefetch(long j, List<String> list, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("79062584", new Object[]{this, new Long(j), list, iPrefetchCallback});
        }
        mo1300prefetch(j, iPrefetchCallback);
        MtopPrefetch mtopPrefetch = this.mtopPrefetch;
        if (mtopPrefetch != null) {
            mtopPrefetch.whiteListParams = list;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r1.contains(r0) != false) goto L17;
     */
    /* renamed from: prefetch */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mtopsdk.mtop.intf.MtopBuilder mo1300prefetch(long r6, mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback r8) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = mtopsdk.mtop.intf.MtopBuilder.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r6)
            r1[r2] = r3
            r6 = 2
            r1[r6] = r8
            java.lang.String r6 = "6e196e93"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            mtopsdk.mtop.intf.MtopBuilder r6 = (mtopsdk.mtop.intf.MtopBuilder) r6
            return r6
        L20:
            mtopsdk.mtop.intf.MtopPrefetch r0 = r5.mtopPrefetch
            if (r0 != 0) goto L38
            mtopsdk.mtop.intf.MtopPrefetch r0 = new mtopsdk.mtop.intf.MtopPrefetch
            mtopsdk.mtop.stat.PrefetchStatistics r1 = new mtopsdk.mtop.stat.PrefetchStatistics
            mtopsdk.mtop.intf.Mtop r4 = r5.mtopInstance
            mtopsdk.mtop.global.MtopConfig r4 = r4.getMtopConfig()
            mtopsdk.mtop.stat.IUploadStats r4 = r4.uploadStats
            r1.<init>(r4)
            r0.<init>(r1)
            r5.mtopPrefetch = r0
        L38:
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L65
            mtopsdk.mtop.domain.MtopRequest r0 = r5.request
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.getKey()
            mtopsdk.mtop.global.SwitchConfig r1 = mtopsdk.mtop.global.SwitchConfig.getInstance()
            java.util.Set<java.lang.String> r1 = r1.allowCustomPrefetchExpireTimeApiSet
            if (r1 == 0) goto L55
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r2 = 0
        L56:
            mtopsdk.mtop.intf.MtopPrefetch r0 = r5.mtopPrefetch
            r3 = 15000(0x3a98, double:7.411E-320)
            if (r2 != 0) goto L62
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 > 0) goto L61
            goto L62
        L61:
            r6 = r3
        L62:
            r0.setPrefetchExpireTime(r6)
        L65:
            mtopsdk.mtop.intf.MtopPrefetch r6 = r5.mtopPrefetch
            r6.setCallback(r8)
            mtopsdk.mtop.intf.MtopPrefetch r6 = r5.mtopPrefetch
            mtopsdk.mtop.intf.MtopPrefetch$IPrefetchComparator r6 = r6.getComparator()
            if (r6 != 0) goto L7c
            mtopsdk.mtop.intf.MtopPrefetch r6 = r5.mtopPrefetch
            mtopsdk.mtop.intf.MtopPrefetch$DefaultPrefetchComparator r7 = new mtopsdk.mtop.intf.MtopPrefetch$DefaultPrefetchComparator
            r7.<init>()
            r6.setComparator(r7)
        L7c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.intf.MtopBuilder.mo1300prefetch(long, mtopsdk.mtop.intf.MtopPrefetch$IPrefetchCallback):mtopsdk.mtop.intf.MtopBuilder");
    }

    /* renamed from: prefetch */
    public MtopBuilder mo1298prefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("2fa1bb6a", new Object[]{this}) : mo1300prefetch(0L, null);
    }

    /* renamed from: prefetchMode */
    public MtopBuilder mo1302prefetchMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("876378ce", new Object[]{this, new Integer(i)});
        }
        if (this.mtopPrefetch == null) {
            this.mtopPrefetch = new MtopPrefetch(new PrefetchStatistics(this.mtopInstance.getMtopConfig().uploadStats));
        }
        TBSdkLog.e(TAG, "[prefetchMode]mode=" + i);
        this.mtopPrefetch.setPrefetchMode(i);
        return this;
    }

    /* renamed from: prefetchComparator */
    public MtopBuilder mo1301prefetchComparator(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("f0b2ac50", new Object[]{this, iPrefetchComparator});
        }
        if (this.mtopPrefetch == null) {
            this.mtopPrefetch = new MtopPrefetch(new PrefetchStatistics(this.mtopInstance.getMtopConfig().uploadStats));
        }
        this.mtopPrefetch.setComparator(iPrefetchComparator);
        return this;
    }

    public MtopResponse syncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("bac48c0", new Object[]{this});
        }
        this.stat.isReqSync = true;
        MtopBaseListenerProxy createListenerProxy = createListenerProxy(this.listener);
        asyncRequest(createListenerProxy);
        synchronized (createListenerProxy) {
            try {
                if (createListenerProxy.response == null) {
                    createListenerProxy.wait(60000L);
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, "[syncRequest] callback wait error", e);
            }
        }
        MtopResponse mtopResponse = createListenerProxy.response;
        if (createListenerProxy.reqContext != null) {
            this.mtopProp.reqContext = createListenerProxy.reqContext;
        }
        return mtopResponse != null ? mtopResponse : handleAsyncTimeoutException();
    }

    public MtopResponse handleAsyncTimeoutException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("eb2c13b2", new Object[]{this});
        }
        MtopResponse mtopResponse = new MtopResponse(this.request.getApiName(), this.request.getVersion(), ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT, ErrorConstant.MappingMsg.SERVICE_MAPPING_MSG);
        mtopResponse.mappingCodeSuffix = ErrorConstant.getMappingCodeByErrorCode(mtopResponse.getRetCode());
        mtopResponse.mappingCode = ErrorConstant.appendMappingCode(mtopResponse.getResponseCode(), mtopResponse.mappingCodeSuffix);
        this.stat.retCode = mtopResponse.getRetCode();
        this.stat.mappingCode = mtopResponse.getMappingCode();
        MtopStatistics mtopStatistics = this.stat;
        mtopStatistics.retType = 2;
        mtopResponse.setMtopStat(mtopStatistics);
        this.stat.onEndAndCommit();
        this.stat.commitFullTrace();
        return mtopResponse;
    }

    private ApiID asyncRequest(MtopListener mtopListener) {
        String createRequest;
        mys a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("78073e9", new Object[]{this, mtopListener});
        }
        MtopStatistics mtopStatistics = this.stat;
        mtopStatistics.startTime = mtopStatistics.currentTimeMillis();
        final a createMtopContext = createMtopContext(mtopListener);
        createMtopContext.g.instanceId = createMtopContext.f25000a.getInstanceId();
        createMtopContext.g.isJsTimeoutEnable = this.mtopProp.isTimeoutEnable;
        createMtopContext.g.ttid = this.mtopProp.ttid;
        this.mtopContext = createMtopContext;
        createMtopContext.f = new ApiID(null, createMtopContext);
        try {
            if (Mtop.mIsFullTrackValid) {
                if (!TextUtils.isEmpty(this.mtopProp.fullTraceId)) {
                    createRequest = this.mtopProp.fullTraceId;
                } else {
                    createRequest = FullTraceAnalysis.getInstance().createRequest("mtop");
                }
                r rVar = FalcoGlobalTracer.get();
                if (rVar != null) {
                    r.a a3 = rVar.a("mtop", "MTOP_UnknownScene");
                    if (this.mtopProp.openTraceContext != null && !this.mtopProp.openTraceContext.isEmpty() && (a2 = rVar.a(this.mtopProp.openTraceContext)) != null) {
                        a3.a(a2);
                    }
                    k d = a3.d();
                    createMtopContext.g.openTraceSpan = d;
                    createMtopContext.g.openTraceContext = rVar.a(d.h());
                }
                if (!TextUtils.isEmpty(createRequest)) {
                    createMtopContext.g.falcoId = createRequest;
                    createMtopContext.g.fullTraceId = createMtopContext.g.falcoId;
                    if (!TextUtils.isEmpty(this.mtopProp.bizIdStr)) {
                        createMtopContext.g.bizIdStr = this.mtopProp.bizIdStr;
                    } else {
                        createMtopContext.g.bizId = this.mtopProp.bizId;
                    }
                    createMtopContext.g.pageIndex = this.mtopProp.pageIndex;
                    createMtopContext.g.bizTopic = this.mtopProp.bizTopic;
                    createMtopContext.g.pTraceId = this.mtopProp.pTraceId;
                    createMtopContext.g.isReqMain = MtopUtils.isMainThread();
                    createMtopContext.g.formatStartLog();
                    FullTraceHelper.recordReqStart(createMtopContext.g, createMtopContext.b.getKey());
                }
            }
            if (createMtopContext.f25000a.mtopConfig.requestStListener != null) {
                try {
                    createMtopContext.f25000a.mtopConfig.requestStListener.onRequest(createMtopContext.o);
                } catch (Exception e) {
                    TBSdkLog.e(TAG, "[asyncRequest] requestStListener onRequest error", e);
                }
            }
            if (!MtopUtils.isMainThread() && this.mtopInstance.isInited()) {
                tms.a("mtop_startExecute", createMtopContext.h);
                createMtopContext.g.startExecuteTime = this.stat.currentTimeMillis();
                FullTraceHelper.recordReqProcessStart(createMtopContext.g);
                ryh ryhVar = this.mtopInstance.getMtopConfig().filterManager;
                if (ryhVar != null) {
                    ryhVar.a(null, createMtopContext);
                }
                ryl.a(ryhVar, createMtopContext);
                tms.b();
                return createMtopContext.f;
            }
            MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor().submit(new Runnable() { // from class: mtopsdk.mtop.intf.MtopBuilder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    tms.a("mtop_waitExecute", createMtopContext.h);
                    FullTraceHelper.recordReqProcessStart(createMtopContext.g);
                    createMtopContext.g.startExecuteTime = MtopBuilder.this.stat.currentTimeMillis();
                    if (MtopBuilder.this.mtopInstance.isInited() || !c.a(createMtopContext)) {
                        MtopBuilder.this.mtopInstance.checkMtopSDKInit();
                    } else {
                        MtopBuilder.this.mtopInstance.checkMtopSDKSignDegradeInit();
                    }
                    tms.b();
                    tms.a("mtop_startExecute", createMtopContext.h);
                    ryh ryhVar2 = MtopBuilder.this.mtopInstance.getMtopConfig().filterManager;
                    if (ryhVar2 != null) {
                        ryhVar2.a(null, createMtopContext);
                    }
                    ryl.a(ryhVar2, createMtopContext);
                    tms.b();
                }
            });
            return createMtopContext.f;
        } catch (Throwable unused) {
            return createMtopContext.f;
        }
    }

    public ApiID asyncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("5aecb610", new Object[]{this});
        }
        this.stat.isReqSync = false;
        return asyncRequest(this.listener);
    }

    public a createMtopContext(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("55b2f556", new Object[]{this, mtopListener});
        }
        a aVar = new a();
        aVar.f25000a = this.mtopInstance;
        MtopStatistics mtopStatistics = this.stat;
        aVar.g = mtopStatistics;
        aVar.h = mtopStatistics.seqNo;
        MtopRequest mtopRequest = this.request;
        aVar.b = mtopRequest;
        aVar.d = this.mtopProp;
        aVar.e = mtopListener;
        aVar.o = this;
        boolean z = this.supportStreamJson;
        aVar.q = z;
        boolean z2 = this.upstreamCompress;
        aVar.s = z2;
        boolean z3 = this.supportZstdDictionary;
        aVar.t = z3;
        aVar.r = this.clazz;
        MtopStatistics mtopStatistics2 = this.stat;
        mtopStatistics2.supportStreamJson = z;
        mtopStatistics2.upstreamCompress = z2;
        mtopStatistics2.supportZstdDictionary = z3;
        if (mtopRequest != null) {
            mtopStatistics2.apiKey = mtopRequest.getKey();
            this.stat.reqSource = this.mtopProp.reqSource;
        }
        if (StringUtils.isBlank(aVar.d.ttid)) {
            aVar.d.ttid = this.mtopInstance.getTtid();
        }
        Object obj = this.requestContext;
        if (obj != null) {
            mo1338reqContext(obj);
        }
        return aVar;
    }

    private MtopBaseListenerProxy createListenerProxy(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBaseListenerProxy) ipChange.ipc$dispatch("33420e67", new Object[]{this, mtopListener});
        }
        if (mtopListener == null) {
            return new MtopBaseListenerProxy(new DefaultMtopCallback());
        }
        if (mtopListener instanceof MtopCallback.MtopCacheListener) {
            return new MtopCacheListenerProxy(mtopListener);
        }
        return new MtopBaseListenerProxy(mtopListener);
    }

    public void mtopCommitStatData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79cef0", new Object[]{this, new Boolean(z)});
        } else {
            this.stat.commitStat = z;
        }
    }

    /* renamed from: setUserInfo */
    public MtopBuilder mo1329setUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("8c17fdd8", new Object[]{this, str});
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        mtopNetworkProp.userInfo = str;
        return this;
    }

    /* renamed from: supportStreamJson */
    public MtopBuilder mo1330supportStreamJson(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("fed52242", new Object[]{this, new Boolean(z)});
        }
        this.supportStreamJson = z;
        return this;
    }

    public void setClazz(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69c1040", new Object[]{this, cls});
        } else {
            this.clazz = cls;
        }
    }

    /* renamed from: upstreamCompress */
    public MtopBuilder mo1333upstreamCompress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("41b643dc", new Object[]{this, new Boolean(z)});
        }
        this.upstreamCompress = z;
        return this;
    }

    /* renamed from: supportZstdDictionary */
    public MtopBuilder mo1331supportZstdDictionary(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("76b68a0b", new Object[]{this, new Boolean(z)});
        }
        this.supportZstdDictionary = z;
        return this;
    }
}
