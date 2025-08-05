package com.alibaba.ability.impl.audio.floatwindow;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FloatWindowCanvas f1864a;
    private Context b;

    static {
        kge.a(-1034975229);
        kge.a(-1894394539);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            q.d(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            q.d(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
            return;
        }
        q.d(activity, "activity");
        q.d(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            q.d(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            q.d(activity, "activity");
        }
    }

    public a(Context context) {
        q.d(context, "context");
        this.b = context;
        Context it = this.b.getApplicationContext();
        q.b(it, "it");
        this.f1864a = new FloatWindowCanvas(it, null, 2, null);
        ((Application) it).registerActivityLifecycleCallbacks(this);
    }

    private final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            FloatWindowCanvas floatWindowCanvas = this.f1864a;
            if (floatWindowCanvas == null) {
                q.b("floatWindowCanvas");
            }
            ViewParent parent = floatWindowCanvas.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                FloatWindowCanvas floatWindowCanvas2 = this.f1864a;
                if (floatWindowCanvas2 == null) {
                    q.b("floatWindowCanvas");
                }
                viewGroup.removeView(floatWindowCanvas2);
                FloatWindowCanvas floatWindowCanvas3 = this.f1864a;
                if (floatWindowCanvas3 == null) {
                    q.b("floatWindowCanvas");
                }
                floatWindowCanvas3.setAttachedActivityHash(-1);
            }
            Window window = activity.getWindow();
            q.b(window, "it.window");
            View decorView = window.getDecorView();
            if (decorView == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            FrameLayout frameLayout = (FrameLayout) decorView;
            FloatWindowCanvas floatWindowCanvas4 = this.f1864a;
            if (floatWindowCanvas4 == null) {
                q.b("floatWindowCanvas");
            }
            frameLayout.addView(floatWindowCanvas4);
            FloatWindowCanvas floatWindowCanvas5 = this.f1864a;
            if (floatWindowCanvas5 == null) {
                q.b("floatWindowCanvas");
            }
            floatWindowCanvas5.setAttachedActivityHash(activity.hashCode());
        }
    }

    private final void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        FloatWindowCanvas floatWindowCanvas = this.f1864a;
        if (floatWindowCanvas == null) {
            q.b("floatWindowCanvas");
        }
        ViewParent parent = floatWindowCanvas.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return;
        }
        FloatWindowCanvas floatWindowCanvas2 = this.f1864a;
        if (floatWindowCanvas2 == null) {
            q.b("floatWindowCanvas");
        }
        int attachedActivityHash = floatWindowCanvas2.getAttachedActivityHash();
        if (activity == null || attachedActivityHash != activity.hashCode()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        FloatWindowCanvas floatWindowCanvas3 = this.f1864a;
        if (floatWindowCanvas3 == null) {
            q.b("floatWindowCanvas");
        }
        viewGroup.removeView(floatWindowCanvas3);
        FloatWindowCanvas floatWindowCanvas4 = this.f1864a;
        if (floatWindowCanvas4 == null) {
            q.b("floatWindowCanvas");
        }
        floatWindowCanvas4.setAttachedActivityHash(-1);
    }

    public final FloatWindowCanvas a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatWindowCanvas) ipChange.ipc$dispatch("8630d33e", new Object[]{this});
        }
        FloatWindowCanvas floatWindowCanvas = this.f1864a;
        if (floatWindowCanvas == null) {
            q.b("floatWindowCanvas");
        }
        return floatWindowCanvas;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(c.b());
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b(c.b());
        Context applicationContext = this.b.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        q.d(activity, "activity");
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        q.d(activity, "activity");
        b(activity);
    }
}
