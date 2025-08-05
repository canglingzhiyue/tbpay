package com.taobao.taobao;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class c implements a.InterfaceC0630a, ApplicationBackgroundChangedDispatcher.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<b> f21210a = new CopyOnWriteArrayList();
    private ApplicationBackgroundChangedDispatcher b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void b();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public c() {
        m a2 = f.a(com.taobao.monitor.impl.common.a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (a2 instanceof ApplicationBackgroundChangedDispatcher) {
            this.b = (ApplicationBackgroundChangedDispatcher) a2;
            this.b.a((ApplicationBackgroundChangedDispatcher) this);
        }
        com.taobao.application.common.c.a(this, true);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db619246", new Object[]{this, bVar});
        } else {
            f21210a.add(bVar);
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3299a5", new Object[]{this, bVar});
        } else {
            f21210a.remove(bVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.b != null) {
                this.b.b(this);
            }
            com.taobao.application.common.c.a(this);
            f21210a.clear();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            c();
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        if (i == 0) {
            ApplicationBackgroundChangedDispatcher applicationBackgroundChangedDispatcher = this.b;
            if (applicationBackgroundChangedDispatcher != null) {
                applicationBackgroundChangedDispatcher.b(this);
            }
            b();
        }
        if (i != 1) {
            return;
        }
        try {
            com.taobao.application.common.c.a(this);
        } catch (Throwable th) {
            com.taobao.taobao.utils.b.a("REMOVE_ACTIVITY_LIFECYCLE", th.getMessage());
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (b bVar : f21210a) {
            bVar.a();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (b bVar : f21210a) {
            bVar.b();
        }
    }
}
