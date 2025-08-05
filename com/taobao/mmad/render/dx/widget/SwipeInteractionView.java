package com.taobao.mmad.render.dx.widget;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.stt;
import tb.stv;

/* loaded from: classes7.dex */
public class SwipeInteractionView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_SLIDE_DISTANCE = 75;
    private static final int DEFAULT_TOUCH_META = 87108;
    private static final String TAG = "SwipeInteractionView";
    private double slideAngle;
    private float slideDistance;
    private a swipeInteractionListener;
    private float touchDownEventX;
    private float touchDownEventY;
    private float validSlideDistance;

    /* loaded from: classes7.dex */
    public interface a {
        void a(boolean z, float f, double d, float f2);
    }

    static {
        kge.a(-1614283763);
    }

    public static /* synthetic */ Object ipc$super(SwipeInteractionView swipeInteractionView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SwipeInteractionView(Context context) {
        this(context, null);
    }

    public SwipeInteractionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeInteractionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.validSlideDistance = stt.a(75.0f);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        stv.a(TAG, "onInterceptTouchEvent: " + motionEvent.getAction());
        return true;
    }

    private boolean calculateDistance(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d05c5b86", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (f5 == 0.0f) {
            this.slideAngle = 90.0d;
        } else {
            this.slideAngle = (Math.atan(Math.abs(f6) / Math.abs(f5)) / 3.141592653589793d) * 180.0d;
        }
        this.slideDistance = f6;
        return this.slideAngle >= 15.0d && f6 < 0.0f && Math.abs(f6) >= this.validSlideDistance;
    }

    private boolean isClickEvent(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af004bc7", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue() : Math.abs(f - f3) < 10.0f && Math.abs(f2 - f4) < 10.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getMetaState() == DEFAULT_TOUCH_META) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownEventX = x;
            this.touchDownEventY = y;
            return true;
        }
        if (actionMasked == 1) {
            if (calculateDistance(this.touchDownEventX, this.touchDownEventY, x, y)) {
                stv.a(TAG, "User swiping triggers interaction.");
                a aVar = this.swipeInteractionListener;
                if (aVar != null) {
                    aVar.a(true, this.slideDistance, this.slideAngle, this.validSlideDistance);
                }
            } else {
                stv.a(TAG, "User swiping not triggers interaction.");
                if (isClickEvent(this.touchDownEventX, this.touchDownEventY, x, y)) {
                    mockClick(x, y);
                } else {
                    a aVar2 = this.swipeInteractionListener;
                    if (aVar2 != null) {
                        aVar2.a(false, this.slideDistance, this.slideAngle, this.validSlideDistance);
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private void mockClick(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158cea65", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        mockTouchEvent(f, f2, 0);
        mockTouchEvent(f, f2, 1);
        stv.a(TAG, "Mock click event end. x=" + f + ", y=" + f2);
    }

    private void mockTouchEvent(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9be79b7", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
        } else {
            ((ViewGroup) getParent()).dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), 100 + SystemClock.uptimeMillis(), i, f, f2, DEFAULT_TOUCH_META));
        }
    }

    public void setSwipeInteractionListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55abcd42", new Object[]{this, aVar});
        } else {
            this.swipeInteractionListener = aVar;
        }
    }

    public void setValidSlideDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438ab0b0", new Object[]{this, new Integer(i)});
        } else {
            this.validSlideDistance = stt.a(i);
        }
    }
}
