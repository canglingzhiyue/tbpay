package com.etao.feimagesearch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public final class TagScrollView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean scrollToLast;

    static {
        kge.a(292557873);
    }

    public static /* synthetic */ Object ipc$super(TagScrollView tagScrollView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public TagScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean getScrollToLast() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9ca71df", new Object[]{this})).booleanValue() : this.scrollToLast;
    }

    public final void setScrollToLast(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1a88cd", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollToLast = z;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getMeasuredWidth() <= 0 || !this.scrollToLast) {
            return;
        }
        scrollTo(childAt.getMeasuredWidth(), 0);
        this.scrollToLast = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
