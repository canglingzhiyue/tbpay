package com.uc.webview.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.uc.webview.base.Log;
import com.uc.webview.internal.c;
import com.uc.webview.internal.interfaces.IPlatformPort;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.stats.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class f {
    private static c j;
    public boolean c;
    public int d = -1;
    public int e = -1;
    private Context k;
    private static final Handler g = new Handler(Looper.getMainLooper());
    private static final LinkedHashSet<IWebView> h = new LinkedHashSet<>();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f23887a = new AtomicInteger();
    public static final AtomicInteger b = new AtomicInteger();
    private static boolean i = false;
    private static final Runnable l = new Runnable() { // from class: com.uc.webview.internal.f.1
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                Iterator it = f.h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((IWebView) it.next()).getView().getWindowVisibility() == 0) {
                        z = true;
                        break;
                    }
                }
                if (z || !f.i) {
                    return;
                }
                boolean unused = f.i = false;
                Log.d("WebViewStatusMonitor", "onPause");
                IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
                if (iPlatformPort != null) {
                    iPlatformPort.onPause();
                }
                i.a().a(false);
            } catch (Throwable unused2) {
            }
        }
    };
    public static final a f = new a((byte) 0);

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f23888a;

        private a() {
            this.f23888a = new AtomicBoolean(false);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* loaded from: classes9.dex */
    class b implements c.a {
        private Context b;

        public b(Context context) {
            this.b = context.getApplicationContext();
        }

        private static void d() {
            Log.d("WebViewStatusMonitor", "onScreenUnLock");
            IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
            if (iPlatformPort != null) {
                iPlatformPort.onScreenUnLock();
                iPlatformPort.onResume();
            }
        }

        @Override // com.uc.webview.internal.c.a
        public final void a() {
            Log.d("WebViewStatusMonitor", "onScreenOn");
            c unused = f.j;
            if (!c.a(this.b)) {
                d();
            }
        }

        @Override // com.uc.webview.internal.c.a
        public final void b() {
            Log.d("WebViewStatusMonitor", "onScreenOff");
            Log.d("WebViewStatusMonitor", "onScreenLock");
            IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
            if (iPlatformPort != null) {
                iPlatformPort.onScreenLock();
                iPlatformPort.onPause();
            }
        }

        @Override // com.uc.webview.internal.c.a
        public final void c() {
            Log.d("WebViewStatusMonitor", "onUserPresent");
            d();
        }
    }

    public f(Context context, IWebView iWebView) {
        this.k = context;
        this.c = iWebView.getExtension() != null;
        if (!this.c || j != null) {
            return;
        }
        c cVar = new c(context);
        j = cVar;
        cVar.b = new b(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        cVar.f23882a.registerReceiver(cVar, intentFilter);
        if (c.a((PowerManager) cVar.f23882a.getSystemService("power"))) {
            if (cVar.b == null) {
                return;
            }
            cVar.b.a();
        } else if (cVar.b == null) {
        } else {
            cVar.b.b();
        }
    }

    public static IPlatformPort a() {
        return IPlatformPort.Instance.get();
    }

    public static String a(IWebView iWebView) {
        String url = iWebView.getUrl();
        if (url == null || url.isEmpty()) {
            return Integer.toHexString(iWebView.hashCode());
        }
        if (url.length() > 40) {
            return url.substring(0, 40) + "...@" + Integer.toHexString(iWebView.hashCode());
        }
        return url + "@" + Integer.toHexString(iWebView.hashCode());
    }

    public static void a(IWebView iWebView, int i2) {
        Log.d("WebViewStatusMonitor", "onWindowVisibilityChanged webview: " + a(iWebView) + ", visibility: " + i2);
        if (i2 != 0) {
            if (!i) {
                return;
            }
            g.removeCallbacks(l);
            g.post(l);
        } else if (i) {
        } else {
            i = true;
            Log.d("WebViewStatusMonitor", "onResume, " + a(iWebView));
            IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
            if (iPlatformPort == null) {
                return;
            }
            iPlatformPort.onResume();
        }
    }

    public static void b() {
        int i2 = b.get();
        int i3 = f23887a.get();
        com.uc.webview.base.b.a("wk_export.Webview", String.format(Locale.CHINA, "total:%d, u4:%d, system:%d", Integer.valueOf(i2 + i3), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static void b(IWebView iWebView) {
        Log.d("WebViewStatusMonitor", "onAttachedToWindow webview: " + a(iWebView));
        h.add(iWebView);
    }

    public static void c(IWebView iWebView) {
        Log.d("WebViewStatusMonitor", "onDetachedFromWindow webview: " + a(iWebView));
        h.remove(iWebView);
        if (h.isEmpty()) {
            i.a().a(true);
        }
    }
}
