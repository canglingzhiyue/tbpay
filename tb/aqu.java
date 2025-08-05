package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.j;
import com.alibaba.android.aura.nodemodel.extend.AURAExtendModuleNodeModel;
import com.alibaba.android.aura.service.aspect.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.internal.util.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.arc;

/* loaded from: classes2.dex */
public final class aqu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_MAIN_CONFIG_EMPTY = 1000;
    public static final int ERROR_CODE_MAIN_CONFIG_NO_PLUGIN = 1001;

    /* renamed from: a  reason: collision with root package name */
    private final j f25519a;

    static {
        kge.a(408431736);
    }

    public aqu(j jVar) {
        this.f25519a = jVar;
    }

    public void a(Context context, String str, aqv aqvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad6ee94", new Object[]{this, context, str, aqvVar});
            return;
        }
        JSONObject a2 = aqw.a(context, str);
        if (a2 == null || a2.isEmpty()) {
            aqvVar.a(1000, "主配置加载失败");
        } else {
            a(context, a2, aqvVar);
        }
    }

    private void a(Context context, JSONObject jSONObject, aqv aqvVar) {
        JSONObject jSONObject2;
        AURAExtendModuleNodeModel a2;
        JSONObject a3;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3afd4fa", new Object[]{this, context, jSONObject, aqvVar});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject(b.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject4 == null) {
            aqvVar.a(1001, "主配置加载失败，没有plugin节点");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a(jSONObject, arrayList, arrayList2);
        JSONArray jSONArray = jSONObject4.getJSONArray("extendedModules");
        if (bau.a(jSONArray)) {
            b(context, jSONObject4);
            aqvVar.a(jSONObject, arrayList, arrayList2);
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof JSONObject) && (a2 = aqw.a((jSONObject2 = (JSONObject) next))) != null) {
                a(a2, arrayList2);
                if (baw.a() && (a3 = a(context, jSONObject2)) != null && (jSONObject3 = a3.getJSONObject(b.TRACK_PAGE_COUNTER_TYPE_PLUGIN)) != null) {
                    a(a3, arrayList, arrayList2);
                    d(jSONObject4, jSONObject3);
                }
            }
        }
        b(context, jSONObject4);
        aqvVar.a(jSONObject, arrayList, arrayList2);
    }

    private static void a(AURAExtendModuleNodeModel aURAExtendModuleNodeModel, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b92dee", new Object[]{aURAExtendModuleNodeModel, list});
        } else if (list.contains(aURAExtendModuleNodeModel.name)) {
        } else {
            list.add(aURAExtendModuleNodeModel.name);
        }
    }

    private JSONObject a(Context context, JSONObject jSONObject) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa474db0", new Object[]{this, context, jSONObject});
        }
        AURAExtendModuleNodeModel a3 = aqw.a(jSONObject);
        if (a3 != null && (a2 = aqw.a(context, a3.configPath)) != null && !aqw.a(a3, a2)) {
            return a2;
        }
        return null;
    }

    private void b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104666d1", new Object[]{this, context, jSONObject});
        } else if (!baw.a()) {
        } else {
            c(context, jSONObject);
            a(jSONObject);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("flows");
        if (bau.a(jSONArray)) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("commonExtensions");
        if (bau.a(jSONObject2)) {
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) next;
                a(jSONObject3, jSONObject2);
                b(jSONObject3, jSONObject2);
            }
        }
        jSONObject.remove("commonExtensions");
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (bau.a(jSONObject2)) {
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("nodes");
            if (bau.a(jSONArray)) {
                return;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    c((JSONObject) next, jSONObject2);
                }
            }
        }
    }

    private void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{this, jSONObject, jSONObject2});
        } else if (bau.a(jSONObject2)) {
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("aspectExtensions");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject.put("aspectExtensions", (Object) jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("code", a.SERVICE_CODE);
            jSONObject4.put("type", "service");
            jSONObject4.put("extensions", (Object) jSONObject3);
            c(jSONObject4, jSONObject2);
            if (!jSONObject3.isEmpty()) {
                return;
            }
            jSONObject.remove("aspectExtensions");
        }
    }

    private void c(JSONObject jSONObject, JSONObject jSONObject2) {
        String key;
        List<String> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358a36ea", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        String string = jSONObject.getString("code");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("extensions");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
            jSONObject.put("extensions", (Object) jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof JSONArray) && (f = this.f25519a.f((key = entry.getKey()))) != null && f.contains(string)) {
                jSONObject4.clear();
                jSONObject4.put(key, value);
                l(jSONObject3, jSONObject4);
            }
        }
        if (jSONObject3.isEmpty()) {
            jSONObject.remove("extensions");
            return;
        }
        for (Object obj : jSONObject3.values()) {
            if (obj instanceof JSONArray) {
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        c((JSONObject) next, jSONObject2);
                    }
                }
            }
        }
    }

    private void c(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5eb12", new Object[]{this, context, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("functionModules");
        if (bau.a(jSONArray)) {
            return;
        }
        JSONArray d = d(context, jSONObject);
        if (jSONObject.getJSONObject("commonExtensions") == null) {
            jSONObject.put("commonExtensions", (Object) new JSONObject());
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) next;
                JSONObject jSONObject3 = jSONObject2.getJSONObject("commonExtensions");
                if (bau.a(jSONObject3)) {
                    jSONObject3 = b(jSONObject2.getString("code"), d);
                }
                if (!bau.a(jSONObject3)) {
                    e(jSONObject, jSONObject3);
                }
                JSONObject jSONObject4 = jSONObject2.getJSONObject("extensions");
                if (!bau.a(jSONObject4)) {
                    e(jSONObject, jSONObject4);
                }
            }
        }
    }

    private JSONArray d(Context context, JSONObject jSONObject) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4fd0808b", new Object[]{this, context, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("functionModuleRepository");
        if (bau.a(jSONArray)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof JSONObject) && (a2 = a(context, (JSONObject) next)) != null) {
                JSONObject jSONObject2 = a2.getJSONObject(b.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
                if (!bau.a(jSONObject2)) {
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("functionModules");
                    if (!bau.a(jSONArray3)) {
                        jSONArray2.addAll(jSONArray3);
                    }
                }
            }
        }
        return jSONArray2;
    }

    private void d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b5ea2b", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        g(jSONObject, jSONObject2);
        f(jSONObject, jSONObject2);
        h(jSONObject, jSONObject2);
    }

    private void e(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe19d6c", new Object[]{this, jSONObject, jSONObject2});
        } else if (bau.a(jSONObject2)) {
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("commonExtensions");
            if (jSONObject3 == null) {
                jSONObject.put("commonExtensions", (Object) jSONObject2);
            } else {
                l(jSONObject3, jSONObject2);
            }
        }
    }

    private void f(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0d50ad", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("functionModules");
        JSONArray jSONArray2 = jSONObject.getJSONArray("functionModules");
        if (bau.a(jSONArray)) {
            return;
        }
        if (jSONArray2 == null) {
            jSONArray2 = new JSONArray();
            jSONObject.put("functionModules", (Object) jSONArray2);
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) next;
                String string = jSONObject3.getString("code");
                if (TextUtils.isEmpty(string)) {
                    arc.a().b("combineFunctionModules#功能模块不合法，code为空", arc.a.a().b("AURAConfigCombine").b());
                } else if (a(string, jSONArray2) == null) {
                    jSONArray2.add(jSONObject3);
                }
            }
        }
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4c39a07a", new Object[]{this, str, jSONArray});
        }
        if (bau.a(jSONArray)) {
            return null;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                if (str.equals(jSONObject.getString("code"))) {
                    return jSONObject;
                }
            }
        }
        return null;
    }

    private JSONObject b(String str, JSONArray jSONArray) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bac0b1bb", new Object[]{this, str, jSONArray});
        }
        if (bau.a(jSONArray) || (a2 = a(str, jSONArray)) == null) {
            return null;
        }
        return a2.getJSONObject("commonExtensions");
    }

    private void g(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23903ee", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("branches");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("branches");
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            return;
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONObject.put("branches", (Object) jSONArray);
        }
        Iterator<Object> it = jSONArray2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                String b = aqw.b((JSONObject) next);
                if (aqw.b(jSONArray, b)) {
                    aqw.a("主配置中已经存在这个Branch了【" + b + "】不可以覆盖", false);
                } else {
                    jSONArray.add(next);
                }
            }
        }
    }

    private void h(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a564b72f", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("flows");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("flows");
        if (jSONArray2 == null) {
            jSONArray2 = new JSONArray();
            jSONObject.put("flows", (Object) jSONArray2);
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) next;
                JSONObject c = aqw.c(jSONArray2, aqw.b(jSONObject3));
                if (c != null) {
                    j(c, jSONObject3);
                    i(c, jSONObject3);
                } else {
                    jSONArray2.add(next);
                }
            }
        }
    }

    private void i(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88906a70", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("aspectExtensions");
        if (jSONObject3 == null || jSONObject3.isEmpty()) {
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("aspectExtensions");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
            jSONObject.put("aspectExtensions", (Object) jSONObject4);
        }
        for (String str : jSONObject3.keySet()) {
            JSONArray jSONArray = jSONObject4.getJSONArray(str);
            if (jSONArray == null || jSONArray.isEmpty()) {
                jSONObject4.put(str, (Object) jSONObject3.getJSONArray(str));
            } else {
                l(jSONObject4, jSONObject3);
            }
        }
    }

    private void j(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbc1db1", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("nodes");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("nodes");
        if (jSONArray2 == null) {
            jSONArray2 = new JSONArray();
            jSONObject.put("nodes", (Object) jSONArray2);
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) next;
                JSONObject a2 = aqw.a(jSONArray2, jSONObject3.getString("code"));
                String b = aqw.b(jSONObject3);
                if (a2 == null) {
                    aqw.a("不能添加一个新的服务【" + b + "】 到流程【" + aqw.b(jSONObject) + "】", false);
                } else {
                    k(a2, jSONObject3);
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("extensions");
                    if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                        JSONObject jSONObject5 = a2.getJSONObject("extensions");
                        if (jSONObject5 == null) {
                            jSONObject5 = new JSONObject();
                            a2.put("extensions", (Object) jSONObject5);
                        }
                        l(jSONObject5, jSONObject4);
                    }
                }
            }
        }
    }

    private void k(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee7d0f2", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("input");
        if (bau.a(jSONObject3)) {
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("input");
        if (jSONObject4 == null) {
            jSONObject.put("input", (Object) new JSONObject(jSONObject3));
        } else {
            jSONObject4.putAll(jSONObject3);
        }
    }

    private void l(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32138433", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject2.keySet()) {
            JSONArray jSONArray = jSONObject2.getJSONArray(str);
            if (jSONArray != null && !jSONArray.isEmpty()) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                if (jSONArray2 == null || jSONArray2.isEmpty()) {
                    jSONObject.put(str, (Object) jSONArray);
                } else {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject3 = (JSONObject) next;
                            JSONObject d = aqw.d(jSONArray2, aqw.b(jSONObject3));
                            if (d == null) {
                                jSONArray2.add(next);
                            } else {
                                k(d, jSONObject3);
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("extensions");
                                if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                                    JSONObject jSONObject5 = d.getJSONObject("extensions");
                                    if (jSONObject5 == null) {
                                        jSONObject5 = new JSONObject();
                                        d.put("extensions", (Object) jSONObject5);
                                    }
                                    l(jSONObject5, jSONObject4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(JSONObject jSONObject, List<JSONObject> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d985f36a", new Object[]{this, jSONObject, list, list2});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(b.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject2 == null) {
            arc.a().b("无效配置，没有plugin", arc.a.a().b("AURAConfigCombine").b());
            return;
        }
        if (!list.contains(jSONObject)) {
            list.add(jSONObject);
        }
        String string = jSONObject2.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        if (TextUtils.isEmpty(string) || list2.contains(string)) {
            return;
        }
        list2.add(string);
    }
}
