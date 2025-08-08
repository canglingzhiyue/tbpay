package android.taobao.windvane.embed;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedViewContainer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, C0014a> f1584a;

    static {
        kge.a(-1447826365);
        f1584a = new ConcurrentHashMap();
    }

    public static ArrayList<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[0]);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : f1584a.keySet()) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static void a(String str, Class<? extends BaseEmbedView> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e0a6e9", new Object[]{str, cls, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || cls == null) {
        } else {
            ClassLoader classLoader = null;
            if (z) {
                classLoader = cls.getClassLoader();
            }
            C0014a c0014a = new C0014a(cls.getName(), classLoader);
            if (f1584a.containsKey(str)) {
                m.e("WVEVManager", "new view:[" + cls.getSimpleName() + "] will overlap the old view [" + f1584a.get(str).b() + riy.ARRAY_END_STR);
            }
            f1584a.put(str, c0014a);
        }
    }

    public static C0014a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0014a) ipChange.ipc$dispatch("c39b117f", new Object[]{str}) : f1584a.get(str);
    }

    public static BaseEmbedView a(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig) {
        Class<?> loadClass;
        C0014a a2 = a(str2);
        if (a2 == null) {
            a(str2, iWVWebView, -1);
            m.e("WVEVManager", "no register view with type:[" + str2 + riy.ARRAY_END_STR);
            return null;
        }
        try {
            ClassLoader a3 = a2.a();
            if (a3 == null) {
                loadClass = Class.forName(a2.b());
            } else {
                loadClass = a3.loadClass(a2.b());
            }
            if (loadClass != null && BaseEmbedView.class.isAssignableFrom(loadClass)) {
                BaseEmbedView baseEmbedView = (BaseEmbedView) loadClass.newInstance();
                if (baseEmbedView.init(str, str2, iWVWebView, embedViewConfig)) {
                    a(str2, iWVWebView);
                    return baseEmbedView;
                }
                a(str2, iWVWebView, 1);
                m.e("WVEVManager", "type check error, required type:[" + baseEmbedView.getViewType() + "], real type:[" + str2 + riy.ARRAY_END_STR);
            } else {
                a(str2, iWVWebView, 2);
                m.e("WVEVManager", "no class found");
            }
        } catch (Throwable th) {
            a(str2, iWVWebView, 3);
            m.e("WVEVManager", "create embed view error, type:" + str2 + " | msg:" + th.getMessage());
        }
        return null;
    }

    public static BaseEmbedView a(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        Class<?> loadClass;
        C0014a a2 = a(str2);
        if (a2 == null) {
            a(str2, iWVWebView, -1);
            m.e("WVEVManager", "no register view with type:[" + str2 + riy.ARRAY_END_STR);
            return null;
        }
        try {
            ClassLoader a3 = a2.a();
            if (a3 == null) {
                loadClass = Class.forName(a2.b());
            } else {
                loadClass = a3.loadClass(a2.b());
            }
            if (loadClass != null && BaseEmbedView.class.isAssignableFrom(loadClass)) {
                BaseEmbedView baseEmbedView = (BaseEmbedView) loadClass.newInstance();
                if (baseEmbedView.init(str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer)) {
                    a(str2, iWVWebView);
                    return baseEmbedView;
                }
                a(str2, iWVWebView, 1);
                m.e("WVEVManager", "type check error, required type:[" + baseEmbedView.getViewType() + "], real type:[" + str2 + riy.ARRAY_END_STR);
            } else {
                a(str2, iWVWebView, 2);
                m.e("WVEVManager", "no class found");
            }
        } catch (Throwable th) {
            a(str2, iWVWebView, 3);
            m.e("WVEVManager", "create embed view error, type:" + str2 + " | msg:" + th.getMessage());
        }
        return null;
    }

    private static void a(final String str, final IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5837c8d6", new Object[]{str, iWVWebView});
            return;
        }
        Runnable runnable = new Runnable() { // from class: android.taobao.windvane.embed.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str2 = null;
                try {
                    if (IWVWebView.this != null) {
                        str2 = IWVWebView.this.getUrl();
                    }
                    android.taobao.windvane.monitor.a.commitSuccess(android.taobao.windvane.monitor.a.MONITOR_POINT_EMBED_VIEW, str + "|" + str2);
                } catch (Throwable th) {
                    m.e("WVEVManager", "commit ev log fail" + th.getMessage());
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private static void a(final String str, final IWVWebView iWVWebView, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec1c4ed", new Object[]{str, iWVWebView, new Integer(i)});
            return;
        }
        Runnable runnable = new Runnable() { // from class: android.taobao.windvane.embed.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str2 = null;
                try {
                    if (IWVWebView.this != null) {
                        str2 = IWVWebView.this.getUrl();
                    }
                    android.taobao.windvane.monitor.a.commitFail(android.taobao.windvane.monitor.a.MONITOR_POINT_EMBED_VIEW, i, str, str2);
                } catch (Throwable th) {
                    m.e("WVEVManager", "commit ev log fail" + th.getMessage());
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: android.taobao.windvane.embed.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0014a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f1587a;
        private ClassLoader b;

        static {
            kge.a(-507952148);
        }

        public C0014a(String str, ClassLoader classLoader) {
            this.f1587a = str;
            this.b = classLoader;
        }

        public ClassLoader a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("400b0bc2", new Object[]{this}) : this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f1587a;
        }
    }
}
