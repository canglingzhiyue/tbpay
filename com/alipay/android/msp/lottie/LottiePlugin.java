package com.alipay.android.msp.lottie;

import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.alipay.android.msp.plugin.ILottiePLugin;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LottiePlugin implements ILottiePLugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LottieAnimationView maLottieView;

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public View CreateLottieView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("26495e03", new Object[]{this, context});
        }
        if (this.maLottieView == null) {
            this.maLottieView = new LottieAnimationView(context);
            this.maLottieView.setIgnoreDisabledSystemAnimations(true);
        }
        return this.maLottieView;
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setAnimation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d772b5a", new Object[]{this, new Integer(i)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.setAnimation(i);
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8294a53", new Object[]{this, str});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.setAnimation(str);
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.playAnimation();
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void stopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e230f929", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.cancelAnimation();
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setAutoplay(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c74e68", new Object[]{this, new Boolean(z)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView == null) {
            return;
        }
        lottieAnimationView.addLottieOnCompositionLoadedListener(new l() { // from class: com.alipay.android.msp.lottie.-$$Lambda$LottiePlugin$fQ9rrvI4qdmeA7QMmtTNctcMRXU
            @Override // com.airbnb.lottie.l
            public final void onCompositionLoaded(g gVar) {
                LottiePlugin.this.lambda$setAutoplay$0$LottiePlugin(z, gVar);
            }
        });
    }

    public /* synthetic */ void lambda$setAutoplay$0$LottiePlugin(boolean z, g gVar) {
        LottieAnimationView lottieAnimationView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b268bc", new Object[]{this, new Boolean(z), gVar});
        } else if (!z || (lottieAnimationView = this.maLottieView) == null) {
        } else {
            lottieAnimationView.playAnimation();
        }
    }

    @Override // com.alipay.android.msp.plugin.ILottiePLugin
    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        LottieAnimationView lottieAnimationView = this.maLottieView;
        if (lottieAnimationView == null) {
            return;
        }
        if (z) {
            i = -1;
        }
        lottieAnimationView.setRepeatCount(i);
    }
}
