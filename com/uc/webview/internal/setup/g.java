package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.utils.FileUtil;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.a;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.internal.setup.b;
import com.uc.webview.internal.setup.c;
import com.uc.webview.internal.setup.m;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class g extends j {
    private static final AtomicBoolean x = new AtomicBoolean(false);
    private static volatile g y = null;
    private String z;

    /* loaded from: classes9.dex */
    public static final class a {
        public static String a() {
            return EnvInfo.is64Bit() ? "arm64" : "arm32";
        }

        public static String a(ClassLoader classLoader) {
            String str = "";
            try {
                String[][] a2 = EnvInfo.a(classLoader);
                if (a2 != null && a2.length > 0) {
                    for (String[] strArr : a2) {
                        str = str + strArr[2];
                    }
                }
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                str = String.valueOf(str.hashCode());
            }
            Log.i("LastRCI", "CoreInfo getNativeLibDigest result:".concat(String.valueOf(str)));
            return str;
        }

        public static String a(boolean z, String str) {
            String str2 = "";
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            File file = new File(str);
            StringBuilder sb = new StringBuilder();
            if (!z) {
                File fileCoreDex = PathUtils.getFileCoreDex(file);
                if (fileCoreDex.exists()) {
                    sb.append("_");
                    sb.append(fileCoreDex.length());
                    sb.append("_");
                    sb.append(fileCoreDex.lastModified());
                }
            }
            File fileCoreLib = PathUtils.getFileCoreLib(PathUtils.getDirCoreLib(file));
            if (fileCoreLib.exists()) {
                sb.append("_");
                sb.append(fileCoreLib.length());
                sb.append("_");
                sb.append(fileCoreLib.lastModified());
            }
            str2 = sb.toString();
            return TextUtils.isEmpty(str2) ? str2 : String.valueOf(str2.hashCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        protected static final int f23962a = 0;
        protected static final int b;
        protected static final int c;
        protected static final int d;
        protected static final int e;
        protected static final int f;
        protected static final int g;
        protected static final int h;
        protected static final int i;
        protected static final int j;
        protected static final int k;
        protected static final int l;
        protected static final int m;
        protected static final int n;
        private static int p = 1;
        protected String[] o;

        static {
            int i2 = p;
            p = i2 + 1;
            b = i2;
            int i3 = p;
            p = i3 + 1;
            c = i3;
            int i4 = p;
            p = i4 + 1;
            d = i4;
            int i5 = p;
            p = i5 + 1;
            e = i5;
            int i6 = p;
            p = i6 + 1;
            f = i6;
            int i7 = p;
            p = i7 + 1;
            g = i7;
            int i8 = p;
            p = i8 + 1;
            h = i8;
            int i9 = p;
            p = i9 + 1;
            i = i9;
            int i10 = p;
            p = i10 + 1;
            j = i10;
            int i11 = p;
            p = i11 + 1;
            k = i11;
            int i12 = p;
            p = i12 + 1;
            l = i12;
            int i13 = p;
            m = i13;
            n = i13;
        }

        private b() {
            this.o = null;
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        protected final String a(int i2) {
            String[] strArr = this.o;
            return i2 > strArr.length ? "" : strArr[i2];
        }

        protected final void a(int i2, String str) {
            String[] strArr = this.o;
            if (i2 > strArr.length) {
                return;
            }
            if (str == null) {
                str = "";
            }
            strArr[i2] = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                String[] strArr = this.o;
                if (strArr == null || i2 >= strArr.length) {
                    break;
                }
                sb.append(strArr[i2]);
                if (i2 != this.o.length - 1) {
                    sb.append("`");
                }
                i2++;
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class c extends b {
        public c(j jVar) {
            super((byte) 0);
            this.o = new String[m];
            a(f23962a, String.valueOf(jVar.integrationType()));
            a(b, String.valueOf(jVar.k()));
            a(c, a.a());
            a(d, jVar.l());
            a(e, jVar.r);
            a(f, jVar.path());
            a(g, jVar.s() != null ? jVar.s().getAbsolutePath() : jVar.t());
            a(h, a.a(jVar.coreClassLoader()));
            a(i, a.a(jVar.k(), jVar.path()));
            a(l, String.valueOf(jVar.a()));
            a(k, jVar.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class d extends b {
        public String A;
        public String B;
        public b.a C;
        public boolean p;
        public int q;
        public boolean r;
        public String s;
        public String t;
        public String u;
        public String v;
        public String w;
        public String x;
        public String y;
        public boolean z;

        public d(Context context) {
            super((byte) 0);
            this.p = false;
            this.C = null;
            String a2 = e.a(context);
            String[] split = TextUtils.isEmpty(a2) ? null : a2.split("`");
            if (split == null || split.length < n) {
                this.o = null;
                return;
            }
            this.o = split;
            this.p = a();
        }

        private boolean a() {
            try {
                this.q = Integer.valueOf(a(f23962a)).intValue();
                this.r = Boolean.valueOf(a(b)).booleanValue();
                this.s = a(c);
                this.t = a(d);
                this.u = a(e);
                this.v = a(f);
                this.w = a(g);
                this.x = a(h);
                this.y = a(i);
                this.z = Boolean.valueOf(a(l)).booleanValue();
                this.B = a(k);
                this.A = a(j);
                if (TextUtils.isEmpty(this.s) || TextUtils.isEmpty(this.t) || TextUtils.isEmpty(this.u) || TextUtils.isEmpty(this.v)) {
                    return false;
                }
                if (TextUtils.isEmpty(this.w)) {
                    if (!this.z) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                Log.d("LastRCI", "updateValues. excption:", th);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f23963a = new AtomicInteger(0);

        public static synchronized String a(Context context) {
            com.uc.webview.base.io.a aVar;
            synchronized (e.class) {
                try {
                    aVar = c(context);
                } catch (Throwable th) {
                    th = th;
                    aVar = null;
                }
                try {
                    if (!aVar.a()) {
                        aVar.d();
                        return null;
                    }
                    String c = aVar.c();
                    String trim = TextUtils.isEmpty(c) ? null : c.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        f23963a.set(trim.hashCode());
                        Log.d("LastRCI", "load:".concat(String.valueOf(trim)));
                    }
                    aVar.d();
                    return trim;
                } catch (Throwable th2) {
                    th = th2;
                    Log.w("LastRCI", "load failed:", th);
                    if (aVar != null) {
                        aVar.d();
                    }
                    return null;
                }
            }
        }

        public static synchronized void a(Context context, String str) {
            synchronized (e.class) {
                if (!TextUtils.isEmpty(str) && str.hashCode() != f23963a.get()) {
                    Log.d("LastRCI", "save:".concat(String.valueOf(str)));
                    com.uc.webview.base.io.a c = c(context);
                    if (c.c == null) {
                        c.c = new a.d(c.f23785a, false);
                    }
                    a.d dVar = c.c;
                    if (c.b != null) {
                        str = c.b.a(str);
                    }
                    dVar.a(str);
                    c.d();
                }
            }
        }

        public static synchronized void b(Context context) {
            synchronized (e.class) {
                com.uc.webview.base.io.d.c("LastRCI-cl", PathUtils.b(context));
            }
        }

        private static com.uc.webview.base.io.a c(Context context) {
            return new com.uc.webview.base.io.a(PathUtils.b(context), FileUtil.LOCAL_REPORT_FILE_MAX_SIZE, new a.b());
        }
    }

    private g(d dVar, boolean z) {
        this.b = dVar.r;
        this.c = dVar.q;
        this.d = true;
        this.f = false;
        this.e = z;
        this.j = new File(dVar.v);
        this.v = dVar.z;
        this.z = dVar.A;
        this.p = dVar.t;
        this.q = dVar.B;
        this.s = dVar.x;
        g();
        if (4 == this.c) {
            this.o = dVar.w;
        } else {
            this.n = new File(dVar.w);
        }
        a(this.j);
        if (!com.uc.webview.base.io.d.a(this.j, this.b)) {
            ErrorCode.INVALID_DECOMPRESSED_DIR.report();
        }
    }

    public static g a(Context context) {
        c(context);
        if (y != null && y.v) {
            if (!(m.a.f23981a == 2)) {
                return null;
            }
        }
        if (GlobalSettings.getBoolValue(70)) {
            return y;
        }
        return null;
    }

    private static g a(d dVar) {
        boolean z;
        boolean z2;
        if (!dVar.p) {
            Log.d("LastRCI", "reuse failed: invalid info");
            return null;
        }
        String a2 = a.a();
        if (TextUtils.isEmpty(a2) || !a2.equals(dVar.s)) {
            Log.d("LastRCI", "reuse failed: different arch");
            return null;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (dVar.r) {
            String a3 = a.a(g.class.getClassLoader());
            if (TextUtils.isEmpty(a3) || !a3.equals(dVar.x)) {
                Log.d("LastRCI", "reuse failed: incompatible digest");
                return null;
            }
            z = true;
        } else if (!EnvInfo.isSupportedCoreVersion("LastRCI", Build.Version.NAME, Build.Version.SUPPORT_U4_MIN, dVar.t, dVar.u)) {
            Log.i("LastRCI", "reuse failed: incompatible version");
            return null;
        } else {
            z = false;
        }
        String a4 = a.a(dVar.r, dVar.v);
        if (TextUtils.isEmpty(a4) || !a4.equals(dVar.y)) {
            Log.d("LastRCI", "reuse failed: libs changed");
            try {
                PathUtils.b(new File(dVar.v)).b();
            } catch (Throwable unused) {
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || !dVar.r || EnvInfo.c()) {
            z3 = z2;
        } else {
            Log.d("LastRCI", "reuse failed: Envinfo changed. save thick:" + dVar.r + " EnvInfo thick:" + EnvInfo.c());
        }
        if (dVar.z) {
            Log.d("LastRCI", "canUseFullCapacity UCBS TIME:" + Build.TIME + " CORE TIME:" + dVar.B);
            if (!Build.TIME.equals(dVar.B)) {
                com.uc.webview.internal.setup.c cVar = c.b.f23896a;
                File file = new File(dVar.v);
                if (GlobalSettings.getBoolValue(69)) {
                    z4 = new c.a(file).a();
                }
                if (z4) {
                    return null;
                }
            }
        }
        if (!z3) {
            return new g(dVar, z);
        }
        return null;
    }

    public static void a(final Context context, final j jVar) {
        com.uc.webview.base.task.d.a("saveLastRCI", new Runnable() { // from class: com.uc.webview.internal.setup.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.b(context, jVar);
            }
        });
    }

    public static void a(j jVar, ClassLoader classLoader) {
        Method method;
        Class cls;
        if (jVar == null || classLoader == null) {
            return;
        }
        try {
            try {
                try {
                    method = Class.forName("com.uc.sdk_glue.extension.CoreVersionImpl", true, classLoader).getDeclaredMethod("instance", new Class[0]);
                } catch (Throwable unused) {
                    method = cls.getMethod("instance", new Class[0]);
                }
            } catch (Throwable unused2) {
                method = null;
            }
            ICoreVersion iCoreVersion = (ICoreVersion) method.invoke(null, new Object[0]);
            if (iCoreVersion == null) {
                return;
            }
            jVar.a(iCoreVersion);
        } catch (Throwable th) {
            Log.d("LastRCI", "updateCoreVer failed:", th);
        }
    }

    public static void b(Context context) {
        e.b(context);
    }

    static /* synthetic */ void b(Context context, j jVar) {
        synchronized (x) {
            try {
                if (context == null || jVar == null) {
                    Log.d("LastRCI", "save failed: invalid params");
                } else if (jVar.s() != null || !TextUtils.isEmpty(jVar.t()) || jVar.a()) {
                    e.a(context, new c(jVar).toString());
                } else {
                    Log.d("LastRCI", "save failed: not support for specificed dir");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context) {
        AtomicBoolean atomicBoolean;
        if (!GlobalSettings.getBoolValue(70) || x.get()) {
            return;
        }
        synchronized (x) {
            if (x.get()) {
                return;
            }
            try {
                y = a(new d(context));
                atomicBoolean = x;
            } catch (UCKnownException e2) {
                Log.d("LastRCI", "reuse failed:" + e2.errMsg(), e2);
                atomicBoolean = x;
            }
            atomicBoolean.set(true);
        }
    }
}
