package com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.fpr;
import tb.kge;

/* loaded from: classes5.dex */
public class PopupLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BG_COLOR = -84083460;
    private static final int BORDER_COLOR = -2236963;
    private static final String TAG = "PopupLayout";
    private boolean isUpDirection;
    private final Paint paint;
    private int radius;
    private Path tmpPath;
    private RectF tmpRect;
    private int triangleHeight;
    private int triangleStartX;

    static {
        kge.a(1102313792);
    }

    public static /* synthetic */ Object ipc$super(PopupLayout popupLayout, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PopupLayout(Context context) {
        this(context, null);
    }

    public PopupLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PopupLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint();
        this.isUpDirection = true;
        this.tmpRect = new RectF();
        this.tmpPath = new Path();
        init();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.PopupLayout");
    }

    public PopupLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.paint = new Paint();
        this.isUpDirection = true;
        this.tmpRect = new RectF();
        this.tmpPath = new Path();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setWillNotDraw(false);
        this.paint.setAntiAlias(true);
        this.radius = fpr.a(getContext(), 12.0f);
        this.triangleHeight = fpr.a(getContext(), 6.5f);
        this.triangleStartX = fpr.a(getContext(), 59.0f);
        setIsUpDirection(true);
    }

    public void setIsUpDirection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaffdfd5", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isUpDirection = z;
        if (z) {
            setPadding(0, this.triangleHeight, 0, 0);
        } else {
            setPadding(0, 0, 0, this.triangleHeight);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.isUpDirection) {
            onDrawTriangleUp(canvas);
        } else {
            onDrawTriangleBottom(canvas);
        }
    }

    private void onDrawTriangleUp(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968fdd98", new Object[]{this, canvas});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = this.tmpRect;
        rectF.left = 1.0f;
        rectF.right = measuredWidth - 1;
        rectF.top = this.triangleHeight;
        rectF.bottom = measuredHeight - 1;
        this.paint.setColor(BG_COLOR);
        this.paint.setStyle(Paint.Style.FILL);
        RectF rectF2 = this.tmpRect;
        int i = this.radius;
        canvas.drawRoundRect(rectF2, i, i, this.paint);
        this.paint.setColor(BORDER_COLOR);
        this.paint.setStrokeWidth(1.0f);
        this.paint.setStyle(Paint.Style.STROKE);
        RectF rectF3 = this.tmpRect;
        int i2 = this.radius;
        canvas.drawRoundRect(rectF3, i2, i2, this.paint);
        this.tmpPath.reset();
        this.tmpPath.moveTo(this.triangleStartX + 2, this.tmpRect.top);
        this.tmpPath.lineTo(this.triangleStartX + this.triangleHeight, 2.0f);
        this.tmpPath.lineTo((this.triangleStartX + (this.triangleHeight << 1)) - 1, this.tmpRect.top + 1.0f);
        Path path = this.tmpPath;
        int i3 = this.triangleStartX;
        int i4 = this.triangleHeight;
        path.lineTo(i3 + i4, i4 << 1);
        this.tmpPath.close();
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(BG_COLOR);
        canvas.drawPath(this.tmpPath, this.paint);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(BORDER_COLOR);
        int i5 = this.triangleStartX;
        int i6 = this.triangleHeight;
        canvas.drawLine(i5, i6, i5 + i6, 0.0f, this.paint);
        int i7 = this.triangleStartX;
        int i8 = this.triangleHeight;
        canvas.drawLine(i7 + i8, 0.0f, i7 + (i8 << 1), i8, this.paint);
    }

    private void onDrawTriangleBottom(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3072e988", new Object[]{this, canvas});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = this.tmpRect;
        rectF.left = 1.0f;
        rectF.right = measuredWidth - 1;
        rectF.top = 1.0f;
        rectF.bottom = (measuredHeight - this.triangleHeight) - 1;
        this.paint.setColor(BG_COLOR);
        this.paint.setStyle(Paint.Style.FILL);
        RectF rectF2 = this.tmpRect;
        int i = this.radius;
        canvas.drawRoundRect(rectF2, i, i, this.paint);
        this.paint.setColor(BORDER_COLOR);
        this.paint.setStrokeWidth(1.0f);
        this.paint.setStyle(Paint.Style.STROKE);
        RectF rectF3 = this.tmpRect;
        int i2 = this.radius;
        canvas.drawRoundRect(rectF3, i2, i2, this.paint);
        this.tmpPath.reset();
        this.tmpPath.moveTo(this.triangleStartX, this.tmpRect.bottom);
        this.tmpPath.lineTo(this.triangleStartX + this.triangleHeight, measuredHeight - 1);
        this.tmpPath.lineTo((this.triangleStartX + (this.triangleHeight << 1)) - 1, this.tmpRect.bottom);
        this.tmpPath.lineTo(this.triangleStartX + this.triangleHeight, this.tmpRect.bottom - (this.triangleHeight << 1));
        this.tmpPath.close();
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(BG_COLOR);
        canvas.drawPath(this.tmpPath, this.paint);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(BORDER_COLOR);
        int i3 = this.triangleStartX;
        int i4 = this.triangleHeight;
        float f = measuredHeight;
        canvas.drawLine(i3, measuredHeight - i4, i3 + i4, f, this.paint);
        int i5 = this.triangleStartX;
        int i6 = this.triangleHeight;
        canvas.drawLine(i5 + i6, f, i5 + (i6 << 1), measuredHeight - i6, this.paint);
    }
}
