package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.ProcedureImpl;
import com.taobao.monitor.procedure.d;
import com.taobao.monitor.procedure.u;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mpn implements ProcedureImpl.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31191a;

    public mpn(boolean z) {
        this.f31191a = z;
    }

    @Override // com.taobao.monitor.procedure.ProcedureImpl.a
    public void a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f101f86", new Object[]{this, uVar});
        } else {
            mpm.a().a(uVar.a(), b(uVar), this.f31191a);
        }
    }

    public static String b(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95039079", new Object[]{uVar});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", d.f18222a);
            jSONObject.put("topic", uVar.a());
            jSONObject.put("headers", c(uVar));
            jSONObject.put("value", a(uVar, false));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static JSONObject c(u uVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4bf3a376", new Object[]{uVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("X-timestamp", uVar.e()).put("X-appId", d.b).put("X-appKey", d.c).put("X-appBuild", d.d).put("X-appPatch", d.f).put("X-channel", d.g).put("X-utdid", d.h).put("X-brand", d.i).put("X-deviceModel", d.j).put("X-os", d.k).put("X-osVersion", d.l).put("X-userId", d.m).put("X-userNick", d.n).put("X-session", d.p).put("X-processName", d.q).put("X-appVersion", d.e).put("X-launcherMode", d.s).put("X-packageTag", d.t);
        return jSONObject;
    }

    private static JSONObject a(u uVar, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bbd861fc", new Object[]{uVar, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Map<String, Object> l = uVar.l();
        if (l != null && l.size() != 0) {
            for (Map.Entry<String, Object> entry : l.entrySet()) {
                a(jSONObject2, entry.getKey(), entry.getValue());
            }
            if (!z) {
                a(jSONObject2, "utABTest", ProcedureGlobal.a().e());
            }
            z2 = true;
        }
        List<mqi> j = uVar.j();
        if (j != null && j.size() != 0) {
            JSONObject jSONObject3 = new JSONObject();
            for (mqi mqiVar : j) {
                Map<String, Object> d = mqiVar.d();
                JSONObject jSONObject4 = new JSONObject();
                if (d != null && d.size() != 0) {
                    a(jSONObject4, d);
                }
                Map<String, Object> c = mqiVar.c();
                if (c != null && c.size() != 0) {
                    JSONObject jSONObject5 = new JSONObject();
                    a(jSONObject5, c);
                    jSONObject4.put(TBSearchChiTuJSBridge.ABTEST, jSONObject5);
                }
                Map<String, Object> b = mqiVar.b();
                if (b != null && b.size() != 0) {
                    JSONObject jSONObject6 = new JSONObject();
                    a(jSONObject6, b);
                    jSONObject4.put(NWFullTracePlugin.FullTraceJSParam.STAGES, jSONObject6);
                }
                jSONObject3.put(mqiVar.a(), jSONObject4);
            }
            jSONObject2.put("bizTags", jSONObject3);
            z2 = true;
        }
        List<Map<String, Object>> g = uVar.g();
        JSONArray jSONArray = new JSONArray();
        if (g != null && g.size() != 0) {
            for (Map<String, Object> map : g) {
                JSONObject jSONObject7 = new JSONObject();
                a(jSONObject7, map);
                jSONArray.put(jSONObject7);
            }
            jSONObject2.put("subtasks", jSONArray);
        }
        if (z2) {
            jSONObject.put("properties", jSONObject2);
        }
        Map<String, Object> k = uVar.k();
        JSONObject jSONObject8 = new JSONObject();
        if (k != null && k.size() != 0) {
            a(jSONObject8, k);
        }
        Map<String, Integer> m = uVar.m();
        if (m != null && m.size() != 0) {
            a(jSONObject8, m);
        }
        if (m.size() != 0 || k.size() != 0) {
            jSONObject.put("stats", jSONObject8);
        }
        List<mqj> h = uVar.h();
        if (h != null && h.size() != 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (mqj mqjVar : h) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("timestamp", mqjVar.b());
                jSONObject9.put("name", mqjVar.a());
                a(jSONObject9, mqjVar.c());
                jSONArray2.put(jSONObject9);
            }
            jSONObject.put("events", jSONArray2);
        }
        List<mqk> i = uVar.i();
        if (i != null && i.size() != 0) {
            JSONObject jSONObject10 = new JSONObject();
            for (mqk mqkVar : i) {
                jSONObject10.put(mqkVar.a(), mqkVar.b());
            }
            jSONObject.put(NWFullTracePlugin.FullTraceJSParam.STAGES, jSONObject10);
        }
        List<u> f = uVar.f();
        if (f != null && f.size() != 0) {
            JSONArray jSONArray3 = new JSONArray();
            for (u uVar2 : f) {
                JSONObject a2 = a(uVar2, true);
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.put(uVar2.a(), a2);
                jSONArray3.put(jSONObject11);
            }
            jSONObject.put("subProcedures", jSONArray3);
        }
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, Map<String, ?> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391d8e6f", new Object[]{jSONObject, map});
        } else {
            a(jSONObject, map, 2);
        }
    }

    private static void a(JSONObject jSONObject, Map<String, ?> map, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea94b274", new Object[]{jSONObject, map, new Integer(i)});
        } else if (map != null && i > 0) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                a(jSONObject, entry.getKey(), entry.getValue(), i);
            }
        }
    }

    private static void a(JSONObject jSONObject, String str, Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f61e7c", new Object[]{jSONObject, str, obj});
        } else {
            a(jSONObject, str, obj, 2);
        }
    }

    private static void a(JSONObject jSONObject, String str, Object obj, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dce2407", new Object[]{jSONObject, str, obj, new Integer(i)});
        } else if (obj instanceof Integer) {
            jSONObject.put(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            jSONObject.put(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            jSONObject.put(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            jSONObject.put(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            jSONObject.put(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Character) {
            jSONObject.put(str, (int) ((Character) obj).charValue());
        } else if (obj instanceof Short) {
            jSONObject.put(str, (int) ((Short) obj).shortValue());
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            a(jSONObject2, map, i - 1);
            jSONObject.put(str, jSONObject2);
        } else {
            jSONObject.put(str, obj);
        }
    }
}
