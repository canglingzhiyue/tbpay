package com.taobao.android.detail.core.request.apicommon;

import java.io.Serializable;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public interface ApiRequestListener<T> extends Serializable {
    void onError(MtopResponse mtopResponse);

    void onSuccess(T t);
}
