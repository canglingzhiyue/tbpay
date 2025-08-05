package com.alibaba.android.ultron.event.base;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.ultron.event.q;
import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.option.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bga;
import tb.bjt;
import tb.bna;
import tb.bok;
import tb.bol;
import tb.jph;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class f implements bok, bol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIZ_PARAMS = "bizParams";
    public static final String KEY_DXEVENT = "DXEvent";
    public static final String KEY_EXTRA_PARAMS = "extraParams";
    public static final String KEY_TARGET_VIEW = "targetView";
    public static final String KEY_TRIGGER_VIEW = "triggerView";
    public static final String KEY_TRIGGER_VIEW_HOLDER = "triggerViewHolder";
    public static final String KEY_VIEW_PARAMS = "viewParams";
    public static final String TAG_CLICK_VIEW = "ultron_dx_click_tag";

    /* renamed from: a  reason: collision with root package name */
    public Context f2587a;
    public com.alibaba.android.ultron.vfw.instance.b b;
    public e c;
    private d f;
    public boolean d = false;
    private List<c> g = new ArrayList();
    public Map<String, List<d>> e = new HashMap();

    static {
        kge.a(1331909491);
        kge.a(-1834858427);
        kge.a(-1969390164);
    }

    public f(com.alibaba.android.ultron.vfw.instance.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("instance can not be null");
        }
        this.b = bVar;
        this.f2587a = this.b.a();
    }

    private List<d> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        List<d> list = this.e.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.e.put(str, arrayList);
        return arrayList;
    }

    public void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e1ac1a", new Object[]{this, str, dVar});
        } else if (str == null || dVar == null) {
        } else {
            List<d> a2 = a(str);
            if (a2.contains(dVar)) {
                return;
            }
            a2.add(dVar);
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d8c0a4", new Object[]{this, dVar});
        } else {
            this.f = dVar;
        }
    }

    public void b(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b742aff9", new Object[]{this, str, dVar});
        } else if (str == null || dVar == null) {
        } else {
            List<d> a2 = a(str);
            a2.clear();
            a2.add(dVar);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f2587a = context;
        }
    }

    public void a(Map<String, ? extends d> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, ? extends d> entry : map.entrySet()) {
                if (entry != null) {
                    a(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("725af6c3", new Object[]{this}) : new e().a(this.f2587a).a(this.b);
    }

    public com.taobao.android.ultron.common.model.b a(com.taobao.android.ultron.common.model.b bVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("392512a2", new Object[]{this, bVar, jSONObject, str});
        }
        if (bVar == null || bVar.getFields() == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) jph.a(jSONObject, JSONObject.parseObject(bVar.getFields().toString()), str);
        String type = bVar.getType();
        List<IDMComponent> components = bVar.getComponents();
        if (bVar instanceof DMEvent) {
            i = ((DMEvent) bVar).getOption();
        }
        return new DMEvent(type, jSONObject2, components, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:79|(3:121|122|(1:124)(4:125|96|97|(5:99|(1:101)(1:105)|102|103|104)(1:106)))|81|(1:83)(1:120)|84|(2:86|87)(1:119)|88|89|90|91|92|93|94|95|96|97|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x034f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0351, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0352, code lost:
        r31 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0355, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0356, code lost:
        r31 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    @Override // tb.bok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r35, java.lang.String r36, java.lang.Object r37, java.lang.Object r38, java.lang.Object r39, java.util.ArrayList r40, java.util.Map r41) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.event.base.f.a(android.view.View, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.util.ArrayList, java.util.Map):void");
    }

    public void a(List<com.taobao.android.ultron.common.model.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            com.taobao.android.ultron.common.model.b bVar = list.get(i);
            if (bVar != null) {
                String type = bVar.getType();
                if (!TextUtils.isEmpty(type)) {
                    e a2 = a().a(type);
                    a2.a(bVar);
                    a(a2);
                }
            }
        }
    }

    @Override // tb.bol
    public void a(View view, String str, Object obj, Object obj2, Object obj3, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595ecc62", new Object[]{this, view, str, obj, obj2, obj3, arrayList});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(bna.KEY_INDEX_MODE, false);
        a(view, str, obj, obj2, obj3, arrayList, hashMap);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d84c45", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.g.add(cVar);
        }
    }

    public void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4fd9e4", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.g.remove(cVar);
        }
    }

    private void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c85041", new Object[]{this, eVar});
            return;
        }
        for (c cVar : this.g) {
            try {
                cVar.a(eVar);
            } catch (Throwable th) {
                bga.a.a(this.b.g(), "UltronEventHandler.callPreEventFire", th);
            }
        }
    }

    private void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        for (c cVar : this.g) {
            try {
                cVar.b(eVar);
            } catch (Throwable th) {
                bga.a.a(this.b.g(), "UltronEventHandler.callPostEventFire", th);
            }
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        String b = eVar.b();
        if (b == null || this.d) {
            return;
        }
        eVar.a(com.alibaba.android.ultron.event.a.SKIP_SIMPLE_ADJUST, (Object) true);
        List<d> list = this.e.get(b);
        if (list == null) {
            d dVar = this.f;
            if (dVar != null) {
                dVar.b(eVar);
                return;
            } else {
                jqg.a(this.b.g(), "UltronEventHandler", "事件未找到", b);
                return;
            }
        }
        c(eVar);
        e eVar2 = eVar;
        for (d dVar2 : list) {
            if (dVar2 != null) {
                if (com.alibaba.android.ultron.vfw.option.a.a(b(), a.C0101a.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                    eVar2 = e(eVar);
                }
                dVar2.b(eVar2);
            }
        }
        d(eVar2);
    }

    private e e(e eVar) {
        com.alibaba.android.ultron.vfw.dataloader.d s;
        d.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("81ded2da", new Object[]{this, eVar});
        }
        if (!(this.b instanceof com.alibaba.android.ultron.vfw.instance.d)) {
            return eVar;
        }
        Object i = eVar.i();
        if (!(i instanceof DMEvent) || !com.alibaba.android.ultron.vfw.option.b.a(1, ((DMEvent) i).getOption()) || (s = ((com.alibaba.android.ultron.vfw.instance.d) this.b).s()) == null || (d = s.d()) == null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.a(eVar);
        eVar2.b("storeState", d.c);
        bjt bjtVar = new bjt();
        JSONObject fields = ((DMEvent) eVar2.i()).getFields();
        Object remove = fields.remove("next");
        bjtVar.a(fields, eVar2.g());
        if (remove != null) {
            fields.put("next", remove);
        }
        return eVar2;
    }

    public void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
        } else {
            this.c = eVar;
        }
    }

    public void a(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecd4f5", new Object[]{this, list, obj});
            return;
        }
        for (Map.Entry<String, List<d>> entry : this.e.entrySet()) {
            List<d> value = entry.getValue();
            if (value != null) {
                for (d dVar : value) {
                    if (dVar instanceof q) {
                        ((q) dVar).a(list, obj);
                    }
                }
            }
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b.g();
    }
}
