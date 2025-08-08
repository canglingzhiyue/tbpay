package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class osf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32359a;
    private static boolean b;
    private static List<String> c;
    private static List<String> d;

    static {
        kge.a(-610625703);
        f32359a = false;
        b = false;
        c = null;
        d = null;
    }

    public static boolean a(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f885f733", new Object[]{osmVar})).booleanValue();
        }
        if (osmVar != null && osmVar.f() != null) {
            return b(osmVar.f());
        }
        return false;
    }

    public static boolean b(osm osmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e708fdb4", new Object[]{osmVar})).booleanValue();
        }
        if (osmVar != null && osmVar.f() != null) {
            return a(osmVar.f());
        }
        return false;
    }

    private static boolean a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1b1abf9", new Object[]{kskVar})).booleanValue();
        }
        if (d == null) {
            d = new ArrayList();
            String f = j.f();
            if (!StringUtils.isEmpty(f)) {
                d.addAll(Arrays.asList(f.split(",")));
            }
        }
        List<String> list = d;
        return (list == null || kskVar == null || !list.contains(kskVar.b)) ? false : true;
    }

    private static boolean b(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e034b27a", new Object[]{kskVar})).booleanValue();
        }
        if (c == null) {
            c = new ArrayList();
            String g = j.g();
            if (!StringUtils.isEmpty(g)) {
                c.addAll(Arrays.asList(g.split(",")));
            }
        }
        if (c != null && kskVar != null && kskVar.b.equals("cart")) {
            return c.contains("cartWindVane");
        }
        List<String> list = c;
        return (list == null || kskVar == null || !list.contains(kskVar.b)) ? false : true;
    }
}
