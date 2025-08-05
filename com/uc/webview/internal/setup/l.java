package com.uc.webview.internal.setup;

import android.content.Context;
import android.webkit.ValueCallback;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.SdkGlobalSettings;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.internal.interfaces.IStartupController;
import com.uc.webview.internal.setup.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.jzk;

/* loaded from: classes9.dex */
public class l {
    static final /* synthetic */ boolean d = !l.class.desiredAssertionStatus();
    private static final StringBuffer g = new StringBuffer();

    /* renamed from: a  reason: collision with root package name */
    public final b f23974a = new b(this, (byte) 0);
    private final Object e = new Object();
    private final HashMap<String, ClassLoader> f = new HashMap<>();
    ClassLoader b = l.class.getClassLoader();
    j c = null;
    private boolean h = false;
    private volatile int i = 0;
    private volatile long j = 0;
    private volatile long k = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f23976a = new l();
    }

    /* loaded from: classes9.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f23977a;
        public ArrayList<ValueCallback<Integer>> b;
        private final com.uc.webview.base.c d;
        private StringBuffer e;

        private b() {
            this.d = new com.uc.webview.base.c();
            this.f23977a = new AtomicInteger(0);
            this.b = null;
            this.e = null;
        }

        /* synthetic */ b(l lVar, byte b) {
            this();
        }

        private void b(final int i, String str) {
            boolean z;
            synchronized (this) {
                if (this.e == null) {
                    this.e = new StringBuffer(com.uc.webview.base.klog.a.b(this.d.f23776a));
                }
                z = false;
                this.e.append(String.format(", %s:%d", str, Long.valueOf(this.d.a())));
                com.uc.webview.base.b.a("ucbsInitStatus", this.e.toString());
                if (this.b != null && !this.b.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                com.uc.webview.base.task.d.b("upst", new Runnable() { // from class: com.uc.webview.internal.setup.l.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.a(i, (ValueCallback<Integer>) null);
                    }
                });
            }
        }

        final synchronized void a(int i, ValueCallback<Integer> valueCallback) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(Integer.valueOf(i));
            } else if (!this.b.isEmpty()) {
                Iterator<ValueCallback<Integer>> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().onReceiveValue(Integer.valueOf(i));
                }
            }
            if (i == 64 || i == 128) {
                this.b = null;
                this.e = null;
            }
        }

        public final void a(ValueCallback<Integer> valueCallback) {
            for (int i = 0; i <= 7; i++) {
                int i2 = 1 << i;
                if (a(i2)) {
                    a(i2, valueCallback);
                }
            }
        }

        public final boolean a(int i) {
            return (i & this.f23977a.get()) != 0;
        }

        public final boolean a(int i, String str) {
            String str2 = "**reachStatus:" + str + ", total:" + this.d.a();
            if (a(i)) {
                Log.w("Setup.ctrl", str2 + ", repeat", new Throwable());
                return false;
            }
            Log.i("Setup.ctrl", str2);
            AtomicInteger atomicInteger = this.f23977a;
            atomicInteger.set(atomicInteger.get() | i);
            b(i, str);
            return true;
        }
    }

    private ClassLoader a(Context context, File file, File file2, File file3, File file4, int i, String str) {
        ClassLoader classLoader;
        if (file2 == null || !file2.exists()) {
            return null;
        }
        ClassLoader classLoader2 = l.class.getClassLoader();
        String absolutePath = file2.getAbsolutePath();
        synchronized (this.f) {
            classLoader = this.f.get(absolutePath);
            if (classLoader == null) {
                com.uc.webview.internal.setup.verify.d.a(context, file, file2, i);
                classLoader = new com.uc.webview.base.i(absolutePath, file3.getAbsolutePath(), file4.getAbsolutePath(), classLoader2);
                Class.forName(str, true, classLoader);
                this.f.put(absolutePath, classLoader);
            }
        }
        return classLoader;
    }

    public static void a(int i, int i2) {
        g.append(String.format("type:%d, reason:%d; ", Integer.valueOf(i), Integer.valueOf(i2)));
        com.uc.webview.base.b.a("wk_ucbsCoreType", g.toString());
    }

    private static void a(com.uc.webview.base.task.c cVar) {
        if (cVar != null) {
            cVar.b();
        }
    }

    static /* synthetic */ void a(l lVar, File file, File file2, int i) {
        synchronized (lVar.e) {
            if (lVar.f23974a.a(2)) {
                Log.d("Setup.ctrl", "verifyDex had finished");
                return;
            }
            com.uc.webview.internal.setup.verify.d.a(EnvInfo.getContext(), file, file2, i);
            lVar.f23974a.a(2, "DEX_VF");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, File file2, int i, ClassLoader classLoader) {
        synchronized (this.e) {
            if (this.f23974a.a(8)) {
                Log.d("Setup.ctrl", "verifyLib had finished");
                return;
            }
            com.uc.webview.internal.setup.verify.d.a(file, file2, i, classLoader, false);
            this.f23974a.a(8, "LIB_VF");
        }
    }

    public static l b() {
        return a.f23976a;
    }

    private ClassLoader b(File file) {
        ClassLoader classLoader;
        if (file == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f) {
            Log.d("Setup.ctrl", "getCachedClassLoader:".concat(String.valueOf(absolutePath)));
            classLoader = this.f.get(absolutePath);
        }
        return classLoader;
    }

    private j c(Context context, File file) {
        j e = e();
        if (e == null) {
            e = g.a(context);
        }
        if (e == null) {
            k kVar = new k();
            kVar.a(context);
            kVar.d = file;
            return j.b(kVar);
        }
        return e;
    }

    public static void c() {
        EnvInfo.is64Bit();
        EnvInfo.g();
        com.uc.webview.base.b.a();
        String format = String.format("%s_%s_%s", "5.12.6.0", "240927172644", "94b5cca0982704f125c9aa7175196c0ef6218235");
        Log.rInfo("Setup.ctrl", "wk_ucCoreInterfaceVersion" + ResponseProtocolType.COMMENT + format);
        com.uc.webview.base.b.a("wk_ucCoreInterfaceVersion", format);
        c cVar = c.b.f23896a;
    }

    static /* synthetic */ void g() {
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion != null) {
            Build.UCM_VERSION = iCoreVersion.version();
            Build.UCM_SUPPORT_SDK_MIN = iCoreVersion.minSupportVersion();
            Build.Version.API_LEVEL = iCoreVersion.apiLevel();
            Build.CORE_VERSION = iCoreVersion.version();
            Build.CORE_TIME = iCoreVersion.buildTimestamp();
            Log.d("Setup.ctrl", "versionInfo {\n  ucbs: " + Build.Version.NAME + "_" + Build.TIME + "\n  impl: " + Build.UCM_VERSION + "_" + Build.CORE_TIME + "\n  apiLevel: " + Build.Version.API_LEVEL + "\n  minSupport: " + Build.UCM_SUPPORT_SDK_MIN + "\n}");
        }
    }

    public synchronized j a(k kVar) {
        TraceEvent scoped;
        j jVar;
        scoped = TraceEvent.scoped((int) StartupTimingKeys.CREATE_RUNNING_CORE_INFO);
        synchronized (this) {
            if (this.c != null) {
                ErrorCode.REPEAT_INITIALIZATION.report();
            }
            this.c = j.b(kVar);
            m.f23979a = this.c.j;
            Log.d("Setup.ctrl", "createCoreInfo app specified rci: " + this.c.toString());
            boolean z = this.c != null && this.c.isFirstUsed();
            File file = this.c.j;
            j a2 = j.a(kVar);
            if (a2 != null && !m.b(a2) && (a2.a() || z)) {
                this.c = a2;
            }
            Log.d("Setup.ctrl", "createCoreInfo final mRunningCore: " + this.c.toString() + ", fileAppSepcifiedRoot: " + file);
            if (this.c.d()) {
                Log.d("Setup.ctrl", "createRCI: skip verify");
                this.h = true;
            }
            if (!this.c.isFirstUsed() || this.h) {
                c cVar = c.b.f23896a;
                cVar.a(this.c.q());
                if (cVar.a()) {
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.DETECT_LIBS_MAYBE_DAMAGED, 1L);
                    Log.d("Setup.ctrl", "createRCI: maybe damaged");
                    com.uc.webview.base.b.a("ucbsMainNativeMaybeDamaged", "true");
                    this.h = false;
                    cVar.b();
                    com.uc.webview.internal.setup.verify.d.b(this.c);
                }
            }
            com.uc.webview.base.task.d.a("rci", new Runnable() { // from class: com.uc.webview.internal.setup.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.uc.webview.base.io.c r;
                    if (!l.this.c.isFirstUsed() && !l.this.c.isReUsed()) {
                        g a3 = g.a(EnvInfo.getContext());
                        File o = a3 != null ? a3.o() : null;
                        if (o != null && o.equals(l.this.c.o())) {
                            l.this.c.u();
                            l.this.c.w();
                        }
                    }
                    Log.i("Setup.ctrl", "createCoreInfo: {\n" + l.this.c.toString() + "\n}");
                    String j = l.this.c.j();
                    if (l.this.c.q() != null) {
                        j = j + ", " + l.this.c.q().getPath();
                    }
                    com.uc.webview.base.b.a("ucbsCoreInfo", j);
                    long j2 = 1;
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.IS_REUSED, l.this.c.isReUsed() ? 1L : 0L);
                    if (!l.this.c.isFirstUsed()) {
                        j2 = 0;
                    }
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.IS_FIRST_USED, j2);
                    com.uc.webview.base.timing.a.a((int) StartupTimingKeys.INTEGRATION_TYPE, l.this.c.integrationType());
                    if (!l.this.h || (r = l.this.c.r()) == null) {
                        return;
                    }
                    r.b();
                }
            });
            jVar = this.c;
        }
        return jVar;
        if (scoped != null) {
            scoped.close();
        }
        return jVar;
    }

    public final File a(Context context, boolean z) {
        IRunningCoreInfo iRunningCoreInfo;
        if (com.uc.webview.internal.e.e() || z) {
            iRunningCoreInfo = IRunningCoreInfo.Instance.get();
        } else {
            iRunningCoreInfo = e();
            if (iRunningCoreInfo == null) {
                iRunningCoreInfo = g.a(context);
            }
        }
        if (iRunningCoreInfo == null) {
            return null;
        }
        return new File(iRunningCoreInfo.path());
    }

    public final synchronized ClassLoader a(final File file, File file2, File file3) {
        String str;
        if (!this.f23974a.a(4)) {
            ClassLoader classLoader = l.class.getClassLoader();
            if (file != null) {
                if (!d && !file.exists()) {
                    throw new AssertionError();
                }
                str = "thin";
                long j = 0;
                if (this.k <= 0) {
                    this.k = System.currentTimeMillis();
                    if (this.j > 0) {
                        com.uc.webview.base.timing.a.a((int) StartupTimingKeys.PRELOAD_CORE_DEX_LEAD_TIME, this.k - this.j);
                    }
                }
                ClassLoader b2 = b(file);
                if (b2 != null) {
                    j = 1;
                }
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.USE_PRELOAD_CORE_DEX, j);
                if (b2 != null) {
                    this.b = b2;
                    if (!d && this.f23974a.a(2)) {
                        throw new AssertionError();
                    }
                    this.f23974a.a(2, "DEX_VF");
                } else {
                    final File q = this.c.q();
                    com.uc.webview.base.task.c cVar = null;
                    if (!this.h && !this.f23974a.a(2)) {
                        final int a2 = com.uc.webview.internal.setup.verify.d.a();
                        if (com.uc.webview.internal.setup.verify.d.a(a2)) {
                            Log.d("Setup.ctrl", "vfDex disabled");
                        } else {
                            cVar = new com.uc.webview.base.task.c() { // from class: com.uc.webview.internal.setup.l.3
                                @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                                public final /* synthetic */ c.C1036c call() throws Exception {
                                    return super.call();
                                }

                                @Override // com.uc.webview.base.task.c
                                public final void d() {
                                    l.a(l.this, q, file, a2);
                                }

                                @Override // com.uc.webview.base.task.c
                                public final String e() {
                                    return "Setup.ctrl.vfDex";
                                }
                            }.a();
                        }
                    }
                    this.b = new com.uc.webview.base.i(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath(), classLoader);
                    a(cVar);
                }
                this.c.t = this.b;
                GlobalSettings.set((int) jzk.INSTALL_PROVIDER, file.getAbsolutePath());
                GlobalSettings.set(147, file2.getAbsolutePath());
                SdkGlobalSettings.CORE_DEX_PATH = file.getAbsolutePath();
            } else {
                str = "thick";
                this.b = classLoader;
            }
            Log.rInfo("Setup.ctrl", str + ", loadCoreDex finished classLoader: " + this.b);
        }
        if (this.f23974a.a(4, "DEX_READY")) {
            com.uc.webview.base.g.a(this.b);
            f();
            com.uc.webview.base.task.d.a(new com.uc.webview.base.task.c() { // from class: com.uc.webview.internal.setup.l.2
                @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                public final /* synthetic */ c.C1036c call() throws Exception {
                    return super.call();
                }

                @Override // com.uc.webview.base.task.c
                public final void d() {
                    com.uc.webview.internal.b.a();
                    l.g();
                }

                @Override // com.uc.webview.base.task.c
                public final String e() {
                    return "dexReady";
                }

                @Override // com.uc.webview.base.task.c
                public final int f() {
                    return StartupTimingKeys.INIT_CORE_FACTORY;
                }
            });
        }
        return this.b;
    }

    public void a() {
        if (!this.f23974a.a(1, "STARTED")) {
        }
    }

    public final void a(j jVar, int i) {
        File q = jVar.q();
        File o = jVar.o();
        ClassLoader a2 = a(EnvInfo.getContext(), q, jVar.m(), jVar.n(), o, i, IStartupController.CORE_CLASS_STARTUP_CONTROLLER);
        if (a2 == null) {
            a2 = l.class.getClassLoader();
        }
        jVar.t = a2;
        a(q, o, i, a2);
    }

    public final synchronized void a(j jVar, String[] strArr) {
        if (!this.f23974a.a(16)) {
            final File o = jVar.o();
            String absolutePath = o.getAbsolutePath();
            GlobalSettings.set(146, absolutePath);
            com.uc.webview.base.b.a("ucbsCoreLibPath", absolutePath + " " + System.currentTimeMillis());
            final File q = jVar.q();
            com.uc.webview.base.task.c cVar = null;
            if (!this.h && !this.f23974a.a(8)) {
                final int a2 = com.uc.webview.internal.setup.verify.d.a();
                if (com.uc.webview.internal.setup.verify.d.a(a2)) {
                    Log.d("Setup.ctrl", "vfLib disabled");
                } else {
                    cVar = new com.uc.webview.base.task.c() { // from class: com.uc.webview.internal.setup.l.4
                        @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                        public final /* synthetic */ c.C1036c call() throws Exception {
                            return super.call();
                        }

                        @Override // com.uc.webview.base.task.c
                        public final void d() {
                            l lVar = l.this;
                            File file = q;
                            File file2 = o;
                            int i = a2;
                            if (!lVar.f23974a.a(4)) {
                                Log.w("Setup.ctrl", "getCoreCL maybe error because of not inited", new Throwable());
                            }
                            lVar.a(file, file2, i, lVar.b);
                        }

                        @Override // com.uc.webview.base.task.c
                        public final String e() {
                            return "Setup.ctrl.vfLib";
                        }
                    }.a();
                }
            }
            com.uc.webview.internal.setup.verify.d.a(strArr, this.h);
            a(cVar);
            try {
                f().initCoreEngine(EnvInfo.getContext());
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.USE_PRELOAD_CORE_SO, this.i);
            } catch (UCKnownException e) {
                if (!ErrorCode.LOAD_NATIVE_LIB_FAILED.equals(e)) {
                    Log.d("Setup.ctrl", "initNL failed: other exception");
                    throw e;
                }
                if (this.h) {
                    if (!com.uc.webview.base.io.d.a(jVar.q(), jVar.k())) {
                        Log.d("Setup.ctrl", "initNL failed: maybe no files");
                        throw e;
                    }
                    com.uc.webview.internal.setup.verify.d.a(jVar.q(), jVar.o(), 2, jVar.coreClassLoader(), true);
                }
                try {
                    Log.d("Setup.ctrl", "initNL: retry");
                    f().initCoreEngine(EnvInfo.getContext());
                } catch (UCKnownException e2) {
                    Log.d("Setup.ctrl", "initNL: retry failed", e2);
                    if (ErrorCode.LOAD_NATIVE_LIB_FAILED.equals(e2)) {
                        com.uc.webview.internal.setup.verify.d.a(jVar);
                    }
                    throw e2;
                } catch (Throwable th) {
                    Log.d("Setup.ctrl", "initNL: retry failed", th);
                    ErrorCode.INIT_CORE_ENGINE_FAILED.report(th);
                }
            }
            Log.i("Setup.ctrl", "initCoreEngine finished path:".concat(String.valueOf(absolutePath)));
            this.f23974a.a(16, "ENGINE_INITED");
        }
    }

    public final void a(File file) {
        if (file == null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f) {
            Log.d("Setup.ctrl", "removeCachedClassLoader:".concat(String.valueOf(absolutePath)));
            this.f.remove(absolutePath);
        }
    }

    public final boolean a(Context context, File file) {
        int i;
        int i2 = 1;
        if (this.f23974a.a(16) || 1 == this.i) {
            this.i = 2;
            return true;
        }
        j c = c(context, file);
        ClassLoader classLoader = c.k() ? l.class.getClassLoader() : b(c.m());
        boolean z = false;
        if (classLoader == null) {
            i = 3;
        } else {
            boolean d2 = c.d();
            if (!d2) {
                try {
                    d2 = com.uc.webview.internal.setup.verify.d.a(c.q(), c.o(), 1, classLoader, false);
                } catch (Throwable unused) {
                }
            }
            if (!d2) {
                i = 5;
            } else {
                c cVar = c.b.f23896a;
                cVar.a(c.q());
                if (!cVar.a()) {
                    cVar.a(16, false);
                    try {
                        TraceEvent scoped = TraceEvent.scoped("preloadCoreSo");
                        z = ((Boolean) com.uc.webview.base.g.a(null, Class.forName(IStartupController.CORE_CLASS_STARTUP_CONTROLLER, true, classLoader), "preloadSo", new Class[]{String.class}, new Object[]{c.o().getAbsolutePath()})).booleanValue();
                        if (scoped != null) {
                            scoped.close();
                        }
                    } catch (Throwable th) {
                        Log.w("Setup.ctrl", "preloadCoreSo failed", th);
                    }
                    cVar.a(16, true);
                    if (!z) {
                        i2 = 6;
                    }
                    this.i = i2;
                    return z;
                }
                i = 4;
            }
        }
        this.i = i;
        return false;
    }

    public final boolean a(File file, File file2, boolean z, Object[] objArr) {
        File d2 = (file != null || file2 == null) ? file : PathUtils.d(file2);
        StringBuilder sb = new StringBuilder("verifyCoreFiles specifiedDir:");
        String str = "null";
        sb.append(d2 != null ? d2.getPath() : str);
        sb.append(", specifiedFile:");
        if (file2 != null) {
            str = file2.getPath();
        }
        sb.append(str);
        sb.append(", forceDoVerification:");
        sb.append(z);
        Log.d("Setup.ctrl", sb.toString());
        int i = z ? 2 : 1;
        ClassLoader classLoader = l.class.getClassLoader();
        boolean c = EnvInfo.c();
        if (!c) {
            try {
                classLoader = a(EnvInfo.getContext(), d2, PathUtils.getFileCoreDex(d2), d2, PathUtils.getDirCoreLib(d2), i, IStartupController.CORE_CLASS_STARTUP_CONTROLLER);
            } catch (Throwable th) {
                Log.e("Setup.ctrl", "create load failed", th);
                if (objArr != null) {
                    if (objArr.length > 0) {
                        objArr[0] = 8;
                    }
                    if (objArr.length >= 2) {
                        objArr[1] = th;
                    }
                }
                return false;
            }
        }
        if (file2 == null || !file2.equals(PathUtils.getFileCoreDex(d2))) {
            return com.uc.webview.internal.setup.verify.d.a(d2, file2, i, classLoader, objArr);
        }
        StringBuilder sb2 = new StringBuilder("verifyCoreFiles dex is ");
        sb2.append(!c);
        Log.w("Setup.ctrl", sb2.toString());
        return !c;
    }

    public final boolean b(Context context, File file) {
        if (this.f23974a.a(4)) {
            return true;
        }
        j c = c(context, file);
        if (c.k()) {
            return true;
        }
        File m = c.m();
        if (!d && m == null) {
            throw new AssertionError();
        }
        if (!m.exists()) {
            return false;
        }
        if (b(m) != null) {
            return true;
        }
        if (this.j <= 0) {
            this.j = System.currentTimeMillis();
            if (this.k > 0) {
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.PRELOAD_CORE_DEX_LEAD_TIME, this.k - this.j);
            }
        }
        TraceEvent scoped = TraceEvent.scoped("preloadCoreDex");
        try {
            ClassLoader a2 = a(context, c.q(), m, c.n(), c.o(), com.uc.webview.internal.setup.verify.d.a(), IStartupController.CORE_CLASS_STARTUP_CONTROLLER);
            if (scoped != null) {
                scoped.close();
            }
            return a2 != null;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean b(k kVar) {
        if (this.f23974a.a(16) || this.f23974a.a(32) || this.f23974a.a(64)) {
            Log.w("Setup.ctrl", "restStatus: not support for " + this.f23974a.f23977a.get());
            return false;
        }
        Log.d("Setup.ctrl", "restStatus to STARTED");
        if (this.f23974a.a(4)) {
            synchronized (this) {
                this.b = null;
                this.h = false;
            }
        }
        this.f23974a.f23977a.set(1);
        synchronized (this) {
            this.c = j.b(kVar);
            this.c.h();
            Log.i("Setup.ctrl", "createReExtractCoreInfo: {\n" + this.c.toString() + "\n}");
        }
        return true;
    }

    public final boolean d() {
        return this.f23974a.a(1);
    }

    public final j e() {
        j jVar;
        synchronized (this) {
            jVar = this.c;
        }
        return jVar;
    }

    public final IStartupController f() {
        if (!this.f23974a.a(4)) {
            Log.w("Setup.ctrl", "getCoreCtrl maybe error because of not inited", new Throwable());
        }
        return IStartupController.Instance.get();
    }
}
