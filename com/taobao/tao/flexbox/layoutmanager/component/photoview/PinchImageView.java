package com.taobao.tao.flexbox.layoutmanager.component.photoview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.AbsPinchImageView;
import com.taobao.tao.flexbox.layoutmanager.component.photoview.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class PinchImageView extends AbsPinchImageView implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float FLING_DAMPING_FACTOR = 0.9f;
    private static final Matrix IDENTITY_M;
    public static final int MODE_CROP_CENTER = 1;
    public static final int MODE_FIT_CENTER = 0;
    public static final int PINCH_MODE_FREE = 0;
    public static final int PINCH_MODE_SCALE = 2;
    public static final int PINCH_MODE_SCROLL = 1;
    public static final int SCALE_ANIMATOR_DURATION = 200;
    private float cornerRadius;
    private int mDispatchOuterMatrixChangedLock;
    private int mFitMode;
    private a mFlingAnimator;
    private GestureDetector mGestureDetector;
    private ImageView.ScaleType mInitScaleType;
    private PointF mLastMovePoint;
    private RectF mMask;
    private b mMaskAnimator;
    private float mMaxScale;
    private View.OnClickListener mOnClickListener;
    private View.OnClickListener mOnDoubleClickListener;
    private View.OnLongClickListener mOnLongClickListener;
    private View.OnTouchListener mOnTouchListener;
    private Matrix mOuterMatrix;
    private List<Object> mOuterMatrixChangedListeners;
    private List<Object> mOuterMatrixChangedListenersCopy;
    private Paint mPaint;
    private Path mPath;
    private int mPinchMode;
    private RectF mRectF;
    private h mScaleAnimator;
    private float mScaleBase;
    private PointF mScaleCenter;
    public final float[] mTempMatrix;
    private boolean mTouchable;
    private j mZoomListener;

    /* loaded from: classes8.dex */
    public class b extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PinchImageView f20179a;
        private float[] b;
        private float[] c;
        private float[] d;

        static {
            kge.a(1507725470);
            kge.a(1499308443);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < 4; i++) {
                float[] fArr = this.d;
                float[] fArr2 = this.b;
                fArr[i] = fArr2[i] + ((this.c[i] - fArr2[i]) * floatValue);
            }
            if (PinchImageView.access$000(this.f20179a) == null) {
                PinchImageView.access$002(this.f20179a, new RectF());
            }
            RectF access$000 = PinchImageView.access$000(this.f20179a);
            float[] fArr3 = this.d;
            access$000.set(fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
            this.f20179a.invalidate();
        }
    }

    /* loaded from: classes8.dex */
    interface j {
        void a();

        void a(float f);
    }

    public static /* synthetic */ Object ipc$super(PinchImageView pinchImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2009938103:
                super.setOnTouchListener((View.OnTouchListener) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 120759747:
                super.setScaleType((ImageView.ScaleType) objArr[0]);
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ RectF access$000(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("62522ff6", new Object[]{pinchImageView}) : pinchImageView.mMask;
    }

    public static /* synthetic */ RectF access$002(PinchImageView pinchImageView, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("fdc8a1c7", new Object[]{pinchImageView, rectF});
        }
        pinchImageView.mMask = rectF;
        return rectF;
    }

    public static /* synthetic */ int access$100(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4890423", new Object[]{pinchImageView})).intValue() : pinchImageView.mPinchMode;
    }

    public static /* synthetic */ Matrix access$1000(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("be24228e", new Object[]{pinchImageView}) : pinchImageView.mOuterMatrix;
    }

    public static /* synthetic */ void access$1100(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635473e1", new Object[]{pinchImageView});
        } else {
            pinchImageView.dispatchOuterMatrixChanged();
        }
    }

    public static /* synthetic */ h access$200(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("8a1240e3", new Object[]{pinchImageView}) : pinchImageView.mScaleAnimator;
    }

    public static /* synthetic */ void access$300(PinchImageView pinchImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c8846e", new Object[]{pinchImageView, new Float(f), new Float(f2)});
        } else {
            pinchImageView.fling(f, f2);
        }
    }

    public static /* synthetic */ boolean access$400(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e6335d1", new Object[]{pinchImageView})).booleanValue() : pinchImageView.isSwapping();
    }

    public static /* synthetic */ View.OnLongClickListener access$500(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("8057a2b1", new Object[]{pinchImageView}) : pinchImageView.mOnLongClickListener;
    }

    public static /* synthetic */ void access$600(PinchImageView pinchImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcc2cb", new Object[]{pinchImageView, new Float(f), new Float(f2)});
        } else {
            pinchImageView.doubleTap(f, f2);
        }
    }

    public static /* synthetic */ View.OnClickListener access$700(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("e325c053", new Object[]{pinchImageView}) : pinchImageView.mOnDoubleClickListener;
    }

    public static /* synthetic */ View.OnClickListener access$800(PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("9eceee72", new Object[]{pinchImageView}) : pinchImageView.mOnClickListener;
    }

    public static /* synthetic */ boolean access$900(PinchImageView pinchImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5bf1012c", new Object[]{pinchImageView, new Float(f), new Float(f2)})).booleanValue() : pinchImageView.scrollBy(f, f2);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8832c749", new Object[]{this, onTouchListener});
            return;
        }
        super.setOnTouchListener(onTouchListener);
        this.mOnTouchListener = onTouchListener;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.mOnClickListener = onClickListener;
        }
    }

    public void setOnDoubleClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e800a8", new Object[]{this, onClickListener});
        } else {
            this.mOnDoubleClickListener = onClickListener;
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.mOnLongClickListener = onLongClickListener;
        }
    }

    public void setZoomListener(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf5b032", new Object[]{this, jVar});
        } else {
            this.mZoomListener = jVar;
        }
    }

    public Matrix getInnerMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("23b31d60", new Object[]{this, matrix});
        }
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (isReady()) {
            RectF a2 = c.a(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
            RectF containerRect = containerRect();
            matrix.setRectToRect(a2, containerRect, Matrix.ScaleToFit.CENTER);
            c.a(containerRect);
            c.a(a2);
        }
        return matrix;
    }

    private RectF containerRect() {
        int i2;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("23959fdb", new Object[]{this});
        }
        int i6 = this.mFitMode;
        if (i6 == 0) {
            return c.a(0.0f, 0.0f, getWidth(), getHeight());
        }
        if (i6 == 1) {
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            int width = getWidth();
            int height = getHeight();
            float f = intrinsicWidth / intrinsicHeight;
            float f2 = width;
            float f3 = height;
            if (f > f2 / f3) {
                i3 = (int) (f3 * f);
                i2 = height;
            } else {
                i2 = (int) (f2 / f);
                i3 = width;
            }
            return c.a((width - i3) / 2, (height - i2) / 2, i4 + i3, i5 + i2);
        }
        return c.a(0.0f, 0.0f, getWidth(), getHeight());
    }

    public void setFitMode(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6733f80a", new Object[]{this, new Integer(i2)});
        } else {
            this.mFitMode = i2;
        }
    }

    public void setTouchable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28c7eb6", new Object[]{this, new Boolean(z)});
        } else {
            this.mTouchable = z;
        }
    }

    public Matrix getCurrentImageMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("9b235d28", new Object[]{this, matrix});
        }
        Matrix innerMatrix = getInnerMatrix(matrix);
        innerMatrix.postConcat(this.mOuterMatrix);
        return innerMatrix;
    }

    public RectF getImageBound(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("1074d256", new Object[]{this, rectF});
        }
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!isReady()) {
            return rectF;
        }
        Matrix a2 = c.a();
        getCurrentImageMatrix(a2);
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        a2.mapRect(rectF);
        c.b(a2);
        return rectF;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.mPinchMode == 2) {
            return true;
        }
        RectF imageBound = getImageBound(null);
        if (imageBound == null || imageBound.isEmpty()) {
            return false;
        }
        return i2 > 0 ? imageBound.right > ((float) getWidth()) : imageBound.left < 0.0f;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        if (this.mPinchMode == 2) {
            return true;
        }
        RectF imageBound = getImageBound(null);
        if (imageBound == null || imageBound.isEmpty()) {
            return false;
        }
        return i2 > 0 ? imageBound.bottom > ((float) getHeight()) : imageBound.top < 0.0f;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mOuterMatrix.reset();
        dispatchOuterMatrixChanged();
        this.mMask = null;
        this.mPinchMode = 0;
        this.mLastMovePoint.set(0.0f, 0.0f);
        this.mScaleCenter.set(0.0f, 0.0f);
        this.mScaleBase = 0.0f;
        b bVar = this.mMaskAnimator;
        if (bVar != null) {
            bVar.cancel();
            this.mMaskAnimator = null;
        }
        cancelAllAnimator();
        invalidate();
    }

    public float getScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
        }
        this.mOuterMatrix.getValues(this.mTempMatrix);
        return this.mTempMatrix[0];
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.photoview.a.b
    public boolean canBeSwiped() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1cdc3488", new Object[]{this})).booleanValue() : getScale() <= 1.05f;
    }

    private boolean isSwapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1e7bdda", new Object[]{this})).booleanValue();
        }
        View.OnTouchListener onTouchListener = this.mOnTouchListener;
        return (onTouchListener instanceof com.taobao.tao.flexbox.layoutmanager.component.photoview.a) && ((com.taobao.tao.flexbox.layoutmanager.component.photoview.a) onTouchListener).a();
    }

    public void setTargetImageDrawable(final BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b198b582", new Object[]{this, bitmapDrawable});
            return;
        }
        Drawable drawable = getDrawable();
        if (bitmapDrawable.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            int intrinsicWidth = (bitmapDrawable.getIntrinsicWidth() * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth();
            final i iVar = new i(bitmapDrawable);
            ValueAnimator duration = ValueAnimator.ofInt(intrinsicWidth, bitmapDrawable.getIntrinsicHeight()).setDuration(150L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    iVar.a(0, (bitmapDrawable.getIntrinsicHeight() - ((Integer) valueAnimator.getAnimatedValue()).intValue()) / 2);
                    iVar.invalidateSelf();
                }
            });
            iVar.a(0, (bitmapDrawable.getIntrinsicHeight() - intrinsicWidth) / 2);
            setImageDrawable(iVar);
            duration.start();
            return;
        }
        setImageDrawable(bitmapDrawable);
    }

    /* loaded from: classes8.dex */
    public static class i extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Drawable f20183a;
        private int b;
        private int c;

        static {
            kge.a(-2090244226);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1924089730) {
                super.setBounds(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            } else if (hashCode != -1831248357) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.setBounds((Rect) objArr[0]);
                return null;
            }
        }

        public i(Drawable drawable) {
            this.f20183a = drawable;
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.b = i;
            this.c = i2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d50b87e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.setBounds(i, i2, i3, i4);
            this.f20183a.setBounds(i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92d95e1b", new Object[]{this, rect});
                return;
            }
            super.setBounds(rect);
            this.f20183a.setBounds(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue() : this.f20183a.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue() : this.f20183a.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            if (this.b > 0 || this.c > 0) {
                canvas.save();
                canvas.clipRect(0, this.c, this.f20183a.getIntrinsicWidth(), this.f20183a.getIntrinsicHeight() - this.c);
            }
            this.f20183a.draw(canvas);
            if (this.b <= 0 && this.c <= 0) {
                return;
            }
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            } else {
                this.f20183a.setAlpha(i);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            } else {
                this.f20183a.setColorFilter(colorFilter);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue() : this.f20183a.getOpacity();
        }
    }

    private void dispatchOuterMatrixChanged() {
        List<Object> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c48899", new Object[]{this});
            return;
        }
        List<Object> list2 = this.mOuterMatrixChangedListeners;
        if (list2 == null) {
            return;
        }
        this.mDispatchOuterMatrixChangedLock++;
        Iterator<Object> it = list2.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.mDispatchOuterMatrixChangedLock--;
        if (this.mDispatchOuterMatrixChangedLock != 0 || (list = this.mOuterMatrixChangedListenersCopy) == null) {
            return;
        }
        this.mOuterMatrixChangedListeners = list;
        this.mOuterMatrixChangedListenersCopy = null;
    }

    public float getMaxScale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c1bb633", new Object[]{this})).floatValue() : this.mMaxScale;
    }

    public float calculateNextScale(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f027348", new Object[]{this, new Float(f), new Float(f2)})).floatValue();
        }
        float f3 = this.mMaxScale;
        return f2 * f < f3 ? f3 : f;
    }

    public void setMaxZoom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21494a4", new Object[]{this, new Float(f)});
        } else {
            this.mMaxScale = f;
        }
    }

    public PinchImageView(Context context) {
        super(context);
        this.mMaxScale = 10.0f;
        this.mOuterMatrix = new Matrix();
        this.mPinchMode = 0;
        this.mTempMatrix = new float[9];
        this.mFitMode = 0;
        this.mTouchable = false;
        this.mLastMovePoint = new PointF();
        this.mScaleCenter = new PointF();
        this.mScaleBase = 0.0f;
        this.mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
                }
                if (PinchImageView.access$100(PinchImageView.this) == 0 && (PinchImageView.access$200(PinchImageView.this) == null || !PinchImageView.access$200(PinchImageView.this).isRunning())) {
                    PinchImageView.access$300(PinchImageView.this, f, f2);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                } else if (PinchImageView.access$400(PinchImageView.this) || PinchImageView.access$500(PinchImageView.this) == null) {
                } else {
                    PinchImageView.access$500(PinchImageView.this).onLongClick(PinchImageView.this);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                if (PinchImageView.access$100(PinchImageView.this) == 1 && (PinchImageView.access$200(PinchImageView.this) == null || !PinchImageView.access$200(PinchImageView.this).isRunning())) {
                    PinchImageView.access$600(PinchImageView.this, motionEvent.getX(), motionEvent.getY());
                }
                if (PinchImageView.access$700(PinchImageView.this) != null) {
                    PinchImageView.access$700(PinchImageView.this).onClick(PinchImageView.this);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                }
                if (PinchImageView.access$400(PinchImageView.this)) {
                    return false;
                }
                if (PinchImageView.access$800(PinchImageView.this) != null) {
                    PinchImageView.access$800(PinchImageView.this).onClick(PinchImageView.this);
                }
                return true;
            }
        });
        initView();
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxScale = 10.0f;
        this.mOuterMatrix = new Matrix();
        this.mPinchMode = 0;
        this.mTempMatrix = new float[9];
        this.mFitMode = 0;
        this.mTouchable = false;
        this.mLastMovePoint = new PointF();
        this.mScaleCenter = new PointF();
        this.mScaleBase = 0.0f;
        this.mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
                }
                if (PinchImageView.access$100(PinchImageView.this) == 0 && (PinchImageView.access$200(PinchImageView.this) == null || !PinchImageView.access$200(PinchImageView.this).isRunning())) {
                    PinchImageView.access$300(PinchImageView.this, f, f2);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                } else if (PinchImageView.access$400(PinchImageView.this) || PinchImageView.access$500(PinchImageView.this) == null) {
                } else {
                    PinchImageView.access$500(PinchImageView.this).onLongClick(PinchImageView.this);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                if (PinchImageView.access$100(PinchImageView.this) == 1 && (PinchImageView.access$200(PinchImageView.this) == null || !PinchImageView.access$200(PinchImageView.this).isRunning())) {
                    PinchImageView.access$600(PinchImageView.this, motionEvent.getX(), motionEvent.getY());
                }
                if (PinchImageView.access$700(PinchImageView.this) != null) {
                    PinchImageView.access$700(PinchImageView.this).onClick(PinchImageView.this);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                }
                if (PinchImageView.access$400(PinchImageView.this)) {
                    return false;
                }
                if (PinchImageView.access$800(PinchImageView.this) != null) {
                    PinchImageView.access$800(PinchImageView.this).onClick(PinchImageView.this);
                }
                return true;
            }
        });
        initView();
    }

    public PinchImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mMaxScale = 10.0f;
        this.mOuterMatrix = new Matrix();
        this.mPinchMode = 0;
        this.mTempMatrix = new float[9];
        this.mFitMode = 0;
        this.mTouchable = false;
        this.mLastMovePoint = new PointF();
        this.mScaleCenter = new PointF();
        this.mScaleBase = 0.0f;
        this.mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
                }
                if (PinchImageView.access$100(PinchImageView.this) == 0 && (PinchImageView.access$200(PinchImageView.this) == null || !PinchImageView.access$200(PinchImageView.this).isRunning())) {
                    PinchImageView.access$300(PinchImageView.this, f, f2);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                } else if (PinchImageView.access$400(PinchImageView.this) || PinchImageView.access$500(PinchImageView.this) == null) {
                } else {
                    PinchImageView.access$500(PinchImageView.this).onLongClick(PinchImageView.this);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                if (PinchImageView.access$100(PinchImageView.this) == 1 && (PinchImageView.access$200(PinchImageView.this) == null || !PinchImageView.access$200(PinchImageView.this).isRunning())) {
                    PinchImageView.access$600(PinchImageView.this, motionEvent.getX(), motionEvent.getY());
                }
                if (PinchImageView.access$700(PinchImageView.this) != null) {
                    PinchImageView.access$700(PinchImageView.this).onClick(PinchImageView.this);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                }
                if (PinchImageView.access$400(PinchImageView.this)) {
                    return false;
                }
                if (PinchImageView.access$800(PinchImageView.this) != null) {
                    PinchImageView.access$800(PinchImageView.this).onClick(PinchImageView.this);
                }
                return true;
            }
        });
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mInitScaleType = getScaleType();
        this.mPath = new Path();
        this.mPaint = new Paint(1);
        this.mRectF = new RectF();
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else {
            super.setScaleType(scaleType);
        }
    }

    static {
        kge.a(-1126335431);
        kge.a(-117888847);
        IDENTITY_M = new Matrix();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        try {
            if (isReady()) {
                if (!IDENTITY_M.equals(this.mOuterMatrix)) {
                    setScaleType(ImageView.ScaleType.MATRIX);
                    Matrix a2 = c.a();
                    setImageMatrix(getCurrentImageMatrix(a2));
                    c.b(a2);
                } else if (this.mInitScaleType != null) {
                    setScaleType(this.mInitScaleType);
                }
            }
            if (this.mMask != null) {
                canvas.save();
                canvas.clipRect(this.mMask);
                super.onDraw(canvas);
                canvas.restore();
            } else if (this.cornerRadius > 0.0f) {
                canvas.save();
                canvas.clipPath(genPath());
                super.onDraw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } catch (Throwable th) {
            ogg.a("PinchImageView onDraw", th.getMessage());
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            if (this.cornerRadius > 0.0f) {
                canvas.save();
                canvas.clipPath(genPath());
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            ogg.a("PinchImageView dispatchDraw", th.getMessage());
        }
    }

    private Path genPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("d520a3c4", new Object[]{this});
        }
        this.mPath.reset();
        Path path = this.mPath;
        RectF rectF = this.mRectF;
        float f = this.cornerRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.mPath;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        setCornerRect();
    }

    private void setCornerRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5432e2", new Object[]{this});
        } else if (getDrawable() == null) {
        } else {
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            int width = getWidth();
            int i2 = (int) (width / (intrinsicWidth / intrinsicHeight));
            int i3 = (width - width) / 2;
            int height = (getHeight() - i2) / 2;
            this.mRectF.set(i3, height, i3 + width, height + i2);
        }
    }

    private boolean isReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue() : getDrawable() != null && getDrawable().getIntrinsicWidth() > 0 && getDrawable().getIntrinsicHeight() > 0 && getWidth() > 0 && getHeight() > 0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h hVar;
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        if (!this.mTouchable) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            if (this.mPinchMode == 2) {
                if (this.mZoomListener != null) {
                    Matrix a2 = c.a();
                    getCurrentImageMatrix(a2);
                    float f = c.c(a2)[0];
                    c.b(a2);
                    this.mZoomListener.a(f);
                }
                scaleEnd();
            }
            this.mPinchMode = 0;
        } else if (action == 6) {
            if (this.mPinchMode == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    saveScaleContext(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    saveScaleContext(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (action == 0) {
            h hVar2 = this.mScaleAnimator;
            if (hVar2 == null || !hVar2.isRunning()) {
                cancelAllAnimator();
                this.mPinchMode = 1;
                this.mLastMovePoint.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            if (this.mPinchMode != 2 && (jVar = this.mZoomListener) != null) {
                jVar.a();
            }
            cancelAllAnimator();
            this.mPinchMode = 2;
            saveScaleContext(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        } else if (action == 2 && ((hVar = this.mScaleAnimator) == null || !hVar.isRunning())) {
            int i2 = this.mPinchMode;
            if (i2 == 1) {
                scrollBy(motionEvent.getX() - this.mLastMovePoint.x, motionEvent.getY() - this.mLastMovePoint.y);
                this.mLastMovePoint.set(motionEvent.getX(), motionEvent.getY());
            } else if (i2 == 2 && motionEvent.getPointerCount() > 1) {
                float b2 = c.b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                float[] c2 = c.c(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                this.mLastMovePoint.set(c2[0], c2[1]);
                scale(this.mScaleCenter, this.mScaleBase, b2, this.mLastMovePoint);
            }
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean scrollBy(float r8, float r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L29
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r8)
            r1[r2] = r3
            r8 = 2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r9)
            r1[r8] = r2
            java.lang.String r8 = "651fd3cf"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L29:
            boolean r0 = r7.isReady()
            if (r0 != 0) goto L30
            return r3
        L30:
            android.graphics.RectF r0 = com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.c.b()
            r7.getImageBound(r0)
            int r1 = r7.getWidth()
            float r1 = (float) r1
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r5 = r0.right
            float r6 = r0.left
            float r5 = r5 - r6
            r6 = 0
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L4d
        L4b:
            r8 = 0
            goto L6f
        L4d:
            float r5 = r0.left
            float r5 = r5 + r8
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L5e
            float r8 = r0.left
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 >= 0) goto L4b
            float r8 = r0.left
            float r8 = -r8
            goto L6f
        L5e:
            float r5 = r0.right
            float r5 = r5 + r8
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L6f
            float r8 = r0.right
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L4b
            float r8 = r0.right
            float r8 = r1 - r8
        L6f:
            float r1 = r0.bottom
            float r5 = r0.top
            float r1 = r1 - r5
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L7a
        L78:
            r9 = 0
            goto L9c
        L7a:
            float r1 = r0.top
            float r1 = r1 + r9
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L8b
            float r9 = r0.top
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 >= 0) goto L78
            float r9 = r0.top
            float r9 = -r9
            goto L9c
        L8b:
            float r1 = r0.bottom
            float r1 = r1 + r9
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L9c
            float r9 = r0.bottom
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto L78
            float r9 = r0.bottom
            float r9 = r4 - r9
        L9c:
            com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.c.a(r0)
            android.graphics.Matrix r0 = r7.mOuterMatrix
            r0.postTranslate(r8, r9)
            r7.dispatchOuterMatrixChanged()
            r7.invalidate()
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto Lb4
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r3
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.scrollBy(float, float):boolean");
    }

    private void saveScaleContext(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53ef629", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.mScaleBase = c.c(this.mOuterMatrix)[0] / c.b(f, f2, f3, f4);
        float[] a2 = c.a(c.c(f, f2, f3, f4), this.mOuterMatrix);
        this.mScaleCenter.set(a2[0], a2[1]);
    }

    private void scale(PointF pointF, float f, float f2, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ecb5f1", new Object[]{this, pointF, new Float(f), new Float(f2), pointF2});
        } else if (!isReady()) {
        } else {
            float f3 = f * f2;
            Matrix a2 = c.a();
            a2.postScale(f3, f3, pointF.x, pointF.y);
            a2.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
            this.mOuterMatrix.set(a2);
            c.b(a2);
            dispatchOuterMatrixChanged();
            invalidate();
        }
    }

    private void doubleTap(float f, float f2) {
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68c0f59", new Object[]{this, new Float(f), new Float(f2)});
        } else if (!isReady()) {
        } else {
            Matrix a2 = c.a();
            getInnerMatrix(a2);
            float f4 = c.c(a2)[0];
            float f5 = c.c(this.mOuterMatrix)[0];
            float f6 = f4 * f5;
            float width = getWidth();
            float height = getHeight();
            float maxScale = getMaxScale();
            float calculateNextScale = calculateNextScale(f4, f5);
            if (calculateNextScale > maxScale) {
                calculateNextScale = maxScale;
            }
            if (calculateNextScale >= f4) {
                f4 = calculateNextScale;
            }
            Matrix a3 = c.a(this.mOuterMatrix);
            float f7 = f4 / f6;
            a3.postScale(f7, f7, f, f2);
            float f8 = width / 2.0f;
            float f9 = height / 2.0f;
            a3.postTranslate(f8 - f, f9 - f2);
            Matrix a4 = c.a(a2);
            a4.postConcat(a3);
            float f10 = 0.0f;
            RectF a5 = c.a(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
            a4.mapRect(a5);
            if (a5.right - a5.left < width) {
                f3 = f8 - ((a5.right + a5.left) / 2.0f);
            } else if (a5.left > 0.0f) {
                f3 = -a5.left;
            } else {
                f3 = a5.right < width ? width - a5.right : 0.0f;
            }
            if (a5.bottom - a5.top < height) {
                f10 = f9 - ((a5.bottom + a5.top) / 2.0f);
            } else if (a5.top > 0.0f) {
                f10 = -a5.top;
            } else if (a5.bottom < height) {
                f10 = height - a5.bottom;
            }
            a3.postTranslate(f3, f10);
            cancelAllAnimator();
            this.mScaleAnimator = new h(this, this.mOuterMatrix, a3);
            this.mScaleAnimator.start();
            c.a(a5);
            c.b(a4);
            c.b(a3);
            c.b(a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void scaleEnd() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.scaleEnd():void");
    }

    private void fling(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e630f23", new Object[]{this, new Float(f), new Float(f2)});
        } else if (!isReady()) {
        } else {
            cancelAllAnimator();
            this.mFlingAnimator = new a(f / 60.0f, f2 / 60.0f);
            this.mFlingAnimator.start();
        }
    }

    private void cancelAllAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1742ce55", new Object[]{this});
            return;
        }
        h hVar = this.mScaleAnimator;
        if (hVar != null) {
            hVar.cancel();
            this.mScaleAnimator = null;
        }
        a aVar = this.mFlingAnimator;
        if (aVar == null) {
            return;
        }
        aVar.cancel();
        this.mFlingAnimator = null;
    }

    /* loaded from: classes8.dex */
    public class a extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float[] b;

        static {
            kge.a(2126393112);
            kge.a(1499308443);
        }

        public a(float f, float f2) {
            setFloatValues(0.0f, 1.0f);
            setDuration(1000000L);
            addUpdateListener(this);
            this.b = new float[]{f, f2};
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            PinchImageView pinchImageView = PinchImageView.this;
            float[] fArr = this.b;
            boolean access$900 = PinchImageView.access$900(pinchImageView, fArr[0], fArr[1]);
            float[] fArr2 = this.b;
            fArr2[0] = fArr2[0] * 0.9f;
            fArr2[1] = fArr2[1] * 0.9f;
            if (access$900 && c.b(0.0f, 0.0f, fArr2[0], fArr2[1]) >= 1.0f) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    /* loaded from: classes8.dex */
    public class h extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float[] b;
        private float[] c;
        private float[] d;

        static {
            kge.a(-1645912826);
            kge.a(1499308443);
        }

        public h(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(matrix, matrix2, 200L);
        }

        public h(Matrix matrix, Matrix matrix2, long j) {
            this.b = new float[9];
            this.c = new float[9];
            this.d = new float[9];
            setFloatValues(0.0f, 1.0f);
            setDuration(j);
            addUpdateListener(this);
            matrix.getValues(this.b);
            matrix2.getValues(this.c);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.d;
                float[] fArr2 = this.b;
                fArr[i] = fArr2[i] + ((this.c[i] - fArr2[i]) * floatValue);
            }
            PinchImageView.access$1000(PinchImageView.this).setValues(this.d);
            PinchImageView.access$1100(PinchImageView.this);
            PinchImageView.this.invalidate();
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class e<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f20181a;
        private Queue<T> b = new LinkedList();

        static {
            kge.a(419299141);
        }

        public abstract T a(T t);

        public abstract T b();

        public e(int i) {
            this.f20181a = i;
        }

        public T c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
            }
            if (this.b.size() == 0) {
                return b();
            }
            return a(this.b.poll());
        }

        public void b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
            } else if (t == null || this.b.size() >= this.f20181a) {
            } else {
                this.b.offer(t);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class d extends e<Matrix> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1012248808);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, android.graphics.Matrix] */
        @Override // com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.e
        public /* synthetic */ Matrix b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
        }

        public d(int i) {
            super(i);
        }

        public Matrix a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("f4b42ef4", new Object[]{this}) : new Matrix();
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.e
        public Matrix a(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("ad3cc980", new Object[]{this, matrix});
            }
            matrix.reset();
            return matrix;
        }
    }

    /* loaded from: classes8.dex */
    public static class g extends e<RectF> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(221249363);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.RectF, java.lang.Object] */
        @Override // com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.e
        public /* synthetic */ RectF b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
        }

        public g(int i) {
            super(i);
        }

        public RectF a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("f7d777ff", new Object[]{this}) : new RectF();
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.photoview.PinchImageView.e
        public RectF a(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("f9c66dce", new Object[]{this, rectF});
            }
            rectF.setEmpty();
            return rectF;
        }
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static d f20180a;
        private static g b;

        static {
            kge.a(-133656642);
            f20180a = new d(16);
            b = new g(16);
        }

        public static Matrix a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("f4b42ef4", new Object[0]) : f20180a.c();
        }

        public static Matrix a(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Matrix) ipChange.ipc$dispatch("ad3cc980", new Object[]{matrix});
            }
            Matrix c = f20180a.c();
            if (matrix != null) {
                c.set(matrix);
            }
            return c;
        }

        public static void b(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6519693", new Object[]{matrix});
            } else {
                f20180a.b(matrix);
            }
        }

        public static RectF b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("e8a87f5e", new Object[0]) : b.c();
        }

        public static RectF a(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RectF) ipChange.ipc$dispatch("ebcc7bff", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            }
            RectF c = b.c();
            c.set(f, f2, f3, f4);
            return c;
        }

        public static void a(RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ec1379", new Object[]{rectF});
            } else {
                b.b(rectF);
            }
        }

        public static float b(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c105759", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)})).floatValue();
            }
            float f5 = f - f3;
            float f6 = f2 - f4;
            return (float) Math.sqrt((f5 * f5) + (f6 * f6));
        }

        public static float[] c(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("4a4407b7", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)}) : new float[]{(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        }

        public static float[] c(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("8ca04ef", new Object[]{matrix});
            }
            if (matrix != null) {
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                return new float[]{fArr[0], fArr[4]};
            }
            return new float[2];
        }

        public static float[] a(float[] fArr, Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("54448678", new Object[]{fArr, matrix});
            }
            if (fArr != null && matrix != null) {
                float[] fArr2 = new float[2];
                Matrix a2 = a();
                matrix.invert(a2);
                a2.mapPoints(fArr2, fArr);
                b(a2);
                return fArr2;
            }
            return new float[2];
        }
    }

    public float getCornerRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c34be7b4", new Object[]{this})).floatValue() : this.cornerRadius;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.animation.shareelement.AbsPinchImageView
    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else if (f == getCornerRadius()) {
        } else {
            this.cornerRadius = f;
            invalidate();
        }
    }
}
