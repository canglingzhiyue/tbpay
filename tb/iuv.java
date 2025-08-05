package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Stack;
import tb.huo;

/* loaded from: classes4.dex */
public class iuv implements huo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Stack<b> f29324a;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final iuv f29325a = new iuv();

        public static /* synthetic */ iuv a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (iuv) ipChange.ipc$dispatch("f062594", new Object[0]) : f29325a;
        }
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityPaused(Activity activity) {
        huo.CC.$default$onActivityPaused(this, activity);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityResumed(Activity activity) {
        huo.CC.$default$onActivityResumed(this, activity);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        huo.CC.$default$onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStarted(Activity activity) {
        huo.CC.$default$onActivityStarted(this, activity);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStopped(Activity activity) {
        huo.CC.$default$onActivityStopped(this, activity);
    }

    private iuv() {
        this.f29324a = new Stack<>();
    }

    public static iuv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuv) ipChange.ipc$dispatch("f062594", new Object[0]) : a.a();
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            b(activity);
        }
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            c(activity);
        }
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else if (this.f29324a.empty()) {
            this.f29324a.push(new b());
            b.a(this.f29324a.peek(), activity);
        } else if (scs.a(activity)) {
            b.a(this.f29324a.peek()).push(activity);
        } else if (scs.b(activity)) {
        } else {
            this.f29324a.push(new b());
            b.a(this.f29324a.peek(), activity);
        }
    }

    private void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        Iterator<b> it = this.f29324a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null) {
                if (b.b(next) == activity) {
                    while (!b.a(next).empty()) {
                        Activity activity2 = (Activity) b.a(next).pop();
                        if (activity2 != null) {
                            TLog.loge("TBAutoSize.StackManager", "removeActivity: " + activity2);
                        }
                    }
                    it.remove();
                }
                if (b.a(next).contains(activity)) {
                    b.a(next).remove(activity);
                }
            }
        }
    }

    public void a(Activity activity) {
        Activity activity2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        Iterator<b> it = this.f29324a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null && b.b(next) == activity && !b.a(next).empty()) {
                while (!b.a(next).empty() && (activity2 = (Activity) b.a(next).pop()) != null) {
                    TLog.loge("TBAutoSize.StackManager", "removeActivity: " + activity2);
                    activity2.finish();
                }
            }
        }
    }

    public boolean a(Activity activity, Intent intent) {
        Activity activity2;
        Activity activity3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d13e9f7b", new Object[]{this, activity, intent})).booleanValue();
        }
        Iterator<b> it = this.f29324a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null) {
                if (b.b(next) == activity && !b.a(next).empty()) {
                    while (!b.a(next).empty() && (activity3 = (Activity) b.a(next).pop()) != null) {
                        TLog.loge("TBAutoSize.StackManager", "singleTask removeRootActivity: " + activity3);
                        activity3.finish();
                    }
                    z = b(activity, intent);
                }
                if (b.b(next) != activity && b.a(next).contains(activity)) {
                    while (true) {
                        activity2 = (Activity) b.a(next).peek();
                        if (activity2 == null || activity2 == activity) {
                            break;
                        }
                        TLog.loge("TBAutoSize.StackManager", "singleTask removePopActivity: " + activity2);
                        b.a(next).pop();
                        activity2.finish();
                    }
                    if (activity2 == activity) {
                        z = b(activity, intent);
                    }
                }
            }
        }
        return z;
    }

    private boolean b(Activity activity, Intent intent) {
        if (intent == null) {
            intent = activity.getIntent();
        }
        try {
            Method declaredMethod = activity.getClass().getDeclaredMethod("onNewIntent", Intent.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, intent);
            return true;
        } catch (IllegalAccessException e) {
            TLog.loge("TBAutoSize.StackManager", "performNewIntent error: ", e);
            return false;
        } catch (NoSuchMethodException e2) {
            TLog.loge("TBAutoSize.StackManager", "performNewIntent error: ", e2);
            return false;
        } catch (InvocationTargetException e3) {
            TLog.loge("TBAutoSize.StackManager", "performNewIntent error: ", e3);
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Activity f29326a;
        private final Stack<Activity> b;

        private b() {
            this.b = new Stack<>();
        }

        public static /* synthetic */ Activity a(b bVar, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("562b8dc6", new Object[]{bVar, activity});
            }
            bVar.f29326a = activity;
            return activity;
        }

        public static /* synthetic */ Stack a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Stack) ipChange.ipc$dispatch("8064b7d9", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ Activity b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("66079a37", new Object[]{bVar}) : bVar.f29326a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : super.equals(obj);
        }
    }
}
