package tb;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.WindowManager;
import com.taobao.android.weex_framework.util.f;
import io.unicorn.embedding.android.AndroidTouchProcessor;
import io.unicorn.embedding.android.RenderMode;
import io.unicorn.embedding.android.TransparencyMode;
import io.unicorn.embedding.android.UnicornSurfaceView;
import io.unicorn.embedding.android.UnicornView;
import io.unicorn.embedding.android.e;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.common.c;
import io.unicorn.plugin.common.d;
import io.unicorn.plugin.common.h;
import io.unicorn.plugin.common.k;
import io.unicorn.plugin.network.ExternalAdapterNetwork;
import io.unicorn.plugin.platform.PlatformViewsController;
import io.unicorn.plugin.platform.g;
import io.unicorn.plugin.platform.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes9.dex */
public class rtg {

    /* renamed from: a  reason: collision with root package name */
    FutureTask<a> f33356a;
    private b c;
    private long d;
    private rtf e;
    private boolean b = false;
    private boolean f = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final String f33359a;
        final String b;
        final String d;

        static {
            kge.a(1861354441);
        }

        private a(String str, String str2, String str3) {
            this.f33359a = str;
            this.b = str2;
            this.d = str3;
        }
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f33360a;

        static {
            kge.a(1968185759);
        }

        public String a() {
            return this.f33360a;
        }
    }

    static {
        kge.a(-643605560);
    }

    static /* synthetic */ void a(rtg rtgVar, Context context) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        UnicornView.preloadClass();
        io.unicorn.embedding.engine.a.b();
        io.unicorn.embedding.engine.b.a();
        PlatformViewsController.u();
        i.a();
        io.unicorn.plugin.platform.a.a();
        e.a();
        io.unicorn.plugin.platform.e.c();
        rti.d();
        rtj.a();
        rtk.c();
        io.unicorn.plugin.common.a.a();
        k.a();
        d.a();
        c.a();
        rtl.c();
        h.a();
        rto.e();
        io.unicorn.embedding.engine.renderer.a.f();
        rtq.b();
        rtr.b();
        io.unicorn.plugin.platform.c.a();
        g.a();
        io.unicorn.plugin.platformview.a.b();
        io.unicorn.embedding.android.h.b();
        RenderMode.values();
        TransparencyMode.values();
        io.unicorn.embedding.android.a.e();
        rtp.a();
        UnicornSurfaceView.preloadClass();
        AndroidTouchProcessor.a();
        rtd.b("init", "preload Class");
    }

    public void a(Context context) {
        a(context, new b());
    }

    public void a(Context context, b bVar) {
        a(context, bVar, true);
    }

    public void a(Context context, b bVar, boolean z) {
        if (this.c != null) {
            return;
        }
        if (z && Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        final Context applicationContext = context.getApplicationContext();
        this.c = bVar;
        this.d = SystemClock.uptimeMillis();
        this.e = rte.a(applicationContext);
        (Build.VERSION.SDK_INT >= 23 ? io.unicorn.view.b.a((DisplayManager) applicationContext.getSystemService("display")) : io.unicorn.view.b.a(((WindowManager) applicationContext.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getRefreshRate())).a();
        this.f33356a = new FutureTask<>(new Callable<a>() { // from class: tb.rtg.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public a call() {
                try {
                    if (rtc.a().b()) {
                        System.loadLibrary("unicorn");
                    }
                } catch (Throwable th) {
                    Log.e("Weex", "load unicorn so error: ", th);
                }
                FlutterJNI.onLoadedLibrary();
                FlutterJNI.updateRefreshRate();
                ExternalAdapterNetwork.instance().installDefaultProvider();
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.rtg.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            boolean b2 = f.b();
                            Log.e("Weex", "useSystemFont: " + b2);
                            FlutterJNI.nativePrefetchDefaultFontManager(b2);
                            rtg.d();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                });
                try {
                    rtg.a(rtg.this, applicationContext);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return new a(rtt.a(applicationContext), rtt.c(applicationContext), applicationContext.getCacheDir().getPath());
            }
        });
        com.taobao.android.weex_framework.util.g.d("load unicorn sync init");
        this.f33356a.run();
    }

    public void a(Context context, String[] strArr) {
        if (this.b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            a aVar = this.f33356a.get();
            ArrayList arrayList = new ArrayList();
            arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
            arrayList.add("--icu-native-lib-path=" + this.e.c + File.separator + "libunicorn.so");
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            arrayList.add("--cache-dir-path=" + aVar.b);
            if (this.c.a() != null) {
                arrayList.add("--log-tag=" + this.c.a());
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.d;
            if (rtc.a().b()) {
                FlutterJNI.nativeInit(context, (String[]) arrayList.toArray(new String[0]), aVar.d, aVar.f33359a, aVar.b, uptimeMillis);
            }
            this.b = true;
        } catch (Exception e) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            FlutterJNI.nativeWarmUpDefaultFont();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
