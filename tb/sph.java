package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.player.b;
import com.taobao.tao.flexbox.layoutmanager.player.c;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;

/* loaded from: classes5.dex */
public class sph extends spf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-533152608);
    }

    public static /* synthetic */ Object ipc$super(sph sphVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(sph sphVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66d4f56", new Object[]{sphVar, new Integer(i)});
        } else {
            sphVar.a(i);
        }
    }

    public static /* synthetic */ void a(sph sphVar, sjq sjqVar, View view, bl blVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b0398e", new Object[]{sphVar, sjqVar, view, blVar});
        } else {
            sphVar.a(sjqVar, view, blVar);
        }
    }

    public static /* synthetic */ boolean a(sph sphVar, sjq sjqVar, bl blVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba8d0e76", new Object[]{sphVar, sjqVar, blVar, new Boolean(z)})).booleanValue() : sphVar.a(sjqVar, blVar, z);
    }

    public sph(Context context, f fVar, FluidContext fluidContext, ViewGroup viewGroup, boolean z) {
        super(context, fVar, fluidContext, viewGroup, z);
    }

    @Override // tb.spg
    public void a(final View view, final sjq sjqVar, final bl blVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9acbeff5", new Object[]{this, view, sjqVar, blVar, new Boolean(z)});
            return;
        }
        h();
        this.g.setAlpha(0.0f);
        this.g.post(new Runnable() { // from class: tb.sph.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim getContentView.post");
                if (((ILifecycleService) sph.this.b.getService(ILifecycleService.class)).getPageState() == 5) {
                    sph.this.g.setAlpha(1.0f);
                    sph.this.b();
                    spz.c(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim getContentView.post return");
                    return;
                }
                TUrlImageView q = sph.this.q();
                if (sph.this.q || view == null) {
                    sph.this.g();
                    q.setScaleType(sjqVar.g);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q.getLayoutParams();
                    layoutParams.width = sjqVar.d;
                    layoutParams.height = sjqVar.c;
                    sph.this.c().getLayoutParams().height = sjqVar.c;
                    q.setLayoutParams(layoutParams);
                }
                ((IQuickOpenService) sph.this.b.getService(IQuickOpenService.class)).setLoadingImage(q);
                ViewGroup viewGroup = sph.this.g;
                bl blVar2 = (sph.this.q || view == null) ? null : blVar;
                if (sph.this.o) {
                    if (sph.a(sph.this, sjqVar, blVar2, z)) {
                        return;
                    }
                    sph.a(sph.this, sjqVar, viewGroup, blVar2);
                    return;
                }
                ((IQuickOpenService) sph.this.b.getService(IQuickOpenService.class)).onAnimationEnd();
                if (blVar != null && !sph.this.q) {
                    blVar.a(sjqVar.d, sjqVar.l == 0 ? sjqVar.c : sjqVar.l);
                }
                sph.this.g.setAlpha(1.0f);
                sph.this.j();
            }
        });
    }

    @Override // tb.spg
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.s != null && ((this.t != null || this.s.h() != null) && (!this.p || this.q))) {
            a((View) null, a(true, true), (bl) null, true);
        } else if (this.s != null && this.p) {
            i();
        } else if (this.r) {
            d();
        } else {
            f();
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.c) {
        } else {
            oha.a((Activity) this.f33804a, i, -1);
        }
    }

    private void a(View view, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bb17ef", new Object[]{this, view, rect});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    private boolean a(final sjq sjqVar, final bl blVar, boolean z) {
        final View view;
        final ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e556febb", new Object[]{this, sjqVar, blVar, new Boolean(z)})).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        List<View> list = null;
        if (this.d.getPageTransition() != null) {
            list = this.d.getPageTransition().b();
        }
        if (list == null || list.size() == 0 || (view = list.get(0)) == null || view.getWidth() == 0 || view.getHeight() == 0 || this.g == null || this.g.getWidth() == 0 || this.g.getHeight() == 0 || (viewGroup = (ViewGroup) view.getParent()) == null) {
            return false;
        }
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        final View view2 = new View(ab.a());
        viewGroup.addView(view2, layoutParams);
        Rect rect = new Rect();
        a(view, rect);
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        final ViewGroup viewGroup2 = this.g;
        int a2 = obx.a(this.f33804a, 44.0f);
        View view3 = new View(this.f33804a);
        view3.setLayoutParams(new FrameLayout.LayoutParams(-1, a2, 48));
        view3.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
        view3.setVisibility(0);
        viewGroup2.addView(view3);
        final ViewGroup viewGroup3 = (ViewGroup) this.d.getPageContainer().c().getParent();
        if (viewGroup3 == null) {
            return false;
        }
        view.setBackgroundResource(R.drawable.fluid_sdk_video_quick_open_bg);
        viewGroup3.getOverlay().add(view);
        final int i3 = sjqVar.l == 0 ? sjqVar.c : sjqVar.l;
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        final float translationX = view.getTranslationX();
        final float translationY = view.getTranslationY();
        final float scaleX2 = viewGroup2.getScaleX();
        final float scaleY2 = viewGroup2.getScaleY();
        final float translationX2 = viewGroup2.getTranslationX();
        final float translationY2 = viewGroup2.getTranslationY();
        float f = width;
        final float width2 = f / viewGroup2.getWidth();
        float f2 = height;
        final float height2 = f2 / viewGroup2.getHeight();
        float width3 = viewGroup2.getWidth() * (1.0f - width2) * 0.5f;
        float height3 = viewGroup2.getHeight() * (1.0f - height2) * 0.5f;
        float f3 = i;
        final float f4 = f3 - width3;
        float f5 = i2;
        final float f6 = f5 - height3;
        final float width4 = (viewGroup2.getWidth() * scaleX2) / f;
        final float height4 = (viewGroup2.getHeight() * scaleY2) / f2;
        final float f7 = (translationX2 + width3) - f3;
        final float f8 = (translationY2 + height3) - f5;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.sph.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewGroup viewGroup4 = viewGroup2;
                float f9 = f4;
                viewGroup4.setTranslationX(f9 + ((translationX2 - f9) * floatValue));
                ViewGroup viewGroup5 = viewGroup2;
                float f10 = f6;
                viewGroup5.setTranslationY(f10 + ((translationY2 - f10) * floatValue));
                ViewGroup viewGroup6 = viewGroup2;
                float f11 = width2;
                viewGroup6.setScaleX(f11 + ((scaleX2 - f11) * floatValue));
                ViewGroup viewGroup7 = viewGroup2;
                float f12 = height2;
                viewGroup7.setScaleY(f12 + ((scaleY2 - f12) * floatValue));
                viewGroup2.setAlpha(1.0f);
                View view4 = view;
                float f13 = translationX;
                view4.setTranslationX(f13 + ((f7 - f13) * floatValue));
                View view5 = view;
                float f14 = translationY;
                view5.setTranslationY(f14 + ((f8 - f14) * floatValue));
                View view6 = view;
                float f15 = scaleX;
                view6.setScaleX(f15 + ((width4 - f15) * floatValue));
                View view7 = view;
                float f16 = scaleY;
                view7.setScaleY(f16 + ((height4 - f16) * floatValue));
                view.setAlpha(1.0f - floatValue);
            }
        });
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, Integer.MIN_VALUE, -16777216);
        ofObject.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 1.0f, 1.0f));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.sph.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (sph.this.d != null && (sph.this.d.getDecorView() instanceof GestureLayout)) {
                    ((GestureLayout) sph.this.d.getDecorView()).setGestureLayoutBackground(intValue);
                }
                sph.a(sph.this, intValue);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: tb.sph.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                bl blVar2 = blVar;
                if (blVar2 != null) {
                    blVar2.a(sjqVar.d, i3);
                }
                spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画开始");
                if (!spi.b()) {
                    return;
                }
                c.a().b(true, b.a().b(sph.this.b.getInstanceConfig().getPreCoverKey()));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
                view.setTranslationX(translationX);
                view.setTranslationY(translationY);
                view.setBackgroundColor(0);
                viewGroup3.getOverlay().remove(view);
                viewGroup.removeView(view2);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                viewGroup.addView(view, layoutParams);
                sph.this.h.setBackgroundColor(-16777216);
                if (sph.this.d == null || sph.this.d.isFinishing()) {
                    view.setAlpha(1.0f);
                    sph.a(sph.this, 0);
                } else if (sph.this.d.getDecorView() instanceof GestureLayout) {
                    ((GestureLayout) sph.this.d.getDecorView()).setGestureLayoutBackground(Color.parseColor("#52000000"));
                }
                ((IQuickOpenService) sph.this.b.getService(IQuickOpenService.class)).onAnimationEnd();
                spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画结束");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画取消");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画onAnimationRepeat");
                }
            }
        });
        animatorSet.playTogether(duration, ofObject);
        animatorSet.start();
        return true;
    }

    private void a(final sjq sjqVar, final View view, final bl blVar) {
        final float f;
        final float f2;
        final float h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dca8293", new Object[]{this, sjqVar, view, blVar});
            return;
        }
        float a2 = this.s.a();
        float b = this.s.b();
        final int i = sjqVar.l == 0 ? sjqVar.c : sjqVar.l;
        if (sjqVar.d == 0 || i == 0) {
            this.g.setAlpha(1.0f);
            j();
            spz.c(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim getContentView.post 宽高为0 return");
            return;
        }
        float f3 = a2 / sjqVar.d;
        float f4 = b / i;
        int i2 = (sjqVar.c - sjqVar.i) / 2;
        int[] iArr = this.s.f31966a;
        if (i2 > 0) {
            f2 = iArr[0] - (((sjqVar.d * f4) - a2) / 2.0f);
            f = f4;
            h = (iArr[1] - ohd.h(this.f33804a)) - (i2 * f4);
        } else {
            f = f3;
            f2 = iArr[0];
            h = (iArr[1] - ohd.h(this.f33804a)) - (((sjqVar.c * f3) - b) / 2.0f);
        }
        int a3 = obx.a(this.f33804a, 44.0f);
        View view2 = new View(this.f33804a);
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, a3, 48));
        view2.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
        view2.setVisibility(0);
        ((ViewGroup) view).addView(view2);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        final float f5 = f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.sph.5
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
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.sph.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (sph.this.d != null && (sph.this.d.getDecorView() instanceof GestureLayout)) {
                    ((GestureLayout) sph.this.d.getDecorView()).setGestureLayoutBackground(intValue);
                }
                sph.a(sph.this, intValue);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: tb.sph.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                bl blVar2 = blVar;
                if (blVar2 != null) {
                    blVar2.a(sjqVar.d, i);
                }
                spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画开始");
                if (!spi.b()) {
                    return;
                }
                c.a().b(true, b.a().b(sph.this.b.getInstanceConfig().getPreCoverKey()));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                sph.this.h.setBackgroundColor(-16777216);
                if (sph.this.d != null && (sph.this.d.getDecorView() instanceof GestureLayout)) {
                    ((GestureLayout) sph.this.d.getDecorView()).setGestureLayoutBackground(0);
                }
                ((IQuickOpenService) sph.this.b.getService(IQuickOpenService.class)).onAnimationEnd();
                spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画结束");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画取消");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    spz.a(spc.QUICK_OPEN_TAG, "sharePlayerViewAnim 动画onAnimationRepeat");
                }
            }
        });
        animatorSet.playTogether(ofFloat, ofObject);
        animatorSet.start();
    }
}
