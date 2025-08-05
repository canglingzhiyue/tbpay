package com.etao.feimagesearch.structure.capture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class GestureLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a callback;
    private boolean drop;
    private float lastX;
    private float lastY;
    private final int touchSlop;

    /* loaded from: classes3.dex */
    public interface a {
        int a();
    }

    static {
        kge.a(-1084836483);
    }

    public static /* synthetic */ Object ipc$super(GestureLayout gestureLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public GestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.drop = false;
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public void setPullUpListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c1020a", new Object[]{this, aVar});
        } else {
            this.callback = aVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.callback == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.drop) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.lastX = motionEvent.getX();
                this.lastY = motionEvent.getY();
            } else if (actionMasked == 2 && Math.abs(motionEvent.getX() - this.lastX) > this.touchSlop) {
                this.drop = true;
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            boolean z = this.drop;
            this.drop = false;
            if (!z && this.lastY - motionEvent.getY() >= this.callback.a()) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.dispatchTouchEvent(obtain);
                return true;
            }
        } else if (motionEvent.getActionMasked() == 3) {
            this.drop = false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }
}
