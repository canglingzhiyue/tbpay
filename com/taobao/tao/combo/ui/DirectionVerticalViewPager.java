package com.taobao.tao.combo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class DirectionVerticalViewPager extends VerticalViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SCROLL_DISTANCE_THRESHOLD = 10;
    public static final int SCROLL_TO_LEFT = 0;
    public static final int SCROLL_TO_RIGHT = 1;
    private a mDirectionListener;
    private float mFirstY;
    private boolean mIsFirst;
    private float mLastY;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i, int i2);
    }

    static {
        kge.a(-1322111549);
    }

    public static /* synthetic */ Object ipc$super(DirectionVerticalViewPager directionVerticalViewPager, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DirectionVerticalViewPager(Context context) {
        super(context);
        this.mIsFirst = true;
    }

    public DirectionVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsFirst = true;
    }

    @Override // com.taobao.tao.combo.ui.VerticalViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float y = motionEvent.getY();
        if (this.mIsFirst) {
            this.mIsFirst = false;
            this.mFirstY = y;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mFirstY = y;
        } else if (actionMasked == 1) {
            this.mIsFirst = true;
            this.mLastY = y;
            float f = this.mFirstY;
            if (f != 0.0f) {
                if (f - this.mLastY > 10.0f && (aVar2 = this.mDirectionListener) != null) {
                    aVar2.a(getCurrentItem(), 0);
                }
                if (this.mLastY - this.mFirstY > 10.0f && (aVar = this.mDirectionListener) != null) {
                    aVar.a(getCurrentItem(), 1);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public a getDirectionListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("588e2021", new Object[]{this}) : this.mDirectionListener;
    }

    public void setDirectionListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49394c7", new Object[]{this, aVar});
        } else {
            this.mDirectionListener = aVar;
        }
    }
}
