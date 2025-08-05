package com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class InterceptTouchEventCover extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1765034404);
    }

    public static /* synthetic */ Object ipc$super(InterceptTouchEventCover interceptTouchEventCover, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public InterceptTouchEventCover(Context context) {
        super(context);
    }

    public InterceptTouchEventCover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptTouchEventCover(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InterceptTouchEventCover(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                viewGroup.requestDisallowInterceptTouchEvent(true);
            } else if (action == 1 || action == 3) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
