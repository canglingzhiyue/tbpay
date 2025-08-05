package com.taobao.tao.flexbox.layoutmanager.animation.shareelement;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class BaseTNodePhotoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float endCornerRadius;
    public float startCornerRadius;

    static {
        kge.a(500000944);
    }

    public BaseTNodePhotoView(Context context) {
        super(context);
    }

    public BaseTNodePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseTNodePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setCornerRadius(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72980d0", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.startCornerRadius = f;
        this.endCornerRadius = f2;
    }
}
