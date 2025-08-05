package com.taobao.uikit.feature.features.cellanimator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class CellAnimatorController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ANIMATION_DELAY_MILLIS = 100;
    private static final int DEFAULT_ANIMATION_DURATION_MILLIS = 300;
    private static final int INITIAL_DELAY_MILLIS = 150;
    private static final String SAVEDINSTANCESTATE_FIRSTANIMATEDPOSITION = "savedinstancestate_firstanimatedposition";
    private static final String SAVEDINSTANCESTATE_LASTANIMATEDPOSITION = "savedinstancestate_lastanimatedposition";
    private static final String SAVEDINSTANCESTATE_SHOULDANIMATE = "savedinstancestate_shouldanimate";
    private final ListView mListView;
    private final WeakHashMap<View, Animator> mAnimators = new WeakHashMap<>();
    private int mInitialDelayMillis = 150;
    private int mAnimationDelayMillis = 100;
    private int mAnimationDurationMillis = 300;
    private boolean mShouldAnimate = true;
    private long mAnimationStartMillis = -1;
    private int mFirstAnimatedPosition = -1;
    private int mLastAnimatedPosition = -1;

    static {
        kge.a(-435820590);
    }

    public CellAnimatorController(ListView listView) {
        this.mListView = listView;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        clearAnimators();
        this.mFirstAnimatedPosition = -1;
        this.mLastAnimatedPosition = -1;
        this.mAnimationStartMillis = -1L;
    }

    public void setShouldAnimateFromPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2da13d", new Object[]{this, new Integer(i)});
            return;
        }
        setAnimatorEnable(true);
        int i2 = i - 1;
        this.mFirstAnimatedPosition = i2;
        this.mLastAnimatedPosition = i2;
    }

    public void setShouldAnimateNotVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a992eb2", new Object[]{this});
            return;
        }
        setAnimatorEnable(true);
        this.mFirstAnimatedPosition = this.mListView.getLastVisiblePosition();
        this.mLastAnimatedPosition = this.mListView.getLastVisiblePosition();
    }

    public void setLastAnimatedPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d898bb8", new Object[]{this, new Integer(i)});
        } else {
            this.mLastAnimatedPosition = i;
        }
    }

    public void setInitialDelayMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e2ff5", new Object[]{this, new Integer(i)});
        } else {
            this.mInitialDelayMillis = i;
        }
    }

    public void setAnimationDelayMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8891cb5", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimationDelayMillis = i;
        }
    }

    public void setAnimationDurationMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb6d600", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimationDurationMillis = i;
        }
    }

    public void setAnimatorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mShouldAnimate = z;
        if (z) {
            return;
        }
        clearAnimators();
    }

    public void clearAnimators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f07fa6", new Object[]{this});
            return;
        }
        for (Animator animator : this.mAnimators.values()) {
            animator.end();
        }
        this.mAnimators.clear();
    }

    public void animateViewIfNecessary(int i, View view, Animator[] animatorArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499fbed0", new Object[]{this, new Integer(i), view, animatorArr});
        } else if (!this.mShouldAnimate || i <= this.mLastAnimatedPosition) {
        } else {
            if (this.mFirstAnimatedPosition == -1) {
                this.mFirstAnimatedPosition = i;
            }
            animateView(i, view, animatorArr);
            this.mLastAnimatedPosition = i;
        }
    }

    private void animateView(int i, View view, Animator[] animatorArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13db1396", new Object[]{this, new Integer(i), view, animatorArr});
            return;
        }
        Animator animator = this.mAnimators.get(view);
        if (animator != null) {
            animator.cancel();
        }
        if (this.mAnimationStartMillis == -1) {
            this.mAnimationStartMillis = SystemClock.uptimeMillis();
        }
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorArr);
        animatorSet.setStartDelay(calculateAnimationDelay(i));
        animatorSet.setDuration(this.mAnimationDurationMillis);
        animatorSet.start();
        this.mAnimators.put(view, animatorSet);
    }

    private int calculateAnimationDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b399f10a", new Object[]{this, new Integer(i)})).intValue();
        }
        int lastVisiblePosition = this.mListView.getLastVisiblePosition() - this.mListView.getFirstVisiblePosition();
        int i2 = this.mFirstAnimatedPosition;
        if (lastVisiblePosition + 1 < (i - 1) - i2) {
            return this.mAnimationDelayMillis;
        }
        return Math.max(0, (int) ((-SystemClock.uptimeMillis()) + this.mAnimationStartMillis + this.mInitialDelayMillis + ((i - i2) * this.mAnimationDelayMillis)));
    }

    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putInt(SAVEDINSTANCESTATE_FIRSTANIMATEDPOSITION, this.mFirstAnimatedPosition);
        bundle.putInt(SAVEDINSTANCESTATE_LASTANIMATEDPOSITION, this.mLastAnimatedPosition);
        bundle.putBoolean(SAVEDINSTANCESTATE_SHOULDANIMATE, this.mShouldAnimate);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof Bundle)) {
        } else {
            Bundle bundle = (Bundle) parcelable;
            this.mFirstAnimatedPosition = bundle.getInt(SAVEDINSTANCESTATE_FIRSTANIMATEDPOSITION);
            this.mLastAnimatedPosition = bundle.getInt(SAVEDINSTANCESTATE_LASTANIMATEDPOSITION);
            this.mShouldAnimate = bundle.getBoolean(SAVEDINSTANCESTATE_SHOULDANIMATE);
        }
    }
}
