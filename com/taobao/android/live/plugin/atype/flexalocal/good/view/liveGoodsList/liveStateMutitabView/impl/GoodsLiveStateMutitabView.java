package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.NonPreheatTabView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.SingleTabBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.MultiSlidingTabStripAType;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.ddv;
import tb.ddw;
import tb.hhz;
import tb.hia;
import tb.hir;
import tb.his;
import tb.hjg;
import tb.hjh;
import tb.hji;
import tb.kge;
import tb.pmd;
import tb.sxt;

/* loaded from: classes6.dex */
public class GoodsLiveStateMutitabView extends GoodsBaseView<hjg> implements ddv, hjh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StateMutitabView";
    private int currentTab;
    private String currentTabCategory;
    public hia frameTracer;
    private List<SingleTabBaseView> liveStateViewList;
    private RecyclerView.RecycledViewPool mGoodListRecycledViewPool;
    private Handler mHandler;
    private hji mLiveStateMutitabViewpagerAdapter;
    private a mMultiTabViewDataGetter;
    private AliUrlImageView mTabCover;
    private b mTopDataObserver;
    private ViewPager mViewPager;
    private MultiSlidingTabStripAType multiSlidingTabStrip;
    private Runnable prefetchRunnable;
    private final int switchTabInsidePreFetchDelayDuration;
    private String userId;

    /* loaded from: classes6.dex */
    public interface a {
        void a(RecyclerView recyclerView);
    }

    /* loaded from: classes6.dex */
    public interface b {
    }

    static {
        kge.a(-1443432565);
        kge.a(1677202577);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(GoodsLiveStateMutitabView goodsLiveStateMutitabView, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "GoodsLiveStateMutitabView";
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool access$000(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("18fc915b", new Object[]{goodsLiveStateMutitabView}) : goodsLiveStateMutitabView.mGoodListRecycledViewPool;
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool access$002(GoodsLiveStateMutitabView goodsLiveStateMutitabView, RecyclerView.RecycledViewPool recycledViewPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("9fb147ab", new Object[]{goodsLiveStateMutitabView, recycledViewPool});
        }
        goodsLiveStateMutitabView.mGoodListRecycledViewPool = recycledViewPool;
        return recycledViewPool;
    }

    public static /* synthetic */ List access$100(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d6a7b169", new Object[]{goodsLiveStateMutitabView}) : goodsLiveStateMutitabView.liveStateViewList;
    }

    public static /* synthetic */ int access$200(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40ef8570", new Object[]{goodsLiveStateMutitabView})).intValue() : goodsLiveStateMutitabView.currentTab;
    }

    public static /* synthetic */ int access$202(GoodsLiveStateMutitabView goodsLiveStateMutitabView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc87849b", new Object[]{goodsLiveStateMutitabView, new Integer(i)})).intValue();
        }
        goodsLiveStateMutitabView.currentTab = i;
        return i;
    }

    public static /* synthetic */ String access$300(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5605e44", new Object[]{goodsLiveStateMutitabView}) : goodsLiveStateMutitabView.currentTabCategory;
    }

    public static /* synthetic */ void access$400(GoodsLiveStateMutitabView goodsLiveStateMutitabView, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ca8bac", new Object[]{goodsLiveStateMutitabView, new Integer(i), new Boolean(z)});
        } else {
            goodsLiveStateMutitabView.handlePagerChanged(i, z);
        }
    }

    public static /* synthetic */ Handler access$500(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("973f51ec", new Object[]{goodsLiveStateMutitabView}) : goodsLiveStateMutitabView.mHandler;
    }

    public static /* synthetic */ Runnable access$600(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("a7ead1fb", new Object[]{goodsLiveStateMutitabView}) : goodsLiveStateMutitabView.prefetchRunnable;
    }

    public static /* synthetic */ int access$700(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bf91b4b", new Object[]{goodsLiveStateMutitabView})).intValue() : goodsLiveStateMutitabView.switchTabInsidePreFetchDelayDuration;
    }

    public static /* synthetic */ String access$800(GoodsLiveStateMutitabView goodsLiveStateMutitabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2edfd9c9", new Object[]{goodsLiveStateMutitabView}) : goodsLiveStateMutitabView.userId;
    }

    public List<SingleTabBaseView> getLiveStateViewList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d94c74e", new Object[]{this}) : this.liveStateViewList;
    }

    public int getCurrentTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3327aecc", new Object[]{this})).intValue() : this.currentTab;
    }

    public GoodsLiveStateMutitabView(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, boolean z) {
        super(cVar, z);
        this.frameTracer = new hia();
        this.mMultiTabViewDataGetter = new a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView.a
            public void a(RecyclerView recyclerView) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
                } else if (GoodsLiveStateMutitabView.access$000(GoodsLiveStateMutitabView.this) != null) {
                    recyclerView.setRecycledViewPool(GoodsLiveStateMutitabView.access$000(GoodsLiveStateMutitabView.this));
                } else {
                    GoodsLiveStateMutitabView.access$002(GoodsLiveStateMutitabView.this, recyclerView.getRecycledViewPool());
                }
            }
        };
        this.prefetchRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this) == null || GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(GoodsLiveStateMutitabView.access$200(GoodsLiveStateMutitabView.this)) == null) {
                } else {
                    ((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(GoodsLiveStateMutitabView.access$200(GoodsLiveStateMutitabView.this))).preFetchInsideDetailData(hhz.OPEN_SOURCE_SWITCH_GOODLIST_TAB);
                }
            }
        };
        initView();
        this.mHandler = new Handler();
        this.switchTabInsidePreFetchDelayDuration = hir.t();
        this.frameTracer.a((Activity) getContext());
        his.b(TAG, "init() | regiester. " + this);
        ddw.a().a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void showPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7932290", new Object[]{this});
            return;
        }
        show();
        handlePagerChanged(this.currentTab, false);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.userId = pmd.a().q().a();
        this.liveStateViewList.get(0).initData();
        this.currentTabCategory = this.liveStateViewList.get(0).categoryId;
        if (this.mGoodLiveContext == null) {
            return;
        }
        this.mGoodLiveContext.d = this.currentTabCategory;
        this.mGoodLiveContext.a(this.liveStateViewList.get(0).getItemCategory());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_live_state_mutitab_layout_flexalocal, (ViewGroup) null);
        this.mViewPager = (ViewPager) inflate.findViewById(R.id.taolive_goods_live_state_mutitab_viewpager);
        MultiSlidingTabStripAType multiSlidingTabStripAType = (MultiSlidingTabStripAType) inflate.findViewById(R.id.taolive_goods_live_state_mutitab_strip);
        MultiSlidingTabStripAType multiSlidingTabStripAType2 = (MultiSlidingTabStripAType) inflate.findViewById(R.id.taolive_goods_live_state_mutitab_strip2);
        MultiSlidingTabStripAType multiSlidingTabStripAType3 = (MultiSlidingTabStripAType) inflate.findViewById(R.id.taolive_goods_live_state_mutitab_strip3);
        multiSlidingTabStripAType2.setVisibility(8);
        multiSlidingTabStripAType3.setVisibility(8);
        multiSlidingTabStripAType.setVisibility(8);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.mGoodLiveContext)) {
            if (this.mGoodLiveContext.c.x) {
                this.multiSlidingTabStrip = multiSlidingTabStripAType3;
                multiSlidingTabStripAType3.setEnableNewTabUI(true);
            } else {
                this.multiSlidingTabStrip = multiSlidingTabStripAType2;
            }
        } else {
            this.multiSlidingTabStrip = multiSlidingTabStripAType;
        }
        this.mTabCover = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_live_state_mutitab_cover);
        AliUrlImageView aliUrlImageView = this.mTabCover;
        if (aliUrlImageView != null) {
            aliUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN012Qu0He1UDGPBs0Ias_!!6000000002483-2-tps-136-120.png");
        }
        this.liveStateViewList = new ArrayList();
        this.liveStateViewList.clear();
        initMutitabLiveStateView(this.liveStateViewList);
        this.mLiveStateMutitabViewpagerAdapter = new hji(this.mGoodLiveContext, this.mGoodLiveContext.f(), this.liveStateViewList);
        this.mViewPager.setAdapter(this.mLiveStateMutitabViewpagerAdapter);
        this.multiSlidingTabStrip.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else if (StringUtils.equals(((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(i)).categoryId, GoodsLiveStateMutitabView.access$300(GoodsLiveStateMutitabView.this))) {
                    GoodsLiveStateMutitabView.access$202(GoodsLiveStateMutitabView.this, i);
                } else {
                    GoodsLiveStateMutitabView.access$400(GoodsLiveStateMutitabView.this, i, true);
                    if (GoodsLiveStateMutitabView.access$500(GoodsLiveStateMutitabView.this) != null) {
                        GoodsLiveStateMutitabView.access$500(GoodsLiveStateMutitabView.this).postDelayed(GoodsLiveStateMutitabView.access$600(GoodsLiveStateMutitabView.this), GoodsLiveStateMutitabView.access$700(GoodsLiveStateMutitabView.this));
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("user_id", GoodsLiveStateMutitabView.access$800(GoodsLiveStateMutitabView.this));
                    hashMap.put("categoryType", ((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(i)).categoryType);
                    hashMap.put("class_number", String.valueOf(i));
                    hashMap.put("class_total", String.valueOf(GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).size()));
                    hashMap.put("categoryName", ((SingleTabBaseView) GoodsLiveStateMutitabView.access$100(GoodsLiveStateMutitabView.this).get(i)).tabName);
                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                        return;
                    }
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("itemclass_click", hashMap);
                }
            }
        });
        this.multiSlidingTabStrip.setViewPager(this.mViewPager);
        return inflate;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.goods.preheat.tab".equals(str)) {
            for (SingleTabBaseView singleTabBaseView : this.liveStateViewList) {
                if (singleTabBaseView.getItemCategory().isPreheatTab()) {
                    this.mViewPager.setCurrentItem(i);
                    handlePagerChanged(i, true);
                    return;
                }
                i++;
            }
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.goods.preheat.tab"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mGoodLiveContext == null) {
            return null;
        }
        return this.mGoodLiveContext.D();
    }

    private void handlePagerChanged(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67eacff1", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.currentTab = i;
        this.currentTabCategory = this.liveStateViewList.get(i).categoryId;
        if (this.mGoodLiveContext != null) {
            this.mGoodLiveContext.d = this.currentTabCategory;
            this.mGoodLiveContext.I = this.liveStateViewList.get(i).tabName;
        }
        this.liveStateViewList.get(i).showPackage(z);
    }

    public void setTopDataObserver(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bdacbbe", new Object[]{this, bVar});
        } else {
            this.mTopDataObserver = bVar;
        }
    }

    public void refreshCategoriesNav(List<ItemCategory> list, String str, List<String> list2) {
        boolean z;
        SingleTabBaseView constructTabView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b179357f", new Object[]{this, list, str, list2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<SingleTabBaseView> list3 = this.liveStateViewList;
        if (list3 == null || list3.size() <= 0) {
            return;
        }
        ArrayList<SingleTabBaseView> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ItemCategory itemCategory : list) {
            if (itemCategory != null) {
                Iterator<SingleTabBaseView> it = this.liveStateViewList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    SingleTabBaseView next = it.next();
                    if (!StringUtils.isEmpty(next.categoryId) && next.categoryId.equals(itemCategory.categoryId)) {
                        next.setItemCategory(itemCategory);
                        arrayList2.add(next);
                        z = true;
                        break;
                    }
                }
                if (!z && (constructTabView = SingleTabBaseView.constructTabView(this.mGoodLiveContext, itemCategory, this.mMultiTabViewDataGetter, false)) != null) {
                    constructTabView.initView();
                    arrayList2.add(constructTabView);
                }
                arrayList3.add(itemCategory.categoryId);
                arrayList.add(StringUtils.isEmpty(itemCategory.bizType) ? "null" : itemCategory.bizType);
            }
        }
        int i = -1;
        int i2 = -1;
        for (SingleTabBaseView singleTabBaseView : arrayList2) {
            if (!StringUtils.isEmpty(this.currentTabCategory) && this.currentTabCategory.equals(singleTabBaseView.categoryId)) {
                i = arrayList2.indexOf(singleTabBaseView);
            }
            if (!StringUtils.isEmpty(str) && StringUtils.equals(singleTabBaseView.categoryId, str)) {
                i2 = arrayList2.indexOf(singleTabBaseView);
            }
        }
        for (SingleTabBaseView singleTabBaseView2 : this.liveStateViewList) {
            if (!arrayList3.contains(singleTabBaseView2.categoryId)) {
                singleTabBaseView2.destroy();
            }
        }
        this.liveStateViewList.clear();
        this.liveStateViewList.addAll(arrayList2);
        this.mLiveStateMutitabViewpagerAdapter.notifyDataSetChanged();
        this.multiSlidingTabStrip.notifyDataSetChanged(i);
        if (i2 >= 0 && i2 != i && hir.I()) {
            handlePagerChanged(i2, true);
            this.mViewPager.setCurrentItem(i2);
            sxt.a(list2, str);
        } else if (i >= 0) {
            this.mViewPager.setCurrentItem(i);
        }
        if (this.liveStateViewList.size() > 1) {
            this.multiSlidingTabStrip.setVisibility(0);
            ddw.a().a("com.taobao.taolive.goods.show.nav_layout_split.inner", true, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c.a(this.mGoodLiveContext));
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("user_id", this.userId);
            hashMap.put("class_number", String.valueOf(i));
            hashMap.put("class_total", String.valueOf(list.size()));
            hashMap.put("categoryIds", l.a((List<String>) arrayList3, '&'));
            hashMap.put("categoryTypes", l.a((List<String>) arrayList, '&'));
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.n()) {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().c("itemclass_view", hashMap);
                } else {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b("itemclass_view", hashMap);
                }
            }
        } else {
            this.multiSlidingTabStrip.setVisibility(8);
            ddw.a().a("com.taobao.taolive.goods.show.nav_layout_split.inner", false, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c.a(this.mGoodLiveContext));
        }
        if (this.mTabCover == null) {
            return;
        }
        if (this.liveStateViewList.size() > 1 && com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.mGoodLiveContext) && this.mGoodLiveContext.c.x) {
            this.mTabCover.setVisibility(0);
        } else {
            this.mTabCover.setVisibility(8);
        }
    }

    public void clearCategoriesNav() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5861aba1", new Object[]{this});
        } else if (this.liveStateViewList.size() > 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.liveStateViewList.get(0));
            for (SingleTabBaseView singleTabBaseView : this.liveStateViewList) {
                if (!singleTabBaseView.categoryId.equals("0")) {
                    singleTabBaseView.destroy();
                }
            }
            this.liveStateViewList.clear();
            this.liveStateViewList.addAll(arrayList);
            this.mLiveStateMutitabViewpagerAdapter.notifyDataSetChanged();
            this.multiSlidingTabStrip.notifyDataSetChanged(0);
            this.mViewPager.setCurrentItem(0);
            this.multiSlidingTabStrip.setVisibility(8);
        }
    }

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        SingleTabBaseView defaultTabView = getDefaultTabView();
        if (defaultTabView == null) {
            return;
        }
        defaultTabView.onHide();
    }

    private void initMutitabLiveStateView(List<SingleTabBaseView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bc1d7a", new Object[]{this, list});
            return;
        }
        SingleTabBaseView constructTabView = SingleTabBaseView.constructTabView(this.mGoodLiveContext, ItemCategory.constructDefaultCategory(), this.mMultiTabViewDataGetter, false);
        if (constructTabView == null) {
            return;
        }
        constructTabView.initView();
        if ((constructTabView instanceof NonPreheatTabView) && this.mGoodLiveContext.n()) {
            ((NonPreheatTabView) constructTabView).recoverFromData();
        }
        list.add(constructTabView);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    /* renamed from: initInjector  reason: collision with other method in class */
    public hjg mo967initInjector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hjg) ipChange.ipc$dispatch("f2022636", new Object[]{this}) : new c(this.mGoodLiveContext);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        this.frameTracer.a((Activity) getContext(), this.mGoodLiveContext, this.mGoodLiveContext.L.f);
        List<SingleTabBaseView> list = this.liveStateViewList;
        if (list != null) {
            for (SingleTabBaseView singleTabBaseView : list) {
                singleTabBaseView.destroy();
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.prefetchRunnable);
        }
        his.b(TAG, "destroy() | unregiester.   " + this);
        ddw.a().b(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        SingleTabBaseView currentTabView = getCurrentTabView();
        if (currentTabView == null) {
            return;
        }
        currentTabView.resume();
    }

    private boolean isCurrentCategory(String str) {
        ItemCategory itemCategory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8da89e2", new Object[]{this, str})).booleanValue();
        }
        int size = this.liveStateViewList.size();
        int i = this.currentTab;
        if (i >= size || (itemCategory = this.liveStateViewList.get(i).getItemCategory()) == null) {
            return false;
        }
        return StringUtils.equals(str, itemCategory.categoryId);
    }

    public boolean switchToTab(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cfc3e5b", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !this.liveStateViewList.isEmpty()) {
            for (int i = 0; i < this.liveStateViewList.size(); i++) {
                ItemCategory itemCategory = this.liveStateViewList.get(i).getItemCategory();
                if (StringUtils.equals(itemCategory.categoryId, str)) {
                    this.mGoodLiveContext.a(itemCategory);
                    this.currentTabCategory = itemCategory.categoryId;
                    this.mViewPager.setCurrentItem(i);
                    return true;
                }
            }
        }
        return false;
    }

    private SingleTabBaseView getCurrentTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleTabBaseView) ipChange.ipc$dispatch("c095f783", new Object[]{this});
        }
        int currentTab = getCurrentTab();
        if (this.liveStateViewList.size() <= currentTab) {
            return this.liveStateViewList.get(0);
        }
        return this.liveStateViewList.get(currentTab);
    }

    private SingleTabBaseView getDefaultTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleTabBaseView) ipChange.ipc$dispatch("3292d84b", new Object[]{this});
        }
        List<SingleTabBaseView> list = this.liveStateViewList;
        if (list != null && !list.isEmpty()) {
            for (SingleTabBaseView singleTabBaseView : this.liveStateViewList) {
                if (singleTabBaseView.getItemCategory().isDefaultTab()) {
                    return singleTabBaseView;
                }
            }
        }
        return null;
    }
}
