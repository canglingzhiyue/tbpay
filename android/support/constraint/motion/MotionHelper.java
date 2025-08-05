package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintHelper;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.motion.MotionLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.g {
    private float mProgress;
    private boolean mUseOnHide;
    private boolean mUseOnShow;
    protected View[] views;

    public MotionHelper(Context context) {
        super(context);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attributeSet);
    }

    public float getProgress() {
        return this.mProgress;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.constraint.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.mUseOnShow = obtainStyledAttributes.getBoolean(index, this.mUseOnShow);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.mUseOnHide = obtainStyledAttributes.getBoolean(index, this.mUseOnHide);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean isUseOnHide() {
        return this.mUseOnHide;
    }

    public boolean isUsedOnShow() {
        return this.mUseOnShow;
    }

    @Override // android.support.constraint.motion.MotionLayout.g
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
    }

    @Override // android.support.constraint.motion.MotionLayout.g
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
    }

    @Override // android.support.constraint.motion.MotionLayout.g
    public void onTransitionStarted(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // android.support.constraint.motion.MotionLayout.g
    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public void setProgress(float f) {
        this.mProgress = f;
        int i = 0;
        if (this.mCount > 0) {
            this.views = getViews((ConstraintLayout) getParent());
            while (i < this.mCount) {
                setProgress(this.views[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public void setProgress(View view, float f) {
    }
}
