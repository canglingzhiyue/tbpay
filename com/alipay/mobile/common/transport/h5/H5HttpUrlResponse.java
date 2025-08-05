package com.alipay.mobile.common.transport.h5;

import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/* loaded from: classes3.dex */
public class H5HttpUrlResponse extends HttpUrlResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InputStream f5540a;
    private StatusLine b;
    public HttpResponse httpResponse;

    public H5HttpUrlResponse(HttpUrlHeader httpUrlHeader, int i, String str, InputStream inputStream) {
        super(httpUrlHeader, i, str, null);
        this.f5540a = inputStream;
    }

    public InputStream getInputStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("b713b4be", new Object[]{this}) : this.f5540a;
    }

    public void setStatusLine(StatusLine statusLine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7579407", new Object[]{this, statusLine});
        } else {
            this.b = statusLine;
        }
    }

    public StatusLine getStatusLine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StatusLine) ipChange.ipc$dispatch("21c0da2b", new Object[]{this}) : this.b;
    }

    public HttpResponse getHttpResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("b24cc325", new Object[]{this}) : this.httpResponse;
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6aa6a7", new Object[]{this, httpResponse});
        } else {
            this.httpResponse = httpResponse;
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        HttpResponse httpResponse = this.httpResponse;
        if (httpResponse == null) {
            LogCatUtil.warn("H5HttpUrlResponse", "httpResponse is null");
            return;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity == null) {
                return;
            }
            entity.consumeContent();
            LogCatUtil.info("H5HttpUrlResponse", "enter release()");
        } catch (Throwable th) {
            LogCatUtil.warn("H5HttpUrlResponse", "release fail", th);
        }
    }
}
