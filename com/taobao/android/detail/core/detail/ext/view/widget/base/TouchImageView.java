package com.taobao.android.detail.core.detail.ext.view.widget.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import tb.dyu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class TouchImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLICK = 10;
    public static final long DOUBLE_PRESS_INTERVAL = 600;
    public static final int DRAG = 1;
    public static final float FRICTION = 1.0f;
    public static final long LONG_PRESS_MAX_MOVED_DISTANCE = 50;
    public static final int NONE = 0;
    public static final int ZOOM = 2;
    public boolean allowInert;
    public float bmHeight;
    public float bmWidth;
    public float bottom;
    public float height;
    public PointF last;
    public PointF lastDelta;
    public long lastDragTime;
    public long lastPressTime;
    public float[] m;
    private Timer mClickTimer;
    private Context mContext;
    private int mDownPointCount;
    private PointF mDragDistance;
    private boolean mHasPerformedLongPress;
    public boolean mIsActionMoving;
    private View.OnClickListener mOnClickListener;
    private View.OnLongClickListener mOnSinglePointLongClickListener;
    private a mPendingCheckForLongPress;
    private Object mScaleDetector;
    private Handler mTimerHandler;
    public Matrix matrix;
    public float matrixX;
    public float matrixY;
    public float maxScale;
    public PointF mid;
    public float minScale;
    public int mode;
    public float oldDist;
    public boolean onBottomSide;
    public boolean onLeftSide;
    public boolean onRightSide;
    public boolean onTopSide;
    public float origHeight;
    public float origWidth;
    public float redundantXSpace;
    public float redundantYSpace;
    public float right;
    public float saveScale;
    public Matrix savedMatrix;
    public PointF start;
    public float velocity;
    public float width;
    private boolean zoomToOriginalSize;

    static {
        kge.a(-1820031689);
    }

    public static /* synthetic */ Object ipc$super(TouchImageView touchImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -303694881:
                super.setImageBitmap((Bitmap) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2010225293:
                super.setClickable(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ Object access$100(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("68719b40", new Object[]{touchImageView}) : touchImageView.mScaleDetector;
    }

    public static /* synthetic */ void access$1000(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9194384", new Object[]{touchImageView});
        } else {
            touchImageView.calcPadding();
        }
    }

    public static /* synthetic */ void access$1100(TouchImageView touchImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe2c8e3", new Object[]{touchImageView, new Float(f), new Float(f2)});
        } else {
            touchImageView.checkAndSetTranslate(f, f2);
        }
    }

    public static /* synthetic */ Handler access$1200(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("17beabc4", new Object[]{touchImageView}) : touchImageView.mTimerHandler;
    }

    public static /* synthetic */ void access$1300(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452d81e1", new Object[]{touchImageView});
        } else {
            touchImageView.scaleMatrixToBounds();
        }
    }

    public static /* synthetic */ double access$1400(TouchImageView touchImageView, PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("faae99ce", new Object[]{touchImageView, pointF, pointF2})).doubleValue() : touchImageView.distanceBetween(pointF, pointF2);
    }

    public static /* synthetic */ PointF access$1500(TouchImageView touchImageView, dyu dyuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("548f246", new Object[]{touchImageView, dyuVar}) : touchImageView.midPointF(dyuVar);
    }

    public static /* synthetic */ void access$1600(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d141c03e", new Object[]{touchImageView});
        } else {
            touchImageView.checkSiding();
        }
    }

    public static /* synthetic */ View.OnClickListener access$1800(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("f4bf28e5", new Object[]{touchImageView}) : touchImageView.mOnClickListener;
    }

    public static /* synthetic */ int access$1900(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5d55fe8e", new Object[]{touchImageView})).intValue() : touchImageView.getWindowAttachCount();
    }

    public static /* synthetic */ void access$200(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccdd051", new Object[]{touchImageView});
        } else {
            touchImageView.fillMatrixXY();
        }
    }

    public static /* synthetic */ View.OnLongClickListener access$2000(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("441298a", new Object[]{touchImageView}) : touchImageView.mOnSinglePointLongClickListener;
    }

    public static /* synthetic */ int access$2100(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f468757", new Object[]{touchImageView})).intValue() : touchImageView.getWindowAttachCount();
    }

    public static /* synthetic */ boolean access$300(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b7f3a74", new Object[]{touchImageView})).booleanValue() : touchImageView.mHasPerformedLongPress;
    }

    public static /* synthetic */ boolean access$302(TouchImageView touchImageView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e55b726a", new Object[]{touchImageView, new Boolean(z)})).booleanValue();
        }
        touchImageView.mHasPerformedLongPress = z;
        return z;
    }

    public static /* synthetic */ PointF access$400(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("c7a5fbc6", new Object[]{touchImageView}) : touchImageView.mDragDistance;
    }

    public static /* synthetic */ int access$500(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8e20ea1", new Object[]{touchImageView})).intValue() : touchImageView.mDownPointCount;
    }

    public static /* synthetic */ int access$502(TouchImageView touchImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3452e60a", new Object[]{touchImageView, new Integer(i)})).intValue();
        }
        touchImageView.mDownPointCount = i;
        return i;
    }

    public static /* synthetic */ void access$600(TouchImageView touchImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adc13d6", new Object[]{touchImageView, new Integer(i)});
        } else {
            touchImageView.checkForLongClick(i);
        }
    }

    public static /* synthetic */ float access$700(TouchImageView touchImageView, dyu dyuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d648acc", new Object[]{touchImageView, dyuVar})).floatValue() : touchImageView.spacing(dyuVar);
    }

    public static /* synthetic */ void access$800(TouchImageView touchImageView, PointF pointF, dyu dyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ce0a8c", new Object[]{touchImageView, pointF, dyuVar});
        } else {
            touchImageView.midPoint(pointF, dyuVar);
        }
    }

    public static /* synthetic */ Timer access$900(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timer) ipChange.ipc$dispatch("bd107316", new Object[]{touchImageView}) : touchImageView.mClickTimer;
    }

    public static /* synthetic */ Timer access$902(TouchImageView touchImageView, Timer timer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("535c14c0", new Object[]{touchImageView, timer});
        }
        touchImageView.mClickTimer = timer;
        return timer;
    }

    public boolean isZoomToOriginalSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9bfed495", new Object[]{this})).booleanValue() : this.zoomToOriginalSize;
    }

    public void setZoomToOriginalSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bd222b", new Object[]{this, new Boolean(z)});
        } else {
            this.zoomToOriginalSize = z;
        }
    }

    public boolean isActionMoving() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7802a1f9", new Object[]{this})).booleanValue() : this.mIsActionMoving;
    }

    public boolean isZoomState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3188ff", new Object[]{this})).booleanValue() : this.mode == 2;
    }

    public TouchImageView(Context context) {
        super(context);
        this.matrix = new Matrix();
        this.savedMatrix = new Matrix();
        this.mode = 0;
        this.last = new PointF();
        this.mid = new PointF();
        this.start = new PointF();
        this.saveScale = 1.0f;
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.oldDist = 1.0f;
        this.lastDelta = new PointF(0.0f, 0.0f);
        this.velocity = 0.0f;
        this.lastPressTime = 0L;
        this.lastDragTime = 0L;
        this.allowInert = false;
        this.mIsActionMoving = false;
        this.mTimerHandler = null;
        this.zoomToOriginalSize = false;
        this.mHasPerformedLongPress = false;
        this.mDownPointCount = 0;
        this.mDragDistance = new PointF();
        this.onLeftSide = false;
        this.onTopSide = false;
        this.onRightSide = false;
        this.onBottomSide = false;
        super.setClickable(true);
        this.mContext = context;
        init();
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue() : this.mode;
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.matrix = new Matrix();
        this.savedMatrix = new Matrix();
        this.mode = 0;
        this.last = new PointF();
        this.mid = new PointF();
        this.start = new PointF();
        this.saveScale = 1.0f;
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.oldDist = 1.0f;
        this.lastDelta = new PointF(0.0f, 0.0f);
        this.velocity = 0.0f;
        this.lastPressTime = 0L;
        this.lastDragTime = 0L;
        this.allowInert = false;
        this.mIsActionMoving = false;
        this.mTimerHandler = null;
        this.zoomToOriginalSize = false;
        this.mHasPerformedLongPress = false;
        this.mDownPointCount = 0;
        this.mDragDistance = new PointF();
        this.onLeftSide = false;
        this.onTopSide = false;
        this.onRightSide = false;
        this.onBottomSide = false;
        super.setClickable(true);
        this.mContext = context;
        init();
    }

    private void checkForLongClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da77771", new Object[]{this, new Integer(i)});
            return;
        }
        this.mHasPerformedLongPress = false;
        if (this.mPendingCheckForLongPress == null) {
            this.mPendingCheckForLongPress = new a();
        }
        this.mPendingCheckForLongPress.a();
        postDelayed(this.mPendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - i);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        emu.a("com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView");
        this.mTimerHandler = new d(this);
        this.matrix.setTranslate(1.0f, 1.0f);
        this.m = new float[9];
        setImageMatrix(this.matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        if (Build.VERSION.SDK_INT >= 8) {
            this.mScaleDetector = new ScaleGestureDetector(this.mContext, new b());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:60:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0241  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0267  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
                /*
                    Method dump skipped, instructions count: 982
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.AnonymousClass1.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
    }

    public void resetScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a356442", new Object[]{this});
            return;
        }
        fillMatrixXY();
        Matrix matrix = this.matrix;
        float f = this.minScale;
        float f2 = this.saveScale;
        matrix.postScale(f / f2, f / f2, this.width / 2.0f, this.height / 2.0f);
        this.saveScale = this.minScale;
        calcPadding();
        checkAndSetTranslate(0.0f, 0.0f);
        scaleMatrixToBounds();
        setImageMatrix(this.matrix);
        invalidate();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Timer timer = this.mClickTimer;
        if (timer != null) {
            timer.cancel();
        }
        setOnLongClickListener(null);
        setOnClickListener(null);
        setOnTouchListener(null);
    }

    public boolean pagerCanScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25c749c5", new Object[]{this})).booleanValue() : (this.mode != 2 || !canScrollHorizontally(10) || !canScrollHorizontally(-10)) && this.saveScale == this.minScale;
    }

    public boolean isScaled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f442e4af", new Object[]{this})).booleanValue() : Math.round(getImageWidth()) != Math.round(this.origWidth);
    }

    private float getImageWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7f3f918", new Object[]{this})).floatValue() : Math.round(this.width * this.saveScale);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.matrix.getValues(this.m);
        float f = this.m[2];
        if (getImageWidth() < this.width) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        return (Math.abs(f) + this.width) + 1.0f < getImageWidth() || i <= 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        try {
            drawable = getDrawable();
        } catch (Exception e) {
            i.a("TouchImageView", "onDraw() : Canvas trying to use a recycled bitmap", e);
        }
        if (drawable == null) {
            return;
        }
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap().isRecycled()) {
            return;
        }
        super.onDraw(canvas);
        if (!this.allowInert) {
            return;
        }
        float f = this.lastDelta.x * this.velocity;
        float f2 = this.lastDelta.y;
        float f3 = this.velocity;
        float f4 = f2 * f3;
        if (f > this.width || f4 > this.height) {
            return;
        }
        this.velocity = f3;
        if (Math.abs(f) < 0.1d && Math.abs(f4) < 0.1d) {
            return;
        }
        checkAndSetTranslate(f, f4);
        setImageMatrix(this.matrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkAndSetTranslate(float r6, float r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L22
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r6)
            r1[r2] = r3
            r6 = 2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r7)
            r1[r6] = r2
            java.lang.String r6 = "b7c78ee2"
            r0.ipc$dispatch(r6, r1)
            return
        L22:
            float r0 = r5.origWidth
            float r1 = r5.saveScale
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r1 = r5.origHeight
            float r2 = r5.saveScale
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r5.fillMatrixXY()
            float r2 = r5.width
            r3 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L59
            float r6 = r5.matrixY
            float r0 = r6 + r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4c
        L4a:
            float r7 = -r6
            goto L57
        L4c:
            float r0 = r6 + r7
            float r1 = r5.bottom
            float r2 = -r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L57
            float r6 = r6 + r1
            goto L4a
        L57:
            r6 = 0
            goto La0
        L59:
            float r0 = r5.height
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L76
            float r7 = r5.matrixX
            float r0 = r7 + r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L69
        L67:
            float r6 = -r7
            goto L74
        L69:
            float r0 = r7 + r6
            float r1 = r5.right
            float r2 = -r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L74
            float r7 = r7 + r1
            goto L67
        L74:
            r7 = 0
            goto La0
        L76:
            float r0 = r5.matrixX
            float r1 = r0 + r6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L80
        L7e:
            float r6 = -r0
            goto L8b
        L80:
            float r1 = r0 + r6
            float r2 = r5.right
            float r4 = -r2
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L8b
            float r0 = r0 + r2
            goto L7e
        L8b:
            float r0 = r5.matrixY
            float r1 = r0 + r7
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L95
        L93:
            float r7 = -r0
            goto La0
        L95:
            float r1 = r0 + r7
            float r2 = r5.bottom
            float r3 = -r2
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto La0
            float r0 = r0 + r2
            goto L93
        La0:
            android.graphics.Matrix r0 = r5.matrix
            r0.postTranslate(r6, r7)
            r5.checkSiding()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.checkAndSetTranslate(float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (((-r6.matrixX) + r0) <= r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkSiding() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.String r2 = "dcaa5203"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            r6.fillMatrixXY()
            float r0 = r6.origWidth
            float r1 = r6.saveScale
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r1 = r6.origHeight
            float r4 = r6.saveScale
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r6.onBottomSide = r2
            r6.onTopSide = r2
            r6.onRightSide = r2
            r6.onLeftSide = r2
            float r2 = r6.matrixX
            float r2 = -r2
            r4 = 1092616192(0x41200000, float:10.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L3e
            r6.onLeftSide = r3
        L3e:
            float r2 = r6.width
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L4c
            float r5 = r6.matrixX
            float r5 = r5 + r0
            float r5 = r5 - r2
            int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 < 0) goto L5a
        L4c:
            float r2 = r6.width
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L5c
            float r5 = r6.matrixX
            float r5 = -r5
            float r5 = r5 + r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L5c
        L5a:
            r6.onRightSide = r3
        L5c:
            float r0 = r6.matrixY
            float r0 = -r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L65
            r6.onTopSide = r3
        L65:
            float r0 = r6.matrixY
            float r0 = -r0
            float r2 = r6.height
            float r0 = r0 + r2
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L76
            r6.onBottomSide = r3
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.checkSiding():void");
    }

    private void calcPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7be2683", new Object[]{this});
            return;
        }
        float f = this.width;
        float f2 = this.saveScale;
        this.right = ((f * f2) - f) - ((this.redundantXSpace * 2.0f) * f2);
        float f3 = this.height;
        this.bottom = ((f3 * f2) - f3) - ((this.redundantYSpace * 2.0f) * f2);
    }

    private void fillMatrixXY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1939472c", new Object[]{this});
            return;
        }
        this.matrix.getValues(this.m);
        float[] fArr = this.m;
        this.matrixX = fArr[2];
        this.matrixY = fArr[5];
    }

    private void scaleMatrixToBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d67ee2", new Object[]{this});
            return;
        }
        if (Math.abs(this.matrixX + (this.right / 2.0f)) > 0.5f) {
            this.matrix.postTranslate(-(this.matrixX + (this.right / 2.0f)), 0.0f);
        }
        if (Math.abs(this.matrixY + (this.bottom / 2.0f)) <= 0.5f) {
            return;
        }
        this.matrix.postTranslate(0.0f, -(this.matrixY + (this.bottom / 2.0f)));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede5fbdf", new Object[]{this, bitmap});
            return;
        }
        super.setImageBitmap(bitmap);
        this.bmWidth = bitmap.getWidth();
        this.bmHeight = bitmap.getHeight();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        if (drawable == null) {
            return;
        }
        this.bmWidth = drawable.getIntrinsicWidth();
        this.bmHeight = drawable.getIntrinsicHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.width = View.MeasureSpec.getSize(i);
        this.height = View.MeasureSpec.getSize(i2);
        float f = this.bmWidth;
        float f2 = f > 0.0f ? this.width / f : 1.0f;
        float f3 = this.bmHeight;
        float min = Math.min(f2, f3 > 0.0f ? this.height / f3 : 1.0f);
        this.matrix.setScale(min, min);
        setImageMatrix(this.matrix);
        this.saveScale = 1.0f;
        this.redundantYSpace = this.height - (this.bmHeight * min);
        this.redundantXSpace = this.width - (min * this.bmWidth);
        this.redundantYSpace /= 2.0f;
        this.redundantXSpace /= 2.0f;
        this.matrix.postTranslate(this.redundantXSpace, this.redundantYSpace);
        this.origWidth = this.width - (this.redundantXSpace * 2.0f);
        this.origHeight = this.height - (this.redundantYSpace * 2.0f);
        calcPadding();
        setImageMatrix(this.matrix);
    }

    private double distanceBetween(PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4eb310a8", new Object[]{this, pointF, pointF2})).doubleValue() : Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    private float spacing(dyu dyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9498f92a", new Object[]{this, dyuVar})).floatValue();
        }
        float a2 = dyuVar.a(0) - dyuVar.a(1);
        float b2 = dyuVar.b(0) - dyuVar.b(1);
        return (float) Math.sqrt((a2 * a2) + (b2 * b2));
    }

    private void midPoint(PointF pointF, dyu dyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58423f68", new Object[]{this, pointF, dyuVar});
        } else {
            pointF.set((dyuVar.a(0) + dyuVar.a(1)) / 2.0f, (dyuVar.b(0) + dyuVar.b(1)) / 2.0f);
        }
    }

    private PointF midPointF(dyu dyuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("254be2cc", new Object[]{this, dyuVar}) : new PointF((dyuVar.a(0) + dyuVar.a(1)) / 2.0f, (dyuVar.b(0) + dyuVar.b(1)) / 2.0f);
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

    /* loaded from: classes4.dex */
    public static class c extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Handler> f9475a;

        static {
            kge.a(1401167090);
        }

        public c(Handler handler) {
            this.f9475a = new WeakReference<>(handler);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Handler handler = this.f9475a.get();
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessage(10);
        }
    }

    /* loaded from: classes4.dex */
    public class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-957060271);
        }

        private b() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            TouchImageView.this.mode = 2;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onScale(android.view.ScaleGestureDetector r10) {
            /*
                Method dump skipped, instructions count: 468
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.b.onScale(android.view.ScaleGestureDetector):boolean");
        }
    }

    /* loaded from: classes4.dex */
    public static class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TouchImageView> f9476a;

        static {
            kge.a(-1985044560);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(d dVar, TouchImageView touchImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c5d9368", new Object[]{dVar, touchImageView});
            } else {
                dVar.a(touchImageView);
            }
        }

        public d(TouchImageView touchImageView) {
            this.f9476a = new WeakReference<>(touchImageView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            final TouchImageView touchImageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 10 || (touchImageView = this.f9476a.get()) == null) {
            } else {
                if (getLooper() == Looper.getMainLooper()) {
                    a(touchImageView);
                } else {
                    touchImageView.post(new Runnable() { // from class: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.d.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                d.a(d.this, touchImageView);
                            }
                        }
                    });
                }
            }
        }

        private void a(TouchImageView touchImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("529fce82", new Object[]{this, touchImageView});
                return;
            }
            touchImageView.performClick();
            if (TouchImageView.access$1800(touchImageView) == null) {
                return;
            }
            TouchImageView.access$1800(touchImageView).onClick(touchImageView);
        }
    }

    public void setOnSinglePointLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab195d5", new Object[]{this, onLongClickListener});
        } else {
            this.mOnSinglePointLongClickListener = onLongClickListener;
        }
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        static {
            kge.a(-1058095303);
            kge.a(-1390502639);
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TouchImageView.this.isPressed() || TouchImageView.this.getParent() == null || this.b != TouchImageView.access$1900(TouchImageView.this)) {
            } else {
                TouchImageView.access$302(TouchImageView.this, true);
                if (TouchImageView.access$2000(TouchImageView.this) == null || TouchImageView.access$500(TouchImageView.this) != 1 || TouchImageView.access$400(TouchImageView.this).x >= 50.0f || TouchImageView.access$400(TouchImageView.this).y >= 50.0f) {
                    return;
                }
                TouchImageView.access$2000(TouchImageView.this).onLongClick(TouchImageView.this);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b = TouchImageView.access$2100(TouchImageView.this);
            }
        }
    }
}
