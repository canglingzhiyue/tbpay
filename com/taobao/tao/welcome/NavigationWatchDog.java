package com.taobao.tao.welcome;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class NavigationWatchDog extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<HostController> f21190a = null;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicInteger e = new AtomicInteger(0);
    private long f = -1;
    private final Handler b = new Handler(Looper.getMainLooper(), this);

    static {
        kge.a(-1106504306);
        kge.a(-1043440182);
        kge.a(-1894394539);
    }

    public static /* synthetic */ Object ipc$super(NavigationWatchDog navigationWatchDog, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            TLog.loge("Welcome", "NavigationWatchDog", str);
        }
    }

    public void a(HostController hostController, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894ad1c", new Object[]{this, hostController, new Long(j)});
            return;
        }
        this.f = j;
        if (this.c.compareAndSet(false, true)) {
            int incrementAndGet = this.d.incrementAndGet();
            this.f21190a = new WeakReference<>(hostController);
            Activity host = hostController.getHost();
            TLog.loge("Welcome", "NavigationWatchDog", "setup watchdog, activity=" + host.getLocalClassName() + ", timeout=" + j + ", counter=" + incrementAndGet);
            LocalBroadcastManager.getInstance(host).registerReceiver(this, new IntentFilter("action_welcome_need_finish"));
            hostController.getHost().getApplication().registerActivityLifecycleCallbacks(this);
            this.b.sendEmptyMessageDelayed(200, j);
            return;
        }
        TLog.loge("Welcome", "NavigationWatchDog", "already settled, reset the watchdog");
        b();
    }

    public boolean a() {
        int andIncrement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!ABGlobal.isFeatureOpened(null, "welcomeSucks")) {
            TLog.loge("Welcome", "NavigationWatchDog", "ab value of welcomeSucks is off");
            return false;
        } else if (!this.c.get() || (andIncrement = this.d.getAndIncrement()) <= 1) {
            return false;
        } else {
            int i = this.e.get();
            boolean z = i > 1;
            TLog.loge("Welcome", "NavigationWatchDog", "setupCount=" + andIncrement + ", aliveCount=" + i + ", condition=" + z);
            if (!z) {
                return true;
            }
            TLog.loge("Welcome", "NavigationWatchDog", "condition matched, try finish target");
            e();
            return false;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c.get()) {
        } else {
            TLog.loge("Welcome", "NavigationWatchDog", "reset the watchdog, current timer interval=" + this.f);
            this.b.removeMessages(200);
            this.b.sendEmptyMessageDelayed(200, this.f);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c.compareAndSet(true, false)) {
            TLog.loge("Welcome", "NavigationWatchDog", "cancel watchdog");
            this.b.removeMessages(200);
        } else {
            TLog.loge("Welcome", "NavigationWatchDog", "please setup the watchdog first");
        }
    }

    public void c() {
        HostController hostController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WeakReference<HostController> weakReference = this.f21190a;
        if (weakReference == null || (hostController = weakReference.get()) == null) {
            return;
        }
        TLog.loge("Welcome", "NavigationWatchDog", "destroy called, unregister the local broadcast");
        Activity host = hostController.getHost();
        LocalBroadcastManager.getInstance(host).unregisterReceiver(this);
        host.getApplication().unregisterActivityLifecycleCallbacks(this);
        this.b.removeMessages(200);
        this.f21190a = null;
    }

    private void e() {
        HostController hostController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        WeakReference<HostController> weakReference = this.f21190a;
        if (weakReference == null || (hostController = weakReference.get()) == null) {
            return;
        }
        Activity host = hostController.getHost();
        try {
            TLog.loge("Welcome", "NavigationWatchDog", "finish the target activity, activity=" + host.getLocalClassName());
            host.finish();
            d();
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        TLog.loge("Welcome", "NavigationWatchDog", "broadcast received, action=" + intent.getAction() + ", counter=" + this.d.get());
        if (!StringUtils.equals("action_welcome_need_finish", intent.getAction())) {
            return;
        }
        e();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what != 200) {
            return false;
        }
        int i = this.e.get();
        TLog.loge("Welcome", "NavigationWatchDog", "timeout msg reached, setup counter=" + this.d.get() + ", foreground alive counter=" + i);
        AppMonitor.Counter.commit("Welcome", "NavigationWatchDog", 1.0d);
        HostController hostController = this.f21190a.get();
        if (ABGlobal.isFeatureOpened(null, "welcomeAutoFinish") && hostController != null) {
            if (i == 1) {
                TLog.loge("Welcome", "NavigationWatchDog", "recall targetHost.navigate() and then finish target host");
                hostController.navigate();
                hostController.finish();
            } else if (i > 1) {
                TLog.loge("Welcome", "NavigationWatchDog", "multiple activity instances, just finish target host");
                hostController.finish();
            } else {
                TLog.loge("Welcome", "NavigationWatchDog", "alive counter=" + i + ", it seems that something went wrong");
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        int incrementAndGet = this.e.incrementAndGet();
        TLog.loge("Welcome", "NavigationWatchDog", "foreground activity aliveCount=" + incrementAndGet);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        int decrementAndGet = this.e.decrementAndGet();
        TLog.loge("Welcome", "NavigationWatchDog", "foreground activity aliveCount=" + decrementAndGet);
    }
}
