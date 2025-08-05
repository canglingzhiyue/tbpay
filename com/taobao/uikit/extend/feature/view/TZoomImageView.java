package com.taobao.uikit.extend.feature.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class TZoomImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_SCALE_X = 5;
    private static final int MAX_SCALE_Y = 5;
    private static final int TYPE_DRAG = 1;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_ZOOM = 2;
    private float mBottom;
    private Matrix mCurMatrix;
    private boolean mFirst;
    private boolean mIgnoreUpEvent;
    private float mLeft;
    private Matrix mMatrix;
    private int mMaxHeight;
    private int mMaxWidth;
    private PointF mMidPoint;
    private Matrix mOriginalMatrix;
    private float[] mOriginalValues;
    private boolean mOverMaxScale;
    private Matrix mPreMatrix;
    private Rect mRect;
    private float mRight;
    private boolean mScaleLarge;
    private boolean mScaleSmall;
    private TZoomScroller mScroller;
    private float mStartDist;
    private PointF mStartPoint;
    private float mTop;
    private int mType;

    public static /* synthetic */ Object ipc$super(TZoomImageView tZoomImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -894236565) {
                super.computeScroll();
                return null;
            } else if (hashCode != -244855388) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public TZoomImageView(Context context) {
        super(context);
        this.mType = 0;
        this.mStartPoint = new PointF();
        this.mMidPoint = new PointF();
        this.mOriginalMatrix = new Matrix();
        this.mMatrix = new Matrix();
        this.mCurMatrix = new Matrix();
        this.mPreMatrix = new Matrix();
        this.mFirst = true;
        this.mScaleSmall = false;
        this.mScaleLarge = false;
        this.mOverMaxScale = false;
        this.mIgnoreUpEvent = false;
        this.mOriginalValues = new float[9];
        init();
    }

    public TZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mType = 0;
        this.mStartPoint = new PointF();
        this.mMidPoint = new PointF();
        this.mOriginalMatrix = new Matrix();
        this.mMatrix = new Matrix();
        this.mCurMatrix = new Matrix();
        this.mPreMatrix = new Matrix();
        this.mFirst = true;
        this.mScaleSmall = false;
        this.mScaleLarge = false;
        this.mOverMaxScale = false;
        this.mIgnoreUpEvent = false;
        this.mOriginalValues = new float[9];
        init();
    }

    public TZoomImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mType = 0;
        this.mStartPoint = new PointF();
        this.mMidPoint = new PointF();
        this.mOriginalMatrix = new Matrix();
        this.mMatrix = new Matrix();
        this.mCurMatrix = new Matrix();
        this.mPreMatrix = new Matrix();
        this.mFirst = true;
        this.mScaleSmall = false;
        this.mScaleLarge = false;
        this.mOverMaxScale = false;
        this.mIgnoreUpEvent = false;
        this.mOriginalValues = new float[9];
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mScroller = new TZoomScroller(new AccelerateDecelerateInterpolator());
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.mMaxWidth = i3 - i;
        this.mMaxHeight = i4 - i2;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.mFirst) {
        } else {
            this.mFirst = true;
            this.mMatrix = new Matrix();
            this.mPreMatrix = new Matrix();
            this.mCurMatrix = new Matrix();
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r0 != 6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.feature.view.TZoomImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private float distance(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ff7c501", new Object[]{this, motionEvent})).floatValue();
        }
        float x = motionEvent.getX(1) - motionEvent.getX(0);
        float y = motionEvent.getY(1) - motionEvent.getY(0);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    private PointF midPoint(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("c756123b", new Object[]{this, motionEvent}) : new PointF((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f, (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f);
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (!this.mScroller.computeScrollOffset()) {
            return;
        }
        this.mMatrix.getValues(r0);
        float[] fArr = {this.mScroller.getCurrZ(), 0.0f, this.mScroller.getCurrX(), 0.0f, this.mScroller.getCurrZ(), this.mScroller.getCurrY()};
        this.mMatrix.setValues(fArr);
        setImageMatrix(this.mMatrix);
        invalidate();
    }

    private void startScroll(Matrix matrix, Matrix matrix2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97bc8d6", new Object[]{this, matrix, matrix2});
        } else if (matrix == null || matrix2 == null) {
        } else {
            float[] fArr = new float[9];
            float[] fArr2 = new float[9];
            matrix.getValues(fArr);
            matrix2.getValues(fArr2);
            float f = fArr[2];
            float f2 = fArr2[2];
            float f3 = fArr[5];
            float f4 = fArr2[5];
            float f5 = fArr[0];
            this.mScroller.startScroll(f, f3, f5, f2 - f, f4 - f3, fArr2[0] - f5, 300);
            invalidate();
        }
    }
}
