package com.uc.webview.export;

import android.webkit.ValueCallback;
import com.uc.webview.internal.b;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.IWebStorage;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class WebStorage {
    private static HashMap<Integer, WebStorage> sInstances;
    private IWebStorage mWebStorage;

    /* loaded from: classes9.dex */
    public static class Origin {
        private String mOrigin;
        private long mQuota;
        private long mUsage;

        public Origin(String str) {
            this.mOrigin = null;
            this.mQuota = 0L;
            this.mUsage = 0L;
            this.mOrigin = str;
        }

        public Origin(String str, long j) {
            this.mOrigin = null;
            this.mQuota = 0L;
            this.mUsage = 0L;
            this.mOrigin = str;
            this.mQuota = j;
        }

        public Origin(String str, long j, long j2) {
            this.mOrigin = null;
            this.mQuota = 0L;
            this.mUsage = 0L;
            this.mOrigin = str;
            this.mQuota = j;
            this.mUsage = j2;
        }

        public String getOrigin() {
            return this.mOrigin;
        }

        public long getQuota() {
            return this.mQuota;
        }

        public long getUsage() {
            return this.mUsage;
        }
    }

    private WebStorage(IWebStorage iWebStorage) {
        this.mWebStorage = iWebStorage;
    }

    public static WebStorage getInstance() {
        return getInstance(e.a());
    }

    private static synchronized WebStorage getInstance(int i) throws RuntimeException {
        WebStorage webStorage;
        synchronized (WebStorage.class) {
            if (sInstances == null) {
                sInstances = new HashMap<>();
            }
            webStorage = sInstances.get(Integer.valueOf(i));
            if (webStorage == null) {
                webStorage = new WebStorage(b.d(i));
                sInstances.put(Integer.valueOf(i), webStorage);
            }
        }
        return webStorage;
    }

    public static WebStorage getInstance(WebView webView) {
        return getInstance(webView.getCurrentViewCoreType());
    }

    public void deleteAllData() {
        this.mWebStorage.deleteAllData();
    }

    public void deleteOrigin(String str) {
        this.mWebStorage.deleteOrigin(str);
    }

    public void getOrigins(ValueCallback<Map> valueCallback) {
        this.mWebStorage.getOrigins(valueCallback);
    }

    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
        this.mWebStorage.getQuotaForOrigin(str, valueCallback);
    }

    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
        this.mWebStorage.getUsageForOrigin(str, valueCallback);
    }

    @Deprecated
    public void setQuotaForOrigin(String str, long j) {
        this.mWebStorage.setQuotaForOrigin(str, j);
    }

    public String toString() {
        return "WebStorage@" + hashCode() + riy.ARRAY_START_STR + this.mWebStorage + riy.ARRAY_END_STR;
    }
}
