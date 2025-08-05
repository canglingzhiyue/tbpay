package com.taobao.uikit.extend.feature.view;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class TZoomScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mCurrX;
    private float mCurrY;
    private float mCurrZ;
    private float mDeltaX;
    private float mDeltaY;
    private float mDeltaZ;
    private int mDuration;
    private float mDurationReciprocal;
    private float mFinalX;
    private float mFinalY;
    private float mFinalZ;
    private boolean mFinished = true;
    private Interpolator mInterPolator;
    private long mStartTime;
    private float mStartX;
    private float mStartY;
    private float mStartZ;

    public TZoomScroller(Interpolator interpolator) {
        this.mInterPolator = interpolator;
        if (this.mInterPolator == null) {
            this.mInterPolator = new AccelerateDecelerateInterpolator();
        }
    }

    public void startScroll(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947f836d", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Integer(i)});
            return;
        }
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mDuration = i;
        this.mDurationReciprocal = 1.0f / this.mDuration;
        this.mFinished = false;
        this.mStartX = f;
        this.mStartY = f2;
        this.mStartZ = f3;
        this.mFinalX = this.mStartX + f4;
        this.mFinalY = this.mStartY + f5;
        this.mFinalZ = this.mStartZ + f6;
        this.mDeltaX = f4;
        this.mDeltaY = f5;
        this.mDeltaZ = f6;
    }

    public boolean computeScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de204ca2", new Object[]{this})).booleanValue();
        }
        if (this.mFinished) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
        if (currentAnimationTimeMillis < this.mDuration) {
            float interpolation = this.mInterPolator.getInterpolation(currentAnimationTimeMillis * this.mDurationReciprocal);
            this.mCurrX = this.mStartX + (this.mDeltaX * interpolation);
            this.mCurrY = this.mStartY + (this.mDeltaY * interpolation);
            this.mCurrZ = this.mStartZ + (interpolation * this.mDeltaZ);
        } else {
            this.mCurrX = this.mFinalX;
            this.mCurrY = this.mFinalY;
            this.mCurrZ = this.mFinalZ;
            this.mFinished = true;
        }
        return true;
    }

    public float getCurrX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25ca5327", new Object[]{this})).floatValue() : this.mCurrX;
    }

    public float getCurrY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25d86aa8", new Object[]{this})).floatValue() : this.mCurrY;
    }

    public float getCurrZ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25e68229", new Object[]{this})).floatValue() : this.mCurrZ;
    }
}
