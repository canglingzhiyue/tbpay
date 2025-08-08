package com.alipay.mobile.common.rpc.transport.http;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoUtil;
import com.alipay.mobile.common.rpc.Config;
import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.impl.RpcLifeManagerImpl;
import com.alipay.mobile.common.rpc.transport.AbstractRpcCaller;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.Transport;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.HttpException;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.alipay.mobile.common.transport.utils.MpaasPropertiesUtil;
import com.alipay.mobile.common.transport.utils.RpcSignUtil;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.tao.messagekit.base.network.a;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import tb.riy;

/* loaded from: classes3.dex */
public class HttpCaller extends AbstractRpcCaller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Config f5512a;
    private String b;
    private String c;
    private RpcSignUtil.SignData d;
    private String e;
    private String f;
    private Map<String, String> g;
    private Context h;
    private String i;
    private String j;
    private InnerRpcInvokeContext k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private String q;
    private int r;

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 11) {
            return 18;
        }
        if (i == 50) {
            return 24;
        }
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 15;
            case 9:
                return 16;
            default:
                return 9;
        }
    }

    public static /* synthetic */ Object ipc$super(HttpCaller httpCaller, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HttpCaller(Config config, Method method, int i, String str, byte[] bArr, String str2, Context context, InnerRpcInvokeContext innerRpcInvokeContext) {
        super(method, i, str, bArr, str2, innerRpcInvokeContext.resetCookie.booleanValue());
        this.i = "";
        this.j = "";
        this.l = -1L;
        this.m = -1L;
        this.n = -1L;
        this.o = -1L;
        this.p = true;
        this.q = "";
        this.r = 0;
        this.f5512a = config;
        this.h = context;
        this.k = innerRpcInvokeContext;
    }

    @Override // com.alipay.mobile.common.rpc.transport.RpcCaller
    public Object call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        a();
        HttpUrlRequest httpUrlRequest = new HttpUrlRequest(this.q);
        httpUrlRequest.setReqData(this.mReqData);
        httpUrlRequest.setContentType(this.mContentType);
        httpUrlRequest.setResetCookie(this.k.resetCookie.booleanValue());
        httpUrlRequest.setCompress(this.k.compress.booleanValue());
        httpUrlRequest.setBgRpc(this.k.bgRpc.booleanValue());
        httpUrlRequest.setUrgentFlag(this.k.isUrgent);
        httpUrlRequest.allowRetry = this.k.allowRetry.booleanValue();
        httpUrlRequest.setTimeout(this.k.timeout);
        httpUrlRequest.setAllowNonNet(this.k.allowNonNet);
        httpUrlRequest.setSwitchLoginRpc(this.k.switchUserLoginRpc);
        httpUrlRequest.setDisableEncrypt(this.k.disableEnctypt);
        httpUrlRequest.setEnableEncrypt(this.k.enableEncrypt);
        httpUrlRequest.setBizLog(this.k.bizLog);
        httpUrlRequest.setRpcHttp2(!ProtocolVersions.HTTP_1_1.equals(this.k.protocolVersion));
        i(httpUrlRequest);
        if (this.k.isGetMethod) {
            httpUrlRequest.setRequestMethod("GET");
            httpUrlRequest.setReqData(null);
        } else {
            httpUrlRequest.setRequestMethod("POST");
        }
        c(httpUrlRequest);
        LogCatUtil.info("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; Request info: " + a(httpUrlRequest));
        try {
            try {
                try {
                    try {
                        try {
                            Response b = b(httpUrlRequest);
                            LogCatUtil.info("HttpCaller", "threadid=" + Thread.currentThread().getId() + " Response success.");
                            a((HttpUrlResponse) b);
                            a(true);
                            return b;
                        } catch (Throwable th) {
                            a(false);
                            throw th;
                        }
                    } catch (CancellationException e) {
                        httpUrlRequest.cancel("CancellationException");
                        LogCatUtil.error("HttpCaller", "CancellationException:" + MiscUtils.getRootCause(e));
                        throw new RpcException(13, "CancellationException", e);
                    }
                } catch (TimeoutException e2) {
                    httpUrlRequest.cancel("TimeoutException");
                    LogCatUtil.error("HttpCaller", "TimeoutException: " + MiscUtils.getRootCause(e2));
                    throw new RpcException(13, "TimeoutException", e2);
                }
            } catch (InterruptedException e3) {
                httpUrlRequest.cancel("InterruptedException");
                LogCatUtil.error("HttpCaller", "InterruptedException:" + MiscUtils.getRootCause(e3));
                throw new RpcException(13, "InterruptedException", e3);
            }
        } catch (ExecutionException e4) {
            httpUrlRequest.cancel("ExecutionException");
            Throwable cause = e4.getCause();
            LogCatUtil.debug("HttpCaller", "ExecutionException:" + cause);
            if (cause != null && (cause instanceof HttpException)) {
                httpException2RpcException((HttpException) cause);
            }
            MonitorErrorLogHelper.log("HttpCaller", cause);
            throw new RpcException(9, cause != null ? cause.toString() : "", cause);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.q = b();
        if (this.k.isGetMethod) {
            this.q += "?" + new String(this.mReqData);
        }
        if (!TransportStrategy.isHitBifrostH2MultiplexByUrl(this.q)) {
            return;
        }
        this.k.setRpcProtocol(ProtocolVersions.HTTP_2_0);
        this.k.setUseMultiplexLink(true);
    }

    public void httpException2RpcException(HttpException httpException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b65691", new Object[]{this, httpException});
            return;
        }
        RpcException rpcException = new RpcException(Integer.valueOf(a(httpException.getCode())), httpException.getMsg());
        if (httpException.getCode() == 50) {
            rpcException.setAlert(0);
        }
        throw rpcException;
    }

    private void a(boolean z) {
        InnerRpcInvokeContext innerRpcInvokeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z || (innerRpcInvokeContext = this.k) == null) {
        } else {
            innerRpcInvokeContext.responseHeader = Collections.EMPTY_MAP;
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        this.j = c();
        this.i = e();
        if (!StringUtils.isEmpty(this.i)) {
            return this.i;
        }
        return this.j;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (!MiscUtils.isDebugger(this.h)) {
            return this.k.gwUrl;
        }
        if (this.k.isCustGwUrl) {
            return this.k.gwUrl;
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MOBILEGW_URL);
        if (!StringUtils.isEmpty(stringValue)) {
            LogCatUtil.info("HttpCaller", "getRequestUrl.   config gw url: " + stringValue);
            return stringValue;
        }
        try {
            if (!TransportStrategy.isAlipayUrl(this.k.gwUrl)) {
                LogCatUtil.info("HttpCaller", "getRequestUrl.   Not alipay url: " + this.k.gwUrl);
                return this.k.gwUrl;
            }
            String a2 = a(this.k.gwUrl);
            if (!StringUtils.isEmpty(a2)) {
                return a2;
            }
            LogCatUtil.info("HttpCaller", "getRequestUrl.  default gw url: " + this.k.gwUrl);
            return this.k.gwUrl;
        } catch (MalformedURLException e) {
            LogCatUtil.error("HttpCaller", e);
            return this.k.gwUrl;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            return "";
        }
        try {
            URI uri = new URI(str);
            if (StringUtils.equals(uri.getScheme(), "https") && uri.getHost().endsWith("alipay.net")) {
                String str2 = k.HTTP_PREFIX + uri.getHost() + uri.getPath();
                LogCatUtil.info("HttpCaller", "getRequestUrl.   " + uri + " replace to " + str2);
                return str2;
            }
        } catch (URISyntaxException e) {
            LogCatUtil.error("HttpCaller", e);
        }
        return "";
    }

    private String a(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f220884", new Object[]{this, httpUrlRequest});
        }
        if (MiscUtils.isInLogBackList(this.mOperationType) || !MiscUtils.isDebugger(this.h)) {
            ArrayList<Header> headers = httpUrlRequest.getHeaders();
            StringBuilder sb = new StringBuilder(363);
            Iterator<Header> it = headers.iterator();
            while (it.hasNext()) {
                Header next = it.next();
                sb.append(next.getName());
                sb.append("=");
                sb.append(next.getValue());
                sb.append(",");
            }
            sb.append(",   根据相关法律法规和政策，部分内容未予显示");
            return sb.toString();
        }
        return httpUrlRequest.toString();
    }

    private Response b(HttpUrlRequest httpUrlRequest) {
        Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("60e09d9", new Object[]{this, httpUrlRequest});
        }
        this.l = System.currentTimeMillis();
        this.m = SystemClock.elapsedRealtime();
        Future<Response> execute = d().execute(httpUrlRequest);
        RpcLifeManagerImpl.getInstance().addFuture(execute);
        MonitorInfoUtil.startLinkRecordPhase(this.mOperationType, "rpc_network_task", null);
        MonitorInfoUtil.endLinkRecordPhase(this.mOperationType, "rpc_first_half", null);
        try {
            if (this.k.timeout > 0) {
                response = execute.get(this.k.timeout, TimeUnit.MILLISECONDS);
            } else {
                response = execute.get(TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.RPC_TOTAL_TIMEOUT), TimeUnit.MILLISECONDS);
            }
            if (response != null) {
                return response;
            }
            LogCatUtil.info("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; Response fail: [response is null]. mOperationType=[" + this.mOperationType + "] ");
            throw new RpcException((Integer) 9, "response is null");
        } finally {
            MonitorInfoUtil.endLinkRecordPhase(this.mOperationType, "rpc_network_task", null);
            MonitorInfoUtil.startLinkRecordPhase(this.mOperationType, "rpc_second_half", null);
            RpcLifeManagerImpl.getInstance().removeFuture(execute);
            this.n = SystemClock.elapsedRealtime();
            this.o = this.l + (this.n - this.m);
        }
    }

    private void a(HttpUrlResponse httpUrlResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee52ad84", new Object[]{this, httpUrlResponse});
        } else if (httpUrlResponse == null || httpUrlResponse.getHeader() == null) {
            LogCatUtil.warn("HttpCaller", "[setResponseHeaders] response or header is null.");
        } else {
            httpUrlResponse.getHeader().setHead(HeaderConstant.HEADER_KEY_X_RPC_REQ_TICK, String.valueOf(this.m));
            httpUrlResponse.getHeader().setHead(HeaderConstant.HEADER_KEY_X_RPC_RES_TICK, String.valueOf(this.n));
            this.k.responseHeader = httpUrlResponse.getHeader().getHeaders();
            this.f5512a.giveResponseHeader(this.mOperationType, httpUrlResponse.getHeader());
        }
    }

    private void c(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9409d89e", new Object[]{this, httpUrlRequest});
            return;
        }
        g(httpUrlRequest);
        this.f5512a.addExtHeaders(httpUrlRequest);
        d(httpUrlRequest);
        if (!isRpcVersion2()) {
            httpUrlRequest.setHeader(new BasicHeader(a.KEY_DID, DeviceInfoUtil.getDeviceId()));
            httpUrlRequest.setHeader(new BasicHeader("clientId", DeviceInfoUtil.getClientId()));
            httpUrlRequest.setHeader(new BasicHeader("TRACKERID", AppInfoUtil.getTrackerID()));
            RpcSignUtil.SignData signData = getSignData();
            if (signData != null && !StringUtils.isEmpty(signData.sign) && signData.signType != -1) {
                httpUrlRequest.setHeader(new BasicHeader("signType", String.valueOf(signData.signType)));
            }
        } else {
            f(httpUrlRequest);
            String deviceId = DeviceInfoUtil.getDeviceId();
            if (!StringUtils.isEmpty(deviceId)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_DID, deviceId));
            }
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_VERSION, "2"));
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, this.mOperationType));
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_TS, this.c));
            httpUrlRequest.setHeader(new BasicHeader("Content-Type", this.mContentType));
            if (!StringUtils.isEmpty(this.f)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_SENCE, this.f));
            }
            RpcSignUtil.SignData signData2 = getSignData();
            if (signData2 != null && !StringUtils.isEmpty(signData2.sign)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_SIGN, signData2.sign));
                if (signData2.signType != -1) {
                    httpUrlRequest.setHeader(new BasicHeader("signType", String.valueOf(signData2.signType)));
                }
            }
        }
        e(httpUrlRequest);
        h(httpUrlRequest);
        j(httpUrlRequest);
    }

    private void d(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7f791f", new Object[]{this, httpUrlRequest});
        } else if (!StringUtils.isEmpty(this.k.appId)) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, this.k.appId));
        } else {
            String appIdForMPaaS = AppInfoUtil.getAppIdForMPaaS();
            if (!StringUtils.isEmpty(appIdForMPaaS)) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, appIdForMPaaS));
                return;
            }
            String appId = MpaasPropertiesUtil.getAppId(this.h, this.k.appKey);
            httpUrlRequest.addHeader(new BasicHeader(HeaderConstant.HEADER_KEY_APPID, appId));
            Context context = this.h;
            if (context == null || MiscUtils.isInAlipayClient(context)) {
                return;
            }
            httpUrlRequest.putLogAttachment("APP_ID", appId);
        }
    }

    private void e(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f519a0", new Object[]{this, httpUrlRequest});
            return;
        }
        try {
            if (!MiscUtils.isInAlipayClient(this.h)) {
                return;
            }
            if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.ALIPAY_CLIENT_VERSION, "T")) {
                String productVersion = AppInfoUtil.getProductVersion();
                if (!StringUtils.isEmpty(productVersion)) {
                    httpUrlRequest.setHeader(new BasicHeader("clientVersion", productVersion));
                }
            }
            if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.ALIPAY_USER_ID, "T")) {
                return;
            }
            String lastUserId = UserInfoUtil.getLastUserId();
            if (StringUtils.isEmpty(lastUserId)) {
                return;
            }
            httpUrlRequest.setHeader(new BasicHeader("userId", lastUserId));
        } catch (Throwable th) {
            LogCatUtil.warn("HttpCaller", "add ext header exception. " + th.toString());
        }
    }

    @Deprecated
    private void f(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36aba21", new Object[]{this, httpUrlRequest});
            return;
        }
        Map<String, String> map = this.g;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : this.g.entrySet()) {
            httpUrlRequest.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
        }
    }

    private void g(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de05aa2", new Object[]{this, httpUrlRequest});
            return;
        }
        if (this.k.requestHeaders != null && !this.k.requestHeaders.isEmpty()) {
            for (Map.Entry<String, String> entry : this.k.requestHeaders.entrySet()) {
                httpUrlRequest.addHeader(new BasicHeader(entry.getKey(), entry.getValue()));
            }
        }
        Map<String, String> mpaasProperties = MpaasPropertiesUtil.getMpaasProperties(this.h);
        if (mpaasProperties != null && !mpaasProperties.isEmpty()) {
            for (Map.Entry<String, String> entry2 : mpaasProperties.entrySet()) {
                httpUrlRequest.addHeader(new BasicHeader(entry2.getKey(), entry2.getValue()));
            }
        }
        if (!StringUtils.isEmpty(this.k.workspaceId)) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, this.k.workspaceId));
            return;
        }
        String workspaceIdForMPaaS = AppInfoUtil.getWorkspaceIdForMPaaS();
        if (StringUtils.isEmpty(workspaceIdForMPaaS)) {
            return;
        }
        httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, workspaceIdForMPaaS));
    }

    private Transport d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("21fbcc45", new Object[]{this});
        }
        if (this.f5512a.getTransport() == null) {
            throw new RpcException((Integer) 1, "Not find this type Transport");
        }
        return this.f5512a.getTransport();
    }

    public void setReqDataDigest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fcd31b", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getReqDataDigest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15d17323", new Object[]{this}) : this.b;
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this}) : this.mContentType;
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.mContentType = str;
        }
    }

    public String getTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b946cb9", new Object[]{this}) : this.c;
    }

    public void setTimeStamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a936e645", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setSignData(RpcSignUtil.SignData signData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d600f678", new Object[]{this, signData});
        } else {
            this.d = signData;
        }
    }

    public RpcSignUtil.SignData getSignData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcSignUtil.SignData) ipChange.ipc$dispatch("590f6efc", new Object[]{this}) : this.d;
    }

    public String getRpcVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b056bb70", new Object[]{this}) : this.e;
    }

    public void setRpcVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16a3a06", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public boolean isRpcVersion2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("414315e0", new Object[]{this})).booleanValue() : StringUtils.equals(this.e, "2");
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public Map<String, String> getExtParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df1125e", new Object[]{this}) : this.g;
    }

    public void setExtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00aebf0", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public void setExtObjectParam(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70844b0f", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            this.g = hashMap;
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        try {
        } catch (Exception e) {
            LogCatUtil.error("HttpCaller", e);
        }
        if (!MiscUtils.isInAlipayClient(this.h)) {
            return "";
        }
        String str = this.mOperationType;
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.CDN_APIS);
        if (StringUtils.isEmpty(stringValue)) {
            return "";
        }
        String stringValue2 = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.CDN_URL);
        if (StringUtils.isEmpty(stringValue2)) {
            return "";
        }
        for (String str2 : stringValue.split(",")) {
            if (StringUtils.equals(str, str2)) {
                LogCatUtil.info("HttpCaller", "Modify gw url to cdn url. operationType=[" + str + "], cdnUrl=[" + stringValue2 + riy.ARRAY_END_STR);
                return stringValue2;
            }
        }
        return "";
    }

    public int getSignCost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d0f94d1a", new Object[]{this})).intValue() : this.r;
    }

    public void setSignCost(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1073130", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    private void h(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3855fb23", new Object[]{this, httpUrlRequest});
        } else if (StringUtils.isEmpty(this.i)) {
        } else {
            httpUrlRequest.addTags(TransportConstants.KEY_FORCE_HTTP, "true");
            try {
                URL url = new URL(this.j);
                try {
                    HttpDns.HttpdnsIP ipInfoByHost = AlipayHttpDnsClient.getDnsClient().getIpInfoByHost(url.getHost());
                    if (ipInfoByHost != null) {
                        String ip = ipInfoByHost.getIp();
                        if (!StringUtils.isEmpty(ip)) {
                            httpUrlRequest.setHeader(new BasicHeader("backend", ip));
                            return;
                        }
                    }
                } catch (Exception e) {
                    LogCatUtil.warn("HttpCaller", e);
                }
                httpUrlRequest.setHeader(new BasicHeader("backend", url.getHost()));
            } catch (Exception e2) {
                throw new RuntimeException("originGwUrl=" + this.j, e2);
            }
        }
    }

    private void i(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cb9ba4", new Object[]{this, httpUrlRequest});
            return;
        }
        httpUrlRequest.addTags("id", String.valueOf(this.mId));
        httpUrlRequest.addTags("operationType", this.mOperationType);
        httpUrlRequest.addTags(TransportConstants.KEY_REQ_DATA_DIGEST, getReqDataDigest());
        httpUrlRequest.addTags(TransportConstants.KEY_RPC_VERSION, this.e);
        httpUrlRequest.addTags(TransportConstants.KEY_UUID, DeviceInfoUtil.getDeviceId() + this.c);
        httpUrlRequest.addTags(TransportConstants.KEY_IS_NEED_SIGN, String.valueOf(this.p));
        httpUrlRequest.addTags(TransportConstants.KEY_IS_CUST_GW_URL, String.valueOf(this.k.isCustGwUrl));
        if (this.k.useMultiplexLink) {
            httpUrlRequest.addTags(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK, "1");
        }
        if (this.k.loggerLevel != -1) {
            httpUrlRequest.addTags(TransportConstants.KEY_LOGGER_LEVEL, String.valueOf(this.k.loggerLevel));
        }
        int signCost = getSignCost();
        if (signCost == 0) {
            return;
        }
        httpUrlRequest.addTags(TransportConstants.KEY_SIGN_TIME, String.valueOf(signCost));
    }

    private void j(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad413c25", new Object[]{this, httpUrlRequest});
            return;
        }
        if (this.k.shortOnly) {
            httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_PARAM_SHORTLINK_ONLY, "1"));
            if (!StringUtils.isEmpty(this.k.getShortLinkIPList())) {
                httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_PARAM_SHORTLINK_IPLIST, this.k.getShortLinkIPList()));
            }
        }
        if (!this.k.useMultiplexLink) {
            return;
        }
        httpUrlRequest.setHeader(new BasicHeader(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK, "1"));
    }

    public void setNeedSign(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b501f258", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }
}
