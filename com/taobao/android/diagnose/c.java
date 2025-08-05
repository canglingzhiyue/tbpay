package com.taobao.android.diagnose;

import android.app.Application;
import android.content.Context;
import android.text.format.DateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.message.b;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.x;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.logger.EventLogger;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.qrn;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Context f11684a;
    private Application b;
    private boolean c;
    private File d;
    private e e;
    private final com.taobao.android.diagnose.model.a f;
    private com.taobao.android.diagnose.collector.e g;
    private com.taobao.android.diagnose.scene.a h;
    private com.taobao.android.diagnose.snapshot.a i;
    private final d j;
    private b k;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final c f11685a;

        static {
            kge.a(1563112004);
            f11685a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c81de954", new Object[0]) : f11685a;
        }
    }

    static {
        kge.a(-1475441807);
    }

    public static /* synthetic */ void lambda$h3Jj0lcqT9q18uSVx_0LY8o6e9Y(c cVar) {
        cVar.j();
    }

    public static /* synthetic */ void lambda$jKQli5gLM2YdiU1RjYrJoBFZXSU(c cVar) {
        cVar.i();
    }

    /* renamed from: lambda$yR_lD-m-8xQTR2AQ6LWubPmM3pc */
    public static /* synthetic */ void m903lambda$yR_lDm8xQTR2AQ6LWubPmM3pc(c cVar) {
        cVar.k();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c81de954", new Object[0]) : a.a();
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.f11684a;
    }

    public Application c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("4bc1c139", new Object[]{this}) : this.b;
    }

    public com.taobao.android.diagnose.model.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.diagnose.model.a) ipChange.ipc$dispatch("89ac9dbf", new Object[]{this}) : this.f;
    }

    private c() {
        this.f11684a = null;
        this.c = false;
        this.f = new com.taobao.android.diagnose.model.a();
        this.h = null;
        this.g = null;
        this.j = new d();
        this.k = null;
        this.e = null;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3fa3d2", new Object[]{this, eVar});
        } else if (this.c) {
        } else {
            this.c = true;
            if (eVar == null) {
                eVar = new e();
            }
            this.e = eVar;
            v.a("DiagnoseManager", "DiagnoseManager init!");
            try {
                this.d = new File(this.f11684a.getFilesDir(), "diagnose");
                if (!this.d.exists()) {
                    this.d.mkdirs();
                }
                com.taobao.android.diagnose.config.a.a(this.f11684a);
                if (!com.taobao.android.diagnose.config.a.a()) {
                    v.d("DiagnoseManager", "DiagnoseManager is disable");
                    return;
                }
                h();
                com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.-$$Lambda$c$yR_lD-m-8xQTR2AQ6LWubPmM3pc
                    {
                        c.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        c.m903lambda$yR_lDm8xQTR2AQ6LWubPmM3pc(c.this);
                    }
                });
                v.a("DiagnoseManager", "DiagnoseManager init Done!");
            } catch (Exception e) {
                v.a("DiagnoseManager", "Exception when init diagnose SDK: ", e);
            }
        }
    }

    public /* synthetic */ void k() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (this.e.m) {
            HashMap hashMap = new HashMap();
            hashMap.put("appVersion", this.e.f);
            hashMap.put("process", this.e.g);
            hashMap.put(OConstant.LAUNCH_ENVINDEX, Integer.valueOf(this.e.i));
            hashMap.put(com.taobao.tao.log.statistics.d.PARAM_IS_INNER, Boolean.valueOf(this.f.i().isInner));
            qrn.a(this.f11684a, hashMap);
        }
        this.i = new com.taobao.android.diagnose.snapshot.a(this.f11684a, this.f);
        this.i.a();
        this.g = new com.taobao.android.diagnose.collector.e(this.b, this.f);
        this.g.a();
        this.h = new com.taobao.android.diagnose.scene.a(this.f11684a, this.f);
        this.i.a(this.h, this.g);
        this.g.a(this.h);
        this.h.a();
        this.j.a(this.h, this.f);
        if (com.taobao.android.diagnose.config.a.l() && (bVar = this.k) != null) {
            com.taobao.android.diagnose.message.a.a(this.f11684a, this.h, bVar);
            this.k.init(this.f11684a, this.e);
        }
        DiagnoseJSBridge.init();
    }

    public c a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cab36823", new Object[]{this, application});
        }
        this.b = application;
        this.f11684a = application.getApplicationContext();
        return this;
    }

    public c a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4d707ee9", new Object[]{this, bVar});
        }
        this.k = bVar;
        return this;
    }

    public e e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("6380e896", new Object[]{this}) : this.e;
    }

    public x f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("4ed766d3", new Object[]{this}) : this.j;
    }

    public File g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("3bcc0e5f", new Object[]{this}) : this.d;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.-$$Lambda$c$jKQli5gLM2YdiU1RjYrJoBFZXSU
                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$jKQli5gLM2YdiU1RjYrJoBFZXSU(c.this);
                }
            });
        }
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            this.f.a(this.e.e);
            AppInfo i = this.f.i();
            UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
            crashCaughtHeader.addHeaderInfo("os", i.os);
            crashCaughtHeader.addHeaderInfo("osDisplay", i.osDisplay);
            i.appVer = this.e.f;
            i.process = this.e.g;
            i.isDebug = this.e.h;
            i.envIndex = this.e.i;
            i.uid = this.e.j;
            i.utdid = this.e.k;
            i.accountName = this.e.l;
            i.isInner = com.taobao.android.diagnose.common.d.a(this.f11684a);
            i.userType = com.taobao.android.diagnose.config.a.f(this.f11684a);
            if (i.isInner) {
                i.userType |= 1;
            } else {
                i.userType &= -2;
            }
            if (com.taobao.android.diagnose.config.a.b()) {
                com.taobao.android.diagnose.scene.a.a("fact_os_type", i.os);
                com.taobao.android.diagnose.scene.a.a("fact_os_ver", i.osVer);
                com.taobao.android.diagnose.scene.a.a("fact_os_sdk", i.osSdk);
                com.taobao.android.diagnose.scene.a.a("fact_dev_brand", i.brand);
                com.taobao.android.diagnose.scene.a.a("fact_dev_model", i.model);
                com.taobao.android.diagnose.scene.a.a("fact_dev_abi", i.abi);
                com.taobao.android.diagnose.scene.a.a("fact_app_ver", i.appVer);
                com.taobao.android.diagnose.scene.a.a("fact_debug", Boolean.valueOf(i.isDebug));
                com.taobao.android.diagnose.scene.a.a("fact_uid", i.uid);
                com.taobao.android.diagnose.scene.a.a("fact_utdid", i.utdid);
                com.taobao.android.diagnose.scene.a.a("fact_account_name", i.accountName);
                com.taobao.android.diagnose.scene.a.a("fact_inner_user", Boolean.valueOf(i.isInner));
            }
            i.innerDir = this.f11684a.getFilesDir().getAbsolutePath();
            File externalFilesDir = this.f11684a.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                i.extDir = externalFilesDir.getAbsolutePath();
            }
            i.lastLaunchInfo = com.taobao.android.diagnose.config.a.a(this.f11684a, "time=" + ((Object) DateFormat.format("yyyy-MM-dd HH:mm:ss", this.e.e)) + ";pid=" + i.pid + ";appVer=" + i.appVer + ";os=os;osVer=" + i.osVer + ";osDisplay=" + i.osDisplay, i);
            i.lastExitInfo = com.taobao.android.diagnose.snapshot.a.a(this.f11684a, this.e.g);
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.-$$Lambda$c$h3Jj0lcqT9q18uSVx_0LY8o6e9Y
                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$h3Jj0lcqT9q18uSVx_0LY8o6e9Y(c.this);
                }
            }, 10L, TimeUnit.SECONDS);
        } catch (Exception e) {
            v.a("DiagnoseManager", "launchEvent", e);
        }
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            EventLogger.builder(1).setTime(this.e.e).setData(this.f.i().toMap()).log(com.taobao.android.diagnose.common.c.a().b());
        }
    }
}
