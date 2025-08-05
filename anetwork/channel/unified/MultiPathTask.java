package anetwork.channel.unified;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.NoSocketPermissionInBgException;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionParamStat;
import anet.channel.assist.ICapability;
import anet.channel.assist.ISysNetworkCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.bytes.ByteArray;
import anet.channel.encode.EncodingHelper;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.SessionType;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.HttpSession;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class MultiPathTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.MultiPathTask";
    private String bizReqId;
    private String f_refer;
    private RequestContext rc;
    private Request req;
    private volatile boolean isCanceled = false;
    public volatile Cancelable cancelable = null;
    private int contentLength = 0;
    private int dataChunkIndex = 0;
    private AtomicBoolean responseReturn = new AtomicBoolean(false);
    private AtomicBoolean isVpnFastDegradeTask = new AtomicBoolean(false);

    static {
        kge.a(1309978072);
        kge.a(471853369);
    }

    public static /* synthetic */ void access$000(MultiPathTask multiPathTask, int i, Map map, Request request, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9bd99", new Object[]{multiPathTask, new Integer(i), map, request, requestStatistic});
        } else {
            multiPathTask.onResponseCodeCallBack(i, map, request, requestStatistic);
        }
    }

    public static /* synthetic */ void access$100(MultiPathTask multiPathTask, ByteArray byteArray, boolean z, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d182b6a4", new Object[]{multiPathTask, byteArray, new Boolean(z), requestStatistic});
        } else {
            multiPathTask.onDataReceiveCallBack(byteArray, z, requestStatistic);
        }
    }

    public static /* synthetic */ void access$200(MultiPathTask multiPathTask, int i, String str, RequestStatistic requestStatistic, Session session, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b476a2", new Object[]{multiPathTask, new Integer(i), str, requestStatistic, session, request});
        } else {
            multiPathTask.onFinishCallBack(i, str, requestStatistic, session, request);
        }
    }

    public MultiPathTask(RequestContext requestContext) {
        this.rc = requestContext;
        this.req = requestContext.config.getAwcnRequest();
        this.f_refer = requestContext.config.getHeaders().get("f-refer");
        this.bizReqId = requestContext.config.bizReqId;
    }

    public void setVpnFastDegradeTaskFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608d5cb4", new Object[]{this, new Boolean(z)});
        } else {
            this.isVpnFastDegradeTask.set(z);
        }
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

    public boolean isCanceled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue() : this.isCanceled;
    }

    public boolean isResponseReturn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38218fa6", new Object[]{this})).booleanValue() : this.responseReturn.get();
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
            if (!TextUtils.isEmpty(cookie)) {
                builder = request.newBuilder();
                String str2 = request.getHeaders().get("Cookie");
                if (!TextUtils.isEmpty(str2)) {
                    cookie = StringUtils.concatString(str2, "; ", cookie);
                }
                if (AwcnConfig.isHostInCookiePrintLogWhiteList(request.getHost())) {
                    CookieManager.printLog("MultiPathTask", this.rc.seqNum, cookie, this.rc.config.getUrlString());
                }
                builder.addHeader("Cookie", cookie);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        this.rc.config.rs.cookieTime = currentTimeMillis2 - currentTimeMillis;
        if (EncodingHelper.isZstdValid() && AwcnConfig.isDecompressOpend()) {
            if (builder == null) {
                builder = request.newBuilder();
            }
            if (TextUtils.isEmpty(request.getHeaders().get("Accept-Encoding")) || AwcnConfig.isHostInAcceptEncodeWhiteList(request.getHost())) {
                this.rc.config.dueToAcceptEncode(builder);
            }
        }
        this.rc.config.rs.acceptEncodeTime = System.currentTimeMillis() - currentTimeMillis2;
        int i = -1;
        if (!AwcnConfig.isUplinkEncodeOpened() || !this.rc.config.isRequestUplinkEncodeEnable(2) || !AwcnConfig.isHostInUplinkEncodeHostWhiteList(request.getHttpUrl().host())) {
            str = BuildConfig.RPC_TYPE_DEF;
        } else {
            if (builder == null) {
                builder = request.newBuilder();
            }
            String uplinkEncodeByUrlWhiteList = AwcnConfig.getUplinkEncodeByUrlWhiteList(request.getHttpUrl().host() + request.getHttpUrl().path());
            str = uplinkEncodeByUrlWhiteList;
            i = request.requestBodyCompress(builder, uplinkEncodeByUrlWhiteList);
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        if (AwcnConfig.isAmdcPriorityUpdateEnable() && AmdcPriorityHelper.isPriorityHost(this.rc.seqNum, GlobalAppRuntimeInfo.getUserId(), request.getHttpUrl().host())) {
            if (builder == null) {
                builder = request.newBuilder();
            }
            this.rc.config.dueToRequestPriority(builder);
        }
        this.rc.config.rs.reqPriorityTime = System.currentTimeMillis() - currentTimeMillis3;
        if (builder == null) {
            request.requestBodyCompressRet = i;
            request.requestBodyCompressType = str;
            return request;
        }
        Request build = builder.build();
        build.requestBodyCompressRet = i;
        build.requestBodyCompressType = str;
        build.requestBodyCompressCostTime = request.requestBodyCompressCostTime;
        build.reqBodyInflateSize = request.reqBodyInflateSize;
        return build;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        final Session httpSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if ((this.isVpnFastDegradeTask.get() && !GlobalAppRuntimeInfo.isStatusChangedRequest(this.rc.seqNum)) || this.isCanceled || this.rc.isDone.get() || (context = GlobalAppRuntimeInfo.getContext()) == null) {
        } else {
            if (this.isVpnFastDegradeTask.get()) {
                ALog.e(TAG, "[ap] start VpnFastDegradeTask request.", this.rc.seqNum, " bizReqId", this.bizReqId);
            } else {
                ALog.e(TAG, "[ap] start multi path request.", this.rc.seqNum, " bizReqId", this.bizReqId);
                GlobalAppRuntimeInfo.showUserToast();
            }
            final RequestStatistic requestStatistic = this.rc.config.rs;
            long currentTimeMillis = System.currentTimeMillis();
            final Request preProcessRequest = preProcessRequest(this.req);
            requestStatistic.reqStart = System.currentTimeMillis();
            requestStatistic.reqPreProcessTime = requestStatistic.reqStart - currentTimeMillis;
            HttpUrl httpUrl = this.rc.config.getHttpUrl();
            requestStatistic.bizReqId = this.bizReqId;
            if (this.isVpnFastDegradeTask.get()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    httpSession = tryGetSession();
                    if (httpSession == null) {
                        String concatString = StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host());
                        httpSession = new HttpSession(context, new ConnInfo(concatString, this.rc.seqNum + "_vpnFast", null));
                        requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis2;
                        requestStatistic.waitConnectStat = 1;
                        ALog.e(TAG, "[ap] VpnFastDegradeTask HttpSession session=" + httpSession.mSeq, this.rc.seqNum, " bizReqId", this.bizReqId);
                    } else {
                        requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis2;
                        ALog.e(TAG, "[ap] VpnFastDegradeTask tryGetSession=" + httpSession.mSeq, this.rc.seqNum, " bizReqId", this.bizReqId);
                    }
                } catch (NoSocketPermissionInBgException unused) {
                    ALog.e(TAG, "[bg_socket_opt] send fail! no socket read and write permissions in the background！", this.rc.seqNum, "url", this.rc.config.getHttpUrl());
                    requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis2;
                    this.rc.config.commitStatic(this.rc.callback, requestStatistic, ErrorConstant.ERROR_REQUEST_SOCKET_NOT_PERMISSION_IN_BG, "bg_socket");
                    return;
                }
            } else {
                String concatString2 = StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host());
                httpSession = new HttpSession(context, new ConnInfo(concatString2, this.rc.seqNum + "_mc", null));
                httpSession.setForceCellular(true);
                requestStatistic.isPreSession = true;
                requestStatistic.waitConnectStat = 1;
            }
            requestStatistic.isSetForceCell = httpSession.getForceCellular();
            this.cancelable = httpSession.request(preProcessRequest, new RequestCb() { // from class: anetwork.channel.unified.MultiPathTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.RequestCb
                public void onResponseCode(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                    } else {
                        MultiPathTask.access$000(MultiPathTask.this, i, map, preProcessRequest, requestStatistic);
                    }
                }

                @Override // anet.channel.RequestCb
                public void onDataReceive(ByteArray byteArray, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                    } else {
                        MultiPathTask.access$100(MultiPathTask.this, byteArray, z, requestStatistic);
                    }
                }

                @Override // anet.channel.RequestCb
                public void onFinish(int i, String str, RequestStatistic requestStatistic2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic2});
                    } else {
                        MultiPathTask.access$200(MultiPathTask.this, i, str, requestStatistic2, httpSession, preProcessRequest);
                    }
                }
            });
        }
    }

    private void onFinishCallBack(int i, String str, RequestStatistic requestStatistic, Session session, Request request) {
        ICapability capability;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0512130", new Object[]{this, new Integer(i), str, requestStatistic, session, request});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.responseReturn.get() || this.isCanceled) {
            return;
        }
        if (!this.isVpnFastDegradeTask.get() && ((i == -406 || i == -405) && (capability = NetworkAssist.getAssistManager().getCapability(3)) != null && capability.isEnable())) {
            ((ISysNetworkCapability) capability).recoverCellularStatus();
        }
        if (this.rc.isDone.getAndSet(true)) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "[onFinish]", this.rc.seqNum, "code", Integer.valueOf(i), "msg", str);
        }
        String str2 = this.isVpnFastDegradeTask.get() ? "[ap] isVpnFastDegradeTask" : "[ap] isMultiPathTask";
        ALog.e(TAG, str2 + "[onFinish] code" + i, this.rc.seqNum, " bizReqId", this.bizReqId);
        requestStatistic.deprecatedSessionType = session.getDeprecatedSessionType();
        requestStatistic.secondRefreshOpt = session.secondRefreshOpt;
        if (currentTimeMillis - GlobalAppRuntimeInfo.getNetworkStatusChangedTime() <= NetworkConfigCenter.getNetworkChangeThresholdTime()) {
            z = true;
        }
        requestStatistic.isNetworkChangeThresholdTime = z;
        if (!this.isVpnFastDegradeTask.get()) {
            requestStatistic.useMultiPath = 1;
        } else {
            requestStatistic.useVpnFastDegrade = 1;
        }
        requestStatistic.reqContentEncode = request.getHeaders() != null ? request.getHeaders().get(HttpConstant.CONTENT_ENCODING) : "";
        requestStatistic.requestBodyCompressType = request.requestBodyCompressType;
        requestStatistic.requestBodyCompressCostTime = request.requestBodyCompressCostTime;
        requestStatistic.requestBodyCompressRet = request.requestBodyCompressRet;
        if (request.reqBodyInflateSize > 0) {
            requestStatistic.reqBodyInflateSize = request.reqBodyInflateSize;
        }
        requestStatistic.sessionSeq = session.toString();
        requestStatistic.setConnType(session.getConnType());
        this.rc.cancelTimeoutTask();
        requestStatistic.isDone.set(true);
        if (this.rc.callback == null) {
            return;
        }
        requestStatistic.setNetworkChangeRequest(requestStatistic.fisrtStart, currentTimeMillis, GlobalAppRuntimeInfo.NetworkChangeRequestStatus.YES_FAIL);
        this.rc.callback.onFinish(new DefaultFinishEvent(i, str, request));
    }

    private void onDataReceiveCallBack(ByteArray byteArray, boolean z, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982fa3db", new Object[]{this, byteArray, new Boolean(z), requestStatistic});
        } else if (!this.responseReturn.get() || this.isCanceled || this.rc.isDone.get()) {
        } else {
            this.dataChunkIndex++;
            if (this.rc.callback != null) {
                this.rc.callback.onDataReceiveSize(this.dataChunkIndex, this.contentLength, byteArray);
            }
            if (!z) {
                return;
            }
            requestStatistic.setNetworkChangeRequest(requestStatistic.fisrtStart, System.currentTimeMillis(), GlobalAppRuntimeInfo.NetworkChangeRequestStatus.YES_SUCCESS);
        }
    }

    private void onResponseCodeCallBack(int i, Map<String, List<String>> map, Request request, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850bf56e", new Object[]{this, new Integer(i), map, request, requestStatistic});
            return;
        }
        if (AwcnConfig.isVpnOptOpened()) {
            NetworkTask networkTask = (NetworkTask) this.rc.runningTask;
            if (this.isVpnFastDegradeTask.get()) {
                if ((this.rc.multiPathTask != null && this.rc.multiPathTask.isResponseReturn()) || (networkTask != null && networkTask.isResponseReturn())) {
                    ALog.e(TAG, "[ap] onResponseCode, end vpnFastDegrade task! other task already return", request.getSeq(), " bizReqId", this.bizReqId);
                    return;
                } else if (this.rc.isDone.get() || this.isCanceled) {
                    return;
                } else {
                    ALog.e(TAG, "[ap] onResponseCode, vpnFastDegrade task already return! cancel other task", request.getSeq(), " bizReqId", this.bizReqId);
                    this.rc.cancelMultiPathTask();
                    requestStatistic.useVpnFastDegrade = 1;
                }
            } else if ((this.rc.vpnFastDegradeTask != null && this.rc.vpnFastDegradeTask.isResponseReturn()) || (networkTask != null && networkTask.isResponseReturn())) {
                ALog.e(TAG, "[ap] onResponseCode, end multiPath task! other task already return", request.getSeq(), " bizReqId", this.bizReqId);
                return;
            } else if (this.rc.isDone.get() || this.isCanceled) {
                return;
            } else {
                ALog.e(TAG, "[ap] onResponseCode, multiPath task already return! cancel other task", request.getSeq(), " bizReqId", this.bizReqId);
                this.rc.cancelVpnFastDegradeTask();
                requestStatistic.useMultiPath = 1;
            }
            this.rc.cancelRunningTask();
            this.responseReturn.set(true);
        } else if (this.rc.isDone.get() || this.isCanceled) {
            return;
        } else {
            this.responseReturn.set(true);
            requestStatistic.useMultiPath = 1;
        }
        this.rc.cancelTimeoutTask();
        CookieManager.setCookie(this.rc.config.getHost(), this.rc.config.getUrlString(), map);
        this.contentLength = HttpHelper.parseContentLength(map);
        if (request.requestBodyCompressRet == 1) {
            map.put(HttpConstant.X_UPLINK_ENCODE, Arrays.asList(request.requestBodyCompressType));
        }
        if (this.rc.callback == null) {
            return;
        }
        this.rc.callback.onResponseCode(i, map);
    }

    private Session tryGetSession() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("e3d315ac", new Object[]{this});
        }
        SessionCenter sessionCenter = GlobalAppRuntimeInfo.getSessionCenter();
        HttpUrl httpUrl = this.rc.config.getHttpUrl();
        boolean containsNonDefaultPort = httpUrl.containsNonDefaultPort();
        boolean z2 = AwcnConfig.isAllowRetryUseLongLinkEnable() && AwcnConfig.isHostInAllowRetryUseLongLinkWhiteList(this.rc.config.getHost());
        if (this.rc.config.requestType != 1 || !NetworkConfigCenter.isSpdyEnabled()) {
            return null;
        }
        if ((!z2 && this.rc.config.currentRetryTimes != 0) || containsNonDefaultPort) {
            return null;
        }
        HttpUrl checkCName = checkCName(httpUrl, this.rc);
        try {
            String str = this.rc.seqNum;
            if (z2 && this.rc.config.currentRetryTimes != 0) {
                z = true;
            }
            Session throwsException = sessionCenter.getThrowsException(checkCName, SessionType.LONG_LINK, 0L, new SessionParamStat(str, z));
            if (throwsException != null) {
                try {
                    this.rc.config.rs.isPreSession = true;
                } catch (Exception unused) {
                }
            }
            return throwsException;
        } catch (NoAvailStrategyException | Exception unused2) {
            return null;
        } catch (NoSocketPermissionInBgException unused3) {
            throw new NoSocketPermissionInBgException("no socket permissions in background");
        }
    }

    public static HttpUrl checkCName(HttpUrl httpUrl, RequestContext requestContext) {
        HttpUrl parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrl) ipChange.ipc$dispatch("489847f3", new Object[]{httpUrl, requestContext});
        }
        String str = requestContext.config.getHeaders().get(HttpConstant.X_HOST_CNAME);
        return (TextUtils.isEmpty(str) || (parse = HttpUrl.parse(httpUrl.urlString().replaceFirst(httpUrl.host(), str))) == null) ? httpUrl : parse;
    }
}
