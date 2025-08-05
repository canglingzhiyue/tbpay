package com.etao.feimagesearch.ui;

import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes3.dex */
public final class RippleCircleView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RippleLayout rippleContainer;

    static {
        kge.a(-168777199);
    }

    public static /* synthetic */ Object ipc$super(RippleCircleView rippleCircleView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleCircleView(RippleLayout rippleContainer) {
        super(rippleContainer.getContext(), null);
        q.c(rippleContainer, "rippleContainer");
        this.rippleContainer = rippleContainer;
        setVisibility(4);
    }

    public final RippleLayout getRippleContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RippleLayout) ipChange.ipc$dispatch("f61815d", new Object[]{this}) : this.rippleContainer;
    }

    public final void setRippleContainer(RippleLayout rippleLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965728bf", new Object[]{this, rippleLayout});
            return;
        }
        q.c(rippleLayout, "<set-?>");
        this.rippleContainer = rippleLayout;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        float d = rwf.d(getWidth(), getHeight()) / 2.0f;
        canvas.drawCircle(d, d, d, this.rippleContainer.getPaint());
    }
}
