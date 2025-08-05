package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class ZHttpRequestRetryHandler implements HttpRequestRetryHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ZHttpRequestRetryHandler";

    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace81c4f", new Object[]{this, iOException, new Integer(i), httpContext})).booleanValue();
        }
        if (i >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            return true;
        }
        return ((iOException instanceof SocketException) || (iOException instanceof SSLException)) && iOException.getMessage() != null && iOException.getMessage().contains("Broken pipe");
    }
}
