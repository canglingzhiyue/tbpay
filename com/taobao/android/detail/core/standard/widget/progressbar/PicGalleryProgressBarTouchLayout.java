package com.taobao.android.detail.core.standard.widget.progressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryProgressBarTouchLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1292767538);
    }

    public PicGalleryProgressBarTouchLayout(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBarTouchLayout");
    }

    public PicGalleryProgressBarTouchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        emu.a("com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBarTouchLayout");
    }

    public PicGalleryProgressBarTouchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emu.a("com.taobao.android.detail.core.standard.widget.progressbar.PicGalleryProgressBarTouchLayout");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        requestDisallowInterceptTouchEvent(true);
        return true;
    }
}
