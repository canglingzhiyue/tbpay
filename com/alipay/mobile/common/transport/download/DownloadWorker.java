package com.alipay.mobile.common.transport.download;

import android.os.SystemClock;
import android.taobao.windvane.connect.HttpConnector;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.alipay.mobile.common.transport.http.HttpException;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.http.ResourceHttpWorker;
import com.alipay.mobile.common.transport.http.ResponseSizeModel;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.DownloadUtils;
import com.alipay.mobile.common.transport.utils.FileUtils;
import com.alipay.mobile.common.transport.utils.GtsUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HttpContext;
import tb.riy;

/* loaded from: classes3.dex */
public class DownloadWorker extends ResourceHttpWorker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Set<String> j = Collections.synchronizedSet(new HashSet());

    /* renamed from: a  reason: collision with root package name */
    private String f5532a;
    private SimpleDateFormat b;
    private File c;
    private File d;
    private DownloadRequest e;
    private int f;
    private final int g;
    private int h;
    private long i;

    public static /* synthetic */ Object ipc$super(DownloadWorker downloadWorker, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1683269076:
                super.preCheck();
                return null;
            case -755776379:
                return new Boolean(super.canRetryCurrTaskForSubBiz((Throwable) objArr[0]));
            case 903213326:
                return super.executeHttpClientRequest((HttpHost) objArr[0], (HttpRequest) objArr[1], (HttpContext) objArr[2]);
            case 947624497:
                return super.getHeaders();
            case 1447423576:
                super.copyHeaders();
                return null;
            case 1540698611:
                super.finallyProcess();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public String getBodyContent(HttpUrlResponse httpUrlResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6acd167c", new Object[]{this, httpUrlResponse}) : "";
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public boolean willHandleOtherCode(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd5a0127", new Object[]{this, new Integer(i), str})).booleanValue() : i == 206 || i == 416 || i == 304;
    }

    public DownloadWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        super(httpManager, httpUrlRequest);
        this.f = 0;
        this.g = 3;
        this.h = 3;
        this.i = System.currentTimeMillis();
        this.e = (DownloadRequest) httpUrlRequest;
        this.f5532a = this.e.getPath();
        this.c = new File(this.f5532a);
        this.d = DownloadUtils.createCacheFile(this.mContext, this.e);
        this.b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        this.b.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.mTransportContext.bizType = (byte) 4;
        this.i = System.currentTimeMillis();
        if (NetworkUtils.isWiFiMobileNetwork(TransportEnvUtil.getContext())) {
            this.h = 10;
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void preCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bab5a2c", new Object[]{this});
            return;
        }
        super.preCheck();
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.e.isOnlyWifiRequest()) {
        } else {
            if (!NetworkUtils.isWiFiMobileNetwork(TransportEnvUtil.getContext())) {
                TransportStrategy.fillCurrentReqInfo(true, "https", this.mTransportContext);
                throw new HttpException((Integer) 13, TransportConstants.ERR_MSG_ILLEGAL_NETWORK_TYPE);
            } else {
                DownloadConnChangedListener.getInstance().addNetworkSensitiveTask(this.e);
            }
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void addRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf7457f", new Object[]{this});
            return;
        }
        super.copyHeaders();
        addCookie2Header();
        String alipayLocaleDes = DeviceInfoUtil.getAlipayLocaleDes();
        if (!TextUtils.isEmpty(alipayLocaleDes)) {
            getTargetHttpUriRequest().addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, alipayLocaleDes);
        }
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(getTargetHttpUriRequest());
        AndroidHttpClient.modifyRequestToKeepAlive(getTargetHttpUriRequest());
        printHeaderLog(getTargetHttpUriRequest().getAllHeaders());
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this});
        }
        ArrayList<Header> arrayList = new ArrayList<>(super.getHeaders());
        if (this.e.isRedownload()) {
            return arrayList;
        }
        a(arrayList);
        return arrayList;
    }

    private void a(ArrayList<Header> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        try {
            String str = "download_" + HttpContextExtend.getInstance().getDid() + "_" + GtsUtils.get64HexCurrentTimeMillis();
            arrayList.add(new BasicHeader(HttpConstant.USER_AGENT, "pid=" + AppInfoUtil.getProductId() + "; pv=" + AppInfoUtil.getProductVersion() + "; uuid=" + str));
            this.mTransportContext.rpcUUID = str;
            if (this.c.exists()) {
                if (!TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RSRC_WITH_CACHE), "T")) {
                    return;
                }
                long lastModified = this.c.lastModified();
                if (lastModified <= 0) {
                    return;
                }
                String format = this.b.format(Long.valueOf(lastModified));
                arrayList.add(new BasicHeader(HttpConnector.IF_MODIFY_SINCE, format));
                LogCatUtil.debug("DownloadWorker", "If-Modified-Since:" + format);
            } else if (!this.d.exists()) {
            } else {
                long length = this.d.length();
                long lastModified2 = this.d.lastModified();
                if (length <= 0 || lastModified2 <= 0) {
                    return;
                }
                arrayList.add(new BasicHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + length + "-"));
                StringBuilder sb = new StringBuilder();
                sb.append("Range:");
                sb.append(length);
                LogCatUtil.debug("DownloadWorker", sb.toString());
                String format2 = this.b.format(Long.valueOf(lastModified2));
                arrayList.add(new BasicHeader("If-Range", format2));
                LogCatUtil.debug("DownloadWorker", "If-Range:" + format2);
            }
        } catch (Throwable th) {
            LogCatUtil.error("DownloadWorker", th);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("b5f0373c", new Object[]{this, httpResponse, httpUrlRequest});
        }
        try {
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
            long j2 = -1;
            if (httpResponse.getEntity() != null) {
                j2 = httpResponse.getEntity().getContentLength();
            }
            LogCatUtil.debug("DownloadWorker", "Url: " + httpUrlRequest.getUrl() + " resCode:" + statusCode + ",contentLength:" + j2);
            return handleResponse(httpUrlRequest, httpResponse, statusCode, reasonPhrase);
        } catch (Exception e) {
            LogCatUtil.error("DownloadWorker", "processResponse,exception:" + e.toString());
            consumeContent(httpResponse);
            if (!httpUrlRequest.getHttpUriRequest().isAborted()) {
                abort();
            }
            if (httpResponse != null) {
                printHeaderLog(httpResponse.getAllHeaders());
            }
            a(e);
            if (httpUrlRequest.isCanceled()) {
                LogCatUtil.debug("DownloadWorker", "request is canceled,can't retry");
                throw e;
            }
            LogCatUtil.debug("DownloadWorker", "DOWNLOADERR_RETRY switch is on,retryCount=" + this.f);
            this.f = this.f + 1;
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "RETRY", "T");
            DataItemsUtil.putDataItem2ContainerAnyway(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.RETRYCOUNT, String.valueOf(this.f));
            HttpUriRequest constructHttpUriRequestWithURI = DownloadUtils.constructHttpUriRequestWithURI(httpUrlRequest.getHttpUriRequest().getURI(), httpUrlRequest.getHttpUriRequest(), httpUrlRequest, getHttpClient());
            a(constructHttpUriRequestWithURI);
            httpUrlRequest.setHttpUriRequest(constructHttpUriRequestWithURI);
            printHeaderLog(constructHttpUriRequestWithURI.getAllHeaders());
            return processResponse(executeHttpClientRequest(((HttpRoute) constructHttpUriRequestWithURI.getParams().getParameter("http.route.forced-route")).getTargetHost(), httpUrlRequest.getHttpUriRequest(), this.mLocalContext), httpUrlRequest);
        }
    }

    private void a(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d512bfe", new Object[]{this, httpUriRequest});
            return;
        }
        httpUriRequest.removeHeaders(HttpConstant.RANGE);
        httpUriRequest.removeHeaders("If-Range");
        if (!TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RSRC_RETRY_WITH_RANGE), "T") || !this.d.exists()) {
            return;
        }
        long length = this.d.length();
        long lastModified = this.d.lastModified();
        if (length <= 0 || lastModified <= 0) {
            return;
        }
        httpUriRequest.setHeader(new BasicHeader(HttpConstant.RANGE, HttpConstant.RANGE_PRE + length + "-"));
        String format = this.b.format(Long.valueOf(lastModified));
        httpUriRequest.setHeader(new BasicHeader("If-Range", format));
        LogCatUtil.debug("DownloadWorker", "Range:" + length + ",If-Range:" + format);
    }

    private void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
        } else if (!b()) {
            LogCatUtil.debug("DownloadWorker", "checkIfCanRetry,downerrRetry switch is off");
            throw exc;
        } else if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
            LogCatUtil.debug("DownloadWorker", "network isn't available,don't retry");
            throw exc;
        } else if (!canRetryException(exc)) {
            LogCatUtil.debug("DownloadWorker", "canRetryException return false");
            throw exc;
        } else if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNLOAD_EXT_TIMEOUT), "T")) {
            long currentTimeMillis = System.currentTimeMillis() - this.i;
            int i = this.f;
            if (i < this.h && (i <= 3 || currentTimeMillis <= 60000)) {
                return;
            }
            LogCatUtil.debug("DownloadWorker", "already retry many times,throw ex,retryCount:" + this.f + ",taskStalled:" + currentTimeMillis);
            throw exc;
        } else if (this.f <= 3) {
        } else {
            LogCatUtil.debug("DownloadWorker", "already retry many times,throw ex,retryCount:" + this.f);
            throw exc;
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNLOADERR_RETRY));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public com.alipay.mobile.common.transport.Response handleResponse(com.alipay.mobile.common.transport.http.HttpUrlRequest r23, org.apache.http.HttpResponse r24, int r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.download.DownloadWorker.handleResponse(com.alipay.mobile.common.transport.http.HttpUrlRequest, org.apache.http.HttpResponse, int, java.lang.String):com.alipay.mobile.common.transport.Response");
    }

    private boolean a(String str, long j2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123b0d6", new Object[]{this, str, new Long(j2)})).booleanValue();
        }
        boolean equalsString = TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.COPY_FILE_BY_FILECHANNL, "T");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        while (true) {
            if (i >= 3 || z) {
                break;
            }
            if (equalsString) {
                try {
                    z = FileUtils.copyFileEnhanced(this.d, this.c);
                } finally {
                    DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.CP_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            } else {
                z = FileUtils.streamCopyFile(this.d, this.c);
            }
            if (!z) {
                b(str, j2);
            }
            i++;
        }
        return z;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i < 400 || i >= 500) {
        } else {
            if (this.e.isAllowRetryForErrorHttpStatusCode() && TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.NO_RETRY_FOR_IG_HTTP_ST, UTConstant.Args.UT_SUCCESS_F)) {
                return;
            }
            String str = "download failed! illegal http status code=" + i;
            LogCatUtil.warn("DownloadWorker", "[handleIllegalResCode] " + str);
            throw new HttpException((Integer) 52, str);
        }
    }

    private void a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j2)});
            return;
        }
        this.mHttpManager.addSocketTime(System.currentTimeMillis() - System.currentTimeMillis());
        long length = this.d.length();
        LogCatUtil.info("DownloadWorker", "Writed cache file length = " + length);
        this.mHttpManager.addDataSize(this.d.length() - j2);
    }

    private void a(String str, long j2, long j3, Header header, ResponseSizeModel responseSizeModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8770e52a", new Object[]{this, str, new Long(j2), new Long(j3), header, responseSizeModel});
            return;
        }
        if (header == null || TextUtils.isEmpty(header.getValue()) || !header.getValue().contains("gzip")) {
            z = false;
        } else {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.DWN_GZIP, "T");
        }
        String str2 = "contentLength[" + j2 + "] isUseGzip[" + z + "] compressedSize[" + responseSizeModel.compressedSize + "] rawSize[" + responseSizeModel.rawSize + "] cacheFile.length[" + this.d.length() + riy.ARRAY_END_STR;
        LogCatUtil.debug("DownloadWorker", str2);
        if (j2 <= 0) {
            return;
        }
        if (this.d.length() <= 0) {
            throw new DownloadIOException(20, str, this.d.getAbsolutePath(), str2 + ",cache was cleaned");
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNLOAD_GZIP_CHECK);
        if (TextUtils.equals(stringValue, "T") && z) {
            if (responseSizeModel.compressedSize == j2) {
                return;
            }
            throw new DownloadIOException(22, str, this.d.getAbsolutePath(), str2 + ",compressedSize not equal contentLength");
        } else if (!TextUtils.equals(stringValue, "T") && z) {
            LogCatUtil.debug("DownloadWorker", "gzip check is off");
        } else {
            long length = this.d.length() - j3;
            int i = (length > j2 ? 1 : (length == j2 ? 0 : -1));
            if (i == 0) {
                return;
            }
            String str3 = str2 + ",currentReadedLen:" + length + "，not equal contentLength:" + j2;
            if (i < 0) {
                throw new DownloadIOException(22, str, this.d.getAbsolutePath(), str3);
            }
        }
    }

    private void a(String str, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352e032", new Object[]{this, str, new Long(j2), new Long(j3)});
            return;
        }
        long j4 = j3 - j2;
        if (!FileUtils.checkDataAvailableSpace(this.d, j4)) {
            String absolutePath = this.d.getAbsolutePath();
            throw new DownloadFileIOException(14, str, absolutePath, "cache space less than " + j4);
        } else if (!FileUtils.checkFileDirWRPermissions(this.d)) {
            throw new DownloadFileIOException(17, str, this.d.getAbsolutePath(), "cache dir create fail");
        } else {
            b(str, j3);
            if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWN_CHECK_SD_PERMISSION), "T") && !this.c.getParentFile().canWrite()) {
                throw new DownloadIOException(21, str, this.c.getAbsolutePath(), "sdcard write fail");
            }
            if (j.contains(str)) {
                throw new DownloadIOException(19, str, this.c.getAbsolutePath(), "downloadFileBlackSet contains this url");
            }
        }
    }

    private void b(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j2)});
        } else if (!FileUtils.checkFileDirWRPermissions(this.c)) {
            throw new DownloadFileIOException(18, str, this.c.getAbsolutePath(), "targe dir create fail");
        } else {
            if (FileUtils.checkDataOrSdcardAvailableSpace(this.c, j2)) {
                return;
            }
            String absolutePath = this.c.getAbsolutePath();
            throw new DownloadFileIOException(15, str, absolutePath, "target space less than " + j2);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogCatUtil.debug("DownloadWorker", "deleteAllFile");
        try {
            if (this.c.exists()) {
                boolean delete = this.c.delete();
                LogCatUtil.debug("DownloadWorker", "deletePathFile=" + delete);
            }
            if (!this.d.exists()) {
                return;
            }
            boolean delete2 = this.d.delete();
            LogCatUtil.debug("DownloadWorker", "deleteCacheFile=" + delete2);
        } catch (Exception e) {
            LogCatUtil.warn("DownloadWorker", e);
        }
    }

    private void a(HttpResponse httpResponse, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("835a75d4", new Object[]{this, httpResponse, file});
            return;
        }
        try {
            Header firstHeader = httpResponse.getFirstHeader("Last-Modified");
            if (!file.exists() || firstHeader == null || file.setLastModified(AndroidHttpClient.parseDate(firstHeader.getValue()))) {
                return;
            }
            LogCatUtil.error("DownloadWorker", "setLastModified error");
        } catch (Exception e) {
            LogCatUtil.warn("DownloadWorker", "proc get Last-Modifie exception : " + e.toString());
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public HttpResponse executeHttpClientRequest(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("35d5f10e", new Object[]{this, httpHost, httpRequest, httpContext});
        }
        HttpUriRequest httpUriRequest = (HttpUriRequest) httpRequest;
        if (!DownloadUtils.isNeedToDowngradeToHttps(httpUriRequest)) {
            return super.executeHttpClientRequest(httpHost, httpRequest, httpContext);
        }
        return a(httpUriRequest, getHttpClient().execute(httpHost, httpRequest, httpContext));
    }

    private HttpResponse a(HttpUriRequest httpUriRequest, HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("6369e278", new Object[]{this, httpUriRequest, httpResponse});
        }
        if (DownloadUtils.isNeedToDowngradeToHttps(httpUriRequest, httpResponse)) {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                entity.consumeContent();
            }
            LogCatUtil.debug("DownloadWorker", "processDowngrade,net hijack,try https");
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.IMGDOWNGRADE, "T");
            HttpUrlRequest originRequest = getOriginRequest();
            AndroidHttpClient httpClient = getHttpClient();
            if (!httpUriRequest.isAborted()) {
                abort();
            }
            return DownloadUtils.executeDowngradeRequest(httpUriRequest, originRequest, httpClient, this.mLocalContext);
        }
        LogCatUtil.debug("DownloadWorker", "handleResponseForDowngrade,needn't downgrade to https");
        return httpResponse;
    }

    public boolean canRetryException(Throwable th) {
        Throwable rootCause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb2933b", new Object[]{this, th})).booleanValue();
        }
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            if (httpException.getCode() == 429 || httpException.getCode() == 52) {
                return false;
            }
            if (!httpException.isCanRetry()) {
                LogCatUtil.debug("DownloadWorker", "[canRetryException] HttpException can't retry.");
                return false;
            }
        }
        if ((th instanceof DownloadIOException) || (th instanceof DownloadFileIOException)) {
            int code = ((HttpException) th).getCode();
            if (code == 14 || code == 15 || code == 17 || code == 18 || code == 19) {
                LogCatUtil.debug("DownloadWorker", "errorcode=" + code + ",don't retry");
                return false;
            } else if (!NetworkUtils.isWiFiMobileNetwork(this.mContext) && (code == 16 || code == 20)) {
                LogCatUtil.debug("DownloadWorker", "errorcode=" + code + ",don't retry");
                return false;
            }
        }
        try {
            rootCause = MiscUtils.getRootCause(th);
        } catch (Throwable th2) {
            LogCatUtil.error("DownloadWorker", th2);
        }
        if (rootCause != null && isRetryException(rootCause)) {
            return true;
        }
        if (rootCause == null) {
            if (isRetryException(th)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRetryException(Throwable th) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f92614a1", new Object[]{this, th})).booleanValue();
        }
        if (!(th instanceof SocketException) && !(th instanceof SSLException) && !(th instanceof SocketTimeoutException) && !(th instanceof ConnectionPoolTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof NoHttpResponseException) && !(th instanceof ClientProtocolException) && !(th instanceof DownloadIOException)) {
            z = false;
        }
        LogCatUtil.debug("DownloadWorker", "isRetryException,exception=" + th.toString() + ",canRetry=" + z);
        return z;
    }

    @Override // com.alipay.mobile.common.transport.http.ResourceHttpWorker, com.alipay.mobile.common.transport.http.HttpWorker
    public boolean canRetryCurrTaskForSubBiz(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f3c485", new Object[]{this, th})).booleanValue();
        }
        if (canRetryException(th)) {
            return super.canRetryCurrTaskForSubBiz(th);
        }
        return false;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void finallyProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd531f3", new Object[]{this});
            return;
        }
        super.finallyProcess();
        if (!this.e.isOnlyWifiRequest()) {
            return;
        }
        DownloadConnChangedListener.getInstance().removeNetworkSensitiveTask(this.e);
    }
}
