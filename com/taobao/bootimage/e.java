package com.taobao.bootimage;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.d;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.statistic.TBS;
import java.lang.ref.WeakReference;
import java.util.Properties;
import tb.kej;
import tb.kem;
import tb.kge;
import tb.njn;
import tb.njr;

/* loaded from: classes6.dex */
public class e implements njr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f16679a;
    private boolean b;
    private d c;
    private final d.a d = new d.a() { // from class: com.taobao.bootimage.e.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.bootimage.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            kej.a(kem.TAG, "OnBootImageDisplayListener finish");
            e.a(e.this);
        }
    };

    static {
        kge.a(-1525334618);
        kge.a(1885639559);
    }

    @Override // tb.njr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PopStrategy.IDENTIFIER_SPLASH;
    }

    @Override // tb.njr
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fd792b", new Object[]{eVar});
        } else {
            eVar.g();
        }
    }

    public e(Activity activity) {
        if (activity != null) {
            this.f16679a = new WeakReference<>(activity);
        }
        kej.a("BootImagePopOperation", "constructor, activity = " + activity);
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        kej.a("BootImagePopOperation", "start, coldStart = " + z + " isOutLink = " + z2);
        if (this.b) {
            kej.a("BootImagePopOperation", "start, return, isFinish = true");
            return;
        }
        WeakReference<Activity> weakReference = this.f16679a;
        if (weakReference == null) {
            kej.a("BootImagePopOperation", "start, return, reference == null");
            this.b = true;
            return;
        }
        Activity activity = weakReference.get();
        if (activity == null) {
            kej.a("BootImagePopOperation", "start, return, activity == null");
            this.b = true;
        } else if (!c.a().d()) {
            kej.a("BootImagePopOperation", "start, return, initFinish == false");
            Properties properties = new Properties();
            properties.setProperty(LogStrategyManager.ACTION_TYPE_BOOT, Boolean.toString(z));
            String str = c.a().e() ? "error" : "unfinished";
            properties.setProperty("cause", str);
            TBS.Ext.commitEvent("BootImage_ShowOperationFailed", properties);
            kej.a(kem.TAG, "show operation failed. cause: " + str + ", boot: " + z);
            this.b = true;
        } else {
            if (z) {
                this.c = c.a().f();
            } else {
                this.c = new d(false, z2);
            }
            kej.a("BootImagePopOperation", "start, , bootImageMgr = " + this.c);
            d dVar = this.c;
            if (dVar != null) {
                dVar.a(this.d);
                if (this.c.a(activity)) {
                    if (this.c.f()) {
                        if (a(z)) {
                            this.c.c();
                            kej.a("BootImagePopOperation", "start, success showOperation");
                            z3 = true;
                        } else {
                            this.c.b();
                            kej.a("BootImagePopOperation", "start, fail, showOperation == false");
                        }
                    } else {
                        this.c.b();
                        kej.a("BootImagePopOperation", "start, fail, bootImageMgr.canShow == false");
                    }
                } else {
                    this.c.b();
                    kej.a(kem.TAG, "BootImagePopOperation bootImageMgr init fail");
                }
            } else {
                kej.a("BootImagePopOperation", "start, fail, bootImageMgr == null ");
            }
            if (z3) {
                return;
            }
            this.b = true;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        kej.a(kem.TAG, "BootImagePopOperation stop");
        kej.a("BootImagePopOperation", "stop, reset fields, destroy bootImageMgr, finish op");
        d dVar = this.c;
        if (dVar != null) {
            dVar.b();
        }
        g();
        this.f16679a = null;
        this.b = true;
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            if (this.f16679a != null && !this.b) {
                if (z) {
                    LocalBroadcastManager.getInstance(this.f16679a.get()).sendBroadcast(new Intent("com.taobao.bootimage.show.coldstart"));
                } else {
                    LocalBroadcastManager.getInstance(this.f16679a.get()).sendBroadcast(new Intent("com.taobao.bootimage.show.hotstart"));
                }
                njn.a(this.f16679a.get()).a(this);
                kej.a(kem.TAG, "showOperation success");
                kej.a("BootImagePopOperation", "showOperation, finish");
                return true;
            }
            kej.a(kem.TAG, "showOperation reference no exist");
            kej.a("BootImagePopOperation", "showOperation, false, reference == null || isFinish");
            return false;
        } catch (Throwable th) {
            kej.a("BootImagePopOperation", "showOperation", th);
            return false;
        }
    }

    private void g() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.f16679a != null && (activity = this.f16679a.get()) != null) {
                njn.a(activity).b(this);
            }
            LocalBroadcastManager.getInstance(f.b()).sendBroadcast(new Intent("com.taobao.bootimage.show.finish"));
            kej.a(kem.TAG, "finish operation");
        } catch (Throwable th) {
            kej.a(kem.TAG, "finishOperation", th);
        }
    }

    @Override // tb.njr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kej.a(kem.TAG, "show operation");
        if (this.c == null || this.b) {
            kej.a("BootImagePopOperation", "show(), return, bootImageMgr == null || isFinish");
            return;
        }
        kej.a("BootImagePopOperation", "show");
        if (this.c.d()) {
            return;
        }
        e();
        kej.a("BootImagePopOperation", "show(), end, bootImageMgr.show() = false");
    }

    @Override // tb.njr
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.b;
    }
}
