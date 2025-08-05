package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.SFSrpConfig;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.util.n;
import com.taobao.android.weex_framework.m;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.android.xsearchplugin.weex.SFWeexSDK;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class imo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f29156a;
    private static volatile imn b;
    private static final WeakHashMap<Activity, Long> c;

    public static /* synthetic */ Context a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a75aa358", new Object[]{context});
        }
        f29156a = context;
        return context;
    }

    public static /* synthetic */ imn a(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("fafc96e", new Object[]{imnVar});
        }
        b = imnVar;
        return imnVar;
    }

    public static /* synthetic */ imn e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("2dcc9c10", new Object[0]) : b;
    }

    public static /* synthetic */ Context f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("442389e5", new Object[0]) : f29156a;
    }

    public static /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else {
            h();
        }
    }

    static {
        kge.a(-1689348125);
        c = new WeakHashMap<>();
    }

    public static WeakHashMap<Activity, Long> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakHashMap) ipChange.ipc$dispatch("4c9b9463", new Object[0]) : c;
    }

    public static imn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("16b7abf3", new Object[0]) : b;
    }

    public static Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[0]) : f29156a;
    }

    public static a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b383873", new Object[0]);
        }
        k.e("SearchFrameSDK", "start init search framework");
        return new a();
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean[] f29157a;
        private iml b;
        private String c;

        static {
            kge.a(-1305864950);
        }

        private a() {
            this.f29157a = new boolean[5];
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("16395a9e", new Object[]{this, context});
            }
            imo.a(context);
            this.f29157a[0] = true;
            return this;
        }

        public a a(float f, int i, int i2, int i3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("26273e49", new Object[]{this, new Float(f), new Integer(i), new Integer(i2), new Integer(i3), str});
            }
            imk.f29154a = f;
            imk.b = i;
            imk.c = i2;
            imk.d = i3;
            imk.e = str;
            this.f29157a[1] = true;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("23031f0c", new Object[]{this, str});
            }
            this.c = str;
            this.f29157a[2] = true;
            return this;
        }

        public a a(n.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("322ccd51", new Object[]{this, aVar});
            }
            n.f15020a = aVar;
            this.f29157a[3] = true;
            return this;
        }

        public a a(iml imlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5dd42ee", new Object[]{this, imlVar});
            }
            this.b = imlVar;
            this.f29157a[4] = true;
            return this;
        }

        public imn a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (imn) ipChange.ipc$dispatch("f060694", new Object[]{this});
            }
            for (boolean z : this.f29157a) {
                if (!z) {
                    throw new IllegalStateException("sdk init not finished");
                }
            }
            imn imnVar = new imn(this.b);
            imnVar.j().a(this.c);
            imnVar.d().a(new its(imnVar));
            imnVar.d().c(new itr(imnVar));
            imnVar.d().b(new itr(imnVar));
            imnVar.b().b(this.b.c());
            k.a(this.b.c());
            c(imnVar);
            d(imnVar);
            a(imnVar);
            b(imnVar);
            if (imo.e() == null) {
                imo.a(imnVar);
                try {
                    if (m.b == null) {
                        m.b = (Application) imo.f().getApplicationContext();
                    }
                    m.d().get("app").put("serverVersion", this.b.e());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    imo.g();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            return imnVar;
        }

        private void a(imn imnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edf4cace", new Object[]{this, imnVar});
                return;
            }
            try {
                SFSrpConfig.install(imnVar);
            } catch (Throwable th) {
                k.a("SearchFrameSDK", "rcmd: ", th);
            }
        }

        private void b(imn imnVar) {
            try {
                Class.forName("com.taobao.android.searchbaseframe.business.recommend.RcmdConfig", true, getClass().getClassLoader()).getDeclaredMethod("install", imn.class).invoke(null, imnVar);
                k.e("SearchFrameSDK", "rcmd plugin installed");
            } catch (Throwable unused) {
                k.e("SearchFrameSDK", "no rcmd plugin");
            }
        }

        private void c(imn imnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cafad7d0", new Object[]{this, imnVar});
                return;
            }
            try {
                SFWeexSDK.install(imnVar);
            } catch (Throwable th) {
                k.a("SearchFrameSDK", "weex: ", th);
            }
        }

        private void d(imn imnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b97dde51", new Object[]{this, imnVar});
                return;
            }
            try {
                SFMuiseSDK.install(imnVar);
            } catch (Throwable th) {
                k.a("SearchFrameSDK", "muise: ", th);
            }
        }
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        Context context = f29156a;
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: tb.imo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    return;
                }
                try {
                    imo.a().put(activity, Long.valueOf(System.currentTimeMillis()));
                    k.d("[XS.page]", "[Page enter] Activity: %s, url: %s", activity, activity.getIntent().getData());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    return;
                }
                try {
                    k.d("[XS.page]", "[Page foreground] Activity: %s, url: %s", activity, activity.getIntent().getData());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    return;
                }
                try {
                    k.d("[XS.page]", "[Page background] Activity: %s, url: %s", activity, activity.getIntent().getData());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    return;
                }
                try {
                    k.d("[XS.page]", "[Page exit] Activity: %s, url: %s", activity, activity.getIntent().getData());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
