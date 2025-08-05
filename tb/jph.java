package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class jph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f29672a;

    static {
        kge.a(1248494353);
        String str = "(?!@subdata\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})";
        f29672a = Pattern.compile("@subdata\\{" + str + "[a-zA-Z()\\. \\_\\-\\[\\]0-9]*" + str + "\\," + str + "[a-zA-Z()\\. \\_\\-\\[\\]0-9]*" + str + "\\}");
    }

    public static Object a(JSONObject jSONObject, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6b92c6c4", new Object[]{jSONObject, obj, str});
        }
        if (jSONObject == null || obj == null) {
            return null;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    entry.setValue(a(jSONObject, entry.getValue(), str));
                }
                return jSONObject2;
            }
            boolean z = obj instanceof JSONArray;
            JSONArray jSONArray = obj;
            if (z) {
                JSONArray jSONArray2 = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray2.iterator();
                while (it.hasNext()) {
                    Object a2 = a(jSONObject, it.next(), str);
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
        StringBuilder sb = new StringBuilder((String) obj);
        while (true) {
            Matcher matcher = f29672a.matcher(sb);
            if (!matcher.find()) {
                return sb.toString();
            }
            int start = matcher.start();
            int end = matcher.end();
            sb.length();
            String group = matcher.group();
            if (group != null) {
                String[] split = group.substring(9, group.length() - 1).split(",");
                String str2 = "";
                String trim = (split.length <= 0 || split[0] == null) ? str2 : split[0].trim();
                String trim2 = (split.length <= 1 || split[1] == null) ? str2 : split[1].trim();
                Object a3 = jpd.a(jSONObject, "${" + (TextUtils.isEmpty(trim2) ? trim + riy.ARRAY_START_STR + str + riy.ARRAY_END_STR : trim + riy.ARRAY_START_STR + str + riy.ARRAY_END_STR + "." + trim2) + riy.BLOCK_END_STR);
                if (a3 != null) {
                    str2 = a3.toString();
                }
                sb.replace(start, end, str2);
            }
        }
    }
}
