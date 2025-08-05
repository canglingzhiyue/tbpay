package com.etao.feimagesearch.videosearch;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class VideoAnimateLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DISTANCE;
    private AnimatorSet anim;
    private boolean shouldAnimate;

    public static /* synthetic */ Object ipc$super(VideoAnimateLayout videoAnimateLayout, String str, Object... objArr) {
        if (str.hashCode() == 1626033557) {
            super.onAttachedToWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue() : DISTANCE;
    }

    static {
        kge.a(2001915371);
        DISTANCE = com.etao.feimagesearch.util.g.a(50.0f);
    }

    public VideoAnimateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        this.shouldAnimate = true;
        AnimatorSet animatorSet = this.anim;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.anim.end();
        this.anim = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.shouldAnimate) {
            return;
        }
        this.anim = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.etao.feimagesearch.videosearch.VideoAnimateLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float)) {
                    return;
                }
                float floatValue = ((Float) animatedValue).floatValue();
                VideoAnimateLayout.this.setAlpha(floatValue);
                VideoAnimateLayout.this.setTranslationY((1.0f - floatValue) * VideoAnimateLayout.access$000());
            }
        });
        this.anim.playTogether(ofFloat);
        this.anim.start();
        this.shouldAnimate = false;
    }
}
