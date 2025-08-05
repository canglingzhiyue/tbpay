package tb;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.tao.welcome.Welcome;

/* loaded from: classes7.dex */
public class ony implements a.InterfaceC0630a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32221a;
    private boolean b = false;
    private int c = 0;
    private boolean d;

    static {
        kge.a(524188283);
        kge.a(370049290);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
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

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        tjc.a(true);
        int c = tjc.c();
        r0 = "coldStart: launchCntVal " + c;
        stv.a("launchCnt", "launchCnt coldStart count. count=" + c);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        tjc.a(false);
        int c = tjc.c();
        r0 = "hotStart: launchCntVal " + c;
        stv.a("launchCnt", "launchCnt enter hotStart count.count=" + c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        try {
            if (ker.a(activity)) {
                return;
            }
        } catch (Throwable th) {
            stv.a("launchCnt", "onActivityResumed: start cold start PageStateUtils.isWelCome meet exception" + th);
        }
        try {
            if (c() && this.c <= 0) {
                this.c++;
                this.b = true;
                stv.a("launchCnt", "onActivityResumed: start cold start");
                a();
            } else if (!this.d) {
                stv.a("launchCnt", "onActivityResumed, pageInErrorState  fromBackground " + this.d);
            } else {
                b();
                stv.a("launchCnt", "onActivityResumed: resume activity val is " + activity.getClass().getName());
            }
        } finally {
            this.d = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            a(activity);
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        try {
            a(activity.getClass().getSimpleName());
            if (!ker.a()) {
                stv.a("launchCnt", "enableOnStop not isInBackground ");
            } else {
                this.d = true;
            }
        } catch (Throwable th) {
            stv.a("launchCnt", "enableOnStop error " + th);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f32221a = str;
        stv.a("launchCnt", "PageStateService isFromWelcome frontActivityName：" + this.f32221a);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        String str = this.f32221a;
        return str == null || (TextUtils.equals(str, Welcome.class.getSimpleName()) && !this.b);
    }
}
