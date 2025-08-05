package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.preload.dwinstance.c;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes5.dex */
public class spt extends spf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-429877293);
    }

    public static /* synthetic */ Object ipc$super(spt sptVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ f A(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("11abeff5", new Object[]{sptVar}) : sptVar.d;
    }

    public static /* synthetic */ f B(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a5ea5f94", new Object[]{sptVar}) : sptVar.d;
    }

    public static /* synthetic */ f C(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3a28cf33", new Object[]{sptVar}) : sptVar.d;
    }

    public static /* synthetic */ FrameLayout.LayoutParams a(spt sptVar, sjq sjqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("3a5c0440", new Object[]{sptVar, sjqVar}) : sptVar.a(sjqVar);
    }

    public static /* synthetic */ FluidContext a(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("7ec705e7", new Object[]{sptVar}) : sptVar.b;
    }

    public static /* synthetic */ void a(spt sptVar, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb61895", new Object[]{sptVar, new Float(f), new Boolean(z)});
        } else {
            sptVar.a(f, z);
        }
    }

    public static /* synthetic */ void a(spt sptVar, sjq sjqVar, View view, bl blVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a4389a", new Object[]{sptVar, sjqVar, view, blVar});
        } else {
            sptVar.a(sjqVar, view, blVar);
        }
    }

    public static /* synthetic */ void b(spt sptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb54842", new Object[]{sptVar});
        } else {
            sptVar.b();
        }
    }

    public static /* synthetic */ boolean c(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc384ec7", new Object[]{sptVar})).booleanValue() : sptVar.q;
    }

    public static /* synthetic */ FrameLayout d(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2d58915", new Object[]{sptVar}) : sptVar.i;
    }

    public static /* synthetic */ FrameLayout e(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("59f379f4", new Object[]{sptVar}) : sptVar.i;
    }

    public static /* synthetic */ void f(spt sptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c16246", new Object[]{sptVar});
        } else {
            sptVar.g();
        }
    }

    public static /* synthetic */ FluidContext g(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("860cf721", new Object[]{sptVar}) : sptVar.b;
    }

    public static /* synthetic */ boolean h(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84c76f4c", new Object[]{sptVar})).booleanValue() : sptVar.q;
    }

    public static /* synthetic */ FrameLayout i(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b66b3d70", new Object[]{sptVar}) : sptVar.i;
    }

    public static /* synthetic */ boolean j(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61cd7c4e", new Object[]{sptVar})).booleanValue() : sptVar.o;
    }

    public static /* synthetic */ void k(spt sptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505082cb", new Object[]{sptVar});
        } else {
            sptVar.j();
        }
    }

    public static /* synthetic */ FluidContext l(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("8c1c957c", new Object[]{sptVar}) : sptVar.b;
    }

    public static /* synthetic */ boolean m(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d568fd1", new Object[]{sptVar})).booleanValue() : sptVar.q;
    }

    public static /* synthetic */ ViewGroup n(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("34ac4c07", new Object[]{sptVar}) : sptVar.g;
    }

    public static /* synthetic */ ViewGroup o(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("a8eb8466", new Object[]{sptVar}) : sptVar.g;
    }

    public static /* synthetic */ ViewGroup p(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("1d2abcc5", new Object[]{sptVar}) : sptVar.g;
    }

    public static /* synthetic */ ViewGroup q(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("9169f524", new Object[]{sptVar}) : sptVar.g;
    }

    public static /* synthetic */ ViewGroup r(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5a92d83", new Object[]{sptVar}) : sptVar.g;
    }

    public static /* synthetic */ FluidContext s(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("9498d995", new Object[]{sptVar}) : sptVar.b;
    }

    public static /* synthetic */ void t(spt sptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ebbd54", new Object[]{sptVar});
        } else {
            sptVar.n();
        }
    }

    public static /* synthetic */ f u(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2e5a9c41", new Object[]{sptVar}) : sptVar.d;
    }

    public static /* synthetic */ f v(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("c2990be0", new Object[]{sptVar}) : sptVar.d;
    }

    public static /* synthetic */ f w(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("56d77b7f", new Object[]{sptVar}) : sptVar.d;
    }

    public static /* synthetic */ MultiTabLayout x(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTabLayout) ipChange.ipc$dispatch("96d6a49b", new Object[]{sptVar}) : sptVar.h;
    }

    public static /* synthetic */ String y(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0dd63e7", new Object[]{sptVar}) : sptVar.l();
    }

    public static /* synthetic */ FluidContext z(spt sptVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("9d151dae", new Object[]{sptVar}) : sptVar.b;
    }

    public spt(Context context, f fVar, FluidContext fluidContext, ViewGroup viewGroup, boolean z) {
        super(context, fVar, fluidContext, viewGroup, z);
    }

    @Override // tb.spg
    public void a(final View view, final sjq sjqVar, final bl blVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9acbeff5", new Object[]{this, view, sjqVar, blVar, new Boolean(z)});
            return;
        }
        h();
        this.g.post(new Runnable() { // from class: tb.spt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                View c;
                bl blVar2;
                View view2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                spz.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim getContentView.post");
                if (((ILifecycleService) spt.a(spt.this).getService(ILifecycleService.class)).getPageState() == 5) {
                    spt.b(spt.this);
                    spz.c("TransitionAnimController_SharePlayer", "sharePlayerViewAnim getContentView.post return");
                    return;
                }
                if (spt.c(spt.this) || (view2 = view) == null) {
                    spt.f(spt.this);
                    TUrlImageView q = spt.this.q();
                    q.setScaleType(sjqVar.g);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q.getLayoutParams();
                    layoutParams.width = sjqVar.d;
                    layoutParams.height = sjqVar.c;
                    spt.this.c().getLayoutParams().height = sjqVar.c;
                    q.setLayoutParams(layoutParams);
                } else {
                    if (view2.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    FrameLayout.LayoutParams a2 = spt.a(spt.this, sjqVar);
                    spt.d(spt.this).getLayoutParams().height = sjqVar.c;
                    spt.e(spt.this).addView(view, 0, a2);
                }
                ((IQuickOpenService) spt.g(spt.this).getService(IQuickOpenService.class)).setLoadingImage(spt.this.q());
                if (spt.h(spt.this) || view == null) {
                    c = spt.this.c();
                    blVar2 = null;
                } else {
                    c = spt.i(spt.this);
                    blVar2 = blVar;
                }
                if (spt.j(spt.this)) {
                    spt.a(spt.this, sjqVar, c, blVar2);
                    return;
                }
                ((IQuickOpenService) spt.l(spt.this).getService(IQuickOpenService.class)).onAnimationEnd();
                if (blVar != null && !spt.m(spt.this)) {
                    blVar.a(sjqVar.d, sjqVar.l == 0 ? sjqVar.c : sjqVar.l);
                }
                spt.k(spt.this);
            }
        });
    }

    @Override // tb.spg
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.s != null && ((this.t != null || this.s.h() != null) && (!this.p || this.q))) {
            if (!spi.d()) {
                sjq a2 = a(true, false);
                g();
                TUrlImageView q = q();
                q.setScaleType(a2.g);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q.getLayoutParams();
                layoutParams.topMargin = a2.e;
                layoutParams.width = a2.d;
                layoutParams.height = a2.c;
                c().getLayoutParams().height = a2.c;
                q.setLayoutParams(layoutParams);
                ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).setLoadingImage(q);
                if (this.o) {
                    final float a3 = this.s.a() / a2.d;
                    final float b = this.s.b() / a2.c;
                    int[] iArr = this.s.f31966a;
                    final float f = iArr[0];
                    final float h = iArr[1] - ohd.h(this.f33804a);
                    this.g.setPivotX(0.0f);
                    this.g.setPivotY(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                    duration.setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.spt.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                return;
                            }
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ViewGroup n = spt.n(spt.this);
                            float f2 = f;
                            n.setTranslationX(f2 - (floatValue * f2));
                            ViewGroup o = spt.o(spt.this);
                            float f3 = h;
                            o.setTranslationY(f3 - (floatValue * f3));
                            ViewGroup p = spt.p(spt.this);
                            float f4 = a3;
                            p.setScaleX(f4 + ((1.0f - f4) * floatValue));
                            ViewGroup q2 = spt.q(spt.this);
                            float f5 = b;
                            q2.setScaleY(f5 + ((1.0f - f5) * floatValue));
                            spt.r(spt.this).setAlpha(floatValue);
                            spt.a(spt.this, floatValue, false);
                        }
                    });
                    duration.addListener(new Animator.AnimatorListener() { // from class: tb.spt.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            }
                        }

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
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                return;
                            }
                            ((IQuickOpenService) spt.s(spt.this).getService(IQuickOpenService.class)).onAnimationEnd();
                            spt.t(spt.this);
                            if (spt.u(spt.this) == null || !(spt.v(spt.this).getDecorView() instanceof GestureLayout)) {
                                return;
                            }
                            ((GestureLayout) spt.w(spt.this).getDecorView()).setDragLayoutBackground(Color.parseColor("#52000000"));
                        }
                    });
                    duration.start();
                } else {
                    ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).onAnimationEnd();
                }
                m();
                return;
            }
            a((View) null, a(true, true), (bl) null, true);
        } else if (this.s != null && this.p) {
            i();
        } else if (this.r) {
            d();
        } else if (sjv.a(this.b)) {
            e();
        } else if (c.a(this.b)) {
        } else {
            f();
        }
    }

    private void a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f), new Boolean(z)});
        } else if (this.c) {
        } else {
            if (z) {
                oha.a((Activity) this.f33804a, (int) f, -1);
            } else {
                oha.a((Activity) this.f33804a, (int) (f * 255.0f));
            }
        }
    }

    private String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.b.getInstanceConfig().getPreCoverKey();
    }

    private void a(final sjq sjqVar, final View view, final bl blVar) {
        final float f;
        final float f2;
        final float h;
        float h2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dca8293", new Object[]{this, sjqVar, view, blVar});
            return;
        }
        final boolean a2 = spi.a();
        float a3 = this.s.a();
        float b = this.s.b();
        final int i = sjqVar.l == 0 ? sjqVar.c : sjqVar.l;
        if (sjqVar.d == 0 || i == 0) {
            j();
            spz.c("TransitionAnimController_SharePlayer", "sharePlayerViewAnim getContentView.post 宽高为0 return");
            return;
        }
        float f3 = a3 / sjqVar.d;
        float f4 = b / i;
        int i2 = (sjqVar.c - sjqVar.i) / 2;
        int[] iArr = this.s.f31966a;
        if (i2 > 0) {
            f2 = iArr[0] - (((sjqVar.d * f4) - a3) / 2.0f);
            if (a2) {
                h2 = (iArr[1] - ohd.h(this.f33804a)) - (i2 * f4);
            } else {
                h2 = (iArr[1] - ohd.h(this.f33804a)) - i2;
            }
            f = f4;
            h = h2;
        } else {
            f = f3;
            f2 = iArr[0];
            h = (iArr[1] - ohd.h(this.f33804a)) - (((sjqVar.c * f3) - b) / 2.0f);
        }
        int a4 = obx.a(this.f33804a, 44.0f);
        if (a2 && (view instanceof ViewGroup) && sjqVar.e < a4) {
            View view2 = new View(this.f33804a);
            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, a4, 48));
            view2.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
            view2.setVisibility(0);
            ((ViewGroup) view).addView(view2);
        }
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        final float f5 = f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.spt.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = view;
                float f6 = f2;
                view3.setTranslationX(f6 - (floatValue * f6));
                View view4 = view;
                float f7 = h;
                view4.setTranslationY(f7 - (floatValue * f7));
                View view5 = view;
                float f8 = f5;
                view5.setScaleX(f8 + ((1.0f - f8) * floatValue));
                View view6 = view;
                float f9 = f;
                view6.setScaleY(f9 + (floatValue * (1.0f - f9)));
                view.setAlpha(1.0f);
            }
        });
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, Integer.MIN_VALUE, -16777216);
        ofObject.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 1.0f, 1.0f));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.spt.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                spt.x(spt.this).setBackgroundColor(intValue);
                spt.a(spt.this, intValue, true);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: tb.spt.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                bl blVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                if (a2 && (blVar2 = blVar) != null) {
                    blVar2.a(sjqVar.d, i);
                }
                spz.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画开始");
                if (!spi.b()) {
                    return;
                }
                com.taobao.tao.flexbox.layoutmanager.player.c.a().b(true, b.a().b(spt.y(spt.this)));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                ((IQuickOpenService) spt.z(spt.this).getService(IQuickOpenService.class)).onAnimationEnd();
                spt.t(spt.this);
                if (spt.A(spt.this) != null && (spt.B(spt.this).getDecorView() instanceof GestureLayout)) {
                    ((GestureLayout) spt.C(spt.this).getDecorView()).setDragLayoutBackground(Color.parseColor("#52000000"));
                }
                if (!spi.a()) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 0.5f, 1.0f);
                    ofFloat2.setDuration(200L);
                    ofFloat2.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 1.0f, 1.0f));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.spt.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                return;
                            }
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            spz.a("TransitionAnimController_SharePlayer", "cflog anim " + floatValue);
                            spt.this.s().setVisibility(0);
                            spt.this.r().setVisibility(0);
                            spt.this.s().setAlpha(floatValue);
                            spt.this.r().setAlpha(floatValue);
                        }
                    });
                    ofFloat2.start();
                }
                spz.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画结束");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    spz.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画取消");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    spz.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画onAnimationRepeat");
                }
            }
        });
        animatorSet.playTogether(ofFloat, ofObject);
        animatorSet.start();
    }

    private FrameLayout.LayoutParams a(sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("6a9da4e7", new Object[]{this, sjqVar});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sjqVar.d, sjqVar.c);
        layoutParams.topMargin = sjqVar.e;
        layoutParams.width = sjqVar.d;
        layoutParams.height = sjqVar.c;
        c().getLayoutParams().height = sjqVar.c;
        return layoutParams;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
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
            layoutParams2.height = obx.a(r.getContext(), spi.a() ? 44.0f : 50.0f);
            r.setLayoutParams(layoutParams2);
        }
        s.setVisibility(spi.a() ? 8 : 0);
        r.setVisibility(0);
    }

    private void n() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.d == null || this.d.getPageTransition() == null || (view = this.d.getPageTransition().b().get(0)) == null) {
        } else {
            view.setAlpha(0.0f);
        }
    }
}
