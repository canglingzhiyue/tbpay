package com.taobao.android.detail.core.detail.fragment.desc.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class MinVideoFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(385758928);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public MinVideoFrameLayout(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.video.view.MinVideoFrameLayout");
    }

    public MinVideoFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.video.view.MinVideoFrameLayout");
    }

    public MinVideoFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.video.view.MinVideoFrameLayout");
    }
}
