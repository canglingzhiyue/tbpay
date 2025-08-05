package com.alibaba.triver.triver_shop.newShop.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.container.TriverFragment;
import com.alibaba.triver.kit.api.appmonitor.LaunchMonitorData;
import com.alibaba.triver.kit.api.utils.AppManagerUtils;
import com.alibaba.triver.kit.api.utils.TRiverUrlUtils;
import com.alibaba.triver.triver_render.render.b;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.preload.c;
import com.alibaba.triver.triver_shop.web.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public final class NewMiniAppContentRender extends com.alibaba.triver.triver_shop.newShop.view.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.g f3889a;
    private final Context b;
    private final Fragment c;
    private final kotlin.d d;
    private FrameLayout e;
    private Fragment f;
    private final ArrayList<Runnable> g;
    private boolean h;
    private boolean i;
    private final a j;
    private View k;

    /* loaded from: classes3.dex */
    public final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewMiniAppContentRender f3895a;

        static {
            kge.a(2029639622);
            kge.a(823775072);
        }

        public a(NewMiniAppContentRender this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3895a = this$0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements TriverFragment.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final void a(String str, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
                return;
            }
            ceg.a aVar = ceg.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("NativeShop render Error onMiniAppError : code = ");
            sb.append((Object) str);
            sb.append(", msg = ");
            sb.append((Object) str2);
            sb.append(", extra = ");
            sb.append((Object) (map == null ? null : com.alibaba.triver.triver_shop.newShop.ext.b.b(map)));
            aVar.b(sb.toString());
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new NewMiniAppContentRender$addShowErrorListener$1$1(NewMiniAppContentRender.this, str, str2, map));
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements RVMain.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public final void a(Fragment fragment) {
            Lifecycle lifecycle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
                return;
            }
            NewMiniAppContentRender.a(NewMiniAppContentRender.this, fragment);
            if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
                lifecycle.addObserver(new FragmentLifeCycleObserver(NewMiniAppContentRender.this));
            }
            NewMiniAppContentRender.a(NewMiniAppContentRender.this);
            NewMiniAppContentRender.b(NewMiniAppContentRender.this);
        }
    }

    static {
        kge.a(1435552540);
    }

    public static /* synthetic */ Object ipc$super(NewMiniAppContentRender newMiniAppContentRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 96532846:
                super.g();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ void a(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25c533d", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.q();
        }
    }

    public static final /* synthetic */ void a(NewMiniAppContentRender newMiniAppContentRender, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15835915", new Object[]{newMiniAppContentRender, fragment});
        } else {
            newMiniAppContentRender.f = fragment;
        }
    }

    public static final /* synthetic */ void a(NewMiniAppContentRender newMiniAppContentRender, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b0f194", new Object[]{newMiniAppContentRender, str, str2, map});
        } else {
            newMiniAppContentRender.a(str, str2, map);
        }
    }

    public static final /* synthetic */ void b(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd4c5c", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.r();
        }
    }

    public static final /* synthetic */ void c(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273e457b", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.p();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.g d(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.g) ipChange.ipc$dispatch("c009b788", new Object[]{newMiniAppContentRender}) : newMiniAppContentRender.f3889a;
    }

    public static final /* synthetic */ void e(NewMiniAppContentRender newMiniAppContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2037b9", new Object[]{newMiniAppContentRender});
        } else {
            newMiniAppContentRender.t();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMiniAppContentRender(com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel, Context context, Fragment outFragment) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(outFragment, "outFragment");
        this.f3889a = tabBarItemDataModel;
        this.b = context;
        this.c = outFragment;
        this.d = kotlin.e.a(new NewMiniAppContentRender$rootLayout$2(this));
        this.g = new ArrayList<>();
        this.j = new a(this);
        ceg.Companion.b("use new mini app content render");
    }

    private final FrameLayout n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("310659c4", new Object[]{this}) : (FrameLayout) this.d.getValue();
    }

    private final void o() {
        com.alibaba.triver.triver_shop.newShop.data.d g;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.i) {
        } else {
            this.i = true;
            Bundle bundle = null;
            this.k = LayoutInflater.from(this.b).inflate(R.layout.view_fragment_continer, (ViewGroup) null);
            View view = this.k;
            this.e = view == null ? null : (FrameLayout) view.findViewById(R.id.view_inner_fragment_container);
            String h = this.f3889a.h();
            if (h == null) {
                return;
            }
            String i = com.alibaba.triver.kit.api.utils.m.i(com.alibaba.triver.kit.api.utils.m.g(h));
            if (TRiverUrlUtils.c(h) && (g = this.f3889a.g()) != null) {
                Map d2 = TRiverUrlUtils.d(h);
                if (d2 != null) {
                    bundle = com.alibaba.triver.triver_shop.newShop.ext.b.a(d2);
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("ori_url", h);
                AppManagerUtils.setSessionId(i, bundle2);
                com.alibaba.triver.triver_shop.preload.c.a(this.f3889a.g(), g.X(), d2, bundle2, this.j, false);
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("navigationBarTextStyle", com.taobao.android.weex_framework.util.a.ATOM_EXT_black);
            bundle3.putBoolean("enableWebViewCompatInViewPager", true);
            bundle3.putString("disableBrandZoneTitleBar", "true");
            bundle3.putInt("subPageContainerId", R.id.shop_view_auth_page_new);
            if (this.f3889a.o()) {
                com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f3889a.g();
                if (g2 == null || !g2.ap()) {
                    z = false;
                }
                if (z) {
                    bundle3.putInt("backgroundColor", -16777216);
                }
            }
            AppManagerUtils.setSessionId(i, bundle3);
            if (cen.Companion.X()) {
                com.alibaba.triver.triver_shop.newShop.ext.l.a(this.b);
            }
            View view2 = this.k;
            if (view2 != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(n(), view2);
            }
            com.alibaba.triver.e.a(this.b, Uri.parse(h), bundle3, 0, new d());
        }
    }

    /* loaded from: classes3.dex */
    public final class FragmentLifeCycleObserver implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NewMiniAppContentRender f3890a;
        private boolean b;

        static {
            kge.a(-930087896);
            kge.a(2139684418);
        }

        public FragmentLifeCycleObserver(NewMiniAppContentRender this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3890a = this$0;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else if (this.b) {
            } else {
                this.b = true;
                NewMiniAppContentRender.c(this.f3890a);
                App a2 = this.f3890a.a();
                JSONObject jSONObject = null;
                if (a2 != null) {
                    com.alibaba.triver.triver_shop.newShop.data.d g = NewMiniAppContentRender.d(this.f3890a).g();
                    a2.putStringValue(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ENABLE_NEW_START_AC_LOGIC, g == null ? null : Boolean.valueOf(g.f()).toString());
                }
                App a3 = this.f3890a.a();
                if (a3 != null) {
                    com.alibaba.triver.triver_shop.newShop.data.d g2 = NewMiniAppContentRender.d(this.f3890a).g();
                    if (g2 != null) {
                        jSONObject = g2.aa();
                    }
                    a3.putJsonValue("shopFetchData", jSONObject);
                }
                NewMiniAppContentRender.e(this.f3890a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        com.alibaba.triver.triver_shop.newShop.data.d g = this.f3889a.g();
        objectRef.element = g == null ? 0 : g.n(this.f3889a.f());
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f3889a.g();
        if (g2 != null && g2.an()) {
            com.alibaba.triver.triver_shop.web.a aVar = (com.alibaba.triver.triver_shop.web.a) objectRef.element;
            if (aVar != null) {
                aVar.a(true);
            }
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d g3 = this.f3889a.g();
            if (g3 != null && g3.t()) {
                z = true;
            }
            if (z) {
                com.alibaba.triver.triver_shop.web.a aVar2 = (com.alibaba.triver.triver_shop.web.a) objectRef.element;
                if (aVar2 != null) {
                    aVar2.a(true);
                }
            } else {
                com.alibaba.triver.triver_shop.web.a aVar3 = (com.alibaba.triver.triver_shop.web.a) objectRef.element;
                if (aVar3 != null) {
                    aVar3.a(kotlin.jvm.internal.q.a((Object) this.f3889a.f(), (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX));
                }
            }
        }
        App a2 = a();
        if (a2 == null) {
            return;
        }
        a2.setData(com.alibaba.triver.triver_render.render.b.class, new c(objectRef));
    }

    /* loaded from: classes3.dex */
    public static final class c implements com.alibaba.triver.triver_render.render.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<com.alibaba.triver.triver_shop.web.a> f3897a;

        /* loaded from: classes3.dex */
        public static final class a implements a.InterfaceC0159a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b.a f3898a;

            public a(b.a aVar) {
                this.f3898a = aVar;
            }

            @Override // com.alibaba.triver.triver_shop.web.a.InterfaceC0159a
            public boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                b.a aVar = this.f3898a;
                if (aVar != null) {
                    return aVar.a();
                }
                return false;
            }
        }

        public c(Ref.ObjectRef<com.alibaba.triver.triver_shop.web.a> objectRef) {
            this.f3897a = objectRef;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            com.alibaba.triver.triver_shop.web.a aVar = this.f3897a.element;
            if (aVar != null) {
                return aVar.c();
            }
            return false;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.web.a aVar = this.f3897a.element;
            if (aVar == null) {
                return;
            }
            aVar.b();
        }

        public void a(b.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79490eb", new Object[]{this, aVar});
                return;
            }
            com.alibaba.triver.triver_shop.web.a aVar2 = this.f3897a.element;
            if (aVar2 == null) {
                return;
            }
            aVar2.a(new a(aVar));
        }
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        TriverFragment triverFragment = this.f;
        if (!(triverFragment instanceof TriverFragment)) {
            return;
        }
        triverFragment.setShowErrorCallback(new b());
    }

    private final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        String l = this.f3889a.l();
        if (l != null) {
            if (cen.Companion.R()) {
                ShopWrapWebView shopWrapWebView = new ShopWrapWebView(this.b);
                shopWrapWebView.setEnableCompatInViewPager(true);
                shopWrapWebView.render(l);
                com.alibaba.triver.triver_shop.newShop.ext.o.a(n(), shopWrapWebView);
            }
            ceg.a aVar = ceg.Companion;
            aVar.b(((Object) this.f3889a.f()) + "_onMiniAppErrorDowngradeToH5 , url = " + l);
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.f3889a.g();
        if (g != null) {
            g.b(kotlin.jvm.internal.q.a(this.f3889a.f(), (Object) "_onMiniAppErrorDowngradeToH5"), Long.valueOf(System.currentTimeMillis()));
        }
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f3889a.g();
        if (g2 == null) {
            return;
        }
        String a2 = kotlin.jvm.internal.q.a(this.f3889a.f(), (Object) "_onMiniAppErrorInfo");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = kotlin.j.a("code", str);
        pairArr[1] = kotlin.j.a("msg", str2);
        pairArr[2] = kotlin.j.a("extra", map == null ? null : com.alibaba.triver.triver_shop.newShop.ext.b.b(map));
        g2.b(a2, com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr));
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(this.c)) {
            s();
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new NewMiniAppContentRender$addFragmentSafely$1(this));
        }
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            return;
        }
        this.c.getChildFragmentManager().beginTransaction().add(frameLayout.getId(), this.f).commitAllowingStateLoss();
        this.h = true;
    }

    private final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.g.clear();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        u();
    }

    public final App a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (App) ipChange.ipc$dispatch("a64ba3c2", new Object[]{this});
        }
        TriverFragment triverFragment = this.f;
        if (!(triverFragment instanceof TriverFragment)) {
            return null;
        }
        return triverFragment.getApp();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.j(n());
        return n();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        try {
            Result.a aVar = Result.Companion;
            Fragment fragment = this.f;
            if (fragment != null) {
                this.c.getChildFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
            }
            this.f = null;
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a(m2374exceptionOrNullimpl);
        }
        this.i = false;
        this.h = false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        o();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        u();
    }

    private final void u() {
        t tVar;
        LaunchMonitorData b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.f3889a.g();
        if (g == null) {
            return;
        }
        String f = this.f3889a.f();
        try {
            Result.a aVar = Result.Companion;
            App a2 = a();
            if (a2 != null && (b2 = com.alibaba.triver.kit.api.appmonitor.a.b(a2)) != null) {
                Map data = b2.getData();
                kotlin.jvm.internal.q.b(data, "launchMonitorData.data");
                for (Map.Entry entry : data.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) f);
                    sb.append('_');
                    sb.append(entry.getKey());
                    g.b(sb.toString(), entry.getValue());
                    if (kotlin.jvm.internal.q.a(entry.getKey(), (Object) "uc_t2_time")) {
                        a(entry.getValue());
                    }
                }
                JSONObject performanceMarks = b2.getPerformanceMarks();
                kotlin.jvm.internal.q.b(performanceMarks, "launchMonitorData.performanceMarks");
                for (Map.Entry<String, Object> entry2 : performanceMarks.entrySet()) {
                    g.b("js_" + ((Object) f) + '_' + ((Object) entry2.getKey()), entry2.getValue());
                }
            }
            Uri parse = Uri.parse(this.f3889a.h());
            String queryParameter = parse.getQueryParameter(com.taobao.themis.kernel.i.APP_ID);
            if (queryParameter != null) {
                g.b(kotlin.jvm.internal.q.a(this.f3889a.f(), (Object) "_appId"), queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("templateId");
            if (queryParameter2 == null) {
                tVar = null;
            } else {
                g.b(kotlin.jvm.internal.q.a(this.f3889a.f(), (Object) "_templateId"), queryParameter2);
                tVar = t.INSTANCE;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }
}
