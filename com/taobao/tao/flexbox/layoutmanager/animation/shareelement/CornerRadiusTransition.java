package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class CornerRadiusTransition extends Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PROPERTY_CORNER_RADIUS = "cornerRadius";
    private static final String[] TRANSITION_PROPERTIES;
    private float startCornerRadius = 100.0f;
    private float endCornerRadius = 0.0f;

    static {
        kge.a(1911117946);
        TRANSITION_PROPERTIES = new String[]{PROPERTY_CORNER_RADIUS};
    }

    public CornerRadiusTransition(float f, float f2) {
        setStartCornerRadius(f);
        setEndCornerRadius(f2);
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("e2d176f4", new Object[]{this}) : TRANSITION_PROPERTIES;
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed1d56b", new Object[]{this, transitionValues});
            return;
        }
        View view = transitionValues.view;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        transitionValues.values.put(PROPERTY_CORNER_RADIUS, Float.valueOf(this.startCornerRadius));
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b12f552", new Object[]{this, transitionValues});
            return;
        }
        View view = transitionValues.view;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        transitionValues.values.put(PROPERTY_CORNER_RADIUS, Float.valueOf(this.endCornerRadius));
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("50067a4a", new Object[]{this, viewGroup, transitionValues, transitionValues2});
        }
        ObjectAnimator objectAnimator = null;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        float floatValue = ((Float) transitionValues.values.get(PROPERTY_CORNER_RADIUS)).floatValue();
        float floatValue2 = ((Float) transitionValues2.values.get(PROPERTY_CORNER_RADIUS)).floatValue();
        if (transitionValues2.view instanceof AbsPinchImageView) {
            AbsPinchImageView absPinchImageView = (AbsPinchImageView) transitionValues2.view;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(absPinchImageView, PROPERTY_CORNER_RADIUS, floatValue, floatValue2);
            absPinchImageView.setCornerRadius(floatValue, floatValue2);
            objectAnimator = ofFloat;
        } else if (transitionValues2.view instanceof BaseTNodePhotoView) {
            ((BaseTNodePhotoView) transitionValues2.view).setCornerRadius(floatValue, floatValue2);
        } else if ((transitionValues2.view instanceof TNodeImageView) && oeb.bp()) {
            objectAnimator = ObjectAnimator.ofFloat((TNodeImageView) transitionValues2.view, PROPERTY_CORNER_RADIUS, floatValue, floatValue2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (objectAnimator != null) {
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet;
    }

    public void setEndCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ec0519", new Object[]{this, new Float(f)});
        } else {
            this.endCornerRadius = f;
        }
    }

    public void setStartCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69818ff2", new Object[]{this, new Float(f)});
        } else {
            this.startCornerRadius = f;
        }
    }
}
