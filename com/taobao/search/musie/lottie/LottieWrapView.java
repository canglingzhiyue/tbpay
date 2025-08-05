package com.taobao.search.musie.lottie;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class LottieWrapView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LottieAnimationView lottieView;
    private a onDrawErrorListener;

    /* loaded from: classes7.dex */
    public interface a {
        void a(Throwable th);
    }

    static {
        kge.a(-1570005246);
    }

    public static /* synthetic */ Object ipc$super(LottieWrapView lottieWrapView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public LottieWrapView(Context context) {
        super(context);
        this.lottieView = new LottieAnimationView(context);
        addView(this.lottieView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setOnDrawErrorListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af9e8c4", new Object[]{this, aVar});
        } else {
            this.onDrawErrorListener = aVar;
        }
    }

    public LottieAnimationView getLottieView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LottieAnimationView) ipChange.ipc$dispatch("6b68ec03", new Object[]{this}) : this.lottieView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            a aVar = this.onDrawErrorListener;
            if (aVar == null) {
                return;
            }
            aVar.a(th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.lottieView.isAnimating()) {
            return;
        }
        this.lottieView.resumeAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.lottieView.pauseAnimation();
    }
}
