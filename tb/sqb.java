package tb;

import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class sqb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEV_TOOLS_CLASS_NAME = "com.taobao.android.fluid.devtools.DevToolsService";
    public static final String FLUID_SDK_CLASS_NAME = "com.taobao.android.fluid.FluidSDK";
    public static final String FLUID_SDK_FULL_PAGE_CLASS_NAME = "com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage";
    public static final String FLUID_SDK_FULL_PAGE_WAKE_CHAIN_LAUNCHER_CLASS_NAME = "com.taobao.android.fluid.framework.preload.launcher.FullPageWakeChainLauncher";
    public static final String FLUID_SDK_SHOP_VIDEO_CARD_COMPONENT_CLASS_NAME = "com.taobao.android.fluid.framework.hostcontainer.triver.ShopVideoCardComponent";
    public static final String FLUID_SDK_TB_GUANG_PICK_PRELOAD_MODULE_CLASS_NAME = "com.taobao.android.fluid.framework.preload.launcher.TBGuangPickPreloadModule";
    public static final String FLUID_SDK_TB_VIDEO_COMPONENT_CLASS_NAME = "com.taobao.android.fluid.framework.hostcontainer.tnode.component.TBVideoListComponent";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<?>> f33839a;
    private static final Map<String, Class<?>> b;
    private static double c;
    private static Boolean d;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(Class<?> cls);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z);
    }

    public static /* synthetic */ double a(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d2)})).doubleValue();
        }
        c = d2;
        return d2;
    }

    public static /* synthetic */ Boolean a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("42f93c22", new Object[]{bool});
        }
        d = bool;
        return bool;
    }

    public static /* synthetic */ double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[0])).doubleValue() : c;
    }

    public static /* synthetic */ Boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("ce72322a", new Object[0]) : d;
    }

    public static /* synthetic */ Map h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[0]) : b;
    }

    static {
        kge.a(-2111790734);
        f33839a = new HashMap();
        b = new HashMap();
        c = -1.0d;
    }

    public static void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ad4216", new Object[]{bVar});
            return;
        }
        Boolean bool = d;
        if (bool == null) {
            spz.c("FluidRemoteLoader", "异步，FluidSDK 开始加载入口类");
            a("com.taobao.android.fluid.remote.FluidRemoteVersion", new a() { // from class: tb.sqb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sqb.a
                public void a(Class<?> cls) {
                    if (cls != null) {
                        spz.c("FluidRemoteLoader", "异步，FluidSDK 加载远程服务成功：" + cls);
                        try {
                            sqb.a(((Double) cls.getMethod("getFluidRemoteVersion", new Class[0]).invoke(null, new Object[0])).doubleValue());
                            spz.c("FluidRemoteLoader", "异步，FluidSDK 获取远程服务版本号成功：" + sqb.b());
                        } catch (InvocationTargetException e) {
                            spz.a("FluidRemoteLoader", "异步，FluidSDK 获取远程模块版本号失败", e.getTargetException());
                        } catch (Exception e2) {
                            spz.a("FluidRemoteLoader", "异步，FluidSDK 获取远程模块版本号失败", e2);
                        }
                        sqb.a((Boolean) true);
                    } else {
                        spz.c("FluidRemoteLoader", "异步，FluidSDK 加载远程服务失败");
                        sqb.a((Boolean) false);
                    }
                    b bVar2 = b.this;
                    if (bVar2 != null) {
                        bVar2.a(sqb.f().booleanValue());
                    }
                }

                @Override // tb.sqb.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    spz.c("FluidRemoteLoader", "异步，FluidSDK 获取远程模块版本号失败 onClassNotFound");
                    sqb.a((Boolean) false);
                    b bVar2 = b.this;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a(sqb.f().booleanValue());
                }
            });
        } else if (bVar == null) {
        } else {
            bVar.a(bool.booleanValue());
        }
    }

    public static Class<?> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5d842d15", new Object[0]);
        }
        if (b.containsKey(FLUID_SDK_CLASS_NAME)) {
            spz.c("FluidRemoteLoader", "FluidSDK 从缓存中获取远程类: com.taobao.android.fluid.FluidSDK");
            return b.get(FLUID_SDK_CLASS_NAME);
        }
        Class<?> a2 = a(FLUID_SDK_CLASS_NAME);
        if (a2 == null) {
            spz.c("FluidRemoteLoader", "FluidSDK 加载失败");
            return null;
        }
        spz.c("FluidRemoteLoader", "FluidSDK 加载成功：" + a2);
        return a2;
    }

    public static Class<?> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[0]) : a(FLUID_SDK_TB_VIDEO_COMPONENT_CLASS_NAME);
    }

    public static Class<?> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("834f0d98", new Object[0]) : a(FLUID_SDK_TB_GUANG_PICK_PRELOAD_MODULE_CLASS_NAME);
    }

    public static Class<?> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("8fe80319", new Object[0]) : a(FLUID_SDK_FULL_PAGE_CLASS_NAME);
    }

    public static Class<?> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("a919ee1b", new Object[0]) : a(FLUID_SDK_SHOP_VIDEO_CARD_COMPONENT_CLASS_NAME);
    }

    public static Class<?> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("582938df", new Object[]{str}) : a(str, true);
    }

    public static Class<?> a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("eb2f798f", new Object[]{str, new Boolean(z)});
        }
        if (f33839a.containsKey(str)) {
            spz.c("FluidRemoteLoader", "FluidSDK 从缓存中获取本地类: " + str);
            return f33839a.get(str);
        }
        try {
            Class<?> cls = Class.forName(str);
            f33839a.put(str, cls);
            spz.c("FluidRemoteLoader", "FluidSDK 加载本地类: " + str);
            return cls;
        } catch (Exception e) {
            if (!z) {
                return null;
            }
            spz.a("FluidRemoteLoader", "FluidSDK 加载本地类失败：" + str, e);
            return null;
        }
    }

    public static Class<?> b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("212a3020", new Object[]{str});
        }
        if (b.containsKey(str)) {
            spz.c("FluidRemoteLoader", "FluidSDK 从缓存中获取远程类: " + str);
            return b.get(str);
        }
        try {
            Class<?> cls = Class.forName(str, true, c.class.getClassLoader());
            b.put(str, cls);
            spz.c("FluidRemoteLoader", "FluidSDK 加载远程类，已找到：" + str);
            return cls;
        } catch (ClassNotFoundException unused) {
            spz.c("FluidRemoteLoader", "FluidSDK 加载远程类，未找到，触发远程类下载: " + str);
            a(str, new a() { // from class: tb.sqb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sqb.a
                public void a(Class<?> cls2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20fa47d5", new Object[]{this, cls2});
                        return;
                    }
                    spz.c("FluidRemoteLoader", "FluidSDK 加载远程类加载成功：" + str);
                    sqb.a((Boolean) true);
                }

                @Override // tb.sqb.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    spz.c("FluidRemoteLoader", "FluidSDK 加载远程类加载失败：" + str);
                }
            });
            return null;
        }
    }

    public static void a(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd0f901", new Object[]{str, aVar});
        } else if (b.containsKey(str)) {
            spz.c("FluidRemoteLoader", "FluidSDK 从缓存中获取远程类: " + str);
            if (aVar == null) {
                return;
            }
            aVar.a(b.get(str));
        } else {
            c.a(str, new c.a() { // from class: tb.sqb.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(final Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                    } else if (cls != null) {
                        oec.a(new Runnable() { // from class: tb.sqb.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                sqb.h().put(str, cls);
                                if (aVar == null) {
                                    return;
                                }
                                aVar.a(cls);
                                spz.c("FluidRemoteLoader", "FluidSDK 加载远程类加载成功：" + str);
                            }
                        }, true);
                    } else {
                        spz.c("FluidRemoteLoader", "FluidSDK 加载远程类失败：" + str);
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                        return;
                    }
                    spz.c("FluidRemoteLoader", "FluidSDK 加载远程类失败：" + str);
                    oec.a(new Runnable() { // from class: tb.sqb.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (aVar == null) {
                            } else {
                                aVar.a();
                            }
                        }
                    }, true);
                }
            });
        }
    }
}
