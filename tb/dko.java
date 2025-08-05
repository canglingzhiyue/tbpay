package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.b;
import com.taobao.android.ab.api.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dko {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static b a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3aacc6a5", new Object[]{str, str2, str3}) : new dkm(str, str2, str3);
    }

    public static b a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("71d636db", new Object[]{str, str2}) : new dkm(str, str2);
    }

    public static dkk a(dkl dklVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkk) ipChange.ipc$dispatch("2df1aaef", new Object[]{dklVar}) : new dkn(dklVar.f(), dklVar.b(), dklVar.c(), dklVar.d(), dklVar.e());
    }

    public static dkk a(String str, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkk) ipChange.ipc$dispatch("e86d39d0", new Object[]{str, new Long(j), new Long(j2), new Long(j3), new Long(j4)}) : new dkn(str, j, j2, j3, j4);
    }

    public static dkk a(dkl dklVar, c... cVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkk) ipChange.ipc$dispatch("daab536", new Object[]{dklVar, cVarArr});
        }
        dkk a2 = a(dklVar);
        for (c cVar : cVarArr) {
            Iterator<b> a3 = cVar.a();
            while (a3.hasNext()) {
                a2.a(a3.next());
            }
        }
        return a2;
    }

    public static Map<String, dkl> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                dkk a2 = a(next, jSONObject2.getLong("id"), jSONObject2.getLong("release_id"), jSONObject2.getLong("group_id"), jSONObject2.getLong(djy.SERIALIZE_EXP_BUCKET_ID));
                JSONObject jSONObject3 = jSONObject2.getJSONObject(djy.SERIALIZE_EXP_VARIATIONS);
                Iterator<String> keys2 = jSONObject3.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    a2.a(a(next2, jSONObject3.getString(next2)));
                }
                hashMap.put(next, a2);
            }
            return hashMap;
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static String a(Map<String, dkl> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, dkl> entry : map.entrySet()) {
                String key = entry.getKey();
                dkl value = entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", value.b());
                jSONObject2.put("release_id", value.c());
                jSONObject2.put("group_id", value.d());
                jSONObject2.put(djy.SERIALIZE_EXP_BUCKET_ID, value.e());
                JSONObject jSONObject3 = new JSONObject();
                Iterator<b> a2 = value.a();
                while (a2.hasNext()) {
                    b next = a2.next();
                    jSONObject3.put(next.a(), next.b());
                }
                jSONObject2.put(djy.SERIALIZE_EXP_VARIATIONS, jSONObject3);
                jSONObject.put(key, jSONObject2);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
