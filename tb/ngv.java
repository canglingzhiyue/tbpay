package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class ngv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31450a;
    private final List<String> b;
    private Pattern c;
    private ngo d;

    static {
        kge.a(-1370966930);
        f31450a = ngv.class.getSimpleName();
    }

    public ngv() {
        this.b = new ArrayList();
        this.b.add("queryParams");
        this.b.add("url");
        this.b.add("cookie");
        this.b.add("env");
        this.b.add(WXStorageModule.NAME);
        this.b.add("ttid");
        this.b.add("utdid");
        a();
    }

    public ngv(ngo ngoVar) {
        this();
        this.d = ngoVar;
    }

    private static String a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e49249dd", new Object[]{str, list});
        }
        if (list == null || list.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = Pattern.compile("\\$\\{(" + a("|", this.b) + ")(\\.(\\w|-)+)?\\}");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b.add(str);
        a();
    }

    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        ngo ngoVar = this.d;
        if (ngoVar == null) {
            ngr.b(f31450a, "No default DataSource Provided");
            return jSONObject;
        }
        return a(jSONObject, ngoVar);
    }

    public JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{this, jSONArray});
        }
        ngo ngoVar = this.d;
        if (ngoVar == null) {
            ngr.b(f31450a, "No default DataSource Provided");
            return jSONArray;
        }
        return a(jSONArray, ngoVar);
    }

    public JSONObject a(JSONObject jSONObject, ngo ngoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8016ff82", new Object[]{this, jSONObject, ngoVar});
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String a2 = a(key, ngoVar);
                Object value = entry.getValue();
                if (value != null && !a2.equals("")) {
                    if (a(value)) {
                        jSONObject2.put(a2, (Object) a(value.toString(), ngoVar));
                    } else if (value instanceof JSONObject) {
                        jSONObject2.put(a2, (Object) a((JSONObject) value, ngoVar));
                    } else if (value instanceof JSONArray) {
                        jSONObject2.put(a2, (Object) a((JSONArray) value, ngoVar));
                    } else {
                        ngr.b(f31450a, "unsupported type");
                    }
                }
            }
        }
        return jSONObject2;
    }

    public String a(String str, ngo ngoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ccf8b14", new Object[]{this, str, ngoVar});
        }
        Matcher matcher = this.c.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String a2 = ngoVar.a(matcher.group());
            if (a2 == null) {
                a2 = "";
            }
            matcher.appendReplacement(stringBuffer, a2);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public JSONArray a(JSONArray jSONArray, ngo ngoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("97c64e94", new Object[]{this, jSONArray, ngoVar});
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                if (a(obj)) {
                    jSONArray2.add(a(obj.toString(), ngoVar));
                } else if (obj instanceof JSONObject) {
                    jSONArray2.add(a((JSONObject) obj, ngoVar));
                } else if (obj instanceof JSONArray) {
                    jSONArray2.add(a((JSONArray) obj, ngoVar));
                } else {
                    ngr.b(f31450a, "unsupported type");
                }
            }
        }
        return jSONArray2;
    }

    private static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue() : (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof String);
    }
}
