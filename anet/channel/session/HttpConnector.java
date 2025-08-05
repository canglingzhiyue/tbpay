package anet.channel.session;

import android.net.Network;
import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpSslUtil;
import anet.channel.util.ProxySetting;
import anet.channel.util.StringUtils;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import tb.kge;

/* loaded from: classes.dex */
public class HttpConnector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.HttpConnector";

    /* loaded from: classes.dex */
    public static class Response {
        public int contentLength;
        public String encodeType;
        public Map<String, List<String>> header;
        public int httpCode;
        public byte[] out;
        public int supportEncodeType;

        static {
            kge.a(-522465384);
        }
    }

    static {
        kge.a(222950285);
    }

    private HttpConnector() {
    }

    public static Response connect(Request request) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Response) ipChange.ipc$dispatch("720c2b49", new Object[]{request}) : connectImpl(request, null, false);
    }

    public static Response connect(Request request, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Response) ipChange.ipc$dispatch("f9b3c4bd", new Object[]{request, new Boolean(z)}) : connectImpl(request, null, z);
    }

    public static void connect(Request request, RequestCb requestCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df26c90", new Object[]{request, requestCb});
        } else {
            connectImpl(request, requestCb, false);
        }
    }

    public static void connect(Request request, RequestCb requestCb, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05bd844", new Object[]{request, requestCb, new Boolean(z)});
        } else {
            connectImpl(request, requestCb, z);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static anet.channel.session.HttpConnector.Response connectImpl(anet.channel.request.Request r29, anet.channel.RequestCb r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 2661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.HttpConnector.connectImpl(anet.channel.request.Request, anet.channel.RequestCb, boolean):anet.channel.session.HttpConnector$Response");
    }

    private static void onException(Request request, Response response, RequestCb requestCb, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9fbb65", new Object[]{request, response, requestCb, new Integer(i), th});
            return;
        }
        String errMsg = ErrorConstant.getErrMsg(i);
        ALog.e(TAG, "onException", request.getSeq(), "errorCode", Integer.valueOf(i), "errMsg", errMsg, "url", request.getUrlString(), "host", request.getHost(), " bizReqId", request.rs.bizReqId);
        if (response != null) {
            response.httpCode = i;
        }
        if (!request.rs.isDone.get()) {
            request.rs.statusCode = i;
            request.rs.msg = errMsg;
            request.rs.rspEnd = System.currentTimeMillis();
            AnalysisFactory.getV3Instance().log(request.rs.span, "netRspRecvEnd", null);
            if (i != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i, errMsg, request.rs, th));
            }
        }
        if (requestCb == null) {
            return;
        }
        requestCb.onFinish(i, errMsg, request.rs);
    }

    private static HttpURLConnection getConnection(Request request, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("9e106f45", new Object[]{request, new Boolean(z)});
        }
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        Proxy proxy = null;
        if (wifiProxy != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue()));
        }
        ProxySetting proxySetting = ProxySetting.get();
        if (NetworkStatusHelper.getStatus().isMobile() && proxySetting != null) {
            proxy = proxySetting.getProxy();
        }
        URL url = request.getUrl();
        Network cellularNetwork = NetworkStatusHelper.getCellularNetwork();
        if (z && cellularNetwork != null && Build.VERSION.SDK_INT >= 23) {
            ALog.e(TAG, "openConnection by cellular", request.getSeq(), " bizReqId", request.rs.bizReqId);
            if (proxy != null) {
                httpURLConnection = (HttpURLConnection) cellularNetwork.openConnection(url, proxy);
            } else {
                httpURLConnection = (HttpURLConnection) cellularNetwork.openConnection(url);
            }
        } else if (proxy != null) {
            httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        String str = headers.get(HttpConstant.HOST);
        if (str == null) {
            str = request.getHost();
        }
        if (request.getHttpUrl().containsNonDefaultPort()) {
            str = StringUtils.concatString(str, ":", String.valueOf(request.getHttpUrl().getPort()));
        }
        httpURLConnection.setRequestProperty(HttpConstant.HOST, str);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            httpURLConnection.setRequestProperty(HttpConstant.X_ONLINE_HOST, str);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (proxySetting != null) {
            httpURLConnection.setRequestProperty("Authorization", proxySetting.getBasicAuthorization());
        }
        if (url.getProtocol().equalsIgnoreCase("https")) {
            supportHttps(httpURLConnection, request, request.getHost());
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private static void supportHttps(HttpURLConnection httpURLConnection, Request request, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03f3115", new Object[]{httpURLConnection, request, str});
        } else if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.e(TAG, "supportHttps", "[supportHttps]Froyo 以下版本不支持https", " bizReqId", request.rs.bizReqId);
        } else {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            if (request.getSslSocketFactory() != null) {
                httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
            } else if (HttpSslUtil.getSSLSocketFactory() != null) {
                httpsURLConnection.setSSLSocketFactory(HttpSslUtil.getSSLSocketFactory());
                if (ALog.isPrintLog(2)) {
                    ALog.i(TAG, "HttpSslUtil", request.getSeq(), "SslSocketFactory", HttpSslUtil.getSSLSocketFactory(), " bizReqId", request.rs.bizReqId);
                }
            }
            if (request.getHostnameVerifier() != null) {
                httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
            } else if (HttpSslUtil.getHostnameVerifier() != null) {
                httpsURLConnection.setHostnameVerifier(HttpSslUtil.getHostnameVerifier());
                if (!ALog.isPrintLog(2)) {
                    return;
                }
                ALog.i(TAG, "HttpSslUtil", request.getSeq(), "HostnameVerifier", HttpSslUtil.getHostnameVerifier(), " bizReqId", request.rs.bizReqId);
            } else {
                httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: anet.channel.session.HttpConnector.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // javax.net.ssl.HostnameVerifier
                    public boolean verify(String str2, SSLSession sSLSession) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("563b2905", new Object[]{this, str2, sSLSession})).booleanValue() : HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
                    }
                });
            }
        }
    }

    private static int postData(HttpURLConnection httpURLConnection, Request request) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df43198c", new Object[]{httpURLConnection, request})).intValue();
        }
        if (request.containsBody()) {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    int postBody = request.postBody(outputStream);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e) {
                            ALog.e(TAG, MspWebActivity.POSTDATA, request.getSeq(), e, " bizReqId", request.rs.bizReqId);
                        }
                    }
                    i = postBody;
                } catch (Exception e2) {
                    ALog.e(TAG, "postData error", request.getSeq(), e2, " bizReqId", request.rs.bizReqId);
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e3) {
                            ALog.e(TAG, MspWebActivity.POSTDATA, request.getSeq(), e3, " bizReqId", request.rs.bizReqId);
                        }
                    }
                }
                long j = i;
                request.rs.reqBodyInflateSize = j;
                request.rs.reqBodyDeflateSize = j;
                request.rs.sendDataSize = j;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e4) {
                        ALog.e(TAG, MspWebActivity.POSTDATA, request.getSeq(), e4, " bizReqId", request.rs.bizReqId);
                    }
                }
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0215, code lost:
        r20 = r6;
        r26 = r9;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021b, code lost:
        if (r14 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021d, code lost:
        r15.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0230, code lost:
        r25.onDataReceive(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0233, code lost:
        r6 = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r24.header, "Content-MD5");
        r7 = r23.getHeaders().get(anet.channel.util.HttpConstant.REFERER);
        r8 = new anet.channel.statist.Md5Statistic(r23.rs.retryTimes, r7, r23.rs.url);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025c, code lost:
        if (anet.channel.AwcnConfig.isMd5Open(r23.getUrlString(), r7) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025e, code lost:
        if (r6 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0264, code lost:
        if (anet.channel.util.StringUtils.calculateMD5(r6, r0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0266, code lost:
        r8.md5Ret = 0;
        onException(r23, r24, r25, anet.channel.util.ErrorConstant.ERROR_MD5_EXCEPTION, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0270, code lost:
        r8.md5Ret = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0273, code lost:
        r23.rs.md5Ret = r8.md5Ret;
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r8.toString(), r23.getSeq(), new java.lang.Object[0]);
        anet.channel.appmonitor.AppMonitor.getInstance().commitStat(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x028e, code lost:
        if (r14 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0290, code lost:
        r24.out = r14.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0296, code lost:
        r23.rs.recDataTime = java.lang.System.currentTimeMillis() - r23.rs.rspStart;
        r23.rs.rspBodyDeflateSize = r13.getReadByteCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ab, code lost:
        if (r12 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ad, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b3, code lost:
        if (r5 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b5, code lost:
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r26, r23.getSeq(), new java.lang.Object[0]);
        r5.close();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c6, code lost:
        r2 = 0;
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r21, r23.getSeq(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d2, code lost:
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d4, code lost:
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r20, r23.getSeq(), new java.lang.Object[r2]);
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e3, code lost:
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r19, r23.getSeq(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f0, code lost:
        anet.channel.util.ALog.e(anet.channel.session.HttpConnector.TAG, r16 + r0.toString(), r23.getSeq(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0313, code lost:
        return r23.rs.md5Ret;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0314, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0315, code lost:
        r2 = r26;
        r3 = r16;
        r9 = r19;
        r8 = r20;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0326, code lost:
        r3 = r8;
        r2 = r9;
        r8 = r6;
        r9 = r7;
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0333, code lost:
        throw new java.util.concurrent.CancellationException("task cancelled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0334, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0388 A[Catch: Throwable -> 0x0384, TryCatch #7 {Throwable -> 0x0384, blocks: (B:170:0x0380, B:174:0x0388, B:177:0x03a3, B:178:0x03b0, B:175:0x0397), top: B:195:0x0380 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0397 A[Catch: Throwable -> 0x0384, TryCatch #7 {Throwable -> 0x0384, blocks: (B:170:0x0380, B:174:0x0388, B:177:0x03a3, B:178:0x03b0, B:175:0x0397), top: B:195:0x0380 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a3 A[Catch: Throwable -> 0x0384, TryCatch #7 {Throwable -> 0x0384, blocks: (B:170:0x0380, B:174:0x0388, B:177:0x03a3, B:178:0x03b0, B:175:0x0397), top: B:195:0x0380 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b0 A[Catch: Throwable -> 0x0384, TRY_LEAVE, TryCatch #7 {Throwable -> 0x0384, blocks: (B:170:0x0380, B:174:0x0388, B:177:0x03a3, B:178:0x03b0, B:175:0x0397), top: B:195:0x0380 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int parseBody(java.net.HttpURLConnection r22, anet.channel.request.Request r23, anet.channel.session.HttpConnector.Response r24, anet.channel.RequestCb r25, anet.channel.strategy.dispatch.DispatchZstdDictEvent r26, anet.channel.encode.ZstdResponseHelper r27) throws java.io.IOException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.HttpConnector.parseBody(java.net.HttpURLConnection, anet.channel.request.Request, anet.channel.session.HttpConnector$Response, anet.channel.RequestCb, anet.channel.strategy.dispatch.DispatchZstdDictEvent, anet.channel.encode.ZstdResponseHelper):int");
    }
}
