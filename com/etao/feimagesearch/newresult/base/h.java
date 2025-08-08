package com.etao.feimagesearch.newresult.base;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.perf.IrpAvaRecord;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.newresult.widget.preview.d;
import com.etao.feimagesearch.newresult.widget.titlebar.c;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.etao.feimagesearch.util.y;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.coj;
import tb.com;
import tb.cov;
import tb.cow;
import tb.cox;
import tb.coy;
import tb.cqj;
import tb.cqm;
import tb.cqn;
import tb.cqo;
import tb.cqq;
import tb.cqr;
import tb.cqs;
import tb.cqt;
import tb.cqw;
import tb.cso;
import tb.csy;
import tb.ieq;
import tb.iez;
import tb.ifw;
import tb.igi;
import tb.igj;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class h extends iez<FrameLayout, com.etao.feimagesearch.newresult.base.f, IrpDatasource> implements c.a, ScrollInterceptView.b, cqt.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private cqo f6843a;
    private com.etao.feimagesearch.newresult.widget.preview.d b;
    private boolean c;
    private cqn d;
    private cqs e;
    private com.etao.feimagesearch.newresult.widget.titlebar.c f;
    private cqw g;
    private cqj h;
    private boolean i;
    private boolean j;
    private boolean k;
    private IrpAvaRecord l;
    private boolean m;
    private boolean o;
    private ValueAnimator p;
    private int q;
    private int r;
    private cqm s;
    private IrpDatasource t;
    private com.etao.feimagesearch.newresult.widget.titlebar.e u;

    static {
        kge.a(-1227393298);
        kge.a(1645930949);
        kge.a(-1565000676);
        kge.a(1926644660);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode == 93762283) {
            super.d();
            return null;
        } else if (hashCode != 95609325) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.f();
            return null;
        }
    }

    public static final /* synthetic */ void a(h hVar, RectF rectF, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404b7478", new Object[]{hVar, rectF, num});
        } else {
            hVar.a(rectF, num);
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.newresult.widget.titlebar.c c(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.newresult.widget.titlebar.c) ipChange.ipc$dispatch("6eb19e80", new Object[]{hVar});
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = hVar.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        return cVar;
    }

    public static final /* synthetic */ cqs d(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqs) ipChange.ipc$dispatch("486fef96", new Object[]{hVar});
        }
        cqs cqsVar = hVar.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        return cqsVar;
    }

    public static final /* synthetic */ void f(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef71aa9", new Object[]{hVar});
        } else {
            hVar.I();
        }
    }

    public static final /* synthetic */ cqw g(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqw) ipChange.ipc$dispatch("f0200495", new Object[]{hVar});
        }
        cqw cqwVar = hVar.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        return cqwVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.etao.feimagesearch.newresult.base.f, tb.ieq] */
    @Override // tb.iez
    public /* synthetic */ com.etao.feimagesearch.newresult.base.f i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ieq) ipChange.ipc$dispatch("4c9313e1", new Object[]{this}) : z();
    }

    @Override // tb.igj
    public /* synthetic */ View k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : E();
    }

    public final cqm v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqm) ipChange.ipc$dispatch("b095ec0a", new Object[]{this}) : this.s;
    }

    public final IrpDatasource w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IrpDatasource) ipChange.ipc$dispatch("328835a0", new Object[]{this}) : this.t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Activity activity, cqm tracker, Object obj, IrpDatasource irpDatasource, igi setter) {
        super(activity, obj, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(tracker, "tracker");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.s = tracker;
        this.t = irpDatasource;
        this.m = com.etao.feimagesearch.config.b.dO();
        this.c = true;
        this.o = m().a() == PhotoFrom.Values.TAKE || m().a() == PhotoFrom.Values.AUTO_DETECT || m().a() == PhotoFrom.Values.OUTER_ALBUM_LOCAL || m().a() == PhotoFrom.Values.ALBUM_SYS || m().a() == PhotoFrom.Values.ALBUM;
        if (activity instanceof com.etao.feimagesearch.result.b) {
            this.l = ((com.etao.feimagesearch.result.b) activity).e();
        }
        this.h = new cqj(activity);
        h().a(this.s);
        igj.a(this, null, 1, null);
        y();
        x();
        if (this.o && this.d != null) {
            com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
            if (dVar == null) {
                q.b("previewWidget");
            }
            dVar.a(false);
        }
        if (this.t.F() && this.t.I()) {
            a((cso) null);
        }
        this.q = -1;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.j;
    }

    public com.etao.feimagesearch.newresult.base.f z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.newresult.base.f) ipChange.ipc$dispatch("5df6fd69", new Object[]{this}) : new com.etao.feimagesearch.newresult.base.f(g());
    }

    public FrameLayout E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("614c1f0d", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(g());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!m().z()) {
            frameLayout.setBackgroundColor(Color.parseColor("#000000"));
        }
        frameLayout.setClipChildren(false);
        return frameLayout;
    }

    @Override // tb.iez, tb.hon
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.c) {
            this.c = false;
        } else {
            h().t();
        }
        this.k = false;
    }

    @Override // tb.iez, tb.hon
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        this.k = true;
    }

    @Override // tb.iez, tb.hon
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        this.p = null;
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.a(num);
        com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
        if (dVar == null) {
            q.b("previewWidget");
        }
        dVar.a(num);
        com.etao.feimagesearch.newresult.widget.preview.d dVar2 = this.b;
        if (dVar2 == null) {
            q.b("previewWidget");
        }
        float e2 = com.e(g());
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        dVar2.a(Float.valueOf(e2 - com.taobao.android.searchbaseframe.util.j.b(cqsVar.ep_())));
        cqs cqsVar2 = this.e;
        if (cqsVar2 == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar2.a(num);
    }

    public final boolean ee_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("907f14ca", new Object[]{this})).booleanValue();
        }
        if (h().l()) {
            return false;
        }
        h().i();
        return true;
    }

    public final boolean ef_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9233ed69", new Object[]{this})).booleanValue();
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        return cqwVar.ew_();
    }

    public final void eg_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e8c604", new Object[]{this});
        } else {
            this.h.a();
        }
    }

    public final void a(boolean z) {
        a.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
        if (dVar == null) {
            q.b("previewWidget");
        }
        dVar.a(true);
        cqn cqnVar = this.d;
        if (cqnVar == null) {
            return;
        }
        boolean b = m().H().b();
        if (z || b || !this.o) {
            cqnVar.el_();
            return;
        }
        RectF rectF = null;
        if (m().y()) {
            List<RectF> h = m().h();
            if (h != null) {
                rectF = h.get(0);
            }
        } else {
            LinkedList<a.b> M = m().M();
            if (M != null && (bVar = M.get(0)) != null) {
                rectF = bVar.c;
            }
        }
        if (rectF == null) {
            cqnVar.el_();
        } else {
            cqnVar.el_();
        }
    }

    private final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (!com.taobao.search.sf.j.f19452a.l().a()) {
        } else {
            new ifw(g(), new IrpWidget$attachDebugWidget$1(this)).a();
        }
    }

    private final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        B();
        A();
        D();
        H();
        C();
    }

    /* loaded from: classes3.dex */
    public static final class c implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
            h.this = r1;
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            FrameLayout frameLayout = (FrameLayout) h.this.O();
            if (frameLayout != null) {
                frameLayout.addView(widgetView);
            }
            return (ViewGroup) h.this.O();
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            return (ViewGroup) h.this.O();
        }
    }

    private final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else {
            this.f6843a = new cqo(g(), this, m(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
            h.this = r1;
        }

        @Override // com.etao.feimagesearch.newresult.widget.preview.d.a
        public void a(RectF rectF, a.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7488371a", new Object[]{this, rectF, bVar});
                return;
            }
            csy.a(true);
            h hVar = h.this;
            hVar.a(Integer.valueOf(h.c(hVar).b(rectF)), rectF, false);
            h.this.m().b("objectFrom", "editor");
            cox.a("changeObjectClick", com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, h.this.m().a().getValue());
        }

        @Override // com.etao.feimagesearch.newresult.widget.preview.d.a
        public void b(RectF rectF, a.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a339a139", new Object[]{this, rectF, bVar});
                return;
            }
            csy.a(true);
            if (rectF == null) {
                return;
            }
            try {
                com.etao.feimagesearch.newresult.base.c i = h.this.m().i();
                String f = i != null ? i.f() : null;
                if (StringUtils.isEmpty(f)) {
                    cox.a("changebox", com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, h.this.m().a().getValue());
                } else {
                    cox.a("changebox", "tfs", f, "region", String.valueOf(rectF.left) + "-" + rectF.top + "-" + rectF.right + "-" + rectF.bottom, com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, h.this.m().a().getValue());
                }
                cox.a("Page_PhotoSearchResult", "resizeQuery", 19999, "pssource", h.this.m().r());
            } catch (Exception unused) {
            }
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint.DataPoint.SEARCH_MOVE_REGION.getPoint(), new String[0]);
            h.this.m().b("objectFrom", "custom");
            h hVar = h.this;
            h.a(hVar, rectF, Integer.valueOf(h.c(hVar).b(rectF)));
            h.c(h.this).a(rectF);
        }

        @Override // com.etao.feimagesearch.newresult.widget.preview.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                h.d(h.this).a(0.0f, 150L, null);
            }
        }
    }

    private final void B() {
        com.etao.feimagesearch.newresult.widget.preview.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        i iVar = new i();
        if (m().H().f()) {
            eVar = new com.etao.feimagesearch.newresult.widget.preview.c(g(), this, m(), new g(), iVar);
        } else {
            eVar = new com.etao.feimagesearch.newresult.widget.preview.e(g(), this, m(), new C0237h(), iVar);
        }
        this.b = eVar;
        com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
        if (dVar == null) {
            q.b("previewWidget");
        }
        igj.a(dVar, null, 1, null);
    }

    /* loaded from: classes3.dex */
    public static final class g implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
            h.this = r1;
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            FrameLayout frameLayout = (FrameLayout) h.this.O();
            if (frameLayout != null) {
                frameLayout.addView(widgetView);
            }
            return (ViewGroup) h.this.O();
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            return (ViewGroup) h.this.O();
        }
    }

    /* renamed from: com.etao.feimagesearch.newresult.base.h$h */
    /* loaded from: classes3.dex */
    public static final class C0237h implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0237h() {
            h.this = r1;
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            FrameLayout frameLayout = (FrameLayout) h.this.O();
            if (frameLayout != null) {
                frameLayout.addView(widgetView);
            }
            return (ViewGroup) h.this.O();
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            return (ViewGroup) h.this.O();
        }
    }

    private final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else if (m().I()) {
        } else {
            f fVar = new f();
            e eVar = new e();
            cqq cqrVar = this.o ? new cqr(g(), this, m(), fVar, eVar) : new cqq(g(), this, m(), fVar, eVar);
            igj.a(cqrVar, null, 1, null);
            cqrVar.a();
            HashMap hashMap = new HashMap();
            String r = m().r();
            if (r == null) {
                r = "";
            }
            hashMap.put("pssource", r);
            String value = m().a().getValue();
            q.a((Object) value, "model.photoFrom.value");
            hashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, value);
            hashMap.put("loadingtype", "pic");
            coy.b("Page_PhotoSearchResult", "loadingExpose", hashMap);
            this.d = cqrVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
            h.this = r1;
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            FrameLayout frameLayout = (FrameLayout) h.this.O();
            if (frameLayout != null) {
                frameLayout.addView(widgetView);
            }
            return (ViewGroup) h.this.O();
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            return (ViewGroup) h.this.O();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
            h.this = r1;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.t, java.lang.Object] */
        @Override // tb.ruk
        /* renamed from: invoke */
        public /* synthetic */ t mo2427invoke() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a980813", new Object[]{this});
            }
            a();
            return t.INSTANCE;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            h.this.v().b();
            h.this.g().finish();
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
            h.this = r1;
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            Integer a2 = y.INSTANCE.a(h.this.g());
            layoutParams.setMargins(0, a2 != null ? a2.intValue() : com.taobao.android.searchbaseframe.util.j.a(32.0f), 0, 0);
            FrameLayout frameLayout = (FrameLayout) h.this.O();
            if (frameLayout != null) {
                frameLayout.addView(widgetView, layoutParams);
            }
            return (ViewGroup) h.this.O();
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            return (ViewGroup) h.this.O();
        }
    }

    private final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.e = new cqs(g(), this, m(), new j(), this, this, this, null);
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        igj.a(cqsVar, null, 1, null);
        cqs cqsVar2 = this.e;
        if (cqsVar2 == null) {
            q.b("scrollInterceptWidget");
        }
        this.g = cqsVar2.er_();
        cqs cqsVar3 = this.e;
        if (cqsVar3 == null) {
            q.b("scrollInterceptWidget");
        }
        this.f = cqsVar3.eq_();
    }

    /* loaded from: classes3.dex */
    public static final class o implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
            h.this = r1;
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            FrameLayout frameLayout = (FrameLayout) h.this.O();
            if (frameLayout != null) {
                frameLayout.addView(widgetView);
            }
            return (ViewGroup) h.this.O();
        }

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            return (ViewGroup) h.this.O();
        }
    }

    private final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        this.u = new com.etao.feimagesearch.newresult.widget.titlebar.e(g(), this, m(), new o());
        com.etao.feimagesearch.newresult.widget.titlebar.e eVar = this.u;
        if (eVar == null) {
            q.b("titleBarGuideWidget");
        }
        igj.a(eVar, null, 1, null);
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        Bitmap l = m().l();
        if (l == null) {
            return;
        }
        com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
        if (dVar == null) {
            q.b("previewWidget");
        }
        dVar.a(l, z);
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        cVar.a(l);
    }

    public final int eh_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("959d9e96", new Object[]{this})).intValue();
        }
        com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
        if (dVar == null) {
            q.b("previewWidget");
        }
        return dVar.ez_();
    }

    public final void a(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (m().l() == null || com.etao.feimagesearch.config.b.s()) {
        } else {
            com.etao.feimagesearch.newresult.base.c i2 = m().i();
            if ((i2 != null ? i2.c() : null) == null) {
                return;
            }
            this.j = true;
            if (m().y()) {
                a(m().h(), false);
                return;
            }
            com.etao.feimagesearch.newresult.base.c i3 = m().i();
            if (i3 == null) {
                q.a();
            }
            JSONObject c2 = i3.c();
            if (c2 == null) {
                q.a();
            }
            cow a2 = coj.a(c2);
            if (a2 == null || (a2.b() == null && a2.a() == null)) {
                IrpAvaRecord irpAvaRecord = this.l;
                if (irpAvaRecord != null) {
                    irpAvaRecord.b(IrpAvaRecord.AvaType.AVA_TYPE_CROP_EMPTY, "-1", "empty");
                }
                if (m().l() == null) {
                    return;
                }
                if (a2 == null) {
                    a2 = new cow();
                }
                int[] G = m().G();
                a2.a(new RectF(G[0], G[1], 0.0f, 0.0f));
            }
            a2.a(f2, f3);
            if (a2.a() != null) {
                a(a2.a(), true);
            } else if (a2.b() == null) {
            } else {
                a(p.c(a2.b()), true);
            }
        }
    }

    public final void a(List<RectF> list, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (!this.i || m().l() != null) {
            List<RectF> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            this.i = true;
            int[] G = m().G();
            ArrayList arrayList = new ArrayList();
            LinkedList<a.b> linkedList = new LinkedList<>();
            ArrayList arrayList2 = new ArrayList();
            if (!m().O().isEmpty()) {
                int size = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i2 = 0;
                        break;
                    }
                    RectF rectF = list.get(i3);
                    if (rectF == null) {
                        i3++;
                    } else {
                        if (z) {
                            rectF.set(rectF.left / G[0], rectF.top / G[1], rectF.right / G[0], rectF.bottom / G[1]);
                        }
                        b(rectF);
                        a.b bVar = new a.b(rectF, com.etao.feimagesearch.e.REGION_SEARCH);
                        arrayList.add(bVar);
                        linkedList.add(bVar);
                        arrayList2.add(rectF);
                        i2 = i3 + 1;
                    }
                }
                for (b.a aVar : m().O()) {
                    RectF rectF2 = aVar.b;
                    if (rectF2 == null) {
                        return;
                    }
                    b(rectF2);
                    a.b bVar2 = new a.b(rectF2, com.etao.feimagesearch.e.REGION_SCAN);
                    aVar.d = new RectF(rectF2);
                    arrayList.add(bVar2);
                    linkedList.add(bVar2);
                    arrayList2.add(rectF2);
                }
                a(i2, z, list, arrayList, linkedList, arrayList2);
            } else {
                a(0, z, list, arrayList, linkedList, arrayList2);
            }
            m().a(linkedList);
            q();
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
            if (cVar == null) {
                q.b("titleBarWidget");
            }
            cVar.a(arrayList);
            com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
            if (dVar == null) {
                q.b("previewWidget");
            }
            cqs cqsVar = this.e;
            if (cqsVar == null) {
                q.b("scrollInterceptWidget");
            }
            dVar.a(arrayList, Float.valueOf(cqsVar.i()));
        }
    }

    public final void G() {
        MaType type;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        List<b.a> O = m().O();
        if (O.isEmpty()) {
            return;
        }
        LinkedList<a.b> M = m().M();
        LinkedList<a.b> linkedList = M;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int[] G = m().G();
        int i2 = 1;
        for (b.a aVar : O) {
            RectF rectF = aVar.b;
            if (rectF == null) {
                return;
            }
            b(rectF);
            a.b bVar = new a.b(rectF, com.etao.feimagesearch.e.REGION_SCAN);
            aVar.d = new RectF(rectF);
            M.add(i2, bVar);
            arrayList.add(bVar);
            String regionKey = cov.a(rectF);
            q.a((Object) regionKey, "regionKey");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "region", regionKey);
            if (G.length == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(G[0]);
                sb.append('_');
                sb.append(G[1]);
                jSONObject2.put((JSONObject) "imgSize", sb.toString());
            }
            MaResult maResult = aVar.f6598a;
            String str = null;
            jSONObject2.put((JSONObject) "type", (String) ((maResult == null || (type = maResult.getType()) == null) ? null : Integer.valueOf(type.getDiscernType())));
            MaResult maResult2 = aVar.f6598a;
            jSONObject2.put((JSONObject) "content", maResult2 != null ? maResult2.getText() : null);
            com.etao.feimagesearch.newresult.base.c i3 = m().i();
            if (i3 != null) {
                str = i3.f();
            }
            jSONObject2.put((JSONObject) "tfskey", str);
            arrayList2.add(new com.etao.feimagesearch.newresult.base.i(regionKey, "nt_scan_code_hint", jSONObject, true));
            i2++;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        cVar.a(arrayList, 1);
        com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
        if (dVar == null) {
            q.b("previewWidget");
        }
        dVar.b(arrayList2);
    }

    public final void a(List<com.etao.feimagesearch.newresult.base.i> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
        if (dVar == null) {
            q.b("previewWidget");
        }
        dVar.a(list);
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.a(jSONObject);
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.b(jSONObject);
    }

    public final void c(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, params});
            return;
        }
        q.c(params, "params");
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.a("notifyPopLayerState", params);
    }

    public final void d(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, params});
            return;
        }
        q.c(params, "params");
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.a("pageScrollState", params);
    }

    public final void e(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, params});
            return;
        }
        q.c(params, "params");
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.a("notifyScreenshotsUpdate", params);
    }

    public final void a(boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i2)});
        } else if (!this.m) {
        } else {
            cqs cqsVar = this.e;
            if (cqsVar == null) {
                q.b("scrollInterceptWidget");
            }
            cqsVar.g(!z);
            JSONObject jSONObject = new JSONObject();
            if (i2 == 0) {
                jSONObject.put((JSONObject) "state", "down");
            } else if (i2 == 4) {
                jSONObject.put((JSONObject) "state", BottomSheetComponentInterface.State.HALF);
            } else {
                jSONObject.put((JSONObject) "state", "full");
            }
            d(jSONObject);
        }
    }

    public final void ei_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97527742", new Object[]{this});
            return;
        }
        if (m().F() && m().l() == null) {
            d(true);
        } else if (m().R() && m().l() == null) {
            d(true);
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
            if (cVar == null) {
                q.b("titleBarWidget");
            }
            cVar.a(false, false);
        } else {
            cqw cqwVar = this.g;
            if (cqwVar == null) {
                q.b("hybridWidget");
            }
            if (cqwVar.ev_()) {
                d(true);
                com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
                if (dVar == null) {
                    q.b("previewWidget");
                }
                dVar.a((Bitmap) null, false);
                m().H().a("text");
                a(this, false, 1, (Object) null);
            } else {
                d(!m().H().m());
                com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
                if (cVar2 == null) {
                    q.b("titleBarWidget");
                }
                cVar2.a(true, m().H().j());
            }
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar3 = this.f;
        if (cVar3 == null) {
            q.b("titleBarWidget");
        }
        cVar3.h();
        I();
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        if (m().F() && m().l() == null) {
            d(true);
        } else if (m().R() && m().l() == null) {
            d(true);
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
            if (cVar == null) {
                q.b("titleBarWidget");
            }
            cVar.a(false, false);
        } else {
            cqw cqwVar = this.g;
            if (cqwVar == null) {
                q.b("hybridWidget");
            }
            if (cqwVar.ev_()) {
                d(true);
                com.etao.feimagesearch.newresult.widget.preview.d dVar = this.b;
                if (dVar == null) {
                    q.b("previewWidget");
                }
                dVar.a((Bitmap) null, false);
                m().H().a("text");
                a(this, false, 1, (Object) null);
            } else {
                d(!m().H().m());
                com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
                if (cVar2 == null) {
                    q.b("titleBarWidget");
                }
                cVar2.a(true, m().H().j());
            }
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar3 = this.f;
        if (cVar3 == null) {
            q.b("titleBarWidget");
        }
        cVar3.h();
        a(new n());
    }

    /* loaded from: classes3.dex */
    public static final class n implements cso {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.cso
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        public n() {
            h.this = r1;
        }

        @Override // tb.cso
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!h.this.m().H().c()) {
            } else {
                h.f(h.this);
            }
        }
    }

    public final void a(cso csoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40cb879", new Object[]{this, csoVar});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.a(m().H().n(), 150L, csoVar);
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.a(z);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.a(0);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.ex_();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.h();
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        return cqwVar.ev_();
    }

    public final void a(ruk<t> closePageOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, closePageOption});
            return;
        }
        q.c(closePageOption, "closePageOption");
        if (h().m() || !m().z()) {
            closePageOption.mo2427invoke();
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.a(1.0f, 400L, new a(closePageOption));
    }

    /* loaded from: classes3.dex */
    public static final class a implements cso {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ ruk f6844a;

        @Override // tb.cso
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        public a(ruk rukVar) {
            this.f6844a = rukVar;
        }

        @Override // tb.cso
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f6844a.mo2427invoke();
            }
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.h();
    }

    public final void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.a(z, str);
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.o();
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
            if (cVar == null) {
                q.b("titleBarWidget");
            }
            cVar.eD_();
        } else {
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
            if (cVar2 == null) {
                q.b("titleBarWidget");
            }
            cVar2.eC_();
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        cVar.b(str);
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        cVar.a(str);
    }

    public final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        cVar.a(i2);
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        cqwVar.b(z);
    }

    public final void a(Integer num, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebcefb4", new Object[]{this, num, rectF, new Boolean(z)});
        } else if (rectF == null) {
        } else {
            a(rectF, num);
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
            if (cVar == null) {
                q.b("titleBarWidget");
            }
            cVar.a(rectF, z);
            String[] strArr = new String[2];
            strArr[0] = "for_bts";
            com.etao.feimagesearch.newresult.base.c i2 = m().i();
            String str = null;
            if (StringUtils.isEmpty(i2 != null ? i2.g() : null)) {
                str = "";
            } else {
                com.etao.feimagesearch.newresult.base.c i3 = m().i();
                if (i3 != null) {
                    str = i3.g();
                }
            }
            strArr[1] = str;
            coy.a("Page_PhotoSearchResult", "objectSwitch", strArr);
        }
    }

    public final Bitmap ej_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f12a4bbf", new Object[]{this});
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        return cVar.eF_();
    }

    private final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (!com.etao.feimagesearch.config.b.cW() || m().z() || com.r() || com.s()) {
        } else {
            com.etao.feimagesearch.newresult.widget.titlebar.e eVar = this.u;
            if (eVar == null) {
                q.b("titleBarGuideWidget");
            }
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
            if (cVar == null) {
                q.b("titleBarWidget");
            }
            LinkedList<com.etao.feimagesearch.result.d> n2 = cVar.n();
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
            if (cVar2 == null) {
                q.b("titleBarWidget");
            }
            boolean o2 = cVar2.o();
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar3 = this.f;
            if (cVar3 == null) {
                q.b("titleBarWidget");
            }
            eVar.a(n2, o2, cVar3.p());
        }
    }

    private final void a(int i2, boolean z, List<RectF> list, List<a.b> list2, LinkedList<a.b> linkedList, List<RectF> list3) {
        IpChange ipChange = $ipChange;
        char c2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3e4e84", new Object[]{this, new Integer(i2), new Boolean(z), list, list2, linkedList, list3});
            return;
        }
        int i3 = i2;
        int[] G = m().G();
        int size = list.size();
        while (i3 < size) {
            RectF rectF = list.get(i3);
            if (rectF != null) {
                if (z) {
                    rectF.set(rectF.left / G[c2], rectF.top / G[1], rectF.right / G[c2], rectF.bottom / G[1]);
                }
                b(rectF);
                a.b bVar = new a.b(rectF, com.etao.feimagesearch.e.REGION_SEARCH);
                list2.add(bVar);
                list3.add(rectF);
                linkedList.add(bVar);
            }
            i3++;
            c2 = 0;
        }
    }

    public static /* synthetic */ void a(h hVar, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b2e059", new Object[]{hVar, new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        hVar.c(z);
    }

    private final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.e(z);
        cqs cqsVar2 = this.e;
        if (cqsVar2 == null) {
            q.b("scrollInterceptWidget");
        }
        this.f = cqsVar2.eq_();
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        cVar.a(m().l());
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        if (cVar instanceof com.etao.feimagesearch.newresult.widget.titlebar.g) {
            return;
        }
        if (m().F() && m().l() == null) {
            com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
            if (cVar2 == null) {
                q.b("titleBarWidget");
            }
            if (cVar2 instanceof com.etao.feimagesearch.newresult.widget.titlebar.g) {
                return;
            }
            m().H().a("text");
            a(this, false, 1, (Object) null);
            return;
        }
        LinkedList<a.b> M = m().M();
        if (M != null) {
            i2 = M.size();
        }
        if (i2 > 1) {
            return;
        }
        c(true);
    }

    private final void a(RectF rectF, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b96fa5e", new Object[]{this, rectF, num});
        } else {
            h().a(rectF, num);
        }
    }

    private final void b(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3bf7fa", new Object[]{this, rectF});
        } else if (com.etao.feimagesearch.config.b.V()) {
        } else {
            if (!m().z()) {
                if (rectF.width() > 0.95f) {
                    rectF.left = 0.05f;
                    rectF.right = 0.95f;
                }
                if (rectF.height() <= 0.95f) {
                    return;
                }
                rectF.top = 0.05f;
                rectF.bottom = 0.95f;
                return;
            }
            if (rectF.width() > 0.8f) {
                rectF.left = 0.1f;
                rectF.right = 0.9f;
            }
            if (rectF.height() <= 0.8f) {
                return;
            }
            rectF.top = 0.1f;
            rectF.bottom = 0.9f;
        }
    }

    private final int c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i2)})).intValue();
        }
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar = this.f;
        if (cVar == null) {
            q.b("titleBarWidget");
        }
        if (cVar.eE_()) {
            return 0;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        if (cqsVar.eo_()) {
            return 0;
        }
        cqs cqsVar2 = this.e;
        if (cqsVar2 == null) {
            q.b("scrollInterceptWidget");
        }
        if (cqsVar2.es_()) {
            cqs cqsVar3 = this.e;
            if (cqsVar3 == null) {
                q.b("scrollInterceptWidget");
            }
            if (!cqsVar3.et_()) {
                return 0;
            }
        }
        cqw cqwVar = this.g;
        if (cqwVar == null) {
            q.b("hybridWidget");
        }
        FrameLayout O = cqwVar.O();
        if (O == null) {
            q.a();
        }
        int translationY = (int) (O.getTranslationY() - i2);
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar2 = this.f;
        if (cVar2 == null) {
            q.b("titleBarWidget");
        }
        int eB_ = cVar2.eB_();
        if (translationY < 0) {
            translationY = 0;
        } else if (translationY > eB_) {
            translationY = eB_;
        }
        cqw cqwVar2 = this.g;
        if (cqwVar2 == null) {
            q.b("hybridWidget");
        }
        FrameLayout O2 = cqwVar2.O();
        if (O2 == null) {
            q.a();
        }
        int translationY2 = (int) O2.getTranslationY();
        cqw cqwVar3 = this.g;
        if (cqwVar3 == null) {
            q.b("hybridWidget");
        }
        cqwVar3.a(translationY);
        com.etao.feimagesearch.newresult.widget.titlebar.c cVar3 = this.f;
        if (cVar3 == null) {
            q.b("titleBarWidget");
        }
        cVar3.b(translationY - eB_);
        return translationY2 - translationY;
    }

    @Override // tb.cqt.a
    public void a(boolean z, View containerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff475e6", new Object[]{this, new Boolean(z), containerView});
            return;
        }
        q.c(containerView, "containerView");
        if (z) {
            IrpAvaRecord irpAvaRecord = this.l;
            if (irpAvaRecord == null) {
                return;
            }
            irpAvaRecord.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_WEB_LOAD);
            return;
        }
        IrpAvaRecord irpAvaRecord2 = this.l;
        if (irpAvaRecord2 != null) {
            irpAvaRecord2.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_MUISE_LOAD);
        }
        com.etao.feimagesearch.newresult.perf.a.L();
    }

    @Override // tb.cqt.a
    public void a(boolean z, Integer num, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb11d495", new Object[]{this, new Boolean(z), num, str});
            return;
        }
        String str3 = null;
        if (z) {
            IrpAvaRecord irpAvaRecord = this.l;
            if (irpAvaRecord != null) {
                if (num != null) {
                    str3 = String.valueOf(num.intValue());
                }
                irpAvaRecord.b(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_WEB_LOAD, str3, str);
            }
        } else {
            IrpAvaRecord irpAvaRecord2 = this.l;
            if (irpAvaRecord2 != null) {
                if (num != null) {
                    str3 = String.valueOf(num.intValue());
                }
                irpAvaRecord2.b(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_MUISE_LOAD, str3, str);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put("hybrid", "web");
        } else {
            linkedHashMap.put("hybrid", "muise");
        }
        String str4 = "";
        if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = str4;
        }
        linkedHashMap.put("errCode", str2);
        if (str != null) {
            str4 = str;
        }
        linkedHashMap.put("errMsg", str4);
        TLogTracker.b("HybridLoad", linkedHashMap);
    }

    @Override // tb.cqt.a
    public void b(boolean z, Integer num, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0534356", new Object[]{this, new Boolean(z), num, str});
        } else if (z) {
        } else {
            IrpAvaRecord irpAvaRecord = this.l;
            if (irpAvaRecord != null) {
                if (num == null || (str3 = String.valueOf(num.intValue())) == null) {
                    str3 = "unknown";
                }
                irpAvaRecord.b(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_MUISE_RUN, str3, str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("hybrid", "muise");
            if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
                str2 = "";
            }
            linkedHashMap.put("errCode", str2);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("errMsg", str);
            TLogTracker.b("HybridRun", linkedHashMap);
        }
    }

    @Override // tb.cqt.a
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        eg_();
        h().j();
        IrpAvaRecord irpAvaRecord = this.l;
        if (irpAvaRecord != null) {
            irpAvaRecord.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_DOWNGRADE);
        }
        TLogTracker.b("HybridDowngrade", null);
    }

    @Override // tb.cqt.a
    public int b(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i2)})).intValue() : c(i2);
    }

    @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
    public void a(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        if (i3 <= i5) {
            i5 = i3;
        }
        if (i3 < 0) {
            i5 = 0;
        }
        int i6 = i2 - i5;
        if (i6 >= 0) {
            return;
        }
        c(i6);
    }

    @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
    public void a(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (i3 == 1) {
            cqs cqsVar = this.e;
            if (cqsVar == null) {
                q.b("scrollInterceptWidget");
            }
            cqsVar.g(false);
        } else if (i3 == -1 && this.q != -1) {
            this.q = i3;
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollOffScreen", new String[0]);
        } else if (i3 == 0 && (i6 = this.q) != 0) {
            if (i6 != -1) {
                this.q = i3;
                cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollDown", com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, m().a().getValue());
                this.r = 0;
                cqo cqoVar = this.f6843a;
                if (cqoVar == null) {
                    q.b("guideViewWidget");
                }
                cqoVar.a();
                h().k();
                m().b("regionCropShow", JarvisConstant.KEY_JARVIS_TRIGGER);
                if (!m().z()) {
                    m().b("regionCropShowV3", JarvisConstant.KEY_JARVIS_TRIGGER);
                }
            }
            cqw cqwVar = this.g;
            if (cqwVar == null) {
                q.b("hybridWidget");
            }
            if (!cqwVar.i()) {
                return;
            }
            a(false, 0);
        } else if (i3 == 3 && (i5 = this.q) != 3 && i5 != -1) {
            this.q = i3;
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollUp", com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, m().a().getValue(), "manuallyClick", String.valueOf(this.r));
            this.r = 0;
            cqw cqwVar2 = this.g;
            if (cqwVar2 == null) {
                q.b("hybridWidget");
            }
            if (cqwVar2.i()) {
                return;
            }
            a(true, 3);
        } else {
            if (i3 == 4 && (i4 = this.q) != 4) {
                if (i4 != -1) {
                    this.q = i3;
                    cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollHalf", com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, m().a().getValue(), "manuallyClick", String.valueOf(this.r));
                    this.r = 0;
                    return;
                }
                a(false, 4);
            }
            if (i3 != -1 && i3 != 3 && i3 != 0) {
                return;
            }
            this.q = i3;
        }
    }

    @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            g().finish();
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c.a
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint.DataPoint.IRP_CLOSE_RESULT_PAGE_CLICK.getPoint(), new String[0]);
        g().finish();
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c.a
    public void a(com.etao.feimagesearch.result.d dVar) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99421f18", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ObjectchangeClickon", com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, m().a().getValue());
            Bitmap l = m().l();
            com.etao.feimagesearch.newresult.widget.preview.d dVar2 = this.b;
            if (dVar2 == null) {
                q.b("previewWidget");
            }
            RectF rectF = dVar.c;
            int width = l != null ? l.getWidth() : 0;
            if (l != null) {
                i2 = l.getHeight();
            }
            dVar2.a(rectF, width, i2);
            m().b("objectFrom", "header");
            a(Integer.valueOf(dVar.b), dVar.c, dVar.h);
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c.a
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        cqs cqsVar = this.e;
        if (cqsVar == null) {
            q.b("scrollInterceptWidget");
        }
        cqsVar.a(0.0f, 150L, null);
    }

    public static /* synthetic */ void a(h hVar, int i2, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, String str2, String str3, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a518170c", new Object[]{hVar, new Integer(i2), str, onClickListener, onClickListener2, str2, str3, new Integer(i3), obj});
            return;
        }
        if ((i3 & 16) != 0) {
            str2 = com.alibaba.ability.localization.b.a(R.string.irp_error_message_retry_text);
        }
        String str4 = str2;
        if ((i3 & 32) != 0) {
            str3 = com.alibaba.ability.localization.b.a(R.string.irp_error_message_cancel_text);
        }
        hVar.a(i2, str, onClickListener, onClickListener2, str4, str3);
    }

    public final void a(int i2, String msg, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22f9999", new Object[]{this, new Integer(i2), msg, onClickListener, onClickListener2, str, str2});
            return;
        }
        q.c(msg, "msg");
        if (this.k || this.h.b()) {
            return;
        }
        this.h.a(msg, onClickListener, str, onClickListener2, str2);
    }
}
