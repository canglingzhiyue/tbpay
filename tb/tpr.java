package tb;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class tpr extends FragmentManager.FragmentLifecycleCallbacks implements a.InterfaceC0630a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final tpr f34265a = new tpr();
    private final CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<b> c = new CopyOnWriteArrayList<>();
    private WeakReference<Activity> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public interface a {
        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityResumed(Activity activity);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public interface b {
        void a(FragmentManager fragmentManager, Fragment fragment);

        void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        void b(FragmentManager fragmentManager, Fragment fragment);

        void c(FragmentManager fragmentManager, Fragment fragment);
    }

    public static /* synthetic */ Object ipc$super(tpr tprVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1547495758:
                super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1501849859:
                super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -473528248:
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case 632639987:
                super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case 951718524:
                super.onFragmentStopped((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static tpr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tpr) ipChange.ipc$dispatch("f0b1268", new Object[0]) : f34265a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            c.a(this, true);
            Activity b2 = c.b();
            if (b2 == null) {
                return;
            }
            a(b2);
            this.d = new WeakReference<>(b2);
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[init] init error", null, th, new Object[0]);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef54945", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.add(aVar);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef5bda4", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.c.add(bVar);
        }
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (!(activity instanceof FragmentActivity)) {
        } else {
            WeakReference<Activity> weakReference = this.d;
            if (weakReference != null && weakReference.get() == activity) {
                return;
            }
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        try {
            a(activity);
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onActivityCreated(activity, bundle);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityCreated] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onActivityStarted(activity);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityStarted] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onActivityResumed(activity);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityResumed] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityPaused] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().onActivityStopped(activity);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityStopped] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        try {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivitySaveInstanceState] error", null, th, new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        try {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onActivityDestroyed] error", null, th, new Object[0]);
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b551f3", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        try {
            Iterator<b> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(fragmentManager, fragment, bundle);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentCreated] error", null, th, new Object[0]);
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c68848", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStarted(fragmentManager, fragment);
        try {
            Iterator<b> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentStarted] error", null, th, new Object[0]);
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        try {
            Iterator<b> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().b(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentResumed] error", null, th, new Object[0]);
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentPaused(fragmentManager, fragment);
        try {
            Iterator<b> it = this.c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentPaused] error", null, th, new Object[0]);
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ba127c", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStopped(fragmentManager, fragment);
        try {
            Iterator<b> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().c(fragmentManager, fragment);
            }
        } catch (Throwable th) {
            ALog.e("falco.PageLifecycle", "[onFragmentStopped] error", null, th, new Object[0]);
        }
    }
}
