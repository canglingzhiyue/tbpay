package com.taobao.search.sf.datasource;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.f;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.mmd.util.i;
import java.util.Map;
import tb.imn;
import tb.ioy;
import tb.itt;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class d extends f<com.taobao.search.refactor.e, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a c;

    static {
        kge.a(-1044984820);
    }

    public d(imn imnVar, ioy ioyVar) {
        super(imnVar, ioyVar);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141e10da", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.b, tb.isk
    public com.taobao.android.searchbaseframe.net.a b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.net.a) ipChange.ipc$dispatch("ce8485e8", new Object[]{this, map});
        }
        String a2 = i.a("66_" + noa.SERVER_VERSION_VALUE + map.get("q") + map.get("page"));
        String str = ("true".equals(map.get(noa.KEY_GOOD_PRICE)) ? "https://cdn-hjb-search.alibaba.com/watchcat-z-1111/" : "https://cdn-watchcat.s.taobao.com/watchcat-z-66/") + a2 + ".json";
        k.d("[requestFallback]", "请求兜底url:%s", str);
        return new com.taobao.android.searchbaseframe.net.a(str);
    }

    @Override // com.taobao.android.meta.data.f
    public itt.a a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itt.a) ipChange.ipc$dispatch("bea4bbe3", new Object[]{this, map});
        }
        a aVar = this.c;
        if (aVar == null) {
            return new itt.a("mtop.taobao.wsearch.appsearch", "1.0", "wsearch");
        }
        return new itt.a(aVar.f19438a, this.c.b, this.c.c);
    }
}
