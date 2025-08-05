package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.dinamic.business.FeedListResponse;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.view.BaseLiveRecyclerFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.fpr;
import tb.meh;
import tb.mff;
import tb.mfg;
import tb.mfj;
import tb.mfm;

/* loaded from: classes7.dex */
public abstract class LiveRecyclerFragment extends BaseLiveRecyclerFragment implements com.taobao.live.home.business.b, com.taobao.live.home.dinamic.view.a, mff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOAD_MORE = 10;
    private static final int MAX_SPAN = 2;
    private static final int START_LOAD_MORE = 20;
    private static final String TAG = "LiveRecyclerFragment";
    private meh<IMTOPDataObject> mAdapter;
    private b mInnerOnScrollListener;
    public List<IMTOPDataObject> mLastLoadedData = new ArrayList();
    public RecyclerView.LayoutManager mLayoutManager;
    private a mOnPageReloadListener;
    private RecyclerView.OnScrollListener mOnScrollListener;
    public RecyclerView mRecyclerView;
    public SwipeRefreshLayout mRefreshLayout;

    /* loaded from: classes7.dex */
    public interface a {
    }

    public static /* synthetic */ Object ipc$super(LiveRecyclerFragment liveRecyclerFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 462397159) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroyView();
            return null;
        }
    }

    public abstract com.taobao.live.home.business.a createBusiness(Context context, Bundle bundle);

    public String getChannelId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this}) : "";
    }

    public String getChannelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this}) : "";
    }

    public int getSpanCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a1c2e29", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // tb.mff
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        }
    }

    public void preProcessOnReload(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d9203c", new Object[]{this, list});
        }
    }

    public static /* synthetic */ RecyclerView.OnScrollListener access$100(LiveRecyclerFragment liveRecyclerFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("1051570", new Object[]{liveRecyclerFragment}) : liveRecyclerFragment.mOnScrollListener;
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2b5b5", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListener = onScrollListener;
        }
    }

    public void setOnPageReloadListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f41c51", new Object[]{this, aVar});
        } else {
            this.mOnPageReloadListener = aVar;
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public com.taobao.live.home.business.a onBusinessCreate(Bundle bundle, BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.live.home.business.a) ipChange.ipc$dispatch("43cb913d", new Object[]{this, bundle, baseListRequest});
        }
        com.taobao.live.home.business.a createBusiness = createBusiness(getContext(), bundle);
        if (createBusiness != null) {
            createBusiness.a((com.taobao.live.home.business.b) this);
            createBusiness.b(baseListRequest);
        }
        return createBusiness;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue() : R.layout.live_base_list_fragment;
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyInitView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        this.mRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.live_list_refresh);
        SwipeRefreshLayout swipeRefreshLayout = this.mRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.taobao.live.home.dinamic.view.LiveRecyclerFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
                public void onRefresh() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    } else {
                        LiveRecyclerFragment.this.forceReload();
                    }
                }
            });
            this.mRefreshLayout.setColorSchemeResources(R.color.live_refresh_color);
            this.mRefreshLayout.setDistanceToTriggerSync(100);
        }
        this.mRecyclerView = (RecyclerView) findViewById(R.id.live_list_recycler_view);
        if (this.mRecyclerView != null) {
            this.mAdapter = getAdapter();
            this.mLayoutManager = createLayoutManager(this.mAdapter);
            this.mRecyclerView.setLayoutManager(this.mLayoutManager);
            this.mRecyclerView.addItemDecoration(obtainItemDecoration(), 0);
            this.mRecyclerView.setAdapter(this.mAdapter);
            this.mRecyclerView.setItemAnimator(null);
            this.mInnerOnScrollListener = new b();
            this.mRecyclerView.addOnScrollListener(this.mInnerOnScrollListener);
        }
        addFooter();
        mfg.a().a(this);
    }

    public RecyclerView.LayoutManager createLayoutManager(meh<IMTOPDataObject> mehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("f2a70f17", new Object[]{this, mehVar});
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(getSpanCount(), 1);
        staggeredGridLayoutManager.setGapStrategy(0);
        return staggeredGridLayoutManager;
    }

    public RecyclerView.ItemDecoration obtainItemDecoration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("b07b537a", new Object[]{this}) : new c(fpr.a(getContext(), "12ap", 0), fpr.a(getContext(), "4.5ap", 0), fpr.a(getContext(), "9ap", 0));
    }

    public c getItemDecoration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("95a97378", new Object[]{this});
        }
        try {
            if (this.mRecyclerView == null) {
                return null;
            }
            return (c) this.mRecyclerView.getItemDecorationAt(0);
        } catch (Exception e) {
            mfj.a(TAG, "getItemDecoration exp.", e);
            return null;
        }
    }

    public void addHeader(meh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cc498", new Object[]{this, aVar});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        if (mehVar == null) {
            return;
        }
        mehVar.a(aVar);
    }

    public void clearHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e22ec1", new Object[]{this});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        if (mehVar == null) {
            return;
        }
        mehVar.c();
    }

    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        if (mehVar == null) {
            return 0;
        }
        return mehVar.i();
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void lazyLoadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562dcbcb", new Object[]{this});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        if (mehVar == null || mehVar.i() != 0 || this.mListBusiness == null) {
            return;
        }
        forceReload();
        SwipeRefreshLayout swipeRefreshLayout = this.mRefreshLayout;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(true);
    }

    @Override // com.taobao.live.home.business.b
    public boolean onJudgeEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4c0044e", new Object[]{this})).booleanValue();
        }
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        return mehVar != null && mehVar.i() >= mfm.c();
    }

    @Override // com.taobao.live.home.business.b
    public void onLoadMore(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60aad8f", new Object[]{this, baseListRequest});
        } else if (baseListRequest == null) {
        } else {
            baseListRequest.s += baseListRequest.n;
            mfj.c(TAG, "onLoadMore: s " + baseListRequest.s);
        }
    }

    @Override // com.taobao.live.home.business.b
    public void onReload(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335854d1", new Object[]{this, baseListRequest});
        } else if (baseListRequest == null) {
        } else {
            baseListRequest.s = 0L;
            String str = TAG;
            mfj.c(str, "onReload: n " + baseListRequest.n);
        }
    }

    @Override // com.taobao.live.home.business.b
    public void onPageReload(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a8a88c", new Object[]{this, baseOutDo});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.mRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        if (!(baseOutDo instanceof FeedListResponse)) {
            return;
        }
        FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
        if (this.mAdapter == null || feedListResponse.mo2429getData() == null) {
            return;
        }
        resetData(feedListResponse.mo2429getData().dataList);
        if (feedListResponse.mo2429getData().dataList == null) {
            return;
        }
        String str = TAG;
        mfj.c(str, "onPageReload: " + feedListResponse.mo2429getData().dataList.size());
    }

    @Override // com.taobao.live.home.business.b
    public void onPageReceived(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdbec4", new Object[]{this, baseOutDo});
        } else if (!(baseOutDo instanceof FeedListResponse)) {
        } else {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.mAdapter == null || feedListResponse.mo2429getData() == null) {
                return;
            }
            addAllData(feedListResponse.mo2429getData().dataList);
            if (feedListResponse.mo2429getData().dataList == null) {
                return;
            }
            String str = TAG;
            mfj.c(str, "onPageReceived: " + feedListResponse.mo2429getData().dataList.size() + " list size: " + this.mAdapter.i());
        }
    }

    @Override // com.taobao.live.home.business.b
    public void onPageError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cfa8ab", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        mfj.c(str2, "onPageError: " + str);
        SwipeRefreshLayout swipeRefreshLayout = this.mRefreshLayout;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override // com.taobao.live.home.business.b
    public void onPageEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7729b6f4", new Object[]{this});
            return;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("onPageEnd: size ");
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        sb.append(mehVar != null ? Integer.valueOf(mehVar.i()) : "null");
        mfj.c(str, sb.toString());
        meh<IMTOPDataObject> mehVar2 = this.mAdapter;
        if (mehVar2 == null) {
            return;
        }
        mehVar2.b();
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        try {
            if (this.mRecyclerView == null) {
                return;
            }
            for (int i = 0; i < getCount(); i++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mRecyclerView.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition instanceof com.taobao.live.home.dinamic.view.b) {
                    ((com.taobao.live.home.dinamic.view.b) findViewHolderForAdapterPosition).e();
                }
            }
            this.mRecyclerView.removeOnScrollListener(this.mInnerOnScrollListener);
            this.mRecyclerView.removeAllViews();
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.live.home.view.BaseLiveRecyclerFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mfg.a().b(this);
        this.mOnScrollListener = null;
        this.mInnerOnScrollListener = null;
        this.mOnPageReloadListener = null;
    }

    public meh<IMTOPDataObject> getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (meh) ipChange.ipc$dispatch("dd45f796", new Object[]{this}) : new d(getContext(), this);
    }

    public void loadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else if (this.mListBusiness == null) {
        } else {
            this.mListBusiness.c();
        }
    }

    public void forceReload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
        } else if (this.mListBusiness == null) {
        } else {
            LiveHomeController.a().e();
            this.mListBusiness.d();
        }
    }

    public int getNoMoreResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f16c2289", new Object[]{this})).intValue() : R.layout.live_load_error_layout;
    }

    private void addFooter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cbb423", new Object[]{this});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        if (mehVar != null && mehVar.e() == 0) {
            this.mAdapter.a(R.layout.live_load_more_view, new meh.e() { // from class: com.taobao.live.home.dinamic.view.LiveRecyclerFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.meh.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        LiveRecyclerFragment.this.loadMore();
                    }
                }

                @Override // tb.meh.e
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        LiveRecyclerFragment.this.loadMore();
                    }
                }
            });
        }
        meh<IMTOPDataObject> mehVar2 = this.mAdapter;
        if (mehVar2 == null) {
            return;
        }
        mehVar2.a(getNoMoreResId(), new meh.b() { // from class: com.taobao.live.home.dinamic.view.LiveRecyclerFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.meh.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    LiveRecyclerFragment.this.forceReload();
                }
            }
        });
        this.mAdapter.a(getNoMoreResId(), new meh.f() { // from class: com.taobao.live.home.dinamic.view.LiveRecyclerFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.meh.f
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    LiveRecyclerFragment.this.forceReload();
                }
            }
        });
    }

    public void prepareLoadMore(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ff551a", new Object[]{this, new Integer(i)});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.mAdapter;
        if (mehVar == null || (i2 = mehVar.i()) < 20 || i < i2 - 10) {
            return;
        }
        loadMore();
    }

    public void notifyOnScrolled(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b678ee8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mRecyclerView != null) {
            RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
            ((StaggeredGridLayoutManager) this.mLayoutManager).findLastVisibleItemPositions(iArr2);
            for (int min = Math.min(iArr[0], iArr[1]); min <= Math.max(iArr2[0], iArr2[1]); min++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mRecyclerView.findViewHolderForAdapterPosition(min);
                if (findViewHolderForAdapterPosition instanceof com.taobao.live.home.dinamic.view.b) {
                    com.taobao.live.home.dinamic.view.b bVar = (com.taobao.live.home.dinamic.view.b) findViewHolderForAdapterPosition;
                    bVar.a(i);
                    bVar.f();
                }
            }
            prepareLoadMore(iArr2[0]);
        }
    }

    public void notifyOnScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57be9ce4", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || this.mRecyclerView == null) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
        ((StaggeredGridLayoutManager) this.mLayoutManager).findLastVisibleItemPositions(iArr2);
        for (int min = Math.min(iArr[0], iArr[1]); min <= Math.max(iArr2[0], iArr2[1]); min++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mRecyclerView.findViewHolderForAdapterPosition(min);
            if (findViewHolderForAdapterPosition instanceof com.taobao.live.home.dinamic.view.b) {
                com.taobao.live.home.dinamic.view.b bVar = (com.taobao.live.home.dinamic.view.b) findViewHolderForAdapterPosition;
                bVar.b(i);
                bVar.f();
            }
        }
    }

    private void resetData(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e99e91", new Object[]{this, list});
            return;
        }
        this.mAdapter.c();
        this.mAdapter.g();
        preProcessOnReload(list);
        addAllData(list);
        this.mRecyclerView.invalidateItemDecorations();
        this.mAdapter.notifyItemRangeChanged(0, list.size());
    }

    private void addAllData(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c0b782", new Object[]{this, list});
        } else if (list != null) {
            Iterator<IMTOPDataObject> it = list.iterator();
            while (it.hasNext()) {
                DinamicDataObject dinamicDataObject = (DinamicDataObject) it.next();
                dinamicDataObject.mChannelId = getChannelId();
                dinamicDataObject.mChannelType = getChannelType();
            }
            meh<IMTOPDataObject> mehVar = this.mAdapter;
            if (mehVar != null) {
                mehVar.a(list);
            }
            this.mLastLoadedData.clear();
            this.mLastLoadedData.addAll(list);
        } else {
            meh<IMTOPDataObject> mehVar2 = this.mAdapter;
            if (mehVar2 == null) {
                return;
            }
            mehVar2.a();
        }
    }

    /* loaded from: classes7.dex */
    public class b extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            LiveRecyclerFragment.this.notifyOnScrolled(recyclerView.getScrollState(), i, i2);
            if (LiveRecyclerFragment.access$100(LiveRecyclerFragment.this) == null) {
                return;
            }
            LiveRecyclerFragment.access$100(LiveRecyclerFragment.this).onScrolled(recyclerView, i, i2);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            mfg.a().b("com.taobao.live.home.h5.scroll.state.changed", Integer.valueOf(i));
            LiveRecyclerFragment.this.notifyOnScrollStateChanged(i);
            if (LiveRecyclerFragment.access$100(LiveRecyclerFragment.this) == null) {
                return;
            }
            LiveRecyclerFragment.access$100(LiveRecyclerFragment.this).onScrollStateChanged(recyclerView, i);
        }
    }
}
