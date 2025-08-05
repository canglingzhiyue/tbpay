package com.taobao.android.diagnose.scene;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.c;
import com.taobao.android.diagnose.scene.b;
import com.taobao.android.diagnose.scene.engine.reader.d;
import com.taobao.android.diagnose.v;
import com.taobao.android.x;
import com.taobao.tao.log.TLog;
import java.util.List;
import tb.fmx;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final fmx f;

    /* renamed from: a */
    private Context f11716a;
    private b b = null;
    private com.taobao.android.diagnose.model.a c;
    private d d;
    private x.a e;

    public static /* synthetic */ void lambda$C1XES4MOkEkmhNgdkofdvGmDroQ(a aVar, Uri uri, String str) {
        aVar.a(uri, str);
    }

    public static /* synthetic */ void lambda$Llz4old81pObDyDQrP5kl9wC500(a aVar) {
        aVar.f();
    }

    public static /* synthetic */ void lambda$NrMZMoKHSyIy2vH_saqOaCaEzoA(a aVar) {
        aVar.e();
    }

    /* renamed from: lambda$yLEbzggE-loMXHLoHvM1V4Ndyqs */
    public static /* synthetic */ void m911lambda$yLEbzggEloMXHLoHvM1V4Ndyqs(a aVar) {
        aVar.g();
    }

    static {
        kge.a(214857602);
        f = new fmx();
    }

    public a(Context context, com.taobao.android.diagnose.model.a aVar) {
        this.f11716a = context;
        this.c = aVar;
        this.d = new d(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        v.a("SceneManager", "SceneManager init");
        if (!com.taobao.android.diagnose.config.a.b()) {
            v.d("SceneManager", "SceneManager is disable");
            return;
        }
        try {
            this.d.a(this);
            if (a("scene_screenshot")) {
                d();
            } else {
                v.b("SceneManager", "ScreenShot scene is disable");
            }
        } catch (Exception e) {
            v.a("SceneManager", "init failed: ", e);
        }
    }

    public static boolean a(String str) {
        List<String> k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (com.taobao.android.diagnose.config.a.b() && !TextUtils.isEmpty(str) && (k = com.taobao.android.diagnose.config.a.k()) != null && !k.isEmpty()) {
            return k.contains(str);
        }
        return false;
    }

    public int a(String str, fmx fmxVar) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28c54264", new Object[]{this, str, fmxVar})).intValue();
        }
        if (!a(str) || (dVar = this.d) == null) {
            return 0;
        }
        return dVar.a(str, fmxVar);
    }

    public int b(String str, fmx fmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dae0aa5", new Object[]{this, str, fmxVar})).intValue();
        }
        if (fmxVar == null) {
            fmxVar = new fmx();
        }
        fmxVar.a("fact_biz_name", str);
        return a("scene_custom", fmxVar);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = new b(this.f11716a);
        this.b.a(new b.a() { // from class: com.taobao.android.diagnose.scene.-$$Lambda$a$C1XES4MOkEkmhNgdkofdvGmDroQ
            @Override // com.taobao.android.diagnose.scene.b.a
            public final void onScreenShot(Uri uri, String str) {
                a.lambda$C1XES4MOkEkmhNgdkofdvGmDroQ(a.this, uri, str);
            }
        });
    }

    public /* synthetic */ void a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1b95e9", new Object[]{this, uri, str});
            return;
        }
        if (this.c.i().isInner && this.e != null) {
            c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.scene.-$$Lambda$a$yLEbzggE-loMXHLoHvM1V4Ndyqs
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.m911lambda$yLEbzggEloMXHLoHvM1V4Ndyqs(a.this);
                }
            });
        }
        c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.scene.-$$Lambda$a$Llz4old81pObDyDQrP5kl9wC500
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$Llz4old81pObDyDQrP5kl9wC500(a.this);
            }
        });
    }

    public /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            this.c.d();
        } catch (Exception e) {
            v.a("SceneManager", "initScreenshotScene runnable: ", e);
        }
    }

    public /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TLog.loge("Diagnose", "SceneManager", "onScreenShotScene");
        a("scene_screenshot", new fmx());
    }

    public static synchronized <T> void a(String str, T t) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{str, t});
                return;
            }
            if (com.taobao.android.diagnose.config.a.b() && !TextUtils.isEmpty(str)) {
                f.a(str, t);
            }
        }
    }

    public static synchronized fmx b() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fmx) ipChange.ipc$dispatch("16b6500c", new Object[0]);
            }
            return f;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(true, new Runnable() { // from class: com.taobao.android.diagnose.scene.-$$Lambda$a$NrMZMoKHSyIy2vH_saqOaCaEzoA
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$NrMZMoKHSyIy2vH_saqOaCaEzoA(a.this);
            }
        });
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        v.a("SceneManager", "Trigger SCENE_CHANGE_CONFIG after force update!");
        a("scene_change_config", (fmx) null);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.b(str);
    }

    public void a(x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ede355", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }
}
