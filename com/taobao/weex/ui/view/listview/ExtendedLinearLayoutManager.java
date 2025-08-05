package com.taobao.weex.ui.view.listview;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class ExtendedLinearLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OnSmoothScrollEndListener onScrollEndListener;
    private RecyclerView.SmoothScroller smoothScroller;

    /* loaded from: classes9.dex */
    public interface OnSmoothScrollEndListener {
        void onStop();
    }

    static {
        kge.a(794463491);
    }

    public static /* synthetic */ Object ipc$super(ExtendedLinearLayoutManager extendedLinearLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -602204034) {
            if (hashCode != 1626618577) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        }
        return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ OnSmoothScrollEndListener access$000(ExtendedLinearLayoutManager extendedLinearLayoutManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnSmoothScrollEndListener) ipChange.ipc$dispatch("fe15a0ae", new Object[]{extendedLinearLayoutManager}) : extendedLinearLayoutManager.onScrollEndListener;
    }

    public static /* synthetic */ OnSmoothScrollEndListener access$002(ExtendedLinearLayoutManager extendedLinearLayoutManager, OnSmoothScrollEndListener onSmoothScrollEndListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSmoothScrollEndListener) ipChange.ipc$dispatch("15282e91", new Object[]{extendedLinearLayoutManager, onSmoothScrollEndListener});
        }
        extendedLinearLayoutManager.onScrollEndListener = onSmoothScrollEndListener;
        return onSmoothScrollEndListener;
    }

    public ExtendedLinearLayoutManager(Context context) {
        super(context, 1, false);
    }

    public ExtendedLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e7cc6e", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        if (this.smoothScroller == null) {
            this.smoothScroller = new TopSnappedSmoothScroller(recyclerView.getContext());
        }
        this.smoothScroller.setTargetPosition(i);
        startSmoothScroll(this.smoothScroller);
    }

    /* loaded from: classes9.dex */
    public class TopSnappedSmoothScroller extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1668955833);
        }

        public static /* synthetic */ Object ipc$super(TopSnappedSmoothScroller topSnappedSmoothScroller, String str, Object... objArr) {
            if (str.hashCode() == 188604040) {
                super.onStop();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
            }
            return -1;
        }

        public TopSnappedSmoothScroller(Context context) {
            super(context);
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i)}) : ExtendedLinearLayoutManager.this.computeScrollVectorForPosition(i);
        }

        @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            super.onStop();
            if (ExtendedLinearLayoutManager.access$000(ExtendedLinearLayoutManager.this) == null) {
                return;
            }
            ExtendedLinearLayoutManager.access$000(ExtendedLinearLayoutManager.this).onStop();
            ExtendedLinearLayoutManager.access$002(ExtendedLinearLayoutManager.this, null);
        }
    }

    public void setOnScrollEndListener(OnSmoothScrollEndListener onSmoothScrollEndListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2a0ec3", new Object[]{this, onSmoothScrollEndListener});
        } else {
            this.onScrollEndListener = onSmoothScrollEndListener;
        }
    }
}
