package com.uc.webview.internal.stats;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.h;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import com.uc.webview.internal.setup.component.x;
import com.uc.webview.internal.setup.l;
import com.uc.webview.stat.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import tb.ils;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24000a = "i";
    private j b;
    private volatile boolean c;
    private final SimpleDateFormat d;
    private final List<d> e;
    private final b f;
    private final c g;

    /* loaded from: classes9.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f24004a = new i((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class b {
        private final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
        private int c = -1;
        private String d = null;
        private Random e = null;

        public b() {
            com.uc.webview.base.task.d.b("inisr", new Runnable() { // from class: com.uc.webview.internal.stats.i.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b();
                }
            });
        }

        public final synchronized int a() {
            h.a a2;
            if (this.c < 0) {
                String format = this.b.format(new Date());
                boolean z = true;
                if (!format.isEmpty() && !format.equals(this.d)) {
                    int i = EnvInfo.i() ? 2 : 100;
                    if (!format.equals(com.uc.webview.base.h.c("srt")) && (a2 = com.uc.webview.base.h.a()) != null) {
                        if (this.e == null) {
                            String m = EnvInfo.m();
                            if (TextUtils.isEmpty(m) || "null".equals(m)) {
                                m = EnvInfo.l();
                            }
                            this.e = TextUtils.isEmpty(m) ? new Random() : new Random(m.hashCode() ^ System.nanoTime());
                        }
                        a2.a("srt", format).a("srh", this.e.nextInt(100) + 1 <= i).a();
                    }
                    if (!com.uc.webview.base.h.a("srh")) {
                        i = 0;
                    }
                    this.c = i;
                    this.d = format;
                }
                String str = i.f24000a;
                StringBuilder sb = new StringBuilder("initRate date=");
                sb.append(this.d);
                sb.append(", rate=");
                sb.append(this.c);
                sb.append(", hit=");
                if (this.c <= 0) {
                    z = false;
                }
                sb.append(z);
                Log.d(str, sb.toString());
            }
            return this.c;
        }

        public final boolean b() {
            return !GlobalSettings.getBoolValue(76) || a() > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        long f24007a = 0;
        long b = 0;

        public c() {
        }
    }

    private i() {
        this.b = null;
        this.c = false;
        this.d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.e = Collections.synchronizedList(new ArrayList());
        this.f = new b();
        this.g = new c();
    }

    /* synthetic */ i(byte b2) {
        this();
    }

    public static i a() {
        return a.f24004a;
    }

    public static void a(Map<String, String> map) {
        map.put("u_pkg", EnvInfo.e());
        map.put("u_pm", EnvInfo.j());
        map.put("u_bd", EnvInfo.k());
        map.put("u_osv", Build.VERSION.RELEASE);
        map.put("u_uud", EnvInfo.l());
        map.put("u_utd", EnvInfo.m());
    }

    static /* synthetic */ boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            return lowerCase.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX) || lowerCase.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX);
        }
        return false;
    }

    public static void b(Map<String, String> map) {
        map.put("u_sv", Build.Version.NAME);
        map.put("u_bt", com.uc.webview.export.Build.TIME);
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        map.put("u_cv", iCoreVersion != null ? iCoreVersion.version() : com.uc.webview.export.Build.CORE_VERSION);
        map.put("u_cbt", iCoreVersion != null ? iCoreVersion.buildTimestamp() : com.uc.webview.export.Build.CORE_TIME);
        map.put("u_arch", EnvInfo.is64Bit() ? ils.ARCH_BIT64 : ils.ARCH_BIT32);
        com.uc.webview.internal.setup.j e = l.b().e();
        if (e != null) {
            map.put("u_funm", Integer.toString(e.f23970a));
        }
        map.put("u_clib", x.a() ? "1" : "0");
    }

    private static void b(boolean z) {
        if (!z) {
            return;
        }
        try {
            Thread.sleep(20L);
        } catch (Throwable unused) {
        }
    }

    private void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        com.uc.webview.base.task.d.a("uldsts", new Runnable() { // from class: com.uc.webview.internal.stats.i.3
            @Override // java.lang.Runnable
            public final void run() {
                i.this.d();
                i.this.e();
                i.this.c = false;
            }
        });
    }

    private void c(Map<String, String> map) {
        map.put("tm", this.d.format(new Date(System.currentTimeMillis())));
        map.put("u_se", GlobalSettings.getBoolValue(76) ? "1" : "0");
        map.put("u_sr", String.valueOf(this.f.a()));
        map.put("u_ct", String.valueOf(com.uc.webview.internal.e.c()));
        map.put("u_eve", GlobalSettings.getStringValue(152));
        map.put("u_ebt", GlobalSettings.getStringValue(WSContextConstant.HANDSHAKE_RECEIVE_SIZE));
        map.put("u_pf", EnvInfo.d());
        map.put("u_apd", GlobalSettings.getStringValue(184));
        map.put("u_aet", GlobalSettings.getStringValue(183));
        b(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        if (!this.f.b()) {
            Log.d(f24000a, "save failed: by sampling");
        } else if (!f()) {
            Log.b();
        } else if (this.e.isEmpty()) {
            Log.b();
        } else {
            Log.b();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.e);
            this.e.clear();
            this.b.a(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x0020, B:12:0x0035, B:21:0x006f, B:24:0x0074, B:26:0x007a, B:29:0x007f, B:31:0x008a, B:34:0x0091, B:36:0x009c, B:37:0x00b2, B:39:0x00b6, B:41:0x00bc, B:43:0x00ca, B:46:0x00d9, B:13:0x0039, B:16:0x0056), top: B:52:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x0020, B:12:0x0035, B:21:0x006f, B:24:0x0074, B:26:0x007a, B:29:0x007f, B:31:0x008a, B:34:0x0091, B:36:0x009c, B:37:0x00b2, B:39:0x00b6, B:41:0x00bc, B:43:0x00ca, B:46:0x00d9, B:13:0x0039, B:16:0x0056), top: B:52:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void e() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.uc.webview.internal.stats.i$c r0 = r8.g     // Catch: java.lang.Throwable -> Lde
            boolean r1 = com.uc.webview.base.timing.a.b     // Catch: java.lang.Throwable -> Lde
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L6c
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lde
            r0.b = r4     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "upl"
            long r4 = com.uc.webview.base.h.b(r1)     // Catch: java.lang.Throwable -> Lde
            r0.f24007a = r4     // Catch: java.lang.Throwable -> Lde
            long r4 = r0.f24007a     // Catch: java.lang.Throwable -> Lde
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L6c
            long r4 = r0.b     // Catch: java.lang.Throwable -> Lde
            long r6 = r0.f24007a     // Catch: java.lang.Throwable -> Lde
            long r4 = r4 - r6
            r1 = 134(0x86, float:1.88E-43)
            int r1 = com.uc.webview.base.GlobalSettings.getIntValue(r1)     // Catch: java.lang.Throwable -> Lde
            long r6 = (long) r1     // Catch: java.lang.Throwable -> Lde
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            if (r1 != 0) goto L39
        L35:
            com.uc.webview.base.Log.b()     // Catch: java.lang.Throwable -> Lde
            goto L6d
        L39:
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> Lde
            long r4 = r0.b     // Catch: java.lang.Throwable -> Lde
            r1.setTimeInMillis(r4)     // Catch: java.lang.Throwable -> Lde
            r0 = 11
            int r0 = r1.get(r0)     // Catch: java.lang.Throwable -> Lde
            r1 = 190(0xbe, float:2.66E-43)
            java.lang.String r1 = com.uc.webview.base.GlobalSettings.getStringValue(r1)     // Catch: java.lang.Throwable -> Lde
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lde
            if (r4 == 0) goto L56
            r0 = 0
            goto L69
        L56:
            java.lang.String r4 = "|%d|"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lde
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lde
            r5[r3] = r0     // Catch: java.lang.Throwable -> Lde
            java.lang.String r0 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> Lde
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> Lde
        L69:
            if (r0 == 0) goto L6c
            goto L35
        L6c:
            r3 = 1
        L6d:
            if (r3 != 0) goto L74
            com.uc.webview.base.Log.b()     // Catch: java.lang.Throwable -> Lde
            monitor-exit(r8)
            return
        L74:
            boolean r0 = r8.f()     // Catch: java.lang.Throwable -> Lde
            if (r0 != 0) goto L7f
            com.uc.webview.base.Log.b()     // Catch: java.lang.Throwable -> Lde
            monitor-exit(r8)
            return
        L7f:
            com.uc.webview.base.Log.b()     // Catch: java.lang.Throwable -> Lde
            com.uc.webview.internal.stats.j r0 = r8.b     // Catch: java.lang.Throwable -> Lde
            java.util.List r0 = r0.a()     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto Ld9
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto L91
            goto Ld9
        L91:
            com.uc.webview.internal.stats.a r1 = new com.uc.webview.internal.stats.a     // Catch: java.lang.Throwable -> Lde
            r1.<init>()     // Catch: java.lang.Throwable -> Lde
            boolean r1 = com.uc.webview.internal.stats.a.a(r0)     // Catch: java.lang.Throwable -> Lde
            if (r1 != 0) goto Lb2
            com.uc.webview.internal.stats.k r1 = new com.uc.webview.internal.stats.k     // Catch: java.lang.Throwable -> Lde
            r1.<init>()     // Catch: java.lang.Throwable -> Lde
            boolean r1 = r1.a(r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = "uploadToWA result:"
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lde
            r2.concat(r3)     // Catch: java.lang.Throwable -> Lde
            com.uc.webview.base.Log.b()     // Catch: java.lang.Throwable -> Lde
        Lb2:
            com.uc.webview.internal.stats.i$c r2 = r8.g     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto Lc8
            com.uc.webview.base.h$a r3 = com.uc.webview.base.h.a()     // Catch: java.lang.Throwable -> Lde
            if (r3 == 0) goto Lc8
            java.lang.String r4 = "upl"
            long r5 = r2.b     // Catch: java.lang.Throwable -> Lde
            com.uc.webview.base.h$a r2 = r3.a(r4, r5)     // Catch: java.lang.Throwable -> Lde
            r2.a()     // Catch: java.lang.Throwable -> Lde
        Lc8:
            if (r1 != 0) goto Ld7
            java.lang.String r1 = com.uc.webview.internal.stats.i.f24000a     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = "upload failed: Uploaders failed"
            com.uc.webview.base.Log.w(r1, r2)     // Catch: java.lang.Throwable -> Lde
            java.util.List<com.uc.webview.internal.stats.d> r1 = r8.e     // Catch: java.lang.Throwable -> Lde
            r1.addAll(r0)     // Catch: java.lang.Throwable -> Lde
        Ld7:
            monitor-exit(r8)
            return
        Ld9:
            com.uc.webview.base.Log.b()     // Catch: java.lang.Throwable -> Lde
            monitor-exit(r8)
            return
        Lde:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.i.e():void");
    }

    private synchronized boolean f() {
        boolean z;
        if (this.b == null) {
            Context context = EnvInfo.getContext();
            if (context == null) {
                Log.w(f24000a, "initStorage failed: ctx is null");
                z = false;
            } else {
                this.b = new j(PathUtils.a(context));
            }
        }
        z = true;
        return z;
    }

    public final void a(final int i, final String str, final boolean z) {
        if (i >= 0 && i <= 2) {
            com.uc.webview.base.task.d.b("cmpv", new Runnable() { // from class: com.uc.webview.internal.stats.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (TextUtils.isEmpty(str) || (!str.startsWith("ext:") && !str.startsWith("about:"))) {
                        a.az azVar = new a.az();
                        azVar.b = i;
                        long j = 0;
                        azVar.c = z ? 0L : 1L;
                        azVar.d = z ? 1L : 0L;
                        if (!i.a(str)) {
                            j = 1;
                        }
                        azVar.e = j;
                        azVar.k();
                    }
                }
            });
            return;
        }
        String str2 = f24000a;
        Log.e(str2, "onPageView invalid type:" + i + ", url:" + str);
    }

    public final void a(String str, Map<String, String> map) {
        c(map);
        this.e.add(new d(str, map));
        if ("sdkpv".equals(str)) {
            c();
        }
    }

    public final void a(boolean z) {
        com.uc.webview.base.task.d.a("ssts", new Runnable() { // from class: com.uc.webview.internal.stats.i.2
            @Override // java.lang.Runnable
            public final void run() {
                i.this.d();
            }
        });
        b(z);
    }
}
