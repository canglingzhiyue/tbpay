package com.alibaba.android.icart.core.data.request;

import com.alibaba.android.icart.core.data.config.CartRequestType;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bcb;
import tb.bcq;
import tb.bcs;
import tb.bct;
import tb.bei;
import tb.bek;
import tb.bem;
import tb.bex;
import tb.jnv;
import tb.jny;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2138776905);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // com.alibaba.android.icart.core.data.request.e, com.alibaba.android.icart.core.data.request.b
    public String a(final RequestConfig requestConfig, final jnv jnvVar) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880760cb", new Object[]{this, requestConfig, jnvVar});
        }
        bex.c(this.d, "Page_ShoppingCart_Query", new String[0]);
        requestConfig.f2303a = jqi.a("iCart", "disableDeleteQueryParamForNextQuery", false);
        final HashMap<String, String> c = c(requestConfig);
        bcq dr_ = dr_();
        jny w = this.f2310a.w();
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) this.f2310a.w();
        if (!requestConfig.l()) {
            arrayList = null;
        } else if (bem.c(this.f2310a)) {
            arrayList = bek.a(null, (com.taobao.android.ultron.datamodel.imp.b) w, bei.c(this.f2310a));
        } else {
            arrayList = bek.a(null, (com.taobao.android.ultron.datamodel.imp.b) w, bei.f(this.f2310a.w()));
        }
        this.c.a(arrayList);
        w.a(this.c);
        final String a2 = bVar.t().a(bVar, (IDMComponent) null);
        dr_.a(new HashMap<String, String>() { // from class: com.alibaba.android.icart.core.data.request.SendQueryNextPageRequest$1
            {
                d.this = this;
                put("params", a2);
                put("feature", "{\"gzip\":\"true\"}");
                HashMap hashMap = c;
                if (hashMap != null) {
                    putAll(hashMap);
                }
            }
        });
        this.f2310a.o().g(true);
        this.f2310a.o().a((Object) bei.h(w));
        com.taobao.android.ultron.datamodel.imp.b bVar2 = (com.taobao.android.ultron.datamodel.imp.b) w;
        JSONObject w2 = bVar2.w();
        dr_.b(new bct(jnvVar) { // from class: com.alibaba.android.icart.core.data.request.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bct, tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                jnv jnvVar2 = jnvVar;
                if (jnvVar2 != null) {
                    jnvVar2.a(i, mtopResponse, obj, jnyVar, (Map<String, ? extends Object>) map);
                }
                if (d.this.b() && !jnyVar.e()) {
                    d.this.d.b(false);
                }
                if (d.this.f2310a.j()) {
                    d.this.f2310a.a(true);
                }
                d.this.a(requestConfig);
            }

            @Override // tb.bct, tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                jnv jnvVar2 = jnvVar;
                if (jnvVar2 != null) {
                    jnvVar2.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
                }
                d.this.f2310a.n().l().a(1, mtopResponse, true);
            }
        }, w, requestConfig.c());
        bVar2.h(w2);
        return dr_.b();
    }

    private bcq dr_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bcq) ipChange.ipc$dispatch("709b0f9e", new Object[]{this});
        }
        bcs bcsVar = new bcs(this.f2310a, this.f2310a.n().m(), d(), CartRequestType.queryNextPage);
        bcsVar.d().a(true);
        return bcsVar;
    }
}
