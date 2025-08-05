package com.taobao.android.detail.ttdetail.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.y;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class BarrageView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BarrageView";
    private static final int TIME_COUNT = 1000;
    private ValueAnimator animator;
    private int itemSpace;
    private a listener;
    private long mAnimatorDuration;
    private int mCurrentOffset;
    private int mMaxCount;

    /* loaded from: classes5.dex */
    public interface a {
        View a(Context context, Object obj);

        void a();
    }

    static {
        kge.a(1087708813);
    }

    public static /* synthetic */ Object ipc$super(BarrageView barrageView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$002(BarrageView barrageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d74939b", new Object[]{barrageView, new Integer(i)})).intValue();
        }
        barrageView.mCurrentOffset = i;
        return i;
    }

    public static /* synthetic */ int access$100(BarrageView barrageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7198f8f", new Object[]{barrageView})).intValue() : barrageView.mMaxCount;
    }

    public static /* synthetic */ a access$200(BarrageView barrageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f19385a2", new Object[]{barrageView}) : barrageView.listener;
    }

    public BarrageView(Context context) {
        this(context, null);
    }

    public BarrageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BarrageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAnimatorDuration = 1000L;
        initView(context, attributeSet);
    }

    private void initView(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5591cf22", new Object[]{this, context, attributeSet});
            return;
        }
        this.itemSpace = com.taobao.android.detail.ttdetail.utils.f.a(context, 20.0f);
        this.mMaxCount = 2;
    }

    public void setData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4342fbb0", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxCount = i;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i5 < childCount) {
                if (i5 != 0) {
                    i4 += measuredHeight;
                    measuredHeight = this.itemSpace;
                }
                i4 += measuredHeight;
            }
            i3 = Math.max(i3, measuredWidth);
        }
        if (mode2 != 1073741824) {
            size2 = i3;
        }
        if (mode != 1073741824) {
            size = i4;
        }
        setMeasuredDimension(size2, size);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        int height = getHeight();
        float f = 0.0f;
        if (childCount > 0) {
            f = (getChildAt(childCount - 1).getMeasuredHeight() + this.itemSpace) / 1000.0f;
        }
        int i6 = childCount - 1;
        int i7 = 0;
        for (int i8 = i6; i8 >= 0; i8--) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight2 = childAt.getMeasuredHeight();
            if (i8 == i6) {
                measuredHeight = i7 + height + measuredHeight2 + this.itemSpace;
                i5 = (int) ((1000 - this.mCurrentOffset) * f);
            } else {
                measuredHeight = i7 - getChildAt(i8 + 1).getMeasuredHeight();
                i5 = this.itemSpace;
            }
            i7 = measuredHeight - i5;
            childAt.layout(0, i7 - measuredHeight2, measuredWidth, i7);
        }
    }

    public void initDatas(List<Object> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f39dc6", new Object[]{this, list, aVar});
            return;
        }
        this.listener = aVar;
        if (list == null || aVar == null) {
            return;
        }
        removeAllViews();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addData(list.get(i), false);
        }
    }

    public boolean addData(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("678aea4a", new Object[]{this, obj, new Boolean(z)})).booleanValue();
        }
        if (this.listener == null || this.mMaxCount <= 0 || obj == null) {
            return false;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return false;
        }
        final int childCount = getChildCount();
        View a2 = this.listener.a(y.a(this), obj);
        if (a2 == null) {
            return false;
        }
        addView(a2);
        if (z) {
            final View childAt = getChildAt(0);
            this.animator = ValueAnimator.ofInt(0, 1000);
            this.animator.setDuration(this.mAnimatorDuration);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.ttdetail.widget.BarrageView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    BarrageView.access$002(BarrageView.this, 1000 - ((Integer) valueAnimator2.getAnimatedValue()).intValue());
                    if (childCount >= BarrageView.access$100(BarrageView.this)) {
                        childAt.setAlpha(1.0f - (((float) valueAnimator2.getCurrentPlayTime()) / ((float) valueAnimator2.getDuration())));
                    }
                    BarrageView.this.requestLayout();
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.detail.ttdetail.widget.BarrageView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    } else if (hashCode != 977295137) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onAnimationStart((Animator) objArr[0]);
                        return null;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    } else {
                        super.onAnimationStart(animator);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    int childCount2 = BarrageView.this.getChildCount();
                    for (int i = 0; i < childCount2; i++) {
                        BarrageView.this.getChildAt(i).setAlpha(1.0f);
                    }
                    if (childCount >= BarrageView.access$100(BarrageView.this)) {
                        BarrageView.this.removeViewAt(0);
                    }
                    if (BarrageView.access$200(BarrageView.this) == null) {
                        return;
                    }
                    BarrageView.access$200(BarrageView.this).a();
                }
            });
            this.animator.start();
        } else {
            this.mCurrentOffset = 0;
            if (childCount >= this.mMaxCount) {
                removeViewAt(0);
            }
        }
        return true;
    }

    public void setMaxCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ccb6ef", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMaxCount = i;
        int childCount = getChildCount();
        if (childCount <= this.mMaxCount) {
            return;
        }
        for (int i2 = 0; i2 < childCount - this.mMaxCount; i2++) {
            removeViewAt(0);
        }
    }

    public void setItemSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6b528b", new Object[]{this, new Integer(i)});
        } else {
            this.itemSpace = com.taobao.android.detail.ttdetail.utils.f.a(y.a(this), i);
        }
    }

    public void setAnimatorDuration(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc54b20", new Object[]{this, new Long(j)});
        } else {
            this.mAnimatorDuration = j;
        }
    }
}
