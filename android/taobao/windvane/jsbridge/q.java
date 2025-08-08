package android.taobao.windvane.jsbridge;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_METHOD = "method";
    public static final String KEY_NAME = "name";
    private static final Map<String, e> b;
    private static final Map<String, a> c;
    private static final Map<IWVWebView, Map<String, a>> d;
    private static final Map<String, String> e;
    private static c f;
    private static q g;

    /* renamed from: a  reason: collision with root package name */
    public String f1672a = "WVDynamic";

    static {
        kge.a(-1322968542);
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        e = new ConcurrentHashMap();
        f = null;
    }

    public static q a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("50a3b3a5", new Object[0]);
        }
        if (g == null) {
            synchronized (q.class) {
                if (g == null) {
                    g = new q();
                }
            }
        }
        return g;
    }

    public static void a(String str, Class<? extends e> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else {
            a(str, cls, true);
        }
    }

    private static void a(String str, Class<? extends e> cls, boolean z, Map<String, a> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc13657c", new Object[]{str, cls, new Boolean(z), map});
        } else if (StringUtils.isEmpty(str) || cls == null) {
        } else {
            ClassLoader classLoader = null;
            if (z) {
                classLoader = cls.getClassLoader();
            }
            map.put(str, new a(cls.getName(), classLoader));
            android.taobao.windvane.util.m.e("WVPluginManager", "HY_REGISTERPLUGIN:" + str + "::" + cls.getName());
            if (android.taobao.windvane.monitor.o.getJsBridgeMonitor() == null) {
                return;
            }
            android.taobao.windvane.monitor.g jsBridgeMonitor = android.taobao.windvane.monitor.o.getJsBridgeMonitor();
            jsBridgeMonitor.onJsBridgeReturn("HY_REGISTERPLUGIN", "WVPluginManager", "HY_REGISTERPLUGIN", str + "::" + cls.getName(), "");
        }
    }

    public static void a(String str, Class<? extends e> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e0a6e9", new Object[]{str, cls, new Boolean(z)});
        } else {
            a(str, cls, z, c);
        }
    }

    @Deprecated
    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, str2, (ClassLoader) null);
        }
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("298a2a7e", new Object[]{str});
        }
        Map<String, a> map = c;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
            return;
        }
        try {
            if (!(obj instanceof e)) {
                return;
            }
            b.put(str, (e) obj);
        } catch (Throwable th) {
            android.taobao.windvane.util.m.b("WVPluginManager", "registerPlugin by Object error ", th, new Object[0]);
        }
    }

    @Deprecated
    public static void a(String str, String str2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42056e", new Object[]{str, str2, classLoader});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            c.put(str, new a(str2, classLoader));
            if (android.taobao.windvane.monitor.o.getJsBridgeMonitor() == null) {
                return;
            }
            android.taobao.windvane.monitor.g jsBridgeMonitor = android.taobao.windvane.monitor.o.getJsBridgeMonitor();
            jsBridgeMonitor.onJsBridgeReturn("HY_REGISTERPLUGIN", "", "HY_REGISTERPLUGIN", str + "::" + str2, "");
        }
    }

    public static void a(IWVWebView iWVWebView, String str, Class<? extends e> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f456f27", new Object[]{iWVWebView, str, cls});
        } else if (iWVWebView != null) {
            Map<String, a> map = d.get(iWVWebView);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                d.put(iWVWebView, map);
            }
            a(str, cls, true, map);
            android.taobao.windvane.util.m.c("WVPluginManager", "注册到局部API，使用范围=[" + iWVWebView.getClass().getSimpleName() + "],API=[" + str + "::" + cls.getSimpleName() + riy.ARRAY_END_STR);
        } else {
            a(str, cls);
        }
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec124ed", new Object[]{cVar});
        } else {
            f = cVar;
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else if (!c.containsKey(str3) || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            android.taobao.windvane.util.m.d("WVPluginManager", "registerAlias quit, this is no original plugin or alias is invalid.");
        } else if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str4)) {
        } else {
            e.put(str + "::" + str2, str3 + "::" + str4);
        }
    }

    public static Map<String, String> b(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebcaabf2", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            android.taobao.windvane.util.m.d("WVPluginManager", "getOriginalPlugin failed, alias is empty.");
            return null;
        }
        Map<String, String> map = e;
        String str3 = map.get(str + "::" + str2);
        if (StringUtils.isEmpty(str3) || (indexOf = str3.indexOf("::")) <= 0) {
            return null;
        }
        String substring = str3.substring(0, indexOf);
        String substring2 = str3.substring(indexOf + 2);
        HashMap hashMap = new HashMap();
        hashMap.put("name", substring);
        hashMap.put("method", substring2);
        return hashMap;
    }

    public static void a(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36f00c", new Object[]{iWVWebView});
        } else if (d.get(iWVWebView) == null) {
        } else {
            d.remove(iWVWebView);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (c.containsKey(str)) {
            c.remove(str);
        } else if (!b.containsKey(str)) {
        } else {
            b.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (android.text.StringUtils.isEmpty(r4) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.taobao.windvane.jsbridge.e a(java.lang.String r11, android.content.Context r12, android.taobao.windvane.webview.IWVWebView r13, android.taobao.windvane.extra.performance2.IPerformance r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.q.a(java.lang.String, android.content.Context, android.taobao.windvane.webview.IWVWebView, android.taobao.windvane.extra.performance2.IPerformance):android.taobao.windvane.jsbridge.e");
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            a(new c() { // from class: android.taobao.windvane.jsbridge.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.c
                public Class<? extends e> getBridgeClass(String str) {
                    ServiceInfo serviceInfo;
                    if (android.taobao.windvane.config.a.f != null && !StringUtils.isEmpty(str)) {
                        Intent intent = new Intent(str.contains(q.a().f1672a) ? q.a().f1672a : str);
                        intent.setPackage(android.taobao.windvane.config.a.f.getPackageName());
                        List<ResolveInfo> queryIntentServices = android.taobao.windvane.config.a.f.getPackageManager().queryIntentServices(intent, 4);
                        if (queryIntentServices != null && queryIntentServices.size() > 0 && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null && serviceInfo.name != null) {
                            try {
                                return ((c) android.taobao.windvane.config.a.f.getClassLoader().loadClass(serviceInfo.name).newInstance()).getBridgeClass(str);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                    return null;
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f1673a;
        private ClassLoader b;
        private Object c;

        static {
            kge.a(625306114);
        }

        public static /* synthetic */ Object a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7e713cf0", new Object[]{aVar}) : aVar.c;
        }

        public a(String str, ClassLoader classLoader) {
            this.f1673a = str;
            this.b = classLoader;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f1673a;
        }

        public ClassLoader b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("795c1c83", new Object[]{this}) : this.b;
        }
    }
}
