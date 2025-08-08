package anet.channel.session.okhttp;

import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.OkHttpAvailableStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.okhttp.Call;
import com.android.okhttp.Callback;
import com.android.okhttp.Dns;
import com.android.okhttp.Headers;
import com.android.okhttp.MediaType;
import com.android.okhttp.Protocol;
import com.android.okhttp.RequestBody;
import com.android.okhttp.Response;
import com.android.okhttp.ResponseBody;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.search.common.util.k;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import tb.kge;

/* loaded from: classes.dex */
public class OkHttpConnector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.OkHttpConnector";
    private static Method builder_addHeader;
    private static Method builder_build;
    private static Constructor builder_constructor;
    private static Method builder_method;
    private static Method builder_url;
    public static Method call_cancel;
    private static Method call_enqueue;
    private static Method call_execute;
    private static Class clazz_OkHttpClient;
    private static Class clazz_Request_Builder;
    private static Method client_newCall;
    private static Method client_setDns;
    private static Method client_setFollowRedirects;
    private static Method client_setProtocols;
    private static Method headers_toMultimap;
    private static Object instance_OkHttpClient;
    private static volatile boolean mAvailable;
    private static final AtomicBoolean mChecked;
    private static Method mediaType_parse;
    private static Object protocol_http1;
    private static Object protocol_http2;
    private static Method requestBody_create;
    private static Method request_headers;
    private static Method responseBody_byteStream;
    private static Method response_body;
    private static Method response_code;
    private static Method response_headers;
    private static Method response_protocol;

    public static /* synthetic */ void access$000(String str) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            doPreBuildConnectionTask(str);
        }
    }

    public static /* synthetic */ void access$100(Request request, RequestCb requestCb, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2011129", new Object[]{request, requestCb, new Integer(i), th});
        } else {
            onException(request, requestCb, i, th);
        }
    }

    public static /* synthetic */ void access$200(Response response, Request request, RequestCb requestCb) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa240409", new Object[]{response, request, requestCb});
        } else {
            handlerResponse(response, request, requestCb);
        }
    }

    static {
        kge.a(-2079495594);
        mAvailable = false;
        mChecked = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean checkEnvAvailable() {
        if (AwcnConfig.isOkHttpEnable() && mChecked.compareAndSet(false, true)) {
            try {
                Class<?> cls = Class.forName("com.android.okhttp.OkHttpClient");
                clazz_OkHttpClient = cls;
                client_setDns = ReflectUtils.getDeclaredMethod(cls, "setDns", Dns.class);
                client_setProtocols = ReflectUtils.getDeclaredMethod(clazz_OkHttpClient, "setProtocols", List.class);
                client_setFollowRedirects = ReflectUtils.getDeclaredMethod(clazz_OkHttpClient, "setFollowRedirects", Boolean.TYPE);
                protocol_http2 = Class.forName("com.android.okhttp.Protocol").getEnumConstants()[3];
                protocol_http1 = Class.forName("com.android.okhttp.Protocol").getEnumConstants()[1];
                Class<?> cls2 = Class.forName("com.android.okhttp.Request$Builder");
                clazz_Request_Builder = cls2;
                builder_constructor = ReflectUtils.getConstructor(cls2, new Class[0]);
                builder_url = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, "url", String.class);
                builder_addHeader = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, "addHeader", String.class, String.class);
                builder_method = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, "method", String.class, RequestBody.class);
                builder_build = ReflectUtils.getDeclaredMethod(clazz_Request_Builder, CartRecommendRefreshScene.build, new Class[0]);
                request_headers = ReflectUtils.getDeclaredMethod(com.android.okhttp.Request.class, "headers", new Class[0]);
                client_newCall = ReflectUtils.getDeclaredMethod(clazz_OkHttpClient, "newCall", com.android.okhttp.Request.class);
                call_enqueue = ReflectUtils.getDeclaredMethod(Call.class, "enqueue", Callback.class);
                call_cancel = ReflectUtils.getDeclaredMethod(Call.class, "cancel", new Class[0]);
                call_execute = ReflectUtils.getDeclaredMethod(Call.class, e.RECORD_EXECUTE, new Class[0]);
                response_code = ReflectUtils.getDeclaredMethod(Response.class, "code", new Class[0]);
                response_protocol = ReflectUtils.getDeclaredMethod(Response.class, "protocol", new Class[0]);
                response_headers = ReflectUtils.getDeclaredMethod(Response.class, "headers", new Class[0]);
                response_body = ReflectUtils.getDeclaredMethod(Response.class, AgooConstants.MESSAGE_BODY, new Class[0]);
                responseBody_byteStream = ReflectUtils.getDeclaredMethod(ResponseBody.class, "byteStream", new Class[0]);
                headers_toMultimap = ReflectUtils.getDeclaredMethod(Headers.class, "toMultimap", new Class[0]);
                mediaType_parse = ReflectUtils.getMethod(MediaType.class, "parse", String.class);
                requestBody_create = ReflectUtils.getMethod(RequestBody.class, "create", MediaType.class, byte[].class);
                instance_OkHttpClient = clazz_OkHttpClient.newInstance();
                client_setDns.invoke(instance_OkHttpClient, new OkHttpDnsResolver());
                ArrayList arrayList = new ArrayList();
                arrayList.add((Protocol) protocol_http2);
                arrayList.add((Protocol) protocol_http1);
                client_setProtocols.invoke(instance_OkHttpClient, arrayList);
                client_setFollowRedirects.invoke(instance_OkHttpClient, false);
                mAvailable = true;
                ALog.e(TAG, "[checkEnvAvailable success]", null, new Object[0]);
                AppMonitor.getInstance().commitStat(new OkHttpAvailableStat(1));
            } catch (Throwable th) {
                mAvailable = false;
                ALog.e(TAG, "[checkEnvAvailable error]", null, th, new Object[0]);
                OkHttpAvailableStat okHttpAvailableStat = new OkHttpAvailableStat(0);
                okHttpAvailableStat.error = th.getMessage();
                AppMonitor.getInstance().commitStat(okHttpAvailableStat);
            }
        }
        return mAvailable;
    }

    public static boolean isOkHttpEnable(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ea40cb4", new Object[]{httpUrl})).booleanValue() : AwcnConfig.isOkHttpEnable() && checkEnvAvailable() && httpUrl != null && AwcnConfig.isInOkhttpWhiteList(httpUrl.host());
    }

    public static void preBuildConnections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d5ee51", new Object[0]);
            return;
        }
        List<String> okhttpPreBuildList = AwcnConfig.getOkhttpPreBuildList();
        if (okhttpPreBuildList == null || okhttpPreBuildList.isEmpty()) {
            return;
        }
        for (String str : okhttpPreBuildList) {
            preBuildConnection(str);
        }
    }

    private static void preBuildConnection(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe3889a", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.okhttp.OkHttpConnector.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        OkHttpConnector.access$000(str);
                    } catch (Exception e) {
                        ALog.e(OkHttpConnector.TAG, "[preBuildConnection]error", null, e, new Object[0]);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        }
    }

    private static void doPreBuildConnectionTask(String str) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        if (!AwcnConfig.isOkHttpEnable() || !checkEnvAvailable()) {
            ALog.e(TAG, "[preBuildConnection]okhttp disable.", null, new Object[0]);
            return;
        }
        Object newInstance = builder_constructor.newInstance(new Object[0]);
        Method method = builder_url;
        method.invoke(newInstance, k.HTTPS_PREFIX + str);
        Response response = (Response) call_execute.invoke((Call) client_newCall.invoke(instance_OkHttpClient, (com.android.okhttp.Request) builder_build.invoke(newInstance, new Object[0])), new Object[0]);
        if (response == null) {
            return;
        }
        ALog.e(TAG, "[preBuildConnection]", null, "host", str, "httpCode", Integer.valueOf(((Integer) response_code.invoke(response, new Object[0])).intValue()), "protocol", response_protocol.invoke(response, new Object[0]).toString());
    }

    public static Cancelable request(final Request request, final RequestCb requestCb, boolean z) throws Throwable {
        if (request == null || request.getUrl() == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), new RequestStatistic(null, null));
            }
            return OkHttpCancelable.NULL;
        }
        Object newInstance = builder_constructor.newInstance(new Object[0]);
        builder_url.invoke(newInstance, request.getUrlString());
        ALog.e(TAG, "", request.getSeq(), "request URL", request.getUrlString(), " bizReqId", request.rs.bizReqId);
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder_addHeader.invoke(newInstance, entry.getKey(), entry.getValue());
        }
        String str = headers.get(HttpConstant.HOST);
        if (str == null) {
            str = request.getHost();
        }
        if (request.getHttpUrl().containsNonDefaultPort()) {
            str = StringUtils.concatString(str, ":", String.valueOf(request.getHttpUrl().getPort()));
        }
        builder_addHeader.invoke(newInstance, HttpConstant.HOST, str);
        if (NetworkStatusHelper.getApn().equals("cmwap")) {
            builder_addHeader.invoke(newInstance, HttpConstant.X_ONLINE_HOST, str);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            builder_addHeader.invoke(newInstance, "Accept-Encoding", "gzip");
        }
        request.rs.sendStart = System.currentTimeMillis();
        request.rs.processTime = request.rs.sendStart - request.rs.start;
        byte[] bodyBytes = request.getBodyBytes();
        if (bodyBytes != null) {
            int length = bodyBytes.length;
            builder_method.invoke(newInstance, request.getMethod(), (RequestBody) requestBody_create.invoke(RequestBody.class, (MediaType) mediaType_parse.invoke(MediaType.class, Charset.defaultCharset().toString()), request.getBodyBytes()));
            long j = length;
            request.rs.reqBodyInflateSize = j;
            request.rs.reqBodyDeflateSize = j;
            request.rs.sendDataSize = j;
        } else {
            builder_method.invoke(newInstance, request.getMethod(), null);
        }
        ALog.e(TAG, "", request.getSeq(), "request Method", request.getMethod(), " bizReqId", request.rs.bizReqId);
        request.rs.sendEnd = System.currentTimeMillis();
        request.rs.sendDataTime = request.rs.sendEnd - request.rs.sendStart;
        com.android.okhttp.Request request2 = (com.android.okhttp.Request) builder_build.invoke(newInstance, new Object[0]);
        Map map = (Map) headers_toMultimap.invoke(request_headers.invoke(request2, new Object[0]), new Object[0]);
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "", request.getSeq(), "request headers", map, " bizReqId", request.rs.bizReqId);
        }
        request.rs.reqHeadDeflateSize = map.toString().length();
        request.rs.reqHeadInflateSize = request.rs.reqHeadDeflateSize;
        Call call = (Call) client_newCall.invoke(instance_OkHttpClient, request2);
        if (!z) {
            handlerResponse((Response) call_execute.invoke(call, new Object[0]), request, requestCb);
        } else {
            call_enqueue.invoke(call, new Callback() { // from class: anet.channel.session.okhttp.OkHttpConnector.2
                public void onFailure(com.android.okhttp.Request request3, IOException iOException) {
                    OkHttpConnector.access$100(Request.this, requestCb, -500, iOException);
                }

                public void onResponse(Response response) throws IOException {
                    try {
                        OkHttpConnector.access$200(response, Request.this, requestCb);
                    } catch (Throwable th) {
                        OkHttpConnector.access$100(Request.this, requestCb, ErrorConstant.ERROR_OKHTTP_RESPONSE_ERROR, th);
                    }
                }
            });
        }
        request.rs.useOkHttp = 1;
        return new OkHttpCancelable(call, request.getSeq());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024f A[Catch: Throwable -> 0x0072, InvocationTargetException -> 0x0304, IllegalAccessException -> 0x030c, TryCatch #6 {Throwable -> 0x0072, blocks: (B:5:0x0059, B:27:0x0112, B:36:0x013c, B:38:0x0142, B:95:0x0291, B:98:0x02bf, B:102:0x02e7, B:75:0x0221, B:77:0x024f, B:79:0x0255, B:81:0x025b, B:83:0x0262, B:84:0x0269, B:94:0x0288), top: B:122:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bf A[Catch: Throwable -> 0x0072, InvocationTargetException -> 0x0304, IllegalAccessException -> 0x030c, TRY_ENTER, TryCatch #6 {Throwable -> 0x0072, blocks: (B:5:0x0059, B:27:0x0112, B:36:0x013c, B:38:0x0142, B:95:0x0291, B:98:0x02bf, B:102:0x02e7, B:75:0x0221, B:77:0x024f, B:79:0x0255, B:81:0x025b, B:83:0x0262, B:84:0x0269, B:94:0x0288), top: B:122:0x0059 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void handlerResponse(com.android.okhttp.Response r25, anet.channel.request.Request r26, anet.channel.RequestCb r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.okhttp.OkHttpConnector.handlerResponse(com.android.okhttp.Response, anet.channel.request.Request, anet.channel.RequestCb):void");
    }

    private static void onException(Request request, RequestCb requestCb, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728949a8", new Object[]{request, requestCb, new Integer(i), th});
            return;
        }
        String errMsg = ErrorConstant.getErrMsg(i);
        ALog.e(TAG, "onException", request.getSeq(), "errorCode", Integer.valueOf(i), "errMsg", errMsg, "url", request.getUrlString(), "host", request.getHost(), th, " bizReqId", request.rs.bizReqId);
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022d, code lost:
        if (r4 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022f, code lost:
        anet.channel.util.ALog.e(anet.channel.session.okhttp.OkHttpConnector.TAG, "okhttpConnect parseBody zstdStreamInflater close", r23.getSeq(), new java.lang.Object[0]);
        r4.close();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023e, code lost:
        r1 = 0;
        anet.channel.util.ALog.e(anet.channel.session.okhttp.OkHttpConnector.TAG, "okhttpConnect parseBody zstdStreamInflater null", r23.getSeq(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0248, code lost:
        if (r27 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024a, code lost:
        anet.channel.util.ALog.e(anet.channel.session.okhttp.OkHttpConnector.TAG, r19, r23.getSeq(), new java.lang.Object[r1]);
        r27.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0259, code lost:
        anet.channel.util.ALog.e(anet.channel.session.okhttp.OkHttpConnector.TAG, "okhttpConnect parseBody decompressDict null", r23.getSeq(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0266, code lost:
        anet.channel.util.ALog.e(anet.channel.session.okhttp.OkHttpConnector.TAG, "okhttpConnect parseBody inputStream close fail, e=" + r0.toString(), r23.getSeq(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0285, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0286, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0287, code lost:
        r3 = "okhttpConnect parseBody inputStream close fail, e=";
        r9 = "okhttpConnect parseBody decompressDict null";
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028e, code lost:
        r8 = r9;
        r27 = r11;
        r3 = "okhttpConnect parseBody inputStream close fail, e=";
        r9 = "okhttpConnect parseBody decompressDict null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x029d, code lost:
        throw new java.util.concurrent.CancellationException("task cancelled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x029e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019f, code lost:
        r19 = r9;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
        if (r15 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a5, code lost:
        r7.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a8, code lost:
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
        r24.onDataReceive(r7, true);
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bc, code lost:
        r9 = r23.getHeaders().get(anet.channel.util.HttpConstant.REFERER);
        r10 = new anet.channel.statist.Md5Statistic(r23.rs.retryTimes, r9, r23.rs.url);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dd, code lost:
        if (anet.channel.AwcnConfig.isMd5Open(r23.getUrlString(), r9) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01df, code lost:
        if (r25 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e5, code lost:
        if (anet.channel.util.StringUtils.calculateMD5(r25, r5) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e7, code lost:
        r10.md5Ret = 0;
        onException(r23, r24, anet.channel.util.ErrorConstant.ERROR_MD5_EXCEPTION, null);
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f2, code lost:
        r10.md5Ret = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f5, code lost:
        r23.rs.md5Ret = r10.md5Ret;
        anet.channel.util.ALog.e(anet.channel.session.okhttp.OkHttpConnector.TAG, r10.toString(), r23.getSeq(), new java.lang.Object[0]);
        anet.channel.appmonitor.AppMonitor.getInstance().commitStat(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0210, code lost:
        r23.rs.recDataTime = java.lang.System.currentTimeMillis() - r23.rs.rspStart;
        r23.rs.rspBodyDeflateSize = r6.getReadByteCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0225, code lost:
        if (r1 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0227, code lost:
        r1.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e4 A[Catch: Throwable -> 0x02e0, TryCatch #5 {Throwable -> 0x02e0, blocks: (B:129:0x02dc, B:133:0x02e4, B:136:0x02ff, B:137:0x030e, B:134:0x02f3), top: B:151:0x02dc }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f3 A[Catch: Throwable -> 0x02e0, TryCatch #5 {Throwable -> 0x02e0, blocks: (B:129:0x02dc, B:133:0x02e4, B:136:0x02ff, B:137:0x030e, B:134:0x02f3), top: B:151:0x02dc }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ff A[Catch: Throwable -> 0x02e0, TryCatch #5 {Throwable -> 0x02e0, blocks: (B:129:0x02dc, B:133:0x02e4, B:136:0x02ff, B:137:0x030e, B:134:0x02f3), top: B:151:0x02dc }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030e A[Catch: Throwable -> 0x02e0, TRY_LEAVE, TryCatch #5 {Throwable -> 0x02e0, blocks: (B:129:0x02dc, B:133:0x02e4, B:136:0x02ff, B:137:0x030e, B:134:0x02f3), top: B:151:0x02dc }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int parseBody(java.io.InputStream r22, anet.channel.request.Request r23, anet.channel.RequestCb r24, java.lang.String r25, java.lang.String r26, int r27, int r28, anet.channel.strategy.dispatch.DispatchZstdDictEvent r29, anet.channel.encode.ZstdResponseHelper r30) throws java.io.IOException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.okhttp.OkHttpConnector.parseBody(java.io.InputStream, anet.channel.request.Request, anet.channel.RequestCb, java.lang.String, java.lang.String, int, int, anet.channel.strategy.dispatch.DispatchZstdDictEvent, anet.channel.encode.ZstdResponseHelper):int");
    }
}
