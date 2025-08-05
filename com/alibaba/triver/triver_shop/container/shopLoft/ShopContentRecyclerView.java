package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopContentRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final c onScrollListener;
    private final PagerSnapHelper pagerSnapHelper;
    private a swipeToBottomCallback;
    private b swipeToItemCallback;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);
    }

    static {
        kge.a(1203201013);
    }

    public static /* synthetic */ Object ipc$super(ShopContentRecyclerView shopContentRecyclerView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final a getSwipeToBottomCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e051ce95", new Object[]{this}) : this.swipeToBottomCallback;
    }

    public final void setSwipeToBottomCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54443fc5", new Object[]{this, aVar});
        } else {
            this.swipeToBottomCallback = aVar;
        }
    }

    public final PagerSnapHelper getPagerSnapHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PagerSnapHelper) ipChange.ipc$dispatch("c7149dbf", new Object[]{this}) : this.pagerSnapHelper;
    }

    public final c getOnScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a5eade1a", new Object[]{this}) : this.onScrollListener;
    }

    public ShopContentRecyclerView(Context context) {
        super(context);
        this.pagerSnapHelper = new PagerSnapHelper();
        this.onScrollListener = new c(this);
        init();
    }

    public ShopContentRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pagerSnapHelper = new PagerSnapHelper();
        this.onScrollListener = new c(this);
        init();
    }

    public ShopContentRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pagerSnapHelper = new PagerSnapHelper();
        this.onScrollListener = new c(this);
        init();
    }

    private final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        addOnScrollListener(this.onScrollListener);
        this.pagerSnapHelper.attachToRecyclerView(this);
    }

    private final LinearLayoutManager getLinearLayoutManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayoutManager) ipChange.ipc$dispatch("7331c2df", new Object[]{this});
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return null;
        }
        return (LinearLayoutManager) layoutManager;
    }

    public final void setSwipeToItemCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eccbf7c", new Object[]{this, bVar});
        } else {
            this.swipeToItemCallback = bVar;
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopContentRecyclerView f3701a;
        private int b;

        static {
            kge.a(-1015725232);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 2142696127) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public c(ShopContentRecyclerView this$0) {
            q.d(this$0, "this$0");
            this.f3701a = this$0;
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            a swipeToBottomCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                return;
            }
            this.f3701a.notifyPositionChanged();
            if (!this.f3701a.isSlideToBottom() || (swipeToBottomCallback = this.f3701a.getSwipeToBottomCallback()) == null) {
                return;
            }
            swipeToBottomCallback.a();
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            q.d(recyclerView, "recyclerView");
            this.b += i2;
            if (this.b != 0) {
                return;
            }
            this.f3701a.stopScroll();
        }
    }

    public final void notifyPositionChanged() {
        View findSnapView;
        int position;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44e4a49", new Object[]{this});
            return;
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager();
        if (linearLayoutManager == null || (findSnapView = this.pagerSnapHelper.findSnapView(linearLayoutManager)) == null || (position = linearLayoutManager.getPosition(findSnapView)) < 0) {
            return;
        }
        RecyclerView.ViewHolder findViewHolderForLayoutPosition = findViewHolderForLayoutPosition(position);
        b bVar = this.swipeToItemCallback;
        if (bVar != null) {
            bVar.a(null, findViewHolderForLayoutPosition);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopContentRecyclerView$notifyPositionChanged$1(this));
    }

    public final boolean isSlideToBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5043da58", new Object[]{this})).booleanValue() : computeVerticalScrollExtent() + computeVerticalScrollOffset() >= computeVerticalScrollRange();
    }

    public final boolean isSlideToTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f0c2d7e", new Object[]{this})).booleanValue() : this.onScrollListener.a() == 0;
    }
}
