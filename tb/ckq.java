package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ckq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        synchronized (ckq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f5f4589a", new Object[]{context, map});
            }
            HashMap hashMap = new HashMap();
            String a2 = cjw.a(map, "tid", "");
            String a3 = cjw.a(map, "utdid", "");
            String a4 = cjw.a(map, "userId", "");
            String a5 = cjw.a(map, "appName", "");
            String a6 = cjw.a(map, "appKeyClient", "");
            String a7 = cjw.a(map, "tmxSessionId", "");
            String f = clb.f(context);
            String a8 = cjw.a(map, "sessionId", "");
            hashMap.put("AC1", a2);
            hashMap.put("AC2", a3);
            hashMap.put("AC3", "");
            hashMap.put("AC4", f);
            hashMap.put("AC5", a4);
            hashMap.put("AC6", a7);
            hashMap.put("AC7", "");
            hashMap.put("AC8", a5);
            hashMap.put("AC9", a6);
            if (cjw.b(a8)) {
                hashMap.put("AC10", a8);
            }
            return hashMap;
        }
    }
}
