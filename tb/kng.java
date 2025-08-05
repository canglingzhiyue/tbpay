package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1199230622);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        opi.a();
        lap.a("recmdPrefetch", "MyTaoBaoOccasionNotify", "进入我淘了");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        opi.b();
        lap.a("recmdPrefetch", "MyTaoBaoOccasionNotify", "离开我淘了");
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        opi.a(jSONObject);
        lap.a("recmdPrefetch", "MyTaoBaoOccasionNotify", "我淘接口请求回来了");
    }
}
