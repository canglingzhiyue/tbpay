package com.alipay.zoloz.toyger.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GarfieldPhoneUpDown extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long circleFinishTime;
    public float circleStrokeWidth;
    public final long circleTime;
    public Camera mCamera;
    public Matrix mMatrix;
    public final float maxAngle;
    public final float mobileHeight;
    public final float mobileWidth;
    public Paint paintCircle;
    public Paint paintFill;
    public Paint paintMobile;
    public Path pathFill;
    public Path pathMobile;
    public final long phoneDownTime;
    public final long phoneStillTime;
    public final long phoneUpTime;
    public long startTime;

    public static /* synthetic */ Object ipc$super(GarfieldPhoneUpDown garfieldPhoneUpDown, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public GarfieldPhoneUpDown(Context context) {
        this(context, null);
    }

    public GarfieldPhoneUpDown(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GarfieldPhoneUpDown(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paintMobile = new Paint();
        this.paintFill = new Paint();
        this.paintCircle = new Paint();
        this.mCamera = new Camera();
        this.mMatrix = new Matrix();
        this.maxAngle = 50.0f;
        this.startTime = 0L;
        this.circleFinishTime = 0L;
        this.phoneUpTime = 800L;
        this.phoneDownTime = 300L;
        this.phoneStillTime = 200L;
        this.circleTime = 300L;
        this.mobileWidth = 66.39f;
        this.mobileHeight = 90.38f;
        this.pathMobile = new Path();
        this.pathFill = new Path();
        this.circleStrokeWidth = 10.0f;
        float[] fArr = {209.15999f, 0.862f, 0.965f};
        this.paintMobile.setColor(Color.HSVToColor(fArr));
        this.paintMobile.setStyle(Paint.Style.FILL);
        this.paintMobile.setStrokeWidth(2.0f);
        this.paintMobile.setAntiAlias(true);
        this.paintFill.setColor(Color.rgb(222, 238, 252));
        this.paintFill.setAntiAlias(true);
        this.paintFill.setStyle(Paint.Style.FILL);
        this.paintCircle.setColor(Color.HSVToColor(fArr));
        this.paintCircle.setStyle(Paint.Style.STROKE);
        this.paintCircle.setStrokeWidth(this.circleStrokeWidth);
        this.paintCircle.setAntiAlias(true);
        this.paintCircle.setStrokeCap(Paint.Cap.ROUND);
        constructPath();
    }

    private void constructPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949e4f23", new Object[]{this});
            return;
        }
        this.pathMobile.moveTo(41.27f, 8.3f);
        this.pathMobile.lineTo(25.13f, 8.3f);
        this.pathMobile.cubicTo(24.37f, 8.3f, 23.75f, 7.68f, 23.75f, 6.92f);
        this.pathMobile.cubicTo(23.75f, 6.15f, 24.37f, 5.53f, 25.13f, 5.53f);
        this.pathMobile.lineTo(41.27f, 5.53f);
        this.pathMobile.cubicTo(42.03f, 5.53f, 42.65f, 6.15f, 42.65f, 6.92f);
        this.pathMobile.cubicTo(42.65f, 7.68f, 42.03f, 8.3f, 41.27f, 8.3f);
        this.pathMobile.moveTo(54.97f, 0.0f);
        this.pathMobile.lineTo(11.42f, 0.0f);
        this.pathMobile.cubicTo(5.11f, 0.0f, 0.0f, 5.11f, 0.0f, 11.42f);
        this.pathMobile.lineTo(0.0f, 88.62f);
        this.pathMobile.cubicTo(0.94f, 89.24f, 1.9f, 89.82f, 2.88f, 90.38f);
        this.pathMobile.lineTo(2.88f, 15.8f);
        this.pathMobile.cubicTo(2.88f, 14.18f, 4.2f, 12.87f, 5.82f, 12.87f);
        this.pathMobile.lineTo(60.58f, 12.87f);
        this.pathMobile.cubicTo(62.2f, 12.87f, 63.51f, 14.18f, 63.51f, 15.8f);
        this.pathMobile.lineTo(63.51f, 90.38f);
        this.pathMobile.cubicTo(64.49f, 89.82f, 65.45f, 89.24f, 66.39f, 88.62f);
        this.pathMobile.lineTo(66.39f, 11.42f);
        this.pathMobile.cubicTo(66.39f, 5.11f, 61.28f, 0.0f, 54.97f, 0.0f);
    }

    private void constructFillpath(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab16e5a", new Object[]{this, new Float(f)});
            return;
        }
        this.pathFill.rewind();
        this.pathFill.moveTo(2.88f, 90.38f);
        float f2 = 1.0f - f;
        this.pathFill.lineTo(2.88f, (36.119656f * f2) + 12.87f);
        this.pathFill.lineTo(63.51f, (72.161804f * f2) + 12.87f);
        this.pathFill.lineTo(63.51f, 90.38f);
        this.pathFill.quadTo(33.195f, 110.0f, 2.88f, 90.38f);
        this.pathFill.close();
    }

    public void customSetVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897d5019", new Object[]{this, new Integer(i)});
            return;
        }
        setVisibility(i);
        getVisibility();
    }

    public void resetAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86839887", new Object[]{this});
        } else {
            this.startTime = 0L;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (this.startTime == 0) {
            this.startTime = System.currentTimeMillis();
        }
        float width = canvas.getWidth() / 2;
        float height = canvas.getHeight() / 2;
        float f = width - (this.circleStrokeWidth / 2.0f);
        long currentTimeMillis = System.currentTimeMillis() - this.startTime;
        if (currentTimeMillis < 300) {
            RectF rectF = new RectF(width - f, height - f, width + f, height + f);
            float f2 = ((float) (currentTimeMillis * 180)) / 300.0f;
            canvas.drawArc(rectF, 0.0f, f2, false, this.paintCircle);
            canvas.drawArc(rectF, 180.0f, f2, false, this.paintCircle);
        } else {
            long j = (currentTimeMillis - 300) % 1300;
            int i = (j > 200L ? 1 : (j == 200L ? 0 : -1));
            float f3 = i < 0 ? 0.0f : (i < 0 || j >= 500) ? ((float) (800 - ((j - 200) - 300))) / 800.0f : ((float) (j - 200)) / 300.0f;
            constructFillpath(1.0f - f3);
            this.mCamera.save();
            this.mCamera.rotateX(f3 * 50.0f);
            this.mCamera.getMatrix(this.mMatrix);
            this.mCamera.restore();
            float f4 = (2.0f * f) / 117.493996f;
            this.mMatrix.preTranslate(-33.195f, -99.418f);
            this.mMatrix.postScale(f4, f4);
            this.mMatrix.postTranslate(width, height + f);
            canvas.save();
            canvas.concat(this.mMatrix);
            canvas.drawPath(this.pathMobile, this.paintMobile);
            canvas.drawPath(this.pathFill, this.paintFill);
            canvas.restore();
            canvas.drawCircle(width, height, f, this.paintCircle);
        }
        invalidate();
    }
}
