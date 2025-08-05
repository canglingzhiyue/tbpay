package com.alibaba.android.nextrpc.request.internal.mtop;

import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public interface b {
    String a(NextRpcRequest nextRpcRequest, com.alibaba.android.nextrpc.request.a aVar, c cVar);

    void a(int i, MtopResponse mtopResponse, Object obj);

    void a(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj);

    void a(String str, String str2, String str3, JSONObject jSONObject);

    void a(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj);

    void b(int i, MtopResponse mtopResponse, Object obj);
}
