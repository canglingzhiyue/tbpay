package com.taobao.android.trade.boost.request.mtop;

import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes.dex */
public interface a<T> extends c<T, MtopResponse> {
    void onSystemFailure(MtopResponse mtopResponse);
}
