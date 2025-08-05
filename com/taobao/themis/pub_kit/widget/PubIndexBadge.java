package com.taobao.themis.pub_kit.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import tb.kge;

/* loaded from: classes9.dex */
public class PubIndexBadge extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int bgWidth;
    private TUrlImageView imgHomeIcon;
    public boolean isShort;
    private String title;
    private TextView tvHomeTitle;
    private View vBg;

    static {
        kge.a(-192809260);
    }

    public static /* synthetic */ TextView access$000(PubIndexBadge pubIndexBadge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("1feff546", new Object[]{pubIndexBadge}) : pubIndexBadge.tvHomeTitle;
    }

    public static /* synthetic */ String access$100(PubIndexBadge pubIndexBadge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1ea44ed", new Object[]{pubIndexBadge}) : pubIndexBadge.title;
    }

    public PubIndexBadge(Context context) {
        super(context);
        init(context);
    }

    public PubIndexBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View.inflate(context, R.layout.tms_pub_view_pub_index_badge, this);
        this.imgHomeIcon = (TUrlImageView) findViewById(R.id.imgHomeIcon);
        this.imgHomeIcon.addFeature(new RoundFeature());
        this.tvHomeTitle = (TextView) findViewById(R.id.tvHome);
        this.vBg = findViewById(R.id.btnHomeBg);
    }

    public void setData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8cc547", new Object[]{this, str, str2});
            return;
        }
        this.title = str2;
        this.imgHomeIcon.setImageUrl(str);
        this.tvHomeTitle.setText(str2);
    }

    public void scaleShort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9054d9", new Object[]{this});
        } else if (this.isShort) {
        } else {
            this.tvHomeTitle.setText("");
            this.bgWidth = this.tvHomeTitle.getWidth();
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofInt = ValueAnimator.ofInt(this.tvHomeTitle.getWidth(), 0);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.themis.pub_kit.widget.PubIndexBadge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    ViewGroup.LayoutParams layoutParams = PubIndexBadge.access$000(PubIndexBadge.this).getLayoutParams();
                    layoutParams.width = intValue;
                    PubIndexBadge.access$000(PubIndexBadge.this).setLayoutParams(layoutParams);
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.vBg, "alpha", 1.0f, 0.0f);
            animatorSet.setDuration(300L);
            animatorSet.play(ofInt);
            animatorSet.play(ofFloat);
            animatorSet.start();
            this.isShort = true;
        }
    }

    public void scaleRevert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4e2d55", new Object[]{this});
        } else if (!this.isShort) {
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.bgWidth);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.themis.pub_kit.widget.PubIndexBadge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    ViewGroup.LayoutParams layoutParams = PubIndexBadge.access$000(PubIndexBadge.this).getLayoutParams();
                    layoutParams.width = intValue;
                    PubIndexBadge.access$000(PubIndexBadge.this).setLayoutParams(layoutParams);
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.vBg, "alpha", 0.0f, 1.0f);
            animatorSet.setDuration(300L);
            animatorSet.play(ofInt);
            animatorSet.play(ofFloat);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.themis.pub_kit.widget.PubIndexBadge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        PubIndexBadge.access$000(PubIndexBadge.this).setText(PubIndexBadge.access$100(PubIndexBadge.this));
                    }
                }
            });
            animatorSet.start();
            this.isShort = false;
        }
    }
}
