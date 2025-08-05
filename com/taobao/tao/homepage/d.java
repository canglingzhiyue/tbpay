package com.taobao.tao.homepage;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ope;
import tb.oqc;
import tb.osn;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String DEFAULT_MSG_CENTER_HOMEPAGE;
    public static final String DEFAULT_RMD_DATA_SOURCE_HOMEPAGE;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, JSONObject> f20586a;
    private static int b;
    private static ope c;
    private static com.taobao.android.gateway.msgcenter.b d;
    private static osn e;
    private static HashMap<String, com.taobao.android.gateway.msgcenter.b> f;
    private static HashMap<String, com.taobao.android.gateway.msgcenter.b> g;
    private static HashMap<String, ope> h;
    private static HashMap<String, osn> i;

    @Deprecated
    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-1734814428);
        b = 0;
        f20586a = new HashMap(4);
        DEFAULT_MSG_CENTER_HOMEPAGE = null;
        DEFAULT_RMD_DATA_SOURCE_HOMEPAGE = null;
    }

    public static ope a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ope) ipChange.ipc$dispatch("f08cafa", new Object[0]) : c;
    }

    public static com.taobao.tao.recommend3.gateway.request.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.recommend3.gateway.request.c) ipChange.ipc$dispatch("7a8ef25a", new Object[0]) : oqc.a().k();
    }

    public static com.taobao.android.gateway.msgcenter.b b(String str) {
        HashMap<String, com.taobao.android.gateway.msgcenter.b> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.gateway.msgcenter.b) ipChange.ipc$dispatch("a28dad67", new Object[]{str});
        }
        if (str == null || (hashMap = f) == null || hashMap.get(str) == null) {
            return d;
        }
        return f.get(str);
    }

    public static com.taobao.android.gateway.msgcenter.b c(String str) {
        HashMap<String, com.taobao.android.gateway.msgcenter.b> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.gateway.msgcenter.b) ipChange.ipc$dispatch("36cc1d06", new Object[]{str});
        }
        if (str == null || (hashMap = g) == null || hashMap.get(str) == null) {
            return d;
        }
        return g.get(str);
    }

    public static synchronized void a(String str, com.taobao.android.gateway.msgcenter.b bVar) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4381f356", new Object[]{str, bVar});
                return;
            }
            if (f == null) {
                f = new HashMap<>();
            }
            f.put(str, bVar);
        }
    }

    public static synchronized void d(String str) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            } else if (f == null) {
            } else {
                f.remove(str);
            }
        }
    }

    public static synchronized void b(String str, com.taobao.android.gateway.msgcenter.b bVar) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37117797", new Object[]{str, bVar});
                return;
            }
            if (g == null) {
                g = new HashMap<>();
            }
            g.put(str, bVar);
        }
    }

    public static synchronized void e(String str) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            } else if (g == null) {
            } else {
                g.remove(str);
            }
        }
    }

    public static void a(com.taobao.android.gateway.msgcenter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4671258c", new Object[]{bVar});
        } else {
            d = bVar;
        }
    }

    public static ope f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ope) ipChange.ipc$dispatch("7fd2ce0b", new Object[]{str});
        }
        HashMap<String, ope> hashMap = h;
        if (hashMap == null || hashMap.get(str) == null) {
            return c;
        }
        return h.get(str);
    }

    public static synchronized void a(String str, ope opeVar) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3842837e", new Object[]{str, opeVar});
                return;
            }
            if (h == null) {
                h = new HashMap<>();
            }
            h.put(str, opeVar);
        }
    }

    public static synchronized void g(String str) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
            } else if (f == null) {
            } else {
                f.remove(str);
            }
        }
    }

    public static void a(ope opeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8580db4", new Object[]{opeVar});
        } else {
            c = opeVar;
        }
    }

    public static osn h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osn) ipChange.ipc$dispatch("812c31a3", new Object[]{str});
        }
        HomeInfoFlowDataService a2 = com.taobao.tao.infoflow.commonsubservice.dataservice.a.a(str);
        if (a2 != null) {
            return a2.getDataServiceWindVaneProvider();
        }
        HashMap<String, osn> hashMap = i;
        if (hashMap == null || hashMap.get(str) == null) {
            return e;
        }
        return i.get(str);
    }

    public static synchronized void a(String str, osn osnVar) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3870e158", new Object[]{str, osnVar});
                return;
            }
            if (i == null) {
                i = new HashMap<>();
            }
            i.put(str, osnVar);
        }
    }

    public static synchronized void i(String str) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4533163a", new Object[]{str});
            } else if (i == null) {
            } else {
                i.remove(str);
            }
        }
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else {
            b = i2;
        }
    }
}
