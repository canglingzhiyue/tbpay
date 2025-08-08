package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.c;
import com.taobao.android.purchase.preload.a;
import java.util.Arrays;
import java.util.List;
import tb.arc;
import tb.bbd;

/* loaded from: classes6.dex */
public class nhk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f31470a;

    static {
        kge.a(583733106);
        f31470a = Arrays.asList("B", "C");
    }

    public static JSONObject a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2901b94a", new Object[]{context, str});
        }
        Object a2 = dcm.a().a(str);
        if (!(a2 instanceof JSONObject)) {
            tdh.a((Object) null, "PRELOAD_IDENTIFIER_EMPTY");
            return null;
        }
        try {
            JSONObject jSONObject = (JSONObject) a2;
            if (!b(jSONObject)) {
                tdh.a(jSONObject, "PRELOAD_DATA_EMPTY");
                return null;
            } else if (a(jSONObject) != 1) {
                return null;
            } else {
                String c = c(jSONObject);
                if (c != null && f31470a.contains(c)) {
                    if (baw.a()) {
                        arc.a().a("beforeFlowExecute", arc.a.a().b("TBBuyPreload").a("AURA/preload").a("preloadData", jSONObject.toJSONString()).b());
                    }
                    String f = f(jSONObject);
                    if (!StringUtils.isEmpty(f)) {
                        a.a(f, 50, context);
                    }
                    d(jSONObject);
                    e(jSONObject);
                    idq idqVar = new idq();
                    a(idqVar.e(), jSONObject);
                    return idqVar.a();
                }
                tdh.a((Object) c, "PRELOAD_BIZ_NOT_REGISTER");
                return null;
            }
        } catch (Throwable th) {
            tdh.a((Object) Log.getStackTraceString(th), "PRELOAD_DATA_PARSE_EXCEPTION");
            return null;
        }
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str});
        }
        Object a2 = dcm.a().a(str);
        if (!(a2 instanceof JSONObject)) {
            tdh.a((Object) null, "PRELOAD_IDENTIFIER_EMPTY");
            return null;
        }
        try {
            JSONObject jSONObject = (JSONObject) a2;
            if (!b(jSONObject)) {
                tdh.a(jSONObject, "PRELOAD_DATA_EMPTY");
                return null;
            } else if (a(jSONObject) != 1) {
                return null;
            } else {
                String c = c(jSONObject);
                if (c != null && f31470a.contains(c)) {
                    if (baw.a()) {
                        arc.a().a("beforeFlowExecute", arc.a.a().b("TBBuyPreload").a("AURA/preload").a("preloadData", jSONObject.toJSONString()).b());
                    }
                    d(jSONObject);
                    e(jSONObject);
                    return jSONObject;
                }
                tdh.a((Object) c, "PRELOAD_BIZ_NOT_REGISTER");
                return null;
            }
        } catch (Throwable th) {
            tdh.a((Object) Log.getStackTraceString(th), "PRELOAD_DATA_PARSE_EXCEPTION");
            return null;
        }
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject4 = jSONObject.getJSONObject(str);
            if (jSONObject4 != null && (jSONObject3 = jSONObject4.getJSONObject("fields")) != null) {
                b(jSONObject3, jSONObject2);
            }
        }
    }

    private static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof String) {
                String c = c((String) obj);
                if (!StringUtils.isEmpty(c)) {
                    Object a2 = a(jSONObject2, c);
                    if (a2 == null) {
                        a2 = "";
                    }
                    jSONObject.put(str, a2);
                }
            }
        }
    }

    private static Object a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("805a9220", new Object[]{jSONObject, str}) : (StringUtils.isEmpty(str) || StringUtils.equals(str, "*")) ? jSONObject : bbd.b.a(str.split("\\."), jSONObject);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (!str.startsWith("@data{")) {
            return null;
        }
        return str.substring(6, str.length() - 1);
    }

    private static int a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{jSONObject})).intValue();
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if (jSONArray != null) {
            return jSONArray.size();
        }
        return 0;
    }

    private static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        JSONObject jSONObject3 = jSONObject.getJSONObject("submit");
        if (jSONObject2 != null && jSONArray != null) {
            if ((jSONObject3 != null) & (jSONArray.size() != 0)) {
                return true;
            }
        }
        return false;
    }

    private static String c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if (jSONArray != null && (jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("fields")) != null) {
            return jSONObject2.getString("mutex");
        }
        return null;
    }

    private static void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        if (jSONObject2 == null) {
            return;
        }
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
            JSONArray jSONArray = jSONObject3.getJSONArray(gbk.TYPE_SELECTED);
            if (jSONArray != null && jSONArray.size() > 0) {
                Object obj = jSONArray.get(0);
                if (!(obj instanceof JSONObject)) {
                    return;
                }
                jSONObject3.put("fullName", (Object) ((JSONObject) obj).getString("fullName"));
                jSONObject3.put("mobile", (Object) ((JSONObject) obj).getString("mobile"));
                return;
            }
            String string = jSONObject2.getJSONObject("events").getJSONArray("addressClick").getJSONObject(0).getJSONObject("fields").getString("data");
            String string2 = jSONObject3.getString("currentAddressId");
            if (StringUtils.isEmpty(string2)) {
                return;
            }
            JSONArray jSONArray2 = JSONObject.parseObject(string).getJSONArray("deliverAddrList");
            for (int i = 0; i < jSONArray2.size(); i++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
                if (!string2.equalsIgnoreCase(jSONObject4.getString(c.K_DELIVERY_ID))) {
                    return;
                }
                jSONObject3.put("fullName", (Object) jSONObject4.getString("fullName"));
                jSONObject3.put("mobile", (Object) jSONObject4.getString("mobile"));
            }
        } catch (Throwable unused) {
        }
    }

    private static void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i).getJSONObject("fields");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("serviceIcons");
            if (jSONArray2 != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    String string = jSONArray2.getJSONObject(i2).getString("text");
                    if (string != null) {
                        jSONArray3.add(string);
                    }
                }
                if (jSONArray3.size() != 0) {
                    jSONObject2.put("label", (Object) jSONArray3);
                }
            }
        }
    }

    private static String f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e46e245d", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("item");
        if ((jSONArray == null && jSONArray.size() > 1) || (jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("fields")) == null) {
            return null;
        }
        return jSONObject2.getString("icon");
    }
}
