package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class RoundRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float bottomLeftRadius;
    private float bottomRightRadius;
    private Paint imagePaint;
    private Paint roundPaint;
    private float topLeftRadius;
    private float topRightRadius;
    private boolean useClipOutLine;

    static {
        kge.a(1439545388);
    }

    public static /* synthetic */ Object ipc$super(RoundRelativeLayout roundRelativeLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RoundRelativeLayout(Context context) {
        this(context, null);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.useClipOutLine = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TTRoundRelativeLayout);
            float dimension = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_allRadius, 0.0f);
            this.topLeftRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_topLeftRadius, dimension);
            this.topRightRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_topRightRadius, dimension);
            this.bottomLeftRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_bottomLeftRadius, dimension);
            this.bottomRightRadius = obtainStyledAttributes.getDimension(R.styleable.TTRoundRelativeLayout_bottomRightRadius, dimension);
            obtainStyledAttributes.recycle();
        }
        prepare();
    }

    private void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        if (isSupportClipOutline()) {
            float f = this.topLeftRadius;
            if (f == this.topRightRadius) {
                float f2 = this.bottomLeftRadius;
                if (f == f2 && f2 == this.bottomRightRadius) {
                    final int i = (int) f;
                    setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.ttdetail.widget.RoundRelativeLayout.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view, Outline outline) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            } else {
                                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                            }
                        }
                    });
                    setClipToOutline(true);
                    this.useClipOutLine = true;
                    return;
                }
            }
            float f3 = this.topLeftRadius;
            if (f3 == this.topRightRadius && this.bottomLeftRadius == 0.0f && this.bottomRightRadius == 0.0f) {
                final int i2 = (int) f3;
                setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.ttdetail.widget.RoundRelativeLayout.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(0, -i2, view.getWidth(), view.getHeight(), i2);
                        outline.offset(0, i2);
                    }
                });
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            }
            float f4 = this.bottomLeftRadius;
            if (f4 == this.bottomRightRadius && this.topLeftRadius == 0.0f && this.topRightRadius == 0.0f) {
                final int i3 = (int) f4;
                setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.ttdetail.widget.RoundRelativeLayout.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        int width = view.getWidth();
                        int height = view.getHeight();
                        int i4 = i3;
                        outline.setRoundRect(0, 0, width, height + i4, i4);
                        outline.offset(0, -i3);
                    }
                });
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            }
            float f5 = this.topLeftRadius;
            if (f5 == this.bottomLeftRadius && this.topRightRadius == 0.0f && this.bottomRightRadius == 0.0f) {
                final int i4 = (int) f5;
                setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.ttdetail.widget.RoundRelativeLayout.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(-i4, 0, view.getWidth(), view.getHeight(), i4);
                        outline.offset(i4, 0);
                    }
                });
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            }
            float f6 = this.topRightRadius;
            if (f6 == this.bottomRightRadius && this.topLeftRadius == 0.0f && this.bottomLeftRadius == 0.0f) {
                final int i5 = (int) f6;
                setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.ttdetail.widget.RoundRelativeLayout.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                            return;
                        }
                        outline.setRoundRect(0, 0, view.getWidth() + i5, view.getHeight(), i5);
                        outline.offset(-i5, 0);
                    }
                });
                setClipToOutline(true);
                this.useClipOutLine = true;
                return;
            }
        }
        this.roundPaint = new Paint();
        this.roundPaint.setColor(-1);
        this.roundPaint.setAntiAlias(true);
        this.roundPaint.setStyle(Paint.Style.FILL);
        this.roundPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.imagePaint = new Paint();
        this.imagePaint.setXfermode(null);
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            setRadius(f, f, f, f);
        }
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.topLeftRadius = f;
        this.topRightRadius = f2;
        this.bottomLeftRadius = f3;
        this.bottomRightRadius = f4;
        prepare();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.useClipOutLine) {
            super.dispatchDraw(canvas);
        } else {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.imagePaint, 31);
            super.dispatchDraw(canvas);
            drawTopLeft(canvas);
            drawTopRight(canvas);
            drawBottomLeft(canvas);
            drawBottomRight(canvas);
            canvas.restore();
        }
    }

    private void drawTopLeft(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a968a6", new Object[]{this, canvas});
        } else if (this.topLeftRadius <= 0.0f) {
        } else {
            Path path = new Path();
            path.moveTo(0.0f, this.topLeftRadius);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.topLeftRadius, 0.0f);
            float f = this.topLeftRadius;
            path.arcTo(new RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawTopRight(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56619373", new Object[]{this, canvas});
        } else if (this.topRightRadius <= 0.0f) {
        } else {
            int width = getWidth();
            Path path = new Path();
            float f = width;
            path.moveTo(f - this.topRightRadius, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.topRightRadius);
            float f2 = this.topRightRadius;
            path.arcTo(new RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawBottomLeft(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2519f948", new Object[]{this, canvas});
        } else if (this.bottomLeftRadius <= 0.0f) {
        } else {
            int height = getHeight();
            Path path = new Path();
            float f = height;
            path.moveTo(0.0f, f - this.bottomLeftRadius);
            path.lineTo(0.0f, f);
            path.lineTo(this.bottomLeftRadius, f);
            float f2 = this.bottomLeftRadius;
            path.arcTo(new RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private void drawBottomRight(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94031711", new Object[]{this, canvas});
        } else if (this.bottomRightRadius <= 0.0f) {
        } else {
            int height = getHeight();
            int width = getWidth();
            Path path = new Path();
            float f = width;
            float f2 = height;
            path.moveTo(f - this.bottomRightRadius, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.bottomRightRadius);
            float f3 = this.bottomRightRadius;
            path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        }
    }

    private boolean isSupportClipOutline() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbe74c58", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT < 29;
    }
}
