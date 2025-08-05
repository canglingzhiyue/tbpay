package com.taobao.android.tbabilitykit.pop;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.tao.log.TLog;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.akt;
import tb.dmr;
import tb.dms;
import tb.gnv;
import tb.kge;

/* loaded from: classes6.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f15350a;
    private com.taobao.android.abilitykit.ability.pop.model.c b;
    private com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> c;
    private final Handler d;

    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Ref.IntRef c;

        public a(boolean z, Ref.IntRef intRef) {
            this.b = z;
            this.c = intRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.taobao.android.abilitykit.ability.pop.model.b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.android.abilitykit.ability.pop.model.c b = e.this.b();
            if (b != null && (bVar = b.f8913a) != null && bVar.B() && this.b) {
                Window window = e.this.a().getWindow();
                q.b(window, "window");
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.height = -1;
                attributes.width = this.c.element;
                window.setAttributes(attributes);
                window.setGravity(8388629);
                window.addFlags(32);
            }
            com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> c = e.this.c();
            if (c != null) {
                c.a((String) null);
            }
            com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> c2 = e.this.c();
            if (c2 == null) {
                return;
            }
            c2.a(-1.0f, -1.0f, false);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ActivityInfo b;

        public b(ActivityInfo activityInfo) {
            this.b = activityInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity a2;
            Window window;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!dms.a(e.this.a(), false) || (a2 = e.this.a()) == null || (window = a2.getWindow()) == null) {
            } else {
                window.setBackgroundDrawable(new ColorDrawable(dms.b(this.b, e.this.a())));
            }
        }
    }

    static {
        kge.a(-783631679);
        kge.a(-2092709563);
    }

    public e(Activity act, com.taobao.android.abilitykit.ability.pop.model.c cVar, com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> dVar) {
        q.d(act, "act");
        this.f15350a = act;
        this.b = cVar;
        this.c = dVar;
        this.d = new Handler(Looper.getMainLooper());
    }

    public final Activity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this}) : this.f15350a;
    }

    public final com.taobao.android.abilitykit.ability.pop.model.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.abilitykit.ability.pop.model.c) ipChange.ipc$dispatch("b8578950", new Object[]{this}) : this.b;
    }

    public final com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.abilitykit.ability.pop.presenter.d) ipChange.ipc$dispatch("8759e151", new Object[]{this}) : this.c;
    }

    public void a(int i, Configuration configuration) {
        LocalActivityManager localActivityManager;
        Activity currentActivity;
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        com.taobao.android.abilitykit.ability.pop.model.b bVar2;
        LocalActivityManager localActivityManager2;
        Activity currentActivity2;
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14698875", new Object[]{this, new Integer(i), configuration});
            return;
        }
        q.d(configuration, "configuration");
        Activity activity = this.f15350a;
        boolean z = (activity instanceof ActivityGroup) || q.a((Object) activity.getClass().getName(), (Object) "com.taobao.android.tbabilitykit.pop.StdPopContainerActivity");
        ActivityInfo activityInfo = null;
        if (i != 2) {
            if (i != 1 || !z) {
                return;
            }
            int a2 = gnv.a(this.f15350a, configuration.screenWidthDp);
            com.taobao.android.abilitykit.ability.pop.model.c cVar = this.b;
            if (cVar != null && (bVar = cVar.f8913a) != null && bVar.B() && z) {
                Window window2 = this.f15350a.getWindow();
                q.b(window2, "window");
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.height = -1;
                attributes.width = a2;
                window2.setAttributes(attributes);
                window2.setGravity(81);
            }
            int e = h.a().e(this.f15350a);
            Activity activity2 = this.f15350a;
            if (!(activity2 instanceof ActivityGroup)) {
                activity2 = null;
            }
            ActivityGroup activityGroup = (ActivityGroup) activity2;
            Window window3 = (activityGroup == null || (localActivityManager = activityGroup.getLocalActivityManager()) == null || (currentActivity = localActivityManager.getCurrentActivity()) == null) ? null : currentActivity.getWindow();
            WindowManager.LayoutParams attributes2 = window3 != null ? window3.getAttributes() : null;
            if (attributes2 != null) {
                attributes2.width = a2;
            }
            if (attributes2 != null) {
                attributes2.height = e;
            }
            if (window3 != null) {
                window3.setAttributes(attributes2);
            }
            com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> dVar = this.c;
            if (dVar != null) {
                dVar.a((String) null);
            }
            com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> dVar2 = this.c;
            if (dVar2 != null) {
                dVar2.a(-1.0f, -1.0f, false);
            }
            com.taobao.android.abilitykit.ability.pop.model.c cVar2 = this.b;
            if (!(cVar2 instanceof com.taobao.android.abilitykit.ability.pop.model.a)) {
                cVar2 = null;
            }
            com.taobao.android.abilitykit.ability.pop.model.a aVar = (com.taobao.android.abilitykit.ability.pop.model.a) cVar2;
            if (aVar != null) {
                activityInfo = aVar.f();
            }
            if (!dms.a(activityInfo, this.f15350a)) {
                this.d.postDelayed(new b(activityInfo), 20L);
            }
            TLog.loge("stdPopTag", "stdPopTag", "ORIENTATION_PORTRAIT width = " + a2 + " height = " + e);
            return;
        }
        Activity activity3 = this.f15350a;
        if (activity3 != null && (window = activity3.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dms.a(this.f15350a, true);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = gnv.a(this.f15350a, configuration.screenWidthDp);
        if (dms.a((Context) this.f15350a, false)) {
            intRef.element /= 2;
        }
        int e2 = h.a().e(this.f15350a);
        Activity activity4 = this.f15350a;
        if (!(activity4 instanceof ActivityGroup)) {
            activity4 = null;
        }
        ActivityGroup activityGroup2 = (ActivityGroup) activity4;
        Window window4 = (activityGroup2 == null || (localActivityManager2 = activityGroup2.getLocalActivityManager()) == null || (currentActivity2 = localActivityManager2.getCurrentActivity()) == null) ? null : currentActivity2.getWindow();
        WindowManager.LayoutParams attributes3 = window4 != null ? window4.getAttributes() : null;
        if (attributes3 != null) {
            attributes3.width = intRef.element;
        }
        if (attributes3 != null) {
            attributes3.height = e2;
        }
        if (window4 != null) {
            window4.setAttributes(attributes3);
        }
        if (dmr.F()) {
            long E = dmr.E();
            if (akt.a() == 2) {
                E += 50;
            }
            this.d.postDelayed(new a(z, intRef), E);
        } else {
            com.taobao.android.abilitykit.ability.pop.model.c cVar3 = this.b;
            if (cVar3 != null && (bVar2 = cVar3.f8913a) != null && bVar2.B() && z) {
                Window window5 = this.f15350a.getWindow();
                q.b(window5, "window");
                WindowManager.LayoutParams attributes4 = window5.getAttributes();
                attributes4.height = -1;
                attributes4.width = intRef.element;
                window5.setAttributes(attributes4);
                window5.setGravity(8388629);
                window5.addFlags(32);
            }
            com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> dVar3 = this.c;
            if (dVar3 != null) {
                dVar3.a((String) null);
            }
            com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> dVar4 = this.c;
            if (dVar4 != null) {
                dVar4.a(-1.0f, -1.0f, false);
            }
        }
        TLog.loge("stdPopTag", "stdPopTag", "ORIENTATION_LANDSCAPE width = " + intRef.element + " height = " + e2);
    }
}
