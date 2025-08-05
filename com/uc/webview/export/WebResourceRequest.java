package com.uc.webview.export;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes9.dex */
public class WebResourceRequest {
    boolean mHasGesture;
    Map<String, String> mHeaders;
    boolean mIsForMainFrame;
    boolean mIsRedirect;
    String mMethod;
    Uri mUri;

    public WebResourceRequest(String str, String str2, Map<String, String> map) {
        this.mMethod = str;
        this.mHeaders = map;
        this.mUri = Uri.parse(str2);
    }

    public WebResourceRequest(String str, Map<String, String> map) {
        this("Get", str, map);
    }

    public WebResourceRequest(String str, Map<String, String> map, Uri uri, boolean z, boolean z2) {
        this.mMethod = str;
        this.mHeaders = map;
        this.mUri = uri;
        this.mHasGesture = z;
        this.mIsForMainFrame = z2;
    }

    public WebResourceRequest(String str, Map<String, String> map, String str2, boolean z, boolean z2) {
        this.mMethod = str;
        this.mHeaders = map;
        this.mUri = Uri.parse(str2);
        this.mHasGesture = z;
        this.mIsForMainFrame = z2;
    }

    public WebResourceRequest(String str, Map<String, String> map, String str2, boolean z, boolean z2, boolean z3) {
        this.mIsRedirect = z3;
        this.mMethod = str;
        this.mHeaders = map;
        this.mUri = Uri.parse(str2);
        this.mHasGesture = z;
        this.mIsForMainFrame = z2;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getRequestHeaders() {
        return this.mHeaders;
    }

    public Uri getUrl() {
        return this.mUri;
    }

    public boolean hasGesture() {
        return this.mHasGesture;
    }

    public boolean isForMainFrame() {
        return this.mIsForMainFrame;
    }

    public boolean isRedirect() {
        return this.mIsRedirect;
    }

    public void setMethod(String str) {
        this.mMethod = str;
    }

    public void setRequestHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setUrl(Uri uri) {
        this.mUri = uri;
    }

    public void setUrl(String str) {
        this.mUri = Uri.parse(str);
    }

    public String toString() {
        return "method=" + this.mMethod + ",header=" + this.mHeaders + ",uri=" + this.mUri + ",hasGesture=" + this.mHasGesture + ",isForMainFrame=" + this.mIsForMainFrame;
    }
}
