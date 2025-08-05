package com.alibaba.security.common.http.interfaces;

import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;

/* loaded from: classes3.dex */
public interface OnHttpCallBack<T extends HttpResponse> {
    void onFail(HttpRequest httpRequest, Exception exc);

    void onSuccess(HttpRequest httpRequest, T t);
}
