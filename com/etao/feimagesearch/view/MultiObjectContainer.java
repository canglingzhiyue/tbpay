package com.etao.feimagesearch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes4.dex */
public final class MultiObjectContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-48208892);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiObjectContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : isClickable();
    }
}
