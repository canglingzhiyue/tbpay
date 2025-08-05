package com.taobao.search.sf.widgets.onesearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class OneSearchContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean interceptTouch;

    static {
        kge.a(-1303655972);
    }

    public static /* synthetic */ Object ipc$super(OneSearchContainer oneSearchContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public OneSearchContainer(Context context) {
        super(context);
        this.interceptTouch = false;
    }

    public OneSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.interceptTouch = false;
    }

    public void setInterceptTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63db9dee", new Object[]{this, new Boolean(z)});
        } else {
            this.interceptTouch = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.interceptTouch) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
