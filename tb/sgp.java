package tb;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.n;
import com.taobao.taolive.room.controller2.o;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.taolivecontainer.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class sgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f33561a;
    private TBLiveH5Container b;
    private String c;
    private TUrlImageView d;
    private final Application.ActivityLifecycleCallbacks e = new Application.ActivityLifecycleCallbacks() { // from class: tb.sgp.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
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

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (activity != sgp.a(sgp.this)) {
            } else {
                sgp.a(sgp.this, (Activity) null);
                if (sgp.b(sgp.this) != null && !sgp.b(sgp.this).isDestroied()) {
                    sgp.b(sgp.this).destroy();
                }
                sgp.a(sgp.this, (TBLiveH5Container) null);
            }
        }
    };

    static {
        kge.a(235805248);
    }

    public static /* synthetic */ Activity a(sgp sgpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4c1ccb6c", new Object[]{sgpVar}) : sgpVar.f33561a;
    }

    public static /* synthetic */ Activity a(sgp sgpVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b607d05a", new Object[]{sgpVar, activity});
        }
        sgpVar.f33561a = activity;
        return activity;
    }

    public static /* synthetic */ TBLiveH5Container a(sgp sgpVar, TBLiveH5Container tBLiveH5Container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveH5Container) ipChange.ipc$dispatch("621c1e14", new Object[]{sgpVar, tBLiveH5Container});
        }
        sgpVar.b = tBLiveH5Container;
        return tBLiveH5Container;
    }

    public static /* synthetic */ TBLiveH5Container b(sgp sgpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveH5Container) ipChange.ipc$dispatch("20d56bdd", new Object[]{sgpVar}) : sgpVar.b;
    }

    public String a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7b3081c", new Object[]{this, activity, str});
        }
        this.f33561a = activity;
        this.f33561a.registerActivityLifecycleCallbacks(this.e);
        TUrlImageView tUrlImageView = new TUrlImageView(activity);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01AKUr8H28y3QoauN5X_!!6000000008000-0-tps-1125-2436.jpg");
        this.d = tUrlImageView;
        this.c = "" + str.hashCode() + System.currentTimeMillis();
        b bVar = new b(activity, "taolive_retention", new o(), new n(), new String[]{String.format(";window._retentionViewHashCode='%s';", this.c)});
        bVar.b(str);
        this.b = bVar.b();
        return this.c;
    }

    public boolean a(String str) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.b == null || !str.equals(this.c) || (activity = this.f33561a) == null) {
            return false;
        }
        FrameLayout frameLayout = new FrameLayout(this.f33561a);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(frameLayout.getBackground(), "alpha", 0, 255);
        ofInt.setDuration(160L);
        ofInt.start();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(280L);
        ofFloat.start();
        frameLayout.addView(this.b, new ViewGroup.LayoutParams(-1, -1));
        this.b.pageAppear();
        this.b.onResume();
        return true;
    }

    public void a(TBLiveH5Container tBLiveH5Container, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5579a34c", new Object[]{this, tBLiveH5Container, new Boolean(z)});
            return;
        }
        if (z) {
            Context context = tBLiveH5Container.getContext();
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        } else {
            FrameLayout frameLayout = (FrameLayout) tBLiveH5Container.getParent();
            ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
        }
        if (tBLiveH5Container.isDestroied()) {
            return;
        }
        tBLiveH5Container.destroy();
    }
}
