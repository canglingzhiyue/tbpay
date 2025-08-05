package com.alibaba.wireless.security.framework;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.framework.utils.FLOG;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.open.SecException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.bgy;
import tb.iju;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class d implements ISGPluginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Boolean t = null;
    private static Boolean u = null;
    private static String[] v = null;
    private static String w = null;
    private static volatile boolean x = true;
    private List<Runnable> b;
    private Context c;

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f4276a = null;
    private final ConcurrentHashMap<String, com.alibaba.wireless.security.framework.c> d = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Class, Object> e = new ConcurrentHashMap<>();
    private IRouterComponent f = null;
    public com.alibaba.wireless.security.framework.utils.b g = null;
    private boolean h = true;
    private String i = null;
    private String j = null;
    private com.alibaba.wireless.security.framework.b k = null;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = true;
    private boolean p = false;
    private File q = null;
    private File r = null;
    private File s = null;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f4277a;
        public final /* synthetic */ String b;

        static {
            kge.a(970162257);
            kge.a(-1390502639);
        }

        public a(File file, String str) {
            this.f4277a = file;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File filesDir;
            File[] listFiles;
            File[] listFiles2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f4277a != null && this.f4277a.isDirectory() && (listFiles2 = this.f4277a.listFiles()) != null && listFiles2.length > 0) {
                    for (File file : listFiles2) {
                        if (file.isDirectory() && file.getName().startsWith("app_") && !file.getName().equals(this.b)) {
                            d.a(d.this, file);
                        } else if (file.getName().startsWith("libsg")) {
                            file.delete();
                        }
                    }
                }
                if (d.a(d.this) == null || (filesDir = d.a(d.this).getFilesDir()) == null || !filesDir.isDirectory() || (listFiles = filesDir.listFiles()) == null || listFiles.length <= 0) {
                    return;
                }
                for (File file2 : listFiles) {
                    if (file2.getName().startsWith("libsecuritysdk")) {
                        file2.delete();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4278a;
        public final /* synthetic */ String b;

        static {
            kge.a(970162258);
            kge.a(-1390502639);
        }

        public b(String str, String str2) {
            this.f4278a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d.a(d.this, this.f4278a, this.b, true);
            } catch (SecException e) {
                FLOG.w("load weak dependency notDelay", e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4279a;
        public final /* synthetic */ String b;

        static {
            kge.a(970162259);
            kge.a(-1390502639);
        }

        public c(String str, String str2) {
            this.f4279a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                d.a(d.this, this.f4279a, this.b, true);
            } catch (SecException e) {
                FLOG.w("load weak dependency", e);
            }
        }
    }

    /* renamed from: com.alibaba.wireless.security.framework.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0162d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(970162260);
            kge.a(-1390502639);
        }

        public RunnableC0162d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.b(d.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(970162261);
            kge.a(-1390502639);
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (d.c(d.this) == null || Build.VERSION.SDK_INT < 18) {
            } else {
                FLOG.w("quitSafely");
                d.c(d.this).quitSafely();
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4282a;
        public final /* synthetic */ int b;

        static {
            kge.a(970162262);
            kge.a(-1390502639);
        }

        public f(String str, int i) {
            this.f4282a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d.a(d.this, 100048, SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR, "Dynamic update rejected", "Arch=" + this.f4282a, "DeployVersion=" + this.b, "", "");
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4283a;
        public final /* synthetic */ File b;
        public final /* synthetic */ File c;

        static {
            kge.a(970162263);
            kge.a(-1390502639);
        }

        public g(String str, File file, File file2) {
            this.f4283a = str;
            this.b = file;
            this.c = file2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d dVar = d.this;
            d.a(dVar, 100179, 4, "updInfo=" + this.f4283a, this.b.getAbsolutePath(), this.c.getAbsolutePath(), "", "");
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f4284a;

        static {
            kge.a(970162264);
            kge.a(-1390502639);
        }

        public h(File file) {
            this.f4284a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, 100179, 4, this.f4284a.getAbsolutePath(), "", "", "", "");
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f4285a;

        static {
            kge.a(970162265);
            kge.a(-1390502639);
        }

        public i(File file) {
            this.f4285a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, 100179, 2, this.f4285a.getAbsolutePath(), "", "", "", "");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public File f4286a;
        public File b;
        public File c;
        public boolean d;

        static {
            kge.a(970162266);
        }

        public j(File file, File file2, File file3, boolean z) {
            this.f4286a = file;
            this.b = file2;
            this.c = file3;
            this.d = z;
        }
    }

    static {
        kge.a(501567636);
        kge.a(-617388691);
        v = new String[]{"armeabi", iju.ABI_ARM, "x86", iju.ABI_ARM64, "x86_64"};
    }

    public static /* synthetic */ Context a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6752cdfd", new Object[]{dVar}) : dVar.c;
    }

    private PackageInfo a(String str, j jVar, String str2) throws SecException {
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("832988e", new Object[]{this, str, jVar, str2});
        }
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.c.getPackageManager().getPackageArchiveInfo(jVar.f4286a.getAbsolutePath(), 133);
        } catch (Throwable th) {
            String str4 = str3 + th;
            String d = d(jVar.f4286a.getAbsolutePath() + str3);
            File file = jVar.c;
            a(100043, 133, "getPackageArchiveInfo failed", str4, d, file != null ? d(file.getAbsolutePath()) : str3, str2);
            if (jVar.f4286a.exists() && !e(jVar.f4286a)) {
                jVar.f4286a.delete();
            }
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        String str5 = str + riy.ARRAY_START_STR + str2 + riy.ARRAY_END_STR;
        String d2 = d(jVar.f4286a.getAbsolutePath());
        File file2 = jVar.c;
        if (file2 != null) {
            str3 = d(file2.getAbsolutePath());
        }
        a(100043, 134, "packageInfo == null", str5, d2, str3, i());
        throw new SecException(134);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8 A[Catch: all -> 0x0174, TryCatch #6 {all -> 0x0174, blocks: (B:48:0x0162, B:50:0x016c, B:57:0x018c, B:59:0x0196, B:63:0x01a5, B:65:0x01a8, B:67:0x01b4, B:69:0x01ba, B:87:0x0257, B:89:0x025d, B:90:0x0270, B:92:0x0274, B:93:0x0286, B:95:0x029d, B:96:0x02b5, B:94:0x028a), top: B:264:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0230 A[Catch: all -> 0x0771, TRY_ENTER, TryCatch #5 {all -> 0x0771, blocks: (B:46:0x015d, B:54:0x0177, B:73:0x01c5, B:77:0x01ee, B:83:0x0243, B:97:0x02b6, B:98:0x02b9, B:100:0x02c4, B:82:0x0230), top: B:262:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.wireless.security.framework.c a(java.lang.String r40, com.alibaba.wireless.security.framework.d.j r41, android.content.Context r42, java.lang.String r43) throws com.alibaba.wireless.security.open.SecException {
        /*
            Method dump skipped, instructions count: 1923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, com.alibaba.wireless.security.framework.d$j, android.content.Context, java.lang.String):com.alibaba.wireless.security.framework.c");
    }

    private File a(Context context) throws SecException {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{this, context});
        }
        if (context == null) {
            a(100038, 116, "", "", "", "", "");
            throw new SecException(116);
        }
        String str = null;
        if (context != null) {
            try {
                String str2 = context.getApplicationInfo().sourceDir;
                if (str2 != null) {
                    if (new File(str2).exists()) {
                        str = (file.lastModified() / 1000) + "";
                    }
                }
            } catch (Throwable th) {
                a(100038, 115, "", "" + th, "", "", "");
                throw new SecException(th, 115);
            }
        }
        if (str == null) {
            throw new SecException(115);
        }
        this.r = context.getDir("SGLib", 0);
        File file2 = this.r;
        if (file2 == null || !file2.exists()) {
            a(100038, 109, "", "" + this.r, "", "", "");
            throw new SecException(109);
        }
        File file3 = new File(this.r.getAbsolutePath(), "app_" + str);
        if (!file3.exists()) {
            file3.mkdirs();
            if (!file3.exists()) {
                file3.mkdirs();
            }
        }
        if (x && file3.exists()) {
            x = false;
            a(this.r, "app_" + str);
        }
        if (file3.exists()) {
            return file3;
        }
        a(100038, 114, "", "", "", "", "");
        throw new SecException(114);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
        if (a(r5, r6.b()) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(android.content.Context r5, com.alibaba.wireless.security.framework.b r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "61617b1e"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.io.File r5 = (java.io.File) r5
            return r5
        L1b:
            boolean r5 = com.alibaba.wireless.security.framework.utils.e.c(r5)
            r0 = 0
            if (r5 != 0) goto Le4
            if (r6 == 0) goto Le4
            int r5 = r6.b()
            if (r5 == 0) goto Le4
            java.lang.String r5 = r6.c()
            if (r5 == 0) goto Le4
            java.lang.String r5 = r6.c()
            int r5 = r5.length()
            if (r5 <= 0) goto Le4
            boolean r5 = r4.g()
            java.lang.String r1 = "libs"
            if (r5 == 0) goto L8f
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r4.r
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "upds"
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            int r3 = r6.b()
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = r6.c()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.<init>(r2)
            int r2 = r6.b()
            boolean r2 = r4.a(r5, r2)
            if (r2 != 0) goto L90
        L8f:
            r5 = r0
        L90:
            if (r5 == 0) goto L98
            boolean r2 = r5.isDirectory()
            if (r2 != 0) goto Lda
        L98:
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r4.q
            java.lang.String r3 = r3.getAbsolutePath()
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = java.io.File.separator
            r2.append(r1)
            int r1 = r6.b()
            r2.append(r1)
            java.lang.String r1 = java.io.File.separator
            r2.append(r1)
            java.lang.String r1 = r6.c()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.<init>(r1)
            int r6 = r6.b()
            boolean r6 = r4.a(r5, r6)
            if (r6 != 0) goto Lda
            r5 = r0
        Lda:
            if (r5 == 0) goto Le3
            boolean r6 = r5.exists()
            if (r6 != 0) goto Le3
            goto Le4
        Le3:
            r0 = r5
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(android.content.Context, com.alibaba.wireless.security.framework.b):java.io.File");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(java.lang.String r14, java.io.File r15) {
        /*
            r13 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r13
            r2 = 1
            r1[r2] = r14
            r14 = 2
            r1[r14] = r15
            java.lang.String r14 = "56dbb984"
            java.lang.Object r14 = r0.ipc$dispatch(r14, r1)
            java.io.File r14 = (java.io.File) r14
            return r14
        L1b:
            r0 = 0
            android.content.Context r1 = r13.c     // Catch: java.lang.Throwable -> L25
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r1.sourceDir     // Catch: java.lang.Throwable -> L25
            goto L26
        L25:
            r1 = r0
        L26:
            if (r1 != 0) goto L29
            return r0
        L29:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "libsg"
            r3.append(r4)
            r3.append(r14)
            java.lang.String r4 = ".so"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.FLOG.i(r4)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.lang.String[] r5 = com.alibaba.wireless.security.framework.d.v     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            int r6 = r5.length     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
        L4d:
            if (r2 >= r6) goto L80
            r7 = r5[r2]     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            r8.<init>()     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            java.lang.String r9 = "lib"
            r8.append(r9)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            java.lang.String r9 = java.io.File.separator     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            r8.append(r9)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            r8.append(r7)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            java.lang.String r9 = java.io.File.separator     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            r8.append(r9)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            r8.append(r3)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            java.lang.String r8 = r8.toString()     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            java.util.zip.ZipEntry r9 = r4.getEntry(r8)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            if (r9 == 0) goto L7d
            com.alibaba.wireless.security.framework.d.w = r7     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            java.io.File r0 = r13.a(r14, r15, r4, r8)     // Catch: java.io.IOException -> L84 java.lang.Throwable -> Lab
            goto L80
        L7d:
            int r2 = r2 + 1
            goto L4d
        L80:
            r4.close()     // Catch: java.lang.Throwable -> L83
        L83:
            return r0
        L84:
            r15 = move-exception
            goto L8a
        L86:
            r14 = move-exception
            goto Lad
        L88:
            r15 = move-exception
            r4 = r0
        L8a:
            java.lang.String r2 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.FLOG.w(r2, r15)     // Catch: java.lang.Throwable -> Lab
            r6 = 100047(0x186cf, float:1.40196E-40)
            r7 = 3
            java.lang.String r8 = r15.toString()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r10 = r13.d(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r5 = r13
            r9 = r14
            r5.a(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto Laa
            r4.close()     // Catch: java.lang.Throwable -> Laa
        Laa:
            return r0
        Lab:
            r14 = move-exception
            r0 = r4
        Lad:
            if (r0 == 0) goto Lb2
            r0.close()     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.io.File):java.io.File");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File a(java.lang.String r11, java.io.File r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L21
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            r11 = 3
            r1[r11] = r13
            r11 = 4
            r1[r11] = r14
            java.lang.String r11 = "5883b570"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.io.File r11 = (java.io.File) r11
            return r11
        L21:
            r0 = 0
            if (r13 == 0) goto L65
            if (r14 == 0) goto L65
            java.lang.String r1 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.FLOG.i(r1)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.io.File r0 = r10.a(r11, r12, r1, r14)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> L5d
        L34:
            r1.close()     // Catch: java.lang.Throwable -> L5c
            goto L5c
        L38:
            r12 = move-exception
            goto L3e
        L3a:
            r11 = move-exception
            goto L5f
        L3c:
            r12 = move-exception
            r1 = r0
        L3e:
            java.lang.String r14 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.FLOG.w(r14, r12)     // Catch: java.lang.Throwable -> L5d
            r3 = 100047(0x186cf, float:1.40196E-40)
            r4 = 3
            java.lang.String r5 = r12.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r10.d(r13)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r2 = r10
            r6 = r11
            r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5c
            goto L34
        L5c:
            return r0
        L5d:
            r11 = move-exception
            r0 = r1
        L5f:
            if (r0 == 0) goto L64
            r0.close()     // Catch: java.lang.Throwable -> L64
        L64:
            throw r11
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.io.File, java.lang.String, java.lang.String):java.io.File");
    }

    private File a(String str, File file, ZipFile zipFile, String str2) throws IOException {
        ZipEntry entry;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("39b186fa", new Object[]{this, str, file, zipFile, str2});
        }
        if (zipFile == null || str2 == null || (entry = zipFile.getEntry(str2)) == null || !com.alibaba.wireless.security.framework.utils.a.a(entry.getName())) {
            return null;
        }
        File file2 = new File(file, "libsg" + str + "_inner" + entry.getTime() + ".zip");
        if ((!file2.exists() || file2.length() != entry.getSize()) && !com.alibaba.wireless.security.framework.utils.e.a(zipFile, entry, file2)) {
            FLOG.i("Extract failed!!");
            return null;
        }
        FLOG.i("Extract success");
        return file2;
    }

    private Class<?> a(ClassLoader classLoader, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a95742f9", new Object[]{this, classLoader, str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Class<?> cls = null;
        try {
            cls = Class.forName(str, true, classLoader);
        } catch (Throwable th) {
            a(100042, 132, "Class.forName failed", "" + th, str, classLoader.toString(), "");
        }
        FLOG.i("    loadClassFromClassLoader( " + str + " ) used time: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return cls;
    }

    private ClassLoader a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("d5ce8032", new Object[]{this, str, str2, new Boolean(z)});
        }
        if (!z) {
            try {
                this.g.a();
            } finally {
                if (!z) {
                    this.g.b();
                }
            }
        }
        String str3 = this.c.getApplicationInfo().nativeLibraryDir + File.pathSeparator + str2;
        if (this.i != null) {
            str3 = str3 + File.pathSeparator + this.i;
            FLOG.i("add path to native classloader " + str3);
        }
        if (w != null) {
            str3 = str3 + File.pathSeparator + this.c.getApplicationInfo().sourceDir + "!/lib/" + w;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                new File(str).setReadOnly();
            } catch (Exception unused) {
            }
        }
        return (Build.VERSION.SDK_INT < 21 || "6.0.1".equalsIgnoreCase(Build.VERSION.RELEASE)) ? new DexClassLoader(str, str2, str3, d.class.getClassLoader()) : new PathClassLoader(str, str3, d.class.getClassLoader());
    }

    private void a(int i2, int i3, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22e88ba", new Object[]{this, new Integer(i2), new Integer(i3), str, str2, str3, str4, str5});
            return;
        }
        UserTrackMethodJniBridge.addUtRecord("" + i2, i3, 0, com.alibaba.wireless.security.open.initialize.c.a(), 0L, str, str2, str3, str4, str5);
    }

    private void a(j jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cd1d3", new Object[]{this, jVar, str, str2});
        } else if (!c(jVar.c)) {
        } else {
            int b2 = this.k.b();
            String str3 = "PluginName=" + str;
            String str4 = "PluginVersion=" + str2;
            String str5 = "LibDeployVersion=" + b2;
            a(100048, 135, "Write dyInit.config", str3, str4, str5, "write success=" + com.alibaba.wireless.security.framework.utils.a.a(new File(this.q, "dyInit.config"), Integer.toString(b2)));
        }
    }

    public static /* synthetic */ void a(d dVar, int i2, int i3, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63544d7", new Object[]{dVar, new Integer(i2), new Integer(i3), str, str2, str3, str4, str5});
        } else {
            dVar.a(i2, i3, str, str2, str3, str4, str5);
        }
    }

    public static /* synthetic */ void a(d dVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de848abc", new Object[]{dVar, file});
        } else {
            dVar.a(file);
        }
    }

    private void a(File file) {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
            return;
        }
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                a(new File(file, str));
            }
        }
        file.delete();
    }

    private void a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbe2fe9", new Object[]{this, file, str});
        } else {
            new Thread(new a(file, str), "SGCleanFile").start();
        }
    }

    public static /* synthetic */ boolean a(d dVar, String str, String str2, boolean z) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a3f015f", new Object[]{dVar, str, str2, new Boolean(z)})).booleanValue() : dVar.d(str, str2, z);
    }

    private boolean a(File file, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c85ccf08", new Object[]{this, file, new Integer(i2)})).booleanValue() : new File(file, ".finish").isFile();
    }

    private boolean a(File file, File file2) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{this, file, file2})).booleanValue();
        }
        File file3 = new File(file2.getAbsolutePath() + ".tmp." + Process.myPid());
        try {
            if (file3.exists()) {
                file3.delete();
            }
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                FileChannel channel2 = new FileOutputStream(file3).getChannel();
                try {
                    channel2.transferFrom(channel, 0L, channel.size());
                    channel.close();
                    try {
                        channel2.close();
                    } catch (Throwable th) {
                        th = th;
                        fileChannel = null;
                        fileChannel2 = channel2;
                        try {
                            FLOG.w("", th);
                            a(100047, 2, th.toString(), d(file.getAbsolutePath()), d(file2.getAbsolutePath()), d(file3.getAbsolutePath()), "");
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (Throwable th2) {
                                    FLOG.w("", th2);
                                }
                            }
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (Throwable th3) {
                                    FLOG.w("", th3);
                                }
                            }
                            z = false;
                            file3.delete();
                            return z;
                        } catch (Throwable th4) {
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (Throwable th5) {
                                    FLOG.w("", th5);
                                }
                            }
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (Throwable th6) {
                                    FLOG.w("", th6);
                                }
                            }
                            file3.delete();
                            throw th4;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    fileChannel = channel;
                }
            } catch (Throwable th8) {
                th = th8;
                fileChannel2 = null;
                fileChannel = channel;
            }
        } catch (Throwable th9) {
            th = th9;
            fileChannel = null;
            fileChannel2 = null;
        }
        if (file3.length() == file.length()) {
            if (file2.exists()) {
                if (file2.length() == file.length()) {
                    file3.delete();
                    return z;
                }
                file2.delete();
            }
            z = file3.renameTo(file2);
            file3.delete();
            return z;
        }
        z = false;
        file3.delete();
        return z;
    }

    private boolean a(String str, String str2) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        for (Map.Entry<String, com.alibaba.wireless.security.framework.c> entry : this.d.entrySet()) {
            String key = entry.getKey();
            com.alibaba.wireless.security.framework.c value = entry.getValue();
            String a2 = value.a("reversedependencies");
            if (a2 != null) {
                String[] split = a2.split(";");
                for (int i2 = 0; i2 < split.length; i2++) {
                    String trim = split[i2].trim();
                    if (trim.length() != 0) {
                        String[] split2 = trim.split(":");
                        if (split2.length != 2) {
                            a(100041, 131, "nameVersionPair.length != 2", str + riy.BRACKET_START_STR + str2 + riy.BRACKET_END_STR, key + riy.BRACKET_START_STR + value.getVersion() + riy.BRACKET_END_STR, d(value.getPluginPath()), a2);
                            throw new SecException(131);
                        } else if (split2[0].equalsIgnoreCase(str) && b(str2, split2[1]) < 0) {
                            String str3 = "plugin " + str + riy.BRACKET_START_STR + str2 + ") is not meet the reverse dependency of " + key + riy.BRACKET_START_STR + value.getVersion() + "): " + split2[0] + riy.BRACKET_START_STR + split2[1] + riy.BRACKET_END_STR;
                            a(100041, 117, str3, d.class.getClassLoader().toString(), d(value.getPluginPath()), a2, "" + i2);
                            throw new SecException(str3, 117);
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b4, code lost:
        if (r21 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b6, code lost:
        r16.g.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bc, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016a, code lost:
        if (r21 == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean a(java.lang.String r17, java.lang.String r18, java.io.File r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.lang.String, java.io.File, java.lang.String, boolean):boolean");
    }

    private int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{this, str, str2})).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length < split2.length ? split.length : split2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int parseInt = Integer.parseInt(split[i2]);
            int parseInt2 = Integer.parseInt(split2[i2]);
            if (parseInt > parseInt2) {
                return 1;
            }
            if (parseInt < parseInt2) {
                return -1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:27:0x008d, B:33:0x009e, B:36:0x00a6, B:38:0x00ac, B:40:0x00b9, B:42:0x00e8, B:43:0x00ef, B:45:0x00f6, B:48:0x00fe, B:55:0x010e, B:57:0x0118, B:58:0x011f, B:60:0x0125, B:61:0x012c, B:63:0x0155, B:65:0x015b, B:67:0x0161, B:68:0x0167, B:70:0x0170, B:71:0x0176, B:73:0x019f, B:77:0x01b1, B:75:0x01ab), top: B:86:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:27:0x008d, B:33:0x009e, B:36:0x00a6, B:38:0x00ac, B:40:0x00b9, B:42:0x00e8, B:43:0x00ef, B:45:0x00f6, B:48:0x00fe, B:55:0x010e, B:57:0x0118, B:58:0x011f, B:60:0x0125, B:61:0x012c, B:63:0x0155, B:65:0x015b, B:67:0x0161, B:68:0x0167, B:70:0x0170, B:71:0x0176, B:73:0x019f, B:77:0x01b1, B:75:0x01ab), top: B:86:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.wireless.security.framework.d.j b(java.lang.String r18, java.lang.String r19, boolean r20) throws com.alibaba.wireless.security.open.SecException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.b(java.lang.String, java.lang.String, boolean):com.alibaba.wireless.security.framework.d$j");
    }

    private File b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ce89676d", new Object[]{this, file});
        }
        if (!file.exists() || !file.isDirectory() || !this.l) {
            return file;
        }
        File file2 = new File(file, "main");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return !file2.exists() ? file : file2;
    }

    private File b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("36a9927a", new Object[]{this, str});
        }
        if (this.i != null) {
            return null;
        }
        String a2 = com.alibaba.wireless.security.framework.utils.e.a(d.class.getClassLoader(), "sg" + str);
        if (a2 != null && a2.length() > 0) {
            return new File(a2);
        }
        return null;
    }

    private String b(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c798a8ac", new Object[]{this, cls});
        }
        InterfacePluginInfo interfacePluginInfo = (InterfacePluginInfo) cls.getAnnotation(InterfacePluginInfo.class);
        if (interfacePluginInfo != null) {
            return interfacePluginInfo.pluginName();
        }
        return null;
    }

    public static /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e898fe4", new Object[]{dVar});
        } else {
            dVar.h();
        }
    }

    private boolean b(File file, File file2) {
        Method method;
        try {
            Object obj = null;
            if (Build.VERSION.SDK_INT >= 21) {
                method = Class.forName("android.system.Os").getDeclaredMethod("symlink", String.class, String.class);
            } else {
                Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField("os");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
                method = obj.getClass().getMethod("symlink", String.class, String.class);
            }
            method.invoke(obj, file.getAbsolutePath(), file2.getAbsolutePath());
            return true;
        } catch (Throwable th) {
            FLOG.w("create symbolic link( " + file2.getAbsolutePath() + " -> " + file.getAbsolutePath() + " ) failed", th);
            String th2 = th.toString();
            String absolutePath = file.getAbsolutePath();
            String absolutePath2 = file2.getAbsolutePath();
            a(100047, 1, th2, absolutePath, absolutePath2, "" + Build.VERSION.SDK_INT, "");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r1 >= r0.length) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r10.equals(r0[r1]) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (new java.io.File(java.lang.String.format("%s/libsg%s.so", r11.getParent(), r0[r1])).exists() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.lang.String r10, java.io.File r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.security.framework.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r4] = r10
            r1[r2] = r11
            java.lang.String r10 = "bd68e9ae"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L1f:
            java.lang.String r0 = "main"
            java.lang.String r1 = "middletier"
            java.lang.String r5 = "securitybody"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r5}     // Catch: java.lang.Throwable -> L68
            r1 = 0
        L2d:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L68
            if (r1 >= r5) goto L68
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L68
            boolean r5 = r10.equals(r5)     // Catch: java.lang.Throwable -> L68
            if (r5 != 0) goto L3b
            int r1 = r1 + 1
            goto L2d
        L3b:
            r1 = 0
        L3c:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L68
            if (r1 >= r5) goto L68
            r5 = r0[r1]     // Catch: java.lang.Throwable -> L68
            boolean r5 = r10.equals(r5)     // Catch: java.lang.Throwable -> L68
            if (r5 != 0) goto L65
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "%s/libsg%s.so"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r11.getParent()     // Catch: java.lang.Throwable -> L68
            r7[r3] = r8     // Catch: java.lang.Throwable -> L68
            r8 = r0[r1]     // Catch: java.lang.Throwable -> L68
            r7[r4] = r8     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> L68
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L68
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L68
            if (r5 != 0) goto L65
            goto L69
        L65:
            int r1 = r1 + 1
            goto L3c
        L68:
            r3 = 1
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.b(java.lang.String, java.io.File):boolean");
    }

    public static /* synthetic */ HandlerThread c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("12f3e539", new Object[]{dVar}) : dVar.f4276a;
    }

    private ISGPluginInfo c(String str, String str2, boolean z) throws SecException {
        StringBuilder sb;
        String d;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("d533f519", new Object[]{this, str, str2, new Boolean(z)});
        } else if (!this.o || !this.m || this.d.get(getMainPluginName()) == null) {
            String str3 = FLOG.get_currentFuncName();
            long j2 = FLOG.get_currentTime();
            com.alibaba.wireless.security.framework.c cVar = this.d.get(str);
            if (cVar != null) {
                return cVar;
            }
            SGApmMonitorManager.getInstance().monitorStart(str);
            ApmMonitorAdapter.jstageStart(str, "2");
            synchronized (d.class) {
                com.alibaba.wireless.security.framework.c cVar2 = this.d.get(str);
                if (cVar2 != null) {
                    return cVar2;
                }
                if (this.q == null || !this.q.exists()) {
                    f();
                }
                ApmMonitorAdapter.jstageEnd(str, "2");
                ApmMonitorAdapter.jstageStart(str, "0");
                j b2 = b(str, str2, z);
                ApmMonitorAdapter.jstageEnd(str, "0");
                String str4 = null;
                if (b2 == null || b2.f4286a == null || !b2.f4286a.exists()) {
                    if (!z) {
                        return null;
                    }
                    String str5 = "plugin " + str + " not existed";
                    if (str2.length() != 0) {
                        str5 = str5 + ", depended by " + str2;
                    }
                    a(100044, 110, "", str, str2, "", "");
                    throw new SecException(str5, 110);
                }
                FLOG.printTimeCost(str, str3, "getPluginFile", j2);
                long j3 = FLOG.get_currentTime();
                ApmMonitorAdapter.jstageStart(str, "1");
                com.alibaba.wireless.security.framework.c a2 = a(str, b2, this.c, str2);
                ApmMonitorAdapter.jstageEnd(str, "1");
                if (this.o && this.m && !getMainPluginName().equals(str)) {
                    return this.d.get(str);
                } else if (a2 == null) {
                    if (b2.c != null) {
                        sb = new StringBuilder();
                        sb.append("src:");
                        d = d(b2.c.getAbsolutePath());
                    } else {
                        sb = new StringBuilder();
                        sb.append("zipfile:");
                        d = d(b2.f4286a.getAbsolutePath());
                    }
                    sb.append(d);
                    a(100044, 110, "", str, str2, sb.toString(), "");
                    throw new SecException(str, 111);
                } else {
                    FLOG.printTimeCost(str, str3, "loadApk", j3);
                    this.d.put(str, a2);
                    String str6 = str + riy.BRACKET_START_STR + a2.getVersion() + riy.BRACKET_END_STR;
                    String a3 = a2.a("weakdependencies");
                    if (com.alibaba.wireless.security.framework.utils.f.a(this.c, "android_sg_load_opt")) {
                        str4 = a2.a("weakdependenciesNotDelay");
                    }
                    if (str2.length() != 0) {
                        str6 = str2 + "->" + str6;
                    }
                    FLOG.w(str + " weakdependencies: " + a3);
                    FLOG.w(str + " weakdependenciesNotDelay: " + str4);
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null || myLooper == Looper.getMainLooper()) {
                        FLOG.w("looper of current thread is null, try to create a new thread with a looper");
                        if (this.f4276a == null) {
                            this.f4276a = new HandlerThread("SGBackgroud");
                            this.f4276a.setPriority(10);
                            this.f4276a.start();
                        }
                        myLooper = this.f4276a.getLooper();
                    }
                    if (myLooper == null) {
                        FLOG.w("looper is still null");
                        return a2;
                    }
                    Handler handler = new Handler(myLooper);
                    if (str4 != null && str4.trim().length() != 0) {
                        handler.post(new b(str4, str6));
                    }
                    if (a3 != null && a3.trim().length() != 0) {
                        handler.postDelayed(new c(a3, str6), 60000L);
                    }
                    handler.postDelayed(new RunnableC0162d(), 10000L);
                    handler.postDelayed(new e(), 60000L);
                    SGApmMonitorManager.getInstance().monitorEnd(str);
                    if (SGApmMonitorManager.getInstance().isAllPluginLoaded()) {
                        SGApmMonitorManager.getInstance().monitorEnd(com.alibaba.ut.abtest.internal.util.b.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
                    }
                    return a2;
                }
            }
        } else {
            obj = this.d.get(str);
        }
        return (ISGPluginInfo) obj;
    }

    private File c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{this, str});
        }
        String str2 = this.i;
        if (str2 == null) {
            try {
                str2 = this.c.getApplicationInfo().nativeLibraryDir;
            } catch (Throwable unused) {
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        File file = new File(str2 + File.separator + "libsg" + str + bgy.SO_EXTENSION);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    private boolean c() {
        com.alibaba.wireless.security.framework.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        File file = new File(b(), "upds");
        File file2 = new File(file, "update.config");
        File file3 = new File(a(), "update.config");
        if (!file2.isFile() || (a2 = com.alibaba.wireless.security.framework.b.a(file2)) == null) {
            return false;
        }
        File file4 = new File(file + File.separator + "libs" + File.separator + a2.b(), "FBD");
        HashMap<String, String> d = a2.d();
        HashMap<String, String> e2 = e();
        if (!file4.exists() && d != null && d.equals(e2)) {
            try {
                this.g.a();
                file3.delete();
                String a3 = com.alibaba.wireless.security.framework.utils.a.a(file2);
                if (a3 != null && com.alibaba.wireless.security.framework.utils.a.a(file3, a3)) {
                    return true;
                }
                this.b.add(new g(a3, file3, file2));
            } finally {
                this.g.b();
            }
        }
        return false;
    }

    private boolean c(File file) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{this, file})).booleanValue();
        }
        if (file != null && file.getParentFile() != null && this.s != null) {
            String str2 = null;
            try {
                str = file.getParentFile().getCanonicalPath();
                try {
                    str2 = this.s.getCanonicalPath();
                } catch (IOException e2) {
                    e = e2;
                    FLOG.w("", e);
                    if (str == null) {
                    }
                    return false;
                }
            } catch (IOException e3) {
                e = e3;
                str = null;
            }
            if (str == null && TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f5b6f1c", new Object[]{this, file, file2})).booleanValue();
        }
        try {
            return file.getCanonicalPath().equals(file2.getCanonicalPath());
        } catch (Throwable th) {
            FLOG.w("", th);
            a(100046, 0, th.toString(), file.getAbsolutePath(), file2.getAbsolutePath(), "", "");
            return false;
        }
    }

    private com.alibaba.wireless.security.framework.b d() {
        com.alibaba.wireless.security.framework.b a2;
        com.alibaba.wireless.security.framework.b bVar;
        String a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.security.framework.b) ipChange.ipc$dispatch("465f4b8a", new Object[]{this});
        }
        File file = new File(this.q, "update.config");
        File file2 = new File(this.q, "init.config");
        if (this.l) {
            if (!file2.isFile() && g()) {
                c();
            }
            a2 = com.alibaba.wireless.security.framework.b.a(file);
            if (a2 == null) {
                bVar = com.alibaba.wireless.security.framework.b.a(file2);
                if (bVar != null || (a3 = com.alibaba.wireless.security.framework.utils.a.a(new File(this.q, "dyInit.config"))) == null || !a3.equals(Integer.toString(bVar.b()))) {
                    return bVar;
                }
                this.b.add(new f(bVar.c(), bVar.b()));
                return null;
            }
            try {
                this.g.a();
                file2.delete();
                file.renameTo(file2);
            } finally {
            }
        } else {
            try {
                this.g.a();
                a2 = com.alibaba.wireless.security.framework.b.a(file2);
            } finally {
            }
        }
        bVar = a2;
        return bVar != null ? bVar : bVar;
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        if (str == null || str.length() <= 0) {
            return "";
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (e(file)) {
            sb.append("->");
            try {
                sb.append(file.getCanonicalPath());
            } catch (Throwable unused) {
            }
        }
        sb.append('[');
        sb.append("exists:" + file.exists() + ",");
        sb.append("size:" + file.length() + ",");
        sb.append("canRead:" + file.canRead() + ",");
        sb.append("canWrite:" + file.canWrite() + ",");
        sb.append("totalSpace:" + file.getTotalSpace() + ",");
        sb.append("freeSpace:" + file.getFreeSpace() + ",");
        sb.append(']');
        return sb.toString();
    }

    private boolean d(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f396c526", new Object[]{this, file})).booleanValue();
        }
        if (file != null) {
            try {
                String absolutePath = file.getAbsolutePath();
                if (absolutePath != null && absolutePath.length() > 0) {
                    if (com.alibaba.wireless.security.framework.utils.e.c(this.c)) {
                        return true;
                    }
                    if (!absolutePath.startsWith("/system/")) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private boolean d(String str, String str2, boolean z) throws SecException {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63ea7439", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        if (str != null && str.trim().length() != 0) {
            String[] split = str.split(";");
            int i3 = 0;
            while (i3 < split.length) {
                String trim = split[i3].trim();
                if (trim.length() != 0) {
                    String[] split2 = trim.split(":");
                    if (split2.length != i2) {
                        a(100040, 128, "nameVersionPair.length != 2", trim, str2, "" + z, "" + i3);
                        throw new SecException(128);
                    }
                    int indexOf = str2.indexOf(split2[c2]);
                    if (indexOf >= 0) {
                        int indexOf2 = str2.indexOf(riy.BRACKET_START_STR, indexOf);
                        int indexOf3 = str2.indexOf(riy.BRACKET_END_STR, indexOf);
                        if (indexOf2 < 0 || indexOf3 < 0 || indexOf2 > indexOf3) {
                            a(100040, 129, "indexLeftP < 0 || indexRightP < 0 || indexLeftP > indexRightP", "" + indexOf2, "" + indexOf3, "", "" + i3);
                            throw new SecException(129);
                        }
                        String substring = str2.substring(indexOf2 + 1, indexOf3);
                        if (b(substring, split2[1]) < 0) {
                            String str3 = "version " + substring + " of " + split2[0] + " is not meet the requirement: " + split2[1];
                            if (str2.length() != 0) {
                                str3 = str3 + ", depended by: " + str2;
                            }
                            String str4 = str3;
                            if (!z) {
                                a(100040, 113, "versionCompare(parentPluginVersion, nameVersionPair[1]) < 0", substring, split2[0], split2[1], "" + i3);
                            }
                            throw new SecException(str4, 113);
                        }
                    } else {
                        com.alibaba.wireless.security.framework.c cVar = this.d.get(split2[0]);
                        if (cVar == null) {
                            try {
                                cVar = c(split2[0], str2, !z);
                                th = null;
                            } catch (Throwable th) {
                                th = th;
                            }
                            if (cVar == null) {
                                if (!z) {
                                    if (th instanceof SecException) {
                                        throw th;
                                    }
                                    a(100040, 130, "throwable in loadPluginInner", "" + th, str, str2, "" + i3);
                                    throw new SecException(str2, 130);
                                }
                            }
                        }
                        if (b(cVar.getVersion(), split2[1]) < 0) {
                            String str5 = "version " + cVar.getVersion() + " of " + split2[0] + " is not meet the requirement: " + split2[1];
                            if (str2.length() != 0) {
                                str5 = str5 + ", depended by: " + str2;
                            }
                            if (!z) {
                                a(100040, 113, "versionCompare(dependPlugin.getVersion(), nameVersionPair[1]) < 0", cVar.getVersion(), split2[0], split2[1], "" + i3);
                            }
                            throw new SecException(str5, 113);
                        }
                    }
                }
                i3++;
                i2 = 2;
                c2 = 0;
            }
        }
        return true;
    }

    private HashMap<String, String> e() {
        String str;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[]{this});
        }
        if (this.c.getApplicationInfo() == null || (str = this.c.getApplicationInfo().nativeLibraryDir) == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : new String[]{"libsgmain", "libsgsecuritybody", "libsgmiddletier"}) {
            File file = new File(str, str2 + "so.version.so");
            if (file.isFile()) {
                hashMap.put(str2, com.alibaba.wireless.security.framework.utils.a.a(file));
            }
        }
        return hashMap;
    }

    private boolean e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c14126e7", new Object[]{this, file})).booleanValue();
        }
        try {
            File canonicalFile = file.getCanonicalFile();
            if (canonicalFile != null) {
                File parentFile = file.getParentFile();
                File parentFile2 = canonicalFile.getParentFile();
                if (parentFile != null && parentFile2 != null && !parentFile.getCanonicalPath().equals(parentFile2.getCanonicalPath())) {
                    return true;
                }
                if (!file.getName().equals(canonicalFile.getName())) {
                    return true;
                }
            }
        } catch (Throwable th) {
            FLOG.w("", th);
            a(100047, 0, th.toString(), file.getAbsolutePath(), "", "", "");
        }
        return false;
    }

    private void f() throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.q = a(this.c);
        if (this.q == null) {
            return;
        }
        Context context = this.c;
        this.g = new com.alibaba.wireless.security.framework.utils.b(context, this.q + File.separator + "lock.lock");
        this.k = d();
        this.s = a(this.c, this.k);
    }

    private boolean g() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this});
        } else {
            if (t == null) {
                t = Boolean.valueOf(new File(b(), ".sgdynkp").isFile());
                u = Boolean.valueOf(new File(b(), ".sgcpuv").isFile());
            }
            bool = t;
        }
        return bool.booleanValue();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        List<Runnable> list = this.b;
        if (list == null) {
            return;
        }
        try {
            for (Runnable runnable : list) {
                runnable.run();
            }
        } catch (Exception unused) {
        }
        this.b.clear();
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        File file = this.q;
        if (file == null || !file.exists() || !file.isDirectory()) {
            sb.append("not exists!");
        } else {
            try {
                sb.append(riy.ARRAY_START_STR);
                File[] listFiles = file.listFiles();
                for (int i2 = 0; listFiles != null && i2 < listFiles.length; i2++) {
                    File file2 = listFiles[i2];
                    if (file2.getName().startsWith("libsg") && (file2.getName().endsWith(WeexZipModule.NAME) || file2.getName().endsWith(bgy.SO_EXTENSION))) {
                        sb.append(file2.getName());
                        sb.append(riy.BRACKET_START_STR);
                        sb.append(e(file2) + " , ");
                        sb.append(file2.length());
                        sb.append(") , ");
                    }
                }
                sb.append(riy.ARRAY_END_STR);
            } catch (Throwable unused) {
            }
        }
        return sb.toString();
    }

    public File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : this.q;
    }

    public <T> T a(Class<T> cls) throws SecException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        Object obj = this.e.get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        com.alibaba.wireless.security.framework.b bVar = this.k;
        if (bVar != null) {
            str = bVar.e();
            if (str == null || str.length() == 0) {
                str = this.k.a(cls.getName());
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = b((Class<?>) cls);
        }
        if (str == null || str.length() == 0) {
            throw new SecException(150);
        }
        ISGPluginInfo pluginInfo = getPluginInfo(str);
        if (pluginInfo == null) {
            if (this.m && getMainPluginName().equals(str)) {
                throw new SecException(110);
            }
            return null;
        }
        Object obj2 = pluginInfo.getSGPluginEntry().getInterface(cls);
        if (obj2 != null) {
            this.e.put(cls, obj2);
            return cls.cast(obj2);
        }
        a(100045, 112, "", cls.getName(), str + riy.BRACKET_START_STR + pluginInfo.getVersion() + riy.BRACKET_END_STR, d(pluginInfo.getPluginPath()), "");
        throw new SecException(112);
    }

    public void a(Context context, String str, String str2, boolean z, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d04751", new Object[]{this, context, str, str2, new Boolean(z), objArr});
            return;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.c = context;
        this.j = str;
        this.l = com.alibaba.wireless.security.framework.utils.e.b(this.c);
        this.h = z;
        this.b = new ArrayList();
        UserTrackMethodJniBridge.init(this.c);
        if (str2 != null && !str2.isEmpty()) {
            this.i = str2;
        }
        try {
            f();
        } catch (SecException | Exception unused) {
        }
        this.p = this.o;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!g() || str == null) {
        } else {
            File b2 = b();
            File file = new File(b2, "upds/libs/" + str);
            if (!file.isDirectory()) {
                this.b.add(new i(file));
                return;
            }
            File file2 = new File(file, "FBD");
            if (com.alibaba.wireless.security.framework.utils.a.a(file2, "1")) {
                return;
            }
            this.b.add(new h(file2));
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.o = true;
            this.m = true;
        } else {
            this.o = this.p;
            this.m = this.n;
        }
    }

    public File b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("64f2a3c4", new Object[]{this}) : this.r;
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public <T> T getInterface(Class<T> cls) throws SecException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9842089f", new Object[]{this, cls}) : (T) a(cls);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public String getMainPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9dc2d2c", new Object[]{this}) : "main";
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public ISGPluginInfo getPluginInfo(String str) throws SecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISGPluginInfo) ipChange.ipc$dispatch("3bc6a24b", new Object[]{this, str});
        }
        FLOG.i("MockTaobaoChannel - getPluginInfo: " + str);
        return c(str, "", true);
    }

    @Override // com.alibaba.wireless.security.framework.ISGPluginManager
    public IRouterComponent getRouter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IRouterComponent) ipChange.ipc$dispatch("663bf5e4", new Object[]{this}) : this.f;
    }
}
