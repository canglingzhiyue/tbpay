package com.taobao.infoflow.ad.impl.dx.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.j;
import com.airbnb.lottie.l;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;

/* loaded from: classes7.dex */
public class MMAdLottieView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HImageView bottomImageView;
    private LottieAnimationView lottieAnimationView;

    public MMAdLottieView(Context context) {
        this(context, null);
    }

    public MMAdLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            this.lottieAnimationView = new LottieAnimationView(getContext());
            this.bottomImageView = new HImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            addView(this.bottomImageView, layoutParams);
            addView(this.lottieAnimationView, layoutParams);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public LottieAnimationView getLottieAnimationView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LottieAnimationView) ipChange.ipc$dispatch("4040ac5d", new Object[]{this}) : this.lottieAnimationView;
    }

    public HImageView getBottomImageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HImageView) ipChange.ipc$dispatch("a39c9427", new Object[]{this}) : this.bottomImageView;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        HImageView hImageView = this.bottomImageView;
        if (hImageView != null) {
            hImageView.setScaleType(scaleType);
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.setScaleType(scaleType);
    }

    public void setLottieProcess(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaed44b", new Object[]{this, new Float(f)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.setProgress(f);
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else if (this.bottomImageView == null || TextUtils.isEmpty(str)) {
        } else {
            this.bottomImageView.setImageUrl(str);
        }
    }

    public void setLottieUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a4b31f", new Object[]{this, str});
        } else if (this.lottieAnimationView == null || TextUtils.isEmpty(str)) {
        } else {
            this.lottieAnimationView.setAnimationFromUrl(str);
        }
    }

    public void setRepeatCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54e802a", new Object[]{this, new Integer(i)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.setRepeatCount(i);
    }

    public void hideBottomImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d053cd5", new Object[]{this});
            return;
        }
        HImageView hImageView = this.bottomImageView;
        if (hImageView == null) {
            return;
        }
        hImageView.setVisibility(8);
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.playAnimation();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.pauseAnimation();
    }

    public void setProcess(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36908c", new Object[]{this, new Float(f)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.setProgress(f);
    }

    public float getProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5d61a30", new Object[]{this})).floatValue();
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null) {
            return lottieAnimationView.getProgress();
        }
        return 0.0f;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        return lottieAnimationView != null && lottieAnimationView.isAnimating();
    }

    public void addLottieOnCompositionLoadedListener(l lVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea15ea5", new Object[]{this, lVar});
        } else if (lVar == null || (lottieAnimationView = this.lottieAnimationView) == null) {
        } else {
            lottieAnimationView.addLottieOnCompositionLoadedListener(lVar);
        }
    }

    public void setFailureListener(j<Throwable> jVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9099dc8f", new Object[]{this, jVar});
        } else if (jVar == null || (lottieAnimationView = this.lottieAnimationView) == null) {
        } else {
            lottieAnimationView.setFailureListener(jVar);
        }
    }

    public void removeLottieOnCompositionLoadedListener(l lVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb72acc8", new Object[]{this, lVar});
        } else if (lVar == null || (lottieAnimationView = this.lottieAnimationView) == null) {
        } else {
            lottieAnimationView.removeLottieOnCompositionLoadedListener(lVar);
        }
    }
}
