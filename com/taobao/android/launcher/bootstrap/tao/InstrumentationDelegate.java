package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.TestLooperManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tb.gtk;
import tb.gtx;
import tb.jzk;

/* loaded from: classes.dex */
public class InstrumentationDelegate extends Instrumentation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean d = new AtomicBoolean(false);
    private static final AtomicReference<InstrumentationDelegate> f = new AtomicReference<>(null);

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.launcher.bootstrap.tao.ability.d f13060a;
    private final com.taobao.android.launcher.bootstrap.tao.ability.a b;
    private final Instrumentation c;
    private ScheduleComposer e;

    public static /* synthetic */ com.taobao.android.launcher.bootstrap.tao.ability.a a(InstrumentationDelegate instrumentationDelegate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.launcher.bootstrap.tao.ability.a) ipChange.ipc$dispatch("3579e70f", new Object[]{instrumentationDelegate}) : instrumentationDelegate.b;
    }

    @Override // android.app.Instrumentation
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            this.c.onCreate(bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.c.start();
        }
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.c.onStart();
        }
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d775c06", new Object[]{this, obj, th})).booleanValue();
        }
        if (!this.b.a(obj, th)) {
            return this.c.onException(obj, th);
        }
        return true;
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5aa792", new Object[]{this, new Integer(i), bundle});
        } else {
            this.c.sendStatus(i, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void addResults(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1611138", new Object[]{this, bundle});
        } else {
            this.c.addResults(bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void finish(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0c538b", new Object[]{this, new Integer(i), bundle});
        } else {
            this.c.finish(i, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5cc2ef", new Object[]{this});
        } else {
            this.c.setAutomaticPerformanceSnapshots();
        }
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786db9d9", new Object[]{this});
        } else {
            this.c.startPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8856fd40", new Object[]{this});
        } else {
            this.c.endPerformanceSnapshot();
        }
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.c.onDestroy();
        }
    }

    @Override // android.app.Instrumentation
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.c.getContext();
    }

    @Override // android.app.Instrumentation
    public ComponentName getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComponentName) ipChange.ipc$dispatch("d1cc68d8", new Object[]{this}) : this.c.getComponentName();
    }

    @Override // android.app.Instrumentation
    public Context getTargetContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c49215a7", new Object[]{this}) : this.c.getTargetContext();
    }

    @Override // android.app.Instrumentation
    public String getProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62fd1115", new Object[]{this}) : this.c.getProcessName();
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("430f38a7", new Object[]{this})).booleanValue() : this.c.isProfiling();
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a069fc6b", new Object[]{this});
        } else {
            this.c.startProfiling();
        }
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b019ccb", new Object[]{this});
        } else {
            this.c.stopProfiling();
        }
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a7bf2", new Object[]{this, new Boolean(z)});
        } else {
            this.c.setInTouchMode(z);
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e836a8d", new Object[]{this, runnable});
        } else {
            this.c.waitForIdle(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cbd2ca", new Object[]{this});
        } else {
            this.c.waitForIdleSync();
        }
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8b0363", new Object[]{this, runnable});
        } else {
            this.c.runOnMainSync(runnable);
        }
    }

    @Override // android.app.Instrumentation
    public Activity startActivitySync(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("1a716f98", new Object[]{this, intent}) : this.c.startActivitySync(intent);
    }

    @Override // android.app.Instrumentation
    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352bfd1a", new Object[]{this, activityMonitor});
        } else {
            this.c.addMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Instrumentation.ActivityMonitor) ipChange.ipc$dispatch("b7abb51a", new Object[]{this, intentFilter, activityResult, new Boolean(z)}) : this.c.addMonitor(intentFilter, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Instrumentation.ActivityMonitor) ipChange.ipc$dispatch("53717c55", new Object[]{this, str, activityResult, new Boolean(z)}) : this.c.addMonitor(str, activityResult, z);
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("58f6d0b5", new Object[]{this, activityMonitor, new Integer(i)})).booleanValue() : this.c.checkMonitorHit(activityMonitor, i);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("6083423b", new Object[]{this, activityMonitor}) : this.c.waitForMonitor(activityMonitor);
    }

    @Override // android.app.Instrumentation
    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("adbcb3c2", new Object[]{this, activityMonitor, new Long(j)}) : this.c.waitForMonitorWithTimeout(activityMonitor, j);
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513077fd", new Object[]{this, activityMonitor});
        } else {
            this.c.removeMonitor(activityMonitor);
        }
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("96021605", new Object[]{this, activity, new Integer(i), new Integer(i2)})).booleanValue() : this.c.invokeMenuActionSync(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c60caa9", new Object[]{this, activity, new Integer(i), new Integer(i2)})).booleanValue() : this.c.invokeContextMenuAction(activity, i, i2);
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860c6b85", new Object[]{this, str});
        } else {
            this.c.sendStringSync(str);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffadc23", new Object[]{this, keyEvent});
        } else {
            this.c.sendKeySync(keyEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290f308d", new Object[]{this, new Integer(i)});
        } else {
            this.c.sendKeyDownUpSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee86a20", new Object[]{this, new Integer(i)});
        } else {
            this.c.sendCharacterSync(i);
        }
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a99c81ac", new Object[]{this, motionEvent});
        } else {
            this.c.sendPointerSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9087ef", new Object[]{this, motionEvent});
        } else {
            this.c.sendTrackballEventSync(motionEvent);
        }
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("a20c09ba", new Object[]{this, classLoader, str, context}) : this.c.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ad156b", new Object[]{this, application});
        } else {
            this.c.callApplicationOnCreate(application);
        }
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws InstantiationException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("254c9c38", new Object[]{this, cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj}) : this.c.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f0db1f2d", new Object[]{this, classLoader, str, intent});
        }
        ScheduleComposer scheduleComposer = this.e;
        if (scheduleComposer != null) {
            scheduleComposer.a(str + ".newActivity");
        }
        return this.f13060a.a(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(final Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b66e33", new Object[]{this, activity, bundle});
            return;
        }
        ScheduleComposer scheduleComposer = this.e;
        if (scheduleComposer != null) {
            scheduleComposer.onActivityPreCreated(activity, bundle);
            if (bundle != null && bundle.getBoolean(ScheduleComposer.PARCEL_KEY_STATE_REWROTE, false)) {
                z = true;
            }
        }
        final Bundle bundle2 = z ? null : bundle;
        this.f13060a.a(activity, bundle2, new Runnable() { // from class: com.taobao.android.launcher.bootstrap.tao.InstrumentationDelegate.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    InstrumentationDelegate.a(InstrumentationDelegate.this).a(activity, bundle2);
                }
            }
        });
        ScheduleComposer scheduleComposer2 = this.e;
        if (scheduleComposer2 == null) {
            return;
        }
        scheduleComposer2.onActivityPostCreated(activity, bundle);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42345dd", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.c.callActivityOnCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eff9327", new Object[]{this, activity});
        } else {
            this.c.callActivityOnDestroy(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81918861", new Object[]{this, activity, bundle});
        } else {
            this.b.b(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8db8b", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.c.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47da6f73", new Object[]{this, activity, bundle});
        } else {
            this.c.callActivityOnPostCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a741971d", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.c.callActivityOnPostCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a938c6", new Object[]{this, activity, intent});
            return;
        }
        ScheduleComposer scheduleComposer = this.e;
        if (scheduleComposer != null && !scheduleComposer.a()) {
            h.b("InstrumentationDelegate", "callActivityOnNewIntent, activity=" + activity.getClass().getName() + ", intent=" + intent);
            ScheduleComposer scheduleComposer2 = this.e;
            StringBuilder sb = new StringBuilder();
            sb.append(activity.getClass().getName());
            sb.append(".onNewIntent");
            scheduleComposer2.a(sb.toString());
        }
        this.f13060a.a(activity, intent);
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba103a8f", new Object[]{this, activity});
        } else {
            this.c.callActivityOnStart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b70fc", new Object[]{this, activity});
        } else {
            this.c.callActivityOnRestart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c748f2", new Object[]{this, activity});
        } else {
            this.c.callActivityOnResume(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66276387", new Object[]{this, activity});
        } else {
            this.c.callActivityOnStop(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d00a0e8", new Object[]{this, activity, bundle});
        } else {
            this.c.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129f8dd2", new Object[]{this, activity, bundle, persistableBundle});
        } else {
            this.c.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd40b23", new Object[]{this, activity});
        } else {
            this.c.callActivityOnPause(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8d47d6", new Object[]{this, activity});
        } else {
            this.c.callActivityOnUserLeaving(activity);
        }
    }

    @Override // android.app.Instrumentation
    @Deprecated
    public void startAllocCounting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4ce70d", new Object[]{this});
        } else {
            this.c.startAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    @Deprecated
    public void stopAllocCounting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75d576d", new Object[]{this});
        } else {
            this.c.stopAllocCounting();
        }
    }

    @Override // android.app.Instrumentation
    public Bundle getAllocCounts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("4a366cee", new Object[]{this}) : this.c.getAllocCounts();
    }

    @Override // android.app.Instrumentation
    public Bundle getBinderCounts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("d87c508f", new Object[]{this}) : this.c.getBinderCounts();
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UiAutomation) ipChange.ipc$dispatch("d8d4dc24", new Object[]{this}) : this.c.getUiAutomation();
    }

    @Override // android.app.Instrumentation
    public UiAutomation getUiAutomation(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UiAutomation) ipChange.ipc$dispatch("ee3c0211", new Object[]{this, new Integer(i)}) : this.c.getUiAutomation(i);
    }

    @Override // android.app.Instrumentation
    public TestLooperManager acquireLooperManager(Looper looper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TestLooperManager) ipChange.ipc$dispatch("33272b0e", new Object[]{this, looper}) : this.c.acquireLooperManager(looper);
    }

    private InstrumentationDelegate(gtx gtxVar, Instrumentation instrumentation, gtk gtkVar, Context context) {
        this.c = instrumentation;
        this.f13060a = com.taobao.android.launcher.bootstrap.tao.ability.f.a(gtxVar, gtkVar, instrumentation, context);
        this.b = new com.taobao.android.launcher.bootstrap.tao.ability.a(instrumentation);
    }

    public static boolean a(gtk gtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaec60fe", new Object[]{gtkVar})).booleanValue();
        }
        if (!d.compareAndSet(false, true)) {
            return true;
        }
        return a(null, gtkVar, null);
    }

    public static boolean a(gtx gtxVar, gtk gtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e450963", new Object[]{gtxVar, gtkVar})).booleanValue();
        }
        if (!d.compareAndSet(false, true)) {
            return true;
        }
        return a(gtxVar, gtkVar, null);
    }

    public static boolean a(gtk gtkVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6a95812", new Object[]{gtkVar, context})).booleanValue();
        }
        if (!d.compareAndSet(false, true)) {
            return true;
        }
        return a(null, gtkVar, context);
    }

    public static void a(ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9ebc16", new Object[]{scheduleComposer});
            return;
        }
        InstrumentationDelegate instrumentationDelegate = f.get();
        if (instrumentationDelegate == null) {
            return;
        }
        instrumentationDelegate.e = scheduleComposer;
    }

    public static boolean a(gtx gtxVar, gtk gtkVar, Context context) {
        try {
            Object b = jzk.b();
            Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            InstrumentationDelegate instrumentationDelegate = new InstrumentationDelegate(gtxVar, (Instrumentation) declaredField.get(b), gtkVar, context);
            declaredField.set(b, instrumentationDelegate);
            declaredField.setAccessible(false);
            f.compareAndSet(null, instrumentationDelegate);
            return true;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }
}
