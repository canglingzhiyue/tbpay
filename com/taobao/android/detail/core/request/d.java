package com.taobao.android.detail.core.request;

import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public interface d<T> extends c<T, MtopResponse> {
    void a(T t, MtopResponse mtopResponse, JSONObject jSONObject);
}
