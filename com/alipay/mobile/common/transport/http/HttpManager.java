package com.alipay.mobile.common.transport.http;

import android.content.Context;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.http.inner.CoreHttpManager;
import com.alipay.mobile.common.transport.rpc.RpcHttpWorker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class HttpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HttpManager";
    public CoreHttpManager coreHttpManager;

    public HttpManager(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context may not be null");
        }
        this.coreHttpManager = CoreHttpManager.getInstance(context);
    }

    public Future<Response> execute(Request request) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("439d65a6", new Object[]{this, request}) : this.coreHttpManager.execute(this, request);
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("909d0b72", new Object[]{this}) : this.coreHttpManager.getHttpClient();
    }

    public void addDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab683011", new Object[]{this, new Long(j)});
        } else {
            this.coreHttpManager.addDataSize(j);
        }
    }

    public void addConnectTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a5167", new Object[]{this, new Long(j)});
        } else {
            this.coreHttpManager.addConnectTime(j);
        }
    }

    public void addSocketTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623635c", new Object[]{this, new Long(j)});
        } else {
            this.coreHttpManager.addSocketTime(j);
        }
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue() : this.coreHttpManager.getAverageSpeed();
    }

    public long getAverageConnectTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43b2aeeb", new Object[]{this})).longValue() : this.coreHttpManager.getAverageConnectTime();
    }

    public String dumpPerf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fb5581c", new Object[]{this}) : this.coreHttpManager.dumpPerf(getClass().getSimpleName());
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.coreHttpManager.close();
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.coreHttpManager.getContext();
    }

    public HttpWorker generateWorker(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpWorker) ipChange.ipc$dispatch("c83fc7de", new Object[]{this, httpUrlRequest}) : new RpcHttpWorker(this, httpUrlRequest);
    }

    public void setHttpClient(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1befe96", new Object[]{this, androidHttpClient});
        } else {
            this.coreHttpManager.setHttpClient(androidHttpClient);
        }
    }
}
