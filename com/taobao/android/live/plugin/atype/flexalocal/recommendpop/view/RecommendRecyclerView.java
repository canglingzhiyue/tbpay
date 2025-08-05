package com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class RecommendRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BOTTOM = 3;
    private static final int MIDDLE = 2;
    private static final String TAG;
    private static final int TOP = 1;
    private a callBack;
    private boolean isStop;
    private float mCurPosY;
    private float mPosY;
    private int status;

    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z);
    }

    public static /* synthetic */ Object ipc$super(RecommendRecyclerView recommendRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(159402596);
        TAG = RecommendRecyclerView.class.getSimpleName();
    }

    public void setLoadMoreListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df029608", new Object[]{this, aVar});
        } else {
            this.callBack = aVar;
        }
    }

    public RecommendRecyclerView(Context context) {
        super(context);
        this.status = 1;
        this.isStop = false;
    }

    public RecommendRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.status = 1;
        this.isStop = false;
    }

    public RecommendRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.status = 1;
        this.isStop = false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosY = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.mCurPosY = motionEvent.getY();
            }
        } else if (Math.abs(this.mCurPosY - this.mPosY) > 500.0f && (aVar = this.callBack) != null) {
            if (this.mCurPosY - this.mPosY > 0.0f) {
                int i = this.status;
            } else if (this.status == 3) {
                aVar.a(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosY = motionEvent.getY();
        } else if (action == 2) {
            this.mCurPosY = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (this.isStop) {
            if (!canScrollVertically(-1)) {
                this.status = 1;
            } else if (!canScrollVertically(1)) {
                this.status = 3;
            } else {
                this.status = 2;
            }
        }
        this.isStop = true;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int itemCount = getAdapter().getItemCount();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        linearLayoutManager.findFirstVisibleItemPosition();
        int childCount = getChildCount();
        a aVar = this.callBack;
        if (aVar == null || findLastVisibleItemPosition < itemCount - 3 || childCount <= 0 || i2 <= 0) {
            return;
        }
        aVar.a(false);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        try {
            super.addView(view, i, layoutParams);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
    }

    public int getCurrentPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78622a0b", new Object[]{this})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager != null) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        return -1;
    }
}
