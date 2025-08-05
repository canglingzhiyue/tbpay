package com.taobao.social.sdk.net;

import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public interface ISocialBusinessListener<T> {

    /* loaded from: classes8.dex */
    public enum ErrorType {
        ERROR_LIMITING,
        ERROR_NET,
        ERROR_SERVICE,
        ERROR_OTHER
    }

    void onError(ErrorType errorType, String str, String str2);

    void onSuccess(MtopResponse mtopResponse, T t);
}
