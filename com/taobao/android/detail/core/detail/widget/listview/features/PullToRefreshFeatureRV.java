package com.taobao.android.detail.core.detail.widget.listview.features;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature;
import com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a;
import com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.b;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PullToRefreshFeatureRV extends AbsFeature<RecyclerView> implements a, ScrollCallback, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PullToRefreshFeatureRV";
    private boolean isAuto = false;
    private Context mContext;
    private b mRefreshController;
    private Scroller mScroller;

    static {
        kge.a(931955383);
        kge.a(1440744945);
        kge.a(-889701249);
        kge.a(1628629155);
    }

    public static /* synthetic */ Object ipc$super(PullToRefreshFeatureRV pullToRefreshFeatureRV, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((PullToRefreshFeatureRV) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterComputeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559935ef", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void afterOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41622bd3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeOnScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ccad0", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public static /* synthetic */ b access$000(PullToRefreshFeatureRV pullToRefreshFeatureRV) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3875f775", new Object[]{pullToRefreshFeatureRV}) : pullToRefreshFeatureRV.mRefreshController;
    }

    public PullToRefreshFeatureRV(Context context) {
        this.mScroller = new Scroller(context, new DecelerateInterpolator());
        this.mRefreshController = new b(this, context, this.mScroller);
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeatureRV");
    }

    public void setIsDownRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f897bc", new Object[]{this});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.h();
    }

    public void setIsUpRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b3cf5", new Object[]{this});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.i();
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbe40df", new Object[]{this, recyclerView});
            return;
        }
        super.setHost((PullToRefreshFeatureRV) recyclerView);
        this.mRefreshController.b();
        this.mRefreshController.a();
        if (!this.isAuto) {
            return;
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeatureRV.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i)});
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                } else if (!PullToRefreshFeatureRV.this.hasArrivedBottomEdge() || !PullToRefreshFeatureRV.access$000(PullToRefreshFeatureRV.this).d()) {
                } else {
                    PullToRefreshFeatureRV.access$000(PullToRefreshFeatureRV.this).c();
                }
            }
        });
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        try {
            if (this.mRefreshController == null) {
                return;
            }
            this.mRefreshController.a(motionEvent);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a
    public boolean hasArrivedTopEdge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3cf15ca", new Object[]{this})).booleanValue() : ((LinearLayoutManager) ((RecyclerView) this.mHost).getLayoutManager()).findFirstCompletelyVisibleItemPosition() <= 1;
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a
    public boolean hasArrivedBottomEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cc9e66", new Object[]{this})).booleanValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) this.mHost).getLayoutManager();
        return linearLayoutManager.findLastVisibleItemPosition() == ((RecyclerView) this.mHost).getAdapter().getItemCount() - 1 && linearLayoutManager.findFirstVisibleItemPosition() != 0;
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a
    public void setHeadView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1754f9e4", new Object[]{this, view});
        } else {
            ((TRecyclerView) this.mHost).addHeaderView(view);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a
    public void setFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44903dc9", new Object[]{this, view});
        } else {
            ((TRecyclerView) this.mHost).addFooterView(view);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a
    public void keepTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad48f017", new Object[]{this});
        } else {
            ((RecyclerView) this.mHost).scrollToPosition(0);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a
    public void keepBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ff3697", new Object[]{this});
            return;
        }
        RecyclerView.Adapter adapter = ((RecyclerView) this.mHost).getAdapter();
        if (adapter != null) {
            ((RecyclerView) this.mHost).scrollToPosition(adapter.getItemCount());
        } else {
            ((RecyclerView) this.mHost).scrollToPosition(0);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.features.internal.pullrefresh.a
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
        } else {
            ((RecyclerView) this.mHost).computeScroll();
        }
    }

    public void setRefreshViewColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }

    public void setUpRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead3c845", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.b(i);
    }

    public void setDownRefreshBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ff6e5e", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.c(i);
    }

    public void enablePullUpToRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb53150", new Object[]{this, new Boolean(z)});
        } else {
            enablePullUpToRefresh(z, null);
        }
    }

    public void enablePullDownToRefresh(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4318ae5b", new Object[]{this, new Boolean(z), view});
        } else {
            enablePullDownToRefresh(z, R.string.detail_pulldown_arrow, view);
        }
    }

    public void enablePullUpToRefresh(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc84e582", new Object[]{this, new Boolean(z), view});
        } else {
            enablePullUpToRefresh(z, R.string.detail_pulldown_arrow, view);
        }
    }

    public void enablePullDownToRefresh(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d5a486", new Object[]{this, new Boolean(z), new Integer(i), view});
        } else if (z) {
            this.mRefreshController.a(true, i, view);
        } else {
            this.mRefreshController.a(false, 0, null);
        }
    }

    public void enablePullUpToRefresh(boolean z, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f0523f", new Object[]{this, new Boolean(z), new Integer(i), view});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        if (z) {
            bVar.b(true, i, view);
        } else {
            bVar.b(false, 0, null);
        }
    }

    @Deprecated
    public void enablePullDownToRefresh(boolean z, int i, int i2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab773bb", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), view});
        } else {
            enablePullDownToRefresh(z, view);
        }
    }

    @Deprecated
    public void enablePullUpToRefresh(boolean z, int i, int i2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f27d22", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), view});
        } else {
            enablePullUpToRefresh(z, view);
        }
    }

    public void isHeadViewHeightContainImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.a(z);
    }

    public void setPullUpToRefreshAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613d8940", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mRefreshController.b(z);
        this.isAuto = z;
        if (getHost() == null || !z) {
            return;
        }
        getHost().addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeatureRV.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else if (!PullToRefreshFeatureRV.this.hasArrivedBottomEdge() || !PullToRefreshFeatureRV.access$000(PullToRefreshFeatureRV.this).d()) {
                } else {
                    PullToRefreshFeatureRV.access$000(PullToRefreshFeatureRV.this).c();
                }
            }
        });
    }

    public void setPullDownRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9204f40e", new Object[]{this, strArr});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.a(strArr);
    }

    public void setPullUpRefreshTips(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef31d87", new Object[]{this, strArr});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.b(strArr);
    }

    public void setOnPullToRefreshListener(PullToRefreshFeature.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e448911c", new Object[]{this, aVar});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.a(aVar);
    }

    public void onPullRefreshComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1283a857", new Object[]{this});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.g();
    }

    public void onPullRefreshComplete(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df1d58c", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.e(i);
    }

    public void onPullRefreshFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7517a071", new Object[]{this});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.f();
    }

    public void onRebound(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50793a90", new Object[]{this, new Integer(i)});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.f(i);
    }

    public int getPullDownDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return -1;
        }
        return bVar.e();
    }

    @Override // com.taobao.uikit.feature.callback.ScrollCallback
    public void beforeComputeScroll() {
        Scroller scroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c216ac", new Object[]{this});
            return;
        }
        Scroller scroller2 = this.mScroller;
        if (scroller2 != null && scroller2.computeScrollOffset()) {
            b bVar = this.mRefreshController;
            if (bVar != null) {
                bVar.a(this.mScroller.getCurrY(), true);
            }
            ((RecyclerView) this.mHost).invalidate();
            return;
        }
        b bVar2 = this.mRefreshController;
        if (bVar2 == null || (scroller = this.mScroller) == null) {
            return;
        }
        bVar2.a(scroller.getCurrY(), false);
    }

    public void setDownRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1833e3", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.c(z);
        }
    }

    public void setUpRefreshFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa6ca1c", new Object[]{this, new Boolean(z)});
        } else {
            this.mRefreshController.d(z);
        }
    }

    public void setIconTextInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ab0acc", new Object[]{this});
            return;
        }
        b bVar = this.mRefreshController;
        if (bVar == null) {
            return;
        }
        bVar.j();
    }
}
