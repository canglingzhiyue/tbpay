package com.taobao.avplayer.core.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.kge;

/* loaded from: classes6.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final PorterDuffXfermode DST_IN_PORTER_DUFF_XFERMODE;
    private static final String TAG = "ShimmerFrameLayout";
    private Paint mAlphaPaint;
    private boolean mAnimationStarted;
    public ValueAnimator mAnimator;
    private boolean mAutoStart;
    public boolean mDestoryed;
    private int mDuration;
    private ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private a mMask;
    public Bitmap mMaskBitmap;
    private int mMaskOffsetX;
    private int mMaskOffsetY;
    private Paint mMaskPaint;
    private b mMaskTranslation;
    private Bitmap mRenderMaskBitmap;
    private Bitmap mRenderUnmaskBitmap;
    private int mRepeatCount;
    private int mRepeatDelay;
    private int mRepeatMode;

    /* renamed from: com.taobao.avplayer.core.view.ShimmerFrameLayout$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16492a;
        public static final /* synthetic */ int[] b = new int[MaskAngle.values().length];

        static {
            try {
                b[MaskAngle.CW_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[MaskAngle.CW_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[MaskAngle.CW_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[MaskAngle.CW_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16492a = new int[MaskShape.values().length];
            try {
                f16492a[MaskShape.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16492a[MaskShape.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum MaskAngle {
        CW_0,
        CW_90,
        CW_180,
        CW_270
    }

    /* loaded from: classes6.dex */
    public enum MaskShape {
        LINEAR,
        RADIAL
    }

    public static /* synthetic */ Object ipc$super(ShimmerFrameLayout shimmerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ b access$200(ShimmerFrameLayout shimmerFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4966299f", new Object[]{shimmerFrameLayout}) : shimmerFrameLayout.mMaskTranslation;
    }

    public static /* synthetic */ void access$300(ShimmerFrameLayout shimmerFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1724e9d0", new Object[]{shimmerFrameLayout, new Integer(i)});
        } else {
            shimmerFrameLayout.setMaskOffsetX(i);
        }
    }

    public static /* synthetic */ void access$400(ShimmerFrameLayout shimmerFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41200ef", new Object[]{shimmerFrameLayout, new Integer(i)});
        } else {
            shimmerFrameLayout.setMaskOffsetY(i);
        }
    }

    static {
        kge.a(793383510);
        DST_IN_PORTER_DUFF_XFERMODE = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MaskAngle f16493a;
        public float b;
        public float c;
        public int d;
        public int e;
        public float f;
        public float g;
        public float h;
        public MaskShape i;

        static {
            kge.a(454147226);
        }

        private a() {
        }

        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            int i2 = this.d;
            return i2 > 0 ? i2 : (int) (i * this.g);
        }

        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            int i2 = this.e;
            return i2 > 0 ? i2 : (int) (i * this.h);
        }

        public int[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this});
            }
            if (AnonymousClass3.f16492a[this.i.ordinal()] != 2) {
                return new int[]{0, -855683072, -855683072, 0};
            }
            return new int[]{-855683072, -855683072, 0};
        }

        public float[] b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("a9d5fa18", new Object[]{this}) : AnonymousClass3.f16492a[this.i.ordinal()] != 2 ? new float[]{Math.max(((1.0f - this.f) - this.c) / 2.0f, 0.0f), Math.max((1.0f - this.f) / 2.0f, 0.0f), Math.min((this.f + 1.0f) / 2.0f, 1.0f), Math.min(((this.f + 1.0f) + this.c) / 2.0f, 1.0f)} : new float[]{0.0f, Math.min(this.f, 1.0f), Math.min(this.f + this.c, 1.0f)};
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16494a;
        public int b;
        public int c;
        public int d;

        static {
            kge.a(206690743);
        }

        private b() {
        }

        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            this.f16494a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public ShimmerFrameLayout(Context context) {
        this(context, null, 0);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.mMask = new a();
        this.mAlphaPaint = new Paint();
        this.mMaskPaint = new Paint();
        this.mMaskPaint.setAntiAlias(true);
        this.mMaskPaint.setDither(true);
        this.mMaskPaint.setFilterBitmap(true);
        this.mMaskPaint.setXfermode(DST_IN_PORTER_DUFF_XFERMODE);
        useDefaults();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShimmerFrameLayout, 0, 0);
            try {
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_auto_start)) {
                    setAutoStart(obtainStyledAttributes.getBoolean(R.styleable.ShimmerFrameLayout_auto_start, false));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_base_alpha)) {
                    setBaseAlpha(obtainStyledAttributes.getFloat(R.styleable.ShimmerFrameLayout_base_alpha, 0.0f));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_duration)) {
                    setDuration(obtainStyledAttributes.getInt(R.styleable.ShimmerFrameLayout_duration, 0));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_repeat_count)) {
                    setRepeatCount(obtainStyledAttributes.getInt(R.styleable.ShimmerFrameLayout_repeat_count, 0));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_repeat_delay)) {
                    setRepeatDelay(obtainStyledAttributes.getInt(R.styleable.ShimmerFrameLayout_repeat_delay, 0));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_repeat_mode)) {
                    setRepeatMode(obtainStyledAttributes.getInt(R.styleable.ShimmerFrameLayout_repeat_mode, 0));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_angle)) {
                    int i2 = obtainStyledAttributes.getInt(R.styleable.ShimmerFrameLayout_angle, 0);
                    if (i2 == 90) {
                        this.mMask.f16493a = MaskAngle.CW_90;
                    } else if (i2 == 180) {
                        this.mMask.f16493a = MaskAngle.CW_180;
                    } else if (i2 != 270) {
                        this.mMask.f16493a = MaskAngle.CW_0;
                    } else {
                        this.mMask.f16493a = MaskAngle.CW_270;
                    }
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_shape)) {
                    if (obtainStyledAttributes.getInt(R.styleable.ShimmerFrameLayout_shape, 0) != 1) {
                        this.mMask.i = MaskShape.LINEAR;
                    } else {
                        this.mMask.i = MaskShape.RADIAL;
                    }
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_dropoff)) {
                    this.mMask.c = obtainStyledAttributes.getFloat(R.styleable.ShimmerFrameLayout_dropoff, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_fixed_width)) {
                    this.mMask.d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_fixed_width, 0);
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_fixed_height)) {
                    this.mMask.e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_fixed_height, 0);
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_intensity)) {
                    this.mMask.f = obtainStyledAttributes.getFloat(R.styleable.ShimmerFrameLayout_intensity, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_relative_width)) {
                    this.mMask.g = obtainStyledAttributes.getFloat(R.styleable.ShimmerFrameLayout_relative_width, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_relative_height)) {
                    this.mMask.h = obtainStyledAttributes.getFloat(R.styleable.ShimmerFrameLayout_relative_height, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(R.styleable.ShimmerFrameLayout_tilt)) {
                    this.mMask.b = obtainStyledAttributes.getFloat(R.styleable.ShimmerFrameLayout_tilt, 0.0f);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void useDefaults() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859d0500", new Object[]{this});
            return;
        }
        setAutoStart(false);
        setDuration(1000);
        setRepeatCount(3);
        setRepeatDelay(0);
        setRepeatMode(1);
        this.mMask.f16493a = MaskAngle.CW_0;
        this.mMask.i = MaskShape.LINEAR;
        a aVar = this.mMask;
        aVar.c = 0.5f;
        aVar.d = 0;
        aVar.e = 0;
        aVar.f = 0.0f;
        aVar.g = 1.0f;
        aVar.h = 1.0f;
        aVar.b = 20.0f;
        this.mMaskTranslation = new b();
        setBaseAlpha(0.3f);
        resetAll();
    }

    public boolean isAutoStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c103d5f4", new Object[]{this})).booleanValue() : this.mAutoStart;
    }

    public void setAutoStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5a481c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mAutoStart = z;
        resetAll();
    }

    public float getBaseAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d8b474e", new Object[]{this})).floatValue() : this.mAlphaPaint.getAlpha() / 255.0f;
    }

    public void setBaseAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd4742e", new Object[]{this, new Float(f)});
            return;
        }
        this.mAlphaPaint.setAlpha((int) (clamp(0.0f, 1.0f, f) * 255.0f));
        resetAll();
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue() : this.mDuration;
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
            return;
        }
        this.mDuration = i;
        resetAll();
    }

    public int getRepeatCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ae19878", new Object[]{this})).intValue() : this.mRepeatCount;
    }

    public void setRepeatCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54e802a", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRepeatCount = i;
        resetAll();
    }

    public int getRepeatDelay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("de59a6ec", new Object[]{this})).intValue() : this.mRepeatDelay;
    }

    public void setRepeatDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d84036", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRepeatDelay = i;
        resetAll();
    }

    public int getRepeatMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56adc84e", new Object[]{this})).intValue() : this.mRepeatMode;
    }

    public void setRepeatMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e24f7c", new Object[]{this, new Integer(i)});
            return;
        }
        this.mRepeatMode = i;
        resetAll();
    }

    public MaskShape getMaskShape() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaskShape) ipChange.ipc$dispatch("aa4ce18", new Object[]{this}) : this.mMask.i;
    }

    public void setMaskShape(MaskShape maskShape) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f1af82", new Object[]{this, maskShape});
            return;
        }
        this.mMask.i = maskShape;
        resetAll();
    }

    public MaskAngle getAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaskAngle) ipChange.ipc$dispatch("704da9a8", new Object[]{this}) : this.mMask.f16493a;
    }

    public void setAngle(MaskAngle maskAngle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d203ecce", new Object[]{this, maskAngle});
            return;
        }
        this.mMask.f16493a = maskAngle;
        resetAll();
    }

    public float getDropoff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ba51f61", new Object[]{this})).floatValue() : this.mMask.c;
    }

    public void setDropoff(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f48317b", new Object[]{this, new Float(f)});
            return;
        }
        this.mMask.c = f;
        resetAll();
    }

    public int getFixedWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb318722", new Object[]{this})).intValue() : this.mMask.d;
    }

    public void setFixedWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d66b28", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMask.d = i;
        resetAll();
    }

    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : this.mMask.e;
    }

    public void setFixedHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250adb03", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMask.e = i;
        resetAll();
    }

    public float getIntensity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96bb0774", new Object[]{this})).floatValue() : this.mMask.f;
    }

    public void setIntensity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89cb8c8", new Object[]{this, new Float(f)});
            return;
        }
        this.mMask.f = f;
        resetAll();
    }

    public float getRelativeWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ced711b", new Object[]{this})).floatValue() : this.mMask.g;
    }

    public void setRelativeWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eca944", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMask.g = i;
        resetAll();
    }

    public float getRelativeHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eaf35400", new Object[]{this})).floatValue() : this.mMask.h;
    }

    public void setRelativeHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1bc6067", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMask.h = i;
        resetAll();
    }

    public float getTilt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ff146e2a", new Object[]{this})).floatValue() : this.mMask.b;
    }

    public void setTilt(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcd813a", new Object[]{this, new Float(f)});
            return;
        }
        this.mMask.b = f;
        resetAll();
    }

    public void startShimmerAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f6d60c", new Object[]{this});
        } else if (this.mAnimationStarted || this.mDestoryed) {
        } else {
            getShimmerAnimation().start();
            this.mAnimationStarted = true;
        }
    }

    public void stopShimmerAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc09ac", new Object[]{this});
        } else if (!this.mAnimationStarted) {
        } else {
            ValueAnimator valueAnimator = this.mAnimator;
            if (valueAnimator != null) {
                valueAnimator.end();
                this.mAnimator.removeAllUpdateListeners();
                this.mAnimator.cancel();
            }
            this.mAnimator = null;
            this.mAnimationStarted = false;
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.mDestoryed = true;
        try {
            if (this.mAnimator == null) {
                return;
            }
            this.mAnimator.end();
            this.mAnimator.removeAllUpdateListeners();
            this.mAnimator.cancel();
        } catch (Throwable unused) {
        }
    }

    public boolean isAnimationStarted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9bb896b2", new Object[]{this})).booleanValue() : this.mAnimationStarted;
    }

    private void setMaskOffsetX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5ab5e5", new Object[]{this, new Integer(i)});
        } else if (this.mMaskOffsetX == i) {
        } else {
            this.mMaskOffsetX = i;
            invalidate();
        }
    }

    private void setMaskOffsetY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0f8e84", new Object[]{this, new Integer(i)});
        } else if (this.mMaskOffsetY == i) {
        } else {
            this.mMaskOffsetY = i;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mGlobalLayoutListener == null) {
            this.mGlobalLayoutListener = getLayoutListener();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.mGlobalLayoutListener);
    }

    private ViewTreeObserver.OnGlobalLayoutListener getLayoutListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewTreeObserver.OnGlobalLayoutListener) ipChange.ipc$dispatch("1e77df29", new Object[]{this}) : new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.avplayer.core.view.ShimmerFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        stopShimmerAnimation();
        if (this.mGlobalLayoutListener != null) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            this.mGlobalLayoutListener = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (!this.mAnimationStarted || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            dispatchDrawUsingBitmap(canvas);
        }
    }

    private static float clamp(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b744e8ae", new Object[]{new Float(f), new Float(f2), new Float(f3)})).floatValue() : Math.min(f2, Math.max(f, f3));
    }

    private boolean dispatchDrawUsingBitmap(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ac5ffcd", new Object[]{this, canvas})).booleanValue();
        }
        Bitmap tryObtainRenderUnmaskBitmap = tryObtainRenderUnmaskBitmap();
        Bitmap tryObtainRenderMaskBitmap = tryObtainRenderMaskBitmap();
        if (tryObtainRenderUnmaskBitmap == null || tryObtainRenderMaskBitmap == null) {
            return false;
        }
        drawUnmasked(new Canvas(tryObtainRenderUnmaskBitmap));
        canvas.drawBitmap(tryObtainRenderUnmaskBitmap, 0.0f, 0.0f, this.mAlphaPaint);
        drawMasked(new Canvas(tryObtainRenderMaskBitmap));
        canvas.drawBitmap(tryObtainRenderMaskBitmap, 0.0f, 0.0f, (Paint) null);
        return true;
    }

    private Bitmap tryObtainRenderUnmaskBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ab58f90f", new Object[]{this});
        }
        if (this.mRenderUnmaskBitmap == null) {
            this.mRenderUnmaskBitmap = tryCreateRenderBitmap();
        }
        return this.mRenderUnmaskBitmap;
    }

    private Bitmap tryObtainRenderMaskBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("258732b6", new Object[]{this});
        }
        if (this.mRenderMaskBitmap == null) {
            this.mRenderMaskBitmap = tryCreateRenderBitmap();
        }
        return this.mRenderMaskBitmap;
    }

    private Bitmap tryCreateRenderBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d103c301", new Object[]{this});
        }
        int width = getWidth();
        int height = getHeight();
        try {
            return createBitmapAndGcIfNecessary(width, height);
        } catch (OutOfMemoryError unused) {
            StringBuilder sb = new StringBuilder("ShimmerFrameLayout failed to create working bitmap");
            sb.append(" (width = ");
            sb.append(width);
            sb.append(", height = ");
            sb.append(height);
            sb.append(")\n\n");
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
            AVSDKLog.d(TAG, sb.toString());
            return null;
        }
    }

    private void drawUnmasked(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c5b1f6", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        super.dispatchDraw(canvas);
    }

    private void drawMasked(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f944662f", new Object[]{this, canvas});
            return;
        }
        Bitmap maskBitmap = getMaskBitmap();
        if (maskBitmap == null) {
            return;
        }
        int i = this.mMaskOffsetX;
        canvas.clipRect(i, this.mMaskOffsetY, maskBitmap.getWidth() + i, this.mMaskOffsetY + maskBitmap.getHeight());
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        super.dispatchDraw(canvas);
        canvas.drawBitmap(maskBitmap, this.mMaskOffsetX, this.mMaskOffsetY, this.mMaskPaint);
    }

    private void resetAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a623f959", new Object[]{this});
            return;
        }
        stopShimmerAnimation();
        resetMaskBitmap();
        resetRenderedView();
    }

    private void resetMaskBitmap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244a6571", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.mMaskBitmap;
        if (bitmap == null) {
            return;
        }
        bitmap.recycle();
        this.mMaskBitmap = null;
    }

    private void resetRenderedView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577ee7f0", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.mRenderUnmaskBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mRenderUnmaskBitmap = null;
        }
        Bitmap bitmap2 = this.mRenderMaskBitmap;
        if (bitmap2 == null) {
            return;
        }
        bitmap2.recycle();
        this.mRenderMaskBitmap = null;
    }

    private Bitmap getMaskBitmap() {
        LinearGradient radialGradient;
        int sqrt;
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5b566616", new Object[]{this});
        }
        Bitmap bitmap = this.mMaskBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        int a2 = this.mMask.a(getWidth());
        int b2 = this.mMask.b(getHeight());
        this.mMaskBitmap = createBitmapAndGcIfNecessary(a2, b2);
        Canvas canvas = new Canvas(this.mMaskBitmap);
        if (AnonymousClass3.f16492a[this.mMask.i.ordinal()] != 2) {
            int i5 = AnonymousClass3.b[this.mMask.f16493a.ordinal()];
            if (i5 != 2) {
                if (i5 == 3) {
                    i4 = a2;
                    i2 = 0;
                } else if (i5 != 4) {
                    i3 = a2;
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = b2;
                }
                i3 = 0;
                i = 0;
            } else {
                i = b2;
                i2 = 0;
                i3 = 0;
            }
            radialGradient = new LinearGradient(i4, i2, i3, i, this.mMask.a(), this.mMask.b(), Shader.TileMode.REPEAT);
        } else {
            radialGradient = new RadialGradient(a2 / 2, b2 / 2, (float) (Math.max(a2, b2) / Math.sqrt(2.0d)), this.mMask.a(), this.mMask.b(), Shader.TileMode.REPEAT);
        }
        canvas.rotate(this.mMask.b, a2 / 2, b2 / 2);
        Paint paint = new Paint();
        paint.setShader(radialGradient);
        float f = -(((int) (Math.sqrt(2.0d) * Math.max(a2, b2))) / 2);
        canvas.drawRect(f, f, a2 + sqrt, b2 + sqrt, paint);
        return this.mMaskBitmap;
    }

    private Animator getShimmerAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("948058f3", new Object[]{this});
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        int width = getWidth();
        int height = getHeight();
        int[] iArr = AnonymousClass3.f16492a;
        this.mMask.i.ordinal();
        int i = AnonymousClass3.b[this.mMask.f16493a.ordinal()];
        if (i == 2) {
            this.mMaskTranslation.a(0, -height, 0, height);
        } else if (i == 3) {
            this.mMaskTranslation.a(width, 0, -width, 0);
        } else if (i != 4) {
            this.mMaskTranslation.a(-width, 0, width, 0);
        } else {
            this.mMaskTranslation.a(0, height, 0, -height);
        }
        this.mAnimator = ValueAnimator.ofFloat(0.0f, (this.mRepeatDelay / this.mDuration) + 1.0f);
        this.mAnimator.setDuration(this.mDuration + this.mRepeatDelay);
        this.mAnimator.setRepeatCount(this.mRepeatCount);
        this.mAnimator.setRepeatMode(this.mRepeatMode);
        this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.avplayer.core.view.ShimmerFrameLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                float max = Math.max(0.0f, Math.min(1.0f, ((Float) valueAnimator2.getAnimatedValue()).floatValue()));
                ShimmerFrameLayout shimmerFrameLayout = ShimmerFrameLayout.this;
                float f = 1.0f - max;
                ShimmerFrameLayout.access$300(shimmerFrameLayout, (int) ((ShimmerFrameLayout.access$200(shimmerFrameLayout).f16494a * f) + (ShimmerFrameLayout.access$200(ShimmerFrameLayout.this).c * max)));
                ShimmerFrameLayout shimmerFrameLayout2 = ShimmerFrameLayout.this;
                ShimmerFrameLayout.access$400(shimmerFrameLayout2, (int) ((ShimmerFrameLayout.access$200(shimmerFrameLayout2).b * f) + (ShimmerFrameLayout.access$200(ShimmerFrameLayout.this).d * max)));
            }
        });
        return this.mAnimator;
    }

    public static Bitmap createBitmapAndGcIfNecessary(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("64ac1a8f", new Object[]{new Integer(i), new Integer(i2)});
        }
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }
}
