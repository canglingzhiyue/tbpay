package com.alibaba.android.split;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class ab implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f2427a = null;
    private ArrayList<b> b = new ArrayList<>();
    private ArrayList<a> c = new ArrayList<>();

    /* loaded from: classes2.dex */
    public interface a {
        void onActivityCreate(String str);

        void onBackground();

        void onExit();

        void onForeground();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void onTabChanged(int i, String str);
    }

    static {
        kge.a(-1814973962);
        kge.a(-1894394539);
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

    public static /* synthetic */ void a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1434b180", new Object[]{abVar});
        } else {
            abVar.b();
        }
    }

    public static /* synthetic */ void b(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0d7141", new Object[]{abVar});
        } else {
            abVar.c();
        }
    }

    public static /* synthetic */ void c(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e63102", new Object[]{abVar});
        } else {
            abVar.d();
        }
    }

    public static /* synthetic */ Object[] d(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("9d785c64", new Object[]{abVar}) : abVar.a();
    }

    public ab() {
        com.taobao.application.common.c.a(new a.b() { // from class: com.alibaba.android.split.ab.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    ab.c(ab.this);
                } else if (i == 2) {
                    ab.b(ab.this);
                } else if (i != 50) {
                } else {
                    ab.a(ab.this);
                }
            }
        });
        com.taobao.tao.navigation.e.a(new com.taobao.tao.navigation.d() { // from class: com.alibaba.android.split.ab.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.navigation.d
            public void onTabChanged(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                    return;
                }
                Object[] d = ab.d(ab.this);
                if (d == null) {
                    return;
                }
                for (Object obj : d) {
                    ((b) obj).onTabChanged(i, str);
                }
            }
        });
    }

    private Object[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("d4ae18c9", new Object[]{this});
        }
        Object[] objArr = null;
        synchronized (this.b) {
            if (this.b.size() > 0) {
                objArr = this.b.toArray();
            }
        }
        return objArr;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Object[] e = e();
        if (e == null) {
            return;
        }
        for (Object obj : e) {
            ((a) obj).onExit();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Object[] e = e();
        if (e == null) {
            return;
        }
        for (Object obj : e) {
            ((a) obj).onForeground();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Object[] e = e();
        if (e == null) {
            return;
        }
        for (Object obj : e) {
            ((a) obj).onBackground();
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a3be02", new Object[]{this, bVar});
            return;
        }
        synchronized (this.b) {
            this.b.add(bVar);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a349a3", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            this.c.add(aVar);
        }
    }

    private Object[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("fd747dcd", new Object[]{this});
        }
        Object[] objArr = null;
        synchronized (this.c) {
            if (this.c.size() > 0) {
                objArr = this.c.toArray();
            }
        }
        return objArr;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        this.f2427a = activity;
        Object[] e = e();
        if (e == null) {
            return;
        }
        for (Object obj : e) {
            ((a) obj).onActivityCreate(activity.getClass().getName());
        }
    }
}
