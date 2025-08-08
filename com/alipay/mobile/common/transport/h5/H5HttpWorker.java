package com.alipay.mobile.common.transport.h5;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.TraficConsumeModel;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.concurrent.ActThreadPoolExecutor;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ext.ExtTransportException;
import com.alipay.mobile.common.transport.http.AndroidH2CacheConfig;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.http.ResourceHttpWorker;
import com.alipay.mobile.common.transport.monitor.DataContainer;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.GtsUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.alipay.mobile.common.transport.utils.MonitorLogRecordUtil;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class H5HttpWorker extends ResourceHttpWorker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f5541a;
    public boolean noRespContent;

    public static /* synthetic */ Object ipc$super(H5HttpWorker h5HttpWorker, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1683269076:
                super.preCheck();
                return null;
            case -961672284:
                return super.doMonitorLog();
            case -812130534:
                super.extNoteTraficConsume((TraficConsumeModel) objArr[0]);
                return null;
            case -545532170:
                return super.doExecuteRequestByHttpClient((HttpHost) objArr[0], (HttpRequest) objArr[1], (HttpContext) objArr[2]);
            case -447853460:
                return super.executeExtClientRequest();
            case 781578671:
                return super.monitorLog();
            case 903213326:
                return super.executeHttpClientRequest((HttpHost) objArr[0], (HttpRequest) objArr[1], (HttpContext) objArr[2]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void addCookie2Header() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a846ae1", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void etagRpcv2Adapter(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75458df", new Object[]{this, httpResponse});
        }
    }

    @Override // com.alipay.mobile.common.transport.http.ResourceHttpWorker
    public int getAllowedRetryDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d2cf784", new Object[]{this})).intValue();
        }
        return 40000;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public String getBodyContent(HttpUrlResponse httpUrlResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6acd167c", new Object[]{this, httpUrlResponse}) : "";
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public HttpResponse handleResponseForRedirect(HttpRequest httpRequest, HttpParams httpParams, HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("e1957663", new Object[]{this, httpRequest, httpParams, httpResponse}) : httpResponse;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void processRespCookies(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33361ac", new Object[]{this, httpResponse});
        }
    }

    public H5HttpWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        super(httpManager, httpUrlRequest);
        this.noRespContent = false;
        this.f5541a = null;
        this.mTransportContext.bizType = (byte) 2;
        boolean z = httpUrlRequest instanceof H5HttpUrlRequest;
        if (z) {
            this.mTransportContext.printUrlToMonitorLog = ((H5HttpUrlRequest) httpUrlRequest).isPrintUrlToMonitorLog();
        }
        if (z) {
            this.mTransportContext.enableHttpCache = ((H5HttpUrlRequest) httpUrlRequest).getUseCache();
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
        if (this.mTransportContext.enableHttpCache && !TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.H5_HTTP_CACHE_SWITCH, "T")) {
            LogCatUtil.info(HttpWorker.TAG, "preCheck: hCacheSwitch is false");
            this.mTransportContext.enableHttpCache = false;
        }
        if (!this.mTransportContext.enableHttpCache) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AndroidH2CacheConfig.getInstance().setupCacheDir();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 <= 0) {
            return;
        }
        this.mTransportContext.cacheSetupTime = currentTimeMillis2;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void addRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf7457f", new Object[]{this});
            return;
        }
        copyHeaders();
        addCookie2Header();
        LogCatUtil.info(HttpWorker.TAG, "add header log:");
        printHeaderLog(getTargetHttpUriRequest().getAllHeaders());
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public boolean isCanUseExtTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b999f214", new Object[]{this})).booleanValue();
        }
        if (!MiscUtils.isInAlipayClient(this.mContext) && !TransportStrategy.isEnabledEnhanceNetworkModule()) {
            return false;
        }
        if (MiscUtils.isOtherProcess(this.mContext) && !TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SUB_PROC_SPDY_SWITCH, "T")) {
            LogCatUtil.warn(HttpWorker.TAG, "Don't use spdy, because sub process spdy switch it's off.");
            return false;
        } else if (!a() || TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SMALL_SPDY_SWITCH, "T")) {
            return true;
        } else {
            LogCatUtil.warn(HttpWorker.TAG, "Don't use spdy, because small spdy switch it's off.");
            return false;
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.f5541a;
        if (bool != null) {
            bool.booleanValue();
        }
        String tag = getOriginRequest().getTag(TransportConstants.KEY_H5_APP_TYPE);
        if (tag != null && StringUtils.equals(tag, "mini_app")) {
            LogCatUtil.info(HttpWorker.TAG, "Current request from miniApp");
            this.f5541a = Boolean.TRUE;
        } else {
            this.f5541a = Boolean.FALSE;
        }
        return this.f5541a.booleanValue();
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public HttpResponse executeHttpClientRequest(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("35d5f10e", new Object[]{this, httpHost, httpRequest, httpContext}) : super.executeHttpClientRequest(httpHost, httpRequest, httpContext);
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public HttpResponse doExecuteRequestByHttpClient(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("df7bd6f6", new Object[]{this, httpHost, httpRequest, httpContext});
        }
        DataItemsUtil.putDataItem2ContainerAnyway(this.mTransportContext.getCurrentDataContainer(), "NETTUNNEL", RPCDataItems.VALUE_NETTUNNEL_HTTP_CLIENT);
        return super.doExecuteRequestByHttpClient(httpHost, httpRequest, httpContext);
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public HttpResponse executeExtClientRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("e54e4c6c", new Object[]{this});
        }
        if (!getH5HttpUrlRequest().isGoSpdy()) {
            return null;
        }
        if (!NetworkTunnelStrategy.getInstance().isCanUseSpdyForH5()) {
            LogCatUtil.info(HttpWorker.TAG, "isCanUseSpdyForH5==false.");
            return null;
        }
        this.mTransportContext.choseExtLinkType = 2;
        HttpUriRequest targetHttpUriRequest = getTargetHttpUriRequest();
        targetHttpUriRequest.addHeader(HeaderConstant.HEADER_KEY_SPDY_PROXY_URL, targetHttpUriRequest.getURI().toString());
        String str = "h5_" + HttpContextExtend.getInstance().getDid() + GtsUtils.get64HexCurrentTimeMillis();
        targetHttpUriRequest.addHeader(HeaderConstant.HEADER_KEY_SPDY_H5_UUID, str);
        this.mTransportContext.rpcUUID = str;
        try {
            HttpResponse executeExtClientRequest = super.executeExtClientRequest();
            if (executeExtClientRequest == null) {
                return null;
            }
            DataItemsUtil.putDataItem2ContainerAnyway(this.mTransportContext.getCurrentDataContainer(), "NETTUNNEL", RPCDataItems.VALUE_NETTUNNEL_SPDY);
            executeExtClientRequest.addHeader(new BasicHeader(HeaderConstant.HEADER_X_SPDY_PROXY, "1"));
            return executeExtClientRequest;
        } finally {
            targetHttpUriRequest.removeHeaders(HeaderConstant.HEADER_KEY_SPDY_PROXY_URL);
            targetHttpUriRequest.removeHeaders(HeaderConstant.HEADER_KEY_SPDY_H5_UUID);
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void processExtTransException(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1394a26", new Object[]{this, exc});
            return;
        }
        MonitorErrorLogHelper.warn(HttpWorker.TAG, new ExtTransportException("", MiscUtils.getRootCause(exc)));
        if (!((H5HttpUrlRequest) getOriginRequest()).isGoHttp()) {
            throw exc;
        }
        LogCatUtil.error(HttpWorker.TAG, "扩展传输模块连接失败,使用Https进行重试", exc);
        DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.DOWN, "T");
    }

    public H5HttpUrlRequest getH5HttpUrlRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (H5HttpUrlRequest) ipChange.ipc$dispatch("2f7406d0", new Object[]{this}) : (H5HttpUrlRequest) getOriginRequest();
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("b5f0373c", new Object[]{this, httpResponse, httpUrlRequest});
        }
        StatusLine statusLine = httpResponse.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        LogCatUtil.debug(HttpWorker.TAG, "Url: " + httpUrlRequest.getUrl() + " resCode:" + statusCode);
        if (this.redirectHandler.isRedirectRequested(httpResponse, this.mLocalContext)) {
            try {
                LogCatUtil.info(HttpWorker.TAG, "When a redirect, release connection.");
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    entity.consumeContent();
                } else {
                    getTargetHttpUriRequest().abort();
                }
            } catch (Exception e) {
                LogCatUtil.warn(HttpWorker.TAG, "redirectRequested abort exception" + e.toString());
            }
        }
        return handleResponse(httpUrlRequest, httpResponse, statusCode, statusLine.getReasonPhrase());
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public Response handleResponse(HttpUrlRequest httpUrlRequest, HttpResponse httpResponse, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("4fc44930", new Object[]{this, httpUrlRequest, httpResponse, new Integer(i), str});
        }
        LogCatUtil.printInfo(HttpWorker.TAG, "开始handle，handleResponse-1," + Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        NetworkInputStreamWrapper networkInputStreamWrapper = null;
        if (entity != null) {
            networkInputStreamWrapper = new NetworkInputStreamWrapper(entity.getContent(), this.mTransportContext, this.mHttpManager, this);
        } else {
            this.noRespContent = true;
        }
        H5HttpUrlResponse h5HttpUrlResponse = new H5HttpUrlResponse(handleResponseHeader(httpResponse), i, str, networkInputStreamWrapper);
        h5HttpUrlResponse.setStatusLine(httpResponse.getStatusLine());
        h5HttpUrlResponse.setHttpResponse(httpResponse);
        fillResponse(h5HttpUrlResponse, httpResponse);
        return h5HttpUrlResponse;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public String monitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e95f1af", new Object[]{this});
        }
        DataContainer currentDataContainer = this.mTransportContext.getCurrentDataContainer();
        if (currentDataContainer == null) {
            return "";
        }
        if (this.noRespContent) {
            return super.monitorLog();
        }
        return StringUtils.isEmpty(currentDataContainer.getDataItem("ERROR")) ? "" : super.monitorLog();
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public String doMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6ae0ba4", new Object[]{this});
        }
        if (a()) {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.SUB_TYPE, "mini_app");
        }
        ActThreadPoolExecutor currentThreadPoolExecutor = getCurrentThreadPoolExecutor();
        if (currentThreadPoolExecutor != null) {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.THREAD_POOL_ALL_TASK_COUNT, String.valueOf(currentThreadPoolExecutor.getTaskCount()));
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.THREAD_POOL_ACTIVE_COUNT, String.valueOf(currentThreadPoolExecutor.getActiveCount()));
        }
        b();
        c();
        return super.doMonitorLog();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HttpUrlRequest originRequest = getOriginRequest();
        if (originRequest == null || !(originRequest instanceof H5HttpUrlRequest)) {
            return;
        }
        try {
            String tag = originRequest.getTag(TransportConstants.KEY_IS_H5_MAIN_DOC_REQ);
            if (!StringUtils.isEmpty(tag) && "true".equalsIgnoreCase(tag)) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.H5_MAIN_DOC, "T");
            }
            String tag2 = originRequest.getTag(TransportConstants.KEY_JUMP_SRC_APPID);
            if (!StringUtils.isEmpty(tag2)) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.JUMP_SRC_APPID, tag2);
            }
            String tag3 = originRequest.getTag(TransportConstants.KEY_BIZ_FLAG);
            if (!StringUtils.isEmpty(tag3)) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.BIZ_FLAG, tag3);
            }
            String tag4 = originRequest.getTag(TransportConstants.KEY_H5_PAGE_TRACE_ID);
            if (StringUtils.isEmpty(tag4)) {
                return;
            }
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.H5_PAGE_TRACE_ID, tag4);
        } catch (Throwable th) {
            LogCatUtil.warn(HttpWorker.TAG, "[putRequestInfos2MonitorLog] Excepiton = " + th.toString());
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public HttpUrlHeader handleResponseHeader(HttpResponse httpResponse) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("1f849742", new Object[]{this, httpResponse});
        }
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.addHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void copyHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5645ee58", new Object[]{this});
            return;
        }
        ArrayList<Header> headers = getHeaders();
        if (headers != null && !headers.isEmpty()) {
            Iterator<Header> it = headers.iterator();
            while (it.hasNext()) {
                getTargetHttpUriRequest().addHeader(it.next());
            }
        }
        getTargetHttpUriRequest().removeHeaders("Accept-Encoding");
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(getTargetHttpUriRequest());
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public void extNoteTraficConsume(TraficConsumeModel traficConsumeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf97df1a", new Object[]{this, traficConsumeModel});
            return;
        }
        super.extNoteTraficConsume(traficConsumeModel);
        HttpUrlRequest originRequest = getOriginRequest();
        if (originRequest == null || !(originRequest instanceof H5HttpUrlRequest)) {
            return;
        }
        H5HttpUrlRequest h5HttpUrlRequest = (H5HttpUrlRequest) originRequest;
        MonitorLogRecordUtil.recordCtrlPrintURLFlagToDataflow(traficConsumeModel, h5HttpUrlRequest.isPrintUrlToMonitorLog());
        if (StringUtils.isEmpty(h5HttpUrlRequest.getRefer())) {
            return;
        }
        traficConsumeModel.extParams.put("h5_refer", h5HttpUrlRequest.getRefer());
    }

    private void c() {
        Header firstHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            HttpUriRequest targetHttpUriRequest = getTargetHttpUriRequest();
            if (targetHttpUriRequest == null || (firstHeader = targetHttpUriRequest.getFirstHeader("x-ldcid-level")) == null) {
                return;
            }
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.H5_LDCID_LEVEL, firstHeader.getValue());
        } catch (Throwable th) {
            LogCatUtil.error(HttpWorker.TAG, "putH5IdcidLevel2Log fail. ", th);
        }
    }
}
