package com.taobao.taolive.sdk.goodlist;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.Map;
import tb.pmt;

/* loaded from: classes8.dex */
public interface e {
    void a();

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, Activity activity, LiveItem liveItem, String str, Map<String, String> map);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, int i, LiveItem liveItem, Map<String, String> map);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, long j, long j2, k kVar);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, String str2, long j, long j2, long j3, k kVar);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, String str2, JSONObject jSONObject);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, Map<String, Object> map);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, Map<String, String> map, String str, String str2);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, JSONObject jSONObject, boolean z);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, r rVar, Context context, LiveItem liveItem, String str, String str2);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Object obj);

    void a(com.taobao.alilive.aliliveframework.frame.a aVar, pmt pmtVar);

    boolean a(com.taobao.alilive.aliliveframework.frame.a aVar, String str);

    boolean b(com.taobao.alilive.aliliveframework.frame.a aVar, LiveItem liveItem);
}
