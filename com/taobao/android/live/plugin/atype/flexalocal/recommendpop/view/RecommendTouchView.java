package com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class RecommendTouchView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnTouchListener mRecommendTouchListener;

    static {
        kge.a(71487396);
    }

    public static /* synthetic */ Object ipc$super(RecommendTouchView recommendTouchView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RecommendTouchView(Context context) {
        this(context, null);
    }

    public RecommendTouchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecommendTouchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        return !dispatchTouchEvent ? this.mRecommendTouchListener.onTouch(this, motionEvent) : dispatchTouchEvent;
    }

    public void setRecommendTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4be962", new Object[]{this, onTouchListener});
        } else {
            this.mRecommendTouchListener = onTouchListener;
        }
    }
}
