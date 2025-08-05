package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.copy.process.b;
import com.taobao.share.core.screenshot.a;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.jsbridge.TBWeexShare;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class nyw extends ApplicationCompat.AbstractActivityLifecycleCallbacks implements PanguApplication.CrossActivityLifecycleCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<Activity> f31848a;
    private static int h;
    private HashMap<String, Object> b;
    private Context e;
    private Handler g;
    private a c = null;
    private boolean d = false;
    private Handler f = new Handler(Looper.getMainLooper());

    public static /* synthetic */ Object ipc$super(nyw nywVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        h = i;
        return i;
    }

    public static /* synthetic */ HashMap a(nyw nywVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("37dab1af", new Object[]{nywVar}) : nywVar.b;
    }

    public static /* synthetic */ HashMap a(nyw nywVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("dc86888a", new Object[]{nywVar, hashMap});
        }
        nywVar.b = hashMap;
        return hashMap;
    }

    public static /* synthetic */ void a(nyw nywVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1d6508", new Object[]{nywVar, new Boolean(z)});
        } else {
            nywVar.a(z);
        }
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : h;
    }

    static {
        kge.a(1385187223);
        kge.a(1621500039);
        h = 0;
    }

    public nyw() {
        ShareBizAdapter.getInstance().initShareMenu();
    }

    public void a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.b = hashMap;
        }
    }

    private Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this});
        }
        if (this.g == null) {
            try {
                this.g = OrangeConfig.getInstance().getConfig("android_share_config", "useSubHandler", "true").equals("true") ? new Handler(Coordinator.getWorkerLooper()) : this.f;
            } catch (Throwable th) {
                th.printStackTrace();
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "getHandler err: " + th.toString());
                this.g = this.f;
            }
        }
        return this.g;
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (c()) {
        } else {
            f31848a = null;
            f31848a = new WeakReference<>(activity);
            if (activity == null) {
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "onActivityResumed activity is null");
                return;
            }
            h++;
            com.taobao.share.copy.a.a().a(f31848a);
            if (Build.VERSION.SDK_INT < 28) {
                z = true;
            }
            this.f.postDelayed(new Runnable() { // from class: tb.nyw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TLog.loge("ClipUrlWatcherLifeCycleObserver", "onActivityResumed  showDialogByCase");
                    com.taobao.share.copy.a.a().q();
                }
            }, z ? 0L : 300L);
            odp.f().a(f31848a);
            if (nyl.a(activity)) {
                a.d();
                if (this.c == null) {
                    this.c = new a();
                    this.c.a();
                }
            }
            com.taobao.share.copy.a.a();
        }
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            b.a().a(activity.getIntent());
        }
    }

    @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
    public void onActivityPaused(Activity activity) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else if (c()) {
        } else {
            if (nyl.a(activity) && (aVar = this.c) != null) {
                aVar.c();
                this.c = null;
            }
            com.taobao.share.copy.a.a();
            TBShareContent j = e.b().j();
            if (j == null || !nyk.b(j.businessId)) {
                return;
            }
            LocalBroadcastManager.getInstance(this.e.getApplicationContext()).sendBroadcast(new Intent(TBWeexShare.ACTION_CLOSE_SHARE_PANEL));
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            return;
        }
        this.e = activity.getApplicationContext();
        b();
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
        } else if (c()) {
        } else {
            if (activity == null) {
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStarted activity is null");
                return;
            }
            h++;
            f31848a = null;
            f31848a = new WeakReference<>(activity);
            TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStarted:" + activity.getClass().getSimpleName());
            com.taobao.share.copy.a.a().a(f31848a);
            odp.f().a(f31848a);
            boolean z = Build.VERSION.SDK_INT < 28;
            if (obh.q() && !z) {
                if (activity.getWindow() == null) {
                    a(false);
                    nyy.c("ClipUrlWatcherLifeCycleObserver", "fixPrimaryClipNullIssue, window is null");
                    return;
                }
                activity.getWindow().getDecorView().post(new Runnable() { // from class: tb.nyw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        nyy.b("ClipUrlWatcherLifeCycleObserver", "fixPrimaryClipNullIssue, post run");
                        nyw.a(nyw.this, false);
                    }
                });
                return;
            }
            nyy.b("ClipUrlWatcherLifeCycleObserver", "fixPrimaryClipNullIssue=false, run");
            if (obh.y()) {
                a(true);
            } else {
                a(z);
            }
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
        } else if (c()) {
        } else {
            if (activity == null) {
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStopped activity is null");
            } else {
                TLog.logd("ClipUrlWatcherLifeCycleObserver", "onStopped:" + activity.getClass().getSimpleName());
            }
            f31848a = null;
            com.taobao.share.copy.a.a().a((WeakReference<Activity>) null);
            com.taobao.share.copy.a.a().k();
            odp.f().a((WeakReference<Activity>) null);
            odp.f().h();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d) {
        } else {
            nyk.a(nym.a().getApplicationContext());
            this.d = true;
        }
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        this.e = context;
        com.taobao.share.copy.a.a().b(context);
        com.taobao.share.copy.a.a().a(str);
        com.taobao.share.copy.a.a().a(this.e);
    }

    private boolean c() {
        HashMap<String, Object> hashMap;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : nyk.e() && (hashMap = this.b) != null && !"ShareSecondRefreshHomepage".equals(hashMap.get("initShareMode")) && this.b.get("process") != null;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.b();
        a2.a(com.taobao.android.share.resource.a.KEY_SHARELIFECYCLEOBSERVERONSTARTED);
        a().postDelayed(new Runnable() { // from class: tb.nyw.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z2 = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TLog.loge("ClipUrlWatcherLifeCycleObserver", "onStarted  prepareData");
                if (nyw.a(nyw.this) == null) {
                    nyw.a(nyw.this, new HashMap());
                }
                if (nyw.d() <= 1) {
                    z2 = true;
                }
                if (nyw.d() > 5) {
                    nyw.a(2);
                }
                nyw.a(nyw.this).put(nfc.PHA_MONITOR_IS_COLD_START, Boolean.valueOf(z2));
                com.taobao.share.copy.a.a().a(nyw.a(nyw.this));
            }
        }, z ? 0L : 300L);
    }
}
