package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class CustomViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PointF mCurrentPt;
    private PointF mLastPt;
    private a mOnPageEdgeScrollLimitListener;

    /* loaded from: classes5.dex */
    public interface a {
        void onPageFirstScrollLimit();

        void onPageLastScrollLimit();
    }

    static {
        kge.a(-1249041844);
    }

    public static /* synthetic */ Object ipc$super(CustomViewPager customViewPager, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CustomViewPager(Context context) {
        super(context);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        this.mOnPageEdgeScrollLimitListener = null;
        init();
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastPt = new PointF();
        this.mCurrentPt = new PointF();
        this.mOnPageEdgeScrollLimitListener = null;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setOverScrollMode(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mLastPt.x = motionEvent.getX();
            this.mLastPt.y = motionEvent.getY();
        } else if (action == 1 || action == 2) {
            this.mCurrentPt.x = motionEvent.getX();
            this.mCurrentPt.y = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float[] handleMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("179c8bc9", new Object[]{this, motionEvent});
        }
        int action = motionEvent.getAction() & 255;
        if (2 != action && 1 != action) {
            return null;
        }
        return new float[]{this.mCurrentPt.x - this.mLastPt.x, this.mCurrentPt.y - this.mLastPt.y};
    }

    public a getOnPageEdgeScrollLimitListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("76a8b670", new Object[]{this}) : this.mOnPageEdgeScrollLimitListener;
    }

    public void setOnPageEdgeScrollLimitListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f116c7c", new Object[]{this, aVar});
        } else {
            this.mOnPageEdgeScrollLimitListener = aVar;
        }
    }
}
