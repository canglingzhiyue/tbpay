package com.taobao.android.order.bundle.search.network;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public interface a {
    void a(String str, String str2, Map<String, String> map);

    void a(Map<String, String> map);

    void a(MtopResponse mtopResponse, Object obj, Map<String, String> map);

    void a(MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj, Map<String, String> map);

    void b(MtopResponse mtopResponse, Object obj, Map<String, String> map);
}
