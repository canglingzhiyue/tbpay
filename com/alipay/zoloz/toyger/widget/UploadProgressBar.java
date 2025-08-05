package com.alipay.zoloz.toyger.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.riy;

/* loaded from: classes3.dex */
public class UploadProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FILL = 1;
    public static final int STROKE = 0;
    public final int ANGLE_STEP;
    private float backColorWidth;
    private int backgroundColor;
    private int endAngle;
    public BitmapShader mBitmapShader;
    private Handler mMainHandle;
    private Matrix mMatrix;
    public int mProgressAngle;
    private int mWidth;
    private int max;
    public Paint paint;
    private int progress;
    private int radius;
    public int roundColor;
    public int roundProgressColor;
    private boolean roundShader;
    private float roundWidth;
    private int secondProgressColor;
    public int startAngle;
    private int style;
    private int textColor;
    private boolean textIsDisplayable;
    private float textSize;

    public static /* synthetic */ Object ipc$super(UploadProgressBar uploadProgressBar, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9581002", new Object[]{this})).intValue() : this.radius;
    }

    public UploadProgressBar(Context context) {
        this(context, null);
    }

    public UploadProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UploadProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.style = 0;
        this.radius = 0;
        this.mProgressAngle = 0;
        this.ANGLE_STEP = 120;
        this.paint = new Paint();
        this.mMainHandle = new Handler(Looper.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.zface_round_progressBar);
        this.roundColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_color, -65536);
        this.roundProgressColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_progress_color, -16711936);
        this.secondProgressColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_progress_color, -16711936);
        this.textColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_text_color, -16711936);
        this.textSize = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_text_size, 15.0f);
        this.roundWidth = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_round_width, 5.0f);
        this.max = obtainStyledAttributes.getInteger(R.styleable.zface_round_progressBar_zface_max, 100);
        this.textIsDisplayable = obtainStyledAttributes.getBoolean(R.styleable.zface_round_progressBar_zface_text_is_displayable, true);
        this.style = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_style, 0);
        this.roundShader = obtainStyledAttributes.getBoolean(R.styleable.zface_round_progressBar_zface_progress_shader, false);
        this.backColorWidth = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_color_bg_width, 0.0f);
        this.startAngle = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_start_angle, 0);
        this.endAngle = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_end_angle, 360);
        this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_background_color, -1);
        if (this.backColorWidth > 0.0f && this.roundShader) {
            this.mMatrix = new Matrix();
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.zface_circle_bg);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.mBitmapShader = new BitmapShader(decodeResource, tileMode, tileMode);
            this.mWidth = (int) this.backColorWidth;
            float min = this.mWidth / Math.min(decodeResource.getWidth(), decodeResource.getHeight());
            this.mMatrix.setScale(min, min);
            this.mBitmapShader.setLocalMatrix(this.mMatrix);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        float width2 = getWidth() / 2;
        this.radius = (int) (width2 - (this.roundWidth / 2.0f));
        this.paint.setColor(this.roundColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.roundWidth);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setColor(this.backgroundColor);
        this.paint.setStrokeWidth(0.0f);
        this.paint.setColor(this.textColor);
        this.paint.setTextSize(this.textSize);
        this.paint.setTypeface(Typeface.DEFAULT_BOLD);
        int i2 = (int) ((this.progress / this.max) * 100.0f);
        float measureText = this.paint.measureText(i2 + riy.MOD);
        this.paint.setShader(null);
        if (this.textIsDisplayable && i2 != 0 && this.style == 0) {
            canvas.drawText(i2 + riy.MOD, width2 - (measureText / 2.0f), width2 + (this.textSize / 2.0f), this.paint);
        }
        this.paint.setStrokeWidth(this.roundWidth);
        int i3 = this.radius;
        RectF rectF = new RectF(width - i3, width - i3, width + i3, width + i3);
        this.paint.setColor(this.roundColor);
        int i4 = this.style;
        if (i4 == 0) {
            paintStroke(canvas, rectF);
        } else if (i4 != 1) {
        } else {
            this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
            if (this.progress == 0) {
                return;
            }
            int i5 = this.startAngle;
            canvas.drawArc(rectF, i5 + 90, ((this.endAngle - i5) * i) / this.max, true, this.paint);
        }
    }

    public void paintStroke(Canvas canvas, RectF rectF) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aea2959", new Object[]{this, canvas, rectF});
            return;
        }
        this.paint.setStyle(Paint.Style.STROKE);
        BitmapShader bitmapShader = this.mBitmapShader;
        if (bitmapShader != null) {
            this.paint.setShader(bitmapShader);
        }
        int i4 = this.startAngle;
        int i5 = i4 + 180;
        int i6 = 180 - (i4 * 2);
        canvas.drawArc(rectF, i5, i6, false, this.paint);
        int i7 = this.mProgressAngle % 360;
        if (i7 < i5) {
            int i8 = i7 + 120;
            if (i8 > i5) {
                i = i8 - i5;
                i7 = i5;
            }
            i = 0;
        } else {
            int i9 = i5 + i6;
            if (i7 <= i9) {
                i = i7 + 120 < i9 ? 120 : i9 - i7;
            }
            i = 0;
        }
        if (i > 0) {
            this.paint.setColor(this.roundProgressColor);
            canvas.drawArc(rectF, i7, i, false, this.paint);
        }
        int i10 = this.mProgressAngle % 360;
        int i11 = this.startAngle;
        int i12 = 180 - (i11 * 2);
        this.paint.setColor(this.roundColor);
        float f = i11;
        canvas.drawArc(rectF, f, i12, false, this.paint);
        if (i10 < i11) {
            int i13 = i10 + 120;
            if (i13 > i11) {
                i3 = i13 - i11;
                i10 = i11;
            }
        } else {
            int i14 = i12 + i11;
            if (i10 <= i14) {
                i3 = i10 + 120 < i14 ? 120 : i14 - i10;
            }
        }
        if (i3 > 0) {
            this.paint.setColor(this.roundProgressColor);
            canvas.drawArc(rectF, i10, i3, false, this.paint);
        } else if (i10 > 270 && (i2 = (this.mProgressAngle + 120) % 360) < 180 && i2 > i11) {
            this.paint.setColor(this.roundProgressColor);
            canvas.drawArc(rectF, f, i2 - i11, false, this.paint);
        }
        this.paint.setShader(null);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.backgroundColor = i;
        postInvalidate();
    }

    public void setRoundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48805545", new Object[]{this, new Integer(i)});
            return;
        }
        this.roundColor = i;
        postInvalidate();
    }

    public synchronized int getMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700b13a8", new Object[]{this})).intValue();
        }
        return this.max;
    }

    public synchronized void setMax(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1036fa", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
            throw new IllegalArgumentException("max not less than 0");
        } else {
            this.max = i;
        }
    }

    public synchronized int getProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9d", new Object[]{this})).intValue();
        }
        return this.progress;
    }

    public synchronized void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
            throw new IllegalArgumentException("progress not less than 0");
        } else {
            if (i > this.max) {
                i = this.max;
            }
            if (i <= this.max) {
                this.progress = i;
                postInvalidate();
            }
        }
    }

    public synchronized void setProgressAngle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19420078", new Object[]{this, new Integer(i)});
            return;
        }
        this.mProgressAngle = i;
        postInvalidate();
    }

    public int getCricleColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2557c545", new Object[]{this})).intValue() : this.roundColor;
    }

    public void setCricleColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299decfd", new Object[]{this, new Integer(i)});
        } else {
            this.roundColor = i;
        }
    }

    public int getCricleProgressColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c382dd98", new Object[]{this})).intValue() : this.roundProgressColor;
    }

    public void setCricleProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca6130a", new Object[]{this, new Integer(i)});
        } else {
            this.roundProgressColor = i;
        }
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue() : this.textColor;
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textColor = i;
        }
    }

    public float getTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue() : this.textSize;
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
        } else {
            this.textSize = f;
        }
    }

    public float getRoundWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d9e7a45", new Object[]{this})).floatValue() : this.roundWidth;
    }

    public void setRoundWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d07d17f", new Object[]{this, new Float(f)});
        } else {
            this.roundWidth = f;
        }
    }

    public void setRoundProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfb352", new Object[]{this, new Integer(i)});
        } else {
            this.roundProgressColor = i;
        }
    }
}
