package com.taobao.android.abilitykit.ability.pop.presenter;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.presenter.d;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dkv;
import tb.dlh;
import tb.dlr;
import tb.dmn;
import tb.dmr;
import tb.hsv;
import tb.hsy;
import tb.kge;

/* loaded from: classes4.dex */
public final class b<PARAMS extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dlr> extends com.taobao.android.abilitykit.ability.pop.presenter.a<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f8919a;
    private hsv b;
    private boolean c;

    /* loaded from: classes4.dex */
    public static final class a implements hsv.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;
        public final /* synthetic */ com.taobao.android.abilitykit.ability.pop.model.c c;
        private boolean d;
        public final /* synthetic */ d.a e;

        public a(View view, com.taobao.android.abilitykit.ability.pop.model.c cVar, d.a aVar) {
            this.b = view;
            this.c = cVar;
            this.e = aVar;
        }

        @Override // tb.hsv.d
        public boolean a(KeyEvent e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e8cd358", new Object[]{this, e})).booleanValue();
            }
            q.d(e, "e");
            if (e.getKeyCode() != 4) {
                return false;
            }
            if (!dmr.k()) {
                if (e.getAction() == 1) {
                    if (this.c.f8913a.z()) {
                        this.e.b(null);
                    } else {
                        b.this.a((JSONObject) null, true);
                    }
                }
                return true;
            } else if (!this.d || e.getAction() != 1) {
                if (e.getAction() != 0) {
                    return true;
                }
                this.d = true;
                return true;
            } else {
                if (this.c.f8913a.z()) {
                    this.e.b(null);
                } else {
                    b.this.a((JSONObject) null, true);
                }
                return true;
            }
        }
    }

    static {
        kge.a(-1511153514);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.a
    public boolean a(PARAMS params, View container, View view, View view2, d.a listener) {
        Window window;
        String str;
        Class<?> cls;
        Class<?> cls2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34da319b", new Object[]{this, params, container, view, view2, listener})).booleanValue();
        }
        q.d(params, "params");
        q.d(container, "container");
        q.d(listener, "listener");
        if (this.c) {
            return false;
        }
        WeakReference<Context> a2 = a();
        ViewGroup viewGroup = null;
        Context context = a2 != null ? a2.get() : null;
        com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("doShowPresenter ctx : ");
        sb.append((context == null || (cls2 = context.getClass()) == null) ? null : cls2.getName());
        cVar.a("stdPopTag", sb.toString());
        boolean z = context instanceof Activity;
        if (!z) {
            IAKPopRender<PARAMS, CONTEXT> g = g();
            if (g == null || (cls = g.getClass()) == null || (str = cls.getSimpleName()) == null) {
                str = "";
            }
            dmn.a(new dlh(str, params.c()), new dkv(90001, "Ctx Not Activity"));
        }
        if (!z) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return false;
        }
        this.f8919a = container;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        float f = 0;
        if (params.f8913a.J() > f) {
            marginLayoutParams.topMargin = hsy.a(activity, params.f8913a.J());
        }
        if (params.f8913a.L() > f) {
            marginLayoutParams.bottomMargin = hsy.a(activity, params.f8913a.L());
        }
        if (params.f8913a.K() > f) {
            marginLayoutParams.leftMargin = hsy.a(activity, params.f8913a.K());
        }
        if (params.f8913a.M() > f) {
            marginLayoutParams.rightMargin = hsy.a(activity, params.f8913a.M());
        }
        if (q.a((Object) params.f8913a.n(), (Object) "activity")) {
            activity.setContentView(container, marginLayoutParams);
        } else if (params.f8913a.O() != -1) {
            View findViewById = activity.findViewById(params.f8913a.O());
            if (findViewById instanceof ViewGroup) {
                viewGroup = findViewById;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.addView(container, marginLayoutParams);
            } else {
                com.alibaba.ability.utils.c.INSTANCE.a("stdPopTag", "can't findViewById : " + params.f8913a.O());
            }
        } else {
            activity.addContentView(container, marginLayoutParams);
        }
        if (!params.f8913a.x()) {
            return true;
        }
        if (activity.getParent() == null || dmr.t()) {
            window = activity.getWindow();
        } else {
            Activity parent = activity.getParent();
            q.b(parent, "activity.parent");
            window = parent.getWindow();
        }
        q.b(window, "window");
        hsv hsvVar = new hsv(window, new a(container, params, listener));
        hsvVar.a();
        t tVar = t.INSTANCE;
        this.b = hsvVar;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (kotlin.jvm.internal.q.a((java.lang.Object) ((r3 == null || (r3 = r3.f8913a) == null) ? null : r3.A()), (java.lang.Object) com.taobao.android.abilitykit.ability.pop.model.c.PAD_FULL_SCREEN_DRAWER) == false) goto L28;
     */
    @Override // com.taobao.android.abilitykit.ability.pop.presenter.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.abilitykit.ability.pop.presenter.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r5
            java.lang.String r2 = "57a83e9"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            boolean r0 = r5.c
            if (r0 == 0) goto L17
            return
        L17:
            boolean r0 = tb.dmr.a()
            r1 = 0
            if (r0 == 0) goto L2a
            com.taobao.android.abilitykit.ability.pop.render.IAKPopRender r0 = r5.g()
            if (r0 == 0) goto L2a
            java.lang.String r3 = "std_pop_did_close"
            r0.a(r3, r1)
        L2a:
            android.view.View r0 = r5.f8919a
            if (r0 == 0) goto L61
            com.taobao.android.abilitykit.ability.pop.model.c r3 = r5.h()
            if (r3 == 0) goto L50
            boolean r3 = r3.h
            if (r3 != r2) goto L50
            com.taobao.android.abilitykit.ability.pop.model.c r3 = r5.h()
            if (r3 == 0) goto L47
            com.taobao.android.abilitykit.ability.pop.model.b r3 = r3.f8913a
            if (r3 == 0) goto L47
            java.lang.String r3 = r3.A()
            goto L48
        L47:
            r3 = r1
        L48:
            java.lang.String r4 = "padFullScreen"
            boolean r3 = kotlin.jvm.internal.q.a(r3, r4)
            if (r3 != 0) goto L61
        L50:
            android.view.ViewParent r3 = r0.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 != 0) goto L59
            goto L5a
        L59:
            r1 = r3
        L5a:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L61
            r1.removeView(r0)
        L61:
            tb.hsv r0 = r5.b
            if (r0 == 0) goto L68
            r0.b()
        L68:
            r5.c = r2
            r5.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.pop.presenter.b.b():void");
    }
}
