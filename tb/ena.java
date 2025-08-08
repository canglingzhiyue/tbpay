package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.enb;

/* loaded from: classes4.dex */
public class ena {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_MODULE = "detail";

    /* renamed from: a  reason: collision with root package name */
    private Context f27453a;
    private String c;
    private eox d;
    private epk e;
    private boolean b = false;
    private Map<String, IDMComponent> f = new HashMap();
    private final enb g = new enb();

    static {
        kge.a(-804049983);
    }

    public ena(Context context) {
        this.c = emx.c(context);
        this.f27453a = context.getApplicationContext();
        this.d = emx.a(context).b().m();
        this.e = emx.a(context).b().o();
        emu.a("com.taobao.android.detail.datasdk.engine.dataengine.UltronStructureEngine");
    }

    public b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f6a6d5e8", new Object[]{this, jSONObject});
        }
        eqc.a(this.f27453a, "mCreateDetailModel", "主接口数据序列化");
        if (jSONObject == null) {
            return new b(-2);
        }
        if (jSONObject.size() == 0) {
            return new b(-1);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new b(-1);
        }
        b bVar = null;
        if (epv.g) {
            bVar = e(jSONObject2);
        }
        if (bVar == null) {
            bVar = new b(d(jSONObject2));
        }
        bVar.c(jSONObject2);
        eqc.b(this.f27453a, "mCreateDetailModel");
        return bVar;
    }

    private JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed36a885", new Object[]{this, jSONObject});
        }
        JSONObject h = h(jSONObject);
        if (h == null || h.isEmpty()) {
            this.b = true;
            h = f(jSONObject);
        }
        if (h == null || h.isEmpty()) {
            h = new JSONObject();
        }
        JSONObject a2 = a(jSONObject, h);
        a2.put("msoaToken", (Object) this.c);
        a2.put("eventToken", (Object) this.c);
        return a2;
    }

    private b e(JSONObject jSONObject) {
        String string;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("97bfd6ec", new Object[]{this, jSONObject});
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
            if (jSONArray == null || jSONArray.size() <= 0) {
                return null;
            }
            JSONObject jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("data");
            if (jSONObject3 == null) {
                jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("value");
            }
            if (jSONObject3 == null || (string = jSONObject3.getString("version")) == null || !string.startsWith("v7") || (jSONObject2 = jSONObject3.getJSONObject("bizData")) == null) {
                return null;
            }
            JSONObject a2 = a(jSONObject, jSONObject2);
            a2.put("msoaToken", (Object) this.c);
            a2.put("eventToken", (Object) this.c);
            a2.put("componentsVO", (Object) jSONObject3.getJSONObject("componentsVO"));
            b bVar = new b(a2);
            bVar.b(jSONObject3);
            return bVar;
        } catch (Throwable th) {
            epp.a("UltronStructureEngine", "getV7NodeBundle", th);
            return null;
        }
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("82f2e07e", new Object[]{this, str});
        }
        eqc.a(this.f27453a, "mCreateDetailModel", "主接口数据序列化");
        if (StringUtils.isEmpty(str)) {
            return new b(-1);
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSONObject.parseObject(str);
        } catch (Throwable unused) {
        }
        if (jSONObject == null) {
            return new b(-2);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new b(-1);
        }
        JSONObject g = g(jSONObject2);
        if (g == null || g.isEmpty()) {
            this.b = true;
            g = f(jSONObject2);
        }
        if (g == null || g.isEmpty()) {
            g = new JSONObject();
        }
        JSONObject a2 = a(jSONObject2, g);
        a2.put("msoaToken", (Object) this.c);
        a2.put("eventToken", (Object) this.c);
        b bVar = new b(a2);
        eqc.b(this.f27453a, "mCreateDetailModel");
        return bVar;
    }

    public enh a(b bVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("5386fac5", new Object[]{this, bVar, jSONObject, jSONObject2});
        }
        if (jSONObject2 == null) {
            jSONObject2 = c(jSONObject);
        }
        eqc.a(this.f27453a, "parserData", "奥创parserDataOpt");
        enb.a a2 = this.g.a(jSONObject2);
        eqc.b(this.f27453a, "parserData");
        if (!a2.f27455a) {
            return new enh(null);
        }
        if (bVar.i() != 0) {
            return new enh(null);
        }
        eqc.a(this.f27453a, "mCreateViewModel", "创建ViewModel");
        eng a3 = a(a2.b, bVar);
        eqc.b(this.f27453a, "mCreateViewModel");
        enh enhVar = new enh(a3, a(bVar, a3));
        enhVar.f27461a = this.b;
        return enhVar;
    }

    public static boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("apiStack");
            if (jSONArray != null && !jSONArray.isEmpty() && (jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("value")) != null) {
                if (!jSONObject2.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean a(Object obj) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        try {
            if (obj instanceof String) {
                jSONObject = JSONObject.parseObject((String) obj);
            } else {
                jSONObject = (JSONObject) obj;
            }
            if (jSONObject != null && (jSONArray = jSONObject.getJSONObject("data").getJSONArray("apiStack")) != null && !jSONArray.isEmpty()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("value");
                jSONArray.getJSONObject(0).remove("value");
                jSONArray.getJSONObject(0).put("value", (Object) jSONObject2);
                if (jSONObject2 != null && (jSONObject2.containsKey(AURASubmitEvent.RPC_ENDPOINT) || jSONObject2.containsKey("version"))) {
                    return true;
                }
                JSONObject jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("data");
                if (jSONObject3 != null) {
                    if (!jSONObject3.containsKey(AURASubmitEvent.RPC_ENDPOINT)) {
                        if (jSONObject3.containsKey("version")) {
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private end a(b bVar, eng engVar) {
        eox eoxVar;
        Map<String, IDMComponent> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (end) ipChange.ipc$dispatch("562e64b7", new Object[]{this, bVar, engVar});
        }
        epe epeVar = null;
        if (bVar == null || engVar == null || engVar.b == null || (eoxVar = this.d) == null || (map = this.f) == null || map.size() == 0) {
            return null;
        }
        IDMComponent iDMComponent = this.f.get("naviBar");
        epe d = iDMComponent != null ? eoxVar.d(iDMComponent, bVar) : null;
        IDMComponent iDMComponent2 = this.f.get("detailHome");
        if (iDMComponent2 != null) {
            epeVar = eoxVar.d(iDMComponent2, bVar);
        }
        return new end(engVar, d, epeVar);
    }

    public JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        eqc.a(this.f27453a, "getUltronProtocolStr", "解析抽取ultron原始协议Opt");
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("apiStack");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
                if (jSONObject3 == null) {
                    jSONObject3 = jSONObject2.getJSONObject("data");
                }
                jSONObject3.put("reload", (Object) true);
                jSONObject2.remove("value");
                jSONObject2.put("data", (Object) jSONObject3);
                eqc.b(this.f27453a, "getUltronProtocolStr");
                return jSONObject2;
            }
        } catch (Exception e) {
            epp.a("UltronStructureEngine", "getUltronProtocolStr FIAL ~~ ", e);
        }
        eqc.b(this.f27453a, "getUltronProtocolStr");
        return null;
    }

    private eng a(jny jnyVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eng) ipChange.ipc$dispatch("69b05ceb", new Object[]{this, jnyVar, bVar});
        }
        eox eoxVar = this.d;
        this.f = a(a(jnyVar));
        com.taobao.android.detail.datasdk.model.viewmodel.main.b a2 = a(eoxVar, this.f, bVar);
        com.taobao.android.detail.datasdk.model.viewmodel.main.b b = b(eoxVar, this.f, bVar);
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> a3 = eqe.a(eoxVar, this.e, this.f.get("detailInfo").getChildren(), bVar);
        Context context = this.f27453a;
        epx.a(context, emx.c(context), a3);
        return new eng(bVar, a3, a2, b);
    }

    private List<IDMComponent> a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("931150e4", new Object[]{this, jnyVar});
        }
        ArrayList arrayList = new ArrayList();
        List<IDMComponent> b = jnyVar.b();
        arrayList.addAll(b);
        for (IDMComponent iDMComponent : b) {
            a(arrayList, iDMComponent.getParent());
        }
        return arrayList;
    }

    private void a(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ac5f9b", new Object[]{this, list, iDMComponent});
        } else if (iDMComponent == null || list == null || list.contains(iDMComponent)) {
        } else {
            list.add(iDMComponent);
            if (iDMComponent.getParent() == null) {
                return;
            }
            a(list, iDMComponent.getParent());
        }
    }

    private com.taobao.android.detail.datasdk.model.viewmodel.main.b a(eox eoxVar, Map<String, IDMComponent> map, b bVar) {
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("431f6fc9", new Object[]{this, eoxVar, map, bVar});
        }
        if (eoxVar != null && map != null && map.size() != 0 && (iDMComponent = map.get("naviBar")) != null) {
            return eoxVar.a(iDMComponent, bVar);
        }
        return null;
    }

    private com.taobao.android.detail.datasdk.model.viewmodel.main.b b(eox eoxVar, Map<String, IDMComponent> map, b bVar) {
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("cfd5ca0a", new Object[]{this, eoxVar, map, bVar});
        }
        if (eoxVar != null && map != null && map.size() != 0 && (iDMComponent = map.get("bottomBar")) != null) {
            return eoxVar.c(iDMComponent, bVar);
        }
        return null;
    }

    private Map<String, IDMComponent> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        this.f.clear();
        for (IDMComponent iDMComponent : list) {
            String tag = iDMComponent.getTag();
            if (!StringUtils.isEmpty(tag)) {
                if (iDMComponent.getChildren() != null && iDMComponent.getChildren().size() == 1) {
                    this.f.put(tag, iDMComponent.getChildren().get(0));
                } else {
                    this.f.put(tag, iDMComponent);
                }
            }
        }
        return this.f;
    }

    private JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{this, jSONObject});
        }
        try {
            return JSON.parseObject(jSONObject.getString("mockData"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.fastjson.JSONObject g(com.alibaba.fastjson.JSONObject r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ena.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "97d7ca62"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            return r5
        L18:
            java.lang.String r0 = "UltronStructureEngine"
            java.lang.String r1 = "extractApiStack"
            tb.epp.c(r0, r1)
            java.lang.String r0 = "apiStack"
            com.alibaba.fastjson.JSONArray r5 = r5.getJSONArray(r0)
            r0 = 0
            if (r5 == 0) goto L58
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L58
            com.alibaba.fastjson.JSONObject r1 = r5.getJSONObject(r2)
            java.lang.String r3 = "data"
            com.alibaba.fastjson.JSONObject r1 = r1.getJSONObject(r3)
            if (r1 != 0) goto L45
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r2)
            java.lang.String r1 = "value"
            com.alibaba.fastjson.JSONObject r1 = r5.getJSONObject(r1)
        L45:
            java.lang.String r5 = "global"
            com.alibaba.fastjson.JSONObject r5 = r1.getJSONObject(r5)
            if (r5 == 0) goto L58
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L58
            java.lang.String r5 = r5.getString(r3)
            goto L59
        L58:
            r5 = r0
        L59:
            boolean r1 = android.text.StringUtils.isEmpty(r5)
            if (r1 != 0) goto L63
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: java.lang.Throwable -> L63
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ena.g(com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    private JSONObject h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d0b82b01", new Object[]{this, jSONObject});
        }
        epp.c("UltronStructureEngine", "extractApiStackOpt");
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("value");
            if (jSONObject2 == null) {
                jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("data");
            }
            if (jSONObject2 == null) {
                return null;
            }
            boolean i = i(jSONObject2);
            if (epv.e && !i) {
                try {
                    joq.a("process ultron cache");
                    this.g.a(this.f27453a, jSONObject2);
                    joq.b("process ultron cache");
                } catch (Throwable unused) {
                    epp.c("UltronStructureEngine", "ultronParser.processCache");
                }
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("global");
            if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                return jSONObject3.getJSONObject("data");
            }
        }
        return null;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            jSONObject = (JSONObject) jSONObject.clone();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(key);
                    if (jSONObject3 != null) {
                        jSONObject.put(key, (Object) a(jSONObject3, (JSONObject) value));
                    } else {
                        jSONObject.put(key, value);
                    }
                } else {
                    jSONObject.put(key, value);
                }
            }
        }
        return jSONObject;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    private boolean i(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfbe084", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("global")) != null && (jSONObject3 = jSONObject2.getJSONObject("data")) != null && (jSONObject4 = jSONObject3.getJSONObject("feature")) != null) {
            return jSONObject4.getBooleanValue("finalUltron");
        }
        return false;
    }
}
