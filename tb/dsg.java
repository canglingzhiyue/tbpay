package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.d;
import com.taobao.android.behavix.utils.e;
import com.taobao.android.behavix.utils.f;
import com.taobao.android.behavix.utils.g;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public class dsg implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static dsg e;

    /* renamed from: a  reason: collision with root package name */
    private int f26937a = 0;
    private boolean b = false;
    private ScheduledFuture<?> c = null;
    private final List<dsf> d = new CopyOnWriteArrayList();
    private Map<String, GestureDetector> f = new HashMap();
    private ScaleGestureDetector g;

    public static /* synthetic */ List a(dsg dsgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("57a9e027", new Object[]{dsgVar}) : dsgVar.d;
    }

    public static /* synthetic */ boolean a(dsg dsgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d20088b8", new Object[]{dsgVar, new Boolean(z)})).booleanValue();
        }
        dsgVar.b = z;
        return z;
    }

    static {
        kge.a(-408530292);
        kge.a(-1894394539);
        e = new dsg();
    }

    private dsg() {
    }

    public static dsg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsg) ipChange.ipc$dispatch("f03d666", new Object[0]) : e;
    }

    public void a(dsf dsfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bd79c1", new Object[]{this, dsfVar});
        } else if (dsfVar == null) {
        } else {
            this.d.add(dsfVar);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        ScaleGestureDetector scaleGestureDetector;
        Iterator<dsf> it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        dro.p();
        if (g.a(a.b.u()) || !a.b.u().contains(activity.getClass().getName())) {
            return;
        }
        final GestureDetector gestureDetector = this.f.get(activity.getClass().getName());
        boolean z = false;
        if (gestureDetector == null) {
            GestureDetector gestureDetector2 = new GestureDetector(d.b(), new dsi());
            if ("1".equals(com.taobao.android.behavix.behavixswitch.a.a("updateMinVel", "1"))) {
                try {
                    Field declaredField = GestureDetector.class.getDeclaredField("mMinimumFlingVelocity");
                    declaredField.setAccessible(true);
                    declaredField.set(gestureDetector2, 5);
                } catch (Throwable unused) {
                    TLog.loge("GestureObserve velocity update fail", new String[0]);
                }
            }
            this.f.put(activity.getClass().getName(), gestureDetector2);
            gestureDetector = gestureDetector2;
        }
        if (this.g == null) {
            this.g = new ScaleGestureDetector(d.b(), new iyn());
        }
        if ("com.taobao.search.sf.MainSearchResultActivity".equals(activity.getClass().getName())) {
            e.a().postDelayed(new Runnable() { // from class: tb.dsg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (activity.isFinishing()) {
                    } else {
                        dsi.a(activity, gestureDetector, (ScaleGestureDetector) null);
                    }
                }
            }, 1500L);
            return;
        }
        if (com.taobao.android.behavix.behavixswitch.a.a("enableScaleGesture", true) && a.b.l()) {
            z = true;
        }
        if (!z || this.f.size() != 1 || (scaleGestureDetector = this.g) == null) {
            scaleGestureDetector = null;
        }
        dsi.a(activity, gestureDetector, scaleGestureDetector);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        Iterator<dsf> it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f.remove(activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        Iterator<dsf> it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        Iterator<dsf> it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        Iterator<dsf> it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        dro.p();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        b();
        this.f26937a++;
        if (!this.b) {
            for (dsf dsfVar : this.d) {
                dsfVar.c();
            }
        }
        this.b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        this.f26937a--;
        if (this.f26937a != 0) {
            return;
        }
        b();
        this.c = f.a().a(null, new a(), 1000L);
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1249701056);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            dsg.a(dsg.this, false);
            for (dsf dsfVar : dsg.a(dsg.this)) {
                dsfVar.b();
            }
        }
    }
}
