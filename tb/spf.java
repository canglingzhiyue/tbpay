package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.tao.flexbox.layoutmanager.player.c;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public abstract class spf implements spg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f33804a;
    public final FluidContext b;
    public final boolean c;
    public final f d;
    private skf e;
    public ViewGroup g;
    public MultiTabLayout h;
    public FrameLayout i;
    public RotateAnimation j;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public odz s;
    public Drawable t = null;

    static {
        kge.a(-864863636);
        kge.a(-297375261);
    }

    public spf(Context context, f fVar, FluidContext fluidContext, ViewGroup viewGroup, boolean z) {
        this.b = fluidContext;
        this.f33804a = context;
        this.d = fVar;
        this.c = z;
        this.e = ((IContainerService) this.b.getService(IContainerService.class)).getContainer();
        a(viewGroup);
        m();
    }

    @Override // tb.spg
    public RotateAnimation a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RotateAnimation) ipChange.ipc$dispatch("ce529029", new Object[]{this}) : this.j;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.e.f();
    }

    public TUrlImageView q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("5538bc84", new Object[]{this}) : this.e.s();
    }

    public View r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aae7fb", new Object[]{this}) : this.e.t();
    }

    public View s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("50dc813c", new Object[]{this}) : this.e.u();
    }

    public ViewGroup t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6bf4c4ba", new Object[]{this}) : this.e.v();
    }

    public TUrlImageView u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("5a120800", new Object[]{this}) : this.e.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.sjq a(boolean r12, boolean r13) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.spf.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r12)
            r1[r2] = r3
            r12 = 2
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r13)
            r1[r12] = r2
            java.lang.String r12 = "16b816e4"
            java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
            tb.sjq r12 = (tb.sjq) r12
            return r12
        L25:
            android.content.Context r0 = r11.f33804a
            int r5 = tb.ohd.f(r0)
            tb.odz r0 = r11.s
            if (r0 == 0) goto L49
            int r0 = r0.e()
            if (r0 != 0) goto L3b
            android.content.Context r0 = r11.f33804a
            int r0 = tb.ohd.g(r0)
        L3b:
            if (r12 == 0) goto L42
            android.graphics.drawable.Drawable r1 = r11.t
            if (r1 != 0) goto L42
            goto L56
        L42:
            android.content.Context r1 = r11.f33804a
            int r1 = tb.ohd.h(r1)
            goto L55
        L49:
            android.content.Context r0 = r11.f33804a
            int r0 = tb.ohd.g(r0)
            android.content.Context r1 = r11.f33804a
            int r1 = tb.ohd.h(r1)
        L55:
            int r0 = r0 - r1
        L56:
            r6 = r0
            if (r5 == 0) goto L66
            float r0 = (float) r6
            float r1 = (float) r5
            float r0 = r0 / r1
            r1 = 1073275790(0x3ff8e38e, float:1.9444444)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L64
            r3 = 1
        L64:
            r7 = r3
            goto L67
        L66:
            r7 = 0
        L67:
            if (r7 == 0) goto L72
            android.content.Context r0 = r11.f33804a
            com.taobao.android.fluid.core.FluidContext r1 = r11.b
            int r1 = tb.soi.b(r1)
            goto L7a
        L72:
            android.content.Context r0 = r11.f33804a
            com.taobao.android.fluid.core.FluidContext r1 = r11.b
            int r1 = tb.soi.a(r1)
        L7a:
            int r0 = tb.ohd.a(r0, r1)
            r8 = r0
            com.taobao.android.fluid.core.FluidContext r0 = r11.b
            com.taobao.android.fluid.core.FluidInstanceConfig r0 = r0.getInstanceConfig()
            int r0 = r0.getTransferAnimationHeight()
            com.taobao.android.fluid.core.FluidContext r1 = r11.b
            com.taobao.android.fluid.core.FluidInstanceConfig r1 = r1.getInstanceConfig()
            int r1 = r1.getTransferAnimationWidth()
            if (r0 == 0) goto L9d
            if (r1 == 0) goto L9d
            tb.sjq r12 = new tb.sjq
            r12.<init>(r1, r0)
            goto Lcd
        L9d:
            if (r12 == 0) goto Lb3
            android.graphics.drawable.Drawable r12 = r11.t
            if (r12 == 0) goto Lb3
            tb.sjq r0 = new tb.sjq
            int r12 = r12.getIntrinsicWidth()
            android.graphics.drawable.Drawable r1 = r11.t
            int r1 = r1.getIntrinsicHeight()
            r0.<init>(r12, r1)
            goto Lc6
        Lb3:
            tb.odz r12 = r11.s
            if (r12 == 0) goto Lc8
            tb.sjq r0 = new tb.sjq
            int r12 = r12.a()
            tb.odz r1 = r11.s
            int r1 = r1.b()
            r0.<init>(r12, r1)
        Lc6:
            r12 = r0
            goto Lcd
        Lc8:
            tb.sjq r12 = new tb.sjq
            r12.<init>(r5, r6)
        Lcd:
            com.taobao.android.fluid.core.FluidContext r4 = r11.b
            r9 = r12
            r10 = r13
            tb.sjs.a(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.spf.a(boolean, boolean):tb.sjq");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String l = l();
        bl e = b.a().e(l);
        boolean a2 = b.a().a(l);
        if (e != null && a2) {
            c.a().a(true, b.a().b(l));
            b.a().b();
        }
        spv.a().a(l);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        View s = s();
        ViewGroup.LayoutParams layoutParams = s.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ohd.a(s.getContext(), 360);
            s.setLayoutParams(layoutParams);
        }
        View r = r();
        ViewGroup.LayoutParams layoutParams2 = r.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = obx.a(r.getContext(), 50.0f);
            r.setLayoutParams(layoutParams2);
        }
        s.setVisibility(8);
        r.setVisibility(8);
    }

    public void d() {
        boolean z;
        Context context;
        int a2;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String l = l();
        spw b = spv.a().b(l);
        if (b == null) {
            f();
            return;
        }
        final sjq b2 = b.b();
        if (b2 == null) {
            f();
            return;
        }
        snv c = spv.a().c(l);
        if (c == null) {
            f();
            return;
        }
        final ViewGroup f = c.f();
        if (f == null) {
            f();
            return;
        }
        int f2 = ohd.f(this.f33804a);
        int g = ohd.g(this.f33804a) - ohd.h(this.f33804a);
        if (f2 != 0) {
            if (g / f2 < 1.9444444f) {
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        if (z) {
            context = this.f33804a;
            a2 = soi.b(this.b);
        } else {
            context = this.f33804a;
            a2 = soi.a(this.b);
        }
        sjs.a(this.b, f2, g, z, ohd.a(context, a2), b2, false);
        c.a(b2.d, b2.l == 0 ? b2.c : b2.l);
        c.a(com.taobao.android.fluid.framework.mute.helper.f.g(this.b));
        this.h.setBackgroundColor(0);
        c().setBackgroundColor(0);
        a(false);
        this.g.post(new Runnable() { // from class: tb.spf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                spz.a(spc.QUICK_OPEN_TAG, "inner view post getContentView().post");
                if (((ILifecycleService) spf.this.b.getService(ILifecycleService.class)).getPageState() == 5) {
                    spf.this.b();
                    return;
                }
                if (f.getParent() != null) {
                    ((ViewGroup) f.getParent()).removeView(f);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2.d, b2.c);
                layoutParams.topMargin = b2.e;
                layoutParams.width = b2.d;
                layoutParams.height = b2.c;
                spf.this.c().getLayoutParams().height = b2.c;
                spf.this.i.getLayoutParams().height = b2.c;
                spf.this.i.addView(f, 0, layoutParams);
                ((IQuickOpenService) spf.this.b.getService(IQuickOpenService.class)).setLoadingImage(spf.this.q());
                ((ISharePlayerService) spf.this.b.getService(ISharePlayerService.class)).setHasShowInnerSharePlayerPV(true);
                spv.a().b(true);
                ((IQuickOpenService) spf.this.b.getService(IQuickOpenService.class)).onAnimationEnd();
                spf.this.j();
            }
        });
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        t().setVisibility(0);
        TUrlImageView u = u();
        u.setVisibility(0);
        u.setImageDrawable(this.f33804a.getResources().getDrawable(R.drawable.fluid_sdk_whiteloading));
        int a2 = obx.a(this.f33804a, 40.0f);
        ViewGroup.LayoutParams layoutParams = u.getLayoutParams();
        layoutParams.width = a2;
        layoutParams.height = a2;
        u.setLayoutParams(layoutParams);
        this.j = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.j.setInterpolator(new LinearInterpolator());
        this.j.setDuration(1000L);
        this.j.setRepeatCount(-1);
        u.startAnimation(this.j);
        o();
        ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).onAnimationEnd();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (spj.b(this.b)) {
            if (spj.d(this.b)) {
                if (!p()) {
                    TUrlImageView q = q();
                    q.setImageDrawable(this.f33804a.getResources().getDrawable(R.drawable.fluid_sdk_tab3_loading));
                    int a2 = obx.a(this.f33804a, 35.0f);
                    ViewGroup.LayoutParams layoutParams = q.getLayoutParams();
                    layoutParams.width = a2;
                    layoutParams.height = a2;
                    q.setLayoutParams(layoutParams);
                    this.j = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    this.j.setInterpolator(new LinearInterpolator());
                    this.j.setDuration(1000L);
                    this.j.setRepeatCount(-1);
                    q.startAnimation(this.j);
                    spz.a("DefaultFluidInstance", "动画开始");
                }
            } else {
                TUrlImageView q2 = q();
                q2.setStrategyConfig(FluidSDK.getImageAdapter().getImageStrategyConfig());
                q2.setImageUrl(obw.FOLLOW_TAB_VIDEO_GUANGGUANG_LOADING);
            }
        } else {
            ImageStrategyConfig imageStrategyConfig = FluidSDK.getImageAdapter().getImageStrategyConfig();
            TUrlImageView q3 = q();
            q3.setStrategyConfig(imageStrategyConfig);
            q3.setImageUrl(obw.FOLLOW_TAB_VIDEO_LOADING);
        }
        o();
        ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).onAnimationEnd();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        odz odzVar = this.s;
        if (odzVar == null) {
            return;
        }
        if (odzVar.g() != null && (!this.p || this.q)) {
            this.t = this.s.g();
        }
        TUrlImageView q = q();
        if (this.t == null && this.s.h() != null) {
            q.setStrategyConfig(FluidSDK.getImageAdapter().getImageStrategyConfig());
            q.setImageUrl(this.s.h());
            return;
        }
        q.setImageDrawable(this.t);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.h.setBackgroundColor(0);
        c().setBackgroundColor(0);
        a(true);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        bl e = b.a().e(l());
        if (e == null) {
            spz.c(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim TBHighPerformanceDWInstance为null return");
            f();
            return;
        }
        ViewGroup l = e.l();
        if (l == null) {
            spz.c(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim videoView为null return");
            f();
            return;
        }
        sjq a2 = a(false, true);
        e.e(com.taobao.android.fluid.framework.mute.helper.f.g(this.b));
        a(l, a2, e, false);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.h.setBackgroundColor(-16777216);
        c().setBackgroundColor(-16777216);
        s().setVisibility(8);
        View r = r();
        ViewGroup.LayoutParams layoutParams = r.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = obx.a(r.getContext(), 50.0f);
        r.setLayoutParams(layoutParams);
    }

    private String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.b.getInstanceConfig().getPreCoverKey();
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        String l = l();
        this.o = this.b.getInstanceConfig().isNeedTransferAnimation();
        this.s = ody.a().a(l);
        if (this.s == null) {
            this.s = this.b.getInstanceConfig().getCoverObject();
        }
        odz odzVar = this.s;
        if (odzVar != null) {
            this.t = odzVar.c();
        }
        this.p = b.a().a(l);
        this.q = b.a().c(l);
        this.r = spv.a().e(l);
        ((ICardService) this.b.getService(ICardService.class)).getConfig().b(this.p);
        if (!(this.d instanceof FullPage)) {
            return;
        }
        v();
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        odz odzVar = this.s;
        if (odzVar != null && !(this.t == null && odzVar.h() == null) && (!this.p || this.q)) {
            ((FullPage) this.d).setSelfTransitionExecuted(true);
        } else if (this.s != null && this.p) {
            ((FullPage) this.d).setSelfTransitionExecuted(true);
        } else {
            ((FullPage) this.d).setSelfTransitionExecuted(false);
        }
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.g = viewGroup;
        this.h = (MultiTabLayout) this.g.findViewById(R.id.multi_tab_layout);
        this.i = (FrameLayout) this.g.findViewById(R.id.tab_anim_layout);
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableTab3HideLoading", true);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        Context context = this.f33804a;
        if (context instanceof Activity) {
            oha.b((Activity) context, -16777216);
        } else {
            FluidException.throwException(this.b, FluidInstance.INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY);
        }
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        n();
        return false;
    }
}
