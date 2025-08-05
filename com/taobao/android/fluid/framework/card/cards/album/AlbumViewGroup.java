package com.taobao.android.fluid.framework.card.cards.album;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class AlbumViewGroup extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private boolean mOnMoved;
    private int mScrollPointerId;
    private int mTouchSlop;
    private a onTouchedListener;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-465716947);
    }

    public static /* synthetic */ Object ipc$super(AlbumViewGroup albumViewGroup, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AlbumViewGroup(Context context) {
        super(context);
        init();
    }

    public AlbumViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AlbumViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        horizontalTouch(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    private void horizontalTouch(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949ea417", new Object[]{this, motionEvent});
        } else if (this.mOnMoved || this.onTouchedListener == null) {
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        return;
                    }
                    int x = ((int) (motionEvent.getX(findPointerIndex) + 0.5f)) - this.mInitialTouchX;
                    int y = ((int) (motionEvent.getY(findPointerIndex) + 0.5f)) - this.mInitialTouchY;
                    if (Math.abs(x) <= this.mTouchSlop || Math.abs(x) <= Math.abs(y)) {
                        return;
                    }
                    this.mOnMoved = true;
                    this.onTouchedListener.a();
                    return;
                } else if (actionMasked != 5) {
                    return;
                }
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            this.mInitialTouchX = (int) (motionEvent.getX() + 0.5f);
            this.mInitialTouchY = (int) (motionEvent.getY() + 0.5f);
        }
    }

    public void resetTouched() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90dd0d6", new Object[]{this});
        } else {
            this.mOnMoved = false;
        }
    }

    public void setOnTouchedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7525f5d", new Object[]{this, aVar});
        } else {
            this.onTouchedListener = aVar;
        }
    }
}
