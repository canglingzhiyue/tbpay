package com.taobao.message.uikit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class DigitalProgressWheel extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int maxSideLength;
    private static WeakReference<Bitmap> weakReference;
    private int angle;
    private ValueAnimator angleValueAnimator;
    private int bitmapResourceId;
    private RectF circleRect;
    private boolean isInit;
    private boolean isRunning;
    private boolean isStart;
    private String length;
    private int mProgress;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private RectF rectBounds;
    private float textCenterY;
    private float textMariginCircle;
    private float textMariginCircleScale;
    private Paint textPaint;
    private float textSize;
    private float textSizeScale;

    private void changeBubbleImageViewLoadingStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127ce463", new Object[]{this, new Boolean(z)});
        }
    }

    public static /* synthetic */ Object ipc$super(DigitalProgressWheel digitalProgressWheel, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1705336120:
                super.setVisibility(((Number) objArr[0]).intValue());
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(DigitalProgressWheel digitalProgressWheel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43562dad", new Object[]{digitalProgressWheel});
        } else {
            digitalProgressWheel.pauseAni();
        }
    }

    public static /* synthetic */ boolean access$100(DigitalProgressWheel digitalProgressWheel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fdcbce32", new Object[]{digitalProgressWheel})).booleanValue() : digitalProgressWheel.isRunning;
    }

    public static /* synthetic */ void access$200(DigitalProgressWheel digitalProgressWheel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8416eaf", new Object[]{digitalProgressWheel});
        } else {
            digitalProgressWheel.stopAni();
        }
    }

    public static /* synthetic */ int access$302(DigitalProgressWheel digitalProgressWheel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f032e084", new Object[]{digitalProgressWheel, new Integer(i)})).intValue();
        }
        digitalProgressWheel.angle = i;
        return i;
    }

    static {
        kge.a(1256940377);
        maxSideLength = 100;
    }

    public DigitalProgressWheel(Context context) {
        super(context);
        this.paddingTop = 0;
        this.paddingBottom = 0;
        this.paddingLeft = 0;
        this.paddingRight = 0;
        this.rectBounds = new RectF();
        this.textSizeScale = 0.4f;
        this.textMariginCircleScale = 0.05f;
        this.isInit = false;
        this.textPaint = new Paint();
        this.angle = 0;
        this.bitmapResourceId = R.drawable.mp_send_loading_progress_ic;
        this.isStart = false;
        this.mProgress = 0;
        this.isRunning = false;
        setWillNotDraw(false);
        init();
    }

    public DigitalProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paddingTop = 0;
        this.paddingBottom = 0;
        this.paddingLeft = 0;
        this.paddingRight = 0;
        this.rectBounds = new RectF();
        this.textSizeScale = 0.4f;
        this.textMariginCircleScale = 0.05f;
        this.isInit = false;
        this.textPaint = new Paint();
        this.angle = 0;
        this.bitmapResourceId = R.drawable.mp_send_loading_progress_ic;
        this.isStart = false;
        this.mProgress = 0;
        this.isRunning = false;
        init();
    }

    public DigitalProgressWheel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paddingTop = 0;
        this.paddingBottom = 0;
        this.paddingLeft = 0;
        this.paddingRight = 0;
        this.rectBounds = new RectF();
        this.textSizeScale = 0.4f;
        this.textMariginCircleScale = 0.05f;
        this.isInit = false;
        this.textPaint = new Paint();
        this.angle = 0;
        this.bitmapResourceId = R.drawable.mp_send_loading_progress_ic;
        this.isStart = false;
        this.mProgress = 0;
        this.isRunning = false;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setWillNotDraw(false);
        setLayerType(1, null);
        setupAnimator();
    }

    private void resumeAni() {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bd6376", new Object[]{this});
        } else if (this.isRunning) {
        } else {
            this.isRunning = true;
            if (getVisibility() != 0 || (valueAnimator = this.angleValueAnimator) == null || valueAnimator.isRunning()) {
                return;
            }
            changeBubbleImageViewLoadingStatus(true);
            this.angleValueAnimator.start();
        }
    }

    private void pauseAni() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348ca18d", new Object[]{this});
        } else if (!this.isRunning) {
        } else {
            this.isRunning = false;
            if (this.angleValueAnimator == null) {
                return;
            }
            changeBubbleImageViewLoadingStatus(false);
            this.angleValueAnimator.cancel();
            this.angleValueAnimator.end();
        }
    }

    private void stopAni() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803a9a01", new Object[]{this});
            return;
        }
        this.isRunning = false;
        setVisibility(8);
        ValueAnimator valueAnimator = this.angleValueAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.angleValueAnimator.end();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        resumeAni();
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        resumeAni();
        super.onFinishTemporaryDetach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        pauseAni();
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (i == 0) {
            resumeAni();
        } else {
            pauseAni();
        }
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            resumeAni();
        } else {
            pauseAni();
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        pauseAni();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (getWidth() <= 0 || getHeight() <= 0 || this.isInit) {
            return;
        }
        this.isInit = true;
        setupBounds(getHeight(), getWidth());
        setupPaints();
        getCircleBitmap();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (getWidth() <= 0 || getHeight() <= 0 || this.isInit) {
            return;
        }
        this.isInit = true;
        setupBounds(getHeight(), getWidth());
        setupPaints();
        getCircleBitmap();
        invalidate();
    }

    private int measureHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7d02a4a", new Object[]{this, new Integer(i)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return 500;
        }
        return size;
    }

    private int measureWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c3fe147", new Object[]{this, new Integer(i)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return 500;
        }
        return size;
    }

    private void setupAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0049f0b", new Object[]{this});
            return;
        }
        this.angleValueAnimator = ValueAnimator.ofInt(0, 360);
        this.angleValueAnimator.setDuration(1000L);
        this.angleValueAnimator.setRepeatCount(300);
        this.angleValueAnimator.setRepeatMode(1);
        this.angleValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.message.uikit.widget.DigitalProgressWheel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (DigitalProgressWheel.this.getVisibility() != 0) {
                    DigitalProgressWheel.access$000(DigitalProgressWheel.this);
                } else if (DigitalProgressWheel.this.getVisibility() == 0 && !DigitalProgressWheel.access$100(DigitalProgressWheel.this)) {
                    DigitalProgressWheel.access$200(DigitalProgressWheel.this);
                } else {
                    DigitalProgressWheel.access$302(DigitalProgressWheel.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    DigitalProgressWheel.this.postInvalidate();
                }
            }
        });
        this.angleValueAnimator.setInterpolator(new LinearInterpolator());
    }

    private Bitmap getCircleBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("1426bd7a", new Object[]{this});
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.bitmapResourceId);
        weakReference = new WeakReference<>(decodeResource);
        return decodeResource;
    }

    private void setupPaints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd358439", new Object[]{this});
            return;
        }
        this.textPaint.setColor(-1);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setTextSize(this.textSize);
        this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setupBounds(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141cf539", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.paddingTop = getPaddingTop();
        this.paddingBottom = getPaddingBottom();
        this.paddingLeft = getPaddingLeft();
        this.paddingRight = getPaddingRight();
        this.rectBounds = new RectF(this.paddingLeft, this.paddingTop, i2 - this.paddingRight, i - this.paddingBottom);
        float width = this.rectBounds.width() < this.rectBounds.height() ? this.rectBounds.width() : this.rectBounds.height();
        int i3 = maxSideLength;
        if (width > i3) {
            float f = i3 / width;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f, this.rectBounds.centerX(), this.rectBounds.centerY());
            matrix.mapRect(this.rectBounds);
            width = maxSideLength;
        }
        float f2 = this.textSizeScale;
        this.textSize = width * f2;
        float f3 = this.textMariginCircleScale;
        this.textMariginCircle = width * f3;
        float f4 = (((1.0f - f2) - f3) * width) / 2.0f;
        float f5 = width / 2.0f;
        float centerY = (((this.rectBounds.centerY() + f5) - this.textSize) - this.textMariginCircle) - f4;
        float centerX = this.rectBounds.centerX();
        this.circleRect = new RectF(centerX - f4, centerY - f4, centerX + f4, centerY + f4);
        this.textCenterY = (this.rectBounds.centerY() + f5) - (this.textSize / 4.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (this.isInit) {
            Bitmap bitmap = weakReference.get();
            if (bitmap == null) {
                bitmap = getCircleBitmap();
            }
            if (bitmap == null) {
                return;
            }
            this.angle = ((Integer) this.angleValueAnimator.getAnimatedValue()).intValue();
            canvas.save();
            canvas.rotate(this.angle, this.circleRect.centerX(), this.circleRect.centerY());
            canvas.drawBitmap(bitmap, (Rect) null, this.circleRect, (Paint) null);
            canvas.restore();
            canvas.drawText(this.mProgress + riy.MOD, this.rectBounds.centerX(), this.textCenterY, this.textPaint);
        } else {
            super.onDraw(canvas);
        }
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
            return;
        }
        this.mProgress = i;
        invalidate();
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.isStart) {
        } else {
            this.isStart = true;
            this.mProgress = 0;
            if (this.angleValueAnimator == null) {
                setupAnimator();
            }
            postInvalidate();
        }
    }

    public void setBitmapResourceId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d471ac2", new Object[]{this, new Integer(i)});
        } else {
            this.bitmapResourceId = i;
        }
    }

    public String getLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9cfe529d", new Object[]{this}) : this.length;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            resumeAni();
        } else {
            pauseAni();
        }
    }

    public void setLength(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a275ee79", new Object[]{this, str});
        } else {
            this.length = str;
        }
    }
}
