package com.taobao.android.detail2.core.framework.base.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class RoundRectCardRoot extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private float[] radii;

    static {
        kge.a(-1088629001);
    }

    public static /* synthetic */ Object ipc$super(RoundRectCardRoot roundRectCardRoot, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RoundRectCardRoot(Context context) {
        super(context);
        this.radii = new float[]{45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f};
        init(context);
    }

    public RoundRectCardRoot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.radii = new float[]{45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f};
        init(context);
    }

    public RoundRectCardRoot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.radii = new float[]{45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f, 45.0f};
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public void setCornerRadius(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7330c9b", new Object[]{this, fArr});
        } else {
            this.radii = fArr;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), this.radii, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }
}
