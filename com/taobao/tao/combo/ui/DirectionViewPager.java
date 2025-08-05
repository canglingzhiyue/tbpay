package com.taobao.tao.combo.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class DirectionViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SCROLL_DISTANCE_THRESHOLD = 120;
    public static final int SCROLL_TO_LEFT = 0;
    public static final int SCROLL_TO_RIGHT = 1;
    private static String TAG;
    private float mFirstX;
    private boolean mIsFirst;
    private float mIsFirstDirection;
    private float mLastX;
    private a mListener;
    private b mOnDirectionPagerMoved;
    private int mViewPagerClassify;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, int i2);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a(int i, int i2, float f);

        void b(int i, int i2, float f);
    }

    public static /* synthetic */ Object ipc$super(DirectionViewPager directionViewPager, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1059330969);
        TAG = DirectionViewPager.class.getSimpleName();
    }

    public DirectionViewPager(Context context) {
        super(context);
        this.mIsFirst = true;
        this.mIsFirstDirection = 0.0f;
        this.mViewPagerClassify = 0;
    }

    public DirectionViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsFirst = true;
        this.mIsFirstDirection = 0.0f;
        this.mViewPagerClassify = 0;
    }

    public void setOnDirectionPagerChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5968b049", new Object[]{this, aVar});
        } else {
            this.mListener = aVar;
        }
    }

    public void setOnDirectionPagerMoved(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e27c7ad", new Object[]{this, bVar});
        } else {
            this.mOnDirectionPagerMoved = bVar;
        }
    }

    public void setViewPagerClassify(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4556dc", new Object[]{this, new Integer(i)});
        } else {
            this.mViewPagerClassify = i;
        }
    }

    public int getViewPagerClassify() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97000a86", new Object[]{this})).intValue() : this.mViewPagerClassify;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float x = motionEvent.getX();
        if (this.mIsFirst) {
            this.mIsFirstDirection = 0.0f;
            this.mIsFirst = false;
            this.mFirstX = x;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mFirstX = x;
        } else if (actionMasked == 1) {
            this.mIsFirst = true;
            this.mLastX = x;
            float f = this.mFirstX;
            if (f != 0.0f) {
                if (f - this.mLastX > 120.0f && (aVar2 = this.mListener) != null) {
                    aVar2.a(getCurrentItem(), 0);
                }
                if (this.mLastX - this.mFirstX > 120.0f && (aVar = this.mListener) != null) {
                    aVar.a(getCurrentItem(), 1);
                }
            }
        } else if (actionMasked == 2) {
            float f2 = x - this.mFirstX;
            b bVar2 = this.mOnDirectionPagerMoved;
            if (bVar2 != null) {
                bVar2.b(this.mViewPagerClassify, getCurrentItem(), f2);
            }
            if (Math.abs(f2) < this.mIsFirstDirection && (bVar = this.mOnDirectionPagerMoved) != null) {
                bVar.a(this.mViewPagerClassify, getCurrentItem(), f2);
            }
            this.mIsFirstDirection = Math.abs(f2);
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }
}
