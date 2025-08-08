package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.k;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, b> f27848a;
    private static int c;
    private static boolean d;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27849a = "default";
        public MtopRequestListener<String> b;

        static {
            kge.a(1930824763);
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public a f27850a;
        public c b;
        public d c;
        public List<String> d;

        static {
            kge.a(758317632);
        }
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public ApiID f27851a;
        public fem b;
        public List<String> c;
        public String d = "default";
        public String e = "beforeCompare";
        public long f = 0;
        public long g = 0;

        static {
            kge.a(-1337027651);
        }
    }

    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public MtopResponse f27852a;
        public String b;
        public long c;

        static {
            kge.a(1554749651);
        }
    }

    static {
        kge.a(-657365527);
        f27848a = new ConcurrentHashMap();
        emu.a("com.taobao.android.detail.wrapper.ext.prefetch.PrefetchDataManager");
    }

    public static void a(fem femVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243d777a", new Object[]{femVar, new Long(j)});
            return;
        }
        ebx c2 = femVar.c();
        if (c2 == null) {
            i.a(k.a("PrefetchDataManager"), "savePrefetchRequest failed, queryParams is null");
            return;
        }
        String valueOf = String.valueOf(c2.w);
        b a2 = a(valueOf);
        if (a2 == null) {
            a2 = new b();
        }
        a2.b = new c();
        a2.b.b = femVar;
        a2.b.c = eip.d;
        a2.b.f = j;
        f27848a.put(valueOf, a2);
        String a3 = k.a("PrefetchDataManager");
        i.c(a3, "savePrefetchRequest successfully, prefetchID = " + valueOf);
    }

    public static void a(ebx ebxVar, MtopRequestListener<String> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5af8f36", new Object[]{ebxVar, mtopRequestListener});
            return;
        }
        String valueOf = String.valueOf(ebxVar.w);
        b a2 = a(valueOf);
        if (a2 == null) {
            a2 = new b();
        }
        a2.f27850a = new a();
        a2.f27850a.f27849a = "start";
        a2.f27850a.b = mtopRequestListener;
        f27848a.put(valueOf, a2);
        String a3 = k.a("PrefetchDataManager");
        i.c(a3, "saveMainRequest successfully, prefetchID = " + valueOf);
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1d6fc1ef", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            i.a(k.a("PrefetchDataManager"), "requestID为空");
            return null;
        }
        return f27848a.get(str);
    }

    public static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456baa3b", new Object[]{str, dVar});
            return;
        }
        b a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.c = dVar;
    }

    public static String a(Map<String, String> map) {
        fem femVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "exception";
        }
        String str = map.get("NAV_TO_URL_START_UPTIME");
        b a2 = a(str);
        if (a2 == null) {
            String a3 = k.a("PrefetchDataManager");
            i.a(a3, "compare时，缓存中没有当前主请求对应的prefetchInfo, curID = " + str);
            return "diffPrefetchID";
        }
        c cVar = a2.b;
        if (cVar == null || (femVar = cVar.b) == null) {
            return "exception";
        }
        List<String> list = cVar.c;
        i.c(k.a("PrefetchDataManager"), "start compare");
        List<String> a4 = a(map, femVar.a(), list);
        boolean isEmpty = a4.isEmpty();
        cVar.e = "afterCompare";
        String a5 = k.a("PrefetchDataManager");
        i.c(a5, "end compare, isTheSame: " + isEmpty);
        if (isEmpty) {
            return "true";
        }
        c();
        a2.d = a4;
        String a6 = k.a("PrefetchDataManager");
        i.c(a6, "对比不同的参数: " + a4);
        return "diffParams";
    }

    public static List<String> a(Map<String, String> map, Map<String, String> map2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5d0c806e", new Object[]{map, map2, list});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (list == null || !list.contains(key)) {
                if (!StringUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    String str = map2.get(key);
                    if (!StringUtils.equals(value, str)) {
                        arrayList.add(key);
                        arrayList.add(value);
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        c++;
        int i = eip.e;
        if (c < i) {
            i.c(k.a("PrefetchDataManager"), "当前命中失败次数: " + c);
            return;
        }
        d = true;
        i.a(k.a("PrefetchDataManager"), "预请求未命中次数超过阈值: " + i);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : d;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (a(str) == null) {
        } else {
            f27848a.remove(str);
        }
    }
}
