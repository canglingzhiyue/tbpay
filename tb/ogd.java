package tb;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class ogd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f32023a;
    private static final Pattern b;
    private static final HashMap<String, Object> c;

    static {
        kge.a(-694736002);
        f32023a = Pattern.compile("\\{\\{([^\\{\\}]+)\\}\\}");
        b = Pattern.compile("\\{\\{(.+?)(\\|.+?)?\\}\\}");
        c = new HashMap<>();
    }

    public static Object a(JSONObject jSONObject, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("805a9220", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        String[] split = str.split("\\.");
        JSONObject jSONObject2 = jSONObject;
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (str2.contains(riy.ARRAY_START_STR)) {
                int indexOf = str2.indexOf(91);
                String substring = str2.substring(0, indexOf);
                int parseInt = Integer.parseInt(str2.substring(indexOf + 1, str2.length() - 1));
                if (i == split.length - 1) {
                    return jSONObject2.getJSONArray(substring).get(parseInt);
                }
                jSONObject2 = (JSONObject) jSONObject2.getJSONArray(substring).get(parseInt);
            } else if (i == split.length - 1) {
                if (jSONObject2.containsKey(str2)) {
                    return jSONObject2.get(str2);
                }
                throw new JSONException("getAttribute: " + str + "  " + str2 + " not exist");
            } else {
                jSONObject2 = jSONObject2.getJSONObject(str2);
                if (jSONObject2 == null) {
                    ogg.c("getAttribute: " + str + "  " + str2 + " not exist");
                    throw new JSONException("getAttribute: " + str + "  " + str2 + " not exist");
                }
            }
        }
        return null;
    }
}
