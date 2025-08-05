package com.alibaba.android.ultron.event;

import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.bnv;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKIP_SIMPLE_ADJUST = "skipSimpleAdjust";

    static {
        kge.a(-247260581);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(a aVar, com.alibaba.android.ultron.vfw.instance.d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c74ca4", new Object[]{aVar, dVar, str, str2});
        } else {
            aVar.a(dVar, str, str2);
        }
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (!(this.e instanceof com.alibaba.android.ultron.vfw.instance.d)) {
        } else {
            UltronInstanceConfig y = ((com.alibaba.android.ultron.vfw.instance.d) this.e).y();
            Object d = eVar.d(SKIP_SIMPLE_ADJUST);
            if (y != null && y.p() && (d == null || !((Boolean) d).booleanValue())) {
                d(eVar);
            } else {
                e(eVar);
            }
        }
    }

    private void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        final IDMComponent d = eVar.d();
        if (d == null) {
            return;
        }
        Coordinator.postTask(new Coordinator.TaggedRunnable("ultron adjust process") { // from class: com.alibaba.android.ultron.event.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject fields = a.this.b().getFields();
                if (fields == null) {
                    fields = new JSONObject();
                }
                fields.getString("subType");
                JSONObject jSONObject = fields.getJSONObject("payload");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Object d2 = a.this.d();
                if (d2 instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) d2;
                    jSONObject2.putAll(jSONObject);
                    jSONObject = jSONObject2;
                }
                JSONArray jSONArray = fields.getJSONArray("dataMergeParams");
                final com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) a.this.e;
                com.alibaba.android.ultron.vfw.dataloader.d s = dVar.s();
                JSONObject jSONObject3 = s.d() != null ? s.d().c : null;
                com.alibaba.android.ultron.engine.utils.b.a(jSONObject, jSONObject3, jSONArray);
                dVar.a(d, jSONObject3);
                com.alibaba.android.ultron.engine.utils.h.a(new Runnable() { // from class: com.alibaba.android.ultron.event.a.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        JSONObject data = d.getData();
                        if (data != null) {
                            data.put(com.alibaba.android.ultron.vfw.viewholder.d.TAG_IS_ADJUST, (Object) true);
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(d);
                        dVar.a(arrayList);
                    }
                });
            }
        });
    }

    private void e(com.alibaba.android.ultron.event.base.e eVar) {
        final JSONObject jSONObject;
        ArrayList arrayList;
        final com.alibaba.android.ultron.vfw.instance.d dVar;
        com.alibaba.android.ultron.vfw.dataloader.d s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b76b7f", new Object[]{this, eVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            fields = new JSONObject();
        }
        String string = fields.getString("subType");
        if (string == null) {
            string = "";
        }
        final String str = string;
        JSONObject jSONObject2 = fields.getJSONObject("payload");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        Object d = d();
        if (d instanceof JSONObject) {
            JSONObject jSONObject3 = (JSONObject) d;
            jSONObject3.putAll(jSONObject2);
            jSONObject = jSONObject3;
        } else {
            jSONObject = jSONObject2;
        }
        final JSONArray jSONArray = fields.getJSONArray("dataMergeParams");
        Object[] objArr = (Object[]) eVar.d("extraParams");
        JSONObject jSONObject4 = null;
        if (objArr == null || objArr.length <= 1) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            int length = objArr.length;
            for (int i = 1; i < length; i++) {
                arrayList.add(objArr[i]);
            }
        }
        List list = (List) eVar.d("viewParams");
        final ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
        if (list == null) {
            list = new ArrayList();
        }
        final List list2 = list;
        JSONObject jSONObject5 = new JSONObject() { // from class: com.alibaba.android.ultron.event.AdjustStateSubscriber$2
            {
                put("type", (Object) str);
                put("eventData", (Object) jSONObject);
                put("extraParams", (Object) arrayList2);
                put("userInput", (Object) list2);
                put("dataMergeParams", (Object) jSONArray);
            }
        };
        if (this.e == null || (s = (dVar = (com.alibaba.android.ultron.vfw.instance.d) this.e).s()) == null) {
            return;
        }
        d.a aVar = new d.a();
        aVar.b = jSONObject5;
        aVar.c = s.d() != null ? s.d().c : null;
        if (s.d() != null) {
            jSONObject4 = s.d().d;
        }
        aVar.d = jSONObject4;
        com.alibaba.android.ultron.vfw.dataloader.d a2 = com.alibaba.android.ultron.vfw.dataloader.d.a("adjust", aVar, s);
        final String j = eVar.j();
        dVar.a(eVar.c(), a2, new com.alibaba.android.ultron.vfw.dataloader.f() { // from class: com.alibaba.android.ultron.event.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(com.alibaba.android.ultron.vfw.dataloader.h hVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5eca7a1", new Object[]{this, hVar});
                    return;
                }
                if (dVar.t() != null) {
                    dVar.t().a(hVar);
                }
                a.a(a.this, dVar, j, "success");
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.i
            public com.alibaba.android.ultron.vfw.dataloader.j a(com.alibaba.android.ultron.vfw.dataloader.j jVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.dataloader.j) ipChange2.ipc$dispatch("bead3816", new Object[]{this, jVar}) : dVar.t() != null ? dVar.t().a(jVar) : jVar;
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(com.alibaba.android.ultron.vfw.dataloader.h hVar, UltronError ultronError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b531dfc4", new Object[]{this, hVar, ultronError});
                    return;
                }
                if (dVar.t() != null) {
                    dVar.t().a(hVar, ultronError);
                }
                a.a(a.this, dVar, j, "fail");
            }
        });
    }

    private void a(com.alibaba.android.ultron.vfw.instance.d dVar, String str, String str2) {
        com.taobao.android.ultron.datamodel.imp.b a2;
        Map<String, DMComponent> u;
        DMComponent dMComponent;
        Map<String, List<com.taobao.android.ultron.common.model.b>> eventMap;
        List<com.taobao.android.ultron.common.model.b> list;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67374321", new Object[]{this, dVar, str, str2});
            return;
        }
        bnv k = dVar.k();
        if (k == null || (a2 = k.a()) == null || (u = a2.u()) == null || this.g == null || (dMComponent = u.get(this.g.getKey())) == null || (eventMap = dMComponent.getEventMap()) == null || (list = eventMap.get(str)) == null) {
            return;
        }
        for (com.taobao.android.ultron.common.model.b bVar : list) {
            if (bVar != null && bVar.getType().equals("adjustState")) {
                JSONObject fields = bVar.getFields();
                if (fields == null || (jSONObject = fields.getJSONObject("next")) == null) {
                    return;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(str2);
                if (jSONArray != null) {
                    a(jSONArray);
                }
            }
        }
    }
}
