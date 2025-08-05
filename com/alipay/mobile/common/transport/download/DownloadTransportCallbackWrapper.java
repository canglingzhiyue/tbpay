package com.alipay.mobile.common.transport.download;

import com.alipay.mobile.common.transport.GlobalTransportCallbackObservable;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.SafeTransportCallbackWrapper;
import com.alipay.mobile.common.transport.TransportCallback;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DownloadTransportCallbackWrapper extends SafeTransportCallbackWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DownloadTransportCallbackWrapper downloadTransportCallbackWrapper, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1975067333:
                super.onPostExecute((Request) objArr[0], (Response) objArr[1]);
                return null;
            case -911532339:
                super.onCancelled((Request) objArr[0]);
                return null;
            case -906203882:
                super.onFailed((Request) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
                return null;
            case 760835372:
                super.onPreExecute((Request) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DownloadTransportCallbackWrapper(TransportCallback transportCallback) {
        super(transportCallback);
    }

    public DownloadTransportCallbackWrapper() {
    }

    @Override // com.alipay.mobile.common.transport.SafeTransportCallbackWrapper, com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onProgressUpdate(Request request, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01968e", new Object[]{this, request, new Double(d)});
            return;
        }
        GlobalTransportCallbackObservable.getInstance().onProgressUpdate(request, d);
        try {
            getWrappedTransportCallback().onProgressUpdate(request, d);
        } catch (RuntimeException e) {
            LogCatUtil.error("DownloadTransportCallbackWrapper", "[onProgressUpdate] Exception: " + e.toString());
            if (request == null) {
                return;
            }
            request.cancel();
        }
    }

    @Override // com.alipay.mobile.common.transport.SafeTransportCallbackWrapper, com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onCancelled(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ab1ecd", new Object[]{this, request});
            return;
        }
        GlobalTransportCallbackObservable.getInstance().onCancelled(request);
        super.onCancelled(request);
    }

    @Override // com.alipay.mobile.common.transport.SafeTransportCallbackWrapper, com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onPreExecute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d596d2c", new Object[]{this, request});
            return;
        }
        GlobalTransportCallbackObservable.getInstance().onPreExecute(request);
        super.onPreExecute(request);
    }

    @Override // com.alipay.mobile.common.transport.SafeTransportCallbackWrapper, com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onPostExecute(Request request, Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a46dd3b", new Object[]{this, request, response});
            return;
        }
        GlobalTransportCallbackObservable.getInstance().onPostExecute(request, response);
        super.onPostExecute(request, response);
    }

    @Override // com.alipay.mobile.common.transport.SafeTransportCallbackWrapper, com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onFailed(Request request, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fc6d16", new Object[]{this, request, new Integer(i), str});
            return;
        }
        GlobalTransportCallbackObservable.getInstance().onFailed(request, i, str);
        super.onFailed(request, i, str);
    }
}
