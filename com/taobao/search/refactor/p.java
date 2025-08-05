package com.taobao.search.refactor;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.logic.c;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.Map;
import tb.imn;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class p<D extends com.taobao.android.meta.data.b<C, R>, C extends com.taobao.android.meta.data.a, R extends MetaResult<C>> implements c<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-481141095);
        kge.a(1378069012);
    }

    @Override // com.taobao.android.meta.logic.b
    public void a(R result, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de0538d", new Object[]{this, result, jSONObject, imnVar});
        } else {
            kotlin.jvm.internal.q.c(result, "result");
        }
    }

    public void a(D scopeDataSource, C combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe2d4bf", new Object[]{this, scopeDataSource, combo});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D scopeDataSource, C combo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0783624", new Object[]{this, scopeDataSource, combo, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D scopeDataSource, C src, C incoming, com.taobao.android.meta.data.e<C> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ed9e33", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(src, "src");
        kotlin.jvm.internal.q.c(incoming, "incoming");
        kotlin.jvm.internal.q.c(config, "config");
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D scopeDataSource, C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da1cf0", new Object[]{this, scopeDataSource, c, new Boolean(z), map});
        } else {
            kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D scopeDataSource, C c, boolean z, boolean z2, com.taobao.android.meta.data.e<C> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9c0f7", new Object[]{this, scopeDataSource, c, new Boolean(z), new Boolean(z2), config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(config, "config");
    }

    public void a(D scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ff73ee", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, initDataSource, new Boolean(z)});
        } else {
            kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        }
    }

    public void a(Map<String, String> map, C combo, D scopeDataSource, com.taobao.android.meta.data.e<C> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23333fec", new Object[]{this, map, combo, scopeDataSource, eVar});
            return;
        }
        kotlin.jvm.internal.q.c(map, "map");
        kotlin.jvm.internal.q.c(combo, "combo");
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
    }

    @Override // com.taobao.android.meta.logic.c
    public boolean a(int i, D initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98ab8bfa", new Object[]{this, new Integer(i), initDataSource})).booleanValue();
        }
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        return false;
    }

    public boolean a(D scopeDataSource, C combo, ListStyle newStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0a1b7b2", new Object[]{this, scopeDataSource, combo, newStyle})).booleanValue();
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        kotlin.jvm.internal.q.c(newStyle, "newStyle");
        return false;
    }

    @Override // com.taobao.android.meta.logic.c
    public void b(D scopeDataSource, C src, C incoming, com.taobao.android.meta.data.e<C> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc2a5b4", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(src, "src");
        kotlin.jvm.internal.q.c(incoming, "incoming");
        kotlin.jvm.internal.q.c(config, "config");
    }

    @Override // com.taobao.android.meta.logic.c
    public void b(D scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f97710", new Object[]{this, scopeDataSource, new Boolean(z)});
        } else {
            kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public void c(D scopeDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a797c5", new Object[]{this, scopeDataSource});
        } else {
            kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public void c(D scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe30ac", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
    }
}
