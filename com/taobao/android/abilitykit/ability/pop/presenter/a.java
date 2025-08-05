package com.taobao.android.abilitykit.ability.pop.presenter;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.presenter.d;
import com.taobao.android.abilitykit.ability.pop.render.AKPopContainer;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.c;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dle;
import tb.dlr;
import tb.dmm;
import tb.dms;
import tb.kge;
import tb.rul;

/* loaded from: classes4.dex */
public abstract class a<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dlr> implements com.taobao.android.abilitykit.ability.pop.presenter.d<PARAMS, CONTEXT>, c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0342a Companion;
    private static b i;

    /* renamed from: a  reason: collision with root package name */
    private d.a f8915a;
    private com.taobao.android.abilitykit.ability.pop.render.c<PARAMS, CONTEXT> b;
    private IAKPopRender<PARAMS, CONTEXT> c;
    private JSONObject d;
    private String e;
    private WeakReference<Context> f;
    private CONTEXT g;
    private PARAMS h;
    private Application.ActivityLifecycleCallbacks j;

    @JvmStatic
    public static final boolean a(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("564cf20a", new Object[]{context, str, jSONObject})).booleanValue() : Companion.a(context, str, jSONObject);
    }

    public abstract boolean a(PARAMS params, View view, View view2, View view3, d.a aVar);

    public abstract void b();

    public static final /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1add8e2e", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ dlr c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlr) ipChange.ipc$dispatch("2dc7f96c", new Object[]{aVar}) : aVar.g;
    }

    public static final /* synthetic */ b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8d506ab8", new Object[0]) : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.presenter.d
    public /* bridge */ /* synthetic */ boolean a(dle dleVar, com.taobao.android.abilitykit.ability.pop.model.c cVar, View view, int i2) {
        return a((a<PARAMS, CONTEXT>) ((dlr) dleVar), (dlr) cVar, view, i2);
    }

    public final IAKPopRender<PARAMS, CONTEXT> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAKPopRender) ipChange.ipc$dispatch("88b6f7e5", new Object[]{this}) : this.c;
    }

    public final WeakReference<Context> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("989ead36", new Object[]{this}) : this.f;
    }

    public final PARAMS h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PARAMS) ipChange.ipc$dispatch("b05188d6", new Object[]{this}) : this.h;
    }

    public final boolean a(CONTEXT akContext, PARAMS params, View view, int i2) {
        Context a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2f57a7e", new Object[]{this, akContext, params, view, new Integer(i2)})).booleanValue();
        }
        q.d(akContext, "akContext");
        q.d(params, "params");
        this.e = params.b;
        this.g = akContext;
        if (!(akContext.a() instanceof Activity) && (a2 = dms.a(akContext.g())) != null) {
            akContext.a(a2);
        }
        Context a3 = akContext.a();
        if (a3 == null) {
            return false;
        }
        this.f = new WeakReference<>(a3);
        this.h = params;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        b a4 = C0342a.a(Companion, a3);
        a<?, ?> a5 = a4.a(params.b);
        if (a5 != null) {
            a5.a((JSONObject) null, false);
        }
        AKPopContainer aKPopContainer = this.b;
        if (aKPopContainer == null) {
            aKPopContainer = new AKPopContainer(a3);
            this.b = aKPopContainer;
        }
        IAKPopRender<PARAMS, CONTEXT> iAKPopRender = this.c;
        q.a(iAKPopRender);
        ViewGroup containerView = aKPopContainer.onCreateView(akContext, params, view, this, iAKPopRender);
        q.b(containerView, "containerView");
        booleanRef.element = a(params, containerView, akContext.g(), view, new c(booleanRef, params, akContext, view, a4, a3));
        if (booleanRef.element) {
            a4.a((a<?, ?>) this);
            a(false);
            if (a3 instanceof Activity) {
                this.j = new d(booleanRef, params, akContext, view, a4, a3);
                ((Activity) a3).getApplication().registerActivityLifecycleCallbacks(this.j);
            }
        }
        return booleanRef.element;
    }

    /* loaded from: classes4.dex */
    public static final class c implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.c b;
        public final /* synthetic */ dlr c;
        public final /* synthetic */ View d;
        public final /* synthetic */ b e;
        public final /* synthetic */ Ref.BooleanRef f;
        public final /* synthetic */ Context g;

        public c(Ref.BooleanRef booleanRef, com.taobao.android.abilitykit.ability.pop.model.c cVar, dlr dlrVar, View view, b bVar, Context context) {
            this.f = booleanRef;
            this.b = cVar;
            this.c = dlrVar;
            this.d = view;
            this.e = bVar;
            this.g = context;
        }

        @Override // com.taobao.android.abilitykit.ability.pop.presenter.d.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                a.this.c();
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.presenter.d.a
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            } else {
                a.this.f();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.BooleanRef b;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.c c;
        public final /* synthetic */ dlr d;
        public final /* synthetic */ View e;
        public final /* synthetic */ b f;
        public final /* synthetic */ Context g;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                q.d(activity, "activity");
            }
        }

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

        public d(Ref.BooleanRef booleanRef, com.taobao.android.abilitykit.ability.pop.model.c cVar, dlr dlrVar, View view, b bVar, Context context) {
            this.b = booleanRef;
            this.c = cVar;
            this.d = dlrVar;
            this.e = view;
            this.f = bVar;
            this.g = context;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            q.d(activity, "activity");
            com.alibaba.ability.utils.c.INSTANCE.a("stdPopTag", "onStdPopActivityDestroyed");
            dlr c = a.c(a.this);
            if (!q.a(activity, c != null ? c.a() : null)) {
                return;
            }
            try {
                com.alibaba.ability.utils.c.INSTANCE.a("stdPopTag", "onActivityDestroyed release pop");
                a.this.c();
            } catch (Throwable th) {
                com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
                cVar.a("stdPopTag", "onDismissed error when activity destroy: " + dmm.a(th));
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.j;
        if (activityLifecycleCallbacks != null) {
            com.alibaba.ability.utils.c.INSTANCE.a("stdPopTag", "onDismissed unregisterActivityLifecycleCallbacks");
            CONTEXT context = this.g;
            Context a2 = context != null ? context.a() : null;
            if (a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) a2).getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        if (this.e == null) {
            return;
        }
        CONTEXT context2 = this.g;
        Context a3 = context2 != null ? context2.a() : null;
        C0342a.a(Companion, a3).a(this.e);
        com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
        cVar.a("stdPopTag", "remove popId after = " + this.e + " popStack size = " + C0342a.a(Companion, a3).a());
        a(true);
        d.a aVar = this.f8915a;
        if (aVar != null) {
            aVar.a(this.d);
        }
        IAKPopRender<PARAMS, CONTEXT> iAKPopRender = this.c;
        if (iAKPopRender != null) {
            iAKPopRender.dW_();
        }
        this.e = null;
        PARAMS params = this.h;
        if (params == null || !params.d() || !(a3 instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) a3;
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    public final void a(String state, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, state, jSONObject});
            return;
        }
        q.d(state, "state");
        C0342a.a(Companion, (Context) null).a(new AKBasePopPresenter$notifyPopWindowStateChanged$1(state, jSONObject));
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.c<PARAMS, CONTEXT> cVar = this.b;
        if (cVar != null && cVar.shouldIgnoreNotifyLevelChange()) {
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        C0342a.a(Companion, (Context) null).a(new AKBasePopPresenter$notifyPopLevelChange$1(intRef, z, booleanRef));
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d.a aVar = this.f8915a;
        if (aVar == null) {
            return;
        }
        aVar.b(this.d);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.c.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.d
    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        this.d = jSONObject;
        if (z) {
            com.taobao.android.abilitykit.ability.pop.render.c<PARAMS, CONTEXT> cVar = this.b;
            if (cVar == null) {
                return;
            }
            cVar.doDismissAnimation();
            return;
        }
        b();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.d
    public void a(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ee156c", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.c<PARAMS, CONTEXT> cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.changeSize(f, f2, z);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.c<PARAMS, CONTEXT> cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.enableCorner(z);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.d
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.android.abilitykit.ability.pop.render.c<PARAMS, CONTEXT> cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.changeGravity(str);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.d
    public void a(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498dbe32", new Object[]{this, aVar});
        } else {
            this.f8915a = aVar;
        }
    }

    public final void a(IAKPopRender<PARAMS, CONTEXT> render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a805f", new Object[]{this, render});
            return;
        }
        q.d(render, "render");
        this.c = render;
    }

    /* renamed from: com.taobao.android.abilitykit.ability.pop.presenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0342a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1965445388);
        }

        private C0342a() {
        }

        public /* synthetic */ C0342a(o oVar) {
            this();
        }

        public static final /* synthetic */ b a(C0342a c0342a, Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("413df05f", new Object[]{c0342a, context}) : c0342a.a(context);
        }

        @JvmStatic
        public final boolean a(Context context, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("564cf20a", new Object[]{this, context, str, jSONObject})).booleanValue();
            }
            a<?, ?> b = a(context).b(str);
            if (b == null) {
                return false;
            }
            b.a(jSONObject, true);
            return true;
        }

        @JvmStatic
        public final boolean a(Context context, String str, JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("73520192", new Object[]{this, context, str, jSONObject, new Boolean(z)})).booleanValue();
            }
            a<?, ?> b = a(context).b(str);
            if (b == null) {
                return false;
            }
            b.a(jSONObject, z);
            return true;
        }

        @JvmStatic
        public final a<?, ?> a(Context context, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9a4febb4", new Object[]{this, context, str}) : a(context).b(str);
        }

        private final b a(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a84298ac", new Object[]{this, context}) : a.e();
        }
    }

    static {
        kge.a(1741564588);
        kge.a(-253567536);
        kge.a(-510343284);
        Companion = new C0342a(null);
        i = new b();
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LinkedList<a<?, ?>> f8916a = new LinkedList<>();

        static {
            kge.a(876386612);
        }

        public final void a(a<?, ?> p) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ffa0b2", new Object[]{this, p});
                return;
            }
            q.d(p, "p");
            this.f8916a.addFirst(p);
        }

        public final a<?, ?> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e2362bbc", new Object[]{this, str});
            }
            if (str == null) {
                return this.f8916a.pop();
            }
            a<?, ?> b = b(str);
            if (b == null) {
                return null;
            }
            this.f8916a.remove(b);
            return b;
        }

        public final a<?, ?> b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e304aa3d", new Object[]{this, str});
            }
            if (str == null && (!this.f8916a.isEmpty())) {
                return this.f8916a.peek();
            }
            for (a<?, ?> aVar : this.f8916a) {
                if (q.a((Object) a.a(aVar), (Object) str)) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(rul<? super a<?, ?>, t> block) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdc03baf", new Object[]{this, block});
                return;
            }
            q.d(block, "block");
            for (Object obj : this.f8916a) {
                block.mo2421invoke(obj);
            }
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f8916a.size();
        }
    }
}
