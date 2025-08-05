package com.taobao.android.searchbaseframe.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SearchResult f15009a;
    public com.taobao.android.searchbaseframe.datasource.c b;
    public Map<String, String> c;

    static {
        kge.a(239881510);
    }

    public static c a(SearchResult searchResult, com.taobao.android.searchbaseframe.datasource.c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e260584b", new Object[]{searchResult, cVar, map});
        }
        c cVar2 = new c();
        cVar2.f15009a = searchResult;
        cVar2.b = cVar;
        cVar2.c = map;
        return cVar2;
    }
}
