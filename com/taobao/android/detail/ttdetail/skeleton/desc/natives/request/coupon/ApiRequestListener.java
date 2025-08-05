package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import java.io.Serializable;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public interface ApiRequestListener<T> extends Serializable {
    void onError(MtopResponse mtopResponse);

    void onSuccess(T t);
}
