package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.engine.model.Block;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.alibaba.android.ultron.engine.protocol.ComponentView;
import com.alibaba.android.ultron.engine.template.b;
import com.alibaba.android.ultron.engine.utils.g;
import com.alibaba.android.ultron.engine.utils.h;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f25944a;
    public bjq b;
    public bjs c;
    public bjh d;
    public JSONObject e;
    public JSONObject f;
    public String g;
    public UltronInstanceConfig j;
    public bd k;
    private boolean n;
    public Map<String, bjh> h = new HashMap();
    public Map<String, bjh> i = new HashMap();
    public Map<String, bjg> l = new HashMap();
    public int m = -1;

    static {
        kge.a(157311227);
    }

    public static /* synthetic */ boolean a(bjs bjsVar, Map.Entry entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f718ae", new Object[]{bjsVar, entry})).booleanValue() : bjsVar.b(entry);
    }

    public bjh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bjh) ipChange.ipc$dispatch("f02cbfe", new Object[]{this}) : this.d;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.e;
    }

    public Map<String, bjg> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.l;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c != null && this.l.isEmpty();
    }

    public Map<String, bjh> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.i;
    }

    public bjs(Context context, bjq bjqVar, bjs bjsVar, String str) {
        this.n = false;
        this.b = bjqVar;
        this.f25944a = context;
        this.c = bjsVar;
        this.g = str;
        this.n = g.a();
    }

    public bjs(Context context, bjq bjqVar, bjs bjsVar, String str, UltronInstanceConfig ultronInstanceConfig, bd bdVar) {
        this.n = false;
        this.b = bjqVar;
        this.f25944a = context;
        this.c = bjsVar;
        this.g = str;
        this.j = ultronInstanceConfig;
        this.k = bdVar;
        this.n = g.a();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public b b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e03199de", new Object[]{this, jSONObject});
        }
        this.e = jSONObject;
        bjh a2 = this.b.a();
        if (this.n) {
            this.d = b(a2, jSONObject);
        } else {
            this.d = a(a2, jSONObject);
        }
        bjh bjhVar = this.d;
        if (bjhVar == null) {
            return b.a(100002, "root component is null");
        }
        a(bjhVar);
        a(this.d, a2.k(), jSONObject);
        return b.a(null);
    }

    private void a(bjh bjhVar, List<bjh> list, JSONObject jSONObject) {
        bjh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cbf967", new Object[]{this, bjhVar, list, jSONObject});
        } else if (list != null && !list.isEmpty()) {
            boolean b = bjhVar.b();
            boolean c = bjhVar.c();
            String f = bjhVar.f();
            for (bjh bjhVar2 : list) {
                if (b && "MUTEX".equals(f) && bjhVar.k().size() > 0) {
                    break;
                }
                if (this.n) {
                    a2 = b(bjhVar2, jSONObject);
                } else {
                    a2 = a(bjhVar2, jSONObject);
                }
                if (a2 != null) {
                    bjhVar.a(a2);
                    a2.b(bjhVar);
                    a(a2);
                    if (a2.e()) {
                        bjhVar.k().remove(a2);
                        a2.b(null);
                    } else {
                        a(a2, bjhVar2.k(), jSONObject);
                    }
                }
            }
            if (!c && !b) {
                return;
            }
            if (bjhVar.k() != null && !bjhVar.k().isEmpty()) {
                return;
            }
            if (bjhVar.j() != null) {
                bjhVar.j().k().remove(bjhVar);
            }
            this.i.remove(bjhVar.g());
            if (!this.l.containsKey(bjhVar.g()) || !"insert".equals(this.l.get(bjhVar.g()).f25938a)) {
                return;
            }
            this.l.remove(bjhVar.g());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.bjh a(tb.bjh r20, com.alibaba.fastjson.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bjs.a(tb.bjh, com.alibaba.fastjson.JSONObject):tb.bjh");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.bjh b(tb.bjh r22, com.alibaba.fastjson.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bjs.b(tb.bjh, com.alibaba.fastjson.JSONObject):tb.bjh");
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSON.parse(JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect));
        }
    }

    private void a(bjh bjhVar, bjh bjhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa0ff08", new Object[]{this, bjhVar, bjhVar2});
            return;
        }
        this.h.put(bjhVar.g(), bjhVar);
        this.i.put(bjhVar2.g(), bjhVar2);
    }

    private void a(JSONObject jSONObject, ComponentView componentView) {
        DXTemplateItem a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343f25f9", new Object[]{this, jSONObject, componentView});
        } else if (jSONObject == null || jSONObject.isEmpty() || componentView == null || jSONObject.getBooleanValue("isPreRender") || (a2 = a(componentView)) == null || a2.b <= 0) {
        } else {
            jSONObject.put("isPreRender", (Object) true);
            this.k.a(this.f25944a, a2, jSONObject, -1, (DXRenderOptions) null);
        }
    }

    public void a(IDMComponent iDMComponent, JSONObject jSONObject) {
        bjh bjhVar;
        bjh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1a8084", new Object[]{this, iDMComponent, jSONObject});
        } else if (iDMComponent == null || (bjhVar = this.h.get(iDMComponent.getKey())) == null) {
        } else {
            if (this.n) {
                a2 = b(bjhVar, jSONObject);
            } else {
                a2 = a(bjhVar, jSONObject);
            }
            JSONObject data = iDMComponent.getData();
            bji h = a2.h();
            data.put("fields", (Object) h.d);
            data.put("events", (Object) bjk.a(h));
            iDMComponent.writeBackDataAndReloadEvent(data, true);
        }
    }

    private DXTemplateItem a(ComponentView componentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("e4f5cd86", new Object[]{this, componentView});
        }
        DXTemplateItem dXTemplateItem = null;
        if (componentView == null) {
            return null;
        }
        if (!StringUtils.isEmpty(componentView.containerType) && componentView.containerType.startsWith("dinamic")) {
            dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = componentView.name;
            try {
                dXTemplateItem.b = Long.valueOf(componentView.version).longValue();
            } catch (Throwable unused) {
                dXTemplateItem.b = -1L;
            }
            dXTemplateItem.c = componentView.url;
        }
        return dXTemplateItem;
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (obj != null) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!str.contains("${")) {
                    return str.equalsIgnoreCase("null");
                }
            } else if (obj instanceof JSONObject) {
                return ((JSONObject) obj).isEmpty();
            } else {
                if (!(obj instanceof JSONArray) || !((JSONArray) obj).isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void a(bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d5ddb8", new Object[]{this, bjhVar});
            return;
        }
        bjs bjsVar = this.c;
        if (bjsVar == null) {
            return;
        }
        bjh bjhVar2 = bjsVar.e().get(bjhVar.g());
        if (bjhVar.e()) {
            if (bjhVar2 == null || bjhVar2.e()) {
                return;
            }
            this.l.put(bjhVar.g(), bjg.a(bjhVar));
        } else if (bjhVar2 == null) {
            this.l.put(bjhVar.g(), bjg.b(bjhVar));
        } else if (!c(bjhVar2, bjhVar)) {
            this.l.put(bjhVar.g(), bjg.c(bjhVar2));
        } else if (b(bjhVar2, bjhVar)) {
        } else {
            this.l.put(bjhVar.g(), bjg.d(bjhVar2));
        }
    }

    private boolean b(bjh bjhVar, bjh bjhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc39f48d", new Object[]{this, bjhVar, bjhVar2})).booleanValue();
        }
        if (bjhVar != null && bjhVar2 != null) {
            return a(bjhVar.h().e, bjhVar2.h().e);
        }
        return false;
    }

    private boolean c(bjh bjhVar, bjh bjhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8d2ea0e", new Object[]{this, bjhVar, bjhVar2})).booleanValue();
        }
        if (bjhVar != null && bjhVar2 != null) {
            return a(bjhVar.h().d, bjhVar2.h().d);
        }
        return false;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            return jSONObject.toJSONString().equals(jSONObject2.toJSONString());
        }
        return false;
    }

    private boolean c(bjh bjhVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a98c0f7a", new Object[]{this, bjhVar, jSONObject})).booleanValue();
        }
        bji h = bjhVar.h();
        if (h.d == null) {
            return false;
        }
        String string = h.d.getString("filter");
        if (StringUtils.isEmpty(string) || !h.a(this.f25944a, string, jSONObject)) {
            return false;
        }
        String str = this.g;
        UnifyLog.a(str, "RenderState", "filter过滤掉了组件: " + bjhVar.g(), new String[0]);
        return true;
    }

    private boolean a(Map.Entry<String, Object> entry) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b8248f3", new Object[]{this, entry})).booleanValue();
        }
        if (entry == null) {
            return false;
        }
        Object value = entry.getValue();
        if (!(value instanceof JSONArray)) {
            return false;
        }
        JSONArray jSONArray = (JSONArray) value;
        if (jSONArray.isEmpty()) {
            return false;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) next;
                if (com.alibaba.android.ultron.vfw.option.b.a(1, jSONObject2.getIntValue("option"))) {
                    return true;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
                if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("next")) != null) {
                    Iterator<Map.Entry<String, Object>> it2 = jSONObject.entrySet().iterator();
                    if (it2.hasNext()) {
                        return a(it2.next());
                    }
                }
            }
        }
        return false;
    }

    private boolean b(Map.Entry<String, Object> entry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d5b9c12", new Object[]{this, entry})).booleanValue() : a(entry);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z, boolean z2, boo<Map.Entry<String, Object>, Boolean> booVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995071a0", new Object[]{this, jSONObject, jSONObject2, str, new Boolean(z), new Boolean(z2), booVar});
        } else if (jSONObject != null && !jSONObject.isEmpty() && jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (booVar == null || !booVar.a(entry).booleanValue()) {
                    entry.setValue(a(jSONObject2, entry.getValue(), str, z, z2));
                }
            }
        }
    }

    private Object a(JSONObject jSONObject, Object obj, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("947f1fc4", new Object[]{this, jSONObject, obj, str, new Boolean(z), new Boolean(z2)});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            if (z2 || !biy.a(this.f25944a) || !biy.a((String) obj)) {
                z3 = false;
            }
            if (z3) {
                return a(jSONObject, obj);
            }
            return a(jSONObject, obj, z);
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, entry.getValue(), str, z, z2));
            }
            return jSONObject2;
        } else {
            boolean z4 = obj instanceof JSONArray;
            JSONArray jSONArray = obj;
            if (z4) {
                JSONArray jSONArray2 = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray2.iterator();
                while (it.hasNext()) {
                    Object a2 = a(jSONObject, it.next(), str, z, z2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                jSONArray2.clear();
                jSONArray2.addAll(arrayList);
                jSONArray = jSONArray2;
            }
            return jSONArray;
        }
    }

    private Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c2724e", new Object[]{this, jSONObject, obj});
        }
        String str = (String) obj;
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentsVO");
        if (jSONObject2 != null) {
            d(jSONObject2);
        }
        return biy.a(jSONObject2, jSONObject, str);
    }

    private Object a(JSONObject jSONObject, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2d9fef42", new Object[]{this, jSONObject, obj, new Boolean(z)});
        }
        if (z) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("componentsVO");
            if (jSONObject2 == null) {
                return jpe.a((Object) jSONObject, (String) obj, false);
            }
            d(jSONObject2);
            return jpe.a(jSONObject2, jSONObject, (String) obj, false);
        }
        return jpe.a((Object) jSONObject, (String) obj, false);
    }

    private void d(JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (this.b.f25942a == null || jSONObject == null || (i = this.m) == 0) {
        } else {
            if (i == 1 && jSONObject.containsKey("globalStyle")) {
                return;
            }
            if (this.b.f25942a.globalStyle != null && this.b.f25942a.globalStyle.containsKey("androidStyle")) {
                UnifyLog.a(this.g, "RenderState", "使用了模板文件style节点作为全局style", new String[0]);
                jSONObject.put("globalStyle", (Object) this.b.f25942a.globalStyle.getJSONObject("androidStyle"));
                this.m = 1;
                return;
            }
            Map<String, List<Block>> map = this.b.c;
            if (map != null && map.containsKey("test字段名")) {
                Block a2 = a(map.get("test字段名"), "StyleSection");
                if (a2 == null) {
                    this.m = 0;
                    return;
                }
                TemplateComponent b = b(a2.components, "AndroidTaobaoStyle");
                if (b == null) {
                    this.m = 0;
                    return;
                }
                jSONObject.put("globalStyle", (Object) b.data);
                UnifyLog.a(this.g, "RenderState", "使用了模板文件StyleSection节点的AndroidTaobaoStyle", new String[0]);
                this.m = 1;
                return;
            }
            this.m = 0;
        }
    }

    private Block a(List<Block> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Block) ipChange.ipc$dispatch("72cf4ac0", new Object[]{this, list, str});
        }
        if (list != null && str != null) {
            for (Block block : list) {
                if (block != null && str.equals(block.name)) {
                    return block;
                }
            }
        }
        return null;
    }

    private TemplateComponent b(List<TemplateComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateComponent) ipChange.ipc$dispatch("f0fa716b", new Object[]{this, list, str});
        }
        if (list != null && str != null) {
            for (TemplateComponent templateComponent : list) {
                if (templateComponent != null && str.equals(templateComponent.name)) {
                    return templateComponent;
                }
            }
        }
        return null;
    }
}
