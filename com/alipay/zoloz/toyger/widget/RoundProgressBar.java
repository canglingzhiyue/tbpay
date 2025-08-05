package com.alipay.zoloz.toyger.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.BitmapHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.riy;

/* loaded from: classes3.dex */
public class RoundProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FILL = 1;
    public static final int STROKE = 0;
    private float backColorWidth;
    private int backgroundColor;
    private int endAngle;
    public BitmapShader mBitmapShader;
    private Matrix mMatrix;
    private int mWidth;
    private int max;
    public boolean needHidden;
    private Paint paint;
    private int progress;
    private int radius;
    private int roundColor;
    private int roundProgressColor;
    private boolean roundShader;
    private float roundWidth;
    private int startAngle;
    private int style;
    private int textColor;
    private boolean textIsDisplayable;
    private float textSize;

    public static /* synthetic */ Object ipc$super(RoundProgressBar roundProgressBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != -1117127205) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
    }

    public int getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9581002", new Object[]{this})).intValue() : this.radius;
    }

    public RoundProgressBar(Context context) {
        this(context, null);
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.needHidden && i == 0) {
            i = 4;
        }
        super.setVisibility(i);
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.style = 0;
        this.radius = 0;
        this.needHidden = false;
        this.paint = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.zface_round_progressBar);
        this.roundColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_color, -65536);
        this.roundProgressColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_progress_color, -16711936);
        this.textColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_text_color, -16711936);
        this.textSize = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_text_size, 15.0f);
        this.roundWidth = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_round_width, 5.0f);
        this.max = obtainStyledAttributes.getInteger(R.styleable.zface_round_progressBar_zface_max, 100);
        this.textIsDisplayable = obtainStyledAttributes.getBoolean(R.styleable.zface_round_progressBar_zface_text_is_displayable, true);
        this.style = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_style, 0);
        this.roundShader = obtainStyledAttributes.getBoolean(R.styleable.zface_round_progressBar_zface_progress_shader, false);
        this.backColorWidth = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_color_bg_width, 0.0f);
        this.startAngle = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_start_angle, 0);
        BioLog.i("bio startAngle:" + this.startAngle);
        this.endAngle = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_end_angle, 360);
        this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_background_color, -1);
        if (this.backColorWidth > 0.0f && this.roundShader) {
            this.mMatrix = new Matrix();
            Bitmap readBitMap = BitmapHelper.readBitMap(context, R.drawable.zface_circle_bg);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.mBitmapShader = new BitmapShader(readBitMap, tileMode, tileMode);
            this.mWidth = (int) this.backColorWidth;
            float min = this.mWidth / Math.min(readBitMap.getWidth(), readBitMap.getHeight());
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
        canvas.drawCircle(width2, width2, this.radius, this.paint);
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
        int i4 = this.startAngle;
        canvas.drawArc(rectF, i4 + 90, this.endAngle - i4, false, this.paint);
        this.paint.setColor(this.roundProgressColor);
        int i5 = this.style;
        if (i5 == 0) {
            paintStroke(canvas, rectF);
        } else if (i5 != 1) {
        } else {
            this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
            if (this.progress == 0) {
                return;
            }
            int i6 = this.startAngle;
            canvas.drawArc(rectF, i6 + 90, ((this.endAngle - i6) * i) / this.max, true, this.paint);
        }
    }

    private void paintStroke(Canvas canvas, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aea2959", new Object[]{this, canvas, rectF});
            return;
        }
        this.paint.setStyle(Paint.Style.STROKE);
        BitmapShader bitmapShader = this.mBitmapShader;
        if (bitmapShader != null) {
            this.paint.setShader(bitmapShader);
        }
        int i = this.startAngle;
        canvas.drawArc(rectF, i + 90, ((this.endAngle - i) * this.progress) / this.max, false, this.paint);
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
}
