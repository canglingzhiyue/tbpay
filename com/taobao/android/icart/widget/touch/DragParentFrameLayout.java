package com.taobao.android.icart.widget.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DragParentFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DragFloatLayer dragFloatLayer;

    static {
        kge.a(-69593737);
    }

    public static /* synthetic */ Object ipc$super(DragParentFrameLayout dragParentFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DragParentFrameLayout(Context context) {
        super(context);
    }

    public DragParentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DragParentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void attach(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697fe0d0", new Object[]{this, dragFloatLayer});
        } else {
            this.dragFloatLayer = dragFloatLayer;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.dragFloatLayer.setLastMonitorEvent(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.dragFloatLayer.setVisibility(8);
        }
        if (this.dragFloatLayer.isDraging()) {
            this.dragFloatLayer.dispatchTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
