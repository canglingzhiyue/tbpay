package com.taobao.tao.flexbox.layoutmanager.ac;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.AnimationModule;
import com.taobao.tao.flexbox.layoutmanager.module.AnyThread;
import com.taobao.tao.flexbox.layoutmanager.module.AppModule;
import com.taobao.tao.flexbox.layoutmanager.module.CleanAnnotation;
import com.taobao.tao.flexbox.layoutmanager.module.ElementModule;
import com.taobao.tao.flexbox.layoutmanager.module.MonitorModule;
import com.taobao.tao.flexbox.layoutmanager.module.NavModule;
import com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule;
import com.taobao.tao.flexbox.layoutmanager.module.NetModule;
import com.taobao.tao.flexbox.layoutmanager.module.NotifyModule;
import com.taobao.tao.flexbox.layoutmanager.module.ScreenModule;
import com.taobao.tao.flexbox.layoutmanager.module.StorageModule;
import com.taobao.tao.flexbox.layoutmanager.module.TintModule;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f19925a;

    static {
        kge.a(-1970139981);
        f19925a = new HashMap();
        a("$app", AppModule.class);
        a("$naviBar", NavigationBarModule.class);
        a("$navigator", NavModule.class);
        a("$", TNodeActionServiceMgrModule.class);
        a("$tracker", TrackerModule.class);
        a("$notify", NotifyModule.class);
        a("$storage", StorageModule.class);
        a("$animation", AnimationModule.class);
        a("$screen", ScreenModule.class);
        a("$element", ElementModule.class);
        a("$monitor", MonitorModule.class);
        a("$net", NetModule.class);
        a("$tint", TintModule.class);
    }

    /* loaded from: classes8.dex */
    public static class a implements Cloneable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f19926a;
        public String b;
        public String c;
        public Class d;
        public boolean e;
        public boolean f = false;
        public String g = null;

        static {
            kge.a(1849523691);
            kge.a(-723128125);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c842b45b", new Object[]{this});
            }
            try {
                return (a) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static a a(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("11438d25", new Object[]{str});
        }
        synchronized (f19925a) {
            aVar = f19925a.get(str);
        }
        return aVar;
    }

    public static void a(String str, Class cls) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
            return;
        }
        a aVar = new a();
        aVar.d = cls;
        if (cls.getAnnotation(AnyThread.class) == null) {
            z = false;
        }
        aVar.f = z;
        CleanAnnotation cleanAnnotation = (CleanAnnotation) cls.getAnnotation(CleanAnnotation.class);
        aVar.g = cleanAnnotation != null ? cleanAnnotation.name() : null;
        synchronized (f19925a) {
            f19925a.put(str, aVar);
        }
    }

    public static void a(ab abVar) {
        Class<?> cls;
        synchronized (f19925a) {
            for (a aVar : f19925a.values()) {
                if (aVar.g != null) {
                    if (aVar.d != null) {
                        cls = aVar.d;
                    } else {
                        if (aVar.c != null) {
                            try {
                                cls = Class.forName(aVar.c);
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                        cls = null;
                    }
                    if (cls != null) {
                        try {
                            try {
                                Method method = cls.getMethod(aVar.g, ab.class);
                                if (method != null) {
                                    method.invoke(null, abVar);
                                }
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e3.printStackTrace();
                            }
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
