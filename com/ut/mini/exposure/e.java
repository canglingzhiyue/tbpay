package com.ut.mini.exposure;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.Application;
import android.app.TabActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static e f24112a;
    private a b;
    private Handler c;
    private com.ut.mini.internal.a d;
    private Set<Class> e = Collections.synchronizedSet(new HashSet());
    public HashMap<String, String> commonInfoMap = new HashMap<>();

    public static /* synthetic */ Set a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("8c5c8033", new Object[]{eVar}) : eVar.e;
    }

    static {
        kge.a(-835206489);
        f24112a = null;
    }

    private e() {
        if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread("ut_exposure");
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper());
        }
    }

    public static e getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e57efaa0", new Object[0]);
        }
        if (f24112a == null) {
            synchronized (e.class) {
                if (f24112a == null) {
                    f24112a = new e();
                }
            }
        }
        return f24112a;
    }

    public void init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        if (b.trackerExposureOpen) {
            this.b = new a();
            application.registerActivityLifecycleCallbacks(this.b);
        }
        b.init();
    }

    public void unregisterActivityLifecycleCallbacks(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24701f49", new Object[]{this, application});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(aVar);
    }

    public void setCommonInfoMap(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1b808b", new Object[]{this, hashMap});
            return;
        }
        this.commonInfoMap.clear();
        this.commonInfoMap.putAll(hashMap);
    }

    public Handler getThreadHandle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("bac4ba97", new Object[]{this}) : this.c;
    }

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1624960269);
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

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        private a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (activity == null || (activity instanceof TabActivity) || (activity instanceof ActivityGroup)) {
            } else {
                if ((!"com.taobao.weex.WXActivity".equalsIgnoreCase(activity.getClass().getName()) && !e.a(e.this).contains(activity.getClass())) || !b.trackerExposureOpen) {
                    return;
                }
                try {
                    ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                    if (viewGroup == null || viewGroup.getChildCount() <= 0) {
                        return;
                    }
                    if (viewGroup.getChildAt(0) instanceof TrackerFrameLayout) {
                        com.ut.mini.exposure.a.a(null, "no attachTrackerFrameLayout ", activity.toString());
                        return;
                    }
                    TrackerFrameLayout trackerFrameLayout = new TrackerFrameLayout(activity);
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        trackerFrameLayout.addView(childAt, childAt.getLayoutParams());
                    }
                    viewGroup.addView(trackerFrameLayout, new ViewGroup.LayoutParams(-1, -1));
                } catch (Exception e) {
                    com.ut.mini.exposure.a.a(null, e, new Object[0]);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (activity == null || (activity instanceof TabActivity) || (activity instanceof ActivityGroup)) {
            } else {
                if (!"com.taobao.weex.WXActivity".equalsIgnoreCase(activity.getClass().getName()) && !e.a(e.this).contains(activity.getClass())) {
                    return;
                }
                try {
                    ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                    if (viewGroup == null || !(viewGroup.getChildAt(0) instanceof TrackerFrameLayout)) {
                        return;
                    }
                    viewGroup.removeViewAt(0);
                } catch (Exception e) {
                    com.ut.mini.exposure.a.a(null, e, new Object[0]);
                }
            }
        }
    }

    public void registerExposureViewHandler(com.ut.mini.internal.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d42502c", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void unRegisterExposureViewHandler(com.ut.mini.internal.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b76153", new Object[]{this, aVar});
        } else {
            this.d = null;
        }
    }

    public com.ut.mini.internal.a getExposureViewHandle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.ut.mini.internal.a) ipChange.ipc$dispatch("1b0403cf", new Object[]{this}) : this.d;
    }

    public boolean addToTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5d39f8c", new Object[]{this, activity})).booleanValue();
        }
        if (activity != null) {
            return this.e.add(activity.getClass());
        }
        return false;
    }

    public boolean removeToTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c020e809", new Object[]{this, activity})).booleanValue();
        }
        if (activity != null) {
            return this.e.remove(activity.getClass());
        }
        return false;
    }

    public void enableExposureLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ad7433", new Object[]{this, new Boolean(z)});
        } else {
            com.ut.mini.exposure.a.f24109a = z;
        }
    }
}
