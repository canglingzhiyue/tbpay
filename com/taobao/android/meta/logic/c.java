package com.taobao.android.meta.logic;

import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.data.e;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.Map;
import tb.iru;

/* loaded from: classes6.dex */
public interface c<D extends com.taobao.android.meta.data.b<C, R>, C extends com.taobao.android.meta.data.a, R extends MetaResult<C>> extends b<C, R> {
    iru<D> a(int i, TabBean tabBean, D d);

    void a(D d, C c, int i);

    void a(D d, C c, C c2, e<C> eVar);

    void a(D d, C c, boolean z, Map<String, String> map);

    void a(D d, C c, boolean z, boolean z2, e<C> eVar);

    void a(D d, boolean z);

    boolean a(int i, D d);

    void b(D d, C c, C c2, e<C> eVar);

    void b(D d, boolean z);

    void c(D d);

    void c(D d, g gVar);
}
