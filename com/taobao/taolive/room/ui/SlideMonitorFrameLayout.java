package com.taobao.taolive.room.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class SlideMonitorFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private float mCurPosX;
    private GestureDetector mGestureDetector;
    private float mPosX;
    private a mSlideListener;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ Object ipc$super(SlideMonitorFrameLayout slideMonitorFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-2088793133);
        TAG = SlideMonitorFrameLayout.class.getSimpleName();
    }

    public SlideMonitorFrameLayout(Context context) {
        this(context, null);
    }

    public SlideMonitorFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosX = motionEvent.getX();
            this.mCurPosX = motionEvent.getX();
        } else if (action == 1) {
            float f = this.mCurPosX;
            float f2 = this.mPosX;
            if (f - f2 > 0.0f && Math.abs(f - f2) > 150.0f) {
                a aVar = this.mSlideListener;
                if (aVar != null) {
                    aVar.a();
                }
                Log.e(TAG, "onInterceptTouchEvent: ACTION_UP >0");
                return true;
            }
            float f3 = this.mCurPosX;
            float f4 = this.mPosX;
            if (f3 - f4 < 0.0f && Math.abs(f3 - f4) > 150.0f) {
                Log.e(TAG, "onInterceptTouchEvent: ACTION_UP <0");
                return true;
            }
        } else if (action == 2) {
            this.mCurPosX = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosX = motionEvent.getX();
            this.mCurPosX = motionEvent.getX();
        } else if (action == 1) {
            float f = this.mCurPosX;
            float f2 = this.mPosX;
            if (f - f2 > 0.0f && Math.abs(f - f2) > 150.0f) {
                a aVar2 = this.mSlideListener;
                if (aVar2 != null) {
                    aVar2.a();
                }
            } else {
                float f3 = this.mCurPosX;
                float f4 = this.mPosX;
                if (f3 - f4 < 0.0f && Math.abs(f3 - f4) > 150.0f && (aVar = this.mSlideListener) != null) {
                    aVar.a();
                }
            }
        } else if (action == 2) {
            this.mCurPosX = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSlideListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6553169", new Object[]{this, aVar});
        } else {
            this.mSlideListener = aVar;
        }
    }
}
