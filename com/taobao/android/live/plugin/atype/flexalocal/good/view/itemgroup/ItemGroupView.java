package com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup;

import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.f;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.ddv;
import tb.ddw;
import tb.hgv;
import tb.hhs;
import tb.hhw;
import tb.hhz;
import tb.hir;
import tb.hje;
import tb.hjo;
import tb.jwg;
import tb.kge;
import tb.khi;

/* loaded from: classes6.dex */
public class ItemGroupView extends GoodsBaseView<com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a> implements View.OnClickListener, ddv, hje {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int aggregationFirstShowPreFetchDelayDuration;
    private View mBackBtn;
    private View mCloseBtn;
    private a mCloseHandler;
    private AliUrlImageView mEmptyImage;
    private View mEmptyLayout;
    private AliUrlImageView mErrorImage;
    private View mErrorLayout;
    private f mGoodsView;
    private jwg mGroupAdapter;
    private FrameLayout mGroupInfoDXContainer;
    private Handler mHandler;
    private View mItemDataContainer;
    private ItemGroupPageInfo mPageInfo;
    private RecyclerView mRecyclerView;
    private TextView mRetryButton;
    private RecyclerView.OnScrollListener mScrollListener;
    private TextView mTips;
    private TextView mTitle;
    private final Runnable prefetchRunnable;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(1045688778);
        kge.a(1633372918);
        kge.a(-1201612728);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(ItemGroupView itemGroupView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "ItemGroupView";
    }

    public static /* synthetic */ hgv access$000(ItemGroupView itemGroupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("a535596f", new Object[]{itemGroupView}) : itemGroupView.mPresenter;
    }

    public static /* synthetic */ ItemGroupPageInfo access$100(ItemGroupView itemGroupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemGroupPageInfo) ipChange.ipc$dispatch("bd4c5ee", new Object[]{itemGroupView}) : itemGroupView.mPageInfo;
    }

    public static /* synthetic */ hgv access$200(ItemGroupView itemGroupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("4a3c171", new Object[]{itemGroupView}) : itemGroupView.mPresenter;
    }

    public ItemGroupView(c cVar, boolean z) {
        super(cVar, z);
        this.prefetchRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ItemGroupView.this.preFetchInsideDetailData(hhz.OPEN_SOURCE_OPE_AGGREGATION);
                }
            }
        };
        this.mScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.ItemGroupView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                int itemCount = recyclerView.getAdapter().getItemCount();
                int findLastVisibleItemPosition = ((hjo) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
                int childCount = recyclerView.getChildCount();
                if (findLastVisibleItemPosition < itemCount - 3 || childCount <= 0 || ItemGroupView.access$000(ItemGroupView.this) == null) {
                    return;
                }
                ((com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a) ItemGroupView.access$200(ItemGroupView.this)).b(ItemGroupView.access$100(ItemGroupView.this).id, ItemGroupView.access$100(ItemGroupView.this).type);
            }
        };
        initView();
        this.aggregationFirstShowPreFetchDelayDuration = hir.t();
        this.mHandler = new Handler();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_itemgroup_layout_flexalocal, (ViewGroup) null);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.mGoodLiveContext)) {
            inflate.setBackgroundResource(R.drawable.taolive_goods_package_dx_bg_group_flexalocal);
        }
        this.mTitle = (TextView) inflate.findViewById(R.id.taolive_good_itemgroup_title);
        this.mBackBtn = inflate.findViewById(R.id.taolive_good_itemgroup_btn_back);
        this.mBackBtn.setOnClickListener(this);
        this.mCloseBtn = inflate.findViewById(R.id.taolive_good_itemgroup_btn_close);
        this.mCloseBtn.setOnClickListener(this);
        ((TUrlImageView) inflate.findViewById(R.id.taolive_good_itemgroup_btn_close_img)).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01Pv6KZ11BwAWFPaJ8K_!!6000000000009-2-tps-90-92.png");
        this.mGroupInfoDXContainer = (FrameLayout) inflate.findViewById(R.id.taolive_good_itemgroup_keyinfo);
        this.mRecyclerView = (RecyclerView) inflate.findViewById(R.id.taolive_good_itemgroup_recyclerview);
        this.mRecyclerView.setLayoutManager(new hjo(this.mGoodLiveContext.f(), 1, false));
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mGroupAdapter = new khi(this.mGoodLiveContext, new ArrayList(), this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.mGroupAdapter);
        this.mRecyclerView.setItemViewCacheSize(0);
        this.mTips = (TextView) inflate.findViewById(R.id.taolive_good_itemgroup_tips);
        this.mItemDataContainer = inflate.findViewById(R.id.taolive_good_itemgroup_content);
        this.mEmptyLayout = inflate.findViewById(R.id.taolive_good_itemgroup_empty_layout);
        this.mEmptyImage = (AliUrlImageView) inflate.findViewById(R.id.taolive_good_itemgroup_empty_image);
        this.mEmptyImage.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01SzKoo829WrPPzGQF5_!!6000000008076-2-tps-220-220.png");
        this.mErrorLayout = inflate.findViewById(R.id.taolive_good_itemgroup_error_layout);
        this.mErrorImage = (AliUrlImageView) inflate.findViewById(R.id.taolive_good_itemgroup_error_image);
        this.mErrorImage.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01tM8zwX1oPtS5h7fFn_!!6000000005218-2-tps-330-330.png");
        this.mRetryButton = (TextView) inflate.findViewById(R.id.taolive_good_itemgroup_retry);
        this.mRetryButton.setOnClickListener(this);
        if (this.insidePrefetchHelper != null) {
            this.insidePrefetchHelper.a(this.mRecyclerView, hhz.OPEN_SOURCE_SCROLL_AGGREGATION);
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_good_itemgroup_btn_back) {
            a aVar = this.mCloseHandler;
            if (aVar != null) {
                aVar.a();
            }
            handleClose();
        } else if (view.getId() == R.id.taolive_good_itemgroup_btn_close) {
            a aVar2 = this.mCloseHandler;
            if (aVar2 != null) {
                aVar2.a();
            }
            handleClose();
        } else if (view.getId() != R.id.taolive_good_itemgroup_retry) {
        } else {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a) this.mPresenter).a(this.mPageInfo.id, this.mPageInfo.type);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    /* renamed from: initInjector */
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a mo967initInjector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a) ipChange.ipc$dispatch("c2dc91c2", new Object[]{this});
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a aVar = new com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a(this.mGoodLiveContext);
        showInitState();
        return aVar;
    }

    public void setPageInfo(f fVar, ItemGroupPageInfo itemGroupPageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2a339", new Object[]{this, fVar, itemGroupPageInfo});
            return;
        }
        this.mGoodsView = fVar;
        if (itemGroupPageInfo == null) {
            return;
        }
        this.mPageInfo = itemGroupPageInfo;
        this.mTitle.setText(itemGroupPageInfo.title);
        if ("back".equals(this.mPageInfo.topButton)) {
            this.mBackBtn.setVisibility(0);
            this.mCloseBtn.setVisibility(8);
        } else {
            this.mBackBtn.setVisibility(8);
            this.mCloseBtn.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.mPageInfo.goodsTips)) {
            this.mTips.setVisibility(8);
        } else {
            this.mTips.setVisibility(0);
        }
        if (this.mPageInfo.data != null && !this.mPageInfo.data.isEmpty()) {
            renderDXGroupInfo();
        }
        ddw.a().a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        ((com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a) this.mPresenter).a(this.mPageInfo.id, this.mPageInfo.type);
        this.mHandler.postDelayed(this.prefetchRunnable, this.aggregationFirstShowPreFetchDelayDuration);
    }

    @Override // tb.hjc
    public void showEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00b2ee1", new Object[]{this, str});
            return;
        }
        this.mItemDataContainer.setVisibility(8);
        this.mEmptyLayout.setVisibility(0);
        this.mErrorLayout.setVisibility(8);
    }

    @Override // tb.hjc
    public void showError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce476d5c", new Object[]{this, str});
            return;
        }
        this.mItemDataContainer.setVisibility(8);
        this.mEmptyLayout.setVisibility(8);
        this.mErrorLayout.setVisibility(0);
    }

    @Override // tb.hjc
    public void showGoodList(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ec5e0e", new Object[]{this, new Integer(i), str});
            return;
        }
        showInitState();
        this.mTips.setText(this.mPageInfo.goodsTips);
    }

    public void showInitState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39edd6b", new Object[]{this});
            return;
        }
        this.mItemDataContainer.setVisibility(0);
        this.mEmptyLayout.setVisibility(8);
        this.mErrorLayout.setVisibility(8);
    }

    @Override // tb.hjc
    public jwg getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwg) ipChange.ipc$dispatch("dd44ddec", new Object[]{this}) : this.mGroupAdapter;
    }

    @Override // tb.hjc
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.mContentView;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2034149202) {
            if (hashCode != 189607490) {
                if (hashCode == 224943025 && str.equals("com.taobao.taolive.hide.member.identification.inner")) {
                    c = 0;
                }
            } else if (str.equals("com.taobao.taolive.room.goodlist.timepoint.asked.inner")) {
                c = 1;
            }
        } else if (str.equals("com.taobao.taolive.room.goodlist.all.refresh.item.inner")) {
            c = 2;
        }
        if (c == 0) {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a) this.mPresenter).d();
        } else if ((c != 1 && c != 2) || !(obj instanceof LiveItem)) {
        } else {
            ((com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.a) this.mPresenter).b((LiveItem) obj);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.hide.member.identification.inner", "com.taobao.taolive.room.goodlist.timepoint.asked.inner", "com.taobao.taolive.room.goodlist.all.refresh.item.inner"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : c.a(this.mGoodLiveContext);
    }

    public void setCloseHandler(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a2b787f", new Object[]{this, aVar});
        } else {
            this.mCloseHandler = aVar;
        }
    }

    public ItemGroupPageInfo getPageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemGroupPageInfo) ipChange.ipc$dispatch("91d9b849", new Object[]{this}) : this.mPageInfo;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.mScrollListener);
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.prefetchRunnable);
        }
        this.mGoodsView = null;
        ddw.a().b(this);
    }

    private void handleClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff0c537", new Object[]{this});
            return;
        }
        ItemGroupPageInfo itemGroupPageInfo = this.mPageInfo;
        if (itemGroupPageInfo == null || !TextUtils.equals(itemGroupPageInfo.closeAction, hhw.ENTRY_TYPE_LIVE_CART)) {
            return;
        }
        this.mGoodsView.o();
    }

    private void renderDXGroupInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a428a54a", new Object[]{this});
            return;
        }
        DXRootView b = hhs.a().b(this.mGoodLiveContext.f(), "taolive_goods_aggregation_coupon_card");
        if (b == null) {
            return;
        }
        this.mGroupInfoDXContainer.addView(b);
        hhs.a().a(b, this.mPageInfo.data, this.mGoodLiveContext);
    }
}
