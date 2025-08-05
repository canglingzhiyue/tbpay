package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.PointF;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hin;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1324951877);
    }

    public static void a(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a8e616", new Object[]{view, animationListener});
        } else if (view == null || view.getVisibility() != 0) {
        } else {
            if (view.getParent() != null && (view.getParent() instanceof LinearLayout)) {
                view = (View) view.getParent();
            }
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 1.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(500L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            animationSet.setAnimationListener(animationListener);
            view.startAnimation(animationSet);
        }
    }

    public static void b(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c01375", new Object[]{view, animationListener});
        } else if (view == null || view.getVisibility() != 0) {
        } else {
            if (view.getParent() != null && (view.getParent() instanceof LinearLayout)) {
                view = (View) view.getParent();
            }
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 1.0f, 1, 1.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(500L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            animationSet.setAnimationListener(animationListener);
            view.startAnimation(animationSet);
        }
    }

    public static void c(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d740d4", new Object[]{view, animationListener});
        } else if (view == null || view.getVisibility() != 0) {
        } else {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.74f, 1, 0.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(150L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            animationSet.setAnimationListener(animationListener);
            view.startAnimation(animationSet);
        }
    }

    public static void d(View view, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aee6e33", new Object[]{view, animationListener});
        } else if (view == null || view.getVisibility() != 0) {
        } else {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.74f, 1, 0.0f);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setDuration(150L);
            animationSet.setInterpolator(new AccelerateInterpolator());
            animationSet.setAnimationListener(animationListener);
            view.startAnimation(animationSet);
        }
    }

    public static void a(final View view, View view2, View view3, View view4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8dbddc", new Object[]{view, view2, view3, view4, new Long(j)});
        } else if (view == null || view2 == null || view3 == null) {
            his.b("ShowcaseAnimation", "cartBezierAnim | view empty.");
        } else {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            PointF pointF = new PointF(hin.a(60.0f), iArr[1] + (view2.getHeight() / 2));
            if (view4 != null) {
                view4.getLocationInWindow(iArr);
                pointF = new PointF(hin.a(60.0f), iArr[1] + (view4.getHeight() / 2));
            }
            int[] iArr2 = new int[2];
            view3.getLocationInWindow(iArr2);
            PointF pointF2 = new PointF(iArr2[0], iArr2[1]);
            PointF pointF3 = new PointF((pointF2.x * 3.0f) / 4.0f, 0.0f);
            his.b("ShowcaseAnimation", "cartBezierAnim | startX=" + pointF.x + "   startY=" + pointF.y + "     endX=" + pointF2.x + " endY=" + pointF2.y + "     controlX=" + pointF3.x + " controlPointY=" + pointF3.y);
            ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "position", new a(pointF3, view), pointF, pointF2);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.5f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.5f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(j);
            animatorSet.playTogether(ofObject, ofFloat, ofFloat2, ofFloat3);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.h.1
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
                    } else {
                        new Handler().post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.h.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ViewParent parent = view.getParent();
                                if (!(parent instanceof ViewGroup)) {
                                    return;
                                }
                                ((ViewGroup) parent).removeView(view);
                            }
                        });
                    }
                }
            });
            animatorSet.start();
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements TypeEvaluator<PointF> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private PointF f13796a;
        private View b;

        static {
            kge.a(-874184697);
            kge.a(-738482422);
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.PointF, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public /* synthetic */ PointF evaluate(float f, PointF pointF, PointF pointF2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6810f25a", new Object[]{this, new Float(f), pointF, pointF2}) : a(f, pointF, pointF2);
        }

        public a(PointF pointF, View view) {
            this.f13796a = pointF;
            this.b = view;
        }

        public PointF a(float f, PointF pointF, PointF pointF2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PointF) ipChange.ipc$dispatch("dcb9c6f", new Object[]{this, new Float(f), pointF, pointF2});
            }
            float f2 = 1.0f - f;
            PointF pointF3 = new PointF();
            float f3 = f2 * f2;
            float f4 = f2 * 2.0f * f;
            float f5 = f * f;
            pointF3.x = (pointF.x * f3) + (this.f13796a.x * f4) + (pointF2.x * f5);
            pointF3.y = (f3 * pointF.y) + (f4 * this.f13796a.y) + (f5 * pointF2.y);
            this.b.setTranslationX(pointF3.x);
            this.b.setTranslationY(pointF3.y);
            return pointF3;
        }
    }
}
