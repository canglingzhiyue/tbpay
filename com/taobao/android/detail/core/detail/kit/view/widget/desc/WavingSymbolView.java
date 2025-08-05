package com.taobao.android.detail.core.detail.kit.view.widget.desc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class WavingSymbolView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AnimationSet mAnimationSet;
    private View point;
    private View shadow;

    static {
        kge.a(-2143648834);
    }

    public static /* synthetic */ Object ipc$super(WavingSymbolView wavingSymbolView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public WavingSymbolView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public WavingSymbolView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public WavingSymbolView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.x_detail_view_wavingsymbol, (ViewGroup) this, true);
        this.shadow = findViewById(R.id.v_symbol_shadow);
        this.point = findViewById(R.id.v_symbol_point);
        this.mAnimationSet = new AnimationSet(true);
        float f = epo.f27511a * 15.0f;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.3f, 1.0f, 0.3f, 1.0f, f, f);
        scaleAnimation.setRepeatCount(Integer.MAX_VALUE);
        this.mAnimationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setRepeatCount(Integer.MAX_VALUE);
        this.mAnimationSet.addAnimation(alphaAnimation);
        this.mAnimationSet.setInterpolator(new DecelerateInterpolator());
        this.mAnimationSet.setDuration(1000L);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.desc.WavingSymbolView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.shadow.clearAnimation();
        this.mAnimationSet.reset();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.shadow.clearAnimation();
        this.shadow.startAnimation(this.mAnimationSet);
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.shadow.clearAnimation();
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.shadow.clearAnimation();
        this.shadow.startAnimation(this.mAnimationSet);
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mAnimationSet.reset();
        this.shadow.clearAnimation();
        this.shadow = null;
        this.point = null;
        removeAllViews();
    }
}
