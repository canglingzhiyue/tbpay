package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class AnimatorDisplayLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float displayRate;

    static {
        kge.a(17803313);
    }

    public static /* synthetic */ Object ipc$super(AnimatorDisplayLinearLayout animatorDisplayLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void setDisplayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b597f119", new Object[]{this, new Float(f)});
            return;
        }
        this.displayRate = f;
        invalidate();
    }

    public AnimatorDisplayLinearLayout(Context context) {
        super(context);
        this.displayRate = 1.0f;
    }

    public AnimatorDisplayLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.displayRate = 1.0f;
    }

    public AnimatorDisplayLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.displayRate = 1.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        float height = getHeight();
        canvas.clipRect(0.0f, height - (this.displayRate * height), getWidth(), height);
        super.dispatchDraw(canvas);
    }
}
