package com.taobao.bootimage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kej;
import tb.kge;

/* loaded from: classes6.dex */
public class FilletLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FilletLinearLayout";
    private float cornerSize;

    static {
        kge.a(256807634);
    }

    public static /* synthetic */ Object ipc$super(FilletLinearLayout filletLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FilletLinearLayout(Context context) {
        super(context);
    }

    public FilletLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilletLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setCornerSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68125521", new Object[]{this, new Float(f)});
        } else if (Math.abs(this.cornerSize - f) < 1.0f) {
        } else {
            this.cornerSize = f;
            invalidate();
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
            if (this.cornerSize > 0.0f) {
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), this.cornerSize, this.cornerSize, Path.Direction.CW);
                canvas.clipPath(path);
            }
        } catch (Exception e) {
            kej.a(TAG, "dispatchDraw error", e);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue() : getVisibility() == 0;
    }
}
