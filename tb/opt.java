package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.dispatch.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class opt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, JSONObject> f32268a;

    static {
        kge.a(2078442897);
        f32268a = new HashMap();
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
        } else if (jSONObject.equals(f32268a.get(str))) {
        } else {
            f32268a.put(str, jSONObject);
            b(str, jSONObject);
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        JSONObject c = c(str);
        if (c == null) {
            lap.a("recmdPrefetch", "PrefetchRequestConfig", "optimizationConfig == null");
            return null;
        }
        return c.getString("optimizeType");
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        JSONObject c = c(str);
        if (c == null) {
            lap.a("recmdPrefetch", "PrefetchRequestConfig", "optimizationConfig == null");
            return -1;
        }
        return c.getIntValue("orderNumThreshold");
    }

    private static JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c68059d4", new Object[]{str});
        }
        JSONObject jSONObject = f32268a.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject d = d(str);
        f32268a.put(str, d);
        return d;
    }

    private static JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{str});
        }
        String b = osk.b("after_buy_optimization_config".concat(str), "");
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(b)) {
            lap.a("recmdPrefetch", "PrefetchRequestConfig", "从磁盘中读出来的数为空");
            return jSONObject;
        }
        try {
            return JSON.parseObject(b);
        } catch (Exception e) {
            lap.a("recmdPrefetch", "PrefetchRequestConfig", "解析出现异常：" + e);
            return jSONObject;
        }
    }

    private static void b(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{str, jSONObject});
        } else {
            a.b().a(new Runnable() { // from class: tb.opt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String concat = "after_buy_optimization_config".concat(str);
                    JSONObject jSONObject2 = jSONObject;
                    osk.a(concat, jSONObject2 != null ? jSONObject2.toJSONString() : "");
                }
            });
        }
    }
}
