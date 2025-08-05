package tb;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import tb.cew;

/* loaded from: classes.dex */
public class rqh implements rqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rqh b;

    /* renamed from: a  reason: collision with root package name */
    private long f33320a = 0;

    @Override // tb.rqi
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.rqi
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.rqi
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
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
        kge.a(807638528);
        kge.a(-90889597);
        b = new rqh();
    }

    private rqh() {
    }

    public static rqh getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rqh) ipChange.ipc$dispatch("20148c4b", new Object[0]) : b;
    }

    @Override // tb.rqi
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        } else {
            this.f33320a = SystemClock.elapsedRealtime();
        }
    }

    @Override // tb.rqi
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        if (0 != this.f33320a && SystemClock.elapsedRealtime() - this.f33320a > cew.a.CONFIG_TRACK_1022_INTERVAL_TIME) {
            apr.b("", "sessionTimeout");
            UTAnalytics.getInstance().sessionTimeout();
        }
        this.f33320a = 0L;
    }
}
