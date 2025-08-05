package com.taobao.android.fluid.framework.list.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.obx;
import tb.snq;
import tb.spz;

/* loaded from: classes5.dex */
public class LockableRecycerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DRAG_DOWN = -1;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_UP = 1;
    private static final String TAG = "LockableRecycerView";
    private int distanceY;
    private boolean isAutoLock;
    private boolean isDuringLayout;
    private boolean isLocked;
    private boolean mHookScrollHorizontally;
    private boolean mIsTouching;
    private RecyclerView.Recycler mRecycler;
    private a onDragListener;
    private b onLayoutCompletedListener;
    private snq recyclerViewTouchHelper;
    private float startX;
    private float startY;

    /* loaded from: classes5.dex */
    public interface a {
        void b();

        void c();
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes5.dex */
    public interface c extends a {
        void d();

        void e();
    }

    static {
        kge.a(-356258555);
    }

    public static /* synthetic */ Object ipc$super(LockableRecycerView lockableRecycerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public LockableRecycerView(Context context) {
        super(context);
        this.isLocked = false;
        this.startY = -1.0f;
        this.startX = -1.0f;
        this.mIsTouching = false;
        this.isDuringLayout = false;
        init(context);
    }

    public LockableRecycerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLocked = false;
        this.startY = -1.0f;
        this.startX = -1.0f;
        this.mIsTouching = false;
        this.isDuringLayout = false;
        init(context);
    }

    public LockableRecycerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isLocked = false;
        this.startY = -1.0f;
        this.startX = -1.0f;
        this.mIsTouching = false;
        this.isDuringLayout = false;
        init(context);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mHookScrollHorizontally && (!this.mIsTouching || !isShown())) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    public RecyclerView.Recycler getRecycler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.Recycler) ipChange.ipc$dispatch("c113d96b", new Object[]{this}) : this.mRecycler;
    }

    public void setRecycler(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678c11f7", new Object[]{this, recycler});
        } else {
            this.mRecycler = recycler;
        }
    }

    public boolean isDuringLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2221d20", new Object[]{this})).booleanValue() : this.isDuringLayout;
    }

    public void setAutoLock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b3d6b1", new Object[]{this, new Boolean(z)});
        } else {
            this.isAutoLock = z;
        }
    }

    public void setHookScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c46caa", new Object[]{this});
        } else {
            this.mHookScrollHorizontally = true;
        }
    }

    public final void setLocked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a399ca1", new Object[]{this, new Boolean(z)});
        } else {
            this.isLocked = z;
        }
    }

    public final boolean isLocked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4521f5f", new Object[]{this})).booleanValue() : this.isLocked || this.isAutoLock;
    }

    public void setOnDragListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4329fd", new Object[]{this, aVar});
        } else {
            this.onDragListener = aVar;
        }
    }

    public void setOnLayoutCompletedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8407fc7", new Object[]{this, bVar});
        } else {
            this.onLayoutCompletedListener = bVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof RecyclerView.ViewHolder) && (adapter = getAdapter()) != null) {
                    adapter.onViewAttachedToWindow((RecyclerView.ViewHolder) tag);
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            spz.a(TAG, "", th);
        }
        try {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if ((tag instanceof RecyclerView.ViewHolder) && (adapter = getAdapter()) != null) {
                        adapter.onViewDetachedFromWindow((RecyclerView.ViewHolder) tag);
                    }
                }
            }
        } catch (Throwable th2) {
            spz.a(TAG, "", th2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isLocked || this.isAutoLock) {
            int checkDragGesture = checkDragGesture(motionEvent);
            if (checkDragGesture == 1) {
                a aVar = this.onDragListener;
                if (aVar instanceof c) {
                    ((c) aVar).e();
                    return false;
                }
            }
            if (checkDragGesture == -1) {
                a aVar2 = this.onDragListener;
                if (aVar2 instanceof c) {
                    ((c) aVar2).d();
                }
            }
            return false;
        }
        if (this.mHookScrollHorizontally) {
            this.mIsTouching = checkIsTouching(motionEvent);
        }
        return this.recyclerViewTouchHelper.a(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isLocked && !this.isAutoLock) {
            int checkDragGesture = checkDragGesture(motionEvent);
            if (checkDragGesture == 1 && (aVar2 = this.onDragListener) != null) {
                aVar2.c();
            } else if (checkDragGesture == -1 && (aVar = this.onDragListener) != null) {
                aVar.b();
            }
            if (this.mHookScrollHorizontally) {
                this.mIsTouching = checkIsTouching(motionEvent);
            }
            if (this.recyclerViewTouchHelper.a(motionEvent) && super.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    private int checkDragGesture(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb16e25c", new Object[]{this, motionEvent})).intValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
        } else if (actionMasked == 1) {
            if (this.startY == -1.0f) {
                this.startY = motionEvent.getY();
            }
            if (this.startX == -1.0f) {
                this.startX = motionEvent.getX();
            }
            if (this.startY - motionEvent.getY() > this.distanceY) {
                i = 1;
            } else if (this.startY - motionEvent.getY() < (-this.distanceY)) {
                i = -1;
            }
            this.startY = -1.0f;
        } else if (actionMasked == 2) {
            if (this.startY == -1.0f) {
                this.startY = motionEvent.getY();
            }
            if (this.startX == -1.0f) {
                this.startX = motionEvent.getX();
            }
        } else {
            this.startY = -1.0f;
        }
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            this.isDuringLayout = true;
            super.onLayout(z, i, i2, i3, i4);
            if (this.onLayoutCompletedListener != null) {
                this.onLayoutCompletedListener.a();
            }
        } finally {
            this.isDuringLayout = false;
        }
    }

    private boolean checkIsTouching(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6477a3d5", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.distanceY = ViewConfiguration.get(context).getScaledTouchSlop() + obx.a(context, 30.0f);
        this.recyclerViewTouchHelper = new snq(this);
    }
}
