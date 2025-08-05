package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public class mln extends b implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_ACTIVITY_CREATED = 101;
    public static final int ON_ACTIVITY_DESTROYED = 107;
    public static final int ON_ACTIVITY_PAUSED = 104;
    public static final int ON_ACTIVITY_RESUMED = 103;
    public static final int ON_ACTIVITY_SAVE_INSTANCE_STATE = 106;
    public static final int ON_ACTIVITY_STARTED = 102;
    public static final int ON_ACTIVITY_STOPPED = 105;
    public static final int ON_FRAGMENT_DESTROYED = 213;
    public static final int ON_FRAGMENT_PAUSED = 209;
    public static final int ON_FRAGMENT_PRE_ATTACHED = 201;
    public static final int ON_FRAGMENT_RESUMED = 208;
    public static final int ON_FRAGMENT_VIEW_DESTROYED = 212;
    public static final String PARAM_LIFECYCLE = "lifecycleStage";
    public static final String PARAM_PAGE = "page";
    public static final String PARAM_TIME = "time";

    /* renamed from: a  reason: collision with root package name */
    public MetricContext f31096a;

    public static /* synthetic */ Object ipc$super(mln mlnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.metrickit.event.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : c.SWITCH_LIFECYCLE_EVENT;
    }

    public static /* synthetic */ void a(mln mlnVar, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e79a3e", new Object[]{mlnVar, obj, new Integer(i)});
        } else {
            mlnVar.a(obj, i);
        }
    }

    public mln(Handler handler) {
        super(handler);
        this.f31096a = null;
    }

    @Override // com.taobao.metrickit.event.b
    public int[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : new int[]{4};
    }

    @Override // com.taobao.metrickit.event.b
    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
            return;
        }
        this.f31096a = metricContext;
        metricContext.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // com.taobao.metrickit.event.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        MetricContext metricContext = this.f31096a;
        if (metricContext == null) {
            return;
        }
        metricContext.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        a(activity, 101);
        if (!(activity instanceof FragmentActivity)) {
            return;
        }
        ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: tb.mln.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                switch (str.hashCode()) {
                    case -2070443536:
                        super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                        return null;
                    case -2001641611:
                        super.onFragmentViewDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                        return null;
                    case -1547495758:
                        super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                        return null;
                    case -1501849859:
                        super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                        return null;
                    case 165640294:
                        super.onFragmentPreAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                        return null;
                    default:
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9df7866", new Object[]{this, fragmentManager, fragment, context});
                    return;
                }
                super.onFragmentPreAttached(fragmentManager, fragment, context);
                mln.a(mln.this, fragment, 201);
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
                    return;
                }
                super.onFragmentResumed(fragmentManager, fragment);
                mln.a(mln.this, fragment, 208);
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
                    return;
                }
                super.onFragmentPaused(fragmentManager, fragment);
                mln.a(mln.this, fragment, 209);
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88b15f75", new Object[]{this, fragmentManager, fragment});
                    return;
                }
                super.onFragmentViewDestroyed(fragmentManager, fragment);
                mln.a(mln.this, fragment, 212);
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("849789f0", new Object[]{this, fragmentManager, fragment});
                    return;
                }
                super.onFragmentDestroyed(fragmentManager, fragment);
                mln.a(mln.this, fragment, mln.ON_FRAGMENT_DESTROYED);
            }
        }, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            a(activity, 102);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            a(activity, 103);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        a(activity, 104);
        MetricContext metricContext = this.f31096a;
        if (metricContext == null) {
            return;
        }
        metricContext.updateCurrPage(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            a(activity, 105);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        } else {
            a(activity, 106);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            a(activity, 107);
        }
    }

    private void a(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7da93f", new Object[]{this, obj, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page", obj);
        hashMap.put(PARAM_LIFECYCLE, Integer.valueOf(i));
        hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
        a(4, hashMap);
    }
}
