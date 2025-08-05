package com.taobao.android.weex.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceInternalMode;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexInstanceChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Activity, a> f15891a;
    private final List<c> b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum LifecycleStatus {
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public LifecycleStatus f15895a = LifecycleStatus.RESUMED;
        public final Map<WeexInstanceImpl, LifecycleStatus> b = new HashMap();

        static {
            kge.a(-468130793);
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static final WeexInstanceChecker INST;

        static {
            kge.a(-495324029);
            INST = new WeexInstanceChecker();
        }
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public WeexInstanceInternalMode f15896a;
        public int b;
        public final Set<WeexInstanceImpl> c = new HashSet();

        static {
            kge.a(1680460061);
        }

        public c(WeexInstanceInternalMode weexInstanceInternalMode) {
            this.f15896a = weexInstanceInternalMode;
        }
    }

    static {
        kge.a(-1023743539);
    }

    public static /* synthetic */ a a(WeexInstanceChecker weexInstanceChecker, Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4e52ccbf", new Object[]{weexInstanceChecker, activity}) : weexInstanceChecker.a(activity);
    }

    public static /* synthetic */ WeakHashMap a(WeexInstanceChecker weexInstanceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakHashMap) ipChange.ipc$dispatch("1c8a82e5", new Object[]{weexInstanceChecker}) : weexInstanceChecker.f15891a;
    }

    public static /* synthetic */ void b(WeexInstanceChecker weexInstanceChecker, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d74792bd", new Object[]{weexInstanceChecker, activity});
        } else {
            weexInstanceChecker.b(activity);
        }
    }

    public static /* synthetic */ void c(WeexInstanceChecker weexInstanceChecker, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d816113e", new Object[]{weexInstanceChecker, activity});
        } else {
            weexInstanceChecker.c(activity);
        }
    }

    private WeexInstanceChecker() {
        this.f15891a = new WeakHashMap<>();
        this.b = new ArrayList();
        if (m.c()) {
            this.c = true;
            a(m.b());
            return;
        }
        this.c = false;
    }

    public static WeexInstanceChecker a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstanceChecker) ipChange.ipc$dispatch("9ad66370", new Object[0]) : b.INST;
    }

    private void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        for (WeexInstanceInternalMode weexInstanceInternalMode : WeexInstanceInternalMode.values()) {
            this.b.add(new c(weexInstanceInternalMode));
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.weex.util.WeexInstanceChecker.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                } else {
                    WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f15895a = LifecycleStatus.STARTED;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                } else {
                    WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f15895a = LifecycleStatus.RESUMED;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                } else {
                    WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f15895a = LifecycleStatus.PAUSED;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(final Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    return;
                }
                WeexInstanceChecker.a(WeexInstanceChecker.this, activity).f15895a = LifecycleStatus.STOPPED;
                j.b(new o() { // from class: com.taobao.android.weex.util.WeexInstanceChecker.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WeexInstanceChecker.b(WeexInstanceChecker.this, activity);
                        }
                    }
                });
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(final Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                } else {
                    j.a(new o() { // from class: com.taobao.android.weex.util.WeexInstanceChecker.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.weex_framework.util.o
                        public void a() throws Exception {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            WeexInstanceChecker.c(WeexInstanceChecker.this, activity);
                            WeexInstanceChecker.a(WeexInstanceChecker.this).remove(activity);
                        }
                    }, 2000);
                }
            }
        });
    }

    private a a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("517e1681", new Object[]{this, activity});
        }
        a aVar = this.f15891a.get(activity);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f15891a.put(activity, aVar2);
        return aVar2;
    }

    public Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("233c125f", new Object[]{this});
        }
        if (!this.c) {
            return null;
        }
        if (!j.a()) {
            com.taobao.android.weex.util.c.a(false, "WeexDebug包检测, anyActivity必须在主线程");
        }
        for (Activity activity : this.f15891a.keySet()) {
            if (activity != null && activity.hasWindowFocus() && !activity.isFinishing() && activity.getWindow() != null) {
                return activity;
            }
        }
        return null;
    }

    public void a(WeexInstanceImpl weexInstanceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee82034e", new Object[]{this, weexInstanceImpl, new Boolean(z)});
        } else if (!this.c) {
        } else {
            synchronized (this) {
                if (!z) {
                    if (!j.a()) {
                        com.taobao.android.weex.util.c.a(false, "WeexDebug包检测, Instance创建必须在主线程");
                    }
                }
                c cVar = this.b.get(weexInstanceImpl.getMode().ordinal());
                cVar.b++;
                cVar.c.add(weexInstanceImpl);
                c();
                Context context = weexInstanceImpl.getContext();
                if (!(context instanceof Activity)) {
                    return;
                }
                a((Activity) context).b.put(weexInstanceImpl, LifecycleStatus.RESUMED);
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (c cVar : this.b) {
            if (cVar.f15896a == WeexInstanceInternalMode.MUS) {
                if (cVar.b >= 100) {
                    z = true;
                }
            } else if (cVar.b >= 20) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        g.e("Weex存活实例数量过多, 检查log查看数量");
        g.f("CHECKER", "All Weex Instance:");
        for (c cVar2 : this.b) {
            g.f("CHECKER", "  Type " + cVar2.f15896a + " count: " + cVar2.b);
            Iterator<WeexInstanceImpl> it = cVar2.c.iterator();
            while (it.hasNext()) {
                g.f("CHECKER", "    " + it.next());
            }
        }
    }

    public void a(Context context, Context context2, WeexInstanceImpl weexInstanceImpl) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0815f46", new Object[]{this, context, context2, weexInstanceImpl});
        } else if (!this.c) {
        } else {
            synchronized (this) {
                LifecycleStatus lifecycleStatus = LifecycleStatus.RESUMED;
                if ((context instanceof Activity) && (aVar = this.f15891a.get((Activity) context)) != null) {
                    lifecycleStatus = aVar.b.remove(weexInstanceImpl);
                }
                if (lifecycleStatus == null) {
                    lifecycleStatus = LifecycleStatus.RESUMED;
                }
                if (context2 instanceof Activity) {
                    a((Activity) context2).b.put(weexInstanceImpl, lifecycleStatus);
                }
            }
        }
    }

    public void b(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dafde87", new Object[]{this, weexInstanceImpl});
        } else if (!this.c) {
        } else {
            if (!j.a()) {
                com.taobao.android.weex.util.c.a(false, "WeexDebug包检测, Instance.Destroy必须在主线程");
            }
            synchronized (this) {
                c cVar = this.b.get(weexInstanceImpl.getMode().ordinal());
                cVar.b--;
                cVar.c.remove(weexInstanceImpl);
                Context context = weexInstanceImpl.getContext();
                if (!(context instanceof Activity)) {
                    return;
                }
                a aVar = this.f15891a.get((Activity) context);
                if (aVar == null) {
                    return;
                }
                aVar.b.remove(weexInstanceImpl);
            }
        }
    }

    private void a(WeexInstanceImpl weexInstanceImpl, LifecycleStatus lifecycleStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7adcbe90", new Object[]{this, weexInstanceImpl, lifecycleStatus});
        } else if (!this.c) {
        } else {
            synchronized (this) {
                Context context = weexInstanceImpl.getContext();
                if (!(context instanceof Activity)) {
                    return;
                }
                a aVar = this.f15891a.get((Activity) context);
                if (aVar == null) {
                    return;
                }
                aVar.b.put(weexInstanceImpl, lifecycleStatus);
            }
        }
    }

    public void c(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a04c8", new Object[]{this, weexInstanceImpl});
        } else {
            a(weexInstanceImpl, LifecycleStatus.STARTED);
        }
    }

    public void d(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a42b09", new Object[]{this, weexInstanceImpl});
        } else {
            a(weexInstanceImpl, LifecycleStatus.RESUMED);
        }
    }

    public void e(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1e514a", new Object[]{this, weexInstanceImpl});
        } else {
            a(weexInstanceImpl, LifecycleStatus.PAUSED);
        }
    }

    public void f(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6398778b", new Object[]{this, weexInstanceImpl});
        } else {
            a(weexInstanceImpl, LifecycleStatus.STOPPED);
        }
    }

    private synchronized void b(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        a aVar = this.f15891a.get(activity);
        if (aVar != null && !aVar.b.isEmpty()) {
            if (aVar.f15895a != LifecycleStatus.STOPPED) {
                return;
            }
            for (Map.Entry<WeexInstanceImpl, LifecycleStatus> entry : aVar.b.entrySet()) {
                if (entry.getValue() == LifecycleStatus.STOPPED || entry.getValue() == LifecycleStatus.PAUSED) {
                    break;
                }
                WeexInstanceImpl key = entry.getKey();
                if (Build.VERSION.SDK_INT < 19 || !key.getRootView().isAttachedToWindow()) {
                    break;
                }
                if (!z) {
                    g.e("Weex实例没有调用ActivityPause/Stop, vsync未停止");
                    z = true;
                }
                key.reportTaskLog("Weex实例没有调用ActivityPause/Stop, vsync未停止");
                g.f("CHECKER", "Weex实例没有调用ActivityPause/Stop, Activity: " + activity.toString() + ", 实例: " + key);
            }
        }
    }

    private synchronized void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        a aVar = this.f15891a.get(activity);
        if (aVar != null && !aVar.b.isEmpty()) {
            g.e("Leak: Weex实例泄露, Activity销毁后没有析构实例, 看log详细信息");
            Iterator<WeexInstanceImpl> it = aVar.b.keySet().iterator();
            while (it.hasNext()) {
                g.f("CHECKER", "Instance leak内存泄露, Activity Destroy以后Instance没有Destroy, Activity: " + activity.toString() + ", 实例: " + it.next());
            }
        }
    }
}
