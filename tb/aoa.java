package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.p;
import com.alibaba.analytics.core.logbuilder.d;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.analytics.core.model.a;
import com.alibaba.analytics.core.sync.n;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class aoa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1673030092);
    }

    public static void a(Map<String, String> map) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        apr.b();
        if (map == null) {
            return;
        }
        String str = map.get(LogField.EVENTID.toString());
        if (!map.containsKey("_priority") && ("2201".equalsIgnoreCase(str) || "2202".equalsIgnoreCase(str))) {
            map.put("_priority", "4");
        }
        String remove = map.containsKey("_priority") ? map.remove("_priority") : "3";
        String b = d.a().b(str);
        if (!TextUtils.isEmpty(b)) {
            remove = b;
        }
        if (map.containsKey("_sls")) {
            map.remove("_sls");
            z = true;
        } else {
            z = false;
        }
        int a2 = p.a().d() ? p.a().a(map) : 0;
        a aVar = new a(remove, null, str, map);
        if (a2 > 0) {
            apr.b("", "topicId", Integer.valueOf(a2));
            aVar.a(a2);
            n.b().a(aVar);
        }
        if (z) {
            apf.a().b(aVar);
        } else {
            apf.a().a(aVar);
        }
    }
}
