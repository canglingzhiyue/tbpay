package com.taobao.tao.remotebusiness;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.stat.IMtopMonitor;
import mtopsdk.mtop.stat.MtopMonitor;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class MtopBusiness extends MtopBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_RETRY_TIMES = 3;
    private static final String TAG = "mtopsdk.MtopBusiness";
    private static AtomicInteger seqGen;
    private boolean allowParseJson;
    private ApiID apiID;
    public String authParam;
    public Class<?> clazz;
    public boolean isCached;
    private boolean isCancelled;
    private boolean isErrorNotifyAfterCache;
    public MtopListener listener;
    private boolean mForbidStreamExceptionCallback;
    private MtopResponse mtopResponse;
    private boolean needAuth;
    public long onBgFinishTime;
    public long onStreamFirstResReadyTime;
    public long reqStartTime;
    @Deprecated
    public Object requestContext;
    public int requestType;
    public int retryTime;
    public long sendStartTime;
    private final String seqNo;
    public boolean showAuthUI;
    private boolean showLoginUI;
    private boolean syncRequestFlag;

    public static /* synthetic */ Object ipc$super(MtopBusiness mtopBusiness, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2025565375:
                return super.mo1337addListener((MtopListener) objArr[0]);
            case -2023524146:
                return super.mo1302prefetchMode(((Number) objArr[0]).intValue());
            case -1950132002:
                return super.mo1305reqMethod((MethodEnum) objArr[0]);
            case -1944584744:
                return super.mo1329setUserInfo((String) objArr[0]);
            case -1925083483:
                return super.mo1295forceRefreshCache();
            case -1848694279:
                return super.mo1320setPageName((String) objArr[0]);
            case -1802302012:
                return super.mo1297headers((Map) objArr[0]);
            case -1699026541:
                return super.mo1339retryTime(((Number) objArr[0]).intValue());
            case -1677868453:
                return super.mo1321setPageUrl((String) objArr[0]);
            case -1673419593:
                return super.mo1311setCacheControlNoCache();
            case -1635075736:
                return super.mo1314setCustomDomain((String) objArr[0], (String) objArr[1], (String) objArr[2]);
            case -1554219346:
                return super.mo1334useCache();
            case -1391358910:
                return super.mo1315setJsonType((JsonTypeEnum) objArr[0]);
            case -1239334929:
                return super.mo1318setPTraceId((String) objArr[0]);
            case -1154223144:
                return super.mo1332ttid((String) objArr[0]);
            case -922227001:
                return super.mo1323setReqBizExt((String) objArr[0]);
            case -887431397:
                return super.mo1310setBizTopic((String) objArr[0]);
            case -878109952:
                return super.mo1338reqContext(objArr[0]);
            case -767756697:
                return super.mo1319setPageIndex(((Number) objArr[0]).intValue());
            case -639373368:
                return super.mo1312setConnectionTimeoutMilliSecond(((Number) objArr[0]).intValue());
            case -626755570:
                return super.mo1307securitySignDegraded(((Boolean) objArr[0]).booleanValue());
            case -378062964:
                return super.mo1336useWua(((Number) objArr[0]).intValue());
            case -373705900:
                return super.mo1313setCustomDomain((String) objArr[0]);
            case -312699775:
                return super.mo1293allowSwitchToPOST(((Boolean) objArr[0]).booleanValue());
            case -310607489:
                return super.mo1316setNetInfo(((Number) objArr[0]).intValue());
            case -256725936:
                return super.mo1301prefetchComparator((MtopPrefetch.IPrefetchComparator) objArr[0]);
            case -178569258:
                return super.mo1328setUnitStrategy((String) objArr[0]);
            case -75149070:
                return super.mo1288addCacheKeyParamBlackList((List) objArr[0]);
            case -19586494:
                return super.mo1330supportStreamJson(((Boolean) objArr[0]).booleanValue());
            case 94584188:
                return super.mo1340setBizId(((Number) objArr[0]).intValue());
            case 108692017:
                return super.mo1317setOpenTracingContext((Map) objArr[0]);
            case 494188143:
                return super.mo1335useWua();
            case 745790460:
                return super.mo1292addOpenApiParams((String) objArr[0], (String) objArr[1]);
            case 963608585:
                return super.mo1309setBizId((String) objArr[0]);
            case 1102463964:
                return super.mo1333upstreamCompress(((Boolean) objArr[0]).booleanValue());
            case 1108334847:
                return super.mo1325setReqUserId((String) objArr[0]);
            case 1174537389:
                return super.mo1296handler((Handler) objArr[0]);
            case 1271451601:
                return super.mo1324setReqSource(((Number) objArr[0]).intValue());
            case 1336824147:
                return super.mo1326setSocketTimeoutMilliSecond(((Number) objArr[0]).intValue());
            case 1404511035:
                return super.mo1327setTraceId((String) objArr[0]);
            case 1525424512:
                return super.mo1303protocol((ProtocolEnum) objArr[0]);
            case 1525462544:
                return super.asyncRequest();
            case 1659446065:
                return super.mo1289addHttpQueryParameter((String) objArr[0], (String) objArr[1]);
            case 1675395031:
                return super.mo1294enableProgressListener();
            case 1754036929:
                return super.mo1322setReqAppKey((String) objArr[0], (String) objArr[1]);
            case 1847160467:
                return super.mo1300prefetch(((Number) objArr[0]).longValue(), (MtopPrefetch.IPrefetchCallback) objArr[1]);
            case 1991674379:
                return super.mo1331supportZstdDictionary(((Boolean) objArr[0]).booleanValue());
            case 2030445956:
                return super.mo1299prefetch(((Number) objArr[0]).longValue(), (List) objArr[1], (MtopPrefetch.IPrefetchCallback) objArr[2]);
            case 2092132145:
                return super.mo1291addMteeUa((String) objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: addCacheKeyParamBlackList  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MtopBuilder mo1288addCacheKeyParamBlackList(List list) {
        return mo1288addCacheKeyParamBlackList((List<String>) list);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: headers  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MtopBuilder mo1297headers(Map map) {
        return mo1297headers((Map<String, String>) map);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: prefetch  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MtopBuilder mo1299prefetch(long j, List list, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        return mo1299prefetch(j, (List<String>) list, iPrefetchCallback);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setOpenTracingContext  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ MtopBuilder mo1317setOpenTracingContext(Map map) {
        return mo1317setOpenTracingContext((Map<String, String>) map);
    }

    static {
        kge.a(-2053148239);
        seqGen = new AtomicInteger(0);
    }

    public MtopBusiness(Mtop mtop, IMTOPDataObject iMTOPDataObject, String str) {
        super(mtop, iMTOPDataObject, str);
        this.isCancelled = false;
        this.retryTime = 0;
        this.requestType = 0;
        this.requestContext = null;
        this.showLoginUI = true;
        this.isErrorNotifyAfterCache = false;
        this.authParam = null;
        this.showAuthUI = true;
        this.needAuth = false;
        this.isCached = false;
        this.reqStartTime = 0L;
        this.onBgFinishTime = 0L;
        this.sendStartTime = 0L;
        this.onStreamFirstResReadyTime = 0L;
        this.mtopResponse = null;
        this.syncRequestFlag = false;
        this.allowParseJson = true;
        this.mForbidStreamExceptionCallback = false;
        this.seqNo = genSeqNo();
    }

    public MtopBusiness(Mtop mtop, MtopRequest mtopRequest, String str) {
        super(mtop, mtopRequest, str);
        this.isCancelled = false;
        this.retryTime = 0;
        this.requestType = 0;
        this.requestContext = null;
        this.showLoginUI = true;
        this.isErrorNotifyAfterCache = false;
        this.authParam = null;
        this.showAuthUI = true;
        this.needAuth = false;
        this.isCached = false;
        this.reqStartTime = 0L;
        this.onBgFinishTime = 0L;
        this.sendStartTime = 0L;
        this.onStreamFirstResReadyTime = 0L;
        this.mtopResponse = null;
        this.syncRequestFlag = false;
        this.allowParseJson = true;
        this.mForbidStreamExceptionCallback = false;
        this.seqNo = genSeqNo();
    }

    private String genSeqNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e60a3be9", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("MB");
        sb.append(seqGen.incrementAndGet());
        sb.append('.');
        sb.append(this.stat.seqNo);
        return sb.toString();
    }

    public static MtopBusiness build(Mtop mtop, IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("4b039f10", new Object[]{mtop, iMTOPDataObject, str}) : new MtopBusiness(mtop, iMTOPDataObject, str);
    }

    public static MtopBusiness build(Mtop mtop, IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("ef8e209a", new Object[]{mtop, iMTOPDataObject}) : build(mtop, iMTOPDataObject, (String) null);
    }

    @Deprecated
    public static MtopBusiness build(IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("7ce57bb7", new Object[]{iMTOPDataObject, str}) : build(Mtop.instance((Context) null, str), iMTOPDataObject, str);
    }

    @Deprecated
    public static MtopBusiness build(IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("cb74a901", new Object[]{iMTOPDataObject}) : build(Mtop.instance(null), iMTOPDataObject);
    }

    public static MtopBusiness build(Mtop mtop, MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("18cb89d", new Object[]{mtop, mtopRequest, str}) : new MtopBusiness(mtop, mtopRequest, str);
    }

    public static MtopBusiness build(Mtop mtop, MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("71977367", new Object[]{mtop, mtopRequest}) : build(mtop, mtopRequest, (String) null);
    }

    @Deprecated
    public static MtopBusiness build(MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("caad00c4", new Object[]{mtopRequest, str}) : build(Mtop.instance((Context) null, str), mtopRequest, str);
    }

    @Deprecated
    public static MtopBusiness build(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("b68474e", new Object[]{mtopRequest}) : build(Mtop.instance(null), mtopRequest, (String) null);
    }

    @Deprecated
    public MtopBusiness registerListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("5ca09efd", new Object[]{this, mtopListener});
        }
        this.listener = mtopListener;
        return this;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    /* renamed from: addListener */
    public MtopBusiness mo1337addListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("2e90debf", new Object[]{this, mtopListener});
        }
        this.listener = mtopListener;
        return this;
    }

    public MtopBusiness registerListener(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("8cd91a0b", new Object[]{this, iRemoteListener});
        }
        this.listener = iRemoteListener;
        return this;
    }

    public String getSeqNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3df0a06f", new Object[]{this}) : this.seqNo;
    }

    public void startRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb849d4", new Object[]{this});
        } else {
            startRequest(0, null);
        }
    }

    public void startRequest(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf6fe9", new Object[]{this, cls});
        } else {
            startRequest(0, cls);
        }
    }

    public void startRequest(int i, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f537e76e", new Object[]{this, new Integer(i), cls});
        } else if (this.request == null) {
            TBSdkLog.e(TAG, this.seqNo, "MtopRequest is null!");
        } else {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                String str = this.seqNo;
                TBSdkLog.i(TAG, str, "startRequest " + this.request);
            }
            if ((this.mtopProp.streamMode && !(this.listener instanceof IMtopStreamListener)) || (!this.mtopProp.streamMode && (this.listener instanceof IMtopStreamListener))) {
                TBSdkLog.e(TAG, this.seqNo, "listener not match streamMode");
                return;
            }
            this.reqStartTime = System.currentTimeMillis();
            this.isCancelled = false;
            this.isCached = false;
            this.clazz = cls;
            setClazz(cls);
            this.requestType = i;
            Object obj = this.requestContext;
            if (obj != null) {
                mo1338reqContext(obj);
            }
            MtopListener mtopListener = this.listener;
            if (mtopListener != null && !this.isCancelled) {
                super.mo1337addListener(com.taobao.tao.remotebusiness.listener.c.a(this, mtopListener));
            }
            mtopCommitStatData(false);
            this.sendStartTime = System.currentTimeMillis();
            this.apiID = super.asyncRequest();
        }
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopResponse syncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("bac48c0", new Object[]{this});
        }
        if (this.mtopProp.streamMode) {
            TBSdkLog.e(TAG, this.seqNo, "Streaming requests do not support synchronous requests");
            return null;
        }
        String key = this.request != null ? this.request.getKey() : "";
        if (MtopUtils.isMainThread()) {
            TBSdkLog.e(TAG, this.seqNo, "do syncRequest in UI main thread!");
        }
        this.syncRequestFlag = true;
        if (this.listener == null) {
            this.listener = new IRemoteBaseListener() { // from class: com.taobao.tao.remotebusiness.MtopBusiness.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }
            };
        }
        startRequest();
        synchronized (this.listener) {
            try {
                try {
                    if (this.mtopResponse == null) {
                        this.listener.wait(60000L);
                    }
                } catch (Exception unused) {
                    String str = this.seqNo;
                    TBSdkLog.e(TAG, str, "syncRequest do wait Exception. apiKey=" + key);
                }
            } catch (InterruptedException unused2) {
                String str2 = this.seqNo;
                TBSdkLog.e(TAG, str2, "syncRequest InterruptedException. apiKey=" + key);
            }
        }
        if (this.mtopResponse == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                String str3 = this.seqNo;
                TBSdkLog.w(TAG, str3, "syncRequest timeout. apiKey=" + key);
            }
            cancelRequest();
        }
        MtopResponse mtopResponse = this.mtopResponse;
        return mtopResponse != null ? mtopResponse : handleAsyncTimeoutException();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    public ApiID asyncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("5aecb610", new Object[]{this});
        }
        startRequest();
        return this.apiID;
    }

    public int getRequestType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5651102d", new Object[]{this})).intValue() : this.requestType;
    }

    public boolean isTaskCanceled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce9d3c13", new Object[]{this})).booleanValue() : this.isCancelled;
    }

    public int getRetryTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue() : this.retryTime;
    }

    public void cancelRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a20bc", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, this.seqNo, getRequestLogInfo("cancelRequest.", this));
        }
        this.isCancelled = true;
        ApiID apiID = this.apiID;
        if (apiID == null) {
            return;
        }
        try {
            apiID.cancelApiCall();
        } catch (Throwable th) {
            TBSdkLog.w(TAG, this.seqNo, getRequestLogInfo("cancelRequest failed.", this), th);
        }
    }

    public void retryRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03963ce", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, this.seqNo, getRequestLogInfo("retryRequest.", this));
        }
        if (this.retryTime >= 3) {
            this.retryTime = 0;
            doFinish(this.mtopContext.c, null);
            return;
        }
        cancelRequest();
        startRequest(this.requestType, this.clazz);
        this.retryTime++;
    }

    /* renamed from: showLoginUI */
    public MtopBusiness mo1342showLoginUI(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("b7f2a7a7", new Object[]{this, new Boolean(z)});
        }
        this.showLoginUI = z;
        return this;
    }

    public boolean isShowLoginUI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff889001", new Object[]{this})).booleanValue() : this.showLoginUI;
    }

    public MtopBusiness setNeedAuth(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("12c4a291", new Object[]{this, str, new Boolean(z)});
        }
        this.authParam = str;
        this.showAuthUI = z;
        this.needAuth = true;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[setNeedAuth] authParam=");
            sb.append(str);
            sb.append(", showAuthUI=");
            sb.append(z);
            sb.append(", needAuth=");
            sb.append(this.needAuth);
            TBSdkLog.d(TAG, this.seqNo, sb.toString());
        }
        return this;
    }

    public MtopBusiness setNeedAuth(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("28d94b1b", new Object[]{this, str, str2, new Boolean(z)});
        }
        this.mtopProp.apiType = ApiTypeEnum.ISV_OPEN_API;
        this.mtopProp.isInnerOpen = true;
        if (StringUtils.isNotBlank(str)) {
            this.mtopProp.openAppKey = str;
        }
        this.authParam = str2;
        this.showAuthUI = z;
        this.needAuth = true;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[setNeedAuth] openAppKey=");
            sb.append(str);
            sb.append(", bizParam=");
            sb.append(str2);
            sb.append(", showAuthUI=");
            sb.append(z);
            sb.append(", needAuth=");
            sb.append(this.needAuth);
            sb.append(", isInnerOpen=true");
            TBSdkLog.d(TAG, this.seqNo, sb.toString());
        }
        return this;
    }

    public boolean isNeedAuth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("840a3733", new Object[]{this})).booleanValue() : this.needAuth || this.authParam != null;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: addOpenApiParams */
    public MtopBusiness mo1292addOpenApiParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("7de09de4", new Object[]{this, str, str2}) : (MtopBusiness) super.mo1292addOpenApiParams(str, str2);
    }

    /* renamed from: setErrorNotifyAfterCache */
    public MtopBusiness mo1341setErrorNotifyAfterCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("a6bfe9bc", new Object[]{this, new Boolean(z)});
        }
        this.isErrorNotifyAfterCache = z;
        return this;
    }

    @Deprecated
    public void setErrorNotifyNeedAfterCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8462a42", new Object[]{this, new Boolean(z)});
        } else {
            mo1341setErrorNotifyAfterCache(z);
        }
    }

    public void doFinish(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b6150", new Object[]{this, mtopResponse, baseOutDo});
            return;
        }
        if (this.syncRequestFlag) {
            this.mtopResponse = mtopResponse;
            synchronized (this.listener) {
                try {
                    this.listener.notify();
                } catch (Exception e) {
                    String str = this.seqNo;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[doFinish]syncRequest do notify Exception. apiKey=");
                    sb.append(mtopResponse != null ? mtopResponse.getFullKey() : "");
                    TBSdkLog.e(TAG, str, sb.toString(), e);
                }
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("doFinish request=");
            sb2.append(this.request);
            if (mtopResponse != null) {
                sb2.append(", retCode=");
                sb2.append(mtopResponse.getRetCode());
            }
            TBSdkLog.i(TAG, this.seqNo, sb2.toString());
        }
        if (this.isCancelled) {
            TBSdkLog.w(TAG, this.seqNo, "request is cancelled,don't callback listener.");
            return;
        }
        MtopListener mtopListener = this.listener;
        if (!(mtopListener instanceof IRemoteListener)) {
            String str2 = this.seqNo;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("listener did't implement IRemoteBaseListener.apiKey=");
            sb3.append(mtopResponse != null ? mtopResponse.getFullKey() : "");
            TBSdkLog.e(TAG, str2, sb3.toString());
            return;
        }
        IRemoteListener iRemoteListener = (IRemoteListener) mtopListener;
        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            long currentTimeMillis = this.stat.currentTimeMillis();
            this.stat.callbackPocTime = currentTimeMillis - this.stat.netSendEndTime;
            this.stat.allTime = currentTimeMillis - this.stat.startTime;
            MtopStatistics mtopStatistics = this.stat;
            if (this.mtopContext.d.handler == null) {
                z = false;
            }
            mtopStatistics.handler = z;
            try {
                iRemoteListener.onSuccess(this.requestType, mtopResponse, baseOutDo, getReqContext());
                if (MtopMonitor.getInstance() != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put(IMtopMonitor.DATA_RESPONSE, mtopResponse.getApi());
                    MtopMonitor.getInstance().onCommit(IMtopMonitor.MtopMonitorType.TYPE_CALLBACK, hashMap);
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.seqNo, "listener onSuccess callback error", th);
            }
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, this.seqNo, "listener onSuccess callback.");
        } else if (this.isCached && !this.isErrorNotifyAfterCache) {
            TBSdkLog.i(TAG, this.seqNo, "listener onCached callback,doNothing in doFinish()");
        } else {
            doErrorCallback(mtopResponse, iRemoteListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[Catch: Throwable -> 0x00d7, TryCatch #0 {Throwable -> 0x00d7, blocks: (B:26:0x0099, B:28:0x009d, B:30:0x00b2, B:32:0x00b8, B:34:0x00c2, B:36:0x00ca, B:29:0x00a9), top: B:48:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doErrorCallback(mtopsdk.mtop.domain.MtopResponse r6, com.taobao.tao.remotebusiness.IRemoteListener r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.MtopBusiness.doErrorCallback(mtopsdk.mtop.domain.MtopResponse, com.taobao.tao.remotebusiness.IRemoteListener):void");
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    /* renamed from: setBizId */
    public MtopBusiness mo1340setBizId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("415bac64", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1340setBizId(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setBizId */
    public MtopBusiness mo1309setBizId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("2e32b6f7", new Object[]{this, str}) : (MtopBusiness) super.mo1309setBizId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setPageIndex */
    public MtopBusiness mo1319setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("34e50959", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1319setPageIndex(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setBizTopic */
    public MtopBusiness mo1310setBizTopic(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("19d1e525", new Object[]{this, str}) : (MtopBusiness) super.mo1310setBizTopic(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setPTraceId */
    public MtopBusiness mo1318setPTraceId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("ffd27cd1", new Object[]{this, str}) : (MtopBusiness) super.mo1318setPTraceId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setTraceId */
    public MtopBusiness mo1327setTraceId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("93fd5505", new Object[]{this, str}) : (MtopBusiness) super.mo1327setTraceId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setOpenTracingContext */
    public MtopBusiness mo1317setOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("314275cf", new Object[]{this, map}) : (MtopBusiness) super.mo1317setOpenTracingContext(map);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: ttid */
    public MtopBusiness mo1332ttid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("eed72b88", new Object[]{this, str}) : (MtopBusiness) super.mo1332ttid(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: useCache */
    public MtopBusiness mo1334useCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e5c56c72", new Object[]{this}) : (MtopBusiness) super.mo1334useCache();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: useWua */
    public MtopBusiness mo1335useWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("81339651", new Object[]{this}) : (MtopBusiness) super.mo1335useWua();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    /* renamed from: useWua */
    public MtopBusiness mo1336useWua(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("212a8c54", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1336useWua(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: addHttpQueryParameter */
    public MtopBusiness mo1289addHttpQueryParameter(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("736174cf", new Object[]{this, str, str2}) : (MtopBusiness) super.mo1289addHttpQueryParameter(str, str2);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: addCacheKeyParamBlackList */
    public MtopBusiness mo1288addCacheKeyParamBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("fceb68ae", new Object[]{this, list}) : (MtopBusiness) super.mo1288addCacheKeyParamBlackList(list);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: addMteeUa */
    public MtopBusiness mo1291addMteeUa(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("fb65b0cf", new Object[]{this, str}) : (MtopBusiness) super.mo1291addMteeUa(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: enableProgressListener */
    public MtopBusiness mo1294enableProgressListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("ff9455e9", new Object[]{this}) : (MtopBusiness) super.mo1294enableProgressListener();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: forceRefreshCache */
    public MtopBusiness mo1295forceRefreshCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e3ce45db", new Object[]{this}) : (MtopBusiness) super.mo1295forceRefreshCache();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: handler */
    public MtopBusiness mo1296handler(Handler handler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("acebdcd3", new Object[]{this, handler}) : (MtopBusiness) super.mo1296handler(handler);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: headers */
    public MtopBusiness mo1297headers(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("68fe911c", new Object[]{this, map}) : (MtopBusiness) super.mo1297headers(map);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: protocol */
    public MtopBusiness mo1303protocol(ProtocolEnum protocolEnum) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("d01c6ee0", new Object[]{this, protocolEnum}) : (MtopBusiness) super.mo1303protocol(protocolEnum);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: reqContext */
    public MtopBusiness mo1338reqContext(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("18e0e560", new Object[]{this, obj}) : (MtopBusiness) super.mo1338reqContext(obj);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: reqMethod */
    public MtopBusiness mo1305reqMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("8a66a042", new Object[]{this, methodEnum}) : (MtopBusiness) super.mo1305reqMethod(methodEnum);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: retryTime */
    public MtopBusiness mo1339retryTime(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("38089dad", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1339retryTime(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setCacheControlNoCache */
    public MtopBusiness mo1311setCacheControlNoCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("25ba1d09", new Object[]{this}) : (MtopBusiness) super.mo1311setCacheControlNoCache();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setConnectionTimeoutMilliSecond */
    public MtopBusiness mo1312setConnectionTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("99241598", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1312setConnectionTimeoutMilliSecond(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setCustomDomain */
    public MtopBusiness mo1313setCustomDomain(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("214d758c", new Object[]{this, str}) : (MtopBusiness) super.mo1313setCustomDomain(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: allowSwitchToPOST */
    public MtopBusiness mo1293allowSwitchToPOST(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("371ca57f", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.mo1293allowSwitchToPOST(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: securitySignDegraded */
    public MtopBusiness mo1307securitySignDegraded(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("6625af12", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.mo1307securitySignDegraded(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setCustomDomain */
    public MtopBusiness mo1314setCustomDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("6029eff8", new Object[]{this, str, str2, str3}) : (MtopBusiness) super.mo1314setCustomDomain(str, str2, str3);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setUnitStrategy */
    public MtopBusiness mo1328setUnitStrategy(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("c02fcc4a", new Object[]{this, str}) : (MtopBusiness) super.mo1328setUnitStrategy(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setJsonType */
    public MtopBusiness mo1315setJsonType(JsonTypeEnum jsonTypeEnum) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e1a60f5e", new Object[]{this, jsonTypeEnum}) : (MtopBusiness) super.mo1315setJsonType(jsonTypeEnum);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setNetInfo */
    public MtopBusiness mo1316setNetInfo(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("314a4541", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1316setNetInfo(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setPageUrl */
    public MtopBusiness mo1321setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("696a49e5", new Object[]{this, str}) : (MtopBusiness) super.mo1321setPageUrl(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setPageName */
    public MtopBusiness mo1320setPageName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("d23ab307", new Object[]{this, str}) : (MtopBusiness) super.mo1320setPageName(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setReqAppKey */
    public MtopBusiness mo1322setReqAppKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5ae4e73f", new Object[]{this, str, str2}) : (MtopBusiness) super.mo1322setReqAppKey(str, str2);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setReqBizExt */
    public MtopBusiness mo1323setReqBizExt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("a4d8acf9", new Object[]{this, str}) : (MtopBusiness) super.mo1323setReqBizExt(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setReqSource */
    public MtopBusiness mo1324setReqSource(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5af74c2f", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1324setReqSource(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setReqUserId */
    public MtopBusiness mo1325setReqUserId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("72011dc1", new Object[]{this, str}) : (MtopBusiness) super.mo1325setReqUserId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setSocketTimeoutMilliSecond */
    public MtopBusiness mo1326setSocketTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("86bcded", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1326setSocketTimeoutMilliSecond(i);
    }

    public MtopBusiness setPriorityFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("c492a59", new Object[]{this, new Boolean(z)});
        }
        this.mtopProp.priorityFlag = z;
        return this;
    }

    public MtopBusiness setPriorityData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("84911d06", new Object[]{this, map});
        }
        this.mtopProp.priorityData = map;
        return this;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: setUserInfo */
    public MtopBusiness mo1329setUserInfo(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5a536188", new Object[]{this, str}) : (MtopBusiness) super.mo1329setUserInfo(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: supportStreamJson */
    public MtopBusiness mo1330supportStreamJson(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("b8e6395e", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.mo1330supportStreamJson(z);
    }

    private String getRequestLogInfo(String str, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c81c7c78", new Object[]{this, str, mtopBusiness});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(str);
        sb.append(" [");
        if (mtopBusiness != null) {
            sb.append("apiName=");
            sb.append(mtopBusiness.request.getApiName());
            sb.append(";version=");
            sb.append(mtopBusiness.request.getVersion());
            sb.append(";requestType=");
            sb.append(mtopBusiness.getRequestType());
        }
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: prefetchMode */
    public MtopBusiness mo1302prefetchMode(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e1de652", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.mo1302prefetchMode(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: prefetchComparator */
    public MtopBusiness mo1301prefetchComparator(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5ef9f610", new Object[]{this, iPrefetchComparator}) : (MtopBusiness) super.mo1301prefetchComparator(iPrefetchComparator);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: prefetch */
    public MtopBusiness mo1299prefetch(long j, List<String> list, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("eae0115c", new Object[]{this, new Long(j), list, iPrefetchCallback}) : (MtopBusiness) super.mo1299prefetch(j, list, iPrefetchCallback);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: prefetch */
    public MtopBusiness mo1300prefetch(long j, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("872a38ad", new Object[]{this, new Long(j), iPrefetchCallback}) : (MtopBusiness) super.mo1300prefetch(j, iPrefetchCallback);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: prefetch */
    public MtopBusiness mo1298prefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("bc1c136", new Object[]{this}) : (MtopBusiness) super.mo1300prefetch(0L, (MtopPrefetch.IPrefetchCallback) null);
    }

    public MtopBusiness streamMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("413f98ea", new Object[]{this, new Boolean(z)});
        }
        this.mtopProp.streamMode = z;
        return this;
    }

    public MtopBusiness allowParseJson(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("1d61aa99", new Object[]{this, new Boolean(z)});
        }
        this.allowParseJson = z;
        return this;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: upstreamCompress */
    public MtopBusiness mo1333upstreamCompress(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("620e0204", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.mo1333upstreamCompress(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: supportZstdDictionary */
    public MtopBusiness mo1331supportZstdDictionary(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("69e78035", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.mo1331supportZstdDictionary(z);
    }

    public MtopBusiness setSocketTimeoutMilliSecond(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("80f94838", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        this.mtopProp.streamFirstStageReadTimeMills = i;
        this.mtopProp.streamSubStageReadTimeMills = i2;
        return this;
    }

    public MtopBusiness registerListener(IMtopStreamListener iMtopStreamListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("7ad10927", new Object[]{this, iMtopStreamListener});
        }
        this.listener = iMtopStreamListener;
        return this;
    }

    public void doStreamFinish(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7a9df0", new Object[]{this, mtopResponse, baseOutDo});
        } else if (this.isCancelled) {
            TBSdkLog.w(TAG, this.seqNo, "request is cancelled,don't callback listener.");
        } else if (!(this.listener instanceof IMtopStreamListener)) {
            String str = this.seqNo;
            StringBuilder sb = new StringBuilder();
            sb.append("listener did't implement IMtopStreamListener.apiKey=");
            sb.append(mtopResponse != null ? mtopResponse.getFullKey() : "");
            TBSdkLog.e(TAG, str, sb.toString());
        } else {
            TBSdkLog.d(TAG, this.mtopContext.h, "[doStreamFinish] callback");
            IMtopStreamListener iMtopStreamListener = (IMtopStreamListener) this.listener;
            if (mtopResponse != null) {
                try {
                    mtopResponse.setAllowParseJson(this.allowParseJson);
                } catch (Throwable th) {
                    try {
                        TBSdkLog.e(TAG, this.seqNo, "doStreamFinish listener callback error", th);
                        try {
                            if (this.mtopResponse == null || this.mtopResponse.getResponseCode() != -9 || this.mtopContext.f == null || this.mtopContext.f.getCall() == null) {
                                return;
                            }
                            this.mtopContext.f.getCall().b();
                            return;
                        } catch (Throwable th2) {
                            TBSdkLog.e(TAG, this.seqNo, "doStreamFinish listener cancel error", th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        try {
                            if (this.mtopResponse != null && this.mtopResponse.getResponseCode() == -9 && this.mtopContext.f != null && this.mtopContext.f.getCall() != null) {
                                this.mtopContext.f.getCall().b();
                            }
                        } catch (Throwable th4) {
                            TBSdkLog.e(TAG, this.seqNo, "doStreamFinish listener cancel error", th4);
                        }
                        throw th3;
                    }
                }
            }
            if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
                if (!this.mForbidStreamExceptionCallback && mtopResponse != null && mtopResponse.getStreamModeData() == null) {
                    TBSdkLog.e(TAG, this.seqNo, "stream listener degraded onReceiveData error callback.");
                    iMtopStreamListener.onReceiveData(d.a(mtopResponse), baseOutDo, this.requestType, getReqContext());
                }
                iMtopStreamListener.onError(d.c(mtopResponse), this.requestType, getReqContext());
                try {
                    if (this.mtopResponse == null || this.mtopResponse.getResponseCode() != -9 || this.mtopContext.f == null || this.mtopContext.f.getCall() == null) {
                        return;
                    }
                    this.mtopContext.f.getCall().b();
                    return;
                } catch (Throwable th5) {
                    TBSdkLog.e(TAG, this.seqNo, "doStreamFinish listener cancel error", th5);
                    return;
                }
            }
            long currentTimeMillis = this.stat.currentTimeMillis();
            this.stat.callbackPocTime = currentTimeMillis - this.stat.netSendEndTime;
            this.stat.allTime = currentTimeMillis - this.stat.startTime;
            MtopStatistics mtopStatistics = this.stat;
            if (this.mtopContext.d.handler == null) {
                z = false;
            }
            mtopStatistics.handler = z;
            if (mtopResponse.getStreamModeData() == null) {
                iMtopStreamListener.onReceiveData(d.a(mtopResponse), baseOutDo, this.requestType, getReqContext());
                TBSdkLog.e(TAG, this.seqNo, "stream listener degraded onReceiveData success callback.");
            }
            iMtopStreamListener.onFinish(d.b(mtopResponse), this.requestType, getReqContext());
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, this.seqNo, "listener onSuccess callback.");
            }
            try {
                if (this.mtopResponse == null || this.mtopResponse.getResponseCode() != -9 || this.mtopContext.f == null || this.mtopContext.f.getCall() == null) {
                    return;
                }
                this.mtopContext.f.getCall().b();
            } catch (Throwable th6) {
                TBSdkLog.e(TAG, this.seqNo, "doStreamFinish listener cancel error", th6);
            }
        }
    }

    public void doStreamReceiveData(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f44c8c", new Object[]{this, mtopResponse, baseOutDo});
        } else if (this.isCancelled) {
            TBSdkLog.w(TAG, this.seqNo, "request is cancelled,don't callback listener.");
        } else {
            try {
                if (!(this.listener instanceof IMtopStreamListener)) {
                    String str = this.seqNo;
                    StringBuilder sb = new StringBuilder();
                    sb.append("listener did't implement IMtopStreamListener.apiKey=");
                    sb.append(mtopResponse != null ? mtopResponse.getFullKey() : "");
                    TBSdkLog.e(TAG, str, sb.toString());
                    return;
                }
                if (mtopResponse != null) {
                    mtopResponse.setAllowParseJson(this.allowParseJson);
                }
                IMtopStreamListener iMtopStreamListener = (IMtopStreamListener) this.listener;
                TBSdkLog.d(TAG, this.mtopContext.h, "[doStreamReceiveData] callback");
                long currentTimeMillis = System.currentTimeMillis();
                com.taobao.tao.stream.d a2 = d.a(mtopResponse);
                if (this.stat != null && this.stat.streamFirstResCallbackDuration <= 0) {
                    this.stat.streamFirstResCallbackDuration = this.stat.currentTimeMillis() - this.stat.startTime;
                }
                String str2 = this.mtopContext.h;
                TBSdkLog.d(TAG, str2, "[doStreamReceiveData] convertStreamResponse: " + (System.currentTimeMillis() - currentTimeMillis));
                iMtopStreamListener.onReceiveData(a2, baseOutDo, this.requestType, getReqContext());
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.seqNo, "doStreamReceiveData listener callback error", th);
            }
        }
    }

    public boolean isSycnRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("810f4aff", new Object[]{this})).booleanValue() : this.syncRequestFlag;
    }

    public void forbidStreamExceptionCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4c734d", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidStreamExceptionCallback = z;
        }
    }
}
