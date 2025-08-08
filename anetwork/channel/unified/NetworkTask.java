package anetwork.channel.unified;

import android.taobao.windvane.connect.HttpConnector;
import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.NoSocketPermissionInBgException;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.SessionParamStat;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.detect.WifiDetector;
import anet.channel.encode.EncodingHelper;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ENV;
import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.HttpSession;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.CacheHelper;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.http.NetworkSdkSetting;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.monitor.WifiFgDetector;
import anetwork.channel.util.RequestConstant;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_RSP_BUFFER_LENGTH = 131072;
    public static final String TAG = "anet.NetworkTask";
    public String bizReqId;
    public Cache cache;
    public Cache.Entry entry;
    public String f_refer;
    public volatile AtomicBoolean isDone;
    public RequestContext rc;
    public ByteArrayOutputStream cacheBuffer = null;
    public volatile Cancelable cancelable = null;
    public volatile boolean isCanceled = false;
    public int contentLength = 0;
    public int dataChunkIndex = 0;
    public boolean isHeaderCallback = false;
    public boolean isDataChuckCallback = false;
    public boolean isForceOkHttpEnabled = false;
    private AtomicBoolean responseReturn = new AtomicBoolean(false);
    public volatile BodyTimeoutChecker bodyTimeoutChecker = null;
    public ResponseBuffer responseBuffer = null;

    static {
        kge.a(-2085384120);
        kge.a(471853369);
    }

    public static /* synthetic */ Session access$000(NetworkTask networkTask, boolean z, Session session, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z2, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("2fb57ed4", new Object[]{networkTask, new Boolean(z), session, sessionCenter, httpUrl, new Boolean(z2), sessionParamStat}) : networkTask.tryGetHttpSession(z, session, sessionCenter, httpUrl, z2, sessionParamStat);
    }

    public static /* synthetic */ void access$100(NetworkTask networkTask, Session session, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1352a676", new Object[]{networkTask, session, request});
        } else {
            networkTask.sendRequest(session, request);
        }
    }

    public static /* synthetic */ AtomicBoolean access$200(NetworkTask networkTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("dab664a0", new Object[]{networkTask}) : networkTask.responseReturn;
    }

    public NetworkTask(RequestContext requestContext, Cache cache, Cache.Entry entry) {
        this.cache = null;
        this.entry = null;
        this.f_refer = "other";
        this.isDone = null;
        this.rc = requestContext;
        this.isDone = requestContext.isDone;
        this.cache = cache;
        this.entry = entry;
        this.f_refer = requestContext.config.getHeaders().get("f-refer");
        this.bizReqId = requestContext.config.bizReqId;
    }

    public boolean isResponseReturn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38218fa6", new Object[]{this})).booleanValue() : this.responseReturn.get();
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.isCanceled = true;
        if (this.cancelable == null) {
            return;
        }
        this.cancelable.cancel();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.isCanceled) {
        } else {
            ALog.e(TAG, "network-task run", this.rc.seqNum, " bizReqId", this.bizReqId);
            if (this.rc.config.getAwcnRequest().rs.retryTimes > 0 && this.rc.config.rs.retryTimes <= this.rc.config.rs.maxRetryTime) {
                Request.Builder newBuilder = this.rc.config.getAwcnRequest().newBuilder();
                newBuilder.addHeader("x-nw-retry", "true");
                this.rc.config.setAwcnRequest(newBuilder.build());
            }
            RequestStatistic requestStatistic = this.rc.config.rs;
            requestStatistic.f_refer = this.f_refer;
            requestStatistic.bizReqId = this.bizReqId;
            if (!NetworkStatusHelper.isConnected()) {
                if (NetworkConfigCenter.isRequestDelayRetryForNoNetwork() && requestStatistic.statusCode != -200) {
                    requestStatistic.statusCode = -200;
                    ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.unified.NetworkTask.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ThreadPoolExecutorFactory.submitPriorityTask(NetworkTask.this, ThreadPoolExecutorFactory.Priority.HIGH);
                            }
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
                this.isDone.set(true);
                this.rc.cancelTimeoutTask();
                requestStatistic.isDone.set(true);
                requestStatistic.statusCode = -200;
                requestStatistic.msg = ErrorConstant.getErrMsg(-200);
                requestStatistic.rspEnd = System.currentTimeMillis();
                AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspRecvEnd", null);
                this.rc.callback.onFinish(new DefaultFinishEvent(-200, (String) null, this.rc.config.getAwcnRequest()));
            } else if (NetworkConfigCenter.isBgRequestForbidden() && GlobalAppRuntimeInfo.isAppBackground() && AppLifecycle.lastEnterBackgroundTime > 0 && System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime > NetworkConfigCenter.getBgForbidRequestThreshold() && !NetworkConfigCenter.isUrlInWhiteList(this.rc.config.getHttpUrl()) && !NetworkConfigCenter.isBizInWhiteList(this.rc.config.getAwcnRequest().getBizId()) && !this.rc.config.getAwcnRequest().isAllowRequestInBg()) {
                this.isDone.set(true);
                this.rc.cancelTimeoutTask();
                if (ALog.isPrintLog(2)) {
                    ALog.i(TAG, "request forbidden in background", this.rc.seqNum, "url", this.rc.config.getHttpUrl());
                }
                this.rc.config.commitStatic(this.rc.callback, requestStatistic, -205, "rt");
            } else {
                if (ALog.isPrintLog(2)) {
                    ALog.i(TAG, "exec request", this.rc.seqNum, "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                }
                try {
                    if (AwcnConfig.isWifiUnavailableUseCellOptOpened() && this.rc.config.isDetectReq()) {
                        HttpUrl httpUrl = this.rc.config.getHttpUrl();
                        HttpSession httpSession = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host()), this.rc.seqNum, null));
                        httpSession.setForceCellular(false);
                        this.rc.config.rs.isDetectReq = true;
                        sendRequest(httpSession, this.rc.config.getAwcnRequest());
                        ALog.e(TAG, "[wifi fg detect opt] detect request start send! ", this.rc.seqNum, "url", this.rc.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                    } else if (NetworkConfigCenter.isGetSessionAsyncEnable()) {
                        executeRequest();
                    } else {
                        Session tryGetSession = tryGetSession();
                        if (tryGetSession == null) {
                            ALog.e(TAG, "session null,not send request!", this.rc.seqNum, " bizReqId", this.bizReqId, "url", this.rc.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                        } else {
                            sendRequest(tryGetSession, this.rc.config.getAwcnRequest());
                        }
                    }
                } catch (NoSocketPermissionInBgException unused) {
                    ALog.e(TAG, "[bg_socket_opt] send request failed! no socket read and write permissions in the background！", this.rc.seqNum, "url", this.rc.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                    this.rc.config.commitStatic(this.rc.callback, requestStatistic, ErrorConstant.ERROR_REQUEST_SOCKET_NOT_PERMISSION_IN_BG, "bg_socket");
                } catch (Exception e) {
                    ALog.e(TAG, "[bg_socket_opt] send request failed.", this.rc.seqNum, e, " bizReqId", this.bizReqId, "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                }
            }
        }
    }

    private SessionCenter getSessionCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionCenter) ipChange.ipc$dispatch("8c52c77d", new Object[]{this});
        }
        String requestProperty = this.rc.config.getRequestProperty(RequestConstant.APPKEY);
        if (StringUtils.isEmpty(requestProperty)) {
            requestProperty = GlobalAppRuntimeInfo.getAppkey();
        }
        if (StringUtils.isEmpty(requestProperty)) {
            return SessionCenter.getInstance();
        }
        ENV env = ENV.ONLINE;
        String requestProperty2 = this.rc.config.getRequestProperty(RequestConstant.ENVIRONMENT);
        if ("pre".equalsIgnoreCase(requestProperty2)) {
            env = ENV.PREPARE;
        } else if ("test".equalsIgnoreCase(requestProperty2)) {
            env = ENV.TEST;
        }
        if (env != NetworkSdkSetting.CURRENT_ENV) {
            NetworkSdkSetting.CURRENT_ENV = env;
            SessionCenter.switchEnvironment(env);
        }
        Config config = Config.getConfig(requestProperty, env);
        if (config == null) {
            config = new Config.Builder().setAppkey(requestProperty).setEnv(env).setAuthCode(this.rc.config.getRequestProperty(RequestConstant.AUTH_CODE)).build();
        }
        return SessionCenter.getInstance(config);
    }

    private Session tryGetSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("e3d315ac", new Object[]{this});
        }
        final SessionCenter sessionCenter = getSessionCenter();
        final HttpUrl httpUrl = this.rc.config.getHttpUrl();
        httpUrl.isNoStrategy = false;
        final boolean containsNonDefaultPort = httpUrl.containsNonDefaultPort();
        final RequestStatistic requestStatistic = this.rc.config.rs;
        Session session = null;
        boolean z = AwcnConfig.isAllowRetryUseLongLinkEnable() && AwcnConfig.isHostInAllowRetryUseLongLinkWhiteList(this.rc.config.getHost());
        final SessionParamStat sessionParamStat = new SessionParamStat(this.rc.seqNum, z && this.rc.config.currentRetryTimes != 0);
        if (this.rc.config.requestType == 1 && NetworkConfigCenter.isSpdyEnabled() && ((z || this.rc.config.currentRetryTimes == 0) && !containsNonDefaultPort)) {
            final HttpUrl checkCName = MultiPathTask.checkCName(httpUrl, this.rc);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                session = sessionCenter.getThrowsException(checkCName, SessionType.LONG_LINK, 0L, sessionParamStat);
                if (session != null) {
                    requestStatistic.isPreSession = true;
                }
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
            } catch (NoAvailStrategyException unused) {
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
                return tryGetHttpSession(true, session, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat);
            } catch (NoSocketPermissionInBgException unused2) {
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
                throw new NoSocketPermissionInBgException("no socket permissions in background");
            } catch (Exception unused3) {
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
            }
            if (session == null) {
                final long currentTimeMillis2 = System.currentTimeMillis();
                ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anetwork.channel.unified.NetworkTask.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        boolean z2 = false;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long currentTimeMillis3 = System.currentTimeMillis();
                        requestStatistic.sessionThreadWaitTime = currentTimeMillis3 - currentTimeMillis2;
                        Session session2 = sessionCenter.get(checkCName, SessionType.LONG_LINK, ProtocolType.ALL, NetworkConfigCenter.getSessionConnectWaitTime(), sessionParamStat);
                        if (session2 != null && session2.getConnType() != null && (session2.getConnType().is1RttHTTP3() || session2.getConnType().isH2S() || session2.getConnType().isH2())) {
                            requestStatistic.waitConnectStat = 1;
                        }
                        requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis3;
                        RequestStatistic requestStatistic2 = requestStatistic;
                        if (session2 != null) {
                            z2 = true;
                        }
                        requestStatistic2.spdyRequestSend = z2;
                        Session access$000 = NetworkTask.access$000(NetworkTask.this, checkCName.isNoStrategy, session2, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat);
                        NetworkTask networkTask = NetworkTask.this;
                        NetworkTask.access$100(networkTask, access$000, networkTask.rc.config.getAwcnRequest());
                    }
                }, ThreadPoolExecutorFactory.Priority.NORMAL);
                return null;
            }
            ALog.i(TAG, "tryGetSession", this.rc.seqNum, "Session", session);
            requestStatistic.spdyRequestSend = true;
            return session;
        }
        requestStatistic.isPreSession = true;
        return tryGetHttpSession(false, null, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat);
    }

    private void executeRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4b7ce1", new Object[]{this});
            return;
        }
        final SessionCenter sessionCenter = getSessionCenter();
        final HttpUrl httpUrl = this.rc.config.getHttpUrl();
        final boolean containsNonDefaultPort = httpUrl.containsNonDefaultPort();
        final RequestStatistic requestStatistic = this.rc.config.rs;
        final Request awcnRequest = this.rc.config.getAwcnRequest();
        boolean z = AwcnConfig.isAllowRetryUseLongLinkEnable() && AwcnConfig.isHostInAllowRetryUseLongLinkWhiteList(this.rc.config.getHost());
        final SessionParamStat sessionParamStat = new SessionParamStat(this.rc.seqNum, z && this.rc.config.currentRetryTimes != 0);
        if (this.rc.config.requestType == 1 && NetworkConfigCenter.isSpdyEnabled() && ((z || this.rc.config.currentRetryTimes == 0) && !containsNonDefaultPort)) {
            final HttpUrl checkCName = MultiPathTask.checkCName(httpUrl, this.rc);
            checkCName.isNoStrategy = false;
            final long currentTimeMillis = System.currentTimeMillis();
            sessionCenter.asyncGet(checkCName, SessionType.LONG_LINK, 3000L, new SessionGetCallback() { // from class: anetwork.channel.unified.NetworkTask.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.SessionGetCallback
                public void onSessionGetSuccess(Session session) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d473443", new Object[]{this, session});
                        return;
                    }
                    ALog.i(NetworkTask.TAG, "onSessionGetSuccess", NetworkTask.this.rc.seqNum, "Session", session);
                    requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis;
                    requestStatistic.spdyRequestSend = true;
                    NetworkTask.access$100(NetworkTask.this, session, awcnRequest);
                }

                @Override // anet.channel.SessionGetCallback
                public void onSessionGetFail() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("735355e4", new Object[]{this});
                        return;
                    }
                    ALog.e(NetworkTask.TAG, "onSessionGetFail", NetworkTask.this.rc.seqNum, "url", requestStatistic.url, " bizReqId", NetworkTask.this.bizReqId);
                    requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis;
                    NetworkTask networkTask = NetworkTask.this;
                    NetworkTask.access$100(networkTask, NetworkTask.access$000(networkTask, checkCName.isNoStrategy, null, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat), awcnRequest);
                }
            }, sessionParamStat);
            return;
        }
        sendRequest(tryGetHttpSession(false, null, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat), awcnRequest);
    }

    private Session tryGetHttpSession(boolean z, Session session, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z2, SessionParamStat sessionParamStat) {
        HttpSession httpSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("c2497258", new Object[]{this, new Boolean(z), session, sessionCenter, httpUrl, new Boolean(z2), sessionParamStat});
        }
        long currentTimeMillis = System.currentTimeMillis();
        RequestStatistic requestStatistic = this.rc.config.rs;
        if (session != null || !this.rc.config.isHttpSessionEnable() || z2 || NetworkStatusHelper.isProxy()) {
            httpSession = session;
        } else if (!z || !AwcnConfig.isGetSessionOptEnable()) {
            httpSession = sessionCenter.get(httpUrl, SessionType.SHORT_LINK, ProtocolType.ALL, NetworkConfigCenter.getHttpSessionConnectWaitTime(), sessionParamStat);
        } else {
            Session sessionBySessionPool = sessionCenter.getSessionBySessionPool(httpUrl, SessionType.SHORT_LINK);
            ALog.e(TAG, "no strategy, try get short session in sessionPool! session=" + sessionBySessionPool, this.rc.seqNum, "isNoStrategy", Boolean.valueOf(z));
            httpSession = sessionBySessionPool;
        }
        if (httpSession == null) {
            ALog.i(TAG, "create HttpSession with local DNS", this.rc.seqNum, new Object[0]);
            httpSession = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host()), this.rc.seqNum, null));
        }
        if ((httpSession instanceof HttpSession) && (this.isForceOkHttpEnabled || OkHttpConnector.isOkHttpEnable(httpUrl))) {
            ((HttpSession) httpSession).setUseOkhttp(true);
        }
        if (WifiDetector.isForceCell(this.rc.config.getHost(), this.rc.seqNum)) {
            httpSession.setForceCellular(true);
            ALog.e(TAG, "[wifi fg detect opt] http session set force cell!", this.rc.seqNum, new Object[0]);
        }
        if (requestStatistic.spdyRequestSend) {
            requestStatistic.degraded = 1;
        }
        ALog.i(TAG, "tryGetHttpSession", this.rc.seqNum, "Session", httpSession);
        requestStatistic.waitConnectStat = 1;
        requestStatistic.httpSessionTime = System.currentTimeMillis() - currentTimeMillis;
        return httpSession;
    }

    private Request preProcessRequest(Request request) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("3f01980c", new Object[]{this, request});
        }
        Request.Builder builder = null;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.rc.config.isRequestCookieEnabled() && !AwcnConfig.isAllowNoCookieList(this.rc.config.getUrlString())) {
            String cookie = CookieManager.getCookie(this.rc.config.getUrlString());
            if (!StringUtils.isEmpty(cookie)) {
                builder = request.newBuilder();
                String str2 = request.getHeaders().get("Cookie");
                if (!StringUtils.isEmpty(str2)) {
                    cookie = StringUtils.concatString(str2, "; ", cookie);
                }
                if (AwcnConfig.isHostInCookiePrintLogWhiteList(request.getHost())) {
                    CookieManager.printLog("NetworkTask", this.rc.seqNum, cookie, this.rc.config.getUrlString());
                }
                builder.addHeader("Cookie", cookie);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        this.rc.config.rs.cookieTime = currentTimeMillis2 - currentTimeMillis;
        if (this.entry != null) {
            if (builder == null) {
                builder = request.newBuilder();
            }
            if (this.entry.etag != null) {
                builder.addHeader("If-None-Match", this.entry.etag);
            }
            if (this.entry.lastModified > 0) {
                builder.addHeader(HttpConnector.IF_MODIFY_SINCE, CacheHelper.toGMTDate(this.entry.lastModified));
            }
        }
        if (this.rc.config.currentRetryTimes == 0 && ("weex".equalsIgnoreCase(this.f_refer) || NetworkConfigCenter.isAllowFastDegrade(this.rc.config.getHttpUrl()))) {
            if (builder == null) {
                builder = request.newBuilder();
            }
            builder.setReadTimeout(3000);
            this.rc.config.rs.isFastDegrade = true;
            ALog.e(TAG, "set read time out 3s.", this.rc.seqNum, " bizReqId", this.bizReqId);
        }
        if (NetworkConfigCenter.isFalcoIdEnable() && ((NetworkConfigCenter.isFalcoIdWhiteList(request.getHost()) || "picture".equalsIgnoreCase(this.f_refer)) && !request.getHeaders().containsKey("x-falco-id"))) {
            String str3 = request.getHeaders().get(HttpConstant.USER_AGENT);
            String str4 = this.rc.config.rs.falcoId;
            if (!StringUtils.isEmpty(str4)) {
                if (builder == null) {
                    builder = request.newBuilder();
                }
                if (!StringUtils.isEmpty(str3)) {
                    builder.addHeader(HttpConstant.USER_AGENT, StringUtils.concatString(str3, " ", str4));
                } else {
                    builder.addHeader(HttpConstant.USER_AGENT, str4);
                }
            }
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        this.rc.config.rs.otherProcessTime = currentTimeMillis3 - currentTimeMillis2;
        if (EncodingHelper.isZstdValid() && AwcnConfig.isDecompressOpend()) {
            if (builder == null) {
                builder = request.newBuilder();
            }
            if (StringUtils.isEmpty(request.getHeaders().get("Accept-Encoding")) || AwcnConfig.isHostInAcceptEncodeWhiteList(request.getHost())) {
                this.rc.config.dueToAcceptEncode(builder);
            }
        }
        this.rc.config.rs.acceptEncodeTime = System.currentTimeMillis() - currentTimeMillis3;
        int i = -1;
        if (!AwcnConfig.isUplinkEncodeOpened() || !this.rc.config.isRequestUplinkEncodeEnable(1) || !AwcnConfig.isHostInUplinkEncodeHostWhiteList(request.getHttpUrl().host())) {
            str = BuildConfig.RPC_TYPE_DEF;
        } else {
            if (builder == null) {
                builder = request.newBuilder();
            }
            String uplinkEncodeByUrlWhiteList = AwcnConfig.getUplinkEncodeByUrlWhiteList(request.getHttpUrl().host() + request.getHttpUrl().path());
            str = uplinkEncodeByUrlWhiteList;
            i = request.requestBodyCompress(builder, uplinkEncodeByUrlWhiteList);
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        if (AwcnConfig.isAmdcPriorityUpdateEnable() && AmdcPriorityHelper.isPriorityHost(this.rc.seqNum, GlobalAppRuntimeInfo.getUserId(), request.getHttpUrl().host())) {
            if (builder == null) {
                builder = request.newBuilder();
            }
            this.rc.config.dueToRequestPriority(builder);
        }
        this.rc.config.rs.reqPriorityTime = System.currentTimeMillis() - currentTimeMillis4;
        if (builder == null) {
            request.requestBodyCompressRet = i;
            request.requestBodyCompressType = str;
            return request;
        }
        Request build = builder.build();
        if (build != null && request != null) {
            build.isGold = request.isGold;
            build.recvRateBpsLimit = request.recvRateBpsLimit;
            build.requestBodyCompressRet = i;
            build.requestBodyCompressType = str;
            build.requestBodyCompressCostTime = request.requestBodyCompressCostTime;
            build.reqBodyInflateSize = request.reqBodyInflateSize;
        }
        return build;
    }

    private void sendRequest(final Session session, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edd9305", new Object[]{this, session, request});
        } else if (session == null || this.isCanceled) {
        } else {
            final RequestStatistic requestStatistic = this.rc.config.rs;
            long currentTimeMillis = System.currentTimeMillis();
            final Request preProcessRequest = preProcessRequest(request);
            requestStatistic.reqStart = System.currentTimeMillis();
            requestStatistic.reqPreProcessTime = requestStatistic.reqStart - currentTimeMillis;
            IFullTraceAnalysisV3 v3Instance = AnalysisFactory.getV3Instance();
            IFullTraceAnalysisV3.ISpan iSpan = requestStatistic.span;
            v3Instance.log(iSpan, "netReqProcessStart", "bizReqId=" + this.bizReqId);
            requestStatistic.isSetForceCell = session.getForceCellular();
            if (requestStatistic.isSetForceCell) {
                requestStatistic.setConnType(session.getConnType());
            }
            this.cancelable = session.request(preProcessRequest, new RequestCb() { // from class: anetwork.channel.unified.NetworkTask.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.RequestCb
                public void onResponseCode(int i, Map<String, List<String>> map) {
                    String singleHeaderFieldByKey;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                    } else if (NetworkTask.this.isDone.get()) {
                    } else {
                        if (AwcnConfig.isVpnOptOpened()) {
                            if ((NetworkTask.this.rc.multiPathTask != null && NetworkTask.this.rc.multiPathTask.isResponseReturn()) || (NetworkTask.this.rc.vpnFastDegradeTask != null && NetworkTask.this.rc.vpnFastDegradeTask.isResponseReturn())) {
                                ALog.e(NetworkTask.TAG, "[ap] onResponseCode, other task already return, end network task!", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId);
                                return;
                            }
                            ALog.e(NetworkTask.TAG, "[ap] onResponseCode, network task already return! cancel other task", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId);
                            NetworkTask.this.rc.cancelMultiPathTask();
                            NetworkTask.this.rc.cancelVpnFastDegradeTask();
                        } else if (NetworkTask.this.rc.multiPathTask != null && NetworkTask.this.rc.multiPathTask.isResponseReturn()) {
                            return;
                        } else {
                            NetworkTask.this.rc.cancelMultiPathTask();
                        }
                        if (ALog.isPrintLog(2)) {
                            ALog.i(NetworkTask.TAG, "onResponseCode", preProcessRequest.getSeq(), "code", Integer.valueOf(i), " bizReqId", NetworkTask.this.bizReqId);
                            ALog.i(NetworkTask.TAG, "onResponseCode", preProcessRequest.getSeq(), "headers", map, " bizReqId", NetworkTask.this.bizReqId);
                        }
                        ALog.e(NetworkTask.TAG, "[ap] network-task onResponseCode", preProcessRequest.getSeq(), "code", Integer.valueOf(i), " bizReqId", NetworkTask.this.bizReqId);
                        if (preProcessRequest.requestBodyCompressRet == 1) {
                            map.put(HttpConstant.X_UPLINK_ENCODE, Arrays.asList(preProcessRequest.requestBodyCompressType));
                        }
                        if (HttpHelper.checkRedirect(preProcessRequest, i) && (singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.LOCATION)) != null) {
                            HttpUrl parse = HttpUrl.parse(singleHeaderFieldByKey);
                            if (parse != null) {
                                if (!NetworkTask.this.isDone.compareAndSet(false, true)) {
                                    return;
                                }
                                parse.lockScheme();
                                NetworkTask.this.rc.config.redirectToUrl(parse);
                                NetworkTask.this.rc.isDone = new AtomicBoolean();
                                NetworkTask.this.rc.runningTask = new NetworkTask(NetworkTask.this.rc, null, null);
                                requestStatistic.recordRedirect(i, parse.simpleUrlString());
                                requestStatistic.locationUrl = singleHeaderFieldByKey;
                                ThreadPoolExecutorFactory.submitPriorityTask(NetworkTask.this.rc.runningTask, ThreadPoolExecutorFactory.Priority.HIGH);
                                return;
                            }
                            ALog.e(NetworkTask.TAG, "redirect url is invalid!", preProcessRequest.getSeq(), "redirect url", singleHeaderFieldByKey, " bizReqId", NetworkTask.this.bizReqId);
                        }
                        try {
                            NetworkTask.this.rc.cancelTimeoutTask();
                            NetworkTask.access$200(NetworkTask.this).set(true);
                            CookieManager.setCookie(NetworkTask.this.rc.config.getHost(), NetworkTask.this.rc.config.getUrlString(), map);
                            NetworkTask.this.contentLength = HttpHelper.parseContentLength(map);
                            String urlString = NetworkTask.this.rc.config.getUrlString();
                            if (NetworkTask.this.entry != null && i == 304) {
                                NetworkTask.this.entry.responseHeaders.putAll(map);
                                Cache.Entry parseCacheHeaders = CacheHelper.parseCacheHeaders(map);
                                if (parseCacheHeaders != null && parseCacheHeaders.ttl > NetworkTask.this.entry.ttl) {
                                    NetworkTask.this.entry.ttl = parseCacheHeaders.ttl;
                                }
                                requestStatistic.protocolType = "cache";
                                if (NetworkTask.this.entry.responseHeaders != null) {
                                    NetworkTask.this.entry.responseHeaders.put(HttpConstant.X_PROTOCOL, Arrays.asList(requestStatistic.protocolType));
                                }
                                NetworkTask.this.rc.callback.onResponseCode(200, NetworkTask.this.entry.responseHeaders);
                                NetworkTask.this.rc.callback.onDataReceiveSize(1, NetworkTask.this.entry.data.length, ByteArray.wrap(NetworkTask.this.entry.data));
                                long currentTimeMillis2 = System.currentTimeMillis();
                                NetworkTask.this.cache.put(urlString, NetworkTask.this.entry);
                                ALog.i(NetworkTask.TAG, "update cache", NetworkTask.this.rc.seqNum, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "key", urlString);
                                return;
                            }
                            if (NetworkTask.this.cache != null) {
                                if ("no-store".equals(HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.CACHE_CONTROL))) {
                                    NetworkTask.this.cache.remove(urlString);
                                } else {
                                    NetworkTask networkTask = NetworkTask.this;
                                    Cache.Entry parseCacheHeaders2 = CacheHelper.parseCacheHeaders(map);
                                    networkTask.entry = parseCacheHeaders2;
                                    if (parseCacheHeaders2 != null) {
                                        HttpHelper.removeHeaderFiledByKey(map, HttpConstant.CACHE_CONTROL);
                                        map.put(HttpConstant.CACHE_CONTROL, Arrays.asList("no-store"));
                                        NetworkTask.this.cacheBuffer = new ByteArrayOutputStream(NetworkTask.this.contentLength != 0 ? NetworkTask.this.contentLength : 5120);
                                    }
                                }
                            }
                            map.put(HttpConstant.X_PROTOCOL, Arrays.asList(requestStatistic.protocolType));
                            boolean equalsIgnoreCase = "open".equalsIgnoreCase(HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.STREAMING_PARSER));
                            if (!NetworkTask.this.rc.config.isStreamParseEnable() && !equalsIgnoreCase && NetworkConfigCenter.isResponseBufferEnable() && NetworkTask.this.contentLength <= 131072) {
                                NetworkTask.this.responseBuffer = new ResponseBuffer(i, map);
                                if (!NetworkConfigCenter.isBodyTimeoutCheckerABEnable() || NetworkTask.this.isHeaderCallback) {
                                    return;
                                }
                                NetworkTask.this.bodyTimeoutChecker = new BodyTimeoutChecker();
                                NetworkTask.this.bodyTimeoutChecker.start();
                                return;
                            }
                            NetworkTask.this.rc.callback.onResponseCode(i, map);
                            NetworkTask.this.isHeaderCallback = true;
                        } catch (Exception e) {
                            ALog.w(NetworkTask.TAG, "[onResponseCode] error.", NetworkTask.this.rc.seqNum, e, " bizReqId", NetworkTask.this.bizReqId);
                        }
                    }
                }

                @Override // anet.channel.RequestCb
                public void onDataReceive(ByteArray byteArray, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                    } else if ((NetworkTask.this.rc.multiPathTask != null && NetworkTask.this.rc.multiPathTask.isResponseReturn()) || (NetworkTask.this.rc.vpnFastDegradeTask != null && NetworkTask.this.rc.vpnFastDegradeTask.isResponseReturn())) {
                        ALog.e(NetworkTask.TAG, "[ap] onDataReceive, other task already return!", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId);
                    } else if (NetworkTask.this.isDone.get()) {
                    } else {
                        if (NetworkTask.this.bodyTimeoutChecker != null) {
                            NetworkTask.this.bodyTimeoutChecker.reSchedule();
                        }
                        if (NetworkTask.this.dataChunkIndex == 0) {
                            requestStatistic.firstChunkTime = System.currentTimeMillis();
                            ALog.e(NetworkTask.TAG, "[onDataReceive] receive first data chunk!", NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
                        }
                        if (z) {
                            ALog.i(NetworkTask.TAG, "[onDataReceive] receive last data chunk!", NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
                        }
                        NetworkTask.this.dataChunkIndex++;
                        try {
                            if (NetworkTask.this.responseBuffer != null) {
                                if (byteArray.getDataLength() != 0) {
                                    NetworkTask.this.responseBuffer.bodyBufferList.add(byteArray);
                                }
                                if (requestStatistic.recDataSize > 131072 || z) {
                                    NetworkTask.this.dataChunkIndex = NetworkTask.this.responseBuffer.callback(NetworkTask.this.rc.callback, NetworkTask.this.contentLength);
                                    NetworkTask.this.isHeaderCallback = true;
                                    NetworkTask.this.isDataChuckCallback = NetworkTask.this.dataChunkIndex > 1;
                                    NetworkTask.this.responseBuffer = null;
                                }
                            } else {
                                if (byteArray.getDataLength() != 0) {
                                    NetworkTask.this.rc.callback.onDataReceiveSize(NetworkTask.this.dataChunkIndex, NetworkTask.this.contentLength, byteArray);
                                }
                                NetworkTask.this.isDataChuckCallback = true;
                            }
                            if (NetworkTask.this.cacheBuffer != null) {
                                if (byteArray.getDataLength() != 0) {
                                    NetworkTask.this.cacheBuffer.write(byteArray.getBuffer(), 0, byteArray.getDataLength());
                                }
                                if (z) {
                                    String urlString = NetworkTask.this.rc.config.getUrlString();
                                    NetworkTask.this.entry.data = NetworkTask.this.cacheBuffer.toByteArray();
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    NetworkTask.this.cache.put(urlString, NetworkTask.this.entry);
                                    ALog.i(NetworkTask.TAG, "write cache", NetworkTask.this.rc.seqNum, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "size", Integer.valueOf(NetworkTask.this.entry.data.length), "key", urlString, " bizReqId", NetworkTask.this.bizReqId);
                                }
                            }
                            if (!z) {
                                return;
                            }
                            requestStatistic.setNetworkChangeRequest(requestStatistic.fisrtStart, System.currentTimeMillis(), GlobalAppRuntimeInfo.NetworkChangeRequestStatus.YES_SUCCESS);
                        } catch (Exception e) {
                            ALog.w(NetworkTask.TAG, "[onDataReceive] error.", NetworkTask.this.rc.seqNum, e, " bizReqId", NetworkTask.this.bizReqId);
                        }
                    }
                }

                @Override // anet.channel.RequestCb
                public void onFinish(int i, String str, RequestStatistic requestStatistic2) {
                    String str2;
                    String str3;
                    DefaultFinishEvent defaultFinishEvent;
                    String valueOf;
                    boolean z;
                    int i2 = i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i2), str, requestStatistic2});
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    ALog.e(NetworkTask.TAG, "[ap] network-task [onFinish] code" + i2, NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
                    if ((NetworkTask.this.rc.multiPathTask != null && NetworkTask.this.rc.multiPathTask.isResponseReturn()) || (NetworkTask.this.rc.vpnFastDegradeTask != null && NetworkTask.this.rc.vpnFastDegradeTask.isResponseReturn())) {
                        ALog.e(NetworkTask.TAG, "[ap] onDataReceive, other task already return!", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId);
                        return;
                    }
                    if (NetworkTask.this.rc.config.isQoSAsync()) {
                        ALog.e(NetworkTask.TAG, "[RemoteFeatureQoS][onFinish] code" + i2, NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
                        QosTaskQueue.getInstance().pollQueuingTask(NetworkTask.this.rc);
                    }
                    if (NetworkTask.this.isDone.getAndSet(true)) {
                        return;
                    }
                    if (NetworkTask.this.bodyTimeoutChecker != null) {
                        NetworkTask.this.bodyTimeoutChecker.stop();
                    }
                    if (ALog.isPrintLog(2)) {
                        ALog.i(NetworkTask.TAG, "[onFinish]", NetworkTask.this.rc.seqNum, "code", Integer.valueOf(i), "msg", str, " bizReqId", NetworkTask.this.bizReqId);
                    }
                    try {
                        requestStatistic2.detectHttp3Status = session.detectHttp3Status;
                        requestStatistic2.deprecatedSessionType = session.getDeprecatedSessionType();
                        requestStatistic2.secondRefreshOpt = session.secondRefreshOpt;
                        requestStatistic2.isNetworkChangeThresholdTime = currentTimeMillis2 - GlobalAppRuntimeInfo.getNetworkStatusChangedTime() <= NetworkConfigCenter.getNetworkChangeThresholdTime();
                        long j = requestStatistic2.fisrtStart;
                        long currentTimeMillis3 = System.currentTimeMillis();
                        GlobalAppRuntimeInfo.NetworkChangeRequestStatus networkChangeRequestStatus = GlobalAppRuntimeInfo.NetworkChangeRequestStatus.YES_FAIL;
                        str2 = NetworkTask.TAG;
                        try {
                            requestStatistic2.setNetworkChangeRequest(j, currentTimeMillis3, networkChangeRequestStatus);
                            requestStatistic2.reqContentEncode = preProcessRequest.getHeaders() != null ? preProcessRequest.getHeaders().get(HttpConstant.CONTENT_ENCODING) : "";
                            requestStatistic2.requestBodyCompressType = preProcessRequest.requestBodyCompressType;
                            requestStatistic2.requestBodyCompressCostTime = preProcessRequest.requestBodyCompressCostTime;
                            requestStatistic2.requestBodyCompressRet = preProcessRequest.requestBodyCompressRet;
                            requestStatistic2.sessionSeq = session.toString();
                            if (preProcessRequest.reqBodyInflateSize > 0) {
                                requestStatistic2.reqBodyInflateSize = preProcessRequest.reqBodyInflateSize;
                            }
                            if (i2 < 0 && NetworkTask.this.rc.config.isAllowRetry()) {
                                if (!NetworkTask.this.isHeaderCallback && !NetworkTask.this.isDataChuckCallback) {
                                    if (AwcnConfig.isWifiUnavailableUseCellOptOpened() && !requestStatistic2.isSetForceCell) {
                                        WifiFgDetector.updateWifiFgDetect(i2, requestStatistic2.host, requestStatistic2.isWifi, requestStatistic2.forceCellular);
                                        requestStatistic2.useWifiFgForceCell = true;
                                    }
                                    ALog.e(str2, "clear response buffer and retry", NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
                                    if (NetworkTask.this.responseBuffer != null) {
                                        requestStatistic2.roaming = NetworkTask.this.responseBuffer.bodyBufferList.isEmpty() ? 3 : 4;
                                        NetworkTask.this.responseBuffer.release();
                                        NetworkTask.this.responseBuffer = null;
                                    }
                                    if (NetworkTask.this.rc.config.currentRetryTimes == 0) {
                                        requestStatistic2.firstProtocol = requestStatistic2.protocolType;
                                        requestStatistic2.firstErrorCode = requestStatistic2.tnetErrorCode != 0 ? requestStatistic2.tnetErrorCode : i2;
                                        requestStatistic2.firstBodyDeflatedType = requestStatistic2.bodyDeflatedType;
                                        requestStatistic2.firstBodyDeflatedRet = requestStatistic2.bodyDeflatedRet;
                                        AtomicBoolean atomicBoolean = NetworkTask.this.rc.config.isAllowZstdDict;
                                        if (preProcessRequest.rs.firstBodyDeflatedRet == 0 && preProcessRequest.rs.firstBodyDeflatedType == 4) {
                                            z = false;
                                            atomicBoolean.set(z);
                                            ALog.e(str2, "first request fail!", NetworkTask.this.rc.seqNum, "firstBodyDeflatedRet", Integer.valueOf(requestStatistic2.firstBodyDeflatedRet), "firstBodyDeflatedType", Integer.valueOf(requestStatistic2.firstBodyDeflatedType));
                                        }
                                        z = true;
                                        atomicBoolean.set(z);
                                        ALog.e(str2, "first request fail!", NetworkTask.this.rc.seqNum, "firstBodyDeflatedRet", Integer.valueOf(requestStatistic2.firstBodyDeflatedRet), "firstBodyDeflatedType", Integer.valueOf(requestStatistic2.firstBodyDeflatedType));
                                    }
                                    NetworkTask.this.rc.config.retryRequest();
                                    NetworkTask.this.rc.isDone = new AtomicBoolean();
                                    NetworkTask.this.rc.runningTask = new NetworkTask(NetworkTask.this.rc, NetworkTask.this.cache, NetworkTask.this.entry);
                                    if (requestStatistic2.tnetErrorCode != 0) {
                                        valueOf = i2 + "|" + requestStatistic2.protocolType + "|" + requestStatistic2.tnetErrorCode;
                                        requestStatistic2.tnetErrorCode = 0;
                                    } else {
                                        valueOf = String.valueOf(i);
                                    }
                                    requestStatistic2.appendErrorTrace(valueOf);
                                    long currentTimeMillis4 = System.currentTimeMillis();
                                    requestStatistic2.retryCostTime += currentTimeMillis4 - requestStatistic2.start;
                                    requestStatistic2.start = currentTimeMillis4;
                                    ThreadPoolExecutorFactory.submitPriorityTask(NetworkTask.this.rc.runningTask, ThreadPoolExecutorFactory.Priority.HIGH);
                                    return;
                                }
                                requestStatistic2.msg += ":回调后触发重试";
                                if (NetworkTask.this.isDataChuckCallback) {
                                    requestStatistic2.roaming = 2;
                                } else if (NetworkTask.this.isHeaderCallback) {
                                    requestStatistic2.roaming = 1;
                                }
                                ALog.e(str2, "Cannot retry request after onHeader/onDataReceived callback!", NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
                            }
                            if (NetworkTask.this.responseBuffer != null) {
                                NetworkTask.this.responseBuffer.callback(NetworkTask.this.rc.callback, NetworkTask.this.contentLength);
                            }
                            NetworkTask.this.rc.cancelTimeoutTask();
                            requestStatistic2.isDone.set(true);
                            if (!NetworkTask.this.rc.config.shouldCheckContentLength() || requestStatistic2.contentLength == 0 || requestStatistic2.contentLength == requestStatistic2.rspBodyDeflateSize) {
                                str3 = str;
                            } else {
                                requestStatistic2.ret = 0;
                                requestStatistic2.statusCode = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
                                String errMsg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH);
                                requestStatistic2.msg = errMsg;
                                ALog.e(str2, "received data length not match with content-length", NetworkTask.this.rc.seqNum, "content-length", Integer.valueOf(NetworkTask.this.contentLength), "recDataLength", Long.valueOf(requestStatistic2.rspBodyDeflateSize), " bizReqId", NetworkTask.this.bizReqId);
                                ExceptionStatistic exceptionStatistic = new ExceptionStatistic(ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH, errMsg, "rt");
                                exceptionStatistic.url = NetworkTask.this.rc.config.getUrlString();
                                AppMonitor.getInstance().commitStat(exceptionStatistic);
                                str3 = errMsg;
                                i2 = ErrorConstant.ERROR_DATA_LENGTH_NOT_MATCH;
                            }
                            if (i2 == 304 && NetworkTask.this.entry != null) {
                                requestStatistic2.protocolType = "cache";
                                defaultFinishEvent = new DefaultFinishEvent(200, str3, preProcessRequest);
                            } else {
                                defaultFinishEvent = new DefaultFinishEvent(i2, str3, preProcessRequest);
                            }
                            ALog.e(str2, "[onFinish] callback: " + i2, NetworkTask.this.rc.seqNum, new Object[0]);
                            NetworkTask.this.rc.callback.onFinish(defaultFinishEvent);
                            if (i2 >= 0) {
                                BandWidthSampler.getInstance().onDataReceived(requestStatistic2.sendStart, requestStatistic2.rspEnd, requestStatistic2.rspBodyDeflateSize + requestStatistic2.rspHeadDeflateSize);
                            } else {
                                requestStatistic2.netType = NetworkStatusHelper.getNetworkSubType();
                            }
                            NetworkAnalysis.getInstance().commitFlow(new FlowStat(NetworkTask.this.f_refer, requestStatistic2));
                        } catch (Exception e) {
                            e = e;
                            ALog.e(str2, "[RemoteFeatureQoS][onFinish] exception " + e.toString(), NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = NetworkTask.TAG;
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class ResponseBuffer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public List<ByteArray> bodyBufferList = new ArrayList();
        public int code;
        public Map<String, List<String>> header;

        static {
            kge.a(229651421);
        }

        public ResponseBuffer(int i, Map<String, List<String>> map) {
            this.code = i;
            this.header = map;
        }

        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
                return;
            }
            for (ByteArray byteArray : this.bodyBufferList) {
                byteArray.recycle();
            }
        }

        public int callback(Callback callback, int i) {
            IpChange ipChange = $ipChange;
            int i2 = 1;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4bcf849e", new Object[]{this, callback, new Integer(i)})).intValue();
            }
            callback.onResponseCode(this.code, this.header);
            for (ByteArray byteArray : this.bodyBufferList) {
                callback.onDataReceiveSize(i2, i, byteArray);
                i2++;
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public class BodyTimeoutChecker implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile long executeTime;
        private volatile boolean isCancelled;

        static {
            kge.a(510669650);
            kge.a(-1390502639);
        }

        private BodyTimeoutChecker() {
            this.executeTime = 0L;
            this.isCancelled = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.isCancelled || NetworkTask.this.isHeaderCallback || NetworkTask.this.isDataChuckCallback || NetworkTask.this.isDone.get()) {
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis <= this.executeTime) {
                    submit(this.executeTime - currentTimeMillis);
                    return;
                }
                NetworkTask.this.rc.config.rs.bodyTimeout = 1;
                if (NetworkTask.this.rc.config.rs.allowMultiPath != 1 || NetworkTask.this.rc.multiPathTask != null) {
                    return;
                }
                NetworkTask.this.rc.multiPathTask = new MultiPathTask(NetworkTask.this.rc);
                ThreadPoolExecutorFactory.submitBackupTask(NetworkTask.this.rc.multiPathTask);
                ALog.e(NetworkTask.TAG, "[bodyTimeoutChecker] run multi network task.", NetworkTask.this.rc.seqNum, " bizReqId", NetworkTask.this.bizReqId);
            }
        }

        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                submit(NetworkConfigCenter.getMultiPathTriggerTime());
            }
        }

        public void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else {
                this.isCancelled = true;
            }
        }

        public void reSchedule() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd73a171", new Object[]{this});
            } else {
                this.executeTime = System.currentTimeMillis() + NetworkConfigCenter.getMultiPathTriggerTime();
            }
        }

        private void submit(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9205", new Object[]{this, new Long(j)});
                return;
            }
            this.executeTime = System.currentTimeMillis() + j;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j, TimeUnit.MILLISECONDS);
        }
    }
}
