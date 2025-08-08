package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.f;
import com.taobao.analysis.v3.g;
import com.taobao.analysis.v3.h;
import com.taobao.analysis.v3.n;
import com.taobao.analysis.v3.p;
import com.taobao.analysis.v3.r;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.exception.a;
import java.util.Map;

/* loaded from: classes5.dex */
public class fuz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1077854621);
    }

    public static h a(Map<String, String> map, String str, String str2) {
        r.a a2;
        mys a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("c6071ede", new Object[]{map, str, str2});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar == null || (a2 = rVar.a(str, str2)) == null) {
                return null;
            }
            if (map != null && (a3 = rVar.a(map)) != null) {
                a2.b(a3);
            }
            return a2.b();
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static h a(mys mysVar, String str, String str2) {
        r.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("fcf83c4a", new Object[]{mysVar, str, str2});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar == null || (a2 = rVar.a(str, str2)) == null) {
                return null;
            }
            if (mysVar != null) {
                a2.b(mysVar);
            }
            return a2.b();
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static g a(String str, String str2) {
        r.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("aca5b854", new Object[]{str, str2});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar != null && (a2 = rVar.a(str, str2)) != null) {
                return a2.c();
            }
            return null;
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static f b(Map<String, String> map, String str, String str2) {
        r.a a2;
        mys a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a68074a1", new Object[]{map, str, str2});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar == null || (a2 = rVar.a(str, str2)) == null) {
                return null;
            }
            if (map != null && (a3 = rVar.a(map)) != null) {
                a2.b(a3);
            }
            return a2.a();
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static f b(mys mysVar, String str, String str2) {
        r.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1769352b", new Object[]{mysVar, str, str2});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar == null || (a2 = rVar.a(str, str2)) == null) {
                return null;
            }
            if (mysVar != null) {
                a2.b(mysVar);
            }
            return a2.a();
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static Map<String, String> a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f610670", new Object[]{nVar});
        }
        try {
            r rVar = FalcoGlobalTracer.get();
            if (rVar != null && nVar != null) {
                return rVar.a(nVar.h());
            }
            return null;
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static void a(n nVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3117b0f", new Object[]{nVar, str, str2});
        } else if (nVar == null) {
        } else {
            try {
                nVar.a(str, str2);
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static void a(n nVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c17fedf", new Object[]{nVar, str, new Long(j)});
        } else if (nVar == null) {
        } else {
            try {
                nVar.a(str, Long.valueOf(j));
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static void b(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23befbc", new Object[]{nVar});
        } else if (nVar == null) {
        } else {
            try {
                nVar.k();
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static void c(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c724b7fd", new Object[]{nVar});
        } else if (nVar == null) {
        } else {
            try {
                nVar.c();
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static void a(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57198885", new Object[]{nVar, str});
        } else if (nVar == null || StringUtils.isEmpty(str)) {
        } else {
            try {
                nVar.a(str);
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static void b(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a32286", new Object[]{nVar, str});
        } else if (nVar == null) {
        } else {
            try {
                nVar.a("errorMsg", str);
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static Map<String, String> d(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2f434df3", new Object[]{nVar});
        }
        r rVar = FalcoGlobalTracer.get();
        if (rVar != null && nVar != null) {
            return rVar.a(nVar.h());
        }
        return null;
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue() : !StringUtils.isEmpty(dmo.a(jSONObject, "stage", ""));
    }

    public static p a(n nVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("34b31e32", new Object[]{nVar, jSONObject});
        }
        if (nVar != null) {
            try {
                if (a(jSONObject)) {
                    return nVar.c(dmo.a(jSONObject, "stage", ""));
                }
            } catch (Throwable th) {
                a.b(th);
            }
        }
        return null;
    }

    public static p e(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("ebeb57c8", new Object[]{nVar});
        }
        if (nVar == null) {
            return null;
        }
        try {
            return nVar.c("DXAbility");
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d541039", new Object[]{pVar});
        } else if (pVar == null) {
        } else {
            try {
                fuw.d("DXOpenTracerUtil", "startStage： " + pVar.a());
                pVar.a(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static void b(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23cd87a", new Object[]{pVar});
        } else if (pVar == null) {
        } else {
            try {
                fuw.d("DXOpenTracerUtil", "finishStage： " + pVar.a());
                pVar.b(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : bx.a();
    }
}
