package com.taobao.android.interactive_sdk.adapter;

import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public interface ILikeAdapter {

    /* loaded from: classes5.dex */
    public enum ErrorType {
        ERROR_LIMITING,
        ERROR_NET,
        ERROR_SERVICE,
        ERROR_OTHER
    }

    /* loaded from: classes5.dex */
    public interface a {
        void onError(ErrorType errorType, String str, String str2);

        void onSuccess(MtopResponse mtopResponse, Object obj);
    }
}
