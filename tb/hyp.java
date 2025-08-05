package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class hyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1188362361);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (f.c() == null) {
        } else {
            f.c().a(str, str2, map);
        }
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
        } else if (f.c() == null) {
        } else {
            f.c().b(str, str2, map);
        }
    }

    public static void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
        } else if (f.c() == null) {
        } else {
            String a2 = a(context);
            iac c = f.c();
            c.b(a2, a2 + str, map);
        }
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (f.c() == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("pageObject", obj);
            f.c().a(str, hashMap);
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : context instanceof bwx ? ((bwx) context).j() : "";
    }
}
