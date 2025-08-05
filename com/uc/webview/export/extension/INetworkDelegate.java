package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;
import com.uc.webview.base.Log;
import com.uc.webview.export.WebView;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class INetworkDelegate implements IExtender {
    public static final int OBSERVE_ALL = 7;
    public static final int OBSERVE_DEFAULT = 3;
    public static final int OBSERVE_FINISH = 4;
    public static final int OBSERVE_NONE = 0;
    public static final int OBSERVE_REQUEST = 1;
    public static final int OBSERVE_RESPONSE = 2;

    /* loaded from: classes9.dex */
    public static abstract class IRequestData implements IExtender {
        public abstract Map<String, String> getExtraInfo();

        public abstract Map<String, String> getHeaders();

        public abstract String getMethod();

        public abstract String getUrl();

        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public abstract void removeHeader(String str);

        public abstract void setExtraInfo(String str, String str2);

        public abstract void setHeader(String str, String str2);

        public abstract void setUrl(String str);
    }

    /* loaded from: classes9.dex */
    public static abstract class IResponseData implements IExtender {
        public abstract Map<String, String> getExtraInfo();

        public abstract String[] getHeaderNames();

        public abstract String[] getHeaderValues();

        public abstract Map<String, String> getHeaders();

        public abstract int getStatusCode();

        public abstract String getUrl();

        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public abstract void setExtraInfo(String str, String str2);

        public abstract void setHeader(String str, String str2);
    }

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile INetworkDelegate sInstance;

        public static INetworkDelegate get() {
            return sInstance;
        }

        public static void set(int i, INetworkDelegate iNetworkDelegate) {
            try {
                Sdk2CoreHost.impl().setNetworkDelegate(i, iNetworkDelegate);
                sInstance = iNetworkDelegate;
            } catch (Throwable th) {
                Log.w("NetworkDelegate", "set failed", th);
            }
        }
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public void onBeforeSendRequest(WebView webView, IRequestData iRequestData) {
        onBeforeSendRequest(iRequestData);
    }

    @Deprecated
    public void onBeforeSendRequest(IRequestData iRequestData) {
    }

    public void onCompleted(WebView webView, String str, Map<String, String> map) {
        onCompleted(str, map);
    }

    @Deprecated
    public void onCompleted(String str, Map<String, String> map) {
    }

    public void onError(WebView webView, String str, int i, Map<String, String> map) {
        onError(str, i, map);
    }

    @Deprecated
    public void onError(String str, int i, Map<String, String> map) {
    }

    public void onResponseReceived(WebView webView, IResponseData iResponseData) {
        onResponseReceived(iResponseData);
    }

    @Deprecated
    public void onResponseReceived(IResponseData iResponseData) {
    }
}
