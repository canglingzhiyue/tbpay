package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import tb.mto;

/* loaded from: classes3.dex */
public class csv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26499a;

    static {
        kge.a(187882219);
        f26499a = false;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f26499a) {
        } else {
            f26499a = true;
            cox.a("PLT_AutoDetect", "autodetect_data", Arrays.asList("ratio", "distance"), Collections.singletonList("validQuery"));
        }
    }

    public static void a(double d, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d0fdac", new Object[]{new Double(d), new Double(d2), new Boolean(z)});
            return;
        }
        a();
        if (d < mto.a.GEO_NOT_SUPPORT || d2 < mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ratio", Double.valueOf(d));
        hashMap.put("distance", Double.valueOf(d2));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("validQuery", String.valueOf(z));
        cox.a("PLT_AutoDetect", "autodetect_data", hashMap, hashMap2);
    }
}
