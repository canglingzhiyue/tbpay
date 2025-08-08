package android.taobao.windvane.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import java.util.Map;
import tb.adj;
import tb.kge;
import tb.mys;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-403784220);
    }

    public static com.taobao.analysis.v3.n a(String str, String str2, adj adjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.analysis.v3.n) ipChange.ipc$dispatch("74b430e4", new Object[]{str, str2, adjVar});
        }
        if (adjVar != null) {
            return a(str, str2, adjVar.c());
        }
        m.c("FullTraceUtils", "falcoSpan=null " + a.a(new Exception().fillInStackTrace()));
        return null;
    }

    public static com.taobao.analysis.v3.n a(String str, String str2, mys mysVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.analysis.v3.n) ipChange.ipc$dispatch("f196b084", new Object[]{str, str2, mysVar});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar == null) {
                return null;
            }
            r.a a2 = rVar.a(str, str2);
            if (mysVar != null) {
                a2.a(mysVar);
            } else {
                m.c("FullTraceUtils", "spanContext=null " + a.a(new Exception().fillInStackTrace()));
            }
            return a2.b();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static com.taobao.analysis.v3.n a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.analysis.v3.n) ipChange.ipc$dispatch("523e78c0", new Object[]{str, str2, map});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar == null) {
                return null;
            }
            r.a a2 = rVar.a(str, str2);
            if (map != null) {
                mys a3 = rVar.a(map);
                if (a3 != null) {
                    a2.a(a3);
                } else {
                    m.c("FullTraceUtils", "openTracingContextMap=" + map);
                }
            } else {
                m.c("FullTraceUtils", "openTracingContextMap==null ");
            }
            return a2.b();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void a(com.taobao.analysis.v3.n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57198885", new Object[]{nVar, str});
            return;
        }
        b(nVar, str);
        if (nVar == null) {
            return;
        }
        if (StringUtils.isEmpty(str)) {
            nVar.c();
        } else {
            nVar.b(str);
        }
    }

    public static void b(com.taobao.analysis.v3.n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a32286", new Object[]{nVar, str});
        } else {
            a(nVar, str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void a(com.taobao.analysis.v3.n nVar, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0a16c4", new Object[]{nVar, str, l});
        } else if (nVar == null) {
        } else {
            a(l, nVar, str);
            nVar.f("{\"H5Stage\":\"" + str + "\",\"time\":\"" + l + "\"}");
        }
    }

    public static void b(com.taobao.analysis.v3.n nVar, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc98ec5", new Object[]{nVar, str, l});
        } else if (nVar == null) {
        } else {
            a(l, nVar, str);
            nVar.f("{\"H5CustomStage\":\"" + str + "\",\"time\":\"" + l + "\"}");
        }
    }

    private static void a(Long l, com.taobao.analysis.v3.n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1617ce44", new Object[]{l, nVar, str});
            return;
        }
        try {
            com.taobao.analysis.v3.p c = nVar.c(str);
            c.a(l);
            c.b(l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(Long l, adj adjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bfdfda", new Object[]{l, adjVar, str});
            return;
        }
        try {
            com.taobao.analysis.v3.p d = adjVar.d(str);
            d.a(l);
            d.b(l);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(adj adjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b614585b", new Object[]{adjVar, str});
        } else {
            a(adjVar, str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void a(adj adjVar, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61867a9a", new Object[]{adjVar, str, l});
        } else if (adjVar == null) {
        } else {
            a(l, adjVar, str);
            adjVar.b("{\"H5Stage\":\"" + str + "\",\"time\":\"" + l + "\"}");
        }
    }

    public static void a(adj adjVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9044165", new Object[]{adjVar, str, str2});
        } else if (adjVar == null) {
        } else {
            adjVar.a(str, str2);
        }
    }
}
