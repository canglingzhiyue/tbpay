package com.taobao.android.order.core;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public interface c {
    void onLoadError(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus);

    void onLoadSuccess(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus);

    void onLoadSuccess(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus);

    void onReloadRequested(JSONObject jSONObject);
}
