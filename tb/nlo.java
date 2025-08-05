package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.reflection.e;
import com.taobao.tao.detail.activity.DetailActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class nlo implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f31566a;
    private ArrayList<View> b;
    private ArrayList<Object> c;
    private ArrayList<WindowManager.LayoutParams> d;
    private final ihh e;
    private final nof f;
    private long g = orq.FRAME_CHECK_TIMEOUT;

    public static /* synthetic */ void a(nlo nloVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb87ad9", new Object[]{nloVar, activity});
        } else {
            nloVar.a(activity);
        }
    }

    public static /* synthetic */ boolean a(nlo nloVar, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35a4fb5a", new Object[]{nloVar, cls})).booleanValue() : nloVar.a(cls);
    }

    public nlo(ihh ihhVar, nof nofVar) {
        this.e = ihhVar;
        this.f = nofVar;
    }

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (!a() || !this.e.a("shouldReleaseViewRoot", this.f.a())) {
        } else {
            try {
                this.g = this.e.a("delayMills", orq.FRAME_CHECK_TIMEOUT);
                b(application);
                ihc.a("shouldReleaseViewRoot", "succ");
            } catch (Throwable th) {
                ihc.a(th);
            }
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT == 31 && (Build.BRAND.equalsIgnoreCase("HUAWEI") || Build.BRAND.equalsIgnoreCase("HONOR"));
    }

    private void b(Application application) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
            return;
        }
        e c = e.a(Class.forName("android.view.WindowManagerGlobal")).c("getInstance");
        this.f31566a = c.a("mLock").a();
        this.b = (ArrayList) c.a("mViews").a();
        this.c = (ArrayList) c.a("mRoots").a();
        this.d = (ArrayList) c.a("mParams").a();
        if (this.f31566a == null || this.b == null || this.c == null || this.d == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: tb.nlo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                }
            }

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
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    return;
                }
                try {
                    if (!nlo.a(nlo.this, activity.getClass())) {
                        return;
                    }
                    nlo.a(nlo.this, activity);
                } catch (Throwable th) {
                    ihc.a(th);
                }
            }
        });
    }

    private boolean a(Class<? extends Activity> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20fa47d9", new Object[]{this, cls})).booleanValue();
        }
        String name = cls.getName();
        return name.endsWith(DetailActivity.TAG) || name.endsWith("TBXSkuActivity") || name.endsWith("ShopActivity") || name.endsWith("TBOrderListActivity");
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        ArrayList<Object> a2 = a(activity.getWindow().getAttributes().token);
        if (a2.size() == 0) {
            ihc.a("doRemoveActivity", "failed: size == 0");
            return;
        }
        Iterator<Object> it = a2.iterator();
        while (it.hasNext()) {
            new Handler().postDelayed(new a(activity, it.next(), this.c), this.g);
        }
    }

    private ArrayList<Object> a(IBinder iBinder) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("87baa929", new Object[]{this, iBinder});
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        synchronized (this.f31566a) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                WindowManager.LayoutParams layoutParams = this.d.get(i);
                if (layoutParams.token != null) {
                    if (layoutParams.token != iBinder) {
                        if (layoutParams.type >= 1000 && layoutParams.type <= 1999) {
                            for (int i2 = 0; i2 < size; i2++) {
                                WindowManager.LayoutParams layoutParams2 = this.d.get(i2);
                                if (layoutParams.token == this.b.get(i2).getWindowToken() && layoutParams2.token == iBinder) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    arrayList.add(this.c.get(i));
                }
            }
        }
        return arrayList;
    }

    /* loaded from: classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Activity> f31568a;
        private final WeakReference<?> b;
        private final ArrayList<Object> c;

        public a(Activity activity, Object obj, ArrayList<Object> arrayList) {
            this.f31568a = new WeakReference<>(activity);
            this.b = new WeakReference<>(obj);
            this.c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Object obj = this.b.get();
                if (obj != null && this.c.contains(obj)) {
                    return;
                }
                ihc.a("ViewRootAction-start", "start");
                Activity activity = this.f31568a.get();
                if (activity != null) {
                    a(activity);
                }
                if (obj != null && activity != null) {
                    a(activity.getApplication(), obj);
                }
                ihc.a("ViewRootAction-end", "end");
            } catch (Throwable th) {
                ihc.a(th);
            }
        }

        private void a(Application application, Object obj) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e5f0f93", new Object[]{this, application, obj});
                return;
            }
            e a2 = e.a(obj);
            a2.a("mContext", application).a("mActivityConfigCallback", (Object) null);
            a2.a("mImeFocusController").a("mServedView", (Object) null);
            a2.a("mImeFocusController").a("mNextServedView", (Object) null);
            a2.a("mDisplayManager").a("mContext", application);
            try {
                Object a3 = a2.a("mInputCompatProcessor").a();
                if (a3 != null) {
                    e.a(a3).a("mContext", application);
                }
            } catch (Throwable th) {
                ihc.a(th);
            }
            try {
                Object a4 = a2.a("mEventStream").a();
                if (a4 != null) {
                    e.a(a4).a("mContext", application);
                }
            } catch (Throwable th2) {
                ihc.a(th2);
            }
            try {
                a2.a("mSendWindowContentChangedAccessibilityEvent", (Object) null);
            } catch (Throwable th3) {
                ihc.a(th3);
            }
            try {
                a2.a("mFallbackEventHandler").a("mContext", application);
            } catch (Throwable th4) {
                ihc.a(th4);
            }
            ihc.a("removeActivityFromViewRoot", "succ");
        }

        private void a(Activity activity) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
                return;
            }
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            View decorView = window.getDecorView();
            Context context = decorView.getContext();
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                return;
            }
            e.a(window).a("mContext", activity.getApplication());
            ((ViewGroup) decorView).removeAllViews();
            ViewGroup viewGroup = (ViewGroup) e.a(decorView).a("mContentRoot").a();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                e.a(viewGroup).a("mContext", activity.getApplication());
            }
            e.a(decorView).a("mContext", activity.getApplication());
            e.a(decorView).a("mWindow").a("mContext", activity.getApplication());
            ihc.a("removeActivityDecorView", "succ");
        }
    }
}
