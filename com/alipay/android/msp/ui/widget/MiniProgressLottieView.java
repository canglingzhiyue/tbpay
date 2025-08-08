package com.alipay.android.msp.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.ILottiePLugin;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class MiniProgressLottieView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private CharSequence mMessage;
    private TextView pb;
    private ProgressLoadingView pc;
    private View pd;
    private ILottiePLugin pe;
    private boolean pf;

    public static /* synthetic */ Object ipc$super(MiniProgressLottieView miniProgressLottieView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ View access$000(MiniProgressLottieView miniProgressLottieView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("675cb818", new Object[]{miniProgressLottieView}) : miniProgressLottieView.pd;
    }

    public static /* synthetic */ void access$100(MiniProgressLottieView miniProgressLottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f28d35", new Object[]{miniProgressLottieView});
        } else {
            miniProgressLottieView.ap();
        }
    }

    public MiniProgressLottieView(Context context) {
        this(context, null);
    }

    public MiniProgressLottieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MiniProgressLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        this.pe = PhoneCashierMspEngine.getMspWallet().getLottiePlugin();
        this.pf = !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_LOTTIE_LOADING, false, context) && this.pe != null && (Build.VERSION.SDK_INT >= 28);
        LogUtil.record(2, "MiniProgressLottieView:initView", "ShowLottie =" + this.pf);
        if (this.pf) {
            LogUtil.record(2, "MiniProgressLottieView:initLottieView", "activity =" + this.mContext);
            inflate(this.mContext, R.layout.flybird_dialog_progress_lottie, this);
            this.pb = (TextView) findViewById(R.id.tv_flybird_dialog_layout);
            this.pb.setText(LanguageHelper.localizedStringForKey("mini_loading", this.mContext.getString(R.string.mini_loading), new Object[0]));
            this.pd = this.pe.CreateLottieView(this.mContext);
            ((LinearLayout) findViewById(R.id.flybird_dialog_layout)).addView(this.pd, 0);
            ap();
            this.pe.setAnimation("alipay_msp_lottie/msp_loading.zip");
            this.pe.setLoop(true);
            this.pe.setAutoplay(true);
            this.pe.startAnimation();
        } else {
            LogUtil.record(2, "MiniProgressLottieView:initProcessDialogView", "activity =" + this.mContext);
            inflate(this.mContext, R.layout.flybird_dialog_progress, this);
            this.pb = (TextView) findViewById(R.id.tv_flybird_dialog_layout);
            this.pb.setText(LanguageHelper.localizedStringForKey("mini_loading", this.mContext.getString(R.string.mini_loading), new Object[0]));
            this.pc = new ProgressLoadingView(this.mContext);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            this.pc.setLayoutParams(layoutParams);
            ((LinearLayout) findViewById(R.id.flybird_dialog_layout)).addView(this.pc);
            this.pc.startPointAnimation();
        }
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setGravity(17);
        startShowAnimation();
    }

    private void ap() {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc5e136", new Object[]{this});
        } else if (this.pd == null) {
        } else {
            if (StringUtils.isEmpty(this.mMessage)) {
                TextView textView = this.pb;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                layoutParams = new LinearLayout.LayoutParams(ResUtils.dip2px(this.mContext, 68.0f), ResUtils.dip2px(this.mContext, 55.0f));
            } else {
                layoutParams = new LinearLayout.LayoutParams(ResUtils.dip2px(this.mContext, 60.0f), ResUtils.dip2px(this.mContext, 49.0f));
                TextView textView2 = this.pb;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
            this.pd.setLayoutParams(layoutParams);
        }
    }

    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
            return;
        }
        LogUtil.record(2, "MiniProgressLottieView:setMessage", "message =".concat(String.valueOf(charSequence)));
        if (!this.pf && StringUtils.isEmpty(charSequence)) {
            charSequence = LanguageHelper.localizedStringForKey("mini_loading", this.mContext.getString(R.string.mini_loading), new Object[0]);
        }
        if (StringUtils.equals(charSequence, this.mMessage)) {
            return;
        }
        if (StringUtils.isEmpty(this.mMessage)) {
            a(0.88f);
        } else if (StringUtils.isEmpty(charSequence)) {
            a(1.12f);
        } else {
            ap();
        }
        this.mMessage = charSequence;
        TextView textView = this.pb;
        if (textView == null) {
            return;
        }
        textView.setText(this.mMessage);
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.pd == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 16) {
                float f2 = -ResUtils.dip2px(this.mContext, 10.0f);
                if (f > 1.0f) {
                    f2 = -f2;
                }
                this.pd.animate().scaleX(f).scaleY(f).translationY(f2).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.alipay.android.msp.ui.widget.MiniProgressLottieView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == -2145066406) {
                            super.onAnimationEnd((Animator) objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            return;
                        }
                        super.onAnimationEnd(animator);
                        MiniProgressLottieView.access$000(MiniProgressLottieView.this).setTranslationY(0.0f);
                        MiniProgressLottieView.access$000(MiniProgressLottieView.this).setScaleX(1.0f);
                        MiniProgressLottieView.access$000(MiniProgressLottieView.this).setScaleY(1.0f);
                        MiniProgressLottieView.access$100(MiniProgressLottieView.this);
                    }
                }).withLayer().start();
                return;
            }
            ap();
        }
    }

    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
        } else if (this.pf) {
            this.pe.stopAnimation();
        } else {
            ProgressLoadingView progressLoadingView = this.pc;
            if (progressLoadingView == null) {
                return;
            }
            progressLoadingView.stopPointAnimation();
        }
    }

    public String getProgressMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94705a95", new Object[]{this});
        }
        CharSequence charSequence = this.mMessage;
        return charSequence == null ? "" : charSequence.toString();
    }

    public void startShowAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dda1cc", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:startShowAnimation", "");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        clearAnimation();
        startAnimation(alphaAnimation);
    }

    public void startDismissAnimation(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9628674f", new Object[]{this, animationListener});
            return;
        }
        LogUtil.record(2, "MiniProgressDialog:startDismissAnimation", "");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(animationListener);
        clearAnimation();
        startAnimation(alphaAnimation);
    }
}
