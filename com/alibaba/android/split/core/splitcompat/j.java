package com.alibaba.android.split.core.splitcompat;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.alibaba.android.split.core.internal.SplitApkChecker;
import com.alibaba.android.split.core.internal.SplitLoadException;
import com.alibaba.android.split.core.internal.SplitLoaderInternal;
import com.alibaba.android.split.core.splitinstall.SplitInstallException;
import com.alibaba.android.split.core.splitinstall.SplitLoaderHolder;
import com.alibaba.android.split.manager.IPluginContext;
import com.alibaba.android.split.q;
import com.alibaba.android.split.s;
import com.alibaba.android.split.t;
import com.alibaba.android.split.u;
import com.alibaba.android.split.v;
import com.alibaba.android.split.w;
import com.alibaba.android.split.x;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.bgj;
import tb.bgu;
import tb.bgx;
import tb.bgy;
import tb.bhm;
import tb.bhz;
import tb.bib;
import tb.gpe;
import tb.kge;
import tb.qte;

/* loaded from: classes.dex */
public class j implements com.alibaba.android.split.i, com.alibaba.android.split.manager.a, u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "com_taobao_plugin";
    private static final AtomicReference<j> g;
    private static Map<Pair<String, String>, Object> i;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f2454a;
    public volatile boolean b;
    public com.alibaba.android.split.j e;
    private String k;
    private com.alibaba.android.split.manager.b l;
    private bgy m;
    private final Context n;
    private Map<String, Integer> f = new ConcurrentHashMap();
    private final bgu h = (bgu) com.alibaba.android.split.a.b(bgu.class, "SplitCompat");
    private com.alibaba.android.split.f j = null;
    public volatile boolean c = true;
    public volatile boolean d = true;
    private final ArrayList<WeakReference<Resources>> o = new ArrayList<>();
    private final Set<String> p = new HashSet();
    private final Set<String> q = new HashSet();

    public static /* synthetic */ boolean a(j jVar, String str, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15c0efdf", new Object[]{jVar, str, file})).booleanValue() : jVar.a(str, file);
    }

    static {
        kge.a(-1912843121);
        kge.a(1092115705);
        kge.a(1456581245);
        kge.a(1928304518);
        g = new AtomicReference<>(null);
        i = new HashMap();
    }

    @Override // com.alibaba.android.split.manager.a
    public com.alibaba.android.split.manager.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.split.manager.b) ipChange.ipc$dispatch("48f0b0f1", new Object[]{this}) : this.l;
    }

    public ArrayList<WeakReference<Resources>> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this}) : this.o;
    }

    public static void a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22144960", new Object[]{context, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
            return;
        }
        j jVar = new j(context);
        if (!g.compareAndSet(null, jVar)) {
            Log.e("SplitCompat", "SplitCompat instance has be set !");
            return;
        }
        jVar.f2454a = z;
        jVar.b = z2;
        jVar.c = z3;
        jVar.d = z4;
        jVar.p();
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[]{this}) : this.n;
    }

    public Set<String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a46b5b1c", new Object[]{this}) : this.p;
    }

    @Override // com.alibaba.android.split.i
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.k;
    }

    public static boolean a(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{context, strArr})).booleanValue() : b(context, true, strArr);
    }

    @Deprecated
    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context, new String[0]);
    }

    public static boolean b(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57295ec4", new Object[]{context, strArr})).booleanValue();
        }
        j jVar = new j(context);
        boolean compareAndSet = g.compareAndSet(null, jVar);
        if (!compareAndSet) {
            Log.e("SplitCompat", "SplitCompat instance has be set !");
            jVar = g.get();
        }
        if (compareAndSet) {
            jVar.p();
        }
        return b(context, false, strArr);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        j jVar = g.get();
        if (jVar == null) {
            Log.e("SplitCompat", "SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
            return false;
        }
        String o = o();
        jVar.o.add(new WeakReference<>(context.getResources()));
        if (v.f(context, o)) {
            Log.e("SplitCompat", String.format("installActivity:%s inject skiped", o));
            return true;
        }
        Log.e("SplitCompat", "inject Activity:" + o);
        try {
            jVar.d(context);
            FlexaResources.a(context);
            jVar.d(jVar.e());
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    public static String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[0]);
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            return stackTrace.length > 5 ? stackTrace[4].getClassName() : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.l.a(this.m);
        com.alibaba.android.split.p.a(new m(g.get()));
        if (!c(this.n)) {
            return;
        }
        Executor a2 = p.a();
        ObjectInvoker objectInvoker = new ObjectInvoker();
        com.alibaba.android.split.a.a(w.class, new x());
        SplitLoaderHolder.set(new SplitLoaderInternal(this.n, a2, new SplitApkChecker(this.n, g.get().m, objectInvoker), g.get().m, new com.alibaba.android.split.core.splitinstall.d()));
        com.alibaba.android.split.m.a(new l());
        t.a(new com.alibaba.android.split.c());
        n nVar = new n(this.n);
        if (this.b) {
            p.b().schedule(nVar, 1L, TimeUnit.SECONDS);
        } else {
            nVar.run();
        }
        qte.a().a(this.n);
        qte.a().b();
        if (com.alibaba.android.split.scene.l.a() == null || com.alibaba.android.split.scene.j.a() == null || com.alibaba.android.split.scene.m.a() == null || !v.r(this.n)) {
            return;
        }
        com.alibaba.android.split.scene.h a3 = com.alibaba.android.split.scene.j.a().a();
        a3.a(this.n, com.alibaba.android.split.scene.m.a(), "feature_resource.json");
        com.alibaba.android.split.scene.l.a().a(a3);
    }

    private static boolean b(Context context, boolean z, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a0bf44e", new Object[]{context, new Boolean(z), strArr})).booleanValue();
        }
        if (!v.c(context)) {
            return false;
        }
        Log.e("SplitCompat", "doInstall");
        return c(context, z, strArr);
    }

    private static boolean c(Context context, boolean z, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb59a6d", new Object[]{context, new Boolean(z), strArr})).booleanValue();
        }
        System.currentTimeMillis();
        try {
            return g.get().a(context, z, strArr);
        } catch (Exception e) {
            e.printStackTrace();
            if (!z && g.get().e != null && g.get().m.h(PLUGIN_NAME) && g.get().b) {
                g.get().e.a(PLUGIN_NAME, false, "load", 0L, -1, e.getCause().getMessage(), h().i());
            } else {
                boolean z2 = e instanceof SplitInstallException;
                if (z2 && z && g.get().e != null && !g.get().b) {
                    g.get().e.a(e.getMessage(), false, "install", 0L, -1, e.getCause().getMessage(), h().i());
                } else if (z2 && !z && g.get().e != null && !g.get().b) {
                    g.get().e.a(e.getMessage(), false, "load", 0L, -1, e.getCause().getMessage(), h().i());
                }
            }
            return false;
        }
    }

    private j(Context context) {
        this.e = null;
        this.n = context;
        this.e = (com.alibaba.android.split.j) com.alibaba.android.split.a.a((Class<? extends Object>) com.alibaba.android.split.j.class, new Object[0]);
        try {
            if (com.alibaba.android.split.d.a()) {
                this.m = new bgy(context);
            } else if (!com.alibaba.android.split.d.a() && new bgy(context).h(PLUGIN_NAME)) {
                this.m = new bgy(context);
            } else {
                this.m = new bgy(context, false);
            }
            this.l = com.alibaba.android.split.core.plugin.g.a(this.m.b());
            com.alibaba.android.split.k.a(this);
        } catch (Exception e) {
            throw new SplitLoadException("Failed to initialize FileStorage", e);
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : g.get() != null;
    }

    public static j h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("41618179", new Object[0]) : g.get();
    }

    @Override // com.alibaba.android.split.u
    public void a(com.alibaba.android.split.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533d3309", new Object[]{this, fVar});
        } else {
            this.j = fVar;
        }
    }

    @Override // com.alibaba.android.split.u
    public final boolean a(Context context, boolean z, String... strArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("98624e2f", new Object[]{this, context, new Boolean(z), strArr})).booleanValue() : a(context, z, this.m, strArr);
    }

    @Override // com.alibaba.android.split.u
    public void c(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b2f8c1", new Object[]{this, context, strArr});
        } else if (context != null && strArr != null && g.get() != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                this.l.a(context, str);
                if (this.l.b(str) != null) {
                    arrayList.add(this.l.b(str).a().getAbsolutePath());
                }
            }
            if (arrayList.size() <= 0) {
                return;
            }
            try {
                if (Build.VERSION.SDK_INT < 24) {
                    return;
                }
                com.alibaba.android.split.core.plugin.h.a().a((String[]) arrayList.toArray(new String[0]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0406 A[Catch: Exception -> 0x04ed, all -> 0x054c, TryCatch #1 {Exception -> 0x04ed, blocks: (B:134:0x02c4, B:144:0x0319, B:146:0x032f, B:147:0x0358, B:150:0x035e, B:156:0x0375, B:165:0x03c3, B:167:0x0406, B:169:0x040a, B:172:0x042d, B:170:0x0416, B:171:0x0422, B:158:0x0386, B:164:0x03b5, B:142:0x02ee, B:140:0x02e8), top: B:220:0x02c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0422 A[Catch: Exception -> 0x04ed, all -> 0x054c, TryCatch #1 {Exception -> 0x04ed, blocks: (B:134:0x02c4, B:144:0x0319, B:146:0x032f, B:147:0x0358, B:150:0x035e, B:156:0x0375, B:165:0x03c3, B:167:0x0406, B:169:0x040a, B:172:0x042d, B:170:0x0416, B:171:0x0422, B:158:0x0386, B:164:0x03b5, B:142:0x02ee, B:140:0x02e8), top: B:220:0x02c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x032f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0437 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0226 A[SYNTHETIC] */
    @Override // com.alibaba.android.split.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(android.content.Context r30, boolean r31, tb.bgy r32, java.lang.String... r33) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.splitcompat.j.a(android.content.Context, boolean, tb.bgy, java.lang.String[]):boolean");
    }

    private void a(boolean z, final String str, final File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc796d2d", new Object[]{this, new Boolean(z), str, file});
        } else if (!c(h().e()) || !z) {
        } else {
            try {
                bgj.a().a(new Runnable() { // from class: com.alibaba.android.split.core.splitcompat.j.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        File file2 = file;
                        if (file2 == null || !file2.exists() || j.a(j.this, str, file)) {
                            return;
                        }
                        file.delete();
                        bhm.a().b().a(str, 0);
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private boolean a(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9c1162d", new Object[]{this, str, file})).booleanValue();
        }
        SplitFileInfo a2 = ((s) com.alibaba.android.split.a.a((Class<? extends Object>) s.class, new Object[0])).a(str);
        return a2 != null && !TextUtils.isEmpty(a2.md5) && a2.md5.equals(bib.a(file));
    }

    private String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{this, str, new Boolean(z)});
        }
        if (!z) {
            SplitFileInfo a2 = ((s) com.alibaba.android.split.a.a((Class<? extends Object>) s.class, new Object[0])).a(str);
            return a2 != null ? a2.version : "";
        }
        return bhz.a(n(), str);
    }

    private void a(boolean z, q qVar, boolean z2, int i2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a20d52b", new Object[]{this, new Boolean(z), qVar, new Boolean(z2), new Integer(i2), new Boolean(z3)});
            return;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (z2 && g.get().e != null) {
                        com.alibaba.android.split.j jVar = g.get().e;
                        String b = qVar.b();
                        String str = z3 ? com.alibaba.android.split.j.ARG_INSTALL_UPDATE : "install";
                        jVar.a(b, false, str, 0L, -20, "extractNativeLibs error:" + qVar.a().length(), i());
                    } else if (!z2 && g.get().e != null) {
                        com.alibaba.android.split.j jVar2 = g.get().e;
                        String b2 = qVar.b();
                        String str2 = z3 ? "update" : "load";
                        jVar2.a(b2, false, str2, 0L, -20, "extractNativeLibs error:" + qVar.a().length(), i());
                    }
                }
            } else if (z2 && g.get().e != null) {
                com.alibaba.android.split.j jVar3 = g.get().e;
                String b3 = qVar.b();
                String str3 = z3 ? com.alibaba.android.split.j.ARG_INSTALL_UPDATE : "install";
                jVar3.a(b3, false, str3, 0L, -19, "makePathElement failed:" + qVar.a().length(), i());
            } else if (!z2 && g.get().e != null) {
                com.alibaba.android.split.j jVar4 = g.get().e;
                String b4 = qVar.b();
                String str4 = z3 ? "update" : "load";
                jVar4.a(b4, false, str4, 0L, -19, "makePathElement failed:" + qVar.a().length(), i());
            }
        } else if (z2 && g.get().e != null) {
            com.alibaba.android.split.j jVar5 = g.get().e;
            String b5 = qVar.b();
            String str5 = z3 ? com.alibaba.android.split.j.ARG_INSTALL_UPDATE : "install";
            jVar5.a(b5, false, str5, 0L, -18, "can't add assetsPath:" + qVar.a().length(), i());
        } else if (!z2 && g.get().e != null) {
            com.alibaba.android.split.j jVar6 = g.get().e;
            String b6 = qVar.b();
            String str6 = z3 ? "update" : "load";
            jVar6.a(b6, false, str6, 0L, -18, "can't add assetsPath:" + qVar.a().length(), i());
        }
        if (z3 || !z2) {
            return;
        }
        a(z, qVar.b(), qVar.a());
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null) {
        } else {
            Pair pair = new Pair(str, str2);
            if (!i.containsKey(pair)) {
                return;
            }
            i.get(pair);
        }
    }

    private final void d(Context context) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.p) {
            for (String str : this.p) {
                this.l.a(context, str);
                if (this.l.b(str) != null) {
                    arrayList.add(this.l.b(str).a());
                }
            }
            this.l.a(context, arrayList);
        }
    }

    private List e(Context context) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aa2beb", new Object[]{this, context});
        }
        context.getPackageName();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.p);
        return arrayList;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.m.a();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        try {
            if (this.m != null) {
                return this.m.l().exists();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            if (this.m == null || this.m.l().exists()) {
                return;
            }
            this.m.l().createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            if (this.m == null || !this.m.l().exists()) {
                return;
            }
            this.m.l().delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : gpe.a(context).equals(context.getPackageName());
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue() : gpe.a(context).endsWith(":channel");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        bgy bgyVar = this.m;
        if (bgyVar == null) {
            return false;
        }
        return bgyVar.h(str);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        try {
            if (this.m == null) {
                return;
            }
            bgy.c(this.m.o());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:? -> B:46:0x0171). Please submit an issue!!! */
    private boolean a(Context context, String str, String... strArr) throws Exception {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2be7ab9", new Object[]{this, context, str, strArr})).booleanValue();
        }
        bgx bgxVar = new bgx(context, str);
        com.alibaba.android.split.manager.b a2 = com.alibaba.android.split.core.plugin.g.a(str);
        a2.a(bgxVar);
        Set<q> q = bgxVar.q();
        if (q.size() == 0) {
            return true;
        }
        for (q qVar : q) {
            String b = qVar.b();
            if (strArr == null || strArr.length <= 0 || Arrays.asList(strArr).contains(b)) {
                if (v.b(context, b)) {
                    this.h.c("feature : %s update disabled", b);
                } else {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!a2.a(qVar)) {
                            a2.c(qVar);
                        }
                        if (!a2.b(qVar)) {
                            this.h.d("feature update %s synchronizeNativeLibs start", b);
                            if (!a2.a(context.getClassLoader(), true, false, true, qVar)) {
                                this.h.d("feature update %s synchronizeNativeLibs failed", b);
                                a(bgxVar.h(), qVar, true, 2, true);
                                a2.c(b);
                            } else {
                                this.h.d("feature update %s synchronizeNativeLibs end", b);
                                this.h.d("feature update %s appendClassLoader start", b);
                                if (!a2.a(context.getClassLoader(), qVar, true, true)) {
                                    this.h.d("feature update %s appendClassLoader failed", b);
                                    a(bgxVar.h(), qVar, true, 1, true);
                                    a2.c(b);
                                } else {
                                    bgu bguVar = this.h;
                                    StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 30);
                                    sb.append("Split ");
                                    sb.append(b);
                                    sb.append("' install updated success");
                                    bguVar.d("SplitCompat.doUpdateFeatures: %s", sb.toString());
                                    a2.a(b, IPluginContext.Status.EMULATED);
                                    synchronized (this.q) {
                                        try {
                                            this.q.add(b);
                                            str2 = b;
                                            try {
                                                g.get().e.a(str2, true, com.alibaba.android.split.j.ARG_INSTALL_UPDATE, System.currentTimeMillis() - currentTimeMillis, 0, "", h().i());
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            str2 = b;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        throw new SplitInstallException(str2, e);
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = b;
                    }
                }
            }
        }
        return strArr == null || this.q.containsAll(Arrays.asList(strArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f9 A[Catch: all -> 0x0448, TRY_ENTER, TryCatch #7 {, blocks: (B:4:0x0009, B:6:0x0012, B:9:0x002c, B:10:0x004b, B:12:0x0051, B:18:0x0063, B:22:0x006c, B:24:0x007f, B:26:0x0082, B:30:0x0090, B:31:0x0094, B:33:0x009a, B:35:0x00aa, B:37:0x00af, B:39:0x00b5, B:43:0x00c2, B:44:0x00cb, B:46:0x00d1, B:48:0x00e2, B:50:0x00e5, B:55:0x00fd, B:57:0x0109, B:58:0x0133, B:60:0x013b, B:61:0x013e, B:63:0x0144, B:65:0x014e, B:67:0x016b, B:70:0x01a0, B:72:0x01cb, B:74:0x01f1, B:76:0x0202, B:140:0x03f3, B:141:0x03f8, B:144:0x0401, B:145:0x0405, B:147:0x040b, B:149:0x0415, B:150:0x041e, B:78:0x020d, B:80:0x023b, B:81:0x024b, B:83:0x0271, B:85:0x028b, B:82:0x025e, B:90:0x0307, B:92:0x0314, B:94:0x031a, B:96:0x0327, B:97:0x0329, B:100:0x0330, B:101:0x0334, B:103:0x033a, B:107:0x0371, B:108:0x0372, B:109:0x0376, B:111:0x037c, B:113:0x0391, B:114:0x0393, B:117:0x03a5, B:123:0x03ba, B:121:0x03b8, B:124:0x03c2, B:126:0x03c8, B:128:0x03d5, B:28:0x008b, B:17:0x005e, B:142:0x03f9, B:143:0x0400), top: B:170:0x0009 }] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean b(android.content.Context r36, java.lang.String r37, java.lang.String... r38) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.splitcompat.j.b(android.content.Context, java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.alibaba.android.split.u
    public boolean a(Context context, boolean z, String str, String... strArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29320125", new Object[]{this, context, new Boolean(z), str, strArr})).booleanValue();
        }
        if (z) {
            return a(context, str, strArr);
        }
        return b(context, str, strArr);
    }

    private List<String> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return new ArrayList(this.q);
        }
        return new ArrayList(this.p);
    }

    @Override // com.alibaba.android.split.u
    public bgy b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgy) ipChange.ipc$dispatch("16b46829", new Object[]{this}) : this.m;
    }

    @Override // com.alibaba.android.split.u
    public void a(com.alibaba.android.split.core.splitinstall.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            return;
        }
        for (String str : mVar.g()) {
            this.f.put(str, Integer.valueOf(mVar.b()));
        }
    }

    public void a(Context context, com.alibaba.android.split.core.plugin.c cVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3476d160", new Object[]{this, context, cVar});
            return;
        }
        com.alibaba.android.split.manager.b bVar = this.l;
        if (bVar == null) {
            return;
        }
        bVar.a(context, cVar);
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.m.b();
    }
}
