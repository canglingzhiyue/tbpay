package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.gateway.dispatch.a;
import com.taobao.tao.homepage.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class oqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, JSONObject> f32273a;

    static {
        kge.a(-1766652351);
        f32273a = new HashMap(4);
    }

    public static void a(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        f32273a.put(str, jSONObject);
        a.b().e(new Runnable() { // from class: tb.oqb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str2 = "passParams_" + str;
                JSONObject jSONObject2 = jSONObject;
                c.a.b("home_pass_params", str2, jSONObject2 == null ? "" : jSONObject2.toJSONString());
            }
        });
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            JSONObject jSONObject = f32273a.get(str);
            if (jSONObject != null) {
                return jSONObject;
            }
            JSONObject parseObject = JSON.parseObject(c.a.a("home_pass_params", "passParams_" + str, ""));
            if (parseObject != null && !parseObject.isEmpty()) {
                return parseObject;
            }
            ope f = d.f(str);
            if (f == null) {
                return null;
            }
            return f.h(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
