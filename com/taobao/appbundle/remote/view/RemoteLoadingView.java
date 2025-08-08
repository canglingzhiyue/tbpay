package com.taobao.appbundle.remote.view;

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
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class RemoteLoadingView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LottieAnimationView mAnimationView;
    private LinearLayout mContentLayout;
    private TextView mProgressTv;

    static {
        kge.a(2065776635);
    }

    public static /* synthetic */ Object ipc$super(RemoteLoadingView remoteLoadingView, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RemoteLoadingView(Context context, LoadConfig loadConfig) {
        super(context);
        initView(loadConfig);
    }

    private void initView(LoadConfig loadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eedb239", new Object[]{this, loadConfig});
            return;
        }
        setBackgroundColor(-1);
        addContentParent();
        addLogo(loadConfig);
        addTitle(loadConfig);
        addProgress();
        addLoadingAnim();
    }

    private void addBackView(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486881c5", new Object[]{this, onClickListener});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, DensityUtil.dip2px(getContext(), 48.0f));
        layoutParams.leftMargin = DensityUtil.dip2px(getContext(), 12.0f);
        layoutParams.gravity = 51;
        addView(linearLayout, layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.feature_load_back);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(DensityUtil.dip2px(getContext(), 16.0f), DensityUtil.dip2px(getContext(), 16.0f));
        layoutParams2.gravity = 16;
        linearLayout.addView(imageView, layoutParams2);
        TextView textView = new TextView(getContext());
        textView.setText("返回");
        textView.setTextSize(18.0f);
        textView.setGravity(16);
        textView.setTextColor(Color.parseColor("#111110"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.leftMargin = DensityUtil.dip2px(getContext(), 10.0f);
        linearLayout.addView(textView, layoutParams3);
        linearLayout.setOnClickListener(onClickListener);
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

    private void addLogo(LoadConfig loadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef799d0", new Object[]{this, loadConfig});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DensityUtil.dip2px(getContext(), 114.0f), DensityUtil.dip2px(getContext(), 114.0f));
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = DensityUtil.dip2px(getContext(), 24.0f);
        this.mContentLayout.addView(frameLayout, layoutParams);
        View view = new View(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(0);
        if (Build.VERSION.SDK_INT >= 16) {
            gradientDrawable.setColors(new int[]{Color.parseColor("#FF5900"), Color.parseColor("#FF8002")});
        }
        view.setBackgroundDrawable(gradientDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DensityUtil.dip2px(getContext(), 62.0f), DensityUtil.dip2px(getContext(), 62.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(view, layoutParams2);
        this.mAnimationView = new LottieAnimationView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        frameLayout.addView(this.mAnimationView, layoutParams3);
        this.mAnimationView.setAnimation(R.raw.feature_loading_logo_anim);
        this.mAnimationView.loop(true);
        this.mAnimationView.playAnimation();
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource((loadConfig == null || loadConfig.getLogoResId() == 0) ? R.drawable.icon : loadConfig.getLogoResId());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(DensityUtil.dip2px(getContext(), 30.0f), DensityUtil.dip2px(getContext(), 27.0f));
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

    private void addTitle(LoadConfig loadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c77119b", new Object[]{this, loadConfig});
        } else if (loadConfig != null && !loadConfig.isTitleEnable()) {
        } else {
            TextView textView = new TextView(getContext());
            textView.setTextColor(Color.parseColor("#111111"));
            textView.setTextSize(21.0f);
            textView.setText((loadConfig == null || StringUtils.isEmpty(loadConfig.getTitle())) ? "淘宝" : loadConfig.getTitle());
            textView.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            layoutParams.bottomMargin = DensityUtil.dip2px(getContext(), 12.0f);
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
        layoutParams.bottomMargin = DensityUtil.dip2px(getContext(), 12.0f);
        this.mContentLayout.addView(this.mProgressTv, layoutParams);
        this.mProgressTv.setText("正在努力加载 0%");
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
        textView.setText("正在努力加载 " + i + riy.MOD);
    }
}
