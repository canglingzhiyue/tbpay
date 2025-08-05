package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.performance.UmbrellaProcessTracker;
import com.alibaba.android.umbrella.performance.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.i;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class lav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f30439a;
    private static Map<d, Map<String, a>> b;
    private static volatile boolean c;
    private static Map<d, a> d;

    static {
        kge.a(521117399);
        f30439a = "Page_HomePage";
        b = new ConcurrentHashMap();
        c = false;
        d = new ConcurrentHashMap();
    }

    public static void a(d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3489010", new Object[]{dVar, str, str2});
        } else if (c || dVar == null || TextUtils.isEmpty(str)) {
        } else {
            Map<String, a> map = b.get(dVar);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                b.put(dVar, map);
            }
            a aVar = new a();
            aVar.f30440a = str;
            aVar.b = System.currentTimeMillis();
            aVar.d = 0L;
            aVar.e = str2;
            map.put(str, aVar);
        }
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2528fc", new Object[]{dVar});
        } else if (c || dVar == null) {
        } else {
            a aVar = d.get(dVar);
            if (aVar == null) {
                aVar = new a();
                d.put(dVar, aVar);
            }
            aVar.b = System.currentTimeMillis();
            aVar.d = 0L;
        }
    }

    public static void b(d dVar) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaec2fd", new Object[]{dVar});
        } else if (c || dVar == null || (aVar = d.get(dVar)) == null || aVar.d > 0) {
        } else {
            aVar.c = System.currentTimeMillis();
            if (aVar.b > 0) {
                aVar.d = aVar.c - aVar.b;
                e.b("TimeProfiler", "TimeProfiler " + f30439a + " " + dVar.a() + " CostTime " + aVar.d + "ms");
                return;
            }
            d.remove(dVar);
        }
    }

    public static void b(d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab34fd91", new Object[]{dVar, str, str2});
        } else if (c) {
        } else {
            Map<String, a> map = b.get(dVar);
            if (map == null) {
                e.b("TimeProfiler", "None Start process " + dVar.a());
                return;
            }
            a aVar = map.get(str);
            if (aVar == null) {
                e.b("TimeProfiler", "None Start method " + str);
                return;
            }
            aVar.e = str2;
            if (aVar.d > 0) {
                return;
            }
            aVar.c = System.currentTimeMillis();
            if (aVar.b > 0) {
                aVar.d = aVar.c - aVar.b;
            } else {
                b.remove(str);
            }
        }
    }

    public static void a(long j) {
        Map<String, a> map;
        Iterator<String> it;
        IpChange ipChange = $ipChange;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else if (!c) {
            c = true;
            UmbrellaProcessTracker.register("Page_HomePage");
            UmbrellaProcessTracker.addPageLoad("Page_HomePage", j);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = 0;
            for (d dVar : b.keySet()) {
                Map<String, a> map2 = b.get(dVar);
                Iterator<String> it2 = map2.keySet().iterator();
                int i = 0;
                while (it2.hasNext()) {
                    String next = it2.next();
                    a aVar = map2.get(next);
                    if (!TextUtils.isEmpty(aVar.f30440a)) {
                        Object[] objArr = new Object[5];
                        objArr[c2] = aVar.f30440a;
                        objArr[1] = aVar.e;
                        objArr[2] = Long.valueOf(aVar.b);
                        map = map2;
                        it = it2;
                        objArr[3] = Long.valueOf(aVar.c);
                        objArr[4] = Long.valueOf(aVar.d);
                        String format = String.format("method=%s,desc=%s , startTime=%d,endTime=%d,cost=%d", objArr);
                        if (TextUtils.isEmpty(aVar.e)) {
                            UmbrellaProcessTracker.addSubProcess("Page_HomePage", dVar, next, aVar.d);
                        } else {
                            UmbrellaProcessTracker.addSubProcess("Page_HomePage", dVar, next + "_" + aVar.e, aVar.d);
                        }
                        e.b("TimeProfiler", format);
                        i = (int) (i + aVar.d);
                    } else {
                        map = map2;
                        it = it2;
                    }
                    map2 = map;
                    it2 = it;
                    c2 = 0;
                }
                if (dVar == d.SUB_BIND_VIEW || dVar == d.SUB_CREATE_VIEW) {
                    j2 += i;
                } else {
                    UmbrellaProcessTracker.addProcess("Page_HomePage", dVar, i);
                }
                e.b("TimeProfiler", String.format("process=%s,cost=%d", dVar.a(), Integer.valueOf(i)));
                c2 = 0;
            }
            if (j2 >= 0) {
                UmbrellaProcessTracker.addProcess("Page_HomePage", d.DRAWVIEW, j2);
            }
            for (d dVar2 : d.keySet()) {
                a aVar2 = d.get(dVar2);
                if (aVar2.d > 0) {
                    UmbrellaProcessTracker.addProcess("Page_HomePage", dVar2, aVar2.d);
                }
            }
            String str = "all dump time =" + (System.currentTimeMillis() - currentTimeMillis);
            UmbrellaProcessTracker.setChildBizName("Page_HomePage", i.a());
            UmbrellaProcessTracker.commit("Page_HomePage");
            b.clear();
            d.clear();
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f30440a;
        public long b;
        public long c;
        public long d;
        public String e;

        static {
            kge.a(-2094451863);
        }

        private a() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MethodName =" + this.f30440a + " CostTime =" + this.d + "ms\r\n";
        }
    }
}
