package com.uc.webview.export.extension;

import com.uc.webview.base.IExtender;
import com.uc.webview.export.WebView;

/* loaded from: classes9.dex */
public class INetworkHostingService implements IExtender {

    /* loaded from: classes9.dex */
    public static class IDelegate implements IExtender {
        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public void onDataReceived(byte[] bArr, int i) {
        }

        public void onError(int i, String str) {
        }

        public void onFinished() {
        }

        public void onResponseReceived(String str, String[] strArr, String[] strArr2) {
        }
    }

    /* loaded from: classes9.dex */
    public static class ITransaction implements IExtender {
        public void cancel() {
        }

        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public void setDelegate(IDelegate iDelegate) {
        }

        public void setExtraInfo(String str, String str2) {
        }

        public void setHeader(String str, String str2) {
        }

        public void setMethod(String str) {
        }

        public void setRequestFlags(int i) {
        }

        public void setUploadStream(IUploadStream iUploadStream) {
        }

        public void start() {
        }
    }

    /* loaded from: classes9.dex */
    public static class IUploadStream implements IExtender {

        /* loaded from: classes9.dex */
        public static class IClient implements IExtender {
            public void OnDestroyed(IUploadStream iUploadStream) {
            }

            public void OnReadCompleted(IUploadStream iUploadStream, int i) {
            }

            public void OnRewindCompleted(IUploadStream iUploadStream, int i) {
            }

            @Override // com.uc.webview.base.IExtender
            public Object invoke(int i, Object[] objArr) {
                return null;
            }
        }

        public void destroy() {
        }

        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public int read(byte[] bArr) {
            return 0;
        }

        public int readAsync(byte[] bArr) {
            return -1;
        }

        public void rewind() {
        }

        public void rewindAsync() {
        }

        public void setStreamClient(IClient iClient) {
        }
    }

    /* loaded from: classes9.dex */
    public static final class Instance {
        private static volatile INetworkHostingService sInstance;

        public static INetworkHostingService get() {
            return sInstance;
        }

        public static void set(INetworkHostingService iNetworkHostingService) {
            sInstance = iNetworkHostingService;
            Sdk2CoreHost.impl().setNetworkHostingService(iNetworkHostingService);
        }
    }

    public int RequestPreconnection(int i, String str) {
        return -1;
    }

    @Deprecated
    public ITransaction createTransaction(int i, String str, WebView webView) {
        return null;
    }

    public ITransaction createTransaction(WebView webView, int i, String str) {
        return createTransaction(i, str, webView);
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public int type() {
        return 0;
    }

    public String version() {
        return null;
    }
}
