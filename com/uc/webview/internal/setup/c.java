package com.uc.webview.internal.setup;

import android.support.media.ExifInterface;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.build.CoreType;
import com.uc.webview.base.io.PathUtils;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final AtomicInteger f23892a;
    final boolean b;
    a c;
    private final boolean d;
    private final boolean e;
    private C1042c f;

    /* loaded from: classes9.dex */
    class a {

        /* renamed from: a  reason: collision with root package name */
        final File f23895a;
        private final String c = PathUtils.b();
        private final int d;
        private final File e;

        public a(File file) {
            this.e = file;
            int a2 = a(this.c);
            File a3 = a(this.c, a2);
            String str = "index:" + String.valueOf(a2);
            if (a3.exists() && a3.lastModified() + 3600000 < System.currentTimeMillis()) {
                Log.d("NCD", "CFlag: expired and reset");
                str = str + ", expired";
                b();
                a3 = a(this.c, 1);
                a2 = 1;
            }
            this.d = a2;
            this.f23895a = a3;
            Log.d("NCD", "CFlag: " + this.f23895a.getAbsolutePath());
            com.uc.webview.base.b.a("ucbsNCDFlag", str);
        }

        private int a(String str) {
            for (int i = 1; i <= 3; i++) {
                if (!a(str, i).exists()) {
                    return i;
                }
            }
            return 4;
        }

        private File a(String str, int i) {
            File file = this.e;
            return new File(file, str + "_" + String.valueOf(i));
        }

        public final boolean a() {
            return this.d > 3;
        }

        public final void b() {
            Log.d("NCD", "CFlag: clear");
            for (int i = 1; i <= 3; i++) {
                com.uc.webview.base.io.d.c("NCD-c", a(this.c, i));
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f23896a = new c((byte) 0);
    }

    /* renamed from: com.uc.webview.internal.setup.c$c  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    class C1042c {

        /* renamed from: a  reason: collision with root package name */
        final AtomicInteger f23897a;
        final com.uc.webview.base.c b;
        long c;

        private C1042c() {
            this.f23897a = new AtomicInteger(0);
            this.b = new com.uc.webview.base.c();
            this.c = 0L;
        }

        /* synthetic */ C1042c(c cVar, byte b) {
            this();
        }
    }

    private c() {
        int b2;
        boolean z = false;
        this.f23892a = new AtomicInteger(0);
        this.d = CoreType.CORE_THICK != CoreType.Type && GlobalSettings.getBoolValue(69);
        boolean z2 = this.d && (13 == (b2 = com.uc.webview.base.b.b()) || 14 == b2);
        this.b = (!z2 || !this.d) ? false : b(com.uc.webview.base.b.a("nativeCrashLibName"));
        this.e = (z2 || this.b) ? true : z;
        String str = "enabled: " + this.d + ", nativeCrash: " + this.e + ", coreLibCrash: " + this.b;
        Log.d("NCD", str);
        com.uc.webview.base.b.a("ucbsNCDFeat", str);
        if (GlobalSettings.getBoolValue(67)) {
            com.uc.webview.base.b.a("u4sdk-init-logs", new Callable<String>() { // from class: com.uc.webview.internal.setup.c.2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ String call() throws Exception {
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder();
                    j e = l.b().e();
                    String a2 = e != null ? f.a(e.coreClassLoader()) : null;
                    sb.append("!!runningCore:\n");
                    sb.append(e != null ? e.toString() : "null");
                    sb.append("\n!!nativeLibsInfo:\n");
                    if (StringUtils.isEmpty(a2)) {
                        a2 = "null";
                    }
                    sb.append(a2);
                    sb.append("\n!!rootDirFiles:\n");
                    sb.append(com.uc.webview.base.io.d.a(EnvInfo.getContext()));
                    sb.append("\n\ninit logs start:\n");
                    Log.a(sb);
                    sb.append("\n !!total time:" + (System.currentTimeMillis() - currentTimeMillis));
                    return sb.toString();
                }
            });
        }
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    private static boolean b(String str) {
        return !StringUtils.isEmpty(str) && str.contains("webviewuc");
    }

    public final void a(final int i, final boolean z) {
        if (!this.d) {
            return;
        }
        com.uc.webview.base.task.d.b("NCD", new Runnable() { // from class: com.uc.webview.internal.setup.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                int i2 = i;
                boolean z2 = z;
                synchronized (cVar.f23892a) {
                    if (cVar.c == null) {
                        return;
                    }
                    int i3 = cVar.f23892a.get();
                    StringBuilder sb = new StringBuilder("onInitNative");
                    sb.append(z2 ? UTConstant.Args.UT_SUCCESS_F : ExifInterface.LATITUDE_SOUTH);
                    sb.append(ResponseProtocolType.COMMENT);
                    String sb2 = sb.toString();
                    Log.d("NCD", sb2 + i2 + ", now:" + i3);
                    boolean z3 = (i3 & i2) != 0;
                    if (z2) {
                        if (!z3) {
                            Log.d("NCD", sb2 + FactoryType.TYPE_INVALID);
                            return;
                        }
                        cVar.f23892a.set(i2 ^ i3);
                        if (cVar.c() && !cVar.b) {
                            a aVar = cVar.c;
                            Log.d("NCD", "CFlag: fin");
                            com.uc.webview.base.io.d.c("NCD-f", aVar.f23895a);
                        }
                    } else if (z3) {
                        Log.d("NCD", sb2 + com.taobao.android.weex_framework.util.a.ATOM_EXT_repeat);
                    } else {
                        cVar.f23892a.set(i2 | i3);
                        if (!cVar.c()) {
                            a aVar2 = cVar.c;
                            Log.d("NCD", "CFlag: sta");
                            com.uc.webview.base.io.d.b("NCD-s", aVar2.f23895a);
                        }
                    }
                }
            }
        });
    }

    public final void a(File file) {
        if (!this.d) {
            return;
        }
        synchronized (this.f23892a) {
            this.c = new a(file);
        }
    }

    public final synchronized void a(String str) {
        Log.d("NCD", "PFlag: process crashed on ".concat(String.valueOf(str)));
        if (this.d && b(str)) {
            if (this.f == null) {
                this.f = new C1042c(this, (byte) 0);
            }
            C1042c c1042c = this.f;
            c1042c.f23897a.incrementAndGet();
            c1042c.c = c1042c.b.a();
            String str2 = "count:" + c1042c.f23897a.get() + ", " + c1042c.c;
            Log.d("NCD", "PFlag: crashed ".concat(String.valueOf(str2)));
            com.uc.webview.base.b.a("ucbsNCDProc", str2);
            C1042c c1042c2 = this.f;
            boolean z = true;
            if (c1042c2.f23897a.get() >= 4 && c1042c2.c <= 60000) {
                Log.w("NCD", "PFlag: maybe damaged");
                com.uc.webview.base.b.a("ucbsProcNativeMaybeDamaged", "crashedCnt:" + this.f.f23897a.get() + ", crashedInterval:" + this.f.c);
                j e = l.b().e();
                if (e != null) {
                    com.uc.webview.internal.setup.verify.d.b(e);
                }
            } else if (this.f.c <= 60000) {
                z = false;
            }
            if (z) {
                Log.d("NCD", "PFlag: reset");
                this.f = null;
            }
        }
    }

    public final boolean a() {
        boolean z = false;
        if (!this.d || !this.e) {
            return false;
        }
        synchronized (this.f23892a) {
            if (this.c != null) {
                z = this.c.a();
            }
        }
        return z;
    }

    public final void b() {
        if (!this.d) {
            return;
        }
        synchronized (this.f23892a) {
            if (this.c != null) {
                this.c.b();
            }
            this.c = null;
        }
    }

    final boolean c() {
        return this.f23892a.get() == 0;
    }
}
