package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ifz;

/* loaded from: classes6.dex */
public class tdh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(657083498);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            ifz.a(ifz.a.b("pageModeMonitor").c(str).c("c1", str2).a(0.01f));
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put("requestPrams", (Object) str);
            }
            if (str3 != null) {
                jSONObject.put("message", (Object) str3);
            }
            if (str4 != null) {
                jSONObject.put("traceId", (Object) str4);
            }
            ifz.a("downgradeToH5", jSONObject.toJSONString());
        } catch (Throwable unused) {
        }
    }

    public static void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    jSONObject.put("c1", (Object) ((JSONObject) obj).toJSONString());
                } else if (obj instanceof String) {
                    jSONObject.put("c1", (Object) ((String) obj));
                }
            }
            ifz.a(ifz.a.b("preloadDataTracker").a(jSONObject.toJSONString()).c(str).a(1.0f));
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            ifz.a(ifz.a.b("buyFragment").c("PV").a("Fragment_PV").a(0.01f));
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            ifz.a(ifz.a.b("buyFragment").a(str2).c(str).a(1.0f));
        }
    }
}
