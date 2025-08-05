package com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class WaitingView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(71319522);
    }

    public WaitingView(Context context) {
        super(context);
        init(context);
    }

    public WaitingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public WaitingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.WaitingView");
        if (isInEditMode()) {
            return;
        }
        DetailImageView detailImageView = new DetailImageView(context);
        Drawable drawable = context.getResources().getDrawable(R.drawable.taodetail_waiting);
        detailImageView.setBackgroundDrawable(drawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        addView(detailImageView, layoutParams);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360000.0f, drawable.getMinimumWidth() / 2, drawable.getMinimumHeight() / 2);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(800000L);
        rotateAnimation.setRepeatCount(-1);
        detailImageView.startAnimation(rotateAnimation);
    }
}
