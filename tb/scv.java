package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import tb.scv;

/* loaded from: classes6.dex */
public class scv implements scy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final jdy f33483a;
    private final jgh b;

    public static /* synthetic */ void a(scv scvVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e54ec4", new Object[]{scvVar, activity});
        } else {
            scvVar.a(activity);
        }
    }

    public scv(jdy jdyVar, jgh jghVar) {
        this.f33483a = jdyVar;
        this.b = jghVar;
    }

    @Override // tb.scy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            jdv d = this.f33483a.d();
            if (Process.is64Bit() || !d.a("autoReleaseMemory", this.b.a())) {
                return;
            }
            jfj.b("Bit32Task", "autoReleaseMemory open");
            this.f33483a.a().registerActivityLifecycleCallbacks(new AnonymousClass1(d));
        }
    }

    /* renamed from: tb.scv$1 */
    /* loaded from: classes6.dex */
    public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ jdv f33484a;
        private final LinkedList<Activity> c = new LinkedList<>();

        /* renamed from: lambda$PXPJtflLYqXV4WnYK-nJ2lPvJsc */
        public static /* synthetic */ void m2497lambda$PXPJtflLYqXV4WnYKnJ2lPvJsc(AnonymousClass1 anonymousClass1, WeakReference weakReference) {
            anonymousClass1.a(weakReference);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        public AnonymousClass1(jdv jdvVar) {
            scv.this = r1;
            this.f33484a = jdvVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Activity peek;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            String simpleName = activity.getClass().getSimpleName();
            if ("Welcome".equals(simpleName) || "TBMainActivity".equals(simpleName) || "TBBuyActivity".equals(simpleName) || "CashActivity".equals(simpleName)) {
                return;
            }
            if (this.c.size() > this.f33484a.a("maxKeepActivity", 5) && (peek = this.c.peek()) != null) {
                peek.finish();
            }
            this.c.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            this.c.remove(activity);
            final WeakReference weakReference = new WeakReference(activity);
            new Handler().post(new Runnable() { // from class: tb.-$$Lambda$scv$1$PXPJtflLYqXV4WnYK-nJ2lPvJsc
                @Override // java.lang.Runnable
                public final void run() {
                    scv.AnonymousClass1.m2497lambda$PXPJtflLYqXV4WnYKnJ2lPvJsc(scv.AnonymousClass1.this, weakReference);
                }
            });
        }

        public /* synthetic */ void a(WeakReference weakReference) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
                return;
            }
            Activity activity = (Activity) weakReference.get();
            if (activity == null) {
                return;
            }
            scv.a(scv.this, activity);
        }
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            a(window.getDecorView());
        } catch (Throwable th) {
            jfj.b(th);
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view != null) {
            view.setBackgroundDrawable(null);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(viewGroup.getChildAt(i));
                }
            } else if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(null);
            }
        }
    }
}
