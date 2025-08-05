package com.taobao.android.detail.core.detail.widget.actionsheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class MaskView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canCancel;
    private long durationMillis;
    private boolean isShowing;
    private a maskListener;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-536365399);
    }

    public static /* synthetic */ boolean access$000(MaskView maskView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8746ff65", new Object[]{maskView})).booleanValue() : maskView.canCancel;
    }

    public MaskView(Context context, ViewGroup viewGroup) {
        super(context);
        this.durationMillis = 200L;
        init(viewGroup);
        emu.a("com.taobao.android.detail.core.detail.widget.actionsheet.MaskView");
    }

    private void init(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a8f8d6", new Object[]{this, viewGroup});
        } else if (viewGroup == null || isInEditMode()) {
        } else {
            setBackgroundColor(-2013265920);
            setVisibility(8);
            viewGroup.addView(this, new RelativeLayout.LayoutParams(-1, -1));
            setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.widget.actionsheet.MaskView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!MaskView.access$000(MaskView.this)) {
                    } else {
                        MaskView.this.dismiss();
                    }
                }
            });
        }
    }

    public void setDurationMillis(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202fd6a1", new Object[]{this, new Long(j)});
        } else {
            this.durationMillis = j;
        }
    }

    public void setCanCancel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c034e805", new Object[]{this, new Boolean(z)});
        } else {
            this.canCancel = z;
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.isShowing) {
        } else {
            this.isShowing = true;
            clearAnimation();
            setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.durationMillis);
            startAnimation(alphaAnimation);
        }
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (!this.isShowing) {
        } else {
            this.isShowing = false;
            clearAnimation();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(this.durationMillis);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail.core.detail.widget.actionsheet.MaskView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else {
                        MaskView.this.setVisibility(8);
                    }
                }
            });
            startAnimation(alphaAnimation);
            a aVar = this.maskListener;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    public void setOnMaskListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701ecd13", new Object[]{this, aVar});
        } else {
            this.maskListener = aVar;
        }
    }
}
