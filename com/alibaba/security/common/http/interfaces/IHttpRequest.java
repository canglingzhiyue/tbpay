package com.alibaba.security.common.http.interfaces;

import com.alibaba.security.common.http.model.HttpRequest;

/* loaded from: classes3.dex */
public interface IHttpRequest {
    void asyncRequest(HttpRequest httpRequest, OnHttpCallBack onHttpCallBack);
}
