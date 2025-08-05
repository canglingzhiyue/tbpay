package com.taobao.appbundle.runtime;

import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.k;
import com.alibaba.android.split.u;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleListing;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;
import com.taobao.appbundle.fake.FakeProvider;
import com.taobao.appbundle.fake.FakeService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.gve;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public final class AppBundleComponentFactory extends AppComponentFactory {
    public static final Companion Companion;
    private static final List<Companion.ComponentInterceptor> componentInterceptors;
    private static final Map<String, c.b> featureComponentDowngradeInterceptors;
    private static final HashMap<String, c.InterfaceC0628c> featureComponentLoaderMap;
    private String componentName;

    @JvmStatic
    public static final void registerComponentDowngradeListener(String str, c.b bVar) {
        Companion.registerComponentDowngradeListener(str, bVar);
    }

    @JvmStatic
    public static final boolean registerInterceptor(Companion.ComponentInterceptor componentInterceptor) {
        return Companion.registerInterceptor(componentInterceptor);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes6.dex */
        public interface ComponentInterceptor {
            Component intercept(Component component);
        }

        static {
            kge.a(-1064835230);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* loaded from: classes6.dex */
        public static final class Component {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private ClassLoader cl;
            private String className;
            private Intent intent;

            static {
                kge.a(-554386917);
            }

            public static /* synthetic */ Component copy$default(Component component, ClassLoader classLoader, String str, Intent intent, int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Component) ipChange.ipc$dispatch("c6cb7c0f", new Object[]{component, classLoader, str, intent, new Integer(i), obj});
                }
                if ((i & 1) != 0) {
                    classLoader = component.cl;
                }
                if ((i & 2) != 0) {
                    str = component.className;
                }
                if ((i & 4) != 0) {
                    intent = component.intent;
                }
                return component.copy(classLoader, str, intent);
            }

            public final ClassLoader component1() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("4e4b9475", new Object[]{this}) : this.cl;
            }

            public final String component2() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4803344", new Object[]{this}) : this.className;
            }

            public final Intent component3() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("992b7816", new Object[]{this}) : this.intent;
            }

            public final Component copy(ClassLoader cl, String className, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Component) ipChange.ipc$dispatch("b9ff3535", new Object[]{this, cl, className, intent});
                }
                q.d(cl, "cl");
                q.d(className, "className");
                return new Component(cl, className, intent);
            }

            public boolean equals(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
                }
                if (this != obj) {
                    if (obj instanceof Component) {
                        Component component = (Component) obj;
                        if (!q.a(this.cl, component.cl) || !q.a((Object) this.className, (Object) component.className) || !q.a(this.intent, component.intent)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                IpChange ipChange = $ipChange;
                int i = 0;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
                }
                ClassLoader classLoader = this.cl;
                int hashCode = (classLoader != null ? classLoader.hashCode() : 0) * 31;
                String str = this.className;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                Intent intent = this.intent;
                if (intent != null) {
                    i = intent.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "Component(cl=" + this.cl + ", className=" + this.className + ", intent=" + this.intent + riy.BRACKET_END_STR;
            }

            public Component(ClassLoader cl, String className, Intent intent) {
                q.d(cl, "cl");
                q.d(className, "className");
                this.cl = cl;
                this.className = className;
                this.intent = intent;
            }

            public final ClassLoader getCl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("23378440", new Object[]{this}) : this.cl;
            }

            public final String getClassName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this}) : this.className;
            }

            public final Intent getIntent() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this}) : this.intent;
            }

            public final void setCl(ClassLoader classLoader) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f688b2b8", new Object[]{this, classLoader});
                    return;
                }
                q.d(classLoader, "<set-?>");
                this.cl = classLoader;
            }

            public final void setClassName(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("373579b2", new Object[]{this, str});
                    return;
                }
                q.d(str, "<set-?>");
                this.className = str;
            }

            public final void setIntent(Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f524bbe2", new Object[]{this, intent});
                } else {
                    this.intent = intent;
                }
            }
        }

        @JvmStatic
        public final void registerComponentDowngradeListener(String className, c.b featureComponentDowngradeInterceptor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5ac10ed", new Object[]{this, className, featureComponentDowngradeInterceptor});
                return;
            }
            q.d(className, "className");
            q.d(featureComponentDowngradeInterceptor, "featureComponentDowngradeInterceptor");
            AppBundleComponentFactory.featureComponentDowngradeInterceptors.put(className, featureComponentDowngradeInterceptor);
        }

        @JvmStatic
        public final boolean registerInterceptor(ComponentInterceptor interceptor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55925892", new Object[]{this, interceptor})).booleanValue();
            }
            q.d(interceptor, "interceptor");
            return AppBundleComponentFactory.componentInterceptors.add(interceptor);
        }

        public final void registerFeatureComponentLoader(String featureName, c.InterfaceC0628c featureComponentLoader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69ff339a", new Object[]{this, featureName, featureComponentLoader});
                return;
            }
            q.d(featureName, "featureName");
            q.d(featureComponentLoader, "featureComponentLoader");
            AppBundleComponentFactory.featureComponentLoaderMap.put(featureName, featureComponentLoader);
        }

        public final void unregisterFeatureComponentLoader(String featureName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("580ca307", new Object[]{this, featureName});
                return;
            }
            q.d(featureName, "featureName");
            AppBundleComponentFactory.featureComponentLoaderMap.remove(featureName);
        }
    }

    static {
        kge.a(1520792730);
        Companion = new Companion(null);
        featureComponentLoaderMap = new HashMap<>();
        componentInterceptors = new ArrayList();
        featureComponentDowngradeInterceptors = new LinkedHashMap();
    }

    @Override // android.app.AppComponentFactory
    public ClassLoader instantiateClassLoader(ClassLoader cl, ApplicationInfo aInfo) {
        q.d(cl, "cl");
        q.d(aInfo, "aInfo");
        return new InjectClassLoader("", cl);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8 A[Catch: Throwable -> 0x036a, TryCatch #1 {Throwable -> 0x036a, blocks: (B:19:0x00a2, B:21:0x00aa, B:30:0x00dc, B:32:0x00e8, B:34:0x00f4, B:36:0x00fa, B:38:0x010c, B:40:0x0113, B:41:0x014c, B:22:0x00b7, B:23:0x00bc, B:28:0x00c2, B:29:0x00c6, B:54:0x019b, B:56:0x01a1, B:58:0x01b4, B:60:0x01bc, B:47:0x0174, B:49:0x0180, B:50:0x0187, B:51:0x018f), top: B:142:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d6  */
    @Override // android.app.AppComponentFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Activity instantiateActivity(java.lang.ClassLoader r18, java.lang.String r19, android.content.Intent r20) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.appbundle.runtime.AppBundleComponentFactory.instantiateActivity(java.lang.ClassLoader, java.lang.String, android.content.Intent):android.app.Activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (r1 == null) goto L28;
     */
    @Override // android.app.AppComponentFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader r8, java.lang.String r9, android.content.Intent r10) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.appbundle.runtime.AppBundleComponentFactory.instantiateReceiver(java.lang.ClassLoader, java.lang.String, android.content.Intent):android.content.BroadcastReceiver");
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader cl, String className, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Service instantiateService;
        ComponentName component;
        c.b bVar;
        u a2;
        Application a3;
        Object[] array;
        c.InterfaceC0628c interfaceC0628c;
        q.d(cl, "cl");
        q.d(className, "className");
        this.componentName = className;
        try {
            ClassLoader classLoader = AppBundleComponentFactory.class.getClassLoader();
            q.a(classLoader);
            instantiateService = super.instantiateService(classLoader, className, intent);
            q.b(instantiateService, "super.instantiateService…     intent\n            )");
        } catch (Throwable th) {
            BundleListing.a m = b.a().m(className);
            if (m == null) {
                trackComponent("instantiateService", className);
                throw th;
            }
            Boolean bool = m.b;
            q.b(bool, "bundleInfo.dynamicFeature");
            if (bool.booleanValue()) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(m.d);
                arrayList.addAll(ModuleDependencyUtils.getDependencies(m.d));
                Log.e("AppBundleComponent", "deferredInstall " + m.d + " because " + className + " not found");
                try {
                    a2 = k.a();
                    a3 = c.Companion.a().a();
                    array = p.i((Iterable) arrayList).toArray(new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (array != null) {
                    String[] strArr = (String[]) array;
                    a2.a(a3, false, (String[]) Arrays.copyOf(strArr, strArr.length));
                    j h = j.h();
                    q.b(h, "SplitCompat.getInstance()");
                    ArrayList arrayList2 = arrayList;
                    if (h.f().containsAll(p.i((Iterable) arrayList2))) {
                        try {
                            ClassLoader classLoader2 = AppBundleComponentFactory.class.getClassLoader();
                            q.a(classLoader2);
                            Service instantiateService2 = super.instantiateService(classLoader2, className, intent);
                            q.b(instantiateService2, "super.instantiateService…                        )");
                            return instantiateService2;
                        } catch (ClassNotFoundException unused) {
                            g c = c.Companion.a().c();
                            if (c != null) {
                                c.a(p.i((Iterable) arrayList2));
                            }
                            if (featureComponentDowngradeInterceptors.containsKey(className)) {
                                featureComponentDowngradeInterceptors.get(className);
                                ComponentName componentName = null;
                                if (intent != null && (component = intent.getComponent()) != null && (bVar = featureComponentDowngradeInterceptors.get(className)) != null) {
                                    componentName = bVar.a(component);
                                }
                                if (componentName == null || q.a((Object) componentName.getClassName(), (Object) className)) {
                                    ClassLoader classLoader3 = AppBundleComponentFactory.class.getClassLoader();
                                    q.a(classLoader3);
                                    super.instantiateService(classLoader3, FakeService.class.getName(), intent);
                                } else {
                                    ClassLoader classLoader4 = AppBundleComponentFactory.class.getClassLoader();
                                    q.a(classLoader4);
                                    super.instantiateService(classLoader4, componentName.getClassName(), intent);
                                }
                            }
                            ClassLoader classLoader5 = AppBundleComponentFactory.class.getClassLoader();
                            q.a(classLoader5);
                            Service instantiateService3 = super.instantiateService(classLoader5, FakeService.class.getName(), intent);
                            q.b(instantiateService3, "super.instantiateService…                        )");
                            return instantiateService3;
                        }
                    }
                    g c2 = c.Companion.a().c();
                    if (c2 != null) {
                        c2.a(arrayList);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            ClassLoader classLoader6 = AppBundleComponentFactory.class.getClassLoader();
            q.a(classLoader6);
            instantiateService = super.instantiateService(classLoader6, FakeService.class.getName(), intent);
            q.b(instantiateService, "super.instantiateService…     intent\n            )");
        }
        BundleListing.a m2 = b.a().m(instantiateService.getClass().getName());
        if (m2 != null && featureComponentLoaderMap.get(m2.d) != null && (interfaceC0628c = featureComponentLoaderMap.get(m2.d)) != null) {
            interfaceC0628c.a(instantiateService.getClass().getName());
        }
        return instantiateService;
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader cl, String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        q.d(cl, "cl");
        q.d(className, "className");
        try {
            ClassLoader classLoader = AppBundleComponentFactory.class.getClassLoader();
            q.a(classLoader);
            ContentProvider instantiateProvider = super.instantiateProvider(classLoader, className);
            q.b(instantiateProvider, "super.instantiateProvide…  className\n            )");
            return instantiateProvider;
        } catch (ClassNotFoundException unused) {
            return new FakeProvider();
        }
    }

    private final void trackComponent(String str, String str2) {
        AppMonitor.Counter.commit(gve.MODULE, "ExceptionRecovery", "type=UncaughtException, componentType=" + str + ", className=" + str2, 1.0d);
    }
}
