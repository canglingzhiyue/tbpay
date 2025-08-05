package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes2.dex */
public final class fhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fhz INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, JSONObject> f27964a;

    static {
        kge.a(-1827051140);
        INSTANCE = new fhz();
        f27964a = new LinkedHashMap();
    }

    private fhz() {
    }

    @JvmStatic
    public static final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject a2 = a("dxAlertTemplate");
        if (a2 == null) {
            a2 = new JSONObject();
            a2.put("url", (Object) "https://dinamicx.alibabausercontent.com/pre/alert_ability_ui_new/1718682866657/alert_ability_ui_new.zip");
            a2.put("version", (Object) "1");
        }
        a2.put("name", (Object) "alert_ability_ui_new");
        return a2;
    }

    @JvmStatic
    public static final JSONObject a(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{key});
        }
        q.d(key, "key");
        String a2 = amh.a(key, null);
        if (a2 != null && f27964a.containsKey(a2)) {
            return f27964a.get(a2);
        }
        List b = a2 != null ? n.b((CharSequence) a2, new String[]{","}, false, 0, 6, (Object) null) : null;
        if (b == null || b.size() < 2) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", b.get(0));
        jSONObject.put("version", b.get(1));
        f27964a.put(a2, jSONObject);
        return jSONObject;
    }
}
