package com.taobao.android.lightvane.jsbridge;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.gwo;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f13293a;

    static {
        kge.a(-748230115);
        f13293a = new ConcurrentHashMap();
    }

    public static void a(String str, Class<? extends c> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e0a6e9", new Object[]{str, cls, new Boolean(z)});
        } else {
            a(str, cls, z, f13293a);
        }
    }

    private static void a(String str, Class<? extends c> cls, boolean z, Map<String, a> map) {
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
            gwo.a(6, "LVPluginManager", "HY_REGISTERPLUGIN:" + str + "::" + cls.getName());
        }
    }

    public static c a(String str, Context context, com.taobao.android.lightvane.webview.a aVar) {
        Class<?> loadClass;
        a aVar2 = f13293a.get(str);
        if (aVar2 == null || aVar2.a() == null) {
            gwo.a(6, "LVPluginManager", "create plugin failed, plugin not register or empty, " + str);
            return null;
        }
        String a2 = aVar2.a();
        try {
            ClassLoader b = aVar2.b();
            if (b == null) {
                loadClass = Class.forName(a2);
            } else {
                loadClass = b.loadClass(a2);
            }
        } catch (Exception e) {
            gwo.a(6, "LVPluginManager", "create plugin error: " + str + e.getMessage());
            e.printStackTrace();
        }
        if (loadClass != null && c.class.isAssignableFrom(loadClass)) {
            c cVar = (c) loadClass.newInstance();
            cVar.initialize(context, aVar, a.a(aVar2), str);
            return cVar;
        }
        gwo.a(6, "LVPluginManager", "create plugin failed: " + str);
        return null;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f13294a;
        private ClassLoader b;
        private Object c;

        static {
            kge.a(-360804654);
        }

        public static /* synthetic */ Object a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dfc7e96b", new Object[]{aVar}) : aVar.c;
        }

        public a(String str, ClassLoader classLoader) {
            this.f13294a = str;
            this.b = classLoader;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f13294a;
        }

        public ClassLoader b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("795c1c83", new Object[]{this}) : this.b;
        }
    }
}
