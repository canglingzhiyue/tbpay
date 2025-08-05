package com.taobao.oversea.baobao.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class CircleProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_MAX = 100;
    private static final int DEFAULT_START_DEGREE = -90;
    private static final float MAX_DEGREE = 360.0f;
    private float mAp;
    private int mBackgroundColor;
    private final Paint mBackgroundPaint;
    private final Paint mBadgeBackPaint;
    private float mBadgeRadius;
    private final RectF mBoundsRectF;
    private Paint.Cap mCap;
    private float mCenterX;
    private float mCenterY;
    private float mMax;
    private float mNearMax;
    private float mProgress;
    private int mProgressBackgroundColor;
    private final Paint mProgressBackgroundPaint;
    private int mProgressColor;
    private final Paint mProgressPaint;
    private final RectF mProgressRectF;
    private float mProgressStrokeWidth;
    private boolean mShowBadge;
    private int mStartDegree;

    public static /* synthetic */ Object ipc$super(CircleProgressBar circleProgressBar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private int ap(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccf6ad3d", new Object[]{this, new Float(f)})).intValue() : (int) (f * this.mAp);
    }

    public CircleProgressBar(Context context, float f) {
        super(context);
        this.mProgressRectF = new RectF();
        this.mBoundsRectF = new RectF();
        this.mProgressPaint = new Paint(1);
        this.mProgressBackgroundPaint = new Paint(1);
        this.mBackgroundPaint = new Paint(1);
        this.mBadgeBackPaint = new Paint(1);
        this.mMax = 100.0f;
        this.mNearMax = 95.0f;
        this.mAp = f;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mCap = Paint.Cap.ROUND;
        this.mShowBadge = true;
        this.mBadgeRadius = ap(9.0f);
        this.mProgressStrokeWidth = ap(4.8f);
        this.mProgressColor = -21504;
        this.mProgressBackgroundColor = -1570;
        this.mBackgroundColor = -1;
        this.mStartDegree = DEFAULT_START_DEGREE;
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setStrokeWidth(this.mProgressStrokeWidth);
        this.mProgressPaint.setColor(this.mProgressColor);
        this.mProgressPaint.setStrokeCap(this.mCap);
        this.mProgressBackgroundPaint.setStyle(Paint.Style.STROKE);
        this.mProgressBackgroundPaint.setStrokeWidth(this.mProgressStrokeWidth);
        this.mProgressBackgroundPaint.setColor(this.mProgressBackgroundColor);
        this.mProgressBackgroundPaint.setStrokeCap(this.mCap);
        this.mBackgroundPaint.setStyle(Paint.Style.FILL);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        this.mBackgroundPaint.setShadowLayer(ap(4.0f), -ap(3.1f), 0.0f, 855638016);
        this.mBadgeBackPaint.setStyle(Paint.Style.FILL);
    }

    private void updateProgressShader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7dc0a2", new Object[]{this});
            return;
        }
        this.mProgressPaint.setShader(null);
        this.mProgressPaint.setColor(this.mProgressColor);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(this.mStartDegree, this.mCenterX, this.mCenterY);
        drawProgress(canvas);
        canvas.restore();
    }

    private void drawProgress(Canvas canvas) {
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cb50cd", new Object[]{this, canvas});
            return;
        }
        float width2 = getWidth();
        float f = width2 / 2.0f;
        canvas.drawCircle(f, f, (width / 2) - this.mProgressStrokeWidth, this.mBackgroundPaint);
        canvas.drawArc(this.mProgressRectF, 0.0f, MAX_DEGREE, false, this.mProgressBackgroundPaint);
        canvas.drawArc(this.mProgressRectF, 0.0f, (this.mProgress * MAX_DEGREE) / this.mMax, false, this.mProgressPaint);
        if (!this.mShowBadge) {
            return;
        }
        this.mBadgeBackPaint.setColor(-1);
        canvas.drawCircle((width2 - this.mBadgeRadius) - getPaddingLeft(), (width2 - this.mBadgeRadius) - getPaddingTop(), this.mBadgeRadius, this.mBadgeBackPaint);
        this.mBadgeBackPaint.setColor(-45056);
        canvas.drawCircle((width2 - this.mBadgeRadius) - getPaddingLeft(), (width2 - this.mBadgeRadius) - getPaddingTop(), this.mBadgeRadius - ap(1.0f), this.mBadgeBackPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mBoundsRectF.left = getPaddingLeft();
        this.mBoundsRectF.top = getPaddingTop();
        this.mBoundsRectF.right = i - getPaddingRight();
        this.mBoundsRectF.bottom = i2 - getPaddingBottom();
        this.mCenterX = this.mBoundsRectF.centerX();
        this.mCenterY = this.mBoundsRectF.centerY();
        this.mProgressRectF.set(this.mBoundsRectF);
        updateProgressShader();
        RectF rectF = this.mProgressRectF;
        float f = this.mProgressStrokeWidth;
        rectF.inset(f / 2.0f, f / 2.0f);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.progress = this.mProgress;
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.progress);
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.mProgressColor = i;
        updateProgressShader();
        invalidate();
    }

    public void setProgressBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1ecf6", new Object[]{this, new Integer(i)});
            return;
        }
        this.mProgressBackgroundColor = i;
        this.mProgressBackgroundPaint.setColor(this.mProgressBackgroundColor);
        invalidate();
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue() : this.mProgress;
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.mNearMax;
        if (f > f2 && f < this.mMax) {
            this.mProgress = f2;
        } else {
            this.mProgress = f;
        }
        invalidate();
    }

    public void setMax(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c102bb7", new Object[]{this, new Float(f)});
            return;
        }
        this.mMax = f;
        this.mNearMax = f * 0.95f;
        invalidate();
    }

    public void setShowBadge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a0549", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mShowBadge = z;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.taobao.oversea.baobao.view.CircleProgressBar.SavedState.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.oversea.baobao.view.CircleProgressBar$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.oversea.baobao.view.CircleProgressBar$SavedState[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public SavedState a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState) ipChange.ipc$dispatch("7a01339c", new Object[]{this, parcel}) : new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (SavedState[]) ipChange.ipc$dispatch("ea550e4d", new Object[]{this, new Integer(i)}) : new SavedState[i];
            }
        };
        float progress;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.progress = parcel.readFloat();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.progress);
        }
    }

    public void setGray(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e26c68", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            this.mProgressPaint.setColorFilter(colorMatrixColorFilter);
            this.mProgressBackgroundPaint.setColorFilter(colorMatrixColorFilter);
            this.mBackgroundPaint.setColorFilter(colorMatrixColorFilter);
            this.mBadgeBackPaint.setColorFilter(colorMatrixColorFilter);
        } else {
            this.mProgressPaint.setColorFilter(null);
            this.mProgressBackgroundPaint.setColorFilter(null);
            this.mBackgroundPaint.setColorFilter(null);
            this.mBadgeBackPaint.setColorFilter(null);
        }
        invalidate();
    }
}
