package com.uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private boolean f23753a = false;
    private boolean b = false;

    private void a(int i) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (e.u()) {
            com.uc.crashsdk.a.a.a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z = 1 == i;
        if (!z) {
            weakHashMap2 = b.ad;
            Iterator it = weakHashMap2.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object value = ((Map.Entry) it.next()).getValue();
                    if (value != null && ((Integer) value).intValue() == 1) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (this.f23753a != z) {
            b.b(z);
            this.f23753a = z;
        }
        weakHashMap = b.ad;
        boolean isEmpty = weakHashMap.isEmpty();
        if (this.b == isEmpty) {
            return;
        }
        if (isEmpty) {
            b.x();
        }
        this.b = isEmpty;
    }

    private void a(Activity activity, int i) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        String unused = b.af = 1 == i ? activity.getComponentName().flattenToShortString() : "";
        b.E();
        if (g.J()) {
            boolean unused2 = b.ae = true;
            weakHashMap = b.ad;
            synchronized (weakHashMap) {
                weakHashMap2 = b.ad;
                weakHashMap2.put(activity, Integer.valueOf(i));
                a(i);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (g.J()) {
            boolean unused = b.ae = true;
            weakHashMap = b.ad;
            synchronized (weakHashMap) {
                weakHashMap2 = b.ad;
                weakHashMap2.remove(activity);
                a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, 2);
    }
}
