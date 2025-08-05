package com.uc.webview.internal;

import com.taobao.orange.OConstant;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.extension.UCExtension;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.setup.l;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23884a = false;
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final a c = new a((byte) 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Object f23885a;

        private a() {
            this.f23885a = new Object();
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public static boolean a() {
            return e.e();
        }

        private static boolean d() {
            if (!e.e()) {
                l b = l.b();
                if (!(b.f23974a.a(32) || b.f23974a.a(64))) {
                    return false;
                }
            }
            return true;
        }

        private void e() {
            synchronized (this.f23885a) {
                try {
                    this.f23885a.wait(200L);
                } catch (Exception e) {
                    Log.i("WebViewFactory", OConstant.DIMEN_FILE_LOCK, e);
                }
            }
        }

        public final void b() {
            if (!e.e()) {
                c();
            }
        }

        final void c() {
            int intValue = GlobalSettings.getIntValue(130);
            boolean boolValue = GlobalSettings.getBoolValue(74);
            boolean z = intValue < 0;
            String format = String.format("maxWaitMillis:%d, untilFinished:%b, canFallbackSystem:%b", Integer.valueOf(intValue), Boolean.valueOf(z), Boolean.valueOf(boolValue));
            Log.w("WebViewFactory", "waitForInit ".concat(String.valueOf(format)));
            long j = intValue;
            com.uc.webview.base.b.a("ucbsInitWait", String.format("%s, ts:%s", format, com.uc.webview.base.klog.a.b(j)));
            com.uc.webview.base.c cVar = new com.uc.webview.base.c();
            while (!d()) {
                e();
                if (!z && cVar.a() >= j) {
                    break;
                }
            }
            long a2 = cVar.a();
            synchronized (a.class) {
                if (!e.e()) {
                    if (boolValue) {
                        Log.w("WebViewFactory", "waitForInit timeout fallback to system");
                        e.a(2, 4);
                    } else {
                        Log.w("WebViewFactory", String.format("Thread [%s] waitting for init is up to [%s] milis.", Thread.currentThread().getName(), String.valueOf(intValue)));
                        ErrorCode.INIT_WAIT_TIMEOUT.report();
                    }
                }
                Log.d("WebViewFactory", "waitForInit(untilFinished:" + z + ", maxWaitMillis:" + intValue + ", realWaiMillist:" + a2 + ")=" + e.b.get());
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f23886a;
        public final IWebView b;
        public final f c;
        public final WebSettings d;
        public final UCExtension e;

        private b(int i, IWebView iWebView, f fVar, WebSettings webSettings, UCExtension uCExtension) {
            this.f23886a = i;
            this.b = iWebView;
            this.c = fVar;
            this.d = webSettings;
            this.e = uCExtension;
        }

        /* synthetic */ b(int i, IWebView iWebView, f fVar, WebSettings webSettings, UCExtension uCExtension, byte b) {
            this(i, iWebView, fVar, webSettings, uCExtension);
        }
    }

    public static int a() {
        c.b();
        return b.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r12 == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.uc.webview.internal.e.b a(android.content.Context r8, com.uc.webview.export.WebView r9, android.util.AttributeSet r10, boolean r11, boolean r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            java.lang.String r0 = "WebViewFactory.createWebView"
            com.uc.webview.base.timing.TraceEvent r0 = com.uc.webview.base.timing.TraceEvent.scoped(r0)
            boolean r1 = com.uc.webview.internal.e.f23884a     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "WebViewFactory"
            r3 = 2
            if (r1 != 0) goto L57
            if (r11 == 0) goto L10
            goto L57
        L10:
            if (r12 != 0) goto L4f
            com.uc.webview.internal.e$a r12 = com.uc.webview.internal.e.c     // Catch: java.lang.Throwable -> Ld3
            boolean r1 = com.uc.webview.internal.e.a.a()     // Catch: java.lang.Throwable -> Ld3
            if (r1 != 0) goto L4f
            com.uc.webview.internal.setup.l r1 = com.uc.webview.internal.setup.l.b()     // Catch: java.lang.Throwable -> Ld3
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> Ld3
            if (r1 != 0) goto L33
            java.lang.String r12 = "no init task fallback to system"
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch: java.lang.Throwable -> Ld3
            r1.<init>()     // Catch: java.lang.Throwable -> Ld3
            com.uc.webview.base.Log.rInfo(r2, r12, r1)     // Catch: java.lang.Throwable -> Ld3
            r12 = 5
            a(r3, r12)     // Catch: java.lang.Throwable -> Ld3
            goto L4f
        L33:
            r1 = 65502094(0x3e77b8e, float:1.36053265E-36)
            com.uc.webview.base.timing.TraceEvent r1 = com.uc.webview.base.timing.TraceEvent.scoped(r1)     // Catch: java.lang.Throwable -> Ld3
            r12.c()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.lang.Throwable -> Ld3
            goto L4f
        L43:
            r8 = move-exception
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> Ld3
        L4e:
            throw r8     // Catch: java.lang.Throwable -> Ld3
        L4f:
            java.util.concurrent.atomic.AtomicInteger r12 = com.uc.webview.internal.e.b     // Catch: java.lang.Throwable -> Ld3
            int r12 = r12.get()     // Catch: java.lang.Throwable -> Ld3
            if (r12 != 0) goto L58
        L57:
            r12 = 2
        L58:
            r1 = 0
            if (r3 != r12) goto L5d
            r3 = 1
            goto L5e
        L5d:
            r3 = 0
        L5e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = "createWebView(forceSys="
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Ld3
            r4.append(r11)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r11 = ", creatingSysWin="
            r4.append(r11)     // Catch: java.lang.Throwable -> Ld3
            boolean r11 = com.uc.webview.internal.e.f23884a     // Catch: java.lang.Throwable -> Ld3
            r4.append(r11)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r11 = ", useSys="
            r4.append(r11)     // Catch: java.lang.Throwable -> Ld3
            r4.append(r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r11 = ")="
            r4.append(r11)     // Catch: java.lang.Throwable -> Ld3
            r4.append(r12)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> Ld3
            com.uc.webview.base.Log.d(r2, r11)     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto L90
            com.uc.webview.internal.android.WebViewAndroid r10 = com.uc.webview.internal.android.WebViewAndroid.create(r8, r10, r9)     // Catch: java.lang.Throwable -> Ld3
            goto L94
        L90:
            com.uc.webview.internal.interfaces.IWebView r10 = com.uc.webview.internal.b.a(r8, r10, r13)     // Catch: java.lang.Throwable -> Ld3
        L94:
            r10.setOverrideObject(r9)     // Catch: java.lang.Throwable -> Ld3
            com.uc.webview.internal.interfaces.IWebViewExtension r9 = r10.getExtension()     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto La9
            com.uc.webview.internal.interfaces.IWebViewExtension r9 = r10.getExtension()     // Catch: java.lang.Throwable -> Ld3
            com.uc.webview.export.extension.UCClient r11 = new com.uc.webview.export.extension.UCClient     // Catch: java.lang.Throwable -> Ld3
            r11.<init>()     // Catch: java.lang.Throwable -> Ld3
            r9.setClient(r11)     // Catch: java.lang.Throwable -> Ld3
        La9:
            com.uc.webview.export.WebSettings r5 = r10.getSettingsInner()     // Catch: java.lang.Throwable -> Ld3
            r5.setMixedContentMode(r1)     // Catch: java.lang.Throwable -> Ld3
            com.uc.webview.internal.e$b r9 = new com.uc.webview.internal.e$b     // Catch: java.lang.Throwable -> Ld3
            com.uc.webview.internal.f r4 = new com.uc.webview.internal.f     // Catch: java.lang.Throwable -> Ld3
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> Ld3
            r4.<init>(r8, r10)     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto Lc0
            r8 = 0
        Lbe:
            r6 = r8
            goto Lc6
        Lc0:
            com.uc.webview.export.extension.UCExtension r8 = new com.uc.webview.export.extension.UCExtension     // Catch: java.lang.Throwable -> Ld3
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Ld3
            goto Lbe
        Lc6:
            r7 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto Ld2
            r0.close()
        Ld2:
            return r9
        Ld3:
            r8 = move-exception
            if (r0 == 0) goto Lde
            r0.close()     // Catch: java.lang.Throwable -> Lda
            goto Lde
        Lda:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lde:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.e.a(android.content.Context, com.uc.webview.export.WebView, android.util.AttributeSet, boolean, boolean, java.util.Map):com.uc.webview.internal.e$b");
    }

    public static void a(int i, int i2) {
        if (i != 0) {
            Log.rInfo("WebViewFactory", "setCoreType:" + i + ", reason:" + i2);
            l.a(i, i2);
            b.set(i);
            a aVar = c;
            synchronized (aVar.f23885a) {
                try {
                    aVar.f23885a.notifyAll();
                } catch (Exception e) {
                    Log.i("WebViewFactory", OConstant.DIMEN_FILE_LOCK, e);
                }
            }
        }
    }

    public static void a(boolean z) {
        f23884a = z;
    }

    public static void b() {
        c.b();
    }

    public static int c() {
        return b.get();
    }

    public static boolean d() {
        return a() == 2;
    }

    public static boolean e() {
        return b.get() != 0;
    }
}
