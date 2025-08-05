package com.alipay.android.msp.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CustomProgressWheel extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object INIT_LOCK = new Object();
    private int barColor;
    private final int barLength;
    private int barWidth;
    private int circleRadius;
    private boolean fillRadius;
    private boolean isRunning;
    private boolean isSpinning;
    private boolean linearProgress;
    private float mProgress;
    private float mTargetProgress;
    private final int oF;
    private double oG;
    private double oH;
    private float oI;
    private boolean oJ;
    private long oK;
    private final long oL;
    private Paint oM;
    private Paint oN;
    private RectF oO;
    private long oP;
    private int oQ;
    private float oR;
    private float oS;
    private boolean oT;
    private boolean oU;
    private ProgressCallback oV;
    private int rimColor;
    private int rimWidth;
    private float spinSpeed;

    /* loaded from: classes3.dex */
    public interface ProgressCallback {
        void onProgressUpdate(float f);
    }

    public static /* synthetic */ Object ipc$super(CustomProgressWheel customProgressWheel, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public CustomProgressWheel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.circleRadius = 105;
        this.barWidth = 10;
        this.rimWidth = 10;
        this.barLength = 16;
        this.oF = 270;
        this.fillRadius = false;
        this.oG = 500.0d;
        this.oH = 460.0d;
        this.oI = 0.0f;
        this.oJ = true;
        this.oK = 210L;
        this.oL = 200L;
        this.barColor = Color.parseColor("#108ee9");
        this.rimColor = 16777215;
        this.oM = new Paint();
        this.oN = new Paint();
        this.oO = new RectF();
        this.spinSpeed = 230.0f;
        this.oP = 0L;
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        this.isSpinning = false;
        this.oQ = 64;
        this.oR = 0.0f;
        this.oS = 0.1f;
        this.oT = false;
        this.oU = false;
        this.isRunning = false;
    }

    public CustomProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.circleRadius = 105;
        this.barWidth = 10;
        this.rimWidth = 10;
        this.barLength = 16;
        this.oF = 270;
        this.fillRadius = false;
        this.oG = 500.0d;
        this.oH = 460.0d;
        this.oI = 0.0f;
        this.oJ = true;
        this.oK = 210L;
        this.oL = 200L;
        this.barColor = Color.parseColor("#108ee9");
        this.rimColor = 16777215;
        this.oM = new Paint();
        this.oN = new Paint();
        this.oO = new RectF();
        this.spinSpeed = 230.0f;
        this.oP = 0L;
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        this.isSpinning = false;
        this.oQ = 64;
        this.oR = 0.0f;
        this.oS = 0.1f;
        this.oT = false;
        this.oU = false;
        this.isRunning = false;
    }

    public CustomProgressWheel(Context context) {
        super(context);
        this.circleRadius = 105;
        this.barWidth = 10;
        this.rimWidth = 10;
        this.barLength = 16;
        this.oF = 270;
        this.fillRadius = false;
        this.oG = 500.0d;
        this.oH = 460.0d;
        this.oI = 0.0f;
        this.oJ = true;
        this.oK = 210L;
        this.oL = 200L;
        this.barColor = Color.parseColor("#108ee9");
        this.rimColor = 16777215;
        this.oM = new Paint();
        this.oN = new Paint();
        this.oO = new RectF();
        this.spinSpeed = 230.0f;
        this.oP = 0L;
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        this.isSpinning = false;
        this.oQ = 64;
        this.oR = 0.0f;
        this.oS = 0.1f;
        this.oT = false;
        this.oU = false;
        this.isRunning = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int paddingLeft = (this.circleRadius << 1) + getPaddingLeft() + getPaddingRight();
        int paddingTop = (this.circleRadius << 1) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (!this.fillRadius) {
            int i5 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i5, (i2 - paddingBottom) - paddingTop), (this.circleRadius << 1) - (this.barWidth << 1));
            int i6 = ((i5 - min) / 2) + paddingLeft;
            int i7 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i8 = this.barWidth;
            this.oO = new RectF(i6 + i8, i7 + i8, (i6 + min) - i8, (i7 + min) - i8);
        } else {
            int i9 = this.barWidth;
            this.oO = new RectF(paddingLeft + i9, paddingTop + i9, (i - paddingRight) - i9, (i2 - paddingBottom) - i9);
        }
        setupPaints();
        invalidate();
    }

    private void setupPaints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd358439", new Object[]{this});
            return;
        }
        this.oM.setColor(this.barColor);
        this.oM.setAntiAlias(true);
        this.oM.setStyle(Paint.Style.STROKE);
        this.oM.setStrokeWidth(this.barWidth);
        this.oM.setStrokeCap(Paint.Cap.ROUND);
        this.oN.setColor(this.rimColor);
        this.oN.setAntiAlias(true);
        this.oN.setStyle(Paint.Style.STROKE);
        this.oN.setStrokeWidth(this.rimWidth);
    }

    public void setCallback(ProgressCallback progressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e523a86e", new Object[]{this, progressCallback});
            return;
        }
        this.oV = progressCallback;
        if (this.isSpinning) {
            return;
        }
        an();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        synchronized (INIT_LOCK) {
            if (!this.isRunning) {
                return;
            }
            this.oQ = (int) (this.oO.width() / 1.6d);
            float f3 = 0.0f;
            if (this.oT && !this.oU) {
                float centerX = this.oO.centerX();
                float centerY = this.oO.centerY();
                canvas.drawArc(this.oO, 360.0f, 360.0f, false, this.oM);
                int i = this.oQ;
                float f4 = this.oR;
                canvas.drawLine(centerX - (i / 2), (i / 6) + centerY, ((i / 3) * f4) + (centerX - (i / 2)), centerY + (i / 6) + ((i / 3) * f4), this.oM);
                this.oR += this.oS;
                if (this.oR >= 1.0f) {
                    this.oR = 0.0f;
                    this.oU = true;
                }
            } else if (this.oT) {
                float centerX2 = this.oO.centerX();
                float centerY2 = this.oO.centerY();
                canvas.drawArc(this.oO, 360.0f, 360.0f, false, this.oM);
                int i2 = this.oQ;
                canvas.drawLine(centerX2 - (i2 / 2), (i2 / 6) + centerY2, centerX2 - (i2 / 6), centerY2 + (i2 / 2), this.oM);
                int i3 = this.oQ;
                float f5 = this.oR;
                canvas.drawLine(centerX2 - (i3 / 6), centerY2 + (i3 / 2), (centerX2 - (i3 / 6)) + (((i3 * 7) / 12) * f5), (centerY2 + (i3 / 2)) - (((i3 * 3) / 4) * f5), this.oM);
                this.oR += this.oS;
                if (this.oR >= 1.0f) {
                    this.oR = 1.0f;
                }
            } else {
                canvas.drawArc(this.oO, 360.0f, 360.0f, false, this.oN);
                if (this.isSpinning) {
                    long uptimeMillis = SystemClock.uptimeMillis() - this.oP;
                    float f6 = (((float) uptimeMillis) * this.spinSpeed) / 1000.0f;
                    long j = this.oK;
                    if (j >= 200) {
                        this.oG += uptimeMillis;
                        double d = this.oG;
                        double d2 = this.oH;
                        if (d > d2) {
                            this.oG = d - d2;
                            this.oK = 0L;
                            this.oJ = !this.oJ;
                        }
                        float cos = (((float) Math.cos(((this.oG / this.oH) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                        if (this.oJ) {
                            this.oI = cos * 254.0f;
                        } else {
                            float f7 = (1.0f - cos) * 254.0f;
                            this.mProgress += this.oI - f7;
                            this.oI = f7;
                        }
                    } else {
                        this.oK = j + uptimeMillis;
                    }
                    this.mProgress += f6;
                    float f8 = this.mProgress;
                    if (f8 > 360.0f) {
                        this.mProgress = f8 - 360.0f;
                        ProgressCallback progressCallback = this.oV;
                        if (progressCallback != null) {
                            progressCallback.onProgressUpdate(-1.0f);
                        }
                    }
                    this.oP = SystemClock.uptimeMillis();
                    float f9 = this.mProgress - 90.0f;
                    float f10 = this.oI + 16.0f;
                    if (isInEditMode()) {
                        f = 0.0f;
                        f2 = 135.0f;
                    } else {
                        f = f9;
                        f2 = f10;
                    }
                    canvas.drawArc(this.oO, f, f2, false, this.oM);
                } else {
                    float f11 = this.mProgress;
                    if (f11 != this.mTargetProgress) {
                        this.mProgress = Math.min(this.mProgress + ((((float) (SystemClock.uptimeMillis() - this.oP)) / 1000.0f) * this.spinSpeed), this.mTargetProgress);
                        this.oP = SystemClock.uptimeMillis();
                    } else {
                        z = false;
                    }
                    if (f11 != this.mProgress) {
                        an();
                    }
                    float f12 = this.mProgress;
                    if (!this.linearProgress) {
                        f3 = ((float) (1.0d - Math.pow(1.0f - (f12 / 360.0f), 4.0d))) * 360.0f;
                        f12 = ((float) (1.0d - Math.pow(1.0f - (this.mProgress / 360.0f), 2.0d))) * 360.0f;
                    }
                    canvas.drawArc(this.oO, f3 - 90.0f, isInEditMode() ? 360.0f : f12, false, this.oM);
                }
            }
            if (!z) {
                return;
            }
            invalidate();
        }
    }

    public void beginDrawTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304e451", new Object[]{this});
            return;
        }
        this.oT = true;
        this.oU = false;
        this.oR = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            return;
        }
        this.oP = SystemClock.uptimeMillis();
    }

    public boolean isSpinning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69a72bcb", new Object[]{this})).booleanValue() : this.isSpinning;
    }

    public void resetCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab64187", new Object[]{this});
            return;
        }
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        invalidate();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        synchronized (INIT_LOCK) {
            this.isRunning = true;
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        synchronized (INIT_LOCK) {
            this.isRunning = false;
            this.oG = 500.0d;
            this.oI = 0.0f;
            this.oJ = true;
            this.oK = 210L;
            this.oP = 0L;
            this.mProgress = 0.0f;
            this.mTargetProgress = 0.0f;
        }
    }

    public void stopSpinning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f543a29f", new Object[]{this});
            return;
        }
        this.isSpinning = false;
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        invalidate();
    }

    public void spin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88318bc9", new Object[]{this});
            return;
        }
        this.oP = SystemClock.uptimeMillis();
        this.isSpinning = true;
        invalidate();
    }

    private void an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba9b234", new Object[]{this});
        } else if (this.oV == null) {
        } else {
            this.oV.onProgressUpdate(Math.round((this.mProgress * 100.0f) / 360.0f) / 100.0f);
        }
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        if (this.isSpinning) {
            this.mProgress = 0.0f;
            this.isSpinning = false;
            an();
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.mTargetProgress;
        if (f == f2) {
            return;
        }
        if (this.mProgress == f2) {
            this.oP = SystemClock.uptimeMillis();
        }
        this.mTargetProgress = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setInstantProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9c512d", new Object[]{this, new Float(f)});
            return;
        }
        if (this.isSpinning) {
            this.mProgress = 0.0f;
            this.isSpinning = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f == this.mTargetProgress) {
            return;
        }
        this.mTargetProgress = Math.min(f * 360.0f, 360.0f);
        this.mProgress = this.mTargetProgress;
        this.oP = SystemClock.uptimeMillis();
        invalidate();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.mProgress = this.mProgress;
        wheelSavedState.mTargetProgress = this.mTargetProgress;
        wheelSavedState.isSpinning = this.isSpinning;
        wheelSavedState.spinSpeed = this.spinSpeed;
        wheelSavedState.barWidth = this.barWidth;
        wheelSavedState.barColor = this.barColor;
        wheelSavedState.rimWidth = this.rimWidth;
        wheelSavedState.rimColor = this.rimColor;
        wheelSavedState.circleRadius = this.circleRadius;
        wheelSavedState.linearProgress = this.linearProgress;
        wheelSavedState.fillRadius = this.fillRadius;
        return wheelSavedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
            super.onRestoreInstanceState(wheelSavedState.getSuperState());
            this.mProgress = wheelSavedState.mProgress;
            this.mTargetProgress = wheelSavedState.mTargetProgress;
            this.isSpinning = wheelSavedState.isSpinning;
            this.spinSpeed = wheelSavedState.spinSpeed;
            this.barWidth = wheelSavedState.barWidth;
            this.barColor = wheelSavedState.barColor;
            this.rimWidth = wheelSavedState.rimWidth;
            this.rimColor = wheelSavedState.rimColor;
            this.circleRadius = wheelSavedState.circleRadius;
            this.linearProgress = wheelSavedState.linearProgress;
            this.fillRadius = wheelSavedState.fillRadius;
            this.oP = SystemClock.uptimeMillis();
        }
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        if (!this.isSpinning) {
            return this.mProgress / 360.0f;
        }
        return -1.0f;
    }

    public void setLinearProgress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf61239", new Object[]{this, new Boolean(z)});
            return;
        }
        this.linearProgress = z;
        if (this.isSpinning) {
            return;
        }
        invalidate();
    }

    public int getCircleRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec49472", new Object[]{this})).intValue() : this.circleRadius;
    }

    public void setCircleRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5647ad8", new Object[]{this, new Integer(i)});
            return;
        }
        this.circleRadius = i;
        if (this.isSpinning) {
            return;
        }
        invalidate();
    }

    public int getBarWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa9d7ae3", new Object[]{this})).intValue() : this.barWidth;
    }

    public void setBarWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe8bc87", new Object[]{this, new Integer(i)});
            return;
        }
        this.barWidth = i;
        if (this.isSpinning) {
            return;
        }
        invalidate();
    }

    public int getBarColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73c26600", new Object[]{this})).intValue() : this.barColor;
    }

    public void setBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9761350a", new Object[]{this, new Integer(i)});
            return;
        }
        this.barColor = i;
        setupPaints();
        if (this.isSpinning) {
            return;
        }
        invalidate();
    }

    public int getRimColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d0931c5d", new Object[]{this})).intValue() : this.rimColor;
    }

    public void setRimColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a74a4d", new Object[]{this, new Integer(i)});
            return;
        }
        this.rimColor = i;
        setupPaints();
        if (this.isSpinning) {
            return;
        }
        invalidate();
    }

    public float getSpinSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ec91766", new Object[]{this})).floatValue() : this.spinSpeed / 360.0f;
    }

    public void setSpinSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250a716", new Object[]{this, new Float(f)});
        } else {
            this.spinSpeed = f * 360.0f;
        }
    }

    public int getRimWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("576e3140", new Object[]{this})).intValue() : this.rimWidth;
    }

    public void setRimWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292ed1ca", new Object[]{this, new Integer(i)});
            return;
        }
        this.rimWidth = i;
        if (this.isSpinning) {
            return;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class WheelSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new Parcelable.Creator<WheelSavedState>() { // from class: com.alipay.android.msp.ui.widget.CustomProgressWheel.WheelSavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public WheelSavedState mo547createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState) ipChange.ipc$dispatch("7e98099c", new Object[]{this, parcel}) : new WheelSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public WheelSavedState[] mo548newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (WheelSavedState[]) ipChange.ipc$dispatch("23ec99c5", new Object[]{this, new Integer(i)}) : new WheelSavedState[i];
            }
        };
        int barColor;
        int barWidth;
        int circleRadius;
        boolean fillRadius;
        boolean isSpinning;
        boolean linearProgress;
        float mProgress;
        float mTargetProgress;
        int rimColor;
        int rimWidth;
        float spinSpeed;

        WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.mProgress = parcel.readFloat();
            this.mTargetProgress = parcel.readFloat();
            boolean z = true;
            this.isSpinning = parcel.readByte() != 0;
            this.spinSpeed = parcel.readFloat();
            this.barWidth = parcel.readInt();
            this.barColor = parcel.readInt();
            this.rimWidth = parcel.readInt();
            this.rimColor = parcel.readInt();
            this.circleRadius = parcel.readInt();
            this.linearProgress = parcel.readByte() != 0;
            this.fillRadius = parcel.readByte() == 0 ? false : z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.mProgress);
            parcel.writeFloat(this.mTargetProgress);
            parcel.writeByte(this.isSpinning ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.spinSpeed);
            parcel.writeInt(this.barWidth);
            parcel.writeInt(this.barColor);
            parcel.writeInt(this.rimWidth);
            parcel.writeInt(this.rimColor);
            parcel.writeInt(this.circleRadius);
            parcel.writeByte(this.linearProgress ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.fillRadius ? (byte) 1 : (byte) 0);
        }
    }
}
