package com.taobao.appbundle;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.ab;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.controller.FeatureInstallController;
import com.taobao.appbundle.remote.activity.RemoteLoadingActivity;
import com.taobao.appbundle.runtime.AppBundleComponentFactory;
import com.taobao.appbundle.runtime.InjectClassLoader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cjd;
import tb.kge;

/* loaded from: classes.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAOPAI_FEATURE = "taopai_business";
    public static final String TAOPAI_SDK_FEATURE = "taopai_sdk";
    private static final Map<String, String> f;

    /* renamed from: a  reason: collision with root package name */
    private Application f16288a;
    private FeatureInstallController b;
    private final HashMap<String, Object> c;
    private com.alibaba.android.split.core.splitinstall.g d;
    private ab e;
    private com.taobao.appbundle.d g;

    /* loaded from: classes6.dex */
    public interface b {
        ComponentName a(ComponentName componentName);
    }

    /* renamed from: com.taobao.appbundle.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0628c {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public e(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.a(c.this, this.b);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class f implements com.alibaba.android.split.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public f(String str) {
            this.b = str;
        }

        @Override // com.alibaba.android.split.f
        public final void a(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            } else {
                c.a(c.this, this.b);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Set b;

        public g(Set set) {
            this.b = set;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (String str : this.b) {
                c.b(c.this, str);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h implements com.alibaba.android.split.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Set b;

        public h(Set set) {
            this.b = set;
        }

        @Override // com.alibaba.android.split.f
        public final void a(String[] it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b26fb7", new Object[]{this, it});
                return;
            }
            c cVar = c.this;
            Set set = this.b;
            q.b(it, "it");
            c.a(cVar, set, it);
        }
    }

    private c() {
        this.c = new HashMap<>();
    }

    public /* synthetic */ c(o oVar) {
        this();
    }

    public static final /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddab5f7d", new Object[]{cVar, str});
        } else {
            cVar.d(str);
        }
    }

    public static final /* synthetic */ void a(c cVar, Set set, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5086c7b3", new Object[]{cVar, set, strArr});
        } else {
            cVar.a(set, strArr);
        }
    }

    public static final /* synthetic */ void b(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532585be", new Object[]{cVar, str});
        } else {
            cVar.c(str);
        }
    }

    public final Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[]{this}) : this.f16288a;
    }

    public final com.alibaba.android.split.core.splitinstall.g c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.split.core.splitinstall.g) ipChange.ipc$dispatch("1157188", new Object[]{this}) : this.d;
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        private static final c f16289a;

        static {
            kge.a(-1973575988);
            INSTANCE = new d();
            f16289a = new c(null);
        }

        private d() {
        }

        public final c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1690a779", new Object[]{this}) : f16289a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.alibaba.flexa.compat.b r7) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.appbundle.c.a(com.alibaba.flexa.compat.b):void");
    }

    private final void a(Set<String> set, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d343aa68", new Object[]{this, set, strArr});
            return;
        }
        for (String str : set) {
            try {
                if (!j.h().a((Context) this.f16288a, false, str, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                    com.android.tools.bundleInfo.d.a().b(str);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                com.android.tools.bundleInfo.d.a().b(str);
            }
        }
    }

    private final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (j.h().a((Context) this.f16288a, false, str, new String[0])) {
                return;
            }
            com.android.tools.bundleInfo.d.a().b(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.android.tools.bundleInfo.d.a().b(str);
        }
    }

    private final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            if (j.h().a((Context) this.f16288a, false, str, new String[0])) {
                return;
            }
            com.android.tools.bundleInfo.c.a().b();
        } catch (Exception e2) {
            e2.printStackTrace();
            com.android.tools.bundleInfo.c.a().b();
        }
    }

    public final void a(String featureName, InterfaceC0628c featureComponentLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d433de", new Object[]{this, featureName, featureComponentLoader});
            return;
        }
        q.d(featureName, "featureName");
        q.d(featureComponentLoader, "featureComponentLoader");
        if (Build.VERSION.SDK_INT > 27) {
            AppBundleComponentFactory.Companion.registerFeatureComponentLoader(featureName, featureComponentLoader);
        } else {
            InjectClassLoader.Companion.registerFeatureComponentLoader(featureName, featureComponentLoader);
        }
    }

    public final void d() {
        com.alibaba.android.split.core.splitinstall.g gVar;
        Set<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Log.e("AppBundle", "installDynamicFeatures");
        String a3 = cjd.a();
        Application application = this.f16288a;
        String str = null;
        if (q.a((Object) a3, (Object) (application != null ? application.getPackageName() : null)) && com.android.tools.bundleInfo.b.a().c(j.PLUGIN_NAME) != null && (gVar = this.d) != null && (a2 = gVar.a()) != null && !a2.contains(j.PLUGIN_NAME)) {
            com.alibaba.android.split.core.splitinstall.g gVar2 = this.d;
            if (gVar2 == null) {
                return;
            }
            gVar2.a(p.a(j.PLUGIN_NAME));
            return;
        }
        String a4 = cjd.a();
        Application application2 = this.f16288a;
        if (application2 != null) {
            str = application2.getPackageName();
        }
        if (!q.a((Object) a4, (Object) str)) {
            return;
        }
        ab abVar = this.e;
        if (abVar != null) {
            abVar.a((ab.a) this.b);
        }
        ab abVar2 = this.e;
        if (abVar2 == null) {
            return;
        }
        abVar2.a((ab.b) this.b);
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            InjectClassLoader.Companion companion = InjectClassLoader.Companion;
            Application application = this.f16288a;
            q.a(application);
            ClassLoader classLoader = application.getClassLoader();
            q.b(classLoader, "application!!.classLoader");
            Application application2 = this.f16288a;
            q.a(application2);
            companion.inject(classLoader, application2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final <T extends Activity> Class<T> a(String featureName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("582938df", new Object[]{this, featureName});
        }
        q.d(featureName, "featureName");
        if (f.containsKey(featureName) && e(f.get(featureName)) != null) {
            Class<T> cls = (Class<T>) e(f.get(featureName));
            if (cls == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
            }
            return cls;
        } else if (this.c.containsKey(featureName)) {
            Object obj = this.c.get(featureName);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
            }
            return (Class) obj;
        } else if (!TextUtils.isEmpty(com.android.tools.bundleInfo.b.a().a(featureName))) {
            Class<T> cls2 = (Class<T>) e(com.android.tools.bundleInfo.b.a().a(featureName));
            if (cls2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
            }
            return cls2;
        } else {
            return RemoteLoadingActivity.class;
        }
    }

    public final String b(String featureName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, featureName});
        }
        q.d(featureName, "featureName");
        return com.android.tools.bundleInfo.b.a().b(featureName);
    }

    private final Class<?> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7c2d15e3", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ab abVar = this.e;
        if (abVar != null) {
            abVar.a((ab.a) this.g);
        }
        ab abVar2 = this.e;
        if (abVar2 == null) {
            return;
        }
        abVar2.a((ab.b) this.g);
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(679738860);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1690a779", new Object[]{this}) : d.INSTANCE.a();
        }
    }

    static {
        kge.a(793268132);
        Companion = new a(null);
        f = ai.a(kotlin.j.a(TAOPAI_FEATURE, "com.taobao.android.pissarro.remote.RemoteLoadingActivity"), kotlin.j.a("litecreator", "com.taobao.android.pissarro.remote.RemoteLoadingActivity"), kotlin.j.a("industry", "com.taobao.android.industry.base.IdstryModuleLoadActivity"), kotlin.j.a("TB3DSpace", "com.taobao.android.tb3dspaceprocessor.Tb3dSpaceInstallActivity"));
    }
}
