package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.g;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.hgv;
import tb.hhz;
import tb.hia;
import tb.his;
import tb.hjo;
import tb.jwg;
import tb.kge;
import tb.pqi;
import tb.rht;

/* loaded from: classes6.dex */
public abstract class SingleTabBaseView<T extends g> extends GoodsBaseView<T> implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SingleTabBaseView";
    public String categoryId;
    public String categoryType;
    private hia frameTracer;
    private FrameLayout mBackTopFrameLayout;
    private AliUrlImageView mBackTopImageView;
    private View mEmptyView;
    private ViewGroup mErrorView;
    private boolean mFrameTracerListenerAttached;
    public jwg mGoodsLiveStateListAdapter;
    public boolean mHasShowed;
    public ItemCategory mItemCategory;
    public boolean mLandspace;
    public CloseRecyclerView mListView;
    private GoodsLiveStateMutitabView.a mMultiTabViewDataGetter;
    private Button mRetryView;
    public String tabName;

    static {
        kge.a(-812354652);
        kge.a(-1785685846);
    }

    public static /* synthetic */ Object ipc$super(SingleTabBaseView singleTabBaseView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public abstract boolean checkNeedCompensate(int i, int i2, int i3);

    public abstract jwg constructAdapter();

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean access$000(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fad0386", new Object[]{singleTabBaseView})).booleanValue() : singleTabBaseView.loadMore();
    }

    public static /* synthetic */ FrameLayout access$100(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("6efbd1f6", new Object[]{singleTabBaseView}) : singleTabBaseView.mBackTopFrameLayout;
    }

    public static /* synthetic */ void access$200(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9095684", new Object[]{singleTabBaseView});
        } else {
            singleTabBaseView.exposureBackToTopBtn();
        }
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c access$300(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("8b1b65d8", new Object[]{singleTabBaseView}) : singleTabBaseView.mGoodLiveContext;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c access$400(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("62edf477", new Object[]{singleTabBaseView}) : singleTabBaseView.mGoodLiveContext;
    }

    public static /* synthetic */ hgv access$500(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("b83a3528", new Object[]{singleTabBaseView}) : singleTabBaseView.mPresenter;
    }

    public static /* synthetic */ void access$600(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1fc88", new Object[]{singleTabBaseView});
        } else {
            singleTabBaseView.clickBackToTopBtn();
        }
    }

    public static /* synthetic */ hia access$700(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hia) ipChange.ipc$dispatch("f0ace0dd", new Object[]{singleTabBaseView}) : singleTabBaseView.frameTracer;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c access$800(SingleTabBaseView singleTabBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("c2382ef3", new Object[]{singleTabBaseView}) : singleTabBaseView.mGoodLiveContext;
    }

    public SingleTabBaseView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory, GoodsLiveStateMutitabView.a aVar, boolean z) {
        super(cVar, z);
        this.mFrameTracerListenerAttached = false;
        this.mItemCategory = itemCategory;
        this.mMultiTabViewDataGetter = aVar;
        this.mLandspace = z;
        this.tabName = itemCategory.name;
        this.categoryId = itemCategory.categoryId;
        this.categoryType = itemCategory.bizType;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        if (this.mbPopFromRight) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_package_popupwindow_new_land_flexalocal, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_package_popupwindow_new_flexalocal, (ViewGroup) null);
        }
        this.mErrorView = (ViewGroup) inflate.findViewById(R.id.taolive_goods_package_error);
        this.mRetryView = (Button) inflate.findViewById(R.id.taolive_goods_package_retry);
        this.mEmptyView = inflate.findViewById(R.id.empty_view);
        if (this.mEmptyView != null && com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.mGoodLiveContext)) {
            this.mEmptyView.setBackgroundResource(R.drawable.taolive_goods_package_dx_bg2_flexalocal);
        }
        this.mListView = (CloseRecyclerView) inflate.findViewById(R.id.listview);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.mGoodLiveContext)) {
            this.mBackTopFrameLayout = (FrameLayout) inflate.findViewById(R.id.ll_back_top_view2);
            this.mBackTopImageView = (AliUrlImageView) inflate.findViewById(R.id.back_top_image2);
            this.mBackTopImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01kzkSRM1rZ0MqBhBqK_!!6000000005644-2-tps-144-144.png");
        } else {
            this.mBackTopFrameLayout = (FrameLayout) inflate.findViewById(R.id.ll_back_top_view);
            this.mBackTopImageView = (AliUrlImageView) inflate.findViewById(R.id.back_top_image);
            this.mBackTopImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01MeAs2F23zomFw5ZHH_!!6000000007327-2-tps-54-54.png");
        }
        this.mListView.setLayoutManager(new hjo(this.mGoodLiveContext.f(), 1, false));
        this.mGoodsLiveStateListAdapter = constructAdapter();
        this.mListView.setAdapter(this.mGoodsLiveStateListAdapter);
        this.mListView.setHasFixedSize(true);
        if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.m()) {
            this.mListView.setItemViewCacheSize(4);
        }
        this.mGoodsLiveStateListAdapter.a(this.tabName);
        this.mMultiTabViewDataGetter.a(this.mListView);
        RecyclerView.ItemAnimator itemAnimator = this.mListView.getItemAnimator();
        if (itemAnimator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        this.mListView.setCloseViewListener(new CloseRecyclerView.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() == null) {
                } else {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a();
                }
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                } else {
                    SingleTabBaseView.this.checkNeedCompensate(i, i2, i3);
                }
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else {
                    SingleTabBaseView.access$000(SingleTabBaseView.this);
                }
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                    return;
                }
                if (SingleTabBaseView.access$100(SingleTabBaseView.this) != null && TextUtils.equals("0", SingleTabBaseView.this.categoryId)) {
                    int visibility = SingleTabBaseView.access$100(SingleTabBaseView.this).getVisibility();
                    FrameLayout access$100 = SingleTabBaseView.access$100(SingleTabBaseView.this);
                    if (!z) {
                        i = 8;
                    }
                    access$100.setVisibility(i);
                    if (visibility != 0 && z) {
                        SingleTabBaseView.access$200(SingleTabBaseView.this);
                    }
                }
                if (SingleTabBaseView.access$300(SingleTabBaseView.this) == null || !z2) {
                    return;
                }
                SingleTabBaseView.access$400(SingleTabBaseView.this).L.f++;
            }
        });
        this.mRetryView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ((g) SingleTabBaseView.access$500(SingleTabBaseView.this)).a(false, null);
                }
            }
        });
        this.mBackTopFrameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                his.a(SingleTabBaseView.TAG, "scrollToPosition 0");
                SingleTabBaseView.access$100(SingleTabBaseView.this).setVisibility(8);
                SingleTabBaseView.this.mListView.scrollToPosition(0);
                SingleTabBaseView.access$600(SingleTabBaseView.this);
            }
        });
        if (this.insidePrefetchHelper != null) {
            this.insidePrefetchHelper.a(this.mListView, hhz.OPEN_SOURCE_SCROLL_GOODLIST);
        }
        return inflate;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h
    public jwg getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwg) ipChange.ipc$dispatch("dd44ddec", new Object[]{this});
        }
        if (this.mGoodsLiveStateListAdapter == null) {
            this.mGoodsLiveStateListAdapter = constructAdapter();
        }
        return this.mGoodsLiveStateListAdapter;
    }

    private void exposureBackToTopBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b36857", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tab", !"0".equals(this.categoryId) ? "other" : "all");
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a() == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("BackTop", hashMap);
    }

    private void clickBackToTopBtn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542e8ed8", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tab", !"0".equals(this.categoryId) ? "other" : "all");
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a() == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("BackTop", hashMap);
    }

    private hia getFrameTracerFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hia) ipChange.ipc$dispatch("a79d3b27", new Object[]{this});
        }
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof GoodsLiveStateMutitabView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        return ((GoodsLiveStateMutitabView) parent).frameTracer;
    }

    private void registerScrollListenerForFrameTracer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4de5c", new Object[]{this});
        } else if (this.mFrameTracerListenerAttached) {
        } else {
            if (this.frameTracer == null) {
                this.frameTracer = getFrameTracerFromParent();
            }
            if (this.frameTracer == null) {
                return;
            }
            this.mListView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                    if (str.hashCode() == 2142696127) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i != 2 && i != 1) {
                        SingleTabBaseView.access$700(SingleTabBaseView.this).a(false);
                        rht.b();
                        his.b(SingleTabBaseView.TAG, "onScrollStateChanged | end.");
                        return;
                    }
                    SingleTabBaseView.access$700(SingleTabBaseView.this).a(true);
                    if (i == 1) {
                        rht.a(SingleTabBaseView.access$800(SingleTabBaseView.this));
                    }
                    his.b(SingleTabBaseView.TAG, "onScrollStateChanged | start. state=" + i);
                }
            });
            this.mFrameTracerListenerAttached = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!hia.ENABLED) {
            return;
        }
        registerScrollListenerForFrameTracer();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h
    public CloseRecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CloseRecyclerView) ipChange.ipc$dispatch("14b4294e", new Object[]{this});
        }
        if (this.mListView == null) {
            this.mListView = new CloseRecyclerView(this.mGoodLiveContext.f());
        }
        return this.mListView;
    }

    private boolean loadMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f65f066", new Object[]{this})).booleanValue() : ((g) this.mPresenter).g();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else {
            ((g) this.mPresenter).f();
        }
    }

    public void showPackage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad1e244", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z2 = this.mHasShowed;
        this.mHasShowed = true;
        show();
        g gVar = (g) this.mPresenter;
        CloseRecyclerView closeRecyclerView = this.mListView;
        gVar.a(z, closeRecyclerView != null ? closeRecyclerView.getCurrentShowItemList() : null);
        if (z2) {
            return;
        }
        ((g) this.mPresenter).c();
    }

    public ItemCategory getItemCategory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemCategory) ipChange.ipc$dispatch("e964a693", new Object[]{this}) : this.mItemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5622b57b", new Object[]{this, itemCategory});
            return;
        }
        this.mItemCategory = itemCategory;
        ItemCategory itemCategory2 = this.mItemCategory;
        if (itemCategory2 == null) {
            return;
        }
        this.tabName = itemCategory2.name;
        this.categoryType = this.mItemCategory.bizType;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h
    public void showErrorView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0defe9d", new Object[]{this, dVar});
        } else if (!dVar.f13844a.equalsIgnoreCase(this.tabName) || (viewGroup = this.mErrorView) == null) {
        } else {
            viewGroup.setVisibility(0);
            pqi.a().c("GoodListDX2");
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h
    public void hideErrorView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cea31b8", new Object[]{this, dVar});
        } else if (!dVar.f13844a.equalsIgnoreCase(this.tabName) || (viewGroup = this.mErrorView) == null) {
        } else {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h
    public void showEmptyView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67277a2", new Object[]{this, dVar});
        } else if (!dVar.f13844a.equalsIgnoreCase(this.tabName) || (view = this.mEmptyView) == null) {
        } else {
            view.setVisibility(0);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h
    public void hideEmptyView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.d dVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27daabd", new Object[]{this, dVar});
        } else if (!dVar.f13844a.equalsIgnoreCase(this.tabName) || (view = this.mEmptyView) == null) {
        } else {
            view.setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.mHasShowed = false;
        jwg jwgVar = this.mGoodsLiveStateListAdapter;
        if (jwgVar == null) {
            return;
        }
        jwgVar.c();
    }

    public static SingleTabBaseView constructTabView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, ItemCategory itemCategory, GoodsLiveStateMutitabView.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleTabBaseView) ipChange.ipc$dispatch("f6ae11e2", new Object[]{cVar, itemCategory, aVar, new Boolean(z)});
        }
        if (cVar != null && itemCategory != null) {
            return new NonPreheatTabView(cVar, itemCategory, aVar, z);
        }
        return null;
    }
}
