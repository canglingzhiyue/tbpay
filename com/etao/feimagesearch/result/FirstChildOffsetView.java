package com.etao.feimagesearch.result;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class FirstChildOffsetView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mCenter;
    private Runnable mFlingRunnable;
    private int mOffset;
    private ScrollerCompat mScroller;

    static {
        kge.a(-2079383801);
    }

    private int getDownStateOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba889ec6", new Object[]{this})).intValue();
        }
        return 1700;
    }

    public static /* synthetic */ Object ipc$super(FirstChildOffsetView firstChildOffsetView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ScrollerCompat access$100(FirstChildOffsetView firstChildOffsetView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollerCompat) ipChange.ipc$dispatch("ecf4278f", new Object[]{firstChildOffsetView}) : firstChildOffsetView.mScroller;
    }

    public static /* synthetic */ int access$200(FirstChildOffsetView firstChildOffsetView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c1be434", new Object[]{firstChildOffsetView})).intValue() : firstChildOffsetView.mOffset;
    }

    public FirstChildOffsetView(Context context) {
        super(context);
        this.mOffset = 0;
        this.mCenter = false;
    }

    public FirstChildOffsetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOffset = 0;
        this.mCenter = false;
    }

    public FirstChildOffsetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOffset = 0;
        this.mCenter = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = i4 - i2;
        if (isCenter()) {
            this.mOffset = (i5 - measuredHeight) / 2;
        }
        ViewCompat.offsetTopAndBottom(childAt, this.mOffset);
    }

    public void moveChildBy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef6db1a", new Object[]{this, new Integer(i)});
            return;
        }
        View childAt = getChildAt(0);
        int constrainOffset = constrainOffset(this.mOffset + i);
        ViewCompat.offsetTopAndBottom(childAt, constrainOffset - this.mOffset);
        this.mOffset = constrainOffset;
    }

    private int constrainOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1102cca5", new Object[]{this, new Integer(i)})).intValue();
        }
        int measuredHeight = getChildAt(0).getMeasuredHeight();
        if (measuredHeight <= getMeasuredHeight()) {
            return this.mOffset;
        }
        if (i > 0) {
            return 0;
        }
        return i < getMeasuredHeight() - measuredHeight ? getMeasuredHeight() - measuredHeight : i;
    }

    public void moveChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26168f76", new Object[]{this, new Integer(i)});
            return;
        }
        View childAt = getChildAt(0);
        int constrainOffset = constrainOffset(i);
        ViewCompat.offsetTopAndBottom(childAt, constrainOffset - this.mOffset);
        this.mOffset = constrainOffset;
    }

    public void flyChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d6fd18", new Object[]{this, new Integer(i)});
        } else {
            flyInternal(this.mOffset, constrainOffset(i));
        }
    }

    private void flyInternal(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6195f777", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Runnable runnable = this.mFlingRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mFlingRunnable = null;
        }
        if (this.mScroller == null) {
            this.mScroller = ScrollerCompat.create(getContext());
        }
        if (!this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        this.mScroller.startScroll(0, i, 0, i2 - i, 300);
        if (!this.mScroller.computeScrollOffset()) {
            return;
        }
        this.mFlingRunnable = new a();
        ViewCompat.postOnAnimation(this, this.mFlingRunnable);
    }

    public void appearAnim(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1c69a7", new Object[]{this, new Boolean(z)});
            return;
        }
        int i2 = this.mOffset;
        if (!z) {
            i = getDownStateOffset();
        }
        flyInternal(i2, i);
    }

    private boolean onChildRegion(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("75bc5bf1", new Object[]{this, motionEvent})).booleanValue() : motionEvent.getY() >= ((float) this.mOffset);
    }

    public int getChildState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cab8fc5", new Object[]{this})).intValue() : this.mOffset;
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-456033892);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FirstChildOffsetView.access$100(FirstChildOffsetView.this) == null || !FirstChildOffsetView.access$100(FirstChildOffsetView.this).computeScrollOffset()) {
            } else {
                int access$200 = FirstChildOffsetView.access$200(FirstChildOffsetView.this);
                int currY = FirstChildOffsetView.access$100(FirstChildOffsetView.this).getCurrY();
                if (access$200 != currY) {
                    FirstChildOffsetView.this.moveChildTo(currY);
                }
                ViewCompat.postOnAnimation(FirstChildOffsetView.this, this);
            }
        }
    }

    public int getOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue() : this.mOffset;
    }

    public boolean isCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c69b1b2a", new Object[]{this})).booleanValue() : this.mCenter;
    }

    public void setCenter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1101a36", new Object[]{this, new Boolean(z)});
        } else {
            this.mCenter = z;
        }
    }
}
