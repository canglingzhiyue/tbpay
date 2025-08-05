package com.uc.webview.export;

import java.io.InputStream;
import java.util.Map;
import tb.icf;

/* loaded from: classes9.dex */
public class WebResourceResponse {
    private InputStream mData;
    private String mEncoding;
    private Map<String, String> mHeaders;
    private String mMimeType;
    private String mReasonPhrase;
    private int mStatusCode;

    public WebResourceResponse(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        this(str, str2, inputStream);
        setStatusCodeAndReasonPhrase(i, str3);
        setResponseHeaders(map);
    }

    public WebResourceResponse(String str, String str2, InputStream inputStream) {
        this.mMimeType = str;
        this.mEncoding = str2;
        this.mData = inputStream;
        this.mReasonPhrase = icf.a.CONTROL_NAME_OK;
        this.mStatusCode = 200;
    }

    public InputStream getData() {
        return this.mData;
    }

    public String getEncoding() {
        return this.mEncoding;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public String getReasonPhrase() {
        return this.mReasonPhrase;
    }

    public Map<String, String> getResponseHeaders() {
        return this.mHeaders;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    boolean isRedirect() {
        return false;
    }

    public void setData(InputStream inputStream) {
        this.mData = inputStream;
    }

    public void setEncoding(String str) {
        this.mEncoding = str;
    }

    public void setMimeType(String str) {
        this.mMimeType = str;
    }

    public void setResponseHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setStatusCodeAndReasonPhrase(int i, String str) {
        this.mReasonPhrase = str;
        this.mStatusCode = i;
    }
}
