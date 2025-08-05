package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import tb.kge;

/* loaded from: classes6.dex */
public class FlexiblePageViewPriceAnimation extends FlexiblePageViewNormal {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mButtonPriceExpend;
    private TextView mPrefixPriceExpend;
    private ValueAnimator mPriceAnimator;

    static {
        kge.a(-1865357851);
    }

    public static /* synthetic */ Object ipc$super(FlexiblePageViewPriceAnimation flexiblePageViewPriceAnimation, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2063239560:
                super.showExpendViewAnim();
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 639853765:
                super.dismissExpendViewAnim();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ TextView access$000(FlexiblePageViewPriceAnimation flexiblePageViewPriceAnimation) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5e74b115", new Object[]{flexiblePageViewPriceAnimation}) : flexiblePageViewPriceAnimation.mButtonPriceExpend;
    }

    public static /* synthetic */ ValueAnimator access$102(FlexiblePageViewPriceAnimation flexiblePageViewPriceAnimation, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("ae350274", new Object[]{flexiblePageViewPriceAnimation, valueAnimator});
        }
        flexiblePageViewPriceAnimation.mPriceAnimator = valueAnimator;
        return valueAnimator;
    }

    public FlexiblePageViewPriceAnimation(Context context) {
        this(context, null);
    }

    public FlexiblePageViewPriceAnimation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexiblePageViewPriceAnimation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewNormal
    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
        } else {
            instanceView(context);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewNormal
    public void instanceLeftBottomView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30be8dd5", new Object[]{this, context});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.mButtonLayoutExpend = linearLayout;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        addView(this.mButtonLayoutExpend, layoutParams);
        linearLayout.setGravity(83);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.mButtonLayoutExpend.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setGravity(83);
        linearLayout2.setOrientation(0);
        this.mPrefixPriceExpend = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        updateTextViewParams(this.mPrefixPriceExpend, "#FF0912");
        this.mPrefixPriceExpend.setGravity(83);
        this.mPrefixPriceExpend.setTypeface(null, 1);
        this.mPrefixPriceExpend.setText("¥");
        linearLayout2.addView(this.mPrefixPriceExpend, layoutParams2);
        this.mButtonPriceExpend = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        updateTextViewParams(this.mButtonPriceExpend, "#FF0912");
        this.mButtonPriceExpend.setGravity(19);
        this.mButtonPriceExpend.setTypeface(null, 1);
        linearLayout2.addView(this.mButtonPriceExpend, layoutParams3);
        this.mButtonExpend = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        updateTextViewParams(this.mButtonExpend, "#FF0036");
        this.mButtonExpend.setGravity(19);
        this.mButtonLayoutExpend.addView(this.mButtonExpend, layoutParams4);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewNormal
    public void dismissExpendViewAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262364c5", new Object[]{this});
            return;
        }
        super.dismissExpendViewAnim();
        this.mButtonPriceExpend.setText(this.enableAutoJellyMarquee ? this.mPageViewEntity.itemPrice : this.mPageViewEntity.promotionPrice);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewNormal
    public void showExpendViewAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85057678", new Object[]{this});
            return;
        }
        super.showExpendViewAnim();
        showPriceAnim();
    }

    private void showPriceAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76a6a84", new Object[]{this});
        } else if (!this.enableAutoJellyMarquee) {
        } else {
            int c = (int) (l.c(this.mPageViewEntity.itemPrice) * 100.0f);
            int c2 = (int) (l.c(this.mPageViewEntity.promotionPrice) * 100.0f);
            if (c <= 0 || c2 <= 0 || c <= c2) {
                return;
            }
            ValueAnimator valueAnimator = this.mPriceAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.mPriceAnimator = null;
            }
            TextView textView = this.mButtonPriceExpend;
            if (textView != null) {
                textView.setText(this.mPageViewEntity.itemPrice);
            }
            this.mPriceAnimator = ValueAnimator.ofInt(c, c2);
            this.mPriceAnimator.setDuration(1000L);
            this.mPriceAnimator.setStartDelay(500L);
            this.mPriceAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewPriceAnimation.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    final String sb;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (FlexiblePageViewPriceAnimation.access$000(FlexiblePageViewPriceAnimation.this) == null) {
                    } else {
                        int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                        int i = intValue % 100;
                        if (i == 0) {
                            sb = String.valueOf(intValue / 100);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(intValue / 100);
                            sb2.append(".");
                            if (i % 10 == 0) {
                                i /= 10;
                            }
                            sb2.append(i);
                            sb = sb2.toString();
                        }
                        FlexiblePageViewPriceAnimation.access$000(FlexiblePageViewPriceAnimation.this).post(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewPriceAnimation.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (FlexiblePageViewPriceAnimation.access$000(FlexiblePageViewPriceAnimation.this) == null) {
                                } else {
                                    FlexiblePageViewPriceAnimation.access$000(FlexiblePageViewPriceAnimation.this).setText(sb);
                                }
                            }
                        });
                    }
                }
            });
            this.mPriceAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewPriceAnimation.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
                    } else {
                        FlexiblePageViewPriceAnimation.access$102(FlexiblePageViewPriceAnimation.this, null);
                    }
                }
            });
            this.mPriceAnimator.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mPriceAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.end();
        this.mPriceAnimator = null;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0 || (valueAnimator = this.mPriceAnimator) == null) {
            return;
        }
        valueAnimator.end();
        this.mPriceAnimator = null;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.FlexiblePageViewNormal
    public void updateLeftBottomLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f5f0b7", new Object[]{this, new Integer(i)});
        } else if (!TextUtils.isEmpty(this.mPageViewEntity.itemPrice) && !TextUtils.isEmpty(this.mPageViewEntity.promotionPrice)) {
            this.mButtonLayoutExpend.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mButtonLayoutExpend.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = adjustDP(i, 65);
            layoutParams.height = adjustDP(i, 58);
            layoutParams.leftMargin = adjustDP(i, 35);
            layoutParams.bottomMargin = adjustDP(i, 9);
            this.mButtonLayoutExpend.setLayoutParams(layoutParams);
            String str = this.enableAutoJellyMarquee ? this.mPageViewEntity.itemPrice : this.mPageViewEntity.promotionPrice;
            if (checkIsNotEmpty(this.mPrefixPriceExpend, str)) {
                this.mPrefixPriceExpend.setTextSize(0, adjustDP(i, 10));
                this.mButtonPriceExpend.setText(str);
                int adjustDP = adjustDP(i, 14);
                this.mButtonPriceExpend.setTextSize(0, adjustDP);
                this.mButtonPriceExpend.setMinWidth(adjustDP(i, adjustDP * 5));
            }
            if (!checkIsNotEmpty(this.mButtonExpend, this.mPageViewEntity.priceSuffixText)) {
                return;
            }
            this.mButtonExpend.setText(this.mPageViewEntity.priceSuffixText);
            this.mButtonExpend.setTextSize(0, adjustDP(i, 12));
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mButtonExpend.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            }
            layoutParams2.bottomMargin = adjustDP(i, 9);
            this.mButtonExpend.setLayoutParams(layoutParams2);
        } else {
            this.mButtonLayoutExpend.setVisibility(4);
        }
    }
}
