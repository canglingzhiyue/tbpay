package com.taobao.android.meta.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.imn;
import tb.ioy;
import tb.itt;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class f<C extends a, M extends MetaResult<C>> extends com.taobao.android.searchbaseframe.datasource.impl.b<M> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.android.meta.logic.a<? extends b<C, M>, C, M> c;

    static {
        kge.a(-609230537);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -1320113184) {
            super.a((f) ((BaseSearchResult) objArr[0]), (JSONObject) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract itt.a a(Map<String, String> map);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(imn core, ioy ioyVar) {
        super(core, ioyVar);
        q.c(core, "core");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.b
    public /* bridge */ /* synthetic */ void a(BaseSearchResult baseSearchResult, JSONObject jSONObject) {
        a((f<C, M>) ((MetaResult) baseSearchResult), jSONObject);
    }

    public final void a(com.taobao.android.meta.logic.a<? extends b<C, M>, C, M> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5712b80", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void a(M result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df02427", new Object[]{this, result, jSONObject});
            return;
        }
        q.c(result, "result");
        if (this.c != null) {
            b((f<C, M>) result, jSONObject);
        } else {
            super.a((f<C, M>) result, jSONObject);
        }
    }

    public void b(M result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65190668", new Object[]{this, result, jSONObject});
            return;
        }
        q.c(result, "result");
        com.taobao.android.meta.logic.a<? extends b<C, M>, C, M> aVar = this.c;
        if (aVar == null) {
            q.a();
        }
        aVar.a((com.taobao.android.meta.logic.a<? extends b<C, M>, C, M>) result, jSONObject, this.f29279a);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.b
    public itt.a a(Map<String, String> map, a.C0571a c0571a) {
        a a2;
        itt.a r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itt.a) ipChange.ipc$dispatch("df2e9b1e", new Object[]{this, map, c0571a});
        }
        if (!(c0571a instanceof e)) {
            c0571a = null;
        }
        e eVar = (e) c0571a;
        return (eVar == null || (a2 = eVar.a()) == null || (r = a2.r()) == null) ? a(map) : r;
    }
}
