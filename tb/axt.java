package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class axt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Pattern f25680a;
        public Object b;

        static {
            kge.a(-100457932);
        }

        public Object a(Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a12221e4", new Object[]{this, obj, str});
            }
            if (this.f25680a == null || obj == null || str == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            while (true) {
                Matcher matcher = this.f25680a.matcher(sb);
                if (!matcher.find()) {
                    return sb.toString();
                }
                int start = matcher.start();
                int end = matcher.end();
                int length = sb.length();
                Object a2 = axr.a(obj, matcher.group());
                if (start == 0 && end == length) {
                    return a2;
                }
                sb.replace(start, end, a2 == null ? "" : a2.toString());
            }
        }
    }

    static {
        kge.a(908078284);
    }

    public static Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2724e", new Object[]{jSONObject, obj}) : a(jSONObject, obj, null);
    }

    public static Object a(JSONObject jSONObject, Object obj, a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a9a0700b", new Object[]{jSONObject, obj, aVarArr});
        }
        if ((jSONObject == null && aVarArr == null) || obj == null) {
            return obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            Object a2 = axs.a((Object) jSONObject, str);
            if (str.startsWith("$") && str.equals(a2) && aVarArr != null) {
                for (a aVar : aVarArr) {
                    if (aVar != null && aVar.f25680a != null) {
                        a2 = aVar.a(aVar.b, str);
                        if (!str.equals(a2)) {
                            break;
                        }
                    }
                }
            }
            return a2;
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, entry.getValue(), aVarArr));
            }
            return jSONObject2;
        } else {
            boolean z = obj instanceof JSONArray;
            JSONArray jSONArray = obj;
            if (z) {
                JSONArray jSONArray2 = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray2.iterator();
                while (it.hasNext()) {
                    Object a3 = a(jSONObject, it.next(), aVarArr);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                jSONArray2.clear();
                jSONArray2.addAll(arrayList);
                jSONArray = jSONArray2;
            }
            return jSONArray;
        }
    }
}
