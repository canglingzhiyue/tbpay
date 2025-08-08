package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.controller.e;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pau implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static pau d;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f32541a;
    private String b;
    private String c;

    static {
        kge.a(-345222112);
        kge.a(-1894394539);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
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

    private pau(Activity activity, String str, String str2) {
        this.f32541a = new WeakReference<>(activity);
        this.b = str;
        this.c = str2;
        cgl.g().a().registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (!a(activity)) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.f32541a.get());
            Map map = !StringUtils.isEmpty(this.c) ? (Map) pqj.a(this.c, Map.class) : null;
            if (map == null) {
                map = new HashMap();
            }
            if (aa.c() && poy.ag(n.a())) {
                map.put("spm-url", "a2141.23201685");
            } else {
                map.put("spm-url", "a2141.8001249");
            }
            ai.a((e) null, this.f32541a.get(), this.b);
            ai.a(this.f32541a.get(), map);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else if (!a(activity)) {
        } else {
            ai.a((e) null, (Object) this.f32541a.get());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (!a(activity)) {
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cgl.g().a().unregisterActivityLifecycleCallbacks(this);
        this.f32541a = null;
        d = null;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.f32541a;
        if (weakReference != null && weakReference.get() != null && !this.f32541a.get().isDestroyed()) {
            return true;
        }
        b();
        return false;
    }

    private boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue() : c() && this.f32541a.get().equals(activity);
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
            return;
        }
        a();
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        d = new pau(activity, str, str2);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        pau pauVar = d;
        if (pauVar == null) {
            return;
        }
        pauVar.b();
    }
}
