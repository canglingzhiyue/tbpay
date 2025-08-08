package com.taobao.android.pissarro.remote;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.icg;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class RemoteLoadingView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LottieAnimationView mAnimationView;
    private LinearLayout mContentLayout;
    private TextView mProgressTv;

    static {
        kge.a(-355151609);
    }

    public static /* synthetic */ Object ipc$super(RemoteLoadingView remoteLoadingView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RemoteLoadingView(Context context, TaopaiLoadConfig taopaiLoadConfig, View.OnClickListener onClickListener) {
        super(context);
        initView(taopaiLoadConfig);
    }

    private void initView(TaopaiLoadConfig taopaiLoadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d91e33", new Object[]{this, taopaiLoadConfig});
            return;
        }
        setBackgroundColor(-1);
        addContentParent();
        addLogo(taopaiLoadConfig);
        addTitle(taopaiLoadConfig);
        addProgress();
        addLoadingAnim();
    }

    private void addContentParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29b2e9", new Object[]{this});
            return;
        }
        this.mContentLayout = new LinearLayout(getContext());
        this.mContentLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.mContentLayout, layoutParams);
    }

    private void addLogo(TaopaiLoadConfig taopaiLoadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543083fc", new Object[]{this, taopaiLoadConfig});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(icg.a(getContext(), 114.0f), icg.a(getContext(), 114.0f));
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = icg.a(getContext(), 24.0f);
        this.mContentLayout.addView(frameLayout, layoutParams);
        View view = new View(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(0);
        if (Build.VERSION.SDK_INT >= 16) {
            gradientDrawable.setColors(new int[]{Color.parseColor("#FF5900"), Color.parseColor("#FF8002")});
        }
        view.setBackgroundDrawable(gradientDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(icg.a(getContext(), 62.0f), icg.a(getContext(), 62.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(view, layoutParams2);
        this.mAnimationView = new LottieAnimationView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        frameLayout.addView(this.mAnimationView, layoutParams3);
        this.mAnimationView.setAnimation(R.raw.taopai_loading_logo_anim);
        this.mAnimationView.loop(true);
        this.mAnimationView.playAnimation();
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource((taopaiLoadConfig == null || taopaiLoadConfig.getLogoResId() == 0) ? R.drawable.taopai_logo : taopaiLoadConfig.getLogoResId());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(icg.a(getContext(), 30.0f), icg.a(getContext(), 27.0f));
        layoutParams4.gravity = 17;
        frameLayout.addView(imageView, layoutParams4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        LottieAnimationView lottieAnimationView = this.mAnimationView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.pauseAnimation();
        this.mAnimationView.clearAnimation();
    }

    private void addTitle(TaopaiLoadConfig taopaiLoadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a94e11", new Object[]{this, taopaiLoadConfig});
        } else if (taopaiLoadConfig != null && !taopaiLoadConfig.isTitleEnable()) {
        } else {
            TextView textView = new TextView(getContext());
            textView.setTextColor(Color.parseColor("#111111"));
            textView.setTextSize(21.0f);
            textView.setText((taopaiLoadConfig == null || StringUtils.isEmpty(taopaiLoadConfig.getTitle())) ? getContext().getString(R.string.pissarro_taopai) : taopaiLoadConfig.getTitle());
            textView.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            layoutParams.bottomMargin = icg.a(getContext(), 12.0f);
            this.mContentLayout.addView(textView, layoutParams);
        }
    }

    private void addProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6734b75", new Object[]{this});
            return;
        }
        this.mProgressTv = new TextView(getContext());
        this.mProgressTv.setTextColor(Color.parseColor("#999999"));
        this.mProgressTv.setTextSize(16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = icg.a(getContext(), 12.0f);
        this.mContentLayout.addView(this.mProgressTv, layoutParams);
        TextView textView = this.mProgressTv;
        textView.setText(getContext().getString(R.string.pissarro_try_loading) + " 0%");
    }

    private void addLoadingAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d34e893", new Object[]{this});
            return;
        }
        CirclePointLoadingView circlePointLoadingView = new CirclePointLoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.mContentLayout.addView(circlePointLoadingView, layoutParams);
        circlePointLoadingView.startAnim();
    }

    public void updateProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mProgressTv;
        textView.setText(getContext().getString(R.string.pissarro_try_loading) + i + riy.MOD);
    }
}
