package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, String> f10959a;
    private static final List<String> b;
    private static final Map<String, Map<String, Long>> c;
    private static final Map<String, Map<String, Long>> d;
    private static final Map<String, Map<String, Long>> e;

    static {
        kge.a(1749146610);
        f10959a = new ConcurrentHashMap(0);
        b = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.utils.PerformanceUtils$1
            {
                add("preRenderHeaderEnd");
                add("renderHeaderEnd");
                add("refreshLayout");
                add("refreshLayoutEnd");
                add("preRenderHeader");
                add("renderHeader");
                add(InputFrame3.TYPE_RESPONSE);
            }
        };
        c = new ConcurrentHashMap(0);
        d = new ConcurrentHashMap(0);
        e = new ConcurrentHashMap(0);
    }

    public static void a(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf0e14", new Object[]{eyxVar});
            return;
        }
        int hashCode = eyxVar.g().hashCode();
        String a2 = eyxVar.e().a();
        f10959a.put(Integer.valueOf(hashCode), a2);
        a(a2);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        if (c.get(str) == null) {
            c.put(str, Collections.synchronizedMap(new LinkedHashMap()));
        }
        if (d.get(str) == null) {
            d.put(str, Collections.synchronizedMap(new LinkedHashMap()));
        }
        if (e.get(str) != null) {
            return;
        }
        e.put(str, Collections.synchronizedMap(new LinkedHashMap()));
    }

    public static Map<String, Long> b(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4585fe0a", new Object[]{eyxVar}) : c.get(eyxVar.e().a());
    }

    public static Map<String, Long> c(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7ed70ecb", new Object[]{eyxVar}) : d.get(eyxVar.e().a());
    }

    public static Map<String, Long> d(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b8281f8c", new Object[]{eyxVar}) : e.get(eyxVar.e().a());
    }

    public static void b(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49a9fdb", new Object[]{context, str, new Long(j)});
            return;
        }
        String str2 = f10959a.get(Integer.valueOf(context.hashCode()));
        if (str2 == null) {
            return;
        }
        a(str2, str, j);
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map<String, Long> map = e.get(str);
        if (map == null) {
            return;
        }
        if (b.contains(str2) && map.containsKey(str2)) {
            return;
        }
        map.put(str2, Long.valueOf(j));
    }

    public static void a(eyx eyxVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80f77a6", new Object[]{eyxVar, str, new Long(j)});
            return;
        }
        String a2 = eyxVar.e().a();
        if (a2 == null) {
            return;
        }
        a(a2, str, j);
    }

    public static void d(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ea3825", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map<String, Long> map = e.get(str);
        if (map == null) {
            return;
        }
        Long l = map.get(str2);
        if (l != null) {
            j += l.longValue();
        }
        map.put(str2, Long.valueOf(j));
    }

    public static void d(eyx eyxVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a03743", new Object[]{eyxVar, str, new Long(j)});
            return;
        }
        String a2 = eyxVar.e().a();
        if (a2 == null) {
            return;
        }
        d(a2, str, j);
    }

    public static void b(String str, String str2, long j) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fcde7", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map<String, Long> map = d.get(str);
        if (map != null) {
            long j2 = 0;
            Long l2 = map.get(str2);
            if (l2 != null) {
                j2 = l2.longValue();
            }
            Map<String, Long> map2 = c.get(str);
            if (map2 != null && (l = map2.get(str2)) != null) {
                j2 += j - l.longValue();
            }
            map.put(str2, Long.valueOf(j2));
        }
        c(str, str2, j);
    }

    public static void b(eyx eyxVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603fb785", new Object[]{eyxVar, str, new Long(j)});
        } else {
            b(eyxVar.e().a(), str, j);
        }
    }

    public static void a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, str, new Long(j)});
            return;
        }
        String str2 = f10959a.get(Integer.valueOf(context.hashCode()));
        if (str2 == null) {
            return;
        }
        c(str2, str, j);
    }

    public static void c(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c850306", new Object[]{str, str2, new Long(j)});
            return;
        }
        Map<String, Long> map = c.get(str);
        if (map == null) {
            return;
        }
        if (b.contains(str2) && map.containsKey(str2)) {
            return;
        }
        map.put(str2, Long.valueOf(j));
    }

    public static void c(eyx eyxVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86ff764", new Object[]{eyxVar, str, new Long(j)});
            return;
        }
        String a2 = eyxVar.e().a();
        if (a2 == null) {
            return;
        }
        c(a2, str, j);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        c.remove(str);
        d.remove(str);
        e.remove(str);
    }

    public static void e(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1db2818", new Object[]{eyxVar});
            return;
        }
        f10959a.remove(Integer.valueOf(eyxVar.g().hashCode()));
        b(eyxVar.e().a());
    }
}
