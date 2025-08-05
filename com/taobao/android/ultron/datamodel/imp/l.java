package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.ErrorConstants;
import java.util.List;
import tb.bga;
import tb.jos;
import tb.jou;
import tb.jow;
import tb.jpr;
import tb.jpu;
import tb.jqf;
import tb.jqg;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1641665461);
    }

    public static a a(b bVar, JSONObject jSONObject, jou jouVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4fd59181", new Object[]{bVar, jSONObject, jouVar});
        }
        String h = (bVar == null || bVar.h() == null) ? "Ultron" : bVar.h();
        try {
            if (bVar == null || jSONObject == null) {
                return new a(false, null);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
            if (jSONObject2 == null) {
                return new a(false, null);
            }
            if (!(jSONObject2.containsKey("delta") && jSONObject2.get("delta") != null)) {
                return new a(false, null);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
            z = jqf.a(jSONObject3);
            try {
                if (!z) {
                    return new a(false, null);
                }
                JSONObject jSONObject4 = jSONObject.getJSONObject("data");
                if (jSONObject4 == null) {
                    jqg.a(h, "UltronProtocolDeltaMerger", com.taobao.vessel.utils.c.LOAD_DATA_NULL);
                    return new a(true, null);
                }
                JSONObject jSONObject5 = jSONObject.getJSONObject("linkage");
                JSONObject jSONObject6 = jSONObject.getJSONObject("global");
                JSONObject jSONObject7 = jSONObject2.getJSONObject("structure");
                bVar.H().clear();
                jouVar.d(bVar, jSONObject4);
                JSONObject n = bVar.n(jSONObject5);
                JSONObject q = bVar.q(jSONObject3);
                JSONObject e = bVar.e(jSONObject7);
                jow.a(bVar, jSONObject);
                JSONObject n2 = bVar.n();
                if (n2 == null) {
                    jqg.b("UltronProtocolDeltaMerger", "hierarchy is null");
                    return new a(true, null);
                }
                n2.remove("delta");
                bVar.v().clear();
                bVar.k(jSONObject4);
                n2.put("structure", (Object) e);
                JSONObject a2 = jqf.b(q) ? jos.a(jSONObject, jSONObject6, bVar.c()) : bVar.f(jSONObject6);
                jouVar.b(bVar, jSONObject4);
                bVar.b(n2);
                bVar.o(a2);
                if (n == null) {
                    n = new JSONObject();
                }
                bVar.m(n);
                bVar.p(q);
                if (q != null) {
                    bVar.e(q.getString("protocolVersion"));
                }
                jouVar.c(bVar, jSONObject);
                bVar.l(n.getJSONObject("common"));
                String G = bVar.G();
                if (TextUtils.isEmpty(G)) {
                    G = n2.getString("root");
                }
                if (TextUtils.isEmpty(G)) {
                    bga.a.a(h, "FullResponseParse", ErrorConstants.PROTOCOL_ROOT_KEY_EMPTY.errorCode(), ErrorConstants.PROTOCOL_ROOT_KEY_EMPTY.errorMessage());
                    return new a(true, null);
                }
                List<IDMComponent> a3 = jouVar.a(bVar, G);
                jouVar.a(bVar.v().get(G));
                return new a(true, a3);
            } catch (Exception e2) {
                e = e2;
                jpr.a(jpu.a(h).c("UltronProtocolDeltaMerger#merge").b(e.getMessage()));
                return new a(z, null);
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f15786a;
        private final List<IDMComponent> b;

        static {
            kge.a(1876656822);
        }

        public a(boolean z, List<IDMComponent> list) {
            this.f15786a = z;
            this.b = list;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f15786a;
        }

        public List<IDMComponent> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
        }
    }
}
