package com.taobao.android.abilitykit.ability.pop.render;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.q;
import tb.dle;
import tb.dlr;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class ActivityLifeCycleCbRender<P extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dlr> extends b<P, CONTEXT> implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity b;
    private Application c;

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes4.dex */
    public @interface EventType {
        public static final a Companion = a.f8934a;
        public static final String ON_CREATED = "onCreated";
        public static final String ON_DESTROYED = "onDestroyed";
        public static final String ON_PAUSED = "onPaused";
        public static final String ON_RESUMED = "onResume";
        public static final String ON_SAVE_INSTANCE_STATE = "onSaveInstanceState";
        public static final String ON_STARTED = "onStarted";
        public static final String ON_STOPPED = "onStopped";

        /* loaded from: classes4.dex */
        public static final class a {
            public static final String ON_CREATED = "onCreated";
            public static final String ON_DESTROYED = "onDestroyed";
            public static final String ON_PAUSED = "onPaused";
            public static final String ON_RESUMED = "onResume";
            public static final String ON_SAVE_INSTANCE_STATE = "onSaveInstanceState";
            public static final String ON_STARTED = "onStarted";
            public static final String ON_STOPPED = "onStopped";

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ a f8934a;

            static {
                kge.a(-1023832478);
                f8934a = new a();
            }

            private a() {
            }
        }
    }

    static {
        kge.a(1500403434);
        kge.a(-1894394539);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ActivityLifeCycleCbRender activityLifeCycleCbRender, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -994991334) {
            super.a((ActivityLifeCycleCbRender) ((dlr) objArr[0]), (dlr) ((com.taobao.android.abilitykit.ability.pop.model.c) objArr[1]), (View) objArr[2], (d) objArr[3]);
            return null;
        } else if (hashCode != 1135935699) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.dW_();
            return null;
        }
    }

    public abstract void a(String str, Bundle bundle);

    public abstract void b(CONTEXT context, P p, View view, d dVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public /* bridge */ /* synthetic */ void a(dle dleVar, com.taobao.android.abilitykit.ability.pop.model.c cVar, View view, d dVar) {
        a((ActivityLifeCycleCbRender<P, CONTEXT>) ((dlr) dleVar), (dlr) cVar, view, dVar);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b
    public void a(CONTEXT abilityRuntimeCtx, P params, View view, d callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b1a31a", new Object[]{this, abilityRuntimeCtx, params, view, callback});
            return;
        }
        q.d(abilityRuntimeCtx, "abilityRuntimeCtx");
        q.d(params, "params");
        q.d(callback, "callback");
        super.a((ActivityLifeCycleCbRender<P, CONTEXT>) abilityRuntimeCtx, (CONTEXT) params, view, callback);
        Context a2 = abilityRuntimeCtx.a();
        if (a2 instanceof Activity) {
            Activity activity = (Activity) a2;
            this.b = activity;
            this.c = activity.getApplication();
            Application application = this.c;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(this);
            }
        }
        b(abilityRuntimeCtx, params, view, callback);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.b = null;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void dW_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b500d3", new Object[]{this});
            return;
        }
        super.dW_();
        Application application = this.c;
        if (application == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        q.d(activity, "activity");
        Activity activity2 = this.b;
        if (activity2 == null || !q.a(activity2, activity)) {
            return;
        }
        a("onCreated", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        q.d(activity, "activity");
        Activity activity2 = this.b;
        if (activity2 == null || !q.a(activity2, activity)) {
            return;
        }
        a("onStarted", (Bundle) null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        q.d(activity, "activity");
        Activity activity2 = this.b;
        if (activity2 == null || !q.a(activity2, activity)) {
            return;
        }
        a("onResume", (Bundle) null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        q.d(activity, "activity");
        Activity activity2 = this.b;
        if (activity2 == null || !q.a(activity2, activity)) {
            return;
        }
        a("onPaused", (Bundle) null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        q.d(activity, "activity");
        Activity activity2 = this.b;
        if (activity2 == null || !q.a(activity2, activity)) {
            return;
        }
        a("onStopped", (Bundle) null);
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
        Activity activity2 = this.b;
        if (activity2 == null || !q.a(activity2, activity)) {
            return;
        }
        a("onSaveInstanceState", outState);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        q.d(activity, "activity");
        Activity activity2 = this.b;
        if (activity2 == null || !q.a(activity2, activity)) {
            return;
        }
        a("onDestroyed", (Bundle) null);
        Application application = this.c;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        this.b = null;
    }

    public final void finalize() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        Activity activity = this.b;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }
}
