package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.util.f;

/* loaded from: classes7.dex */
public class the {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1427598154);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int c = f.c();
        return c != 1 ? c != 2 ? c != 3 ? "unknown" : "excellent" : "normal" : "poor";
    }
}
