package com.taobao.android.detail2.core.framework.view.manager;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ali.user.open.ucc.UccResultCode;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail2.core.framework.base.weex.c;
import com.taobao.android.detail2.core.framework.base.weex.g;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.android.detail2.core.framework.view.navbar.m;
import com.taobao.android.detail2.core.framework.view.navbar.o;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.Map;
import java.util.UUID;
import tb.fjl;
import tb.fjp;
import tb.fjt;
import tb.fkt;
import tb.fmd;
import tb.fmt;
import tb.idk;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class NavBarViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private fmd b;
    private boolean c;
    private View d;
    private c e;
    private AliUrlImageView f;
    private TextView g;
    private a h;
    private com.taobao.android.detail2.core.framework.b i;
    private m j;
    private boolean n;
    private FrameLayout o;
    private View p;
    private View q;
    public boolean m = false;
    private long k = -1;
    private long l = -1;
    private d r = null;

    /* renamed from: a  reason: collision with root package name */
    private String f11608a = UUID.randomUUID().toString();

    /* loaded from: classes5.dex */
    public enum NavOperation {
        OPERATION_BACK
    }

    /* loaded from: classes5.dex */
    public interface a {
        void a(NavOperation navOperation);
    }

    static {
        kge.a(-1768781716);
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b a(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("37b6991a", new Object[]{navBarViewManager}) : navBarViewManager.i;
    }

    public static /* synthetic */ d a(NavBarViewManager navBarViewManager, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b8ef5f0b", new Object[]{navBarViewManager, dVar});
        }
        navBarViewManager.r = dVar;
        return dVar;
    }

    public static /* synthetic */ void a(NavBarViewManager navBarViewManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d0be87", new Object[]{navBarViewManager, view});
        } else {
            navBarViewManager.a(view);
        }
    }

    public static /* synthetic */ void a(NavBarViewManager navBarViewManager, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586d396e", new Object[]{navBarViewManager, frameLayout});
        } else {
            navBarViewManager.a(frameLayout);
        }
    }

    public static /* synthetic */ FrameLayout b(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("bf8446ad", new Object[]{navBarViewManager}) : navBarViewManager.o;
    }

    public static /* synthetic */ View c(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e758efef", new Object[]{navBarViewManager}) : navBarViewManager.p;
    }

    public static /* synthetic */ void d(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8cbb2e", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.k();
        }
    }

    public static /* synthetic */ void e(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b59d6f", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.g();
        }
    }

    public static /* synthetic */ d f(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("99e9793c", new Object[]{navBarViewManager}) : navBarViewManager.r;
    }

    public static /* synthetic */ View g(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a635bff3", new Object[]{navBarViewManager}) : navBarViewManager.q;
    }

    public static /* synthetic */ View h(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d5ecf3f4", new Object[]{navBarViewManager}) : navBarViewManager.d;
    }

    public static /* synthetic */ a i(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4576d929", new Object[]{navBarViewManager}) : navBarViewManager.h;
    }

    public static /* synthetic */ void j(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8208b4", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.m();
        }
    }

    public static /* synthetic */ long k(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("81aaeae9", new Object[]{navBarViewManager})).longValue() : navBarViewManager.k;
    }

    public static /* synthetic */ void l(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d3cd36", new Object[]{navBarViewManager});
        } else {
            navBarViewManager.i();
        }
    }

    public static /* synthetic */ fmd m(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("8764a652", new Object[]{navBarViewManager}) : navBarViewManager.b;
    }

    public static /* synthetic */ c n(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9883d516", new Object[]{navBarViewManager}) : navBarViewManager.e;
    }

    public static /* synthetic */ long o(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e4e73ed", new Object[]{navBarViewManager})).longValue() : navBarViewManager.l;
    }

    public static /* synthetic */ m p(NavBarViewManager navBarViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("8aa8b933", new Object[]{navBarViewManager}) : navBarViewManager.j;
    }

    public NavBarViewManager(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar) {
        boolean z = false;
        this.n = false;
        this.i = bVar;
        this.b = fmdVar;
        if (this.i.k() != null && this.i.k().c()) {
            if (fkt.aA() && !c(this.i.h().G())) {
                z = true;
            }
            this.n = z;
        }
        if (ipa.x()) {
            j();
        } else {
            f();
        }
        b();
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (this.i.n().aJ() <= 0) {
        } else {
            this.g = (TextView) view.findViewById(R.id.nav_back);
            int a2 = fjl.a(this.i.g(), this.i.n().aJ());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            int i = a2 << 1;
            int i2 = marginLayoutParams.width + i;
            int i3 = marginLayoutParams.height + i;
            if (i2 <= 0 || i2 > fjl.a(this.g.getContext(), 48.0f)) {
                return;
            }
            marginLayoutParams.width = i2;
            marginLayoutParams.height = i3;
            marginLayoutParams.leftMargin -= a2;
            marginLayoutParams.rightMargin -= a2;
            this.g.setLayoutParams(marginLayoutParams);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.o = (FrameLayout) this.b.c().findViewById(R.id.nav_container_root_frame_layout);
        FrameLayout frameLayout = this.o;
        if (frameLayout == null) {
            f();
            return;
        }
        this.d = frameLayout;
        if (idk.b()) {
            a(this.o);
        } else {
            ipa.e(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "fastDelayInitNavView";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (NavBarViewManager.a(NavBarViewManager.this) != null && ipa.a(NavBarViewManager.a(NavBarViewManager.this).g())) {
                    } else {
                        NavBarViewManager navBarViewManager = NavBarViewManager.this;
                        NavBarViewManager.a(navBarViewManager, NavBarViewManager.b(navBarViewManager));
                    }
                }

                @Override // tb.ipa.c
                public int c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : ipa.W();
                }
            });
        }
    }

    private void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
        } else if (frameLayout == null) {
            try {
                fjt.a(fjt.TAG_TIP, "parentLayout 为空，降级逻辑，初始化导航栏。");
                f();
            } catch (Exception e) {
                fjt.a(fjt.TAG_TIP, "Nav降级异常。", e);
            }
        } else {
            final Context context = frameLayout.getContext();
            TextView a2 = a(context);
            this.p = a2;
            this.p.setId(R.id.nav_back);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fjl.a(context, 24.0f), fjl.a(context, 24.0f));
            layoutParams.leftMargin = fjl.a(context, 12.0f);
            layoutParams.rightMargin = fjl.a(context, 15.0f);
            layoutParams.gravity = 16;
            this.p.setLayoutParams(layoutParams);
            frameLayout.addView(this.p, layoutParams);
            this.g = a2;
            l();
            int a3 = idk.a();
            if (a3 > 0) {
                a(a3);
            } else {
                idk.a((Runnable) new ipa.a() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ipa.c
                    public String b() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "preInitUIInfoTask-end-then-setImmersive2024";
                    }

                    @Override // tb.ipa.c
                    public void a() {
                        int a4;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (ipa.a(NavBarViewManager.c(NavBarViewManager.this).getContext()) || (a4 = idk.a()) <= 0) {
                        } else {
                            NavBarViewManager.this.a(a4);
                        }
                    }
                }, false);
            }
            b(this.b.c());
            ipa.c(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "initRightNav";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (ipa.a(context)) {
                    } else {
                        NavBarViewManager.d(NavBarViewManager.this);
                        NavBarViewManager.e(NavBarViewManager.this);
                        if (NavBarViewManager.f(NavBarViewManager.this) != null) {
                            NavBarViewManager navBarViewManager = NavBarViewManager.this;
                            navBarViewManager.a(NavBarViewManager.f(navBarViewManager));
                            NavBarViewManager.a(NavBarViewManager.this, (d) null);
                        }
                        if (!ipa.y() || NavBarViewManager.g(NavBarViewManager.this) == null) {
                            return;
                        }
                        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.001f, 1.0f);
                        NavBarViewManager.g(NavBarViewManager.this).setAlpha(0.001f);
                        ofFloat.setDuration(ipa.a("right_nav_anim_dura", (int) UccResultCode.NO_ACTION_BIND_FAILED));
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                } else {
                                    NavBarViewManager.g(NavBarViewManager.this).setAlpha(((Float) ofFloat.getAnimatedValue()).floatValue());
                                }
                            }
                        });
                        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.3.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationRepeat(Animator animator) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                } else if (ipa.a(NavBarViewManager.g(NavBarViewManager.this).getContext())) {
                                } else {
                                    NavBarViewManager.g(NavBarViewManager.this).setAlpha(1.0f);
                                }
                            }

                            @Override // android.animation.Animator.AnimatorListener
                            public void onAnimationCancel(Animator animator) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator});
                                } else {
                                    onAnimationEnd(animator);
                                }
                            }
                        });
                        ofFloat.start();
                    }
                }

                @Override // tb.ipa.c
                public int c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : ipa.Y();
                }
            });
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = new RecyclerView(this.o.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 21;
        recyclerView.setId(R.id.right_navibar_content_recyclerview);
        this.o.addView(recyclerView, layoutParams);
        this.q = recyclerView;
    }

    private TextView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("56ecd4", new Object[]{this, context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setTextSize(1, 21.0f);
        tIconFontTextView.setTextColor(-1);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        tIconFontTextView.setText(context.getString(R.string.uik_icon_back_android_light));
        return tIconFontTextView;
    }

    @Deprecated
    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        final View c = this.b.c();
        this.d = c.findViewById(R.id.nav_container);
        if (ipa.e() && !ipa.x()) {
            this.o = (FrameLayout) c.findViewById(R.id.nav_container_root_frame_layout);
            FrameLayout frameLayout = this.o;
            if (frameLayout != null) {
                this.o.addView(LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.detail_nav_container_layout_old, (ViewGroup) this.o, false), new FrameLayout.LayoutParams(-1, fjl.a(this.o.getContext(), 44.0f)));
                this.d = this.o;
            }
        }
        b(c);
        if (this.n && this.i.k() != null && this.i.k().c()) {
            this.d.setVisibility(8);
            this.i.k().a(new NewDetailMaskFrameLayout.b() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "NavBarViewManager.initView";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public long c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
                    }
                    return 1L;
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    NavBarViewManager.h(NavBarViewManager.this).setAlpha(0.001f);
                    NavBarViewManager.h(NavBarViewManager.this).setVisibility(0);
                    NavBarViewManager.a(NavBarViewManager.this, c);
                    NavBarViewManager.e(NavBarViewManager.this);
                    NavBarViewManager.this.c();
                }
            });
            this.i.k().a(new NewDetailMaskFrameLayout.b() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "mNavContainer.alpha";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public long c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
                    }
                    return 23L;
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.001f, 1.0f);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.setDuration(NavBarViewManager.a(NavBarViewManager.this).h().b().as());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            } else {
                                NavBarViewManager.h(NavBarViewManager.this).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        }
                    });
                    ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.5.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            } else {
                                NavBarViewManager.h(NavBarViewManager.this).setAlpha(1.0f);
                            }
                        }
                    });
                    ofFloat.start();
                }
            });
            return;
        }
        a(c);
        g();
        c();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.topMargin = i;
        this.d.setLayoutParams(layoutParams);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (NavBarViewManager.i(NavBarViewManager.this) == null) {
                } else {
                    NavBarViewManager.i(NavBarViewManager.this).a(NavOperation.OPERATION_BACK);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 16) {
            this.g.setImportantForAccessibility(1);
        }
        this.g.setContentDescription("返回");
        ViewCompat.setAccessibilityDelegate(this.g, new AccessibilityDelegateCompat() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 anonymousClass7, String str, Object... objArr) {
                if (str.hashCode() == -1796852737) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("94e633ff", new Object[]{this, view, accessibilityNodeInfoCompat});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
    }

    @Deprecated
    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.g = (TextView) view.findViewById(R.id.nav_back);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                NavBarViewManager.j(NavBarViewManager.this);
                if (NavBarViewManager.i(NavBarViewManager.this) == null) {
                    return;
                }
                NavBarViewManager.i(NavBarViewManager.this).a(NavOperation.OPERATION_BACK);
            }
        });
        this.g.setTextColor(com.taobao.android.detail2.core.framework.view.navbar.a.a(this.i));
        if (Build.VERSION.SDK_INT >= 16) {
            this.g.setImportantForAccessibility(1);
        }
        this.g.setContentDescription("返回");
        ViewCompat.setAccessibilityDelegate(this.g, new AccessibilityDelegateCompat() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass12 anonymousClass12, String str, Object... objArr) {
                if (str.hashCode() == -1796852737) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("94e633ff", new Object[]{this, view2, accessibilityNodeInfoCompat});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            }
        });
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MspWebActivity.BTN_TYPE, (Object) "back");
        jSONObject.put("bizType", (Object) "back");
        d d = this.b.d();
        if (d != null) {
            jSONObject.put("nid", (Object) d.k);
        }
        this.b.a("onUserNavBarClick", jSONObject);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.j = new o(this.i, this.b);
        }
    }

    public static boolean c(AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d0fc6c", new Object[]{atmosParams})).booleanValue() : (atmosParams == null || atmosParams.background == null || TextUtils.isEmpty(atmosParams.background.imageUrl)) ? false : true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.n && this.i.k() != null && this.i.k().c()) {
            this.k = this.i.k().a(new NewDetailMaskFrameLayout.a() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "directRenderAtmosphereView";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public long c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
                    }
                    return 1L;
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (NavBarViewManager.k(NavBarViewManager.this) > d()) {
                    } else {
                        NavBarViewManager.l(NavBarViewManager.this);
                    }
                }
            });
        } else {
            this.k = System.currentTimeMillis();
            i();
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        AtmosParams G = this.i.h().G();
        if (G == null || !G.showAtmos) {
            return;
        }
        b(G);
        h();
        a(G);
    }

    private void b(AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84864789", new Object[]{this, atmosParams});
            return;
        }
        this.m = false;
        if (atmosParams == null) {
            return;
        }
        try {
            if (!atmosParams.isHigherAtmosType() || !fkt.ay()) {
                return;
            }
            this.m = true;
            fjt.a(fjt.TAG_TIP, "氛围层已经开启 higher 模式。");
        } catch (Throwable th) {
            fjt.a("new_detail异常", "氛围层参数获取失败。无法切换至 higher 模式。weexUrl = " + atmosParams.weexUrl, th);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.f == null) {
            this.f = (AliUrlImageView) this.b.c().findViewById(R.id.nav_bg_img);
        }
        if (this.e != null) {
            return;
        }
        this.e = new c(this.i, this.f11608a, "", "stickTopDataRefresh");
        ViewStub viewStub = (ViewStub) this.b.c().findViewById(R.id.nav_weex);
        if (this.m && viewStub != null) {
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Resources resources = viewStub.getContext().getResources();
                if (resources != null) {
                    marginLayoutParams.height = (int) resources.getDimension(R.dimen.new_detail_nav_bar_bg_higher_height);
                    fjt.a(fjt.TAG_TIP, "氛围层已经被提升到 higher 模式高度，请关注内存。");
                    viewStub.setLayoutParams(marginLayoutParams);
                }
            }
        }
        this.e.a(viewStub);
    }

    private void a(AtmosParams atmosParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b92aa", new Object[]{this, atmosParams});
            return;
        }
        this.f.setImageUrl(atmosParams.background.imageUrl);
        g gVar = new g();
        gVar.a(atmosParams.weexUrl);
        gVar.b.put("containerWidth", String.valueOf(fmt.a(this.i.g())));
        Activity g = this.i.g();
        if (g != null) {
            gVar.b.put("containerHeight", String.valueOf(g.getResources().getDimension(this.m ? R.dimen.new_detail_nav_bar_bg_higher_height : R.dimen.new_detail_nav_bar_bg_height)));
        }
        this.b.j().a(this.e, this.i, gVar, atmosParams.mRootData, false, false);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a(new fmd.c() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fmd.c
                public void a(fmd.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa0ebefd", new Object[]{this, bVar});
                    }
                }

                @Override // tb.fmd.c
                public void a(String str, fmd.b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e932ea47", new Object[]{this, str, bVar});
                        return;
                    }
                    d d = NavBarViewManager.m(NavBarViewManager.this).d();
                    if (d == null || !d.R()) {
                        return;
                    }
                    if (IAKPopRender.LifecycleType.IN_ANIMATION_START.equals(str)) {
                        if (NavBarViewManager.h(NavBarViewManager.this) != null) {
                            NavBarViewManager.h(NavBarViewManager.this).setVisibility(8);
                        }
                        if (NavBarViewManager.n(NavBarViewManager.this) == null) {
                            return;
                        }
                        NavBarViewManager.n(NavBarViewManager.this).b(8);
                    } else if (!IAKPopRender.LifecycleType.BEFORE_CLOSE.equals(str)) {
                    } else {
                        if (NavBarViewManager.h(NavBarViewManager.this) != null) {
                            NavBarViewManager.h(NavBarViewManager.this).setVisibility(0);
                        }
                        if (NavBarViewManager.n(NavBarViewManager.this) == null) {
                            return;
                        }
                        NavBarViewManager.n(NavBarViewManager.this).b(0);
                    }
                }
            });
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(str, jSONObject);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int n = this.b.n();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.topMargin = n;
        this.d.setLayoutParams(layoutParams);
    }

    public void a(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a363f7be", new Object[]{this, dVar});
        } else if (this.i.g() == null) {
            fjp.b("main", fjp.ERROR_CODE_COMMON_CONTEXT_NULL, "上下文为空，updateNavBar停止执行", (Map<String, String>) null);
        } else if (ipa.x() && this.j == null) {
            this.r = dVar;
        } else if (this.n && this.i.k() != null && this.i.k().c()) {
            this.l = this.i.k().a(new NewDetailMaskFrameLayout.a() { // from class: com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "mRightNavLayer.updateNavBar";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public long c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
                    }
                    return 1L;
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (NavBarViewManager.o(NavBarViewManager.this) > d()) {
                    } else {
                        NavBarViewManager.p(NavBarViewManager.this).a(dVar);
                    }
                }
            });
        } else {
            this.l = System.currentTimeMillis();
            m mVar = this.j;
            if (mVar == null) {
                return;
            }
            mVar.a(dVar);
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        Rect rect = new Rect();
        this.d.getGlobalVisibleRect(rect);
        return rect.bottom;
    }

    public void a(Animation animation) {
        View j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1d2928", new Object[]{this, animation});
        } else if (animation == null) {
        } else {
            View view = this.d;
            if (view != null) {
                view.startAnimation(animation);
            }
            c cVar = this.e;
            if (cVar == null || (j = cVar.j()) == null) {
                return;
            }
            j.startAnimation(animation);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb39dce", new Object[]{this, aVar});
        } else {
            this.h = aVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.d.getVisibility() != 0) {
            z2 = false;
        }
        this.c = z2;
        int i = 8;
        this.d.setVisibility(z ? 0 : 8);
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        if (z) {
            i = 0;
        }
        cVar.a(i);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        mVar.a();
    }
}
