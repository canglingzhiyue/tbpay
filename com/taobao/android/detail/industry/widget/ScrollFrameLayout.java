package com.taobao.android.detail.industry.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class ScrollFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mOnScrollInterceptor;
    private b mOnViewLifecycleListener;
    private float mTouchDownX;
    private float mTouchDownY;

    /* loaded from: classes4.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void b();
    }

    static {
        kge.a(-376970395);
    }

    public static /* synthetic */ Object ipc$super(ScrollFrameLayout scrollFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public ScrollFrameLayout(Context context) {
        super(context);
    }

    public ScrollFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ScrollFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mTouchDownX = motionEvent.getX();
            this.mTouchDownY = motionEvent.getY();
            return true;
        }
        if (action == 2) {
            if (Math.abs(motionEvent.getX() - this.mTouchDownX) > Math.abs(motionEvent.getY() - this.mTouchDownY)) {
                if (!shouldHorizontalScroll()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (!shouldVerticalScroll()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        b bVar = this.mOnViewLifecycleListener;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        b bVar = this.mOnViewLifecycleListener;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    private boolean shouldVerticalScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a1b1001", new Object[]{this})).booleanValue();
        }
        a aVar = this.mOnScrollInterceptor;
        return aVar != null && aVar.a();
    }

    private boolean shouldHorizontalScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e9a3a6f", new Object[]{this})).booleanValue();
        }
        a aVar = this.mOnScrollInterceptor;
        return aVar != null && aVar.b();
    }

    public void setOnScrollInterceptor(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8819e1", new Object[]{this, aVar});
        } else {
            this.mOnScrollInterceptor = aVar;
        }
    }

    public void setOnViewLifecycleListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0912d1f", new Object[]{this, bVar});
        } else {
            this.mOnViewLifecycleListener = bVar;
        }
    }
}
