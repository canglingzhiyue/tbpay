package com.taobao.android.detail.core.request.desc;

import com.taobao.android.detail.core.request.MtopRequestListener;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public interface a<T> extends MtopRequestListener<T> {
    void a(int i, T t);

    void a(int i, MtopResponse mtopResponse);
}
