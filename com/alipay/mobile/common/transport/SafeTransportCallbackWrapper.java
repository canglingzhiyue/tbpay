package com.alipay.mobile.common.transport;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SafeTransportCallbackWrapper extends TransportCallbackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TransportCallback f5518a;

    public static /* synthetic */ Object ipc$super(SafeTransportCallbackWrapper safeTransportCallbackWrapper, String str, Object... objArr) {
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
            case 1057068686:
                super.onProgressUpdate((Request) objArr[0], ((Number) objArr[1]).doubleValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public SafeTransportCallbackWrapper(TransportCallback transportCallback) {
        this.f5518a = null;
        this.f5518a = transportCallback;
    }

    public SafeTransportCallbackWrapper() {
        this.f5518a = null;
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onCancelled(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ab1ecd", new Object[]{this, request});
            return;
        }
        try {
            super.onCancelled(request);
        } catch (Throwable th) {
            LogCatUtil.warn("SafeTransportCallbackWrapper", "super.onCancelled fail", th);
        }
        TransportCallback transportCallback = this.f5518a;
        if (transportCallback == null) {
            LogCatUtil.printInfo("SafeTransportCallbackWrapper", "[onCancelled] wrappedTransportCallback is null.");
            return;
        }
        try {
            transportCallback.onCancelled(request);
        } catch (Throwable th2) {
            LogCatUtil.warn("SafeTransportCallbackWrapper", "onCancelled fail", th2);
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onPreExecute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d596d2c", new Object[]{this, request});
            return;
        }
        try {
            super.onPreExecute(request);
        } catch (Throwable th) {
            LogCatUtil.warn("SafeTransportCallbackWrapper", "super.onPreExecute fail", th);
        }
        TransportCallback transportCallback = this.f5518a;
        if (transportCallback == null) {
            LogCatUtil.printInfo("SafeTransportCallbackWrapper", "[onPreExecute] wrappedTransportCallback is null.");
            return;
        }
        try {
            transportCallback.onPreExecute(request);
        } catch (Throwable th2) {
            LogCatUtil.warn("SafeTransportCallbackWrapper", "onPreExecute fail", th2);
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onPostExecute(Request request, Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a46dd3b", new Object[]{this, request, response});
            return;
        }
        try {
            super.onPostExecute(request, response);
        } catch (Throwable th) {
            LogCatUtil.error("SafeTransportCallbackWrapper", "super.onPostExecute fail", th);
        }
        TransportCallback transportCallback = this.f5518a;
        if (transportCallback == null) {
            LogCatUtil.printInfo("SafeTransportCallbackWrapper", "[onPostExecute] wrappedTransportCallback is null.");
            return;
        }
        try {
            transportCallback.onPostExecute(request, response);
        } catch (Throwable th2) {
            LogCatUtil.error("SafeTransportCallbackWrapper", "onPostExecute fail", th2);
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onProgressUpdate(Request request, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01968e", new Object[]{this, request, new Double(d)});
            return;
        }
        try {
            super.onProgressUpdate(request, d);
        } catch (Throwable th) {
            LogCatUtil.error("SafeTransportCallbackWrapper", "super.onProgressUpdate fail", th);
        }
        TransportCallback transportCallback = this.f5518a;
        if (transportCallback == null) {
            return;
        }
        try {
            transportCallback.onProgressUpdate(request, d);
        } catch (Throwable th2) {
            LogCatUtil.error("SafeTransportCallbackWrapper", "onProgressUpdate fail", th2);
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallbackAdapter, com.alipay.mobile.common.transport.TransportCallback
    public void onFailed(Request request, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fc6d16", new Object[]{this, request, new Integer(i), str});
            return;
        }
        try {
            super.onFailed(request, i, str);
        } catch (Throwable th) {
            LogCatUtil.error("SafeTransportCallbackWrapper", "super.onFailed fail", th);
        }
        TransportCallback transportCallback = this.f5518a;
        if (transportCallback == null) {
            LogCatUtil.printInfo("SafeTransportCallbackWrapper", "[onFailed] wrappedTransportCallback is null.");
            return;
        }
        try {
            transportCallback.onFailed(request, i, str);
        } catch (Throwable th2) {
            LogCatUtil.error("SafeTransportCallbackWrapper", "onFailed fail", th2);
        }
    }

    public TransportCallback getWrappedTransportCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportCallback) ipChange.ipc$dispatch("d4e0c145", new Object[]{this}) : this.f5518a;
    }

    public void setWrappedTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2b3507", new Object[]{this, transportCallback});
        } else {
            this.f5518a = transportCallback;
        }
    }
}
