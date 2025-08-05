package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.taobaoavsdk.util.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class slq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NO_NEED_NETWORK_SPEED = "1";

    static {
        kge.a(-1446697126);
    }

    public static a.C0494a a(sps spsVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.C0494a) ipChange.ipc$dispatch("30b066db", new Object[]{spsVar, str, map}) : new a.C0494a(spsVar).c().a(str).a(map).e(spsVar.b).d("POST");
    }

    public static c.a a(sps spsVar, String str, boolean z, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("76d56edc", new Object[]{spsVar, str, new Boolean(z), new Boolean(z2), str2}) : a(a(spsVar, str), spsVar, z, z2, str2);
    }

    public static String a(sps spsVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7297b91d", new Object[]{spsVar, map});
        }
        if (b()) {
            return b(spsVar, map);
        }
        return c(spsVar, map);
    }

    private static String b(sps spsVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d387b9e", new Object[]{spsVar, map});
        }
        Map a2 = (spsVar == null || TextUtils.isEmpty(spsVar.i)) ? null : obz.a(spsVar.i);
        if (ogv.a(a2)) {
            a2 = map;
        } else if (!ogv.a(map)) {
            a2.putAll(map);
        }
        return obz.a(a2);
    }

    private static String c(sps spsVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7d93e1f", new Object[]{spsVar, map});
        }
        if (spsVar == null || TextUtils.isEmpty(spsVar.i)) {
            return null;
        }
        if (map == null || map.isEmpty()) {
            return spsVar.i;
        }
        Map a2 = obz.a(spsVar.i);
        if (a2 == null) {
            a2 = map;
        } else if (map != null) {
            a2.putAll(map);
        }
        return obz.a(a2);
    }

    private static c.a a(sps spsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("da966566", new Object[]{spsVar, str});
        }
        int a2 = f.a();
        boolean e = skk.e();
        HashMap hashMap = new HashMap();
        hashMap.put(c.KEY_TAB3COMPONENTSOURCE, str);
        hashMap.put(c.KEY_ISAUTOSLIDE, Boolean.valueOf(sij.a("false")));
        hashMap.put(c.KEY_VERTICAL_LAYOUT, Boolean.valueOf(sjt.u()));
        return new c().a(spsVar).b().a(a2).c(e).a(hashMap);
    }

    private static c.a a(c.a aVar, sps spsVar, boolean z, boolean z2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("9c46aeea", new Object[]{aVar, spsVar, new Boolean(z), new Boolean(z2), str});
        }
        if (aVar == null) {
            aVar = new c.a(spsVar);
        }
        if (!z && !z2) {
            try {
                if (a()) {
                    String a2 = skk.d() ? obz.a(gwe.a()) : null;
                    if (sll.a(spsVar) && jcs.f()) {
                        str2 = sll.b();
                        if (!TextUtils.isEmpty(str2)) {
                            spz.c("DetailParams", "buildDetailParams refreshType=" + str + " ;lbsString=" + a2 + " ;bxFeature=" + str2);
                            aVar.b(a2).c(str).a(str2);
                        }
                    }
                    str2 = null;
                    spz.c("DetailParams", "buildDetailParams refreshType=" + str + " ;lbsString=" + a2 + " ;bxFeature=" + str2);
                    aVar.b(a2).c(str).a(str2);
                }
            } catch (Throwable unused) {
            }
        }
        aVar.b(z2);
        return aVar;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableDetailRequestBxParams", true);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableDetailParametersNullable", true);
    }
}
