package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.view.FilletLinearLayout;
import com.taobao.mmad.data.BaseMmAdModel;

/* loaded from: classes7.dex */
public class tjh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_ALPHA_ANIMATION_DURATION = 100;
    public static final long DEFAULT_ANIMATION_DURATION = 500;

    /* renamed from: a  reason: collision with root package name */
    private tiq f34146a;

    static {
        kge.a(160668228);
    }

    public static /* synthetic */ tiq a(tjh tjhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiq) ipChange.ipc$dispatch("bae4e1c4", new Object[]{tjhVar}) : tjhVar.f34146a;
    }

    public tjh(tiq tiqVar) {
        this.f34146a = tiqVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f34146a.b() != null && this.f34146a.b().b() != null) {
            return (this.f34146a.b().b().getVisibility() == 0) && (this.f34146a.d().b() != null && this.f34146a.d().b().animation);
        }
        stv.a("AnimationManager", "canShow: bootImageViewWrapper or bootImageContainer is null");
        return false;
    }

    public void a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b396a97", new Object[]{this, aVar});
            return;
        }
        this.f34146a.b().e();
        ViewGroup b = this.f34146a.b().b();
        View d = this.f34146a.b().d();
        BitmapDrawable a2 = kpx.a(b);
        if (a2 != null) {
            ImageView imageView = new ImageView(b.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(a2);
            b.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        a(b, d, aVar, this.f34146a.d().b(), new Animator.AnimatorListener() { // from class: tb.tjh.1
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
                    return;
                }
                stv.a("AnimationManager", "AnimatorListener:onAnimationStart");
                tjh.a(tjh.this).a().a();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                stv.a("AnimationManager", "AnimatorListener:onAnimationEnd");
                tjh.a(tjh.this).a().b();
                tjh.a(tjh.this).a().c(2001);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    return;
                }
                stv.a("AnimationManager", "AnimatorListener:onAnimationCancel");
                tjh.a(tjh.this).a().b();
                tjh.a(tjh.this).a().c(2001);
            }
        });
    }

    private void a(final View view, View view2, final b.a aVar, BaseMmAdModel baseMmAdModel, Animator.AnimatorListener animatorListener) {
        long j;
        long j2;
        ObjectAnimator objectAnimator;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85eeb897", new Object[]{this, view, view2, aVar, baseMmAdModel, animatorListener});
            return;
        }
        final float f = aVar.f;
        final int width = view.getWidth();
        final int i2 = aVar.b;
        final int height = view.getHeight();
        final int i3 = aVar.c;
        final float a2 = stt.a(100.0f);
        if (baseMmAdModel.alphaAnimationDuration <= 0 || baseMmAdModel.scaleAnimationDuration < baseMmAdModel.alphaAnimationDuration) {
            j = 100;
            j2 = 500;
        } else {
            j2 = baseMmAdModel.scaleAnimationDuration;
            j = baseMmAdModel.alphaAnimationDuration;
        }
        if (StringUtils.equals(baseMmAdModel.getDataType(), "feeds")) {
            j = 100;
            j2 = 500;
        }
        long j3 = j2 - j;
        stv.a("AnimationManager", "startScaleAnimator: cornerRadius=" + f + ", translationX=" + aVar.d + ", translationY=" + aVar.e + ", toX=" + aVar.b + ", toY=" + aVar.c);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j3);
        ObjectAnimator objectAnimator2 = null;
        if (view2 != null) {
            objectAnimator = ofFloat;
            i = 2;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 0.6f, 0.0f);
            ofFloat2.setDuration(j);
            ofFloat2.setStartDelay(j3);
            objectAnimator2 = ofFloat2;
        } else {
            objectAnimator = ofFloat;
            i = 2;
        }
        float[] fArr = new float[i];
        // fill-array-data instruction
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr);
        ofFloat3.setDuration(j2);
        ofFloat3.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimator3 = objectAnimator;
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.tjh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4;
                int i5;
                float f2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                layoutParams.width = i2 + ((int) ((width - i4) * parseFloat));
                layoutParams.height = i3 + ((int) ((height - i5) * parseFloat));
                view.setLayoutParams(layoutParams);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                view.setX(aVar.d * animatedFraction);
                view.setTranslationY(aVar.e * animatedFraction);
                ImageView a3 = tjh.a(tjh.this).b().a();
                double d = parseFloat;
                if (d < 0.5d && a3 != null && (a3.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) a3.getLayoutParams();
                    layoutParams2.setMargins(0, 0, 0, (int) ((d - 0.5d) * 2.0d * a2));
                    a3.setLayoutParams(layoutParams2);
                }
                if (!(tjh.a(tjh.this).b().b() instanceof FilletLinearLayout)) {
                    return;
                }
                if (f <= 0.0f) {
                    return;
                }
                ((FilletLinearLayout) tjh.a(tjh.this).b().b()).setCornerSize(Math.max((int) (f2 * (1.0f - parseFloat)), 0));
            }
        });
        ofFloat3.addListener(animatorListener);
        if (objectAnimator2 != null) {
            animatorSet.playTogether(objectAnimator3, ofFloat3, objectAnimator2);
        } else {
            animatorSet.playTogether(objectAnimator3, ofFloat3);
        }
        animatorSet.start();
    }
}
