package com.alipay.mobile.common.transport.h5;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.concurrent.Future;
import tb.riy;

/* loaded from: classes3.dex */
public class H5NetworkManager extends HttpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public H5NetworkManager(Context context) {
        super(context);
    }

    public Future<?> enqueue(H5HttpUrlRequest h5HttpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("10975611", new Object[]{this, h5HttpUrlRequest});
        }
        if (h5HttpUrlRequest == null) {
            throw new IllegalArgumentException("h5HttpUrlRequest is null");
        }
        if (TextUtils.isEmpty(h5HttpUrlRequest.getUrl())) {
            throw new IllegalArgumentException("h5HttpUrlRequest#url is null");
        }
        if (h5HttpUrlRequest.getHeaders() == null) {
            h5HttpUrlRequest.setHeaders(new ArrayList<>());
        }
        LogCatUtil.printInfo("HttpManager", "enqueue url=[" + h5HttpUrlRequest.getUrl() + riy.ARRAY_END_STR);
        return execute(h5HttpUrlRequest);
    }

    @Override // com.alipay.mobile.common.transport.http.HttpManager
    public HttpWorker generateWorker(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpWorker) ipChange.ipc$dispatch("c83fc7de", new Object[]{this, httpUrlRequest}) : new H5HttpWorker(this, httpUrlRequest);
    }

    @Override // com.alipay.mobile.common.transport.http.HttpManager
    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("909d0b72", new Object[]{this}) : this.coreHttpManager.getH5HttpClient();
    }

    @Override // com.alipay.mobile.common.transport.http.HttpManager
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        getHttpClient().close();
        setHttpClient(null);
        getHttpClient();
    }

    @Override // com.alipay.mobile.common.transport.http.HttpManager
    public void setHttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1befe96", new Object[]{this, androidHttpClient});
        } else {
            this.coreHttpManager.setH5HttpClient(androidHttpClient);
        }
    }
}
