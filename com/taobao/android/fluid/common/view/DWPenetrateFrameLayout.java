package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.RectData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.iqw;
import tb.kge;
import tb.obo;
import tb.ocf;
import tb.ogv;
import tb.ohd;
import tb.snf;
import tb.spz;

/* loaded from: classes5.dex */
public class DWPenetrateFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_PENETRATE_ALPHA = 200;
    private static final String TAG;
    private boolean disableScrollHorizontallyForCollectionPopup;
    private boolean mBitmapCacheUpdated;
    private List<RectData> mChildTrusteeshipTouchRects;
    private boolean mNeedChildInterceptTouch;
    private boolean mNeedInterceptTouch;
    private int mPenetrateAlpha;
    private BigDecimal mScreenHeight;
    private BigDecimal mScreenWidth;

    public static /* synthetic */ Object ipc$super(DWPenetrateFrameLayout dWPenetrateFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -614473710) {
            if (hashCode == 623593120) {
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
        }
        return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
    }

    static {
        kge.a(1120257376);
        TAG = DWPenetrateFrameLayout.class.getSimpleName();
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPenetrateAlpha = 200;
        this.mChildTrusteeshipTouchRects = new ArrayList();
        this.mNeedChildInterceptTouch = false;
        this.disableScrollHorizontallyForCollectionPopup = false;
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPenetrateAlpha = 200;
        this.mChildTrusteeshipTouchRects = new ArrayList();
        this.mNeedChildInterceptTouch = false;
        this.disableScrollHorizontallyForCollectionPopup = false;
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context) {
        super(context);
        this.mPenetrateAlpha = 200;
        this.mChildTrusteeshipTouchRects = new ArrayList();
        this.mNeedChildInterceptTouch = false;
        this.disableScrollHorizontallyForCollectionPopup = false;
        initialize(context);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.disableScrollHorizontallyForCollectionPopup && !iqw.i()) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (iqw.i() && !dispatchTouchEvent) {
            requestDisallowInterceptTouchEvent(false);
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (255 == this.mPenetrateAlpha) {
                return false;
            }
            if (this.mPenetrateAlpha == 0) {
                return true;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x >= 0 && y >= 0) {
                return onInterceptTouch(motionEvent, x, y);
            }
            return true;
        } catch (Throwable th) {
            spz.c(TAG, th.getMessage());
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
            this.mBitmapCacheUpdated = true;
        } catch (Throwable th) {
            spz.c(TAG, th.getMessage());
        }
    }

    public boolean isTouchOnValidArea(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a16cd35", new Object[]{this, motionEvent})).booleanValue() : !onInterceptTouchEvent(motionEvent);
    }

    public void setChildTrusteeshipTouchRect(List<RectData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f44ae1", new Object[]{this, list});
            return;
        }
        this.mChildTrusteeshipTouchRects = list;
        this.disableScrollHorizontallyForCollectionPopup = obo.a(this.mChildTrusteeshipTouchRects);
    }

    private void disAllowIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606ad8ae", new Object[]{this});
        } else if (!iqw.i()) {
        } else {
            requestDisallowInterceptTouchEvent(true);
        }
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        setLayoutTransition(null);
        spz.a(TAG, "initialize,清空mChildTrusteeshipTouchRects");
        this.mChildTrusteeshipTouchRects = null;
        this.mScreenWidth = BigDecimal.valueOf(ohd.f(context));
        this.mScreenHeight = BigDecimal.valueOf(ohd.g(context) - ohd.h(context));
    }

    private boolean onInterceptTouch(MotionEvent motionEvent, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1905dc9c", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (ogv.b(this.mChildTrusteeshipTouchRects) && snf.c()) {
            if (motionEvent.getAction() == 0) {
                this.mNeedChildInterceptTouch = false;
                this.mNeedInterceptTouch = false;
                Iterator<RectData> it = this.mChildTrusteeshipTouchRects.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RectData next = it.next();
                    BigDecimal bigDecimal = new BigDecimal(getWidth());
                    BigDecimal bigDecimal2 = new BigDecimal(getHeight());
                    spz.a(TAG, "mChildTrusteeshipTouchRects" + next.toString() + ",width:" + bigDecimal + ",height:" + bigDecimal2);
                    BigDecimal multiply = new BigDecimal(next.x).multiply(bigDecimal);
                    BigDecimal multiply2 = new BigDecimal(next.y).multiply(bigDecimal2);
                    BigDecimal multiply3 = new BigDecimal(next.width).multiply(bigDecimal);
                    BigDecimal multiply4 = new BigDecimal(next.height).multiply(bigDecimal2);
                    spz.a(TAG, "mChildTrusteeshipTouchRects,converX:" + multiply + ",converY:" + multiply2 + ",converWidth:" + multiply3 + ",converHeight:" + multiply4);
                    float f = (float) i;
                    if (f >= multiply.floatValue() && f < multiply.floatValue() + multiply3.floatValue()) {
                        float f2 = i2;
                        if (f2 >= multiply2.floatValue() && f2 < multiply2.floatValue() + multiply4.floatValue()) {
                            spz.a(TAG, "xy在托管区域内");
                            this.mNeedChildInterceptTouch = true;
                            disAllowIntercept();
                            break;
                        }
                    }
                }
            }
            this.mNeedInterceptTouch = !this.mNeedChildInterceptTouch;
            spz.a(TAG, "mChildTrusteeshipTouchRects,needInterceptTouch：" + this.mNeedInterceptTouch + ",x:" + i + ",y:" + i2);
            return this.mNeedInterceptTouch;
        } else if (snf.c()) {
            if (motionEvent.getAction() == 0) {
                this.mNeedInterceptTouch = false;
                if (255 - ocf.a(this, i, i2) <= this.mPenetrateAlpha) {
                    z = false;
                }
                this.mNeedInterceptTouch = z;
                if (!this.mNeedInterceptTouch) {
                    disAllowIntercept();
                }
            }
            spz.a(TAG, "onInterceptTouchEvent 优化点击截图方法,event：" + motionEvent.getAction() + ",onIntercept:" + this.mNeedInterceptTouch);
            return this.mNeedInterceptTouch;
        } else {
            if (motionEvent.getAction() == 0) {
                updateBitmapCacheIfNeed();
            }
            Bitmap drawingCache = getDrawingCache();
            if (i <= drawingCache.getWidth() && i2 <= drawingCache.getHeight()) {
                if (255 - Color.alpha(drawingCache.getPixel(i, i2)) <= this.mPenetrateAlpha) {
                    z = false;
                }
                spz.a(TAG, "onInterceptTouchEvent old,event：" + motionEvent.getAction() + ",onIntercept:" + z);
                if (!z) {
                    disAllowIntercept();
                }
            }
            return z;
        }
    }

    private void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
            return;
        }
        destroyDrawingCache();
        buildDrawingCache();
        this.mBitmapCacheUpdated = false;
    }
}
