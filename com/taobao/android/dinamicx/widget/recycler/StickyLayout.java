package com.taobao.android.dinamicx.widget.recycler;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class StickyLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d mHeightListener;
    private ViewGroup mOuterRecyclerView;

    static {
        kge.a(-537315797);
    }

    public static /* synthetic */ Object ipc$super(StickyLayout stickyLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        }
    }

    public StickyLayout(Context context) {
        super(context);
    }

    public void setRecyclerView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678bcc", new Object[]{this, viewGroup});
        } else {
            this.mOuterRecyclerView = viewGroup;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.isLayoutRequested()) {
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getLeft() + childAt.getMeasuredWidth(), childAt.getTop() + childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        boolean z = false;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            int measuredHeight = childAt.getMeasuredHeight();
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            if (measuredHeight != childAt.getMeasuredHeight()) {
                z = true;
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (!z || (dVar = this.mHeightListener) == null) {
            return;
        }
        dVar.a();
    }

    public void setHeightUpdateListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc91a68", new Object[]{this, dVar});
        } else {
            this.mHeightListener = dVar;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (this.mOuterRecyclerView != null) {
                if (this.mOuterRecyclerView.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (this.mOuterRecyclerView != null) {
                if (this.mOuterRecyclerView.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df58e74", new Object[]{this, view, view2});
            return;
        }
        super.onDescendantInvalidated(view, view2);
        ViewGroup viewGroup = this.mOuterRecyclerView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.invalidate();
    }
}
