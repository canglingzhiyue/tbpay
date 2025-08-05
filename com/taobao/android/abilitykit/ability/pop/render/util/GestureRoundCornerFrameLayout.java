package com.taobao.android.abilitykit.ability.pop.render.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dmr;
import tb.dms;
import tb.kge;

/* loaded from: classes4.dex */
public class GestureRoundCornerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDisAllowParentIntercept;
    private c mGestureHandler;

    static {
        kge.a(-1535651882);
    }

    public static /* synthetic */ Object ipc$super(GestureRoundCornerFrameLayout gestureRoundCornerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    public GestureRoundCornerFrameLayout(Context context) {
        this(context, null);
    }

    public GestureRoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureRoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isDisAllowParentIntercept = false;
        this.isDisAllowParentIntercept = dmr.r();
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            setRadius(f, f, f, f);
        }
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f && !dms.b(getContext())) {
        } else {
            d.a(this, f, f2, f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isDisAllowParentIntercept) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if ((action == 1 || action == 3) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        c cVar = this.mGestureHandler;
        if (cVar != null) {
            return cVar.b(motionEvent, this);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        c cVar = this.mGestureHandler;
        if (cVar != null) {
            cVar.a(motionEvent, this);
        }
        return true;
    }

    public void setGestureHandler(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c586fb", new Object[]{this, cVar});
        } else {
            this.mGestureHandler = cVar;
        }
    }
}
