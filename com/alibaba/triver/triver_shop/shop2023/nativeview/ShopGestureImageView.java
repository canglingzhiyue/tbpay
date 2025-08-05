package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class ShopGestureImageView extends AppCompatImageView implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GestureDetector gestureDetector;
    private boolean isEnlarge;
    private ValueAnimator mAnimator;
    private int mCurrentX;
    private int mCurrentY;
    private float mInitScale;
    private boolean mIsOneLoad;
    private float mMaxScale;
    private float mMidScale;
    private ScaleGestureDetector mScaleGestureDetector;
    private Matrix mScaleMatrix;
    private View.OnClickListener onClickListener;
    private OverScroller scroller;
    private ValueAnimator translationAnimation;

    static {
        kge.a(579530062);
        kge.a(300785761);
    }

    public static /* synthetic */ Object ipc$super(ShopGestureImageView shopGestureImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ void access$000(ShopGestureImageView shopGestureImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9b3a1c", new Object[]{shopGestureImageView, new Float(f), new Float(f2)});
        } else {
            shopGestureImageView.onTranslationImage(f, f2);
        }
    }

    public static /* synthetic */ void access$100(ShopGestureImageView shopGestureImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4ca43b", new Object[]{shopGestureImageView, new Float(f), new Float(f2)});
        } else {
            shopGestureImageView.onDoubledrawScale(f, f2);
        }
    }

    public static /* synthetic */ void access$1000(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb88cd", new Object[]{shopGestureImageView});
        } else {
            shopGestureImageView.removeBorderAndTranslationCenter();
        }
    }

    public static /* synthetic */ int access$200(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1516e4cd", new Object[]{shopGestureImageView})).intValue() : shopGestureImageView.mCurrentX;
    }

    public static /* synthetic */ int access$202(ShopGestureImageView shopGestureImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c17edde", new Object[]{shopGestureImageView, new Integer(i)})).intValue();
        }
        shopGestureImageView.mCurrentX = i;
        return i;
    }

    public static /* synthetic */ int access$300(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f30a4aac", new Object[]{shopGestureImageView})).intValue() : shopGestureImageView.mCurrentY;
    }

    public static /* synthetic */ int access$302(ShopGestureImageView shopGestureImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c9143df", new Object[]{shopGestureImageView, new Integer(i)})).intValue();
        }
        shopGestureImageView.mCurrentY = i;
        return i;
    }

    public static /* synthetic */ RectF access$400(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("63647dcf", new Object[]{shopGestureImageView}) : shopGestureImageView.getMatrixRectF();
    }

    public static /* synthetic */ OverScroller access$500(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OverScroller) ipChange.ipc$dispatch("f59a54af", new Object[]{shopGestureImageView}) : shopGestureImageView.scroller;
    }

    public static /* synthetic */ ValueAnimator access$600(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("8b8a0dba", new Object[]{shopGestureImageView}) : shopGestureImageView.translationAnimation;
    }

    public static /* synthetic */ ValueAnimator access$602(ShopGestureImageView shopGestureImageView, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("5f138484", new Object[]{shopGestureImageView, valueAnimator});
        }
        shopGestureImageView.translationAnimation = valueAnimator;
        return valueAnimator;
    }

    public static /* synthetic */ View.OnClickListener access$700(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("e881c85e", new Object[]{shopGestureImageView}) : shopGestureImageView.onClickListener;
    }

    public static /* synthetic */ float access$800(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48cb4804", new Object[]{shopGestureImageView})).floatValue() : shopGestureImageView.getScale();
    }

    public static /* synthetic */ Matrix access$900(ShopGestureImageView shopGestureImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("c9cd3f7f", new Object[]{shopGestureImageView}) : shopGestureImageView.mScaleMatrix;
    }

    public ShopGestureImageView(Context context) {
        this(context, null);
    }

    public ShopGestureImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShopGestureImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsOneLoad = true;
        this.isEnlarge = false;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.scroller = new OverScroller(context);
        this.mScaleMatrix = new Matrix();
        this.mScaleGestureDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.ShopGestureImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                ShopGestureImageView.this.scale(scaleGestureDetector);
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                } else {
                    ShopGestureImageView.this.scaleEnd(scaleGestureDetector);
                }
            }
        });
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.ShopGestureImageView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -223117518) {
                    return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
                }
                ShopGestureImageView.access$000(ShopGestureImageView.this, -f, -f2);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                ShopGestureImageView.access$100(ShopGestureImageView.this, motionEvent.getX(), motionEvent.getY());
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
                }
                ShopGestureImageView.access$202(ShopGestureImageView.this, (int) motionEvent2.getX());
                ShopGestureImageView.access$302(ShopGestureImageView.this, (int) motionEvent2.getY());
                RectF access$400 = ShopGestureImageView.access$400(ShopGestureImageView.this);
                if (access$400 == null) {
                    return false;
                }
                int access$200 = ShopGestureImageView.access$200(ShopGestureImageView.this);
                int access$300 = ShopGestureImageView.access$300(ShopGestureImageView.this);
                int round = Math.round(f);
                int round2 = Math.round(f2);
                int round3 = Math.round(access$400.width());
                int round4 = Math.round(access$400.height());
                if (access$200 != round3 || access$300 != round4) {
                    ShopGestureImageView.access$500(ShopGestureImageView.this).fling(access$200, access$300, round, round2, 0, round3, 0, round4, round3, round4);
                }
                if (ShopGestureImageView.access$600(ShopGestureImageView.this) != null && ShopGestureImageView.access$600(ShopGestureImageView.this).isStarted()) {
                    ShopGestureImageView.access$600(ShopGestureImageView.this).end();
                }
                ShopGestureImageView.access$602(ShopGestureImageView.this, ObjectAnimator.ofFloat(0.0f, 1.0f));
                ShopGestureImageView.access$600(ShopGestureImageView.this).setDuration(500L);
                ShopGestureImageView.access$600(ShopGestureImageView.this).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.ShopGestureImageView.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        } else if (!ShopGestureImageView.access$500(ShopGestureImageView.this).computeScrollOffset()) {
                        } else {
                            int currX = ShopGestureImageView.access$500(ShopGestureImageView.this).getCurrX();
                            int access$2002 = currX - ShopGestureImageView.access$200(ShopGestureImageView.this);
                            ShopGestureImageView.access$202(ShopGestureImageView.this, currX);
                            int currY = ShopGestureImageView.access$500(ShopGestureImageView.this).getCurrY();
                            int access$3002 = currY - ShopGestureImageView.access$300(ShopGestureImageView.this);
                            ShopGestureImageView.access$302(ShopGestureImageView.this, currY);
                            if (access$2002 == 0 || access$3002 == 0) {
                                return;
                            }
                            ShopGestureImageView.access$000(ShopGestureImageView.this, access$2002, access$3002);
                        }
                    }
                });
                ShopGestureImageView.access$600(ShopGestureImageView.this).start();
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                }
                if (ShopGestureImageView.access$700(ShopGestureImageView.this) != null) {
                    ShopGestureImageView.access$700(ShopGestureImageView.this).onClick(ShopGestureImageView.this);
                }
                return true;
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.onClickListener = onClickListener;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
        } else if (!this.mIsOneLoad) {
        } else {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable == null) {
                return;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = 1.0f;
            if (intrinsicWidth > width && intrinsicHeight <= height) {
                f = width / intrinsicWidth;
            }
            if (intrinsicWidth <= width && intrinsicHeight > height) {
                f = height / intrinsicHeight;
            }
            if ((intrinsicWidth <= width && intrinsicHeight <= height) || (intrinsicWidth >= width && intrinsicHeight >= height)) {
                f = Math.min(width / intrinsicWidth, height / intrinsicHeight);
            }
            this.mInitScale = f;
            float f2 = this.mInitScale;
            this.mMidScale = f2 * 2.0f;
            this.mMaxScale = f2 * 4.0f;
            float f3 = width / 2.0f;
            float f4 = height / 2.0f;
            this.mScaleMatrix.postTranslate(f3 - (intrinsicWidth / 2), f4 - (intrinsicHeight / 2));
            Matrix matrix = this.mScaleMatrix;
            float f5 = this.mInitScale;
            matrix.postScale(f5, f5, f3, f4);
            setImageMatrix(this.mScaleMatrix);
            this.mIsOneLoad = false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : this.gestureDetector.onTouchEvent(motionEvent) | this.mScaleGestureDetector.onTouchEvent(motionEvent);
    }

    public void scale(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a48581", new Object[]{this, scaleGestureDetector});
        } else if (getDrawable() == null) {
        } else {
            getScale();
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            this.mScaleMatrix.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            setImageMatrix(this.mScaleMatrix);
            removeBorderAndTranslationCenter();
        }
    }

    public void scaleEnd(ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c5bdba", new Object[]{this, scaleGestureDetector});
            return;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() * getScale();
        float f = this.mInitScale;
        if (scaleFactor < f) {
            scaleAnimation(f, getWidth() / 2, getHeight() / 2);
            return;
        }
        float f2 = this.mMaxScale;
        if (scaleFactor <= f2) {
            return;
        }
        scaleAnimation(f2, getWidth() / 2, getHeight() / 2);
    }

    private void onTranslationImage(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2fb530", new Object[]{this, new Float(f), new Float(f2)});
        } else if (getDrawable() == null) {
        } else {
            RectF matrixRectF = getMatrixRectF();
            if (matrixRectF.width() <= getWidth()) {
                f = 0.0f;
            }
            if (matrixRectF.height() <= getHeight()) {
                f2 = 0.0f;
            }
            if (f == 0.0f && f2 == 0.0f) {
                return;
            }
            this.mScaleMatrix.postTranslate(f, f2);
            setImageMatrix(this.mScaleMatrix);
            removeBorderAndTranslationCenter();
        }
    }

    private void removeBorderAndTranslationCenter() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0d046", new Object[]{this});
            return;
        }
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float width2 = matrixRectF.width();
        float height2 = matrixRectF.height();
        float f3 = matrixRectF.left;
        float f4 = matrixRectF.right;
        float f5 = matrixRectF.top;
        float f6 = matrixRectF.bottom;
        float f7 = 0.0f;
        if (f3 > 0.0f) {
            f = width;
            if (width2 > f) {
                f2 = -f3;
            }
            f2 = (f / 2.0f) - ((width2 / 2.0f) + f3);
        } else {
            f = width;
            if (f4 < f) {
                if (width2 > f) {
                    f2 = f - f4;
                }
                f2 = (f / 2.0f) - ((width2 / 2.0f) + f3);
            } else {
                f2 = 0.0f;
            }
        }
        if (f5 > 0.0f) {
            float f8 = height;
            f7 = height2 > f8 ? -f5 : (f8 / 2.0f) - (f5 + (height2 / 2.0f));
        } else {
            float f9 = height;
            if (f6 < f9) {
                f7 = height2 > f9 ? f9 - f6 : (f9 / 2.0f) - (f5 + (height2 / 2.0f));
            }
        }
        this.mScaleMatrix.postTranslate(f2, f7);
        setImageMatrix(this.mScaleMatrix);
    }

    private void onDoubledrawScale(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9687641d", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        scaleAnimation(getDoubledrawScale(), f, f2);
    }

    private void scaleAnimation(float f, final float f2, final float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4896eb3f", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        this.mAnimator = ObjectAnimator.ofFloat(getScale(), f);
        this.mAnimator.setDuration(300L);
        this.mAnimator.setInterpolator(new AccelerateInterpolator());
        this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.ShopGestureImageView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue() / ShopGestureImageView.access$800(ShopGestureImageView.this);
                ShopGestureImageView.access$900(ShopGestureImageView.this).postScale(floatValue, floatValue, f2, f3);
                ShopGestureImageView shopGestureImageView = ShopGestureImageView.this;
                shopGestureImageView.setImageMatrix(ShopGestureImageView.access$900(shopGestureImageView));
                ShopGestureImageView.access$1000(ShopGestureImageView.this);
            }
        });
        this.mAnimator.start();
    }

    private float getDoubledrawScale() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf105476", new Object[]{this})).floatValue();
        }
        float scale = getScale();
        if (Math.abs(this.mInitScale - scale) < 0.05f) {
            scale = this.mInitScale;
        }
        if (Math.abs(this.mMidScale - scale) < 0.05f) {
            scale = this.mMidScale;
        }
        if (Math.abs(this.mMaxScale - scale) < 0.05f) {
            scale = this.mMaxScale;
        }
        float f = this.mMidScale;
        if (scale != f) {
            if (scale < f) {
                z = true;
            }
            this.isEnlarge = z;
            return f;
        } else if (this.isEnlarge) {
            return this.mMaxScale;
        } else {
            return this.mInitScale;
        }
    }

    private RectF getMatrixRectF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b4852fb5", new Object[]{this});
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        getImageMatrix().mapRect(rectF);
        return rectF;
    }

    private float getScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
        }
        float[] fArr = new float[9];
        this.mScaleMatrix.getValues(fArr);
        return fArr[0];
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF != null && !matrixRectF.isEmpty()) {
            if (i > 0) {
                return matrixRectF.right >= ((float) (getWidth() + 1));
            } else if (matrixRectF.left <= -1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RectF matrixRectF = getMatrixRectF();
        if (matrixRectF != null && !matrixRectF.isEmpty()) {
            if (i > 0) {
                return matrixRectF.bottom >= ((float) (getHeight() + 1));
            } else if (matrixRectF.top <= -1.0f) {
                return true;
            }
        }
        return false;
    }
}
