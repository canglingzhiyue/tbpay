package com.taobao.weex.ui.view.refresh.circlebar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class CircleProgressBar extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CIRCLE_BG_LIGHT = -328966;
    public static final int DEFAULT_CIRCLE_COLOR = -1048576;
    private static final int DEFAULT_CIRCLE_DIAMETER = 40;
    private static final int FILL_SHADOW_COLOR = 1023410176;
    private static final int KEY_SHADOW_COLOR = 503316480;
    private static final int SHADOW_ELEVATION = 4;
    private static final float SHADOW_RADIUS = 3.5f;
    private static final int STROKE_WIDTH_LARGE = 3;
    private static final float X_OFFSET = 0.0f;
    private static final float Y_OFFSET = 1.75f;
    private int mArrowHeight;
    private int mArrowWidth;
    private int mBackGroundColor;
    private ShapeDrawable mBgCircle;
    private boolean mCircleBackgroundEnabled;
    private int[] mColors;
    private int mDiameter;
    private int mInnerRadius;
    private Animation.AnimationListener mListener;
    private int mMax;
    private int mProgress;
    private int mProgressColor;
    public MaterialProgressDrawable mProgressDrawable;
    private int mProgressStokeWidth;
    private int mShadowRadius;
    private boolean mShowArrow;

    static {
        kge.a(-1397228948);
    }

    public static /* synthetic */ Object ipc$super(CircleProgressBar circleProgressBar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1998369028:
                super.onAnimationStart();
                return null;
            case 2083003325:
                super.onAnimationEnd();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public CircleProgressBar(Context context) {
        super(context);
        this.mColors = new int[]{-16777216};
        init(context, null, 0);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mColors = new int[]{-16777216};
        init(context, attributeSet, 0);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mColors = new int[]{-16777216};
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        this.mBackGroundColor = DEFAULT_CIRCLE_BG_LIGHT;
        this.mProgressColor = DEFAULT_CIRCLE_COLOR;
        this.mColors = new int[]{this.mProgressColor};
        this.mInnerRadius = -1;
        this.mProgressStokeWidth = (int) (f * 3.0f);
        this.mArrowWidth = -1;
        this.mArrowHeight = -1;
        this.mShowArrow = true;
        this.mCircleBackgroundEnabled = true;
        this.mProgress = 0;
        this.mMax = 100;
        this.mProgressDrawable = new MaterialProgressDrawable(getContext(), this);
        super.setImageDrawable(this.mProgressDrawable);
    }

    public void setProgressBackGroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7763116", new Object[]{this, new Integer(i)});
        } else {
            this.mBackGroundColor = i;
        }
    }

    private boolean elevationSupported() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("364052dc", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (elevationSupported()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.mShadowRadius << 1), getMeasuredHeight() + (this.mShadowRadius << 1));
    }

    public int getProgressStokeWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d265429b", new Object[]{this})).intValue() : this.mProgressStokeWidth;
    }

    public void setProgressStokeWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90736acf", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressStokeWidth = (int) (i * getContext().getResources().getDisplayMetrics().density);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.mDiameter = Math.min(getMeasuredWidth(), getMeasuredHeight());
        if (this.mDiameter <= 0) {
            this.mDiameter = ((int) f) * 40;
        }
        if (getBackground() == null && this.mCircleBackgroundEnabled) {
            int i5 = (int) (1.75f * f);
            int i6 = (int) (f * 0.0f);
            this.mShadowRadius = (int) (3.5f * f);
            if (elevationSupported()) {
                if (this.mBgCircle == null) {
                    this.mBgCircle = new ShapeDrawable(new OvalShape());
                }
                ViewCompat.setElevation(this, f * 4.0f);
            } else {
                ShapeDrawable shapeDrawable = this.mBgCircle;
                if (shapeDrawable == null || !(shapeDrawable.getShape() instanceof OvalShadow) || OvalShadow.access$000((OvalShadow) this.mBgCircle.getShape()) != this.mDiameter - (this.mShadowRadius << 1) || OvalShadow.access$100((OvalShadow) this.mBgCircle.getShape()) != this.mShadowRadius) {
                    int i7 = this.mShadowRadius;
                    this.mBgCircle = new ShapeDrawable(new OvalShadow(i7, this.mDiameter - (i7 << 1)));
                }
                ViewCompat.setLayerType(this, 1, this.mBgCircle.getPaint());
                this.mBgCircle.getPaint().setShadowLayer(this.mShadowRadius, i6, i5, KEY_SHADOW_COLOR);
                int i8 = this.mShadowRadius;
                setPadding(i8, i8, i8, i8);
            }
            this.mBgCircle.getPaint().setColor(this.mBackGroundColor);
            setBackgroundDrawable(this.mBgCircle);
        }
        this.mProgressDrawable.setBackgroundColor(this.mBackGroundColor);
        this.mProgressDrawable.setColorSchemeColors(this.mColors);
        if (isShowArrow()) {
            this.mProgressDrawable.setArrowScale(1.0f);
            this.mProgressDrawable.showArrow(true);
        }
        super.setImageDrawable(null);
        super.setImageDrawable(this.mProgressDrawable);
        this.mProgressDrawable.setAlpha(255);
        if (getVisibility() != 0) {
            return;
        }
        this.mProgressDrawable.setStartEndTrim(0.0f, 0.8f);
    }

    public boolean isShowArrow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1dcc748d", new Object[]{this})).booleanValue() : this.mShowArrow;
    }

    public void setShowArrow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba57ca3", new Object[]{this, new Boolean(z)});
        } else {
            this.mShowArrow = z;
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97bfcc9", new Object[]{this, animationListener});
        } else {
            this.mListener = animationListener;
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
            return;
        }
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener == null) {
            return;
        }
        animationListener.onAnimationStart(getAnimation());
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            return;
        }
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener == null) {
            return;
        }
        animationListener.onAnimationEnd(getAnimation());
    }

    public void setColorSchemeColors(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbd778b", new Object[]{this, iArr});
            return;
        }
        this.mColors = iArr;
        MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
        if (materialProgressDrawable == null) {
            return;
        }
        materialProgressDrawable.setColorSchemeColors(iArr);
    }

    public void setBackgroundColorResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe218bb", new Object[]{this, new Integer(i)});
        } else if (!(getBackground() instanceof ShapeDrawable)) {
        } else {
            ((ShapeDrawable) getBackground()).getPaint().setColor(getResources().getColor(i));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else if (!(getBackground() instanceof ShapeDrawable)) {
        } else {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public int getMax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("700b13a8", new Object[]{this})).intValue() : this.mMax;
    }

    public void setMax(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1036fa", new Object[]{this, new Integer(i)});
        } else {
            this.mMax = i;
        }
    }

    public int getProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ba5fa9d", new Object[]{this})).intValue() : this.mProgress;
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
            return;
        }
        if (getMax() > 0) {
            this.mProgress = i;
        }
        invalidate();
    }

    public boolean circleBackgroundEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7cb264e", new Object[]{this})).booleanValue() : this.mCircleBackgroundEnabled;
    }

    public void setCircleBackgroundEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485e9f4c", new Object[]{this, new Boolean(z)});
        } else {
            this.mCircleBackgroundEnabled = z;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
        if (materialProgressDrawable == null) {
            return;
        }
        materialProgressDrawable.stop();
        MaterialProgressDrawable materialProgressDrawable2 = this.mProgressDrawable;
        if (getVisibility() != 0) {
            z = false;
        }
        materialProgressDrawable2.setVisible(z, false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        MaterialProgressDrawable materialProgressDrawable = this.mProgressDrawable;
        if (materialProgressDrawable == null) {
            return;
        }
        materialProgressDrawable.stop();
        this.mProgressDrawable.setVisible(false, false);
    }

    /* loaded from: classes9.dex */
    public class OvalShadow extends OvalShape {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mCircleDiameter;
        private RadialGradient mRadialGradient;
        private Paint mShadowPaint = new Paint();
        private int mShadowRadius;

        static {
            kge.a(-1330371222);
        }

        public static /* synthetic */ int access$000(OvalShadow ovalShadow) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3f0aa6f", new Object[]{ovalShadow})).intValue() : ovalShadow.mCircleDiameter;
        }

        public static /* synthetic */ int access$100(OvalShadow ovalShadow) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab198cb0", new Object[]{ovalShadow})).intValue() : ovalShadow.mShadowRadius;
        }

        public OvalShadow(int i, int i2) {
            this.mShadowRadius = i;
            this.mCircleDiameter = i2;
            int i3 = this.mCircleDiameter;
            this.mRadialGradient = new RadialGradient(i3 / 2, i3 / 2, this.mShadowRadius, new int[]{CircleProgressBar.FILL_SHADOW_COLOR, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.mShadowPaint.setShader(this.mRadialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8ce0f", new Object[]{this, canvas, paint});
                return;
            }
            float width = CircleProgressBar.this.getWidth() / 2;
            float height = CircleProgressBar.this.getHeight() / 2;
            canvas.drawCircle(width, height, (this.mCircleDiameter / 2) + this.mShadowRadius, this.mShadowPaint);
            canvas.drawCircle(width, height, this.mCircleDiameter / 2, paint);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.mProgressDrawable.start();
        }
    }

    public void setStartEndTrim(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb471764", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.mProgressDrawable.setStartEndTrim(f, f2);
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.mProgressDrawable.stop();
        }
    }

    public void setProgressRotation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a706ec", new Object[]{this, new Float(f)});
        } else {
            this.mProgressDrawable.setProgressRotation(f);
        }
    }
}
