package com.taobao.search.refactor;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.sf.newsearch.widgets.NSSceneHeaderMuiseWidget;
import com.taobao.search.sf.newsearch.widgets.NSSceneHeaderWeexWidget;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import tb.htd;
import tb.hte;
import tb.htp;
import tb.imn;
import tb.inx;
import tb.ipq;
import tb.irp;
import tb.irq;
import tb.iru;
import tb.ise;
import tb.itd;
import tb.itn;
import tb.ito;
import tb.iuk;
import tb.ium;
import tb.kge;
import tb.npe;
import tb.npf;
import tb.nph;
import tb.ntj;
import tb.qur;

/* loaded from: classes7.dex */
public class f extends com.taobao.android.meta.srp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion;
    private static boolean j;
    public ise<irp, ? extends itn> h;
    private boolean i;

    public f(imn core) {
        kotlin.jvm.internal.q.c(core, "core");
        u(r.e("restrainFirstScroll"));
        f(ai());
        k(AnonymousClass1.INSTANCE);
        boolean z = true;
        l(true);
        b(0);
        a(new com.taobao.search.refactor.b());
        i(AnonymousClass9.INSTANCE);
        a(AnonymousClass10.INSTANCE);
        c(AnonymousClass11.INSTANCE);
        d(AnonymousClass12.INSTANCE);
        m(AnonymousClass13.INSTANCE);
        n(AnonymousClass14.INSTANCE);
        b(AnonymousClass15.INSTANCE);
        f(AnonymousClass16.INSTANCE);
        if (j) {
            core.h().a(ListStyle.LIST, SrpStateCell.class, com.taobao.android.meta.srp.ui.list.b.Companion.a());
            core.h().a(ListStyle.WATERFALL, SrpStateCell.class, com.taobao.android.meta.srp.ui.list.b.Companion.a());
            j = false;
        }
        e(AnonymousClass2.INSTANCE);
        o(r.W());
        o(AnonymousClass3.INSTANCE);
        a(1);
        l(AnonymousClass4.INSTANCE);
        d(!com.taobao.search.common.util.n.INSTANCE.g());
        d(r.D());
        a(new ntj());
        g(AnonymousClass5.INSTANCE);
        c(com.taobao.search.common.a.b);
        g(r.bM());
        j(r.bT());
        a(new htd() { // from class: com.taobao.search.refactor.f.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final Set<String> f19305a = r.bZ();

            @Override // tb.htd
            public boolean a(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str != null && u.h() && this.f19305a.contains(str);
            }
        });
        k(r.cb());
        this.h = AnonymousClass7.INSTANCE;
        q(true);
        r((!r.bw() || !r.e("layoutListFirst")) ? false : z);
    }

    public final ise<irp, ? extends itn> ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("bb9c089a", new Object[]{this});
        }
        ise<irp, ? extends itn> iseVar = this.h;
        if (iseVar == null) {
            kotlin.jvm.internal.q.b("topHeaderMod");
        }
        return iseVar;
    }

    /* renamed from: com.taobao.search.refactor.f$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1<PARAMS, RESULT> implements ise<Void, inx.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // tb.ise
        public final com.taobao.search.sf.b a(Void r4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.b) ipChange.ipc$dispatch("4664bbbc", new Object[]{this, r4}) : new com.taobao.search.sf.b();
        }
    }

    /* renamed from: com.taobao.search.refactor.f$9  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass9<PARAMS, RESULT> implements ise<irq, com.taobao.android.meta.structure.childpage.g> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        @Override // tb.ise
        public final com.taobao.search.refactor.d a(irq irqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.search.refactor.d) ipChange.ipc$dispatch("b07e2a", new Object[]{this, irqVar});
            }
            Activity activity = irqVar.c;
            kotlin.jvm.internal.q.a((Object) activity, "it.activity");
            ium iumVar = irqVar.d;
            kotlin.jvm.internal.q.a((Object) iumVar, "it.parent");
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = irqVar.e;
            if (iruVar != null) {
                return new com.taobao.search.refactor.d(activity, iumVar, iruVar, irqVar.f, irqVar.g);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
        }
    }

    /* renamed from: com.taobao.search.refactor.f$10  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass10<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        @Override // tb.ise
        public final com.taobao.search.musie.r a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.musie.r) ipChange.ipc$dispatch("fa5e3e49", new Object[]{this, ipqVar}) : new com.taobao.search.musie.r(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$11  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass11<PARAMS, RESULT> implements ise<irp, itn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        @Override // tb.ise
        public final com.taobao.search.musie.q a(irp irpVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.musie.q) ipChange.ipc$dispatch("2383230d", new Object[]{this, irpVar}) : new com.taobao.search.musie.q(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$12  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass12<PARAMS, RESULT> implements ise<irp, ito> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        @Override // tb.ise
        public final com.taobao.search.sf.widgets.list.listcell.weex.e a(irp irpVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.list.listcell.weex.e) ipChange.ipc$dispatch("320cb3a5", new Object[]{this, irpVar}) : new com.taobao.search.sf.widgets.list.listcell.weex.e(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$13  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass13<PARAMS, RESULT> implements ise<irp, itn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        @Override // tb.ise
        public final NSSceneHeaderMuiseWidget a(irp irpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NSSceneHeaderMuiseWidget) ipChange.ipc$dispatch("6296c450", new Object[]{this, irpVar});
            }
            Activity activity = irpVar.c;
            kotlin.jvm.internal.q.a((Object) activity, "it.activity");
            ium iumVar = irpVar.d;
            kotlin.jvm.internal.q.a((Object) iumVar, "it.parent");
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = irpVar.e;
            kotlin.jvm.internal.q.a((Object) iruVar, "it.modelAdapter");
            TemplateBean templateBean = irpVar.f29258a;
            kotlin.jvm.internal.q.a((Object) templateBean, "it.templateBean");
            return new NSSceneHeaderMuiseWidget(activity, iumVar, iruVar, templateBean, irpVar.f, irpVar.g);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$14  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass14<PARAMS, RESULT> implements ise<irp, ito> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        @Override // tb.ise
        public final NSSceneHeaderWeexWidget a(irp irpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NSSceneHeaderWeexWidget) ipChange.ipc$dispatch("5eacd28a", new Object[]{this, irpVar});
            }
            Activity activity = irpVar.c;
            kotlin.jvm.internal.q.a((Object) activity, "it.activity");
            ium iumVar = irpVar.d;
            kotlin.jvm.internal.q.a((Object) iumVar, "it.parent");
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = irpVar.e;
            kotlin.jvm.internal.q.a((Object) iruVar, "it.modelAdapter");
            TemplateBean templateBean = irpVar.f29258a;
            kotlin.jvm.internal.q.a((Object) templateBean, "it.templateBean");
            return new NSSceneHeaderWeexWidget(activity, iumVar, iruVar, templateBean, irpVar.f, irpVar.g);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$15  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass15<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        @Override // tb.ise
        public final com.taobao.search.sf.widgets.list.listcell.weex.d a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.list.listcell.weex.d) ipChange.ipc$dispatch("f97f87a3", new Object[]{this, ipqVar}) : new com.taobao.search.sf.widgets.list.listcell.weex.d(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$16  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass16<PARAMS, RESULT> implements ise<hte, htp> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        @Override // tb.ise
        public final npe a(hte hteVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (npe) ipChange.ipc$dispatch("1b004fc4", new Object[]{this, hteVar}) : new npe();
        }
    }

    /* renamed from: com.taobao.search.refactor.f$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass2<PARAMS, RESULT> implements ise<hte, com.taobao.android.meta.structure.state.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Override // tb.ise
        public final com.taobao.android.meta.structure.state.c a(hte hteVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.meta.structure.state.c) ipChange.ipc$dispatch("421554be", new Object[]{this, hteVar});
            }
            if (r.O()) {
                return new qur();
            }
            return new nph();
        }
    }

    /* renamed from: com.taobao.search.refactor.f$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass3<PARAMS, RESULT> implements ise<Activity, com.taobao.android.meta.srp.ui.list.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Override // tb.ise
        public final npf a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (npf) ipChange.ipc$dispatch("2d8dd28", new Object[]{this, activity});
            }
            if (activity == null) {
                kotlin.jvm.internal.q.a();
            }
            return new npf(activity);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass4<PARAMS, RESULT> implements ise<irq, iuk<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Override // tb.ise
        public final com.taobao.search.sf.widgets.searchbar.g a(irq irqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.searchbar.g) ipChange.ipc$dispatch("1004965a", new Object[]{this, irqVar}) : new com.taobao.search.sf.widgets.searchbar.g(irqVar.c, irqVar.d, irqVar.e, irqVar.f, irqVar.g);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass5<PARAMS, RESULT> implements ise<com.taobao.android.meta.structure.list.h, com.taobao.android.meta.structure.list.e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Override // tb.ise
        public final l a(com.taobao.android.meta.structure.list.h it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l) ipChange.ipc$dispatch("2ff0b6c5", new Object[]{this, it});
            }
            kotlin.jvm.internal.q.a((Object) it, "it");
            return new l(it);
        }
    }

    /* renamed from: com.taobao.search.refactor.f$7  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass7<PARAMS, RESULT> implements ise<irp, itn> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        @Override // tb.ise
        public final com.taobao.search.sf.newsearch.widgets.b a(irp irpVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.newsearch.widgets.b) ipChange.ipc$dispatch("a2784941", new Object[]{this, irpVar}) : new com.taobao.search.sf.newsearch.widgets.b(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
        }
    }

    public final boolean al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[]{this})).booleanValue() : this.i;
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    /* loaded from: classes7.dex */
    public static final class b<PARAMS, RESULT> implements ise<irq, iuk<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.ise
        public final com.taobao.search.sf.widgets.searchbar.b a(irq irqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.searchbar.b) ipChange.ipc$dispatch("100495bf", new Object[]{this, irqVar}) : new com.taobao.search.sf.widgets.searchbar.b(irqVar.c, irqVar.d, null, irqVar.f, irqVar.g);
        }
    }

    public final void am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9b9ab3", new Object[]{this});
        } else {
            l(b.INSTANCE);
        }
    }

    /* loaded from: classes7.dex */
    public static final class d<PARAMS, RESULT> implements ise<irq, iuk<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        @Override // tb.ise
        public final com.taobao.search.sf.widgets.searchbar.e a(irq irqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.searchbar.e) ipChange.ipc$dispatch("1004961c", new Object[]{this, irqVar}) : new com.taobao.search.sf.widgets.searchbar.e(irqVar.c, irqVar.d, irqVar.e, irqVar.f, irqVar.g);
        }
    }

    public final void an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba9b234", new Object[]{this});
        } else {
            l(d.INSTANCE);
        }
    }

    /* loaded from: classes7.dex */
    public static final class a<PARAMS, RESULT> implements ise<irq, iuk<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.ise
        public final com.taobao.search.sf.widgets.searchbar.a a(irq irqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.searchbar.a) ipChange.ipc$dispatch("100495a0", new Object[]{this, irqVar}) : new com.taobao.search.sf.widgets.searchbar.a(irqVar.c, irqVar.d, irqVar.e, irqVar.f, irqVar.g);
        }
    }

    public final void ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb7c9b5", new Object[]{this});
        } else {
            l(a.INSTANCE);
        }
    }

    /* loaded from: classes7.dex */
    public static final class c {
        static {
            kge.a(-970620599);
        }

        private c() {
        }

        public /* synthetic */ c(o oVar) {
            this();
        }
    }

    static {
        kge.a(899150657);
        Companion = new c(null);
        j = true;
    }
}
