package com.alibaba.android.icart.core.data.request;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bcb;
import tb.bct;
import tb.bcu;
import tb.bdx;
import tb.bei;
import tb.beo;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-770017600);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // com.alibaba.android.icart.core.data.request.b
    public String a(final RequestConfig requestConfig, final jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("880760cb", new Object[]{this, requestConfig, jnvVar});
        }
        bcu bcuVar = new bcu(this.f2310a, this.b, c());
        bmz b = requestConfig.b();
        IDMComponent a2 = requestConfig.a();
        if (b == null) {
            return null;
        }
        final String b2 = b.b();
        if (a2 != null) {
            ((DMComponent) a2).setTriggerEvent(b.f() + "." + b2);
        }
        requestConfig.f2303a = true;
        jny w = this.f2310a.w();
        com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) w;
        JSONObject w2 = bVar.w();
        ArrayList arrayList = new ArrayList();
        a(b, arrayList);
        this.c.a(arrayList);
        Map<String, String> f = bcuVar.d().f();
        JSONObject a3 = a(f);
        a(a3, requestConfig);
        f.put("exParams", a3.toJSONString());
        bcuVar.a(a2);
        w.a(this.c);
        b(b2);
        bcuVar.b(new bct(jnvVar) { // from class: com.alibaba.android.icart.core.data.request.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

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
                if (mtopResponse == null) {
                    return;
                }
                bdx.a("SendStructureRequest", "netRequest", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "");
                UnifyLog.a(f.this.f2310a.n().s(), "SendStructureRequest", "updateStructureRequest", "error");
                if (beo.a(mtopResponse) && "cartSelect".equals(b2)) {
                    return;
                }
                com.alibaba.android.icart.core.widget.d.a(f.this.b, mtopResponse.getRetMsg());
            }

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
                bei.a(f.this.d);
                f.this.f2310a.h();
                f.this.a(requestConfig);
            }
        }, w, requestConfig.c());
        bVar.h(w2);
        return bcuVar.b();
    }

    private com.alibaba.android.ultron.trade.data.request.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.trade.data.request.c) ipChange.ipc$dispatch("bea32c58", new Object[]{this}) : com.alibaba.android.icart.core.data.config.a.c(this.d);
    }

    private void a(bmz bmzVar, List<String> list) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50adedda", new Object[]{this, bmzVar, list});
        } else if ((bmzVar.e() instanceof com.taobao.android.ultron.common.model.b) && (fields = ((com.taobao.android.ultron.common.model.b) bmzVar.e()).getFields()) != null) {
            String string = fields.getString("fromBundleId");
            String string2 = fields.getString("toBundleId");
            String string3 = fields.getString("from");
            if ("addItemToGroup".equals(fields.getString("type")) && !TextUtils.isEmpty(string3)) {
                a(string3, list);
            }
            if (!TextUtils.isEmpty(string)) {
                for (IDMComponent iDMComponent : bei.i(bei.a(this.f2310a.w(), string))) {
                    list.add(iDMComponent.getKey());
                }
            }
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            IDMComponent b = bei.b(this.f2310a.w(), string2);
            if (b != null) {
                list.add(b.getKey());
                return;
            }
            ArrayList<IDMComponent> arrayList = new ArrayList();
            bei.a(arrayList, bei.a(this.f2310a.w(), string2));
            for (IDMComponent iDMComponent2 : arrayList) {
                list.add(iDMComponent2.getKey());
            }
        }
    }

    private void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (str.contains(",")) {
            String[] split = str.split(",");
            if (split == null || split.length <= 0) {
                return;
            }
            for (String str2 : split) {
                IDMComponent c = bei.c(this.f2310a.w(), str2);
                if (c != null) {
                    list.add(c.getKey());
                }
            }
        } else {
            IDMComponent c2 = bei.c(this.f2310a.w(), str);
            if (c2 == null) {
                return;
            }
            list.add(c2.getKey());
        }
    }
}
