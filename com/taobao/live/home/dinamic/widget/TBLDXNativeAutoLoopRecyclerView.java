package com.taobao.live.home.dinamic.widget;

import android.content.Context;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView;

/* loaded from: classes7.dex */
public class TBLDXNativeAutoLoopRecyclerView extends DXNativeAutoLoopRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mLastX;
    private int mLastY;

    public TBLDXNativeAutoLoopRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLDXNativeAutoLoopRecyclerView tBLDXNativeAutoLoopRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView, com.taobao.android.dinamicx.view.DXNativeRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (Math.abs(x - this.mLastX) <= Math.abs(y - this.mLastY)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            this.mLastX = x;
            this.mLastY = y;
            return super.dispatchTouchEvent(motionEvent);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.mLastX = x;
        this.mLastY = y;
        return super.dispatchTouchEvent(motionEvent);
    }
}
