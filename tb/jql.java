package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes6.dex */
public final class jql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPARE_RESULT_CODE_ARRAY_SIZE_NOT_SAME = "arraySizeNotSame";
    public static final String COMPARE_RESULT_CODE_OBJECT_NOT_SAME = "objectNotSame";

    /* loaded from: classes6.dex */
    public static abstract class a {
        static {
            kge.a(-1422096473);
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public a f29710a;
        public List<String> b;
        public boolean c = true;
        public boolean d = true;

        static {
            kge.a(1204433486);
        }
    }

    static {
        kge.a(284786466);
    }

    public static boolean a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bc096ec", new Object[]{iDMComponent, iDMComponent2})).booleanValue() : a(iDMComponent, iDMComponent2, (b) null);
    }

    public static boolean a(IDMComponent iDMComponent, IDMComponent iDMComponent2, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("afd42ef9", new Object[]{iDMComponent, iDMComponent2, bVar})).booleanValue() : iDMComponent != null && iDMComponent2 != null && a(iDMComponent.getData(), iDMComponent2.getData(), bVar) && a(iDMComponent.getContainerInfo(), iDMComponent2.getContainerInfo(), bVar);
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3aec8879", new Object[]{jSONObject, jSONObject2, bVar})).booleanValue();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            a(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, "", jSONObject, jSONObject2, null, null, bVar);
            return false;
        }
        if (bVar == null) {
            bVar = new b();
        }
        return a(jSONObject, jSONObject2, bVar, "");
    }

    private static boolean a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd7e5f03", new Object[]{jSONObject, jSONObject2, bVar, str})).booleanValue();
        }
        int size = jSONObject.size();
        int size2 = jSONObject2.size();
        if (bVar.c && bVar.d && size != size2) {
            a(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, str, jSONObject, jSONObject2, null, null, bVar);
            return false;
        }
        for (String str2 : (size >= size2 ? jSONObject : jSONObject2).keySet()) {
            if (!jqb.a(str, str2, bVar.b)) {
                Object obj = jSONObject.get(str2);
                Object obj2 = jSONObject2.get(str2);
                if (obj != null || obj2 == null) {
                    if (obj == null || obj2 != null) {
                        if (obj != null || obj2 != null) {
                            if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                                if (a((JSONObject) obj, (JSONObject) obj2, bVar, jqb.a(str, str2))) {
                                    continue;
                                } else {
                                    if (bVar.d) {
                                        return false;
                                    }
                                    z = false;
                                }
                            } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                                if (a((JSONArray) obj, (JSONArray) obj2, bVar, jqb.a(str, str2))) {
                                    continue;
                                } else {
                                    if (bVar.d) {
                                        return false;
                                    }
                                    z = false;
                                }
                            } else if (!String.valueOf(obj).equals(String.valueOf(obj2)) && !obj.equals(obj2)) {
                                a(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, jqb.a(str, str2), jSONObject, jSONObject2, obj, obj2, bVar);
                                if (bVar.d) {
                                    return false;
                                }
                                z = false;
                            }
                        }
                    } else if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
                        if (!(obj instanceof String) || Boolean.parseBoolean((String) obj)) {
                            a(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, jqb.a(str, str2), jSONObject, jSONObject2, obj, obj2, bVar);
                            if (bVar.d) {
                                return false;
                            }
                            z = false;
                        }
                    }
                } else if (!(obj2 instanceof Boolean) || ((Boolean) obj2).booleanValue()) {
                    if (!(obj2 instanceof String) || Boolean.parseBoolean((String) obj2)) {
                        a(COMPARE_RESULT_CODE_OBJECT_NOT_SAME, jqb.a(str, str2), jSONObject, jSONObject2, obj, obj2, bVar);
                        if (bVar.d) {
                            return false;
                        }
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    private static void a(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b119f9", new Object[]{str, str2, obj, obj2, obj3, obj4, bVar});
            return;
        }
        if (bVar != null && bVar.f29710a == null) {
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df543553", new Object[]{jSONArray, jSONArray2, bVar, str})).booleanValue();
        }
        if (jSONArray.size() != jSONArray2.size()) {
            a(COMPARE_RESULT_CODE_ARRAY_SIZE_NOT_SAME, str, jSONArray, jSONArray2, jSONArray, jSONArray2, bVar);
            return false;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            Object obj2 = jSONArray2.get(i);
            if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                if (!a((JSONObject) obj, (JSONObject) obj2, bVar, str)) {
                    return false;
                }
            } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                if (!a((JSONArray) obj, (JSONArray) obj2, bVar, str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                a("objectNotSame#index=" + i, str, jSONArray, jSONArray, obj, obj2, bVar);
                return false;
            }
        }
        return true;
    }
}
