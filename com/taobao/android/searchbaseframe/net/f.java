package com.taobao.android.searchbaseframe.net;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.net.d;
import com.taobao.android.searchbaseframe.net.e;

/* loaded from: classes6.dex */
public interface f<REQUEST extends d<?, ?, ?>, RESULT extends e> {

    /* loaded from: classes6.dex */
    public interface a<RESULT extends e> {
        void a();

        void a(RESULT result);

        void b(RESULT result);

        boolean b();

        void c();
    }

    JSONObject a(JSONObject jSONObject) throws ResultException;

    void a(REQUEST request, a<RESULT> aVar);
}
