package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class PopComponentCornerClipLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mCornerRadius;
    private final RectF mRectF;

    static {
        kge.a(1233865554);
    }

    public static /* synthetic */ Object ipc$super(PopComponentCornerClipLayout popComponentCornerClipLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PopComponentCornerClipLayout(Context context) {
        super(context);
        this.mCornerRadius = 0;
        this.mRectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public PopComponentCornerClipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCornerRadius = 0;
        this.mRectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public PopComponentCornerClipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCornerRadius = 0;
        this.mRectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void init(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcec44c", new Object[]{this, new Integer(i)});
        } else {
            this.mCornerRadius = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 18 && this.mCornerRadius > 0) {
                float[] fArr = {this.mCornerRadius, this.mCornerRadius, this.mCornerRadius, this.mCornerRadius, this.mCornerRadius, this.mCornerRadius, this.mCornerRadius, this.mCornerRadius};
                Path path = new Path();
                this.mRectF.right = getWidth();
                this.mRectF.bottom = getHeight();
                path.addRoundRect(this.mRectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopComponentCornerClipLayoutNew.dispatchDraw.error", th);
        }
        super.dispatchDraw(canvas);
    }
}
