package com.taobao.android.ultron.datamodel.imp;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jnq;
import tb.jnu;
import tb.jqg;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends jnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15778a = "ParseDeltaModule";
    private com.taobao.android.ultron.datamodel.imp.delta.c b = new com.taobao.android.ultron.datamodel.imp.delta.c();

    static {
        kge.a(-902499220);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean b(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1584e83", new Object[]{this, bVar, jSONObject})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        List<IDMComponent> c = c(bVar, jSONObject);
        if (c == null) {
            jqg.a(bVar.h(), "ParseDeltaModuleError", "新奥创差量协议解析为空");
            return false;
        }
        bVar.b(c);
        return true;
    }

    private List<IDMComponent> c(final b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eda69dc7", new Object[]{this, bVar, jSONObject});
        }
        if (jSONObject != null && bVar != null) {
            if (bVar.I()) {
                h.a(bVar, jSONObject);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            JSONObject jSONObject4 = jSONObject.getJSONObject("linkage");
            JSONObject jSONObject5 = jSONObject.getJSONObject("global");
            JSONObject jSONObject6 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                d(bVar, jSONObject2);
            }
            JSONObject jSONObject7 = jSONObject3 != null ? jSONObject3.getJSONObject("structure") : null;
            bVar.H().clear();
            if (jSONObject3.containsKey("delta") && jSONObject3.get("delta") != null) {
                bVar.j(jSONObject2);
                bVar.e(jSONObject7);
                bVar.c(jSONObject3);
                bVar.f(jSONObject5);
                bVar.n(jSONObject4);
                bVar.q(jSONObject6);
                a(bVar, jSONObject);
                if (jSONObject6 != null) {
                    bVar.e(jSONObject6.getString("protocolVersion"));
                }
                List<IDMComponent> a2 = a(bVar);
                if (a2 != null) {
                    com.taobao.android.ultron.datamodel.imp.delta.i.a(a2, new jnq<IDMComponent>() { // from class: com.taobao.android.ultron.datamodel.imp.e.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.jnq
                        public void a(IDMComponent iDMComponent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
                            } else if (!(iDMComponent instanceof DMComponent)) {
                            } else {
                                ((DMComponent) iDMComponent).setDeltaOpType(bVar.i(iDMComponent.getKey()));
                            }
                        }
                    });
                }
                return a2;
            }
        }
        return null;
    }

    private List<IDMComponent> a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ede47755", new Object[]{this, bVar});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = bVar.n().getJSONArray("delta").iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                String string = jSONObject.getString("opType");
                String string2 = jSONObject.getString("target");
                com.taobao.android.ultron.datamodel.imp.delta.c cVar = this.b;
                if (cVar != null) {
                    cVar.a(string, bVar, jSONObject, arrayList);
                }
                if (string2 != null && string != null) {
                    bVar.d(string2, string);
                }
            }
        }
        bVar.H().addAll(arrayList);
        return bVar.b();
    }

    private void d(b bVar, JSONObject jSONObject) {
        c t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724afa81", new Object[]{this, bVar, jSONObject});
        } else if (bVar == null || (t = bVar.t()) == null) {
        } else {
            t.b().a(jSONObject);
        }
    }
}
