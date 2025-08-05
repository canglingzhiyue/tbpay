package com.ut.mini;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;
import tb.any;
import tb.apr;
import tb.kge;
import tb.rqj;

/* loaded from: classes.dex */
public class k implements rqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static k f24124a;
    private long b = 0;
    private long c = 0;

    @Override // tb.rqi
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    static {
        kge.a(357434987);
        kge.a(1716118006);
        f24124a = new k();
    }

    private k() {
    }

    public static k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("2e6257a4", new Object[0]) : f24124a;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (any.d().g()) {
        } else {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            if (0 != this.c) {
                j2 = SystemClock.elapsedRealtime() - this.c;
            }
            g gVar = new g("UT", 1010, "" + j, "" + j2, null, null);
            gVar.setProperty("_priority", "5");
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(gVar.build());
            } else {
                apr.b("Record app display event error", "Fatal Error,must call setRequestAuthentication method first.");
            }
        }
    }

    @Override // tb.rqi
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        } else {
            l.getInstance().pageSwitchBackground();
        }
    }

    @Override // tb.rqj
    public void onSwitchBackgroundDelay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a081a09", new Object[]{this});
            return;
        }
        a(SystemClock.elapsedRealtime() - this.b);
        this.c = SystemClock.elapsedRealtime();
        AnalyticsMgr.k();
        AnalyticsMgr.f();
    }

    @Override // tb.rqi
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        this.b = SystemClock.elapsedRealtime();
        AnalyticsMgr.g();
    }

    @Override // tb.rqi
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            l.getInstance().pageDestroyed(activity);
        }
    }

    @Override // tb.rqi
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            l.getInstance().b(activity);
        }
    }

    @Override // tb.rqi
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            l.getInstance().a(activity);
        }
    }
}
