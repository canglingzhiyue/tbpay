package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* loaded from: classes6.dex */
public class kpt extends kpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iju f30215a;
    private final ijd b;
    private final ijc c;
    private volatile boolean d;
    private final kpq<String> e;

    /* loaded from: classes6.dex */
    public static class a extends kpu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f30219a;
        private boolean b = false;

        public a(Runnable runnable) {
            this.f30219a = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -857321247) {
                super.onActivityCreated((Activity) objArr[0], (Bundle) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.kpu, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            super.onActivityCreated(activity, bundle);
            if (activity == null) {
                RSoLog.b("QJSSoLoader, QJSWatcherCallback, activity == null !!!");
            } else if (this.b || !ikw.a((CharSequence) "SearchDoorActivity", (CharSequence) activity.getLocalClassName())) {
            } else {
                this.b = true;
                this.f30219a.run();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(kpt kptVar, String str, Object... objArr) {
        if (str.hashCode() == 2099071448) {
            return super.b((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean a(kpt kptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f18b7ccd", new Object[]{kptVar})).booleanValue() : kptVar.d;
    }

    public static /* synthetic */ void b(kpt kptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00e834a", new Object[]{kptVar});
        } else {
            kptVar.b();
        }
    }

    public static /* synthetic */ kpq c(kpt kptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kpq) ipChange.ipc$dispatch("506b982f", new Object[]{kptVar}) : kptVar.e;
    }

    public static /* synthetic */ ijc d(kpt kptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijc) ipChange.ipc$dispatch("380c6d98", new Object[]{kptVar}) : kptVar.c;
    }

    public kpt(iia iiaVar, iju ijuVar, ijd ijdVar, ijc ijcVar) {
        super(iiaVar);
        this.d = false;
        this.e = new kpq<String>() { // from class: tb.kpt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kpq
            public boolean a(String str) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
                }
                if (!str.endsWith("libquickjs.so") || str.contains("swallows")) {
                    z = false;
                }
                if (z) {
                    RSoLog.c("QJSSoLoader, filter maps found another qjs " + str);
                }
                return z;
            }
        };
        this.f30215a = ijuVar;
        this.b = ijdVar;
        this.c = ijcVar;
        a();
    }

    @Override // tb.kpr, tb.iia
    public ihz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("7d1d49d8", new Object[]{this, str});
        }
        if (!ikw.a((CharSequence) "quickjs", (CharSequence) str)) {
            return super.b(str);
        }
        if (Build.VERSION.SDK_INT < 30) {
            RSoLog.c("QJSSoLoader, load qjs failed, < android 30");
            return ihz.a(str, 1001);
        } else if (!this.c.a("key_qjs_ab_local_enabled", true)) {
            RSoLog.c("QJSSoLoader, load qjs failed, local kv disabled");
            return ihz.a(str, 1002);
        } else if (this.c.a("local_key_qjs_ab_double_before_load", false)) {
            RSoLog.c("QJSSoLoader, load qjs failed, double qjs before load, by local");
            return ihz.a(str, 1004);
        } else if (this.b.a("key_qjs_double_check_disabled", false)) {
            RSoLog.c("QJSSoLoader, load qjs failed, config disabled");
            return ihz.a(str, 1005);
        } else {
            long a2 = iky.a();
            boolean a3 = kpw.a(this.e);
            long a4 = iky.a() - a2;
            RSoLog.c("QJSSoLoader, filter proc maps cost = " + a4);
            if (a3) {
                this.c.a("local_key_qjs_ab_double_before_load", Boolean.TRUE.toString());
                ikq.a("doubleqjs.beforeload.error", "");
                return ihz.a(str, 1003);
            }
            ihz b = super.b(str);
            if (b.g()) {
                RSoLog.c("QJSSoLoader, load qjs succ, enable double qjs check");
                this.d = true;
            }
            return b;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b.a("key_qjs_double_check_disabled", false)) {
        } else {
            RSoLog.c("QJSSoLoader, registerWatcher start...");
            this.f30215a.a().registerActivityLifecycleCallbacks(new a(new Runnable() { // from class: tb.kpt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!kpt.a(kpt.this)) {
                        RSoLog.c("QJSSoLoader, not use qjs ab, skipped");
                    } else {
                        kpt.b(kpt.this);
                    }
                }
            }));
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RSoLog.c("QJSSoLoader, ready to check double qjs in maps");
        ika.a(new Runnable() { // from class: tb.kpt.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RSoLog.c("QJSSoLoader, real do check double qjs in maps");
                if (!kpw.a(kpt.c(kpt.this))) {
                    return;
                }
                kpt.d(kpt.this).a("key_qjs_ab_local_enabled", Boolean.FALSE.toString());
                ikq.a("doubleqjs.error", "");
            }
        }, 3000L);
    }
}
