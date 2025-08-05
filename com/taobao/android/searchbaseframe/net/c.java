package com.taobao.android.searchbaseframe.net;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.net.d;
import com.taobao.android.searchbaseframe.net.e;
import tb.iox;

/* loaded from: classes6.dex */
public interface c<REQUEST extends d<?, ?, ?>, RESULT extends e> {
    JSONObject a(JSONObject jSONObject) throws ResultException;

    RESULT a(REQUEST request);

    RESULT a(REQUEST request, iox ioxVar);
}
