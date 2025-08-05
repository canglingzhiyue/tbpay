package com.taobao.tbmobilesmartapi.collector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class DefaultGestureCollectorDelegateLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a gestureCollector;

    static {
        kge.a(1363820119);
    }

    public static /* synthetic */ Object ipc$super(DefaultGestureCollectorDelegateLayout defaultGestureCollectorDelegateLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DefaultGestureCollectorDelegateLayout(Context context) {
        super(context);
        this.gestureCollector = null;
    }

    public DefaultGestureCollectorDelegateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gestureCollector = null;
    }

    public DefaultGestureCollectorDelegateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gestureCollector = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        a aVar = this.gestureCollector;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setGestureCollector(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee782d50", new Object[]{this, aVar});
        } else {
            this.gestureCollector = aVar;
        }
    }
}
