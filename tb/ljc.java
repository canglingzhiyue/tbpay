package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ljc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(196820822);
    }

    public static void a(ljb ljbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e399b4", new Object[]{ljbVar});
            return;
        }
        String a2 = ljbVar.a();
        String b = ljbVar.b();
        Map<String, String> b2 = b(ljbVar);
        ldk.a(a2, b, "2.0", "InfoFlow", "InfoFlow", b2, ljbVar.c() + "", ljbVar.d());
        ldf.d("InfoFlowMonitorUtils", "commitError : " + ljbVar.toString());
    }

    private static Map<String, String> b(ljb ljbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a96db1aa", new Object[]{ljbVar});
        }
        String e = ljbVar.e();
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("reason", e);
        return hashMap;
    }
}
