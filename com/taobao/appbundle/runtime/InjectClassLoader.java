package com.taobao.appbundle.runtime;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.k;
import com.alibaba.android.split.u;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.utils.RefectUtils;
import com.android.tools.bundleInfo.BundleListing;
import com.android.tools.bundleInfo.b;
import com.android.tools.ir.runtime.e;
import com.taobao.appbundle.c;
import com.taobao.appbundle.fake.FakeActivity;
import com.taobao.appbundle.fake.FakeReceiver;
import com.taobao.appbundle.fake.FakeService;
import com.taobao.appbundle.remote.activity.RemoteLoadingActivity;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class InjectClassLoader extends PathClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    private static final String TAG = "InjectClassLoader";
    private static final HashMap<String, c.InterfaceC0628c> featureComponentLoaderMap;
    private static String featureName;
    private Method methodFindResource;
    private Method methodFindResources;
    private final PathClassLoader originClassLoader;

    public static /* synthetic */ Object ipc$super(InjectClassLoader injectClassLoader, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1538227411) {
            if (hashCode == -1177425936) {
                return super.loadClass((String) objArr[0]);
            }
            if (hashCode != 2114946432) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.getPackage((String) objArr[0]);
        }
        return super.findLibrary((String) objArr[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InjectClassLoader(String dexPath, ClassLoader parent) {
        super(dexPath, parent);
        q.d(dexPath, "dexPath");
        q.d(parent, "parent");
        this.originClassLoader = (PathClassLoader) parent;
        try {
            this.methodFindResource = BaseDexClassLoader.class.getDeclaredMethod("findResource", String.class);
            Method method = this.methodFindResource;
            if (method != null) {
                method.setAccessible(true);
            }
            this.methodFindResources = BaseDexClassLoader.class.getDeclaredMethod("findResources", String.class);
            Method method2 = this.methodFindResources;
            if (method2 == null) {
                return;
            }
            method2.setAccessible(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ HashMap access$getFeatureComponentLoaderMap$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a18d5e8f", new Object[0]) : featureComponentLoaderMap;
    }

    public static final /* synthetic */ String access$getFeatureName$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("389b2bb3", new Object[0]) : featureName;
    }

    public static final /* synthetic */ void access$setFeatureName$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb966c23", new Object[]{str});
        } else {
            featureName = str;
        }
    }

    @Override // dalvik.system.BaseDexClassLoader
    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : getParent().toString();
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) {
        c.InterfaceC0628c interfaceC0628c;
        c.InterfaceC0628c interfaceC0628c2;
        c.InterfaceC0628c interfaceC0628c3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b9d1e7f0", new Object[]{this, str});
        }
        Class<?> clazz = super.loadClass(str);
        b a2 = b.a();
        q.b(clazz, "clazz");
        if (a2.s(clazz.getName())) {
            BundleListing.a l = b.a().l(clazz.getName());
            if (l != null) {
                if (featureComponentLoaderMap.get(l.d) != null && (interfaceC0628c3 = featureComponentLoaderMap.get(l.d)) != null) {
                    interfaceC0628c3.a(str);
                }
            } else {
                BundleListing.a m = b.a().m(clazz.getName());
                if (m != null) {
                    if (featureComponentLoaderMap.get(m.d) != null && (interfaceC0628c2 = featureComponentLoaderMap.get(m.d)) != null) {
                        interfaceC0628c2.a(str);
                    }
                } else {
                    BundleListing.a n = b.a().n(clazz.getName());
                    if (n != null && featureComponentLoaderMap.get(n.d) != null && (interfaceC0628c = featureComponentLoaderMap.get(n.d)) != null) {
                        interfaceC0628c.a(str);
                    }
                }
            }
        }
        return clazz;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String name) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, name});
        }
        q.d(name, "name");
        if (b.a().p(name)) {
            String f = b.a().f(name);
            if (StringUtils.isEmpty(f)) {
                throw new ClassNotFoundException(name);
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(f);
            u a2 = k.a();
            Application a3 = c.Companion.a().a();
            Object[] array = p.i((Iterable) arrayList).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                a2.a(a3, false, (String[]) Arrays.copyOf(strArr, strArr.length));
                try {
                    return Class.forName(name);
                } catch (Exception unused) {
                    throw new ClassNotFoundException(name);
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } else if (b.a().u(name)) {
            String e = b.a().e(name);
            if (StringUtils.isEmpty(e)) {
                throw new ClassNotFoundException(name);
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(e);
            u a4 = k.a();
            Application a5 = c.Companion.a().a();
            Object[] array2 = p.i((Iterable) arrayList2).toArray(new String[0]);
            if (array2 != null) {
                String[] strArr2 = (String[]) array2;
                a4.a(a5, false, (String[]) Arrays.copyOf(strArr2, strArr2.length));
                try {
                    return Class.forName(name);
                } catch (Exception unused2) {
                    throw new ClassNotFoundException(name);
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } else if (!b.a().s(name)) {
            throw new ClassNotFoundException(name);
        } else {
            if (b.a().o(name)) {
                BundleListing.a l = b.a().l(name);
                if (l == null) {
                    throw new ClassNotFoundException(name);
                }
                Boolean bool = l.b;
                q.b(bool, "bundleInfo.dynamicFeature");
                if (bool.booleanValue()) {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(l.d);
                    arrayList3.addAll(l.o);
                    Log.e(TAG, "deferredInstall " + l.d + " because " + name + " not found");
                    u a6 = k.a();
                    Application a7 = c.Companion.a().a();
                    ArrayList arrayList4 = arrayList3;
                    Object[] array3 = p.i((Iterable) arrayList4).toArray(new String[0]);
                    if (array3 != null) {
                        String[] strArr3 = (String[]) array3;
                        a6.a(a7, false, (String[]) Arrays.copyOf(strArr3, strArr3.length));
                        j h = j.h();
                        q.b(h, "com.alibaba.android.spli…SplitCompat.getInstance()");
                        if (h.f().containsAll(p.i((Iterable) arrayList4))) {
                            try {
                                return Class.forName(name);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                String str = l.d;
                                q.b(str, "bundleInfo.featureName");
                                featureName = str;
                                return RemoteLoadingActivity.class;
                            }
                        }
                        String str2 = l.d;
                        q.b(str2, "bundleInfo.featureName");
                        featureName = str2;
                        return FakeActivity.class;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return FakeActivity.class;
            } else if (b.a().q(name)) {
                BundleListing.a m = b.a().m(name);
                if (m == null) {
                    throw new ClassNotFoundException(name);
                }
                Boolean bool2 = m.b;
                q.b(bool2, "bundleInfo.dynamicFeature");
                if (bool2.booleanValue()) {
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayList5.add(m.d);
                    arrayList5.addAll(m.o);
                    Log.e(TAG, "deferredInstall " + m.d + " because " + name + " not found");
                    u a8 = k.a();
                    Application a9 = c.Companion.a().a();
                    ArrayList arrayList6 = arrayList5;
                    Object[] array4 = p.i((Iterable) arrayList6).toArray(new String[0]);
                    if (array4 != null) {
                        String[] strArr4 = (String[]) array4;
                        a8.a(a9, false, (String[]) Arrays.copyOf(strArr4, strArr4.length));
                        try {
                            return Class.forName(name);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            g c = c.Companion.a().c();
                            if (c != null) {
                                c.a(p.i((Iterable) arrayList6));
                            }
                            return FakeService.class;
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return FakeService.class;
            } else if (!b.a().r(name)) {
                return null;
            } else {
                BundleListing.a n = b.a().n(name);
                if (n == null) {
                    throw new ClassNotFoundException(name);
                }
                Boolean bool3 = n.b;
                q.b(bool3, "bundleInfo.dynamicFeature");
                if (bool3.booleanValue()) {
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(n.d);
                    arrayList7.addAll(n.o);
                    Log.e(TAG, "deferredInstall " + n.d + " because " + name + " not found");
                    u a10 = k.a();
                    Application a11 = c.Companion.a().a();
                    ArrayList arrayList8 = arrayList7;
                    Object[] array5 = p.i((Iterable) arrayList8).toArray(new String[0]);
                    if (array5 != null) {
                        String[] strArr5 = (String[]) array5;
                        a10.a(a11, false, (String[]) Arrays.copyOf(strArr5, strArr5.length));
                        try {
                            return Class.forName(name);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            g c2 = c.Companion.a().c();
                            if (c2 != null) {
                                c2.a(p.i((Iterable) arrayList8));
                            }
                            return FakeReceiver.class;
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return FakeReceiver.class;
            }
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URL) ipChange.ipc$dispatch("8e5461dd", new Object[]{this, str}) : invokeFindResource(str);
    }

    private final URL invokeFindResource(String str) {
        Method method = this.methodFindResource;
        return (URL) (method != null ? method.invoke(this.originClassLoader, str) : null);
    }

    private final Enumeration<URL> invokeFindResources(String str) {
        Method method = this.methodFindResources;
        Object invoke = method != null ? method.invoke(this.originClassLoader, str) : null;
        if (invoke != null) {
            return (Enumeration) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.Enumeration<java.net.URL>");
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Enumeration) ipChange.ipc$dispatch("93b5f2e7", new Object[]{this, str}) : invokeFindResources(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Package getPackage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Package) ipChange.ipc$dispatch("7e0f8580", new Object[]{this, str});
        }
        Package r0 = super.getPackage(str);
        if (r0 != null) {
            return r0;
        }
        Package definePackage = definePackage(str, "Unknown", "0.0", "Unknown", "Unknown", "0.0", "Unknown", null);
        q.b(definePackage, "definePackage(\n         …       null\n            )");
        return definePackage;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String name) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a450832d", new Object[]{this, name});
        }
        q.d(name, "name");
        String findLibrary = this.originClassLoader.findLibrary(name);
        if (findLibrary != null) {
            if (findLibrary.length() != 0) {
                z = false;
            }
            if (!z) {
                return findLibrary;
            }
        }
        String findLibrary2 = super.findLibrary(name);
        q.b(findLibrary2, "super.findLibrary(name)");
        return findLibrary2;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2129235148);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final HashMap<String, c.InterfaceC0628c> getFeatureComponentLoaderMap() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("7acbefd6", new Object[]{this}) : InjectClassLoader.access$getFeatureComponentLoaderMap$cp();
        }

        public final String getFeatureName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this}) : InjectClassLoader.access$getFeatureName$cp();
        }

        public final void setFeatureName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f67230", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            InjectClassLoader.access$setFeatureName$cp(str);
        }

        private final void reflectPackageInfoClassloader(Context context, ClassLoader classLoader) throws Exception {
            Object obj;
            try {
                obj = e.a(e.a(), context.getPackageName());
            } catch (Exception e) {
                e.printStackTrace();
                obj = null;
            }
            if (obj == null) {
                obj = RefectUtils.field(c.Companion.a().a(), "mLoadedApk");
            }
            if (obj != null) {
                Log.e(InjectClassLoader.TAG, "loaded_apk got success");
            }
            Field field = RefectUtils.field(obj, "mClassLoader");
            q.b(field, "field");
            field.setAccessible(true);
            try {
                field.set(obj, classLoader);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            Thread currentThread = Thread.currentThread();
            q.b(currentThread, "Thread.currentThread()");
            currentThread.setContextClassLoader(classLoader);
        }

        public final PathClassLoader inject(ClassLoader originalClassloader, Context appContext) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PathClassLoader) ipChange.ipc$dispatch("45feb1fb", new Object[]{this, originalClassloader, appContext});
            }
            q.d(originalClassloader, "originalClassloader");
            q.d(appContext, "appContext");
            InjectClassLoader injectClassLoader = new InjectClassLoader("", originalClassloader);
            reflectPackageInfoClassloader(appContext, injectClassLoader);
            Log.e(InjectClassLoader.TAG, "inject classLoader success");
            return injectClassLoader;
        }

        public final void registerFeatureComponentLoader(String featureName, c.InterfaceC0628c featureComponentLoader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69ff339a", new Object[]{this, featureName, featureComponentLoader});
                return;
            }
            q.d(featureName, "featureName");
            q.d(featureComponentLoader, "featureComponentLoader");
            getFeatureComponentLoaderMap().put(featureName, featureComponentLoader);
        }

        public final void unregisterFeatureComponentLoader(String featureName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("580ca307", new Object[]{this, featureName});
                return;
            }
            q.d(featureName, "featureName");
            getFeatureComponentLoaderMap().remove(featureName);
        }
    }

    static {
        kge.a(1772680836);
        Companion = new Companion(null);
        featureComponentLoaderMap = new HashMap<>();
        featureName = "";
    }
}
