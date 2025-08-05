package com.taobao.android.weex_framework.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSTouchInterceptWrapperView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mTouchDisabled;

    static {
        kge.a(-653981559);
    }

    public static /* synthetic */ Object ipc$super(MUSTouchInterceptWrapperView mUSTouchInterceptWrapperView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MUSTouchInterceptWrapperView(Context context) {
        super(context);
    }

    public MUSTouchInterceptWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MUSTouchInterceptWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mTouchDisabled) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean isTouchDisabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb59dc", new Object[]{this})).booleanValue() : this.mTouchDisabled;
    }

    public void setTouchDisabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6669e534", new Object[]{this, new Boolean(z)});
        } else {
            this.mTouchDisabled = z;
        }
    }
}
