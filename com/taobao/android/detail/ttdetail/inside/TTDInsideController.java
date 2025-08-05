package com.taobao.android.detail.ttdetail.inside;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail.ttdetail.bizmessage.m;
import com.taobao.android.detail.ttdetail.communication.f;
import com.taobao.android.detail.ttdetail.component.module.u;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import com.taobao.android.detail.ttdetail.inside.InsideLinearLayout;
import com.taobao.android.detail.ttdetail.utils.ad;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.android.sku.widget.d;
import com.taobao.taobao.R;
import tb.eyx;
import tb.fmf;
import tb.kge;
import tb.shq;
import tb.sol;
import tb.soy;

/* loaded from: classes5.dex */
public class TTDInsideController implements f<m, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final eyx f10757a;
    private Activity b;
    private FrameLayout c;
    private InsideLinearLayout d;
    private ClipableFrameLayout e;
    private b f;
    private PayReceiver g;
    private int i;
    private soy j;
    private sol k;
    private u l;
    private Animation q;
    private boolean r;
    private a s;
    private boolean t;
    private shq u;
    private InsideLinearLayout.a v;
    private final JSONObject h = new JSONObject();
    private float o = 1.0f;
    private Handler p = new Handler(Looper.getMainLooper());
    private final InsideLinearLayout.InsideScrollListener m = new InsideLinearLayout.InsideScrollListener() { // from class: com.taobao.android.detail.ttdetail.inside.TTDInsideController.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.InsideScrollListener
        public void insideViewScroll(int i) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9331052e", new Object[]{this, new Integer(i)});
                return;
            }
            float d = 1.0f - (i / TTDInsideController.d(TTDInsideController.this));
            ClipableFrameLayout b = TTDInsideController.b(TTDInsideController.this);
            if (i <= 3) {
                z = false;
            }
            b.setNeedClipPath(z);
            if (TTDInsideController.e(TTDInsideController.this) != null) {
                TTDInsideController.e(TTDInsideController.this).b(1.0f - d);
            }
            TTDInsideController.a(TTDInsideController.this, 1.0f - d);
            if (TTDInsideController.f(TTDInsideController.this) != null) {
                TTDInsideController.f(TTDInsideController.this).b(TTDInsideController.g(TTDInsideController.this));
            }
            if (TTDInsideController.h(TTDInsideController.this) != null) {
                TTDInsideController.h(TTDInsideController.this).a(d, i);
            }
            if (TTDInsideController.i(TTDInsideController.this) == null) {
                i.a("InsideController", "mTopBarrageController is null");
            } else if (TTDInsideController.a(TTDInsideController.this).getDetailState().equals(InsideLinearLayout.InsideDetailState.HALF_SCREEN)) {
                TTDInsideController.i(TTDInsideController.this).a(i);
            }
            TTDInsideController.a(TTDInsideController.this, i);
        }
    };
    private final InsideLinearLayout.IDetailAdapter n = new InsideLinearLayout.IDetailAdapter() { // from class: com.taobao.android.detail.ttdetail.inside.TTDInsideController.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.IDetailAdapter
        public boolean isInTopState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b7910056", new Object[]{this})).booleanValue();
            }
            if (TTDInsideController.j(TTDInsideController.this) != null) {
                return TTDInsideController.j(TTDInsideController.this).a();
            }
            return false;
        }

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.a
        public void a(InsideLinearLayout.InsideDetailState insideDetailState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94fcc36c", new Object[]{this, insideDetailState});
                return;
            }
            TTDInsideController.b(TTDInsideController.this, InsideLinearLayout.InsideDetailState.HALF_SCREEN.name().equals(insideDetailState.name()));
            TTDInsideController.c(TTDInsideController.this, InsideLinearLayout.InsideDetailState.FULL_SCREEN.name().equals(insideDetailState.name()));
            TTDInsideController.a(TTDInsideController.this, insideDetailState);
            if (TTDInsideController.i(TTDInsideController.this) == null || !InsideLinearLayout.InsideDetailState.FULL_SCREEN.equals(insideDetailState)) {
                return;
            }
            TTDInsideController.i(TTDInsideController.this).b();
            TTDInsideController.i(TTDInsideController.this).c();
            if (TTDInsideController.k(TTDInsideController.this) == null) {
                i.a("InsideController", "半屏详情状态外部监听为空");
            } else {
                TTDInsideController.k(TTDInsideController.this).a(insideDetailState);
            }
        }
    };

    /* loaded from: classes5.dex */
    public interface a {
        void onPageClose();
    }

    static {
        kge.a(-16328100);
        kge.a(1548924286);
    }

    public static /* synthetic */ float a(TTDInsideController tTDInsideController, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7938a293", new Object[]{tTDInsideController, new Float(f)})).floatValue();
        }
        tTDInsideController.o = f;
        return f;
    }

    public static /* synthetic */ InsideLinearLayout a(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InsideLinearLayout) ipChange.ipc$dispatch("7e75549d", new Object[]{tTDInsideController}) : tTDInsideController.d;
    }

    public static /* synthetic */ void a(TTDInsideController tTDInsideController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7938ade6", new Object[]{tTDInsideController, new Integer(i)});
        } else {
            tTDInsideController.b(i);
        }
    }

    public static /* synthetic */ void a(TTDInsideController tTDInsideController, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb4a35a", new Object[]{tTDInsideController, animator});
        } else {
            tTDInsideController.a(animator);
        }
    }

    public static /* synthetic */ void a(TTDInsideController tTDInsideController, InsideLinearLayout.InsideDetailState insideDetailState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ad41c1", new Object[]{tTDInsideController, insideDetailState});
        } else {
            tTDInsideController.a(insideDetailState);
        }
    }

    public static /* synthetic */ void a(TTDInsideController tTDInsideController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb23b147", new Object[]{tTDInsideController, str});
        } else {
            tTDInsideController.a(str);
        }
    }

    public static /* synthetic */ boolean a(TTDInsideController tTDInsideController, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7938edbb", new Object[]{tTDInsideController, new Boolean(z)})).booleanValue() : tTDInsideController.a(z);
    }

    public static /* synthetic */ ClipableFrameLayout b(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClipableFrameLayout) ipChange.ipc$dispatch("4dc187e0", new Object[]{tTDInsideController}) : tTDInsideController.e;
    }

    public static /* synthetic */ void b(TTDInsideController tTDInsideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8a7d38", new Object[]{tTDInsideController, new Boolean(z)});
        } else {
            tTDInsideController.b(z);
        }
    }

    public static /* synthetic */ void c(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660f557b", new Object[]{tTDInsideController});
        } else {
            tTDInsideController.r();
        }
    }

    public static /* synthetic */ void c(TTDInsideController tTDInsideController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bdc0cb9", new Object[]{tTDInsideController, new Boolean(z)});
        } else {
            tTDInsideController.c(z);
        }
    }

    public static /* synthetic */ int d(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27d51cd", new Object[]{tTDInsideController})).intValue() : tTDInsideController.i;
    }

    public static /* synthetic */ u e(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u) ipChange.ipc$dispatch("f38d853", new Object[]{tTDInsideController}) : tTDInsideController.l;
    }

    public static /* synthetic */ soy f(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (soy) ipChange.ipc$dispatch("56c066f1", new Object[]{tTDInsideController}) : tTDInsideController.j;
    }

    public static /* synthetic */ float g(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7c746e7", new Object[]{tTDInsideController})).floatValue() : tTDInsideController.o;
    }

    public static /* synthetic */ b h(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b64281a5", new Object[]{tTDInsideController}) : tTDInsideController.f;
    }

    public static /* synthetic */ shq i(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shq) ipChange.ipc$dispatch("f1cacbf5", new Object[]{tTDInsideController}) : tTDInsideController.u;
    }

    public static /* synthetic */ sol j(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sol) ipChange.ipc$dispatch("25791062", new Object[]{tTDInsideController}) : tTDInsideController.k;
    }

    public static /* synthetic */ InsideLinearLayout.a k(TTDInsideController tTDInsideController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InsideLinearLayout.a) ipChange.ipc$dispatch("140fdc8a", new Object[]{tTDInsideController}) : tTDInsideController.v;
    }

    public TTDInsideController(eyx eyxVar) {
        this.f10757a = eyxVar;
        if (this.f10757a.g() instanceof Activity) {
            this.b = (Activity) this.f10757a.g();
            this.f = a(this.b.getIntent().getData());
        }
        a(this.f10757a.g());
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(context, m.class, this);
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.b(context, m.class);
        }
    }

    private b a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("765cdaae", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("sourceToken");
        if (queryParameter != null) {
            return c.a(queryParameter);
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g = new PayReceiver();
        o();
        l();
        i();
        b(true);
        Animation animation = this.q;
        if (animation != null) {
            this.e.startAnimation(animation);
        } else {
            a(IAKPopRender.LifecycleType.IN_ANIMATION_START);
        }
        a(0);
        if (!j.ad()) {
            return;
        }
        this.u = new shq(this.f10757a, t());
        this.u.a(BarrageFloatingView.BARRAGE_TYPE.INSIDE);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        if (i == 0) {
            bVar.a();
        } else if (i == 1) {
            bVar.b();
        } else if (i == 2) {
            bVar.c();
        } else if (i == 3) {
            bVar.d();
        } else if (i == 4) {
            bVar.e();
        } else if (i != 5) {
        } else {
            bVar.f();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.inside.TTDInsideController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TTDInsideController.a(TTDInsideController.this, true);
                }
            }
        });
        this.d.setOnCloseListener(new InsideLinearLayout.b() { // from class: com.taobao.android.detail.ttdetail.inside.TTDInsideController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.b
            public void onClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e155e360", new Object[]{this});
                } else {
                    TTDInsideController.a(TTDInsideController.this, true);
                }
            }
        });
        this.d.setInsideScrollListener(this.m);
        this.d.setDetailAdapter(this.n);
        this.d.addOnInsideStateChangedListener(this.n);
        j();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        try {
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.g, intentFilter);
        } catch (Throwable th) {
            i.a("InsideController", "registerPayReceiver error ", th);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.g);
        } catch (Throwable th) {
            i.a("InsideController", "unregisterPayReceiver error ", th);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        View findViewById = this.b.findViewById(R.id.tt_detail_inside_root);
        this.d = (InsideLinearLayout) findViewById;
        float f = 0.25f;
        this.i = (int) (com.taobao.android.detail.ttdetail.utils.f.b(this.b) * 0.25f);
        if (j.N()) {
            if (ad.a(com.taobao.android.detail.ttdetail.utils.f.a(), "inside_new_height")) {
                f = 0.15f;
            }
            this.i = (int) (com.taobao.android.detail.ttdetail.utils.f.b(this.b) * f);
        }
        this.c = (FrameLayout) findViewById.findViewById(R.id.tt_detail_inside_top_view);
        this.e = (ClipableFrameLayout) findViewById.findViewById(R.id.fl_tt_detail_inside_container);
        this.e.setNeedClipPath(true);
        this.d.setHalfScreenTopViewHeight(this.i);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sInsideWithStdPopAnim))) {
        } else {
            this.q = p();
        }
    }

    private Animation p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("ea4d2eff", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setAnimationListener(new d() { // from class: com.taobao.android.detail.ttdetail.inside.TTDInsideController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.sku.widget.d, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                } else {
                    TTDInsideController.a(TTDInsideController.this, IAKPopRender.LifecycleType.IN_ANIMATION_START);
                }
            }

            @Override // com.taobao.android.sku.widget.d, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                TTDInsideController.a(TTDInsideController.this, IAKPopRender.LifecycleType.IN_ANIMATION_END);
                TTDInsideController.a(TTDInsideController.this).notifyInsideDetailState(InsideLinearLayout.InsideDetailState.HALF_SCREEN, true);
            }
        });
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        ClipableFrameLayout clipableFrameLayout = this.e;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clipableFrameLayout, "translationY", clipableFrameLayout.getHeight());
        ofFloat.setDuration(250L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.ttdetail.inside.TTDInsideController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    TTDInsideController.a(TTDInsideController.this, IAKPopRender.LifecycleType.OUT_ANIMATION_START);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                i.a("TTDInsideController.onAnimationEnd");
                TTDInsideController.a(TTDInsideController.this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    return;
                }
                i.a("TTDInsideController.onAnimationCancel");
                TTDInsideController.a(TTDInsideController.this, animator);
            }
        });
        ofFloat.start();
    }

    private void a(final Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ed485", new Object[]{this, animator});
        } else if (animator == null) {
        } else {
            Runnable runnable = new Runnable() { // from class: com.taobao.android.detail.ttdetail.inside.TTDInsideController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TTDInsideController.b(TTDInsideController.this).setVisibility(4);
                    TTDInsideController.c(TTDInsideController.this);
                    animator.removeAllListeners();
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.p.post(runnable);
            }
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca419a0", new Object[]{this, aVar});
        } else {
            this.s = aVar;
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        a aVar = this.s;
        if (aVar == null) {
            return;
        }
        aVar.onPageClose();
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.r) {
            return true;
        }
        this.r = true;
        if (z && this.e != null) {
            shq shqVar = this.u;
            if (shqVar != null) {
                shqVar.b();
                this.u.c();
            }
            q();
        } else {
            if (z) {
                a(IAKPopRender.LifecycleType.OUT_ANIMATION_START);
            }
            r();
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (!this.t) {
            return a(true);
        }
        return false;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.d.release();
        shq shqVar = this.u;
        if (shqVar != null) {
            shqVar.b();
            this.u.c();
        }
        k();
        a(IAKPopRender.LifecycleType.OUT_ANIMATION_END);
        a(IAKPopRender.LifecycleType.BEFORE_CLOSE);
        a(5);
        b(this.f10757a.g());
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        l.a(this.b, b(this.b.getIntent().getData()));
        this.b.finish();
    }

    public InsideLinearLayout.InsideDetailState s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InsideLinearLayout.InsideDetailState) ipChange.ipc$dispatch("95f9660", new Object[]{this}) : this.d.getDetailState();
    }

    private String b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e66ffe2", new Object[]{this, uri});
        }
        Uri.Builder path = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath().replace("/inside", ""));
        for (String str : uri.getQueryParameterNames()) {
            if (!"insideDetail".equals(str) && !"99tm".equals(str)) {
                path.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        path.fragment(uri.getFragment());
        return path.build().toString();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (n()) {
            this.t = true;
            a(IAKPopRender.LifecycleType.OUT_ANIMATION_START);
            m();
        } else {
            soy soyVar = this.j;
            if (soyVar != null) {
                soyVar.b(this.o);
            }
            if (j.N() && !this.f10757a.a().c()) {
                ad.a(com.taobao.android.detail.ttdetail.utils.f.a(), "inside_new_height", a(this.f10757a));
            }
            if (this.u != null && InsideLinearLayout.InsideDetailState.HALF_SCREEN.equals(s())) {
                this.u.d();
            }
            if (this.l != null) {
                return;
            }
            this.l = (u) this.f10757a.b().a("headerPic");
            u uVar = this.l;
            if (uVar == null) {
                return;
            }
            uVar.b(1);
            this.l.b(1.0f);
            this.l.a(1.5384616f);
        }
    }

    private static boolean a(eyx eyxVar) {
        Feature feature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7cf0e18", new Object[]{eyxVar})).booleanValue();
        }
        if (eyxVar != null && (feature = (Feature) eyxVar.a().a(Feature.class)) != null) {
            return feature.isInsideNewHeight();
        }
        return false;
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        Feature feature = (Feature) this.f10757a.a().a(Feature.class);
        if (feature == null) {
            return false;
        }
        return feature.isInsideDowngrade();
    }

    public void a(InsideLinearLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e6c2ef", new Object[]{this, aVar});
        } else {
            this.v = aVar;
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        Activity parent = this.b.getParent();
        if (!(parent instanceof fmf)) {
            return;
        }
        int width = this.d.getWidth();
        int height = this.d.getHeight();
        this.h.clear();
        this.h.put("x", (Object) Integer.valueOf(this.e.getLeft()));
        this.h.put("y", (Object) Integer.valueOf(i));
        this.h.put("w", (Object) Integer.valueOf(width));
        this.h.put("h", (Object) Integer.valueOf(height - i));
        ((fmf) parent).a(this.h);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Activity parent = this.b.getParent();
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
            ipChange.ipc$dispatch("94fcc36c", new Object[]{this, insideDetailState});
            return;
        }
        Activity parent = this.b.getParent();
        if (!(parent instanceof fmf)) {
            return;
        }
        int width = this.d.getWidth();
        int height = this.d.getHeight();
        fmf fmfVar = (fmf) parent;
        if (InsideLinearLayout.InsideDetailState.HALF_SCREEN == insideDetailState) {
            i = this.i;
            height = this.d.getHeight() - i;
            str = IAKPopRender.WindowState.STD_POP_HALF;
        } else {
            str = InsideLinearLayout.InsideDetailState.FULL_SCREEN == insideDetailState ? IAKPopRender.WindowState.STD_POP_FULL_SCREEN : IAKPopRender.WindowState.STD_POP_UNDEFINED;
            i = 0;
        }
        this.h.clear();
        this.h.put("x", (Object) 0);
        this.h.put("y", (Object) Integer.valueOf(i));
        this.h.put("w", (Object) Integer.valueOf(width));
        this.h.put("h", (Object) Integer.valueOf(height));
        fmfVar.b(str, this.h);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(this.b, new com.taobao.android.detail.ttdetail.bizmessage.b(!z));
        }
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        u uVar = this.l;
        if (uVar == null || !z) {
            return;
        }
        uVar.a(0.0f);
        this.l.b(0.0f);
        this.l.b(0);
    }

    @Override // com.taobao.android.detail.ttdetail.communication.f
    public Boolean a(m mVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("bfc36c71", new Object[]{this, mVar});
        }
        if (InsideLinearLayout.InsideDetailState.HALF_SCREEN != this.d.getDetailState()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void a(soy soyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff26701b", new Object[]{this, soyVar});
        } else {
            this.j = soyVar;
        }
    }

    public void a(sol solVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff208748", new Object[]{this, solVar});
        } else {
            this.k = solVar;
        }
    }

    public FrameLayout t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6227d8fe", new Object[]{this});
        }
        if (this.c == null) {
            this.c = (FrameLayout) this.b.findViewById(R.id.tt_detail_inside_top_view);
            i.a("InsideController", "半屏弹幕视图为空");
        }
        return this.c;
    }

    /* loaded from: classes5.dex */
    public class PayReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(82571343);
        }

        public PayReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                TTDInsideController.a(TTDInsideController.this, false);
            }
        }
    }
}
