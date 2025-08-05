package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.b;
import com.tanx.exposer.d;
import java.util.Map;

/* loaded from: classes4.dex */
public class dgx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-366033838);
    }

    public static void a(String str, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a5f021", new Object[]{str, map, new Boolean(z)});
            return;
        }
        dha.a(str, map);
        b d = d.a().d();
        if (d == null) {
            return;
        }
        if (z && d.h()) {
            return;
        }
        d.e().a(str, map);
    }
}
