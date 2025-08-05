package com.alibaba.ut.abtest.track;

import java.util.HashMap;
import java.util.Map;
import tb.ceq;

/* loaded from: classes.dex */
public interface b {
    TrackId a(String str, int i, String str2, String str3, String str4, Map<String, String> map, String str5);

    String a();

    String a(TrackId trackId, int i, Map<String, String> map);

    void a(com.alibaba.ut.abtest.internal.bucketing.model.a aVar);

    void a(com.alibaba.ut.abtest.internal.bucketing.model.a aVar, Object obj);

    void a(com.alibaba.ut.abtest.internal.bucketing.model.a aVar, Map<String, Object> map, ceq ceqVar);

    void a(com.alibaba.ut.abtest.internal.bucketing.model.b bVar);

    boolean a(String str, Object obj);

    boolean a(String str, Map<String, Object> map, Object obj);

    String b();

    HashMap<String, String> b(String str, int i, String str2, String str3, String str4, Map<String, String> map, String str5);

    void b(com.alibaba.ut.abtest.internal.bucketing.model.a aVar, Object obj);
}
