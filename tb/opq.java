package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.dispatch.a;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class opq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f32264a;

    static {
        kge.a(-1403226188);
        f32264a = new HashMap();
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!ObjectUtils.a(f32264a.get(key), value)) {
                a(key, value);
                f32264a.putAll(map);
            }
        }
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        String str2 = f32264a.get(str);
        if (str2 == null) {
            str2 = osk.b(str, "");
            f32264a.put(str, str2);
        }
        return JSON.parseObject(str2);
    }

    private static void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a.b().a(new Runnable() { // from class: tb.opq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        osk.a(str, str2);
                    }
                }
            });
        }
    }
}
