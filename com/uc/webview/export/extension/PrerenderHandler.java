package com.uc.webview.export.extension;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.uc.webview.base.IExtender;
import com.uc.webview.export.WebResourceError;
import com.uc.webview.internal.interfaces.IPrerenderHandler;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.Map;

/* loaded from: classes9.dex */
public class PrerenderHandler {
    private IPrerenderHandler mPrerenderHandlerImpl;

    /* loaded from: classes9.dex */
    public static class ErrorCode {
        public static final int ERR_CANCELED_BY_EMBEDDER = -3;
        public static final int ERR_CLIENT_CERT = -8;
        public static final int ERR_COMMIT_FAIL = -13;
        public static final int ERR_CUSTOM_VIEW = -10;
        public static final int ERR_DOWNLOAD_PAGE = -9;
        public static final int ERR_DUPLICATED = -1;
        public static final int ERR_FORBIDDEN_BY_META = -14;
        public static final int ERR_HTTP_AUTH = -6;
        public static final int ERR_JSAPI_INVOKED = -11;
        public static final int ERR_LIMIT_EXCEEDED = -4;
        public static final int ERR_NET_ERROR = -12;
        public static final int ERR_POP_WINDOW = -5;
        public static final int ERR_SSL_ERROR = -7;
        public static final int ERR_WEBVIEW_DESTORYED = -2;
    }

    /* loaded from: classes9.dex */
    public static class Option {
        public static final int CLEAR_HISTORY = 2;
        public static final int IGNORE_QUERY = 8;
        public static final int NONE = 0;
        public static final int PEND_ONLOADEVENT = 1;
        public static final int PREFIX_MATCH = 4;
        public static final int TRIGGER_COMMIT_EVENT = 16;
    }

    /* loaded from: classes9.dex */
    public static abstract class PrerenderClient implements IExtender {
        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public abstract void onCommit(String str);

        public abstract void onError(String str, WebResourceError webResourceError);

        @Deprecated
        public void onReady(String str) {
        }

        public void onReady(String str, int i) {
        }

        public abstract void onStart(String str);

        public abstract boolean shouldBlock(String str, Bundle bundle);
    }

    /* loaded from: classes9.dex */
    public static class Type {
        public static final int NUM_ENTRIES = 4;
        public static final int PREREAD = 1;
        public static final int PRERENDER = 2;
        public static final int UNSPECIFIED = 0;
        public static final int WEBVIEW_PRERENDER = 3;
    }

    public PrerenderHandler(IWebViewExtension iWebViewExtension) {
        this.mPrerenderHandlerImpl = iWebViewExtension.getPrerenderHandler();
    }

    public void addPrerender(String str, String str2) {
        this.mPrerenderHandlerImpl.addPrerender(str, str2, 1, 0);
    }

    public void addPrerender(String str, String str2, int i, int i2) {
        this.mPrerenderHandlerImpl.addPrerender(str, str2, i, i2);
    }

    public void addPrerender(String str, String str2, Map<String, String> map, int i, int i2) {
        this.mPrerenderHandlerImpl.addPrerender(str, str2, map, i, i2);
    }

    public void cancelPrerender(String str) {
        this.mPrerenderHandlerImpl.cancelPrerender(str);
    }

    public boolean commitPrerender(String str) {
        return this.mPrerenderHandlerImpl.commitPrerender(str);
    }

    public boolean requestSnapshot(String str, Bitmap bitmap) {
        return this.mPrerenderHandlerImpl.requestSnapshot(str, bitmap);
    }

    public void setPrerenderClient(PrerenderClient prerenderClient) {
        this.mPrerenderHandlerImpl.setPrerenderClient(prerenderClient);
    }

    public void setType(int i) {
        if (i >= 4 || i <= 0) {
            return;
        }
        this.mPrerenderHandlerImpl.setPrerenderType(i);
    }
}
