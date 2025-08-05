package com.taobao.tao.detail.biz.api5.common;

import java.io.Serializable;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public interface ApiRequestListener<T> extends Serializable {
    void onError(MtopResponse mtopResponse);

    void onSuccess(T t);
}
