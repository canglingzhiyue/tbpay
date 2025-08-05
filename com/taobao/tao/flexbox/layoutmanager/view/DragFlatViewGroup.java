package com.taobao.tao.flexbox.layoutmanager.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collections;
import tb.kge;

/* loaded from: classes8.dex */
public class DragFlatViewGroup extends FlatViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAutoAdsorb;
    private boolean mIsDrag;
    private float mLastX;
    private float mLastY;
    private a mOnLocationChangeListener;
    private int mParentHeight;
    private int mParentWidth;
    private int mTemporaryX;
    private int mTemporaryY;
    private int mTouchSlop;

    /* loaded from: classes8.dex */
    public interface a {
        void onLocationChange(int i, int i2);
    }

    static {
        kge.a(-1215430132);
    }

    public static /* synthetic */ Object ipc$super(DragFlatViewGroup dragFlatViewGroup, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode != -244855388) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ int access$000(DragFlatViewGroup dragFlatViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a743e691", new Object[]{dragFlatViewGroup})).intValue() : dragFlatViewGroup.mTemporaryX;
    }

    public static /* synthetic */ int access$002(DragFlatViewGroup dragFlatViewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8bc579a", new Object[]{dragFlatViewGroup, new Integer(i)})).intValue();
        }
        dragFlatViewGroup.mTemporaryX = i;
        return i;
    }

    public static /* synthetic */ int access$100(DragFlatViewGroup dragFlatViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43b1e2f0", new Object[]{dragFlatViewGroup})).intValue() : dragFlatViewGroup.mTemporaryY;
    }

    public static /* synthetic */ int access$102(DragFlatViewGroup dragFlatViewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea0de71b", new Object[]{dragFlatViewGroup, new Integer(i)})).intValue();
        }
        dragFlatViewGroup.mTemporaryY = i;
        return i;
    }

    public static /* synthetic */ a access$200(DragFlatViewGroup dragFlatViewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("62acc164", new Object[]{dragFlatViewGroup}) : dragFlatViewGroup.mOnLocationChangeListener;
    }

    public DragFlatViewGroup(Context context) {
        super(context);
        this.mAutoAdsorb = false;
        this.mTouchSlop = ViewConfiguration.getTouchSlop();
    }

    public void setOnLocationChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1382cf17", new Object[]{this, aVar});
        } else {
            this.mOnLocationChangeListener = aVar;
        }
    }

    public void setAutoAdsorb(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39d6e6d", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoAdsorb = z;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View view = (View) getParent();
        if (view == null) {
            return;
        }
        this.mParentWidth = view.getWidth();
        this.mParentHeight = view.getHeight();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.mLastX) > this.mTouchSlop && Math.abs(motionEvent.getY() - this.mLastX) > this.mTouchSlop) {
            this.mIsDrag = true;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float x = (int) motionEvent.getX();
        float y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.mAutoAdsorb) {
                    autoAdsorb();
                } else {
                    a aVar = this.mOnLocationChangeListener;
                    if (aVar != null) {
                        aVar.onLocationChange(getLeft(), getTop());
                    }
                }
                this.mIsDrag = false;
            } else if (action == 2) {
                float f = x - this.mLastX;
                float f2 = y - this.mLastY;
                if (getLeft() + f < 0.0f) {
                    f = -getLeft();
                }
                int i = this.mParentWidth;
                if (getRight() + f > i) {
                    f = i - getRight();
                }
                if (getTop() + f2 < 0.0f) {
                    f2 = -getTop();
                }
                int i2 = this.mParentHeight;
                if (getBottom() + f2 > i2) {
                    f2 = i2 - getBottom();
                }
                offsetLeftAndRight((int) f);
                offsetTopAndBottom((int) f2);
                if (this.mIsDrag) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                    onTouchEvent(obtain);
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private void autoAdsorb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f2b845", new Object[]{this});
            return;
        }
        int left = getLeft();
        int right = this.mParentWidth - getRight();
        int top = getTop();
        int findMinValue = findMinValue(Integer.valueOf(left), Integer.valueOf(right), Integer.valueOf(top), Integer.valueOf(this.mParentHeight - getBottom()));
        if (findMinValue == left) {
            left = 0;
        } else if (findMinValue == right) {
            left = this.mParentWidth - getWidth();
        } else {
            top = findMinValue == top ? 0 : this.mParentHeight - getHeight();
        }
        this.mTemporaryX = getLeft();
        ValueAnimator ofInt = ValueAnimator.ofInt(getLeft(), left);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.DragFlatViewGroup.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                DragFlatViewGroup dragFlatViewGroup = DragFlatViewGroup.this;
                dragFlatViewGroup.offsetLeftAndRight(intValue - DragFlatViewGroup.access$000(dragFlatViewGroup));
                DragFlatViewGroup.access$002(DragFlatViewGroup.this, intValue);
            }
        });
        this.mTemporaryY = getTop();
        ValueAnimator ofInt2 = ValueAnimator.ofInt(getTop(), top);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.DragFlatViewGroup.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                DragFlatViewGroup dragFlatViewGroup = DragFlatViewGroup.this;
                dragFlatViewGroup.offsetTopAndBottom(intValue - DragFlatViewGroup.access$100(dragFlatViewGroup));
                DragFlatViewGroup.access$102(DragFlatViewGroup.this, intValue);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.start();
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.DragFlatViewGroup.3
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
                } else if (DragFlatViewGroup.access$200(DragFlatViewGroup.this) == null) {
                } else {
                    DragFlatViewGroup.access$200(DragFlatViewGroup.this).onLocationChange(DragFlatViewGroup.this.getLeft(), DragFlatViewGroup.this.getTop());
                }
            }
        });
    }

    private int findMinValue(Integer... numArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55dacbd4", new Object[]{this, numArr})).intValue() : ((Integer) Collections.min(Arrays.asList(numArr))).intValue();
    }
}
