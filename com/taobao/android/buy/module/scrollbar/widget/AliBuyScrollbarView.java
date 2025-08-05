package com.taobao.android.buy.module.scrollbar.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bay;
import tb.bbi;
import tb.dun;
import tb.kge;

/* loaded from: classes4.dex */
public class AliBuyScrollbarView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mAnchorPaint;
    private int mAnchorSize;
    private int mBarHeight;
    private int mBarWidth;
    private Paint mBgPaint;
    private float mCenterYOfThumb;
    private final Handler mDelayHandler;
    private final int mDelayMillis;
    private LinearGradient mGradient;
    private Runnable mHideScrollBar;
    private boolean mInitFlag;
    private int mItemCount;
    private float mPercent;
    private Paint mProgressPaint;
    private float mRadius;
    private float mRatio;
    private b mScrollListener;
    public int mStartPosition;
    private float mStartY;
    private float mStopY;
    private Rect mTouchRect;
    private boolean scrollConflict;
    private boolean upOrCancel;

    static {
        kge.a(-1027484568);
    }

    public static /* synthetic */ Object ipc$super(AliBuyScrollbarView aliBuyScrollbarView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public AliBuyScrollbarView(Context context) {
        this(context, null);
    }

    public AliBuyScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AliBuyScrollbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDelayHandler = new Handler();
        this.mDelayMillis = 1000;
        this.mItemCount = 0;
        this.mStartPosition = -1;
    }

    public void onDataChange(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7ccc45", new Object[]{this, map});
            return;
        }
        this.mBarWidth = bay.a(bbi.a((String) map.get(dun.f26991a), 5));
        this.mAnchorSize = bay.a(bbi.a((String) map.get(dun.b), 9));
        this.mRatio = bbi.a((String) map.get(dun.c), 0.6f);
        this.mRadius = this.mAnchorSize / 2.0f;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setClickable(true);
        setVisibility(4);
        int i = this.mBarHeight;
        float f = this.mRatio;
        this.mStartY = (i * (1.0f - f)) / 2.0f;
        this.mStopY = (i * (f + 1.0f)) / 2.0f;
        this.mHideScrollBar = new Runnable() { // from class: com.taobao.android.buy.module.scrollbar.widget.AliBuyScrollbarView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AliBuyScrollbarView.this.setVisibility(4);
                }
            }
        };
        this.mTouchRect = new Rect();
        this.mTouchRect.set(dun.g, dun.h, dun.i, dun.j);
        this.mGradient = new LinearGradient(dun.d, 0.0f, 0.0f, 0.0f, -1, 0, Shader.TileMode.CLAMP);
        this.mBgPaint = new Paint();
        this.mBgPaint.setColor(-1);
        this.mBgPaint.setAlpha(255);
        this.mProgressPaint = new Paint();
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressPaint.setStrokeWidth(this.mBarWidth);
        this.mProgressPaint.setAntiAlias(true);
        this.mProgressPaint.setColor(855638016);
        this.mAnchorPaint = new Paint();
        this.mAnchorPaint.setStrokeWidth(4.0f);
        this.mInitFlag = true;
    }

    public void setBarHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d42b584", new Object[]{this, new Integer(i)});
        } else {
            this.mBarHeight = i;
        }
    }

    public boolean hasInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue() : this.mInitFlag;
    }

    public void setListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de8fa5", new Object[]{this, bVar});
        } else {
            this.mScrollListener = bVar;
        }
    }

    public void setItemCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
        } else {
            this.mItemCount = i;
        }
    }

    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.mItemCount;
    }

    public void scrollToPercent(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf75d47", new Object[]{this, new Float(f), new Integer(i)});
        } else if (this.upOrCancel) {
            this.upOrCancel = false;
        } else if (this.scrollConflict) {
        } else {
            this.mDelayHandler.removeCallbacks(this.mHideScrollBar);
            if ((i != 1 || f <= this.mPercent) && (i != -1 || f >= this.mPercent)) {
                return;
            }
            this.mPercent = f;
            refreshThumb();
        }
    }

    private void refreshThumb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87eec2", new Object[]{this});
            return;
        }
        float f = this.mStopY;
        float f2 = this.mStartY;
        this.mCenterYOfThumb = ((f - f2) * this.mPercent) + f2;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        this.mBgPaint.setShader(this.mGradient);
        canvas.drawRect(0.0f, 0.0f, dun.d, getHeight(), this.mBgPaint);
        canvas.drawLine((this.mBarWidth / 2.0f) + dun.e, this.mStartY, (this.mBarWidth / 2.0f) + dun.e, this.mStopY, this.mProgressPaint);
        this.mAnchorPaint.setAntiAlias(true);
        this.mAnchorPaint.setStyle(Paint.Style.FILL);
        this.mAnchorPaint.setColor(-1);
        canvas.drawCircle(this.mRadius + dun.f, this.mCenterYOfThumb, this.mRadius - this.mAnchorPaint.getStrokeWidth(), this.mAnchorPaint);
        this.mAnchorPaint.setStyle(Paint.Style.STROKE);
        this.mAnchorPaint.setColor(-16777216);
        canvas.drawCircle(this.mRadius + dun.f, this.mCenterYOfThumb, this.mRadius - (this.mAnchorPaint.getStrokeWidth() / 2.0f), this.mAnchorPaint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r9 != 3) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.buy.module.scrollbar.widget.AliBuyScrollbarView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            r1[r4] = r9
            java.lang.String r9 = "a9b14c3a"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1c:
            float r0 = r9.getX()
            float r1 = r9.getY()
            float r5 = r8.mStartY
            float r1 = java.lang.Math.max(r5, r1)
            float r5 = r8.mStopY
            float r1 = java.lang.Math.min(r1, r5)
            float r5 = r8.mStartY
            float r6 = r1 - r5
            float r7 = r8.mStopY
            float r7 = r7 - r5
            float r6 = r6 / r7
            android.graphics.Rect r5 = r8.mTouchRect
            int r0 = (int) r0
            int r1 = (int) r1
            boolean r5 = r5.contains(r0, r1)
            if (r5 == 0) goto L49
            android.os.Handler r5 = r8.mDelayHandler
            java.lang.Runnable r7 = r8.mHideScrollBar
            r5.removeCallbacks(r7)
        L49:
            int r9 = r9.getActionMasked()
            if (r9 == 0) goto L7c
            if (r9 == r4) goto L64
            if (r9 == r2) goto L57
            r0 = 3
            if (r9 == r0) goto L64
            goto L8e
        L57:
            com.taobao.android.buy.module.scrollbar.widget.b r9 = r8.mScrollListener
            float r0 = r8.mPercent
            r9.a(r0, r6)
            r8.mPercent = r6
            r8.refreshThumb()
            goto L8e
        L64:
            r8.scrollConflict = r3
            r8.upOrCancel = r4
            com.taobao.android.buy.module.scrollbar.widget.b r9 = r8.mScrollListener
            float r0 = r8.mPercent
            r9.b(r0, r6)
            r8.mPercent = r6
            r8.refreshThumb()
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r3)
            goto L8e
        L7c:
            android.graphics.Rect r9 = r8.mTouchRect
            boolean r9 = r9.contains(r0, r1)
            if (r9 != 0) goto L85
            return r3
        L85:
            r8.scrollConflict = r4
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r4)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.buy.module.scrollbar.widget.AliBuyScrollbarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(dun.d, i2);
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            setVisibility(0);
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.mDelayHandler.postDelayed(this.mHideScrollBar, 1000L);
        }
    }
}
