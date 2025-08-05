package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class jpy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1003241485);
    }

    public static Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2724e", new Object[]{jSONObject, obj}) : a(jSONObject, obj, null);
    }

    public static Object a(JSONObject jSONObject, Object obj, a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e23eac61", new Object[]{jSONObject, obj, aVarArr});
        }
        if ((jSONObject == null && aVarArr == null) || obj == null) {
            return obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            Object a2 = jpe.a((Object) jSONObject, str);
            if (str.startsWith("$") && str.equals(a2) && aVarArr != null) {
                for (a aVar : aVarArr) {
                    if (aVar != null && aVar.b != null) {
                        a2 = aVar.a(aVar.c, str);
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

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Pattern b;
        public Object c;

        static {
            kge.a(538304685);
        }

        public a(Pattern pattern, Object obj) {
            this.b = pattern;
            this.c = obj;
        }

        public Object a(Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a12221e4", new Object[]{this, obj, str});
            }
            if (this.b == null || obj == null || str == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            Matcher matcher = this.b.matcher(sb);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                int length = sb.length();
                Object a2 = jpd.a(obj, matcher.group());
                if (start == 0 && end == length) {
                    return a2;
                }
                sb.replace(start, end, a2 == null ? "" : a2.toString());
                matcher = this.b.matcher(sb);
            }
            return sb.toString();
        }
    }
}
