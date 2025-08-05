package com.alipay.mobile.common.transport.download;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.TransportCallback;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.utils.DownloadUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Future;
import org.apache.http.Header;
import tb.riy;

/* loaded from: classes3.dex */
public class DownloadManager extends HttpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DownloadManager(Context context) {
        super(context);
    }

    public Future<?> addDownload(String str, String str2, ArrayList<Header> arrayList, TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("e1b4fbd1", new Object[]{this, str, str2, arrayList, transportCallback});
        }
        LogCatUtil.info("DownloadManager", "addDownload url=[" + str + riy.ARRAY_END_STR);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        DownloadRequest downloadRequest = new DownloadRequest(str, str2, null, arrayList);
        downloadRequest.setTransportCallback(transportCallback);
        return execute(downloadRequest);
    }

    public Future<?> addDownload(DownloadRequest downloadRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("7c1f2613", new Object[]{this, downloadRequest});
        }
        if (downloadRequest == null) {
            throw new IllegalArgumentException("downloadRequest may not be null");
        }
        if (TextUtils.isEmpty(downloadRequest.getUrl())) {
            throw new IllegalArgumentException("downloadRequest#url may not be null");
        }
        if (downloadRequest.getHeaders() == null) {
            downloadRequest.setHeaders(new ArrayList<>());
        }
        LogCatUtil.info("DownloadManager", "addDownload url=[" + downloadRequest.getUrl() + riy.ARRAY_END_STR);
        return execute(downloadRequest);
    }

    @Override // com.alipay.mobile.common.transport.http.HttpManager
    public HttpWorker generateWorker(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpWorker) ipChange.ipc$dispatch("c83fc7de", new Object[]{this, httpUrlRequest}) : new DownloadWorker(this, httpUrlRequest);
    }

    @Deprecated
    public File getCacheFile(Context context, String str, String str2, ArrayList<Header> arrayList, TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("9ebf771b", new Object[]{this, context, str, str2, arrayList, transportCallback}) : DownloadUtils.createCacheFile(context, str, str2, arrayList, transportCallback);
    }

    public File getCacheFile(Context context, DownloadRequest downloadRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("db92cd59", new Object[]{this, context, downloadRequest}) : DownloadUtils.createCacheFile(context, downloadRequest);
    }

    @Override // com.alipay.mobile.common.transport.http.HttpManager
    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("909d0b72", new Object[]{this}) : this.coreHttpManager.getDjgHttpClient();
    }
}
