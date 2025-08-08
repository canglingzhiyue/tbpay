package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import tb.ohd;

/* loaded from: classes8.dex */
public class FeedToastView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable mHideAction;
    private Animation mHideAnimation;
    private Animation mShowAnimation;

    static {
        kge.a(1022682221);
    }

    public static /* synthetic */ Object ipc$super(FeedToastView feedToastView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(FeedToastView feedToastView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d59dd9d", new Object[]{feedToastView});
        } else {
            feedToastView.destroy();
        }
    }

    public FeedToastView(Context context) {
        this(context, null, 0);
    }

    public FeedToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mHideAction = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.FeedToastView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FeedToastView.this.hide();
                }
            }
        };
    }

    public FeedToastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHideAction = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.view.FeedToastView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FeedToastView.this.hide();
                }
            }
        };
    }

    public void show(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            setText(str);
            if (this.mShowAnimation == null) {
                this.mShowAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tf_up_to_down);
            }
            setLines(1);
            setVisibility(0);
            startAnimation(this.mShowAnimation);
            removeCallbacks(this.mHideAction);
            postDelayed(this.mHideAction, 2500L);
        }
    }

    public void show(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eba6b6", new Object[]{this, str, new Long(j)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            setText(str);
            if (this.mShowAnimation == null) {
                this.mShowAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tf_up_to_down);
            }
            setLines(1);
            startAnimation(this.mShowAnimation);
            removeCallbacks(this.mHideAction);
            Runnable runnable = this.mHideAction;
            if (j <= 0) {
                j = 2500;
            }
            postDelayed(runnable, j);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setBackgroundResource(R.drawable.layout_gradient_msg_bg);
        setTextColor(-1);
        setTextSize(ohd.b(getContext(), 14));
        setHeight(ohd.b(getContext(), 30));
        setGravity(17);
        setVisibility(0);
        setPadding(ohd.b(getContext(), 15), 0, ohd.b(getContext(), 15), 0);
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (getVisibility() == 8) {
        } else {
            if (this.mHideAnimation == null) {
                this.mHideAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tf_down_to_up);
            }
            this.mHideAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.FeedToastView.2
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
                        FeedToastView.access$000(FeedToastView.this);
                    }
                }
            });
            startAnimation(this.mHideAnimation);
            setVisibility(8);
        }
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        removeCallbacks(this.mHideAction);
        if (!(getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) getParent()).removeView(this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        removeCallbacks(this.mHideAction);
        setVisibility(8);
    }
}
