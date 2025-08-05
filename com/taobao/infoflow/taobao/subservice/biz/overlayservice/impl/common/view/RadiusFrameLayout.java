package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class RadiusFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.android.dinamicx.view.a cLipRadiusHandler;

    static {
        kge.a(372292997);
    }

    public static /* synthetic */ Object ipc$super(RadiusFrameLayout radiusFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RadiusFrameLayout(Context context) {
        this(context, null);
    }

    public RadiusFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadiusFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cLipRadiusHandler = new com.taobao.android.dinamicx.view.a();
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            this.cLipRadiusHandler.a(this, f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.cLipRadiusHandler.a()) {
            super.dispatchDraw(canvas);
        } else {
            this.cLipRadiusHandler.a(this, canvas);
            super.dispatchDraw(canvas);
            this.cLipRadiusHandler.b(this, canvas);
        }
    }
}
