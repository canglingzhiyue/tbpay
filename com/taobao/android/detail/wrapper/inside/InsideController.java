package com.taobao.android.detail.wrapper.inside;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.DetailViewPager;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.inside.InsideLinearLayout;
import com.taobao.android.detail.core.standard.widget.ClipableFrameLayout;
import com.taobao.android.detail.core.standard.widget.c;
import com.taobao.android.detail.core.ultronengine.DetailRecyclerView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.ttdetail.utils.ad;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.inside.InsideController;
import com.taobao.android.detail.wrapper.request.inside.FeatureInsideExtNode;
import com.taobao.android.nav.Nav;
import com.taobao.android.sku.widget.d;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.bay;
import tb.dxz;
import tb.dya;
import tb.dyf;
import tb.egl;
import tb.egm;
import tb.eip;
import tb.eld;
import tb.eme;
import tb.emh;
import tb.emu;
import tb.eqb;
import tb.fad;
import tb.ffg;
import tb.fgu;
import tb.fgv;
import tb.fmf;
import tb.kge;
import tb.prc;

/* loaded from: classes5.dex */
public class InsideController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean I;
    private PayReceiver M;
    private boolean N;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11409a;
    private boolean b;
    private DetailActivity c;
    private Animation d;
    private Animation e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private InsideLinearLayout j;
    private View k;
    private View l;
    private View m;
    private boolean n;
    private ClipableFrameLayout o;
    private ImageView p;
    private ffg.a q;
    private DetailRecyclerView r;
    private egl s;
    private String t;
    private RecyclerView u;
    private boolean v;
    private boolean w;
    private boolean x;
    private View y;
    private View z;
    private final List<eld> F = new ArrayList();
    private final JSONObject L = new JSONObject();
    private final View.OnClickListener G = new View.OnClickListener() { // from class: tb.ffg.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            InsideController.this = this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            InsideController insideController = InsideController.this;
            if (InsideController.$ipChange) {
                return;
            }
            InsideController.this.j();
        }
    };
    private final Runnable H = new Runnable() { // from class: tb.ffg.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            InsideController.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            InsideController insideController = InsideController.this;
            ClipableFrameLayout clipableFrameLayout = InsideController.$ipChange;
            InsideController insideController2 = InsideController.this;
            clipableFrameLayout.startAnimation(InsideController.$ipChange);
            InsideController insideController3 = InsideController.this;
            InsideController.$ipChange.setVisibility(0);
        }
    };
    private final InsideLinearLayout.InsideScrollListener J = new InsideLinearLayout.InsideScrollListener() { // from class: tb.ffg.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            InsideController.this = this;
        }

        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.InsideScrollListener
        public void insideViewScroll(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9331052e", new Object[]{this, new Integer(i)});
                return;
            }
            InsideController insideController = InsideController.this;
            float f = 1.0f - (i / InsideController.$ipChange);
            InsideController insideController2 = InsideController.this;
            if (i <= InsideController.$ipChange) {
                InsideController insideController3 = InsideController.this;
                if (!InsideController.$ipChange && i == 0) {
                    InsideController.a(InsideController.this, true);
                    InsideController insideController4 = InsideController.this;
                    InsideController.$ipChange.setNeedClipPath(false);
                } else if (i > 3) {
                    InsideController insideController5 = InsideController.this;
                    ClipableFrameLayout clipableFrameLayout = InsideController.$ipChange;
                    InsideController insideController6 = InsideController.this;
                    clipableFrameLayout.setNeedClipPath(InsideController.$ipChange.F());
                }
                InsideController insideController7 = InsideController.this;
                if (InsideController.$ipChange.ag() != null) {
                    InsideController insideController8 = InsideController.this;
                    View ag = InsideController.$ipChange.ag();
                    InsideController insideController9 = InsideController.this;
                    ag.setAlpha(fgu.a(i, InsideController.$ipChange.getHeight()));
                }
                InsideController.b(InsideController.this, i);
                InsideController.a(InsideController.this, i);
                InsideController insideController10 = InsideController.this;
                for (eld eldVar : InsideController.$ipChange) {
                    InsideController insideController11 = InsideController.this;
                    eldVar.a(InsideController.$ipChange, i, f);
                }
            }
            InsideController insideController12 = InsideController.this;
            if (InsideController.$ipChange != null) {
                InsideController insideController13 = InsideController.this;
                InsideController.$ipChange.a(f, i);
            }
            InsideController.c(InsideController.this, i);
        }
    };
    private final InsideLinearLayout.IDetailAdapter K = new InsideLinearLayout.IDetailAdapter() { // from class: tb.ffg.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            InsideController.this = this;
        }

        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.IDetailAdapter
        public boolean isInTopState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b7910056", new Object[]{this})).booleanValue();
            }
            InsideController insideController = InsideController.this;
            return InsideController.$ipChange.b.k.f9420a.isOnTop();
        }

        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.IDetailAdapter
        public void finishActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f622f449", new Object[]{this});
            } else {
                InsideController.this.j();
            }
        }

        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.IDetailAdapter
        public boolean canExpandDetail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("79a5f286", new Object[]{this})).booleanValue();
            }
            InsideController insideController = InsideController.this;
            return InsideController.$ipChange;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
            if (com.taobao.android.detail.wrapper.inside.InsideController.this.a(1.0d) != false) goto L19;
         */
        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.taobao.android.detail.core.inside.InsideLinearLayout.InsideDetailState r7) {
            /*
                r6 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = tb.ffg.AnonymousClass6.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L15
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r6
                r1[r2] = r7
                java.lang.String r7 = "8e974ede"
                r0.ipc$dispatch(r7, r1)
                return
            L15:
                com.taobao.android.detail.core.inside.InsideLinearLayout$InsideDetailState r0 = com.taobao.android.detail.core.inside.InsideLinearLayout.InsideDetailState.FULL_SCREEN
                java.lang.String r0 = r0.name()
                java.lang.String r1 = r7.name()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L42
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                boolean r0 = com.taobao.android.detail.wrapper.inside.InsideController.o(r0)
                if (r0 != 0) goto L42
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                com.taobao.android.detail.core.inside.InsideLinearLayout r0 = com.taobao.android.detail.wrapper.inside.InsideController.d(r0)
                tb.ffg$6$1 r1 = new tb.ffg$6$1
                r1.<init>()
                r4 = 300(0x12c, double:1.48E-321)
                r0.postDelayed(r1, r4)
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                com.taobao.android.detail.wrapper.inside.InsideController.b(r0, r2)
            L42:
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                boolean r0 = com.taobao.android.detail.wrapper.inside.InsideController.l(r0)
                if (r0 != 0) goto L5c
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                boolean r0 = com.taobao.android.detail.wrapper.inside.InsideController.m(r0)
                if (r0 == 0) goto L90
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                boolean r0 = r0.a(r1)
                if (r0 == 0) goto L90
            L5c:
                com.taobao.android.detail.core.inside.InsideLinearLayout$InsideDetailState r0 = com.taobao.android.detail.core.inside.InsideLinearLayout.InsideDetailState.FULL_SCREEN
                java.lang.String r0 = r0.name()
                java.lang.String r1 = r7.name()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L77
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                android.view.View r0 = com.taobao.android.detail.wrapper.inside.InsideController.p(r0)
                r1 = 8
                r0.setVisibility(r1)
            L77:
                com.taobao.android.detail.core.inside.InsideLinearLayout$InsideDetailState r0 = com.taobao.android.detail.core.inside.InsideLinearLayout.InsideDetailState.HALF_SCREEN
                java.lang.String r0 = r0.name()
                java.lang.String r1 = r7.name()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L90
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                android.view.View r0 = com.taobao.android.detail.wrapper.inside.InsideController.p(r0)
                r0.setVisibility(r3)
            L90:
                r6.b(r7)
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                com.taobao.android.detail.core.inside.InsideLinearLayout$InsideDetailState r1 = com.taobao.android.detail.core.inside.InsideLinearLayout.InsideDetailState.HALF_SCREEN
                java.lang.String r1 = r1.name()
                java.lang.String r2 = r7.name()
                boolean r1 = r1.equals(r2)
                com.taobao.android.detail.wrapper.inside.InsideController.c(r0, r1)
                com.taobao.android.detail.wrapper.inside.InsideController r0 = com.taobao.android.detail.wrapper.inside.InsideController.this
                com.taobao.android.detail.wrapper.inside.InsideController.a(r0, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ffg.AnonymousClass6.a(com.taobao.android.detail.core.inside.InsideLinearLayout$InsideDetailState):void");
        }

        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.a
        public void b(InsideLinearLayout.InsideDetailState insideDetailState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f10a4df", new Object[]{this, insideDetailState});
            } else if (eip.T) {
            } else {
                InsideController.b(InsideController.this, insideDetailState.name());
            }
        }
    };

    static {
        kge.a(-1891104796);
    }

    public static /* synthetic */ void a(InsideController insideController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568656ee", new Object[]{insideController, new Integer(i)});
        } else {
            insideController.e(i);
        }
    }

    public static /* synthetic */ void a(InsideController insideController, InsideLinearLayout.InsideDetailState insideDetailState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec661ab", new Object[]{insideController, insideDetailState});
        } else {
            insideController.a(insideDetailState);
        }
    }

    public static /* synthetic */ void a(InsideController insideController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("344c393f", new Object[]{insideController, str});
        } else {
            insideController.b(str);
        }
    }

    public static /* synthetic */ boolean a(InsideController insideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("568696c3", new Object[]{insideController, new Boolean(z)})).booleanValue();
        }
        insideController.i = z;
        return z;
    }

    public static /* synthetic */ void b(InsideController insideController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a445ceef", new Object[]{insideController, new Integer(i)});
        } else {
            insideController.d(i);
        }
    }

    public static /* synthetic */ void b(InsideController insideController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fda35e", new Object[]{insideController, str});
        } else {
            insideController.a(str);
        }
    }

    public static /* synthetic */ boolean b(InsideController insideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4460ec4", new Object[]{insideController, new Boolean(z)})).booleanValue();
        }
        insideController.w = z;
        return z;
    }

    public static /* synthetic */ void c(InsideController insideController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20546f0", new Object[]{insideController, new Integer(i)});
        } else {
            insideController.f(i);
        }
    }

    public static /* synthetic */ void c(InsideController insideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20586c1", new Object[]{insideController, new Boolean(z)});
        } else {
            insideController.a(z);
        }
    }

    public InsideController(ffg.a aVar) {
        this.c = aVar.af();
        this.q = aVar;
        Uri data = this.c.getIntent().getData();
        this.f11409a = b(data);
        this.s = a(data);
        this.M = new PayReceiver(this.c);
        emu.a("com.taobao.android.detail.wrapper.inside.InsideController");
    }

    private egl a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egl) ipChange.ipc$dispatch("a11bc0fd", new Object[]{this, uri});
        }
        if (uri == null || fgu.b()) {
            return null;
        }
        this.t = uri.getQueryParameter("sourceToken");
        String str = this.t;
        if (str != null) {
            return egm.b(str);
        }
        return null;
    }

    private boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null || fgu.b() || J()) {
            i.d("InsideController", "not inside , data : " + uri + " is pad : " + J());
            return false;
        } else if (Boolean.TRUE.toString().equals(uri.getQueryParameter("insideDetail"))) {
            i.d("InsideController", "is inside , has insideDetail=true");
            return true;
        } else {
            String uri2 = uri.toString();
            if (!uri2.startsWith("http://h5.m.taobao.com/awp/core/detail/inside.htm") && !uri2.startsWith("https://h5.m.taobao.com/awp/core/detail/inside.htm")) {
                z = false;
            }
            i.d("InsideController", "is inside pathMatch : " + z);
            return z;
        }
    }

    private boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : eip.D && s.a();
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        activity.setTheme(this.f11409a ? R.style.Inside_Detail_Dialog_Activity : R.style.Theme_TaoDetail);
        fgu.a(activity);
        if (!this.f11409a) {
            fgu.b(activity);
        } else {
            this.b = fgu.a();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f11409a || m()) {
        } else {
            this.c.overridePendingTransition(0, 0);
            w();
            v();
            r();
            s();
            q();
            a(0);
            a(this.f11409a);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(1);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(2);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(3);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a(4);
        }
    }

    private void a(int i) {
        egl eglVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!this.f11409a || (eglVar = this.s) == null) {
        } else {
            if (i == 0) {
                eglVar.a();
            } else if (i == 1) {
                eglVar.b();
            } else if (i == 2) {
                eglVar.c();
            } else if (i == 3) {
                eglVar.d();
            } else if (i == 4) {
                eglVar.e();
            } else if (i != 5) {
            } else {
                eglVar.f();
            }
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.j.setInsideScrollListener(this.J);
        this.l.setOnClickListener(this.G);
        this.l.setContentDescription(this.c.getResources().getString(I() ? R.string.talkback_close_inside_99 : R.string.talkback_close_inside));
        this.m.setOnClickListener(this.G);
        this.m.setContentDescription(this.c.getResources().getString(I() ? R.string.talkback_close_inside_99 : R.string.talkback_close_inside));
        if (!eip.T) {
            return;
        }
        H();
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        try {
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.M, intentFilter);
        } catch (Throwable th) {
            i.a("InsideController", "registerPayReceiver error ", th);
        }
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.M);
        } catch (Throwable th) {
            i.a("InsideController", "unregisterPayReceiver error ", th);
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.e = A();
        this.d = B();
    }

    private void s() {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.x_detail_inside_layout, (ViewGroup) null);
        int b = fgu.b((Context) this.c) - fgu.c((Context) this.c);
        if (I()) {
            e = ((int) Math.ceil(b * (1.0f - this.c.f9411a.o))) + fgu.c((Context) this.c);
        } else {
            e = eme.e(this.c);
        }
        this.f = e;
        if (fgu.d()) {
            this.N = ad.a(f.a(), "inside_new_height");
            this.f = (int) (f.b(this.c) * (this.N ? 0.15f : 0.25f));
        }
        this.g = this.f;
        this.k = this.c.findViewById(R.id.pagegroup);
        this.k.setVisibility(4);
        this.k.setBackgroundResource(R.color.detail_transparent);
        this.j = (InsideLinearLayout) inflate.findViewById(R.id.x_detail_root_view);
        this.l = inflate.findViewById(R.id.x_detail_temp_view);
        this.l.setBackgroundResource(R.color.detail_transparent);
        this.m = inflate.findViewById(R.id.inside_detial_actionbar_shade_view);
        this.o = (ClipableFrameLayout) inflate.findViewById(R.id.top_round_corner_container);
        this.o.setNeedClipPath(true);
        ViewParent parent = this.k.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.k);
            this.o.addView(this.k);
        }
        if (!this.h) {
            t();
        } else {
            this.o.setVisibility(4);
            this.o.postDelayed(this.H, 300L);
        }
        this.c.setContentView(inflate);
        this.j.setDetailAdapter(this.K);
        this.j.addOnInsideStateChangedListener(this.K);
        this.j.setHalfScreenTopViewHeight(this.g);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.f11409a) {
        } else {
            this.h = true;
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        this.p = new ImageView(this.c);
        this.p.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.p.setImageDrawable(new c());
        this.o.addView(this.p, 0);
        this.e.setDuration(200L);
        this.o.startAnimation(this.e);
    }

    private InsideLinearLayout.InsideDetailState u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InsideLinearLayout.InsideDetailState) ipChange.ipc$dispatch("d62d8a90", new Object[]{this}) : this.j.getDetailState();
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        if (this.c.o() != null) {
            this.c.o().setVisibility(8);
        }
        this.c.getWindow().setLayout(-1, -1);
        this.c.getWindow().setGravity(80);
        if (this.q.ag() == null) {
            return;
        }
        this.q.ag().setAlpha(0.0f);
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (u() != InsideLinearLayout.InsideDetailState.HALF_SCREEN && u() != null) {
        } else {
            this.j.setHalfScreenTopViewHeight(i);
            this.j.notifyInsideDetailState(InsideLinearLayout.InsideDetailState.HALF_SCREEN);
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (this.c.f9411a == null || fgu.c()) {
        } else {
            this.c.f9411a.e();
        }
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        } else if (!this.f11409a || this.v) {
        } else {
            this.v = true;
            this.x = z;
            com.taobao.android.detail.datasdk.model.datamodel.node.c C = this.c.C();
            if (C != null && C.f10055a != null && fgu.a(eqb.c(C.f10055a)) == 1.0f) {
                return;
            }
            this.y = view;
            if (this.y == null) {
                return;
            }
            int f = prc.f(this.c);
            ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
            layoutParams.width = prc.f(this.c);
            if (this.x) {
                f = (int) (f + this.c.getResources().getDimension(R.dimen.main_pic_bottombar_height));
            }
            layoutParams.height = f;
            this.y.setLayoutParams(layoutParams);
            this.y.setLayoutParams(layoutParams);
            this.u = (RecyclerView) this.y.findViewById(R.id.mainpic_view_pager);
            RecyclerView recyclerView = this.u;
            if (recyclerView == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            layoutParams2.width = prc.f(this.c);
            layoutParams2.height = prc.f(this.c);
            this.u.setLayoutParams(layoutParams2);
            this.u.requestLayout();
        }
    }

    private void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        this.z = view;
        this.B = i;
        ViewParent parent = this.z.getParent();
        this.A = parent instanceof View ? (View) parent : null;
        if (this.z == null || this.A == null) {
            return;
        }
        InsideLinearLayout.InsideDetailState u = u();
        ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i);
        }
        ViewGroup.LayoutParams layoutParams2 = this.A.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(-1, i);
        }
        if (InsideLinearLayout.InsideDetailState.FULL_SCREEN == u) {
            layoutParams.height = i;
            layoutParams2.height = i;
            c(i);
        } else if (InsideLinearLayout.InsideDetailState.HALF_SCREEN == u) {
            layoutParams.height = bay.b();
            layoutParams2.height = bay.b();
        }
        this.z.setLayoutParams(layoutParams);
        this.z.requestLayout();
        this.A.setLayoutParams(layoutParams2);
        this.A.requestLayout();
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        for (eld eldVar : this.F) {
            eldVar.a(i);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.f11409a) {
        } else {
            this.i = false;
            if (C() && this.c.getIntent() != null && this.c.getIntent().getData() != null) {
                l();
                return;
            }
            this.r = (DetailRecyclerView) this.c.findViewById(R.id.mainpage2);
            this.o.setNeedClipPath(this.c.F());
            com.taobao.android.detail.datasdk.model.datamodel.node.c C = this.c.C();
            this.n = (C == null || C.f10055a == null || !fgv.a(this.c, C.f10055a)) ? false : true;
            this.I = E();
            if (this.c.b != null && this.c.b.k != null && this.c.b.k.f9420a != null) {
                a(this.c.b.k.f9420a);
            }
            x();
            y();
            if (fgu.d()) {
                L();
            }
            if (this.C) {
                return;
            }
            this.C = true;
            View view = this.k;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            if (!eip.T) {
                a(InsideLinearLayout.InsideDetailState.INSIDE_CREATE.name());
            }
            z();
        }
    }

    private void L() {
        b bVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c C = this.c.C();
        if (C == null || (bVar = C.f10055a) == null || bVar.n()) {
            return;
        }
        if (eqb.f(C.f10055a) != null && eqb.f(C.f10055a).insideNewHeight) {
            z = true;
        }
        ad.a(f.a(), "inside_new_height", z);
    }

    private void a(NestedScrollContainer nestedScrollContainer) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4e745a", new Object[]{this, nestedScrollContainer});
            return;
        }
        List<com.taobao.android.detail.core.detail.widget.container.c> scrollChildList = nestedScrollContainer.getScrollChildList();
        if (scrollChildList == null || scrollChildList.isEmpty()) {
            return;
        }
        com.taobao.android.detail.core.detail.widget.container.c cVar = null;
        Iterator<com.taobao.android.detail.core.detail.widget.container.c> it = scrollChildList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.taobao.android.detail.core.detail.widget.container.c next = it.next();
            if (next instanceof dxz) {
                cVar = next;
                break;
            }
        }
        if (cVar == null || (height = this.j.getHeight()) == 0) {
            return;
        }
        nestedScrollContainer.setChildHeight(height, cVar);
    }

    private void x() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        ImageView imageView = this.p;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        if (G() && this.q.ag() != null) {
            z = true;
        }
        if (!z) {
            return;
        }
        ((FrameLayout.LayoutParams) this.p.getLayoutParams()).topMargin = emh.a(this.c);
    }

    private void y() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        boolean z2 = G() && this.q.ag() != null;
        if (!E() || !a(1.0d)) {
            z = false;
        }
        int i = 8;
        if (z2 || z) {
            int a2 = emh.a(this.c);
            this.g = z2 ? this.f - a2 : this.f;
            View view = this.m;
            if (u() == InsideLinearLayout.InsideDetailState.HALF_SCREEN) {
                i = 0;
            }
            view.setVisibility(i);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            marginLayoutParams.height = a2;
            marginLayoutParams.topMargin = this.g;
            this.m.setLayoutParams(marginLayoutParams);
            b(this.g);
            return;
        }
        this.m.setVisibility(8);
        this.g = this.f;
        b(this.g);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.f11409a) {
        } else {
            this.c.overridePendingTransition(0, 0);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.f11409a) {
        } else {
            InsideLinearLayout insideLinearLayout = this.j;
            if (insideLinearLayout != null) {
                insideLinearLayout.release();
            }
            View view = this.l;
            if (view != null) {
                view.setOnClickListener(null);
            }
            View view2 = this.m;
            if (view2 != null) {
                view2.setOnClickListener(null);
            }
            ClipableFrameLayout clipableFrameLayout = this.o;
            if (clipableFrameLayout != null) {
                clipableFrameLayout.clearAnimation();
                this.o.removeCallbacks(this.H);
            }
            if (eip.T) {
                K();
            }
            a(5);
            b(IAKPopRender.LifecycleType.BEFORE_CLOSE);
            this.F.clear();
        }
    }

    public void j() {
        Animation animation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.D = true;
        if (!eip.T) {
            a(InsideLinearLayout.InsideDetailState.INSIDE_DESTROY.name());
        }
        ClipableFrameLayout clipableFrameLayout = this.o;
        if (clipableFrameLayout == null || (animation = this.d) == null) {
            return;
        }
        clipableFrameLayout.startAnimation(animation);
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        dya y = this.c.y();
        if (y.k == null || y.k.l() == null) {
            return;
        }
        dyf l = y.k.l();
        if (!(l instanceof fad)) {
            return;
        }
        ((fad) l).r();
    }

    private Animation A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("c226dce", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setAnimationListener(new d() { // from class: tb.ffg.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                InsideController.this = this;
            }

            @Override // com.taobao.android.sku.widget.d, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                } else {
                    InsideController.a(InsideController.this, IAKPopRender.LifecycleType.IN_ANIMATION_START);
                }
            }

            @Override // com.taobao.android.sku.widget.d, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                InsideController.a(InsideController.this, IAKPopRender.LifecycleType.IN_ANIMATION_END);
                InsideController insideController = InsideController.this;
                InsideController.$ipChange.notifyInsideDetailState(InsideLinearLayout.InsideDetailState.HALF_SCREEN);
            }
        });
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    private Animation B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("6d750a6d", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        translateAnimation.setAnimationListener(new d() { // from class: tb.ffg.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                InsideController.this = this;
            }

            @Override // com.taobao.android.sku.widget.d, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                } else {
                    InsideController.a(InsideController.this, IAKPopRender.LifecycleType.OUT_ANIMATION_START);
                }
            }

            @Override // com.taobao.android.sku.widget.d, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                InsideController insideController = InsideController.this;
                InsideController.$ipChange.setVisibility(4);
                InsideController.a(InsideController.this, IAKPopRender.LifecycleType.OUT_ANIMATION_END);
                InsideController insideController2 = InsideController.this;
                InsideController.$ipChange.ap();
            }
        });
        return translateAnimation;
    }

    private boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (this.c.C() == null || this.c.C().f10055a == null) {
            return false;
        }
        return !D() || F();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.f11409a;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.f11409a || this.c.getIntent() == null || this.c.getIntent().getData() == null) {
        } else {
            Nav.from(this.c).toUri(c(this.c.getIntent().getData()));
            this.c.finish();
        }
    }

    private String c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6767f723", new Object[]{this, uri});
        }
        Uri.Builder path = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath().replace("/inside", ""));
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                if (!"insideDetail".equals(str) && !"99tm".equals(str)) {
                    path.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
        }
        path.fragment(uri.getFragment());
        return path.build().toString();
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.f11409a && this.b && this.c.getIntent() != null && this.c.getIntent().getData() != null;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("AliXDetailLiveMiniContainerStatusChange");
        intent.putExtra("scene", str);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.c).sendBroadcast(intent);
    }

    private boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        boolean F = this.c.F();
        com.taobao.android.detail.datasdk.model.datamodel.node.c C = this.c.C();
        boolean z = !this.c.F() && C.f10055a != null && C.f10055a.b;
        boolean a2 = fgv.a(this.c, C.f10055a);
        return E() || (F && a2) || (z && a2);
    }

    private boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        boolean F = this.c.F();
        com.taobao.android.detail.datasdk.model.datamodel.node.c C = this.c.C();
        return !this.c.J() && F && (C != null && C.f10055a != null && eqb.f(C.f10055a) != null && eqb.f(C.f10055a).industryMainPic);
    }

    private boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c C = this.c.C();
        if (C != null && C.f10055a != null) {
            return ((FeatureInsideExtNode) C.f10055a.b("feature", FeatureInsideExtNode.class)).insideDowngrade;
        }
        return false;
    }

    private boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : !this.c.an() && (this.c.C() == null || !this.c.C().A()) && !E();
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (!this.n || this.y == null || this.u == null || fgu.a(eqb.c(this.c.C().f10055a)) == 1.0f) {
        } else {
            DetailActivity detailActivity = this.c;
            int i2 = this.g;
            int a2 = (int) (((fgu.a(detailActivity, eqb.c(detailActivity.C().f10055a)) - prc.f(this.c)) / i2) * (i2 - i));
            ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
            int f = prc.f(this.c) + a2;
            layoutParams.width = prc.f(this.c);
            layoutParams.height = this.x ? (int) (f + this.c.getResources().getDimension(R.dimen.main_pic_bottombar_height)) : f;
            this.y.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.u.getLayoutParams();
            layoutParams2.width = prc.f(this.c);
            layoutParams2.height = f;
            this.u.setLayoutParams(layoutParams2);
            this.u.requestLayout();
        }
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else if (!this.f11409a || this.z == null || this.A == null) {
        } else {
            int b = ((int) ((this.B - bay.b()) * (1.0f - ((i * 1.0f) / this.g)))) + bay.b();
            ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, b);
            }
            ViewGroup.LayoutParams layoutParams2 = this.A.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-1, b);
            }
            layoutParams.height = b;
            layoutParams2.height = b;
            this.z.setLayoutParams(layoutParams);
            this.z.requestLayout();
            this.A.setLayoutParams(layoutParams2);
            this.A.requestLayout();
        }
    }

    private void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        Activity parent = this.c.getParent();
        if (!(parent instanceof fmf)) {
            return;
        }
        int width = this.j.getWidth();
        int height = this.j.getHeight();
        this.L.clear();
        this.L.put("x", (Object) Integer.valueOf(this.o.getLeft()));
        this.L.put("y", (Object) Integer.valueOf(i));
        this.L.put("w", (Object) Integer.valueOf(width));
        this.L.put("h", (Object) Integer.valueOf(height - i));
        ((fmf) parent).a(this.L);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Activity parent = this.c.getParent();
        if (!(parent instanceof fmf)) {
            return;
        }
        ((fmf) parent).a(str, null);
    }

    private void a(InsideLinearLayout.InsideDetailState insideDetailState) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e974ede", new Object[]{this, insideDetailState});
            return;
        }
        Activity parent = this.c.getParent();
        if (!(parent instanceof fmf)) {
            return;
        }
        int width = this.j.getWidth();
        int height = this.j.getHeight();
        fmf fmfVar = (fmf) parent;
        if (InsideLinearLayout.InsideDetailState.HALF_SCREEN == insideDetailState) {
            i = this.g;
            height = this.j.getHeight() - i;
            str = IAKPopRender.WindowState.STD_POP_HALF;
        } else {
            str = InsideLinearLayout.InsideDetailState.FULL_SCREEN == insideDetailState ? IAKPopRender.WindowState.STD_POP_FULL_SCREEN : IAKPopRender.WindowState.STD_POP_UNDEFINED;
            i = 0;
        }
        this.L.clear();
        this.L.put("x", (Object) 0);
        this.L.put("y", (Object) Integer.valueOf(i));
        this.L.put("w", (Object) Integer.valueOf(width));
        this.L.put("h", (Object) Integer.valueOf(height));
        fmfVar.b(str, this.L);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ViewPager U = this.c.U();
        if (!(U instanceof DetailViewPager)) {
            return;
        }
        ((DetailViewPager) U).setDisableHorizontalScroll(z);
    }

    public void a(InsideLinearLayout.a aVar) {
        InsideLinearLayout insideLinearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1a7261", new Object[]{this, aVar});
        } else if (!this.f11409a || (insideLinearLayout = this.j) == null) {
        } else {
            insideLinearLayout.addOnInsideStateChangedListener(aVar);
        }
    }

    public void b(InsideLinearLayout.a aVar) {
        InsideLinearLayout insideLinearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d9ea62", new Object[]{this, aVar});
        } else if (!this.f11409a || (insideLinearLayout = this.j) == null) {
        } else {
            insideLinearLayout.removeOnInsideStateChangedListener(aVar);
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.f11409a;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        if (!this.f11409a) {
            return 3;
        }
        String name = u().name();
        if (InsideLinearLayout.InsideDetailState.FULL_SCREEN.name().equals(name)) {
            return 3;
        }
        if (InsideLinearLayout.InsideDetailState.HALF_SCREEN.name().equals(name)) {
        }
        return 1;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        if (this.f11409a) {
            return this.B;
        }
        return 0;
    }

    public boolean a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue() : this.q.ah() == ((double) f);
    }

    public void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (!this.f11409a || this.E == i2) {
        } else {
            this.E = i2;
            a(view, i2);
        }
    }

    public void a(eld eldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70ec51b", new Object[]{this, eldVar});
        } else if (!this.f11409a || this.F.contains(eldVar)) {
        } else {
            this.F.add(eldVar);
        }
    }

    public void b(eld eldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d591cb9c", new Object[]{this, eldVar});
        } else if (!this.f11409a) {
        } else {
            this.F.remove(eldVar);
        }
    }

    public boolean a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a82180da", new Object[]{this, new Double(d)})).booleanValue() : Double.compare(this.q.ah(), d) == 0;
    }

    private boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.c.f9411a != null && this.c.f9411a.n;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (I() || this.j.getHeight() == 0 || u() == InsideLinearLayout.InsideDetailState.FULL_SCREEN) {
        } else {
            this.f = (int) (i2 * (this.N ? 0.15f : 0.25f));
            this.g = this.f;
            b(this.g);
        }
    }

    /* loaded from: classes5.dex */
    public static class PayReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private DetailCoreActivity f11410a;

        static {
            kge.a(-110292521);
        }

        public PayReceiver(DetailCoreActivity detailCoreActivity) {
            this.f11410a = detailCoreActivity;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DetailCoreActivity detailCoreActivity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!eip.T || (detailCoreActivity = this.f11410a) == null || detailCoreActivity.isFinishing()) {
            } else {
                this.f11410a.W();
            }
        }
    }
}
