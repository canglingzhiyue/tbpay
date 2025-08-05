package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class FlexibleContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float FONT_SIZE = 10.0f;
    private boolean isTemplateRoot;
    public final Object lock;
    private View.OnAttachStateChangeListener mExtOnAttachListener;
    public Paint paint;

    static {
        kge.a(-97771748);
    }

    public static /* synthetic */ Object ipc$super(FlexibleContainerView flexibleContainerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1899296582:
                return super.getTag(((Number) objArr[0]).intValue());
            case -148052640:
                super.setTag(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public FlexibleContainerView(Context context) {
        super(context);
        this.paint = null;
        this.lock = new Object();
        this.isTemplateRoot = false;
    }

    public void setIsTemplateRoot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbdc065", new Object[]{this, new Boolean(z)});
        } else {
            this.isTemplateRoot = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.mExtOnAttachListener;
        if (onAttachStateChangeListener == null) {
            return;
        }
        onAttachStateChangeListener.onViewAttachedToWindow(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.mExtOnAttachListener;
        if (onAttachStateChangeListener == null) {
            return;
        }
        onAttachStateChangeListener.onViewDetachedFromWindow(this);
    }

    public View.OnAttachStateChangeListener getExtOnAttachListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("11c004bf", new Object[]{this}) : this.mExtOnAttachListener;
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72ce560", new Object[]{this, new Integer(i), obj});
            return;
        }
        synchronized (this) {
            super.setTag(i, obj);
        }
    }

    @Override // android.view.View
    public Object getTag(int i) {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8ecb08ba", new Object[]{this, new Integer(i)});
        }
        synchronized (this) {
            tag = super.getTag(i);
        }
        return tag;
    }

    @Deprecated
    public void setExtOnAttachListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23195287", new Object[]{this, onAttachStateChangeListener});
        } else {
            this.mExtOnAttachListener = onAttachStateChangeListener;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int width = layoutParams2.width();
            int height = layoutParams2.height();
            setMeasuredDimension(width, height);
            measureChildren(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        } else if (layoutParams.width > 0 && layoutParams.height > 0) {
            setMeasuredDimension(layoutParams.width, layoutParams.height);
            measureChildren(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(1073741824), View.MeasureSpec.getSize(1073741824));
            measureChildren(i, i2);
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
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                childAt.layout(layoutParams2.left, layoutParams2.top, layoutParams2.right, layoutParams2.bottom);
            } else {
                childAt.layout(0, 0, layoutParams.width, layoutParams.height);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("b93385aa", new Object[]{this, layoutParams}) : new LayoutParams(layoutParams);
    }

    /* loaded from: classes6.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int bottom;
        private int layoutMarginLeft;
        private int layoutMarginTop;
        public int left;
        private int outlineHeight;
        private int outlineWidth;
        public int right;
        public int top;

        static {
            kge.a(2072045048);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.right = i;
            this.bottom = i2;
            this.outlineWidth = i;
            this.outlineHeight = i2;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.right = this.width;
            this.bottom = this.height;
            this.outlineWidth = this.width;
            this.outlineHeight = this.height;
        }

        public void fillLayoutResult(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ceb6ae8", new Object[]{this, rect});
                return;
            }
            this.left = rect.left;
            this.top = rect.top;
            this.right = rect.right;
            this.bottom = rect.bottom;
            this.width = this.right - this.left;
            this.height = this.bottom - this.top;
        }

        public void setLayoutMarginLeft(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45c431db", new Object[]{this, new Integer(i)});
            } else {
                this.layoutMarginLeft = i;
            }
        }

        public void setLayoutMarginTop(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3188841", new Object[]{this, new Integer(i)});
            } else {
                this.layoutMarginTop = i;
            }
        }

        public void move(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab966fc1", new Object[]{this, rect});
                return;
            }
            this.left = rect.left + this.layoutMarginLeft;
            this.top = rect.top + this.layoutMarginTop;
            this.right = this.left + this.width;
            this.bottom = this.top + this.height;
        }

        public void offset(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de25497a", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.left += i;
            this.top += i2;
            this.right = this.left + this.width;
            this.bottom = this.top + this.height;
        }

        public int width() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcdb5f40", new Object[]{this})).intValue() : this.right - this.left;
        }

        public int height() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue() : this.bottom - this.top;
        }

        public int getOutlineWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("768e0894", new Object[]{this})).intValue() : this.outlineWidth;
        }

        public int getOutlineHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1565ab4d", new Object[]{this})).intValue() : this.outlineHeight;
        }

        public void read(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b904dedc", new Object[]{this, rect});
                return;
            }
            rect.left = this.left;
            rect.top = this.top;
            rect.right = this.right;
            rect.bottom = this.bottom;
        }
    }
}
