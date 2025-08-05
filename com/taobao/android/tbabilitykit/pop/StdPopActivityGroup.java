package com.taobao.android.tbabilitykit.pop;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.ActivityManager;
import android.app.Application;
import android.app.LocalActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.AKPopContainer;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.uc.webview.export.extension.UCCore;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.t;
import kotlin.text.n;
import tb.dmr;
import tb.dms;
import tb.fmf;
import tb.iuv;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public final class StdPopActivityGroup extends ActivityGroup implements fmf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String KEY_ORIENTATION = "Mega_Orientation";
    private static final LinkedList<StdPopActivityGroup> f;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.tbabilitykit.pop.d f15343a;
    private g b;
    private Application.ActivityLifecycleCallbacks c;
    private Application.ActivityLifecycleCallbacks d;
    private boolean e;
    private boolean g;
    private boolean h;
    private boolean i;
    private ContentObserver j;
    private boolean k;

    /* loaded from: classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.tbabilitykit.pop.d a3 = StdPopActivityGroup.this.a();
            if (a3 != null && (a2 = a3.a()) != null) {
                a2.a(null, false);
            }
            StdPopActivityGroup.a(StdPopActivityGroup.this, true);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Handler b;
        public final /* synthetic */ int c;

        /* loaded from: classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    StdPopActivityGroup.this.setRequestedOrientation(10);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, int i, Handler handler2) {
            super(handler2);
            this.b = handler;
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -1222901218) {
                super.onChange(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                return;
            }
            super.onChange(z);
            if (Settings.System.getInt(StdPopActivityGroup.this.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                z2 = false;
            }
            if (z2) {
                this.b.postDelayed(new a(), 10L);
            } else {
                StdPopActivityGroup.this.setRequestedOrientation(this.c);
            }
            AppMonitor.Counter.commit("AbilityKit", "systemRotationChanged", "{\n    \"selfChange\":" + z + ",\n    \"autoRotate\":" + z2 + " \n" + riy.BLOCK_END_STR, 1.0d);
        }
    }

    public static /* synthetic */ Object ipc$super(StdPopActivityGroup stdPopActivityGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -92595176:
                super.finishFromChild((Activity) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public StdPopActivityGroup() {
        super(true);
    }

    public static final /* synthetic */ Application.ActivityLifecycleCallbacks a(StdPopActivityGroup stdPopActivityGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("d19ab839", new Object[]{stdPopActivityGroup}) : stdPopActivityGroup.c;
    }

    public static final /* synthetic */ void a(StdPopActivityGroup stdPopActivityGroup, Activity activity, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696a1b9f", new Object[]{stdPopActivityGroup, activity, context});
        } else {
            stdPopActivityGroup.a(activity, context);
        }
    }

    public static final /* synthetic */ void a(StdPopActivityGroup stdPopActivityGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4113797d", new Object[]{stdPopActivityGroup, new Boolean(z)});
        } else {
            stdPopActivityGroup.k = z;
        }
    }

    public static final /* synthetic */ LinkedList c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("4c9a5704", new Object[0]) : f;
    }

    public final com.taobao.android.tbabilitykit.pop.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.tbabilitykit.pop.d) ipChange.ipc$dispatch("f73fe655", new Object[]{this}) : this.f15343a;
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-848762198);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final boolean a(ActivityInfo activityInfo, Intent intent, Intent intent2, Context context) {
            Intent intent3;
            Uri data;
            Intent intent4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c51478f2", new Object[]{this, activityInfo, intent, intent2, context})).booleanValue();
            }
            q.d(intent, "intent");
            if (activityInfo != null && dms.b(context)) {
                String str = null;
                r4 = null;
                Uri uri = null;
                str = null;
                str = null;
                if (activityInfo.launchMode == 1) {
                    TLog.loge("stdPopTag", " single top " + activityInfo.name);
                    if (!StdPopActivityGroup.c().isEmpty()) {
                        StdPopActivityGroup it = (StdPopActivityGroup) StdPopActivityGroup.c().getFirst();
                        q.b(it, "it");
                        if (q.a((Object) it.getCurrentActivity().getClass().getName(), (Object) activityInfo.name)) {
                            TLog.loge("stdPopTag", "found single top " + activityInfo.name);
                            if (intent2 != null) {
                                Activity currentActivity = it.getCurrentActivity();
                                q.b(currentActivity, "it.currentActivity");
                                currentActivity.setIntent(intent2);
                            }
                            intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                            Activity currentActivity2 = it.getCurrentActivity();
                            if (currentActivity2 != null && (intent4 = currentActivity2.getIntent()) != null) {
                                uri = intent4.getData();
                            }
                            AppMonitor.Counter.commit("AbilityKit", "StdPopSingleTop", String.valueOf(uri), 1.0d);
                            return true;
                        }
                    }
                } else if (activityInfo.launchMode == 2) {
                    TLog.loge("stdPopTag", " single task act " + activityInfo.name);
                    Iterator it2 = StdPopActivityGroup.c().iterator();
                    q.b(it2, "sActivityStack.iterator()");
                    while (it2.hasNext()) {
                        StdPopActivityGroup stdPopActivityGroup = (StdPopActivityGroup) it2.next();
                        if (q.a((Object) stdPopActivityGroup.getCurrentActivity().getClass().getName(), (Object) activityInfo.name)) {
                            Activity currentActivity3 = stdPopActivityGroup.getCurrentActivity();
                            if (currentActivity3 != null && (intent3 = currentActivity3.getIntent()) != null && (data = intent3.getData()) != null) {
                                str = data.toString();
                            }
                            AppMonitor.Counter.commit("AbilityKit", "StdPopSingleTask", str, 1.0d);
                            StdPopActivityGroup stdPopActivityGroup2 = stdPopActivityGroup;
                            TLog.loge("stdPopTag", " found act = " + stdPopActivityGroup2.getClass().getName());
                            Intent intent5 = new Intent();
                            intent5.putExtra("fakeNewIntent", true);
                            if (!iuv.a().a(stdPopActivityGroup2, intent5)) {
                                return false;
                            }
                            intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                            if (intent2 != null) {
                                Activity currentActivity4 = stdPopActivityGroup.getCurrentActivity();
                                q.b(currentActivity4, "activity.currentActivity");
                                currentActivity4.setIntent(intent2);
                            }
                            return true;
                        }
                    }
                    q.b(intent.addFlags(268435456), "intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)");
                } else if (activityInfo.launchMode == 3) {
                    intent.addFlags(268435456);
                    intent.addFlags(134217728);
                    AppMonitor.Counter.commit("AbilityKit", "StdPopSingleInstance", activityInfo.name, 1.0d);
                }
            }
            return false;
        }
    }

    static {
        kge.a(168587746);
        kge.a(1635027935);
        Companion = new a(null);
        f = new LinkedList<>();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        this.f15343a = com.taobao.android.tbabilitykit.pop.a.a();
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.app.Activity
    public void onStart() {
        com.taobao.android.tbabilitykit.pop.d dVar;
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (!l.b((Context) this) || (dVar = this.f15343a) == null || (b2 = dVar.b()) == null || (bVar = b2.f8913a) == null || !bVar.C() || !dmr.I()) {
            return;
        }
        int intExtra = getIntent().getIntExtra(KEY_ORIENTATION, -1);
        String str = "orientation = " + intExtra;
        if (intExtra == -1 || intExtra == 4) {
            return;
        }
        if (h()) {
            setRequestedOrientation(10);
        } else {
            setRequestedOrientation(3);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.j = new d(handler, intExtra, handler);
        ContentObserver contentObserver = this.j;
        if (contentObserver == null) {
            return;
        }
        getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, contentObserver);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 0) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ab  */
    @Override // android.app.ActivityGroup, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.onCreate(android.os.Bundle):void");
    }

    /* loaded from: classes6.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bundle b;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1cb46a1", new Object[]{this, activity, bundle});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
                return;
            }
            q.d(activity, "activity");
            q.d(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        public c(Bundle bundle) {
            this.b = bundle;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Application.ActivityLifecycleCallbacks a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            q.d(activity, "activity");
            Log.e("stdPopTag", "onActivityCreated act " + activity.getClass().getName() + " is child " + activity.isChild());
            if (dms.b(StdPopActivityGroup.this) && !activity.isChild() && (a2 = StdPopActivityGroup.a(StdPopActivityGroup.this)) != null) {
                try {
                    a2.onActivityCreated(activity, bundle);
                } catch (Throwable th) {
                    TLog.loge("stdPopTag", "splitContainer onActivityDestroyed error = " + th);
                }
            }
            if (!q.a(activity.getParent(), StdPopActivityGroup.this)) {
                return;
            }
            StdPopActivityGroup stdPopActivityGroup = StdPopActivityGroup.this;
            f fVar = new f(activity.getBaseContext());
            fVar.a(StdPopActivityGroup.this.getBaseContext());
            t tVar = t.INSTANCE;
            StdPopActivityGroup.a(stdPopActivityGroup, activity, fVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Application.ActivityLifecycleCallbacks a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            q.d(activity, "activity");
            try {
                if (!dms.b(StdPopActivityGroup.this) || activity.isChild() || (a2 = StdPopActivityGroup.a(StdPopActivityGroup.this)) == null) {
                    return;
                }
                a2.onActivityCreated(activity, this.b);
            } catch (Throwable th) {
                TLog.loge("stdPopTag", "splitContainer onActivityDestroyed error = " + th);
            }
        }
    }

    public final void b() {
        Window window;
        Window window2;
        Activity currentActivity;
        Resources resources;
        DisplayMetrics displayMetrics;
        Window window3;
        WindowManager.LayoutParams attributes;
        Window window4;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.tbabilitykit.pop.d dVar = this.f15343a;
        if (dVar == null) {
            return;
        }
        com.taobao.android.abilitykit.ability.pop.model.c b2 = dVar.b();
        WindowManager.LayoutParams layoutParams = null;
        if (!(b2 instanceof com.taobao.android.abilitykit.ability.pop.model.a)) {
            b2 = null;
        }
        com.taobao.android.abilitykit.ability.pop.model.a aVar = (com.taobao.android.abilitykit.ability.pop.model.a) b2;
        if (aVar != null && aVar.e()) {
            if (Build.VERSION.SDK_INT >= 21) {
                LocalActivityManager localActivityManager = getLocalActivityManager();
                q.b(localActivityManager, "localActivityManager");
                Activity currentActivity2 = localActivityManager.getCurrentActivity();
                if (currentActivity2 != null && (window4 = currentActivity2.getWindow()) != null) {
                    int statusBarColor = window4.getStatusBarColor();
                    Window window5 = getWindow();
                    q.b(window5, "window");
                    window5.setStatusBarColor(statusBarColor);
                }
            }
            LocalActivityManager localActivityManager2 = getLocalActivityManager();
            q.b(localActivityManager2, "localActivityManager");
            Activity currentActivity3 = localActivityManager2.getCurrentActivity();
            if (currentActivity3 != null && (window3 = currentActivity3.getWindow()) != null && (attributes = window3.getAttributes()) != null) {
                int i = attributes.flags;
                Window window6 = getWindow();
                q.b(window6, "window");
                window6.getAttributes().flags = i;
                getWindow().clearFlags(2);
                getWindow().clearFlags(4);
            }
        }
        if (q.a((Object) com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER, (Object) dVar.b().f8913a.A()) && dVar.b().f8913a.B()) {
            z = true;
        }
        if (z) {
            int a2 = h.a().a((Context) this);
            getWindow().addFlags(32);
            Window window7 = getWindow();
            q.b(window7, "window");
            WindowManager.LayoutParams attributes2 = window7.getAttributes();
            attributes2.height = -1;
            attributes2.width = a2 / 2;
            LocalActivityManager localActivityManager3 = getLocalActivityManager();
            if (localActivityManager3 != null && (currentActivity = localActivityManager3.getCurrentActivity()) != null && (resources = currentActivity.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                displayMetrics.widthPixels = attributes2.width;
            }
            Window window8 = getWindow();
            q.b(window8, "window");
            window8.setAttributes(attributes2);
            getWindow().setGravity(8388629);
        }
        if (!q.a((Object) com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER, (Object) dVar.b().f8913a.A())) {
            return;
        }
        StdPopActivityGroup stdPopActivityGroup = this;
        int a3 = h.a().a((Context) stdPopActivityGroup);
        LocalActivityManager localActivityManager4 = getLocalActivityManager();
        q.b(localActivityManager4, "localActivityManager");
        Activity currentActivity4 = localActivityManager4.getCurrentActivity();
        if (currentActivity4 != null && (window2 = currentActivity4.getWindow()) != null) {
            layoutParams = window2.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = a3 / 2;
        }
        if (layoutParams != null) {
            layoutParams.height = h.a().e(stdPopActivityGroup);
        }
        LocalActivityManager localActivityManager5 = getLocalActivityManager();
        q.b(localActivityManager5, "localActivityManager");
        Activity currentActivity5 = localActivityManager5.getCurrentActivity();
        if (currentActivity5 == null || (window = currentActivity5.getWindow()) == null) {
            return;
        }
        window.setAttributes(layoutParams);
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onResume() {
        Window window;
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        View decorView;
        View decorView2;
        Activity currentActivity;
        Window window2;
        View decorView3;
        Activity currentActivity2;
        Window window3;
        View decorView4;
        Activity currentActivity3;
        Window window4;
        Activity currentActivity4;
        Class<?> cls;
        Activity currentActivity5;
        Class<?> cls2;
        Activity currentActivity6;
        Intent intent;
        com.taobao.android.abilitykit.ability.pop.model.c b3;
        com.taobao.android.abilitykit.ability.pop.model.b bVar2;
        com.taobao.android.abilitykit.ability.pop.model.c b4;
        com.taobao.android.abilitykit.ability.pop.model.b bVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        StdPopActivityGroup stdPopActivityGroup = this;
        ActivityInfo activityInfo = null;
        if (dms.b(stdPopActivityGroup) && (g() || f())) {
            try {
                com.taobao.android.tbabilitykit.pop.d dVar = this.f15343a;
                if (dVar != null && (b3 = dVar.b()) != null && (bVar2 = b3.f8913a) != null && bVar2.B()) {
                    com.taobao.android.tbabilitykit.pop.d dVar2 = this.f15343a;
                    if (q.a((Object) com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER, (Object) ((dVar2 == null || (b4 = dVar2.b()) == null || (bVar3 = b4.f8913a) == null) ? null : bVar3.A()))) {
                        getWindow().addFlags(2);
                    }
                }
                Point d2 = dms.d(this);
                Window window5 = getWindow();
                q.b(window5, "window");
                window5.getDecorView().findViewWithTag(AKPopContainer.CONTAINER_TAG).setBackgroundDrawable(new BitmapDrawable(dms.a(getResources(), R.drawable.mega_drawer_bg, d2.x, d2.y)));
                StringBuilder sb = new StringBuilder();
                sb.append("uri = ");
                LocalActivityManager localActivityManager = getLocalActivityManager();
                sb.append((localActivityManager == null || (currentActivity6 = localActivityManager.getCurrentActivity()) == null || (intent = currentActivity6.getIntent()) == null) ? null : intent.getData());
                AppMonitor.Counter.commit("AbilityKit", "STD_POP_IN_ROOT", sb.toString(), 1.0d);
            } catch (Throwable unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("isRootActivity = ");
                LocalActivityManager localActivityManager2 = getLocalActivityManager();
                sb2.append((localActivityManager2 == null || (currentActivity4 = localActivityManager2.getCurrentActivity()) == null || (cls = currentActivity4.getClass()) == null) ? null : cls.getName());
                TLog.loge("stdPopTag", sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("isRootActivity = ");
            LocalActivityManager localActivityManager3 = getLocalActivityManager();
            sb3.append((localActivityManager3 == null || (currentActivity5 = localActivityManager3.getCurrentActivity()) == null || (cls2 = currentActivity5.getClass()) == null) ? null : cls2.getName());
            TLog.loge("stdPopTag", sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("stdPopGroup onResume localAmsDecorView = ");
        LocalActivityManager localActivityManager4 = getLocalActivityManager();
        sb4.append((localActivityManager4 == null || (currentActivity3 = localActivityManager4.getCurrentActivity()) == null || (window4 = currentActivity3.getWindow()) == null) ? null : window4.getDecorView());
        sb4.append(" width = ");
        LocalActivityManager localActivityManager5 = getLocalActivityManager();
        sb4.append((localActivityManager5 == null || (currentActivity2 = localActivityManager5.getCurrentActivity()) == null || (window3 = currentActivity2.getWindow()) == null || (decorView4 = window3.getDecorView()) == null) ? null : Integer.valueOf(decorView4.getWidth()));
        sb4.append(" height = ");
        LocalActivityManager localActivityManager6 = getLocalActivityManager();
        sb4.append((localActivityManager6 == null || (currentActivity = localActivityManager6.getCurrentActivity()) == null || (window2 = currentActivity.getWindow()) == null || (decorView3 = window2.getDecorView()) == null) ? null : Integer.valueOf(decorView3.getHeight()));
        sb4.append(' ');
        sb4.append(" currentDecorView = ");
        Window window6 = getWindow();
        sb4.append(window6 != null ? window6.getDecorView() : null);
        sb4.append(" width = ");
        Window window7 = getWindow();
        sb4.append((window7 == null || (decorView2 = window7.getDecorView()) == null) ? null : Integer.valueOf(decorView2.getWidth()));
        sb4.append(" height = ");
        Window window8 = getWindow();
        sb4.append((window8 == null || (decorView = window8.getDecorView()) == null) ? null : Integer.valueOf(decorView.getHeight()));
        TLog.loge("stdPopTag", sb4.toString());
        if (this.h && !this.i) {
            com.taobao.android.tbabilitykit.pop.d dVar3 = this.f15343a;
            if (q.a((Object) com.taobao.android.abilitykit.ability.pop.model.c.PAD_FULL_SCREEN_DRAWER, (Object) ((dVar3 == null || (b2 = dVar3.b()) == null || (bVar = b2.f8913a) == null) ? null : bVar.A())) && dms.a((Activity) this, false) && (window = getWindow()) != null) {
                com.taobao.android.tbabilitykit.pop.d dVar4 = this.f15343a;
                com.taobao.android.abilitykit.ability.pop.model.c b5 = dVar4 != null ? dVar4.b() : null;
                if (b5 != null) {
                    com.taobao.android.abilitykit.ability.pop.model.a aVar = (com.taobao.android.abilitykit.ability.pop.model.a) b5;
                    if (aVar != null) {
                        activityInfo = aVar.f();
                    }
                    window.setBackgroundDrawable(new ColorDrawable(dms.b(activityInfo, stdPopActivityGroup)));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.model.AKNativeParams");
                }
            }
        }
        if (Build.VERSION.SDK_INT != 26 || this.g) {
            return;
        }
        dms.a((Activity) this);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT == 26 && !this.g) {
        } else {
            super.setRequestedOrientation(i);
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        e();
        super.onPause();
    }

    private final void d() {
        if (!dmr.d(this)) {
            return;
        }
        try {
            Field field = Application.class.getDeclaredField("mActivityLifecycleCallbacks");
            q.b(field, "field");
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            Object obj = field.get(getApplication());
            if (!(obj instanceof ArrayList)) {
                obj = null;
            }
            ArrayList arrayList = (ArrayList) obj;
            field.setAccessible(isAccessible);
            Iterator it = arrayList != null ? arrayList.iterator() : null;
            while (it != null && it.hasNext()) {
                Object next = it.next();
                q.b(next, "iterator.next()");
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) next;
                String name = activityLifecycleCallbacks.getClass().getName();
                q.b(name, "callBack.javaClass.name");
                if (n.b((CharSequence) name, (CharSequence) "androidx.window.extensions.embedding.SplitController$LifecycleCallbacks", false, 2, (Object) null)) {
                    TLog.loge("stdPopTag", "found SplitContainer " + activityLifecycleCallbacks);
                    this.c = activityLifecycleCallbacks;
                }
            }
            if (this.c == null || arrayList == null) {
                return;
            }
            synchronized (arrayList) {
                TLog.loge("stdPopTag", "remove SplitContainer " + x.c(arrayList).remove(this.c));
                t tVar = t.INSTANCE;
            }
        } catch (Throwable th) {
            TLog.loge("stdPopTag", "tempLifeCycleCb throwble = " + th);
        }
    }

    private final void e() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        if (dmr.d(this) && (activityLifecycleCallbacks = this.c) != null) {
            try {
                Field field = Application.class.getDeclaredField("mActivityLifecycleCallbacks");
                q.b(field, "field");
                boolean isAccessible = field.isAccessible();
                field.setAccessible(true);
                Object obj = field.get(getApplication());
                if (!(obj instanceof ArrayList)) {
                    obj = null;
                }
                ArrayList arrayList = (ArrayList) obj;
                field.setAccessible(isAccessible);
                if (arrayList != null) {
                    synchronized (activityLifecycleCallbacks) {
                        TLog.loge("stdPopTag", "add SplitContainer " + arrayList.add(activityLifecycleCallbacks));
                        this.c = null;
                        t tVar = t.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                TLog.loge("stdPopTag", "tempLifeCycleCb throwble = " + th);
            }
            TLog.loge("stdPopTag", "registerActivityLifecycleCallbacks ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void finish() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            java.lang.String r2 = "44908f9a"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            boolean r0 = r5.e
            r1 = 0
            if (r0 != 0) goto L37
            android.app.LocalActivityManager r0 = r5.getLocalActivityManager()
            if (r0 == 0) goto L22
            android.app.Activity r0 = r0.getCurrentActivity()
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 == 0) goto L37
            r5.e = r2
            android.app.LocalActivityManager r0 = r5.getLocalActivityManager()
            if (r0 == 0) goto L36
            android.app.Activity r0 = r0.getCurrentActivity()
            if (r0 == 0) goto L36
            r0.finish()
        L36:
            return
        L37:
            super.finish()
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L6b
            boolean r0 = tb.dmr.F()
            if (r0 == 0) goto L6b
            com.taobao.android.tbabilitykit.pop.d r0 = r5.f15343a
            if (r0 == 0) goto L59
            com.taobao.android.abilitykit.ability.pop.model.c r0 = r0.b()
            if (r0 == 0) goto L59
            com.taobao.android.abilitykit.ability.pop.model.b r0 = r0.f8913a
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.A()
            goto L5a
        L59:
            r0 = r1
        L5a:
            java.lang.String r2 = "padFullScreen"
            boolean r0 = kotlin.jvm.internal.q.a(r2, r0)
            if (r0 == 0) goto L6b
            int r0 = com.taobao.taobao.R.anim.mega_slide_in_left
            int r2 = com.taobao.taobao.R.anim.mega_slide_out_right
            r5.overridePendingTransition(r0, r2)
            goto L6e
        L6b:
            r5.overridePendingTransition(r3, r3)
        L6e:
            boolean r0 = tb.dmr.q()
            if (r0 == 0) goto L81
            com.taobao.android.tbabilitykit.pop.StdPopActivityGroup$b r0 = new com.taobao.android.tbabilitykit.pop.StdPopActivityGroup$b
            r0.<init>()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2 = 0
            r4 = 2
            com.alibaba.ability.e.a(r0, r2, r4, r1)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.finish():void");
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onDestroy() {
        com.taobao.android.tbabilitykit.pop.d dVar;
        com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            f.remove(this);
        } catch (NoSuchElementException unused) {
        }
        if (!this.k && (dVar = this.f15343a) != null && (a2 = dVar.a()) != null) {
            a2.a(null, false);
        }
        if (this.b != null) {
            h a3 = h.a();
            g gVar = this.b;
            q.a(gVar);
            a3.d(gVar);
            this.b = null;
        }
        if (this.d != null) {
            getApplication().unregisterActivityLifecycleCallbacks(this.d);
        }
        ContentObserver contentObserver = this.j;
        if (contentObserver != null) {
            getContentResolver().unregisterContentObserver(contentObserver);
        }
        try {
            super.onDestroy();
        } catch (Throwable th) {
            AppMonitor.Counter.commit("AbilityKit", "stdPopGroupDestroyErr", th.toString(), 1.0d);
            TLog.loge("stdPopTag", "stdPopGroup destroy error = " + th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void finishFromChild(Activity activity) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7b1c18", new Object[]{this, activity});
            return;
        }
        try {
            this.e = true;
            Object a2 = a(activity, "mResultData");
            String str = null;
            if (!(a2 instanceof Intent)) {
                a2 = null;
            }
            Intent intent = (Intent) a2;
            Object a3 = a(activity, "mResultCode");
            if (!(a3 instanceof Integer)) {
                a3 = null;
            }
            Integer num = (Integer) a3;
            StringBuilder sb = new StringBuilder();
            sb.append("finishFromChild mResultCode = ");
            sb.append(num);
            sb.append(" data = ");
            if (intent != null && (extras = intent.getExtras()) != null) {
                str = extras.toString();
            }
            sb.append(str);
            TLog.loge("stdPopTag", "stdPopTag", sb.toString());
            if (num != null) {
                i = num.intValue();
            }
            setResult(i, intent);
        } catch (Throwable unused) {
        }
        super.finishFromChild(activity);
    }

    private final Object a(Activity activity, String str) {
        if (activity == null || str == null) {
            return null;
        }
        try {
            Field field = Activity.class.getDeclaredField(str);
            q.b(field, "field");
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            Object obj = field.get(activity);
            field.setAccessible(isAccessible);
            return obj;
        } catch (Throwable unused) {
            TLog.loge("stdPopTag", "stdPopTag", "getField failed key = " + str);
            return null;
        }
    }

    private final Object a(Activity activity, String str, Intent intent) {
        if (activity == null || str == null) {
            return null;
        }
        try {
            Method method = Activity.class.getDeclaredMethod(str, Intent.class);
            q.b(method, "method");
            method.setAccessible(true);
            return method.invoke(activity, intent);
        } catch (Throwable th) {
            TLog.loge("stdPopTag", "stdPopTag", "invokeOnNewIntent err = " + th);
            return null;
        }
    }

    private final void a(Activity activity, Context context) {
        if (activity == null) {
            return;
        }
        try {
            Field field = ContextWrapper.class.getDeclaredField("mBase");
            q.b(field, "field");
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(activity, context);
            field.setAccessible(isAccessible);
        } catch (Throwable th) {
            TLog.loge("stdPopTag", "stdPopTag", "changeActBase err = " + th);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Activity currentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        LocalActivityManager localActivityManager = getLocalActivityManager();
        if ((localActivityManager != null ? localActivityManager.getCurrentActivity() : null) != null) {
            try {
                LocalActivityManager localActivityManager2 = getLocalActivityManager();
                if (localActivityManager2 != null && (currentActivity = localActivityManager2.getCurrentActivity()) != null) {
                    currentActivity.onBackPressed();
                }
            } catch (Throwable th) {
                TLog.loge("stdPopTag", "stdPopTag", "backPressErr = " + th);
                AppMonitor.Counter.commit("AbilityKit", "StdGroupBackPressErr", th.toString(), 1.0d);
            }
            if (!dmr.v()) {
                return;
            }
            super.onBackPressed();
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        LocalActivityManager localActivityManager;
        Activity currentActivity;
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if ((intent != null && intent.getBooleanExtra("fakeNewIntent", false)) || (localActivityManager = getLocalActivityManager()) == null || (currentActivity = localActivityManager.getCurrentActivity()) == null) {
            return;
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            currentActivity.getIntent().putExtras(extras);
        }
        a(currentActivity, "onNewIntent", currentActivity.getIntent());
    }

    private final boolean f() {
        Activity currentActivity;
        Class<?> cls;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            Object systemService = getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
            q.b(runningTasks, "runningTasks");
            if (!(!runningTasks.isEmpty())) {
                return false;
            }
            ComponentName componentName = runningTasks.get(0).baseActivity;
            String str = null;
            if (!q.a((Object) (componentName != null ? componentName.getClassName() : null), (Object) getClass().getName())) {
                String className = componentName != null ? componentName.getClassName() : null;
                LocalActivityManager localActivityManager = getLocalActivityManager();
                if (localActivityManager != null && (currentActivity = localActivityManager.getCurrentActivity()) != null && (cls = currentActivity.getClass()) != null) {
                    str = cls.getName();
                }
                if (!q.a((Object) className, (Object) str)) {
                    z = false;
                }
            }
            TLog.loge("stdPopTag", "isRootActivity by runningTask = " + z);
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (kotlin.jvm.internal.q.a(r1, r7 != null ? r7.getCurrentActivity() : null) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
        if (kotlin.jvm.internal.q.a(r0.get(1), r5) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("start with root localActivityManager?.currentActivity = ");
        r1 = getLocalActivityManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
        r1 = r1.getCurrentActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
        r1 = r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
        r6 = r1.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
        r0.append(r6);
        com.taobao.tao.log.TLog.loge("stdPopTag", r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean g() {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r8
            java.lang.String r2 = "5c0f972"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lc1
            java.util.List r0 = tb.dms.a()
            int r1 = r0.size()
            java.lang.String r4 = "stdPopTag"
            if (r1 != r3) goto L42
            java.lang.Object r1 = r0.get(r2)
            android.app.Activity r1 = (android.app.Activity) r1
            r5 = r8
            com.taobao.android.tbabilitykit.pop.StdPopActivityGroup r5 = (com.taobao.android.tbabilitykit.pop.StdPopActivityGroup) r5
            boolean r1 = kotlin.jvm.internal.q.a(r1, r5)
            if (r1 == 0) goto L42
            java.lang.String r0 = "start with root"
            com.taobao.tao.log.TLog.loge(r4, r0)
            return r3
        L42:
            int r1 = r0.size()
            r5 = 2
            if (r1 != r5) goto Lc1
            java.lang.Object r1 = r0.get(r2)
            android.app.Activity r1 = (android.app.Activity) r1
            r5 = r8
            com.taobao.android.tbabilitykit.pop.StdPopActivityGroup r5 = (com.taobao.android.tbabilitykit.pop.StdPopActivityGroup) r5
            boolean r1 = kotlin.jvm.internal.q.a(r1, r5)
            r6 = 0
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.get(r3)
            android.app.Activity r1 = (android.app.Activity) r1
            android.app.LocalActivityManager r7 = r8.getLocalActivityManager()
            if (r7 == 0) goto L6a
            android.app.Activity r7 = r7.getCurrentActivity()
            goto L6b
        L6a:
            r7 = r6
        L6b:
            boolean r1 = kotlin.jvm.internal.q.a(r1, r7)
            if (r1 != 0) goto L95
        L71:
            java.lang.Object r1 = r0.get(r2)
            android.app.Activity r1 = (android.app.Activity) r1
            android.app.LocalActivityManager r7 = r8.getLocalActivityManager()
            if (r7 == 0) goto L82
            android.app.Activity r7 = r7.getCurrentActivity()
            goto L83
        L82:
            r7 = r6
        L83:
            boolean r1 = kotlin.jvm.internal.q.a(r1, r7)
            if (r1 == 0) goto Lc1
            java.lang.Object r0 = r0.get(r3)
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = kotlin.jvm.internal.q.a(r0, r5)
            if (r0 == 0) goto Lc1
        L95:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start with root localActivityManager?.currentActivity = "
            r0.append(r1)
            android.app.LocalActivityManager r1 = r8.getLocalActivityManager()
            if (r1 == 0) goto Lb6
            android.app.Activity r1 = r1.getCurrentActivity()
            if (r1 == 0) goto Lb6
            java.lang.Class r1 = r1.getClass()
            if (r1 == 0) goto Lb6
            java.lang.String r6 = r1.getName()
        Lb6:
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.taobao.tao.log.TLog.loge(r4, r0)
            return r3
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.g():boolean");
    }

    @Override // tb.fmf
    public void b(String state, JSONObject jSONObject) {
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, state, jSONObject});
            return;
        }
        q.d(state, "state");
        com.taobao.android.abilitykit.ability.pop.presenter.a aVar = null;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject;
            com.taobao.android.tbabilitykit.pop.d dVar = this.f15343a;
            jSONObject2.put((JSONObject) "popId", (dVar == null || (b2 = dVar.b()) == null) ? null : b2.b);
            jSONObject2.put((JSONObject) "from", "innerPopForward");
        }
        com.taobao.android.tbabilitykit.pop.d dVar2 = this.f15343a;
        com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> a2 = dVar2 != null ? dVar2.a() : null;
        if (a2 instanceof com.taobao.android.abilitykit.ability.pop.presenter.a) {
            aVar = a2;
        }
        com.taobao.android.abilitykit.ability.pop.presenter.a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        aVar2.a(state, jSONObject);
    }

    @Override // tb.fmf
    public void a(JSONObject jSONObject) {
        IAKPopRender g;
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        com.taobao.android.tbabilitykit.pop.d dVar = this.f15343a;
        jSONObject3.put((JSONObject) "popId", (dVar == null || (b2 = dVar.b()) == null) ? null : b2.b);
        jSONObject3.put((JSONObject) "from", "innerPopForward");
        if (jSONObject != null) {
            jSONObject3.put((JSONObject) "data", (String) jSONObject);
        }
        com.taobao.android.tbabilitykit.pop.d dVar2 = this.f15343a;
        com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> a2 = dVar2 != null ? dVar2.a() : null;
        if (!(a2 instanceof com.taobao.android.abilitykit.ability.pop.presenter.a)) {
            a2 = null;
        }
        com.taobao.android.abilitykit.ability.pop.presenter.a aVar = (com.taobao.android.abilitykit.ability.pop.presenter.a) a2;
        if (aVar == null || (g = aVar.g()) == null) {
            return;
        }
        g.a(IAKPopRender.LifecycleType.CHANGE_POSITION, jSONObject2);
    }

    @Override // tb.fmf
    public void a(String state, JSONObject jSONObject) {
        IAKPopRender g;
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, state, jSONObject});
            return;
        }
        q.d(state, "state");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        com.taobao.android.tbabilitykit.pop.d dVar = this.f15343a;
        jSONObject3.put((JSONObject) "popId", (dVar == null || (b2 = dVar.b()) == null) ? null : b2.b);
        jSONObject3.put((JSONObject) "from", "innerPopForward");
        if (jSONObject != null) {
            jSONObject3.put((JSONObject) "data", (String) jSONObject);
        }
        com.taobao.android.tbabilitykit.pop.d dVar2 = this.f15343a;
        com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> a2 = dVar2 != null ? dVar2.a() : null;
        if (!(a2 instanceof com.taobao.android.abilitykit.ability.pop.presenter.a)) {
            a2 = null;
        }
        com.taobao.android.abilitykit.ability.pop.presenter.a aVar = (com.taobao.android.abilitykit.ability.pop.presenter.a) a2;
        if (aVar == null || (g = aVar.g()) == null) {
            return;
        }
        g.a(state, jSONObject2);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.taobao.android.tbabilitykit.pop.d dVar;
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        Activity currentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!dmr.B() && (dVar = this.f15343a) != null && (b2 = dVar.b()) != null && (bVar = b2.f8913a) != null && !bVar.x()) {
            try {
                LocalActivityManager localActivityManager = getLocalActivityManager();
                if (localActivityManager != null && (currentActivity = localActivityManager.getCurrentActivity()) != null) {
                    if (currentActivity.onKeyDown(i, keyEvent)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                TLog.loge("stdPopTag", "stdPopTag", "handle key down error = " + th);
                AppMonitor.Counter.commit("AbilityKit", "disPatchKeyDown2ChildError", th.toString(), 1.0d);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onRestart() {
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        TLog.loge("stdPopTag", "lifecycle onRestart " + this);
        if (!this.h || this.i) {
            return;
        }
        com.taobao.android.tbabilitykit.pop.d dVar = this.f15343a;
        if (!q.a((Object) com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER, (Object) ((dVar == null || (b2 = dVar.b()) == null || (bVar = b2.f8913a) == null) ? null : bVar.A()))) {
            return;
        }
        dms.a((Activity) this, true);
    }
}
