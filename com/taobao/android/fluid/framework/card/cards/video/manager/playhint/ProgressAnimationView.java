package com.taobao.android.fluid.framework.card.cards.video.manager.playhint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ohd;
import tb.spz;

/* loaded from: classes5.dex */
public class ProgressAnimationView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ProgressAnimationView";
    private b animationer;
    private View mSeekBar;

    static {
        kge.a(394214560);
    }

    public static /* synthetic */ Object ipc$super(ProgressAnimationView progressAnimationView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ProgressAnimationView(Context context) {
        super(context);
        init();
    }

    public ProgressAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ProgressAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void hideProgressAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded80cbc", new Object[]{this});
        } else if (this.mSeekBar == null) {
        } else {
            setVisibility(4);
            this.mSeekBar.setVisibility(0);
            b bVar = this.animationer;
            if (bVar == null) {
                return;
            }
            bVar.b(this);
        }
    }

    public boolean isVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue() : getParent() != null && getVisibility() == 0;
    }

    public void showProgressAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c500151", new Object[]{this, view});
        } else if (view == null) {
        } else {
            if (this.mSeekBar == null) {
                initView(view);
                this.mSeekBar = view;
            }
            setVisibility(0);
            view.setVisibility(8);
            if (this.animationer == null) {
                this.animationer = new b();
            }
            this.animationer.a(this);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setVisibility(4);
        }
    }

    private void initView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
            return;
        }
        try {
            setBackgroundColor(-1);
            int measuredHeight = view.getMeasuredHeight();
            int b = ohd.b(view.getContext(), 1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b);
            int i = (measuredHeight - b) / 2;
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
            layoutParams.addRule(15);
            if (view.getParent() instanceof RelativeLayout) {
                ((RelativeLayout) view.getParent()).addView(this, layoutParams);
            }
            spz.a(TAG, "initView Complete seekBarHeight=" + measuredHeight);
        } catch (Exception e) {
            spz.a(TAG, "initView Error " + e.getMessage());
        }
    }
}
