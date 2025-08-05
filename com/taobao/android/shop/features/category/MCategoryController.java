package com.taobao.android.shop.features.category;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.features.category.a;
import com.taobao.android.shop.features.category.data.DataUtil;
import com.taobao.android.shop.utils.f;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.TBTimingUserTrack;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ixd;
import tb.ixj;
import tb.kge;

/* loaded from: classes6.dex */
public class MCategoryController implements a.b, IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public static int width;
    private ixd errorPageManager;
    public View headerview;
    public List<c> listdata;
    private a mAdapter;
    private CategoryDataItem[] mCatInfos;
    private d mCategoryListener;
    private ProgressBar mProgressBar;
    private ViewGroup mRootView;
    private String mUTArgs;
    public StickHeadersRecylerview recyclerView;
    public int tag = -1;
    private CustomBaseActivity mContext = null;
    private String mSellerId = "";
    private String mShopId = "";
    private b mBusiness = null;
    private boolean mIsLoaded = false;
    private boolean mIsDestory = false;

    /* renamed from: com.taobao.android.shop.features.category.MCategoryController$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15106a = new int[DataUtil.ContainerType.values().length];

        static {
            try {
                f15106a[DataUtil.ContainerType.ContainerType_Native.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15106a[DataUtil.ContainerType.ContainerType_Weex.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.taobao.android.shop.features.category.a.b
    public void OnItemLongClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6074c2", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ a access$000(MCategoryController mCategoryController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6ae8421d", new Object[]{mCategoryController}) : mCategoryController.mAdapter;
    }

    public static /* synthetic */ b access$100(MCategoryController mCategoryController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2691705b", new Object[]{mCategoryController}) : mCategoryController.mBusiness;
    }

    static {
        kge.a(-260071646);
        kge.a(-525336021);
        kge.a(1343331183);
        TAG = MCategoryController.class.getSimpleName();
    }

    public MCategoryController(CustomBaseActivity customBaseActivity, ViewGroup viewGroup, String str, String str2) {
        init(customBaseActivity, viewGroup, str, str2);
    }

    public void showErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
            return;
        }
        updateErrorView();
        ixj.a(this.mRootView, R.id.shop_category_view_progress, false);
    }

    private void init(CustomBaseActivity customBaseActivity, ViewGroup viewGroup, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c057f64c", new Object[]{this, customBaseActivity, viewGroup, str, str2});
            return;
        }
        this.mContext = customBaseActivity;
        this.mRootView = viewGroup;
        this.mSellerId = str;
        if (str2 != null) {
            this.mShopId = str2;
        }
        this.mProgressBar = (ProgressBar) this.mRootView.findViewById(R.id.shop_category_view_progress);
        this.mBusiness = new b(this.mSellerId, this.mShopId);
        this.mBusiness.a(this);
        width = f.b();
        this.recyclerView = (StickHeadersRecylerview) this.mRootView.findViewById(R.id.tbsearch_shop_cat_list);
        addView();
        this.recyclerView.setItemAnimator(null);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 2);
        this.recyclerView.setHasFixedSize(true);
        this.mAdapter = new a(null, this.mContext);
        this.mAdapter.a(this);
        this.recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.shop.features.category.MCategoryController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                if (str3.hashCode() == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                ((StickHeadersRecylerview) recyclerView).configureSuspendView(gridLayoutManager.findFirstVisibleItemPosition());
            }
        });
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.android.shop.features.category.MCategoryController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
                }
                if (MCategoryController.access$000(MCategoryController.this) == null) {
                    return 0;
                }
                return !MCategoryController.access$000(MCategoryController.this).a(i) ? 2 : 1;
            }
        });
        this.recyclerView.setLayoutManager(gridLayoutManager);
        this.recyclerView.setAdapter(this.mAdapter);
        if (!TextUtils.isEmpty(this.mSellerId)) {
            this.mUTArgs = "seller_id=" + this.mSellerId;
        } else if (TextUtils.isEmpty(this.mShopId)) {
        } else {
            this.mUTArgs = "shop_id=" + this.mShopId;
        }
    }

    public void setCategorySelectionListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7a3c1b", new Object[]{this, dVar});
        } else {
            this.mCategoryListener = dVar;
        }
    }

    public boolean getIsLoaded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f336b950", new Object[]{this})).booleanValue() : this.mIsLoaded;
    }

    public void startRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb849d4", new Object[]{this});
        } else if (this.mIsLoaded) {
        } else {
            this.mIsLoaded = true;
            this.mProgressBar.setVisibility(0);
            this.mBusiness.b();
        }
    }

    public ViewGroup getPageRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("f51a0562", new Object[]{this}) : this.mRootView;
    }

    public StickHeadersRecylerview getRecylerview() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StickHeadersRecylerview) ipChange.ipc$dispatch("9066fdd", new Object[]{this}) : this.recyclerView;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestory = true;
        this.mCategoryListener = null;
        this.mContext = null;
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.a((a.b) null);
            this.mAdapter.b();
            this.mAdapter = null;
        }
        b bVar = this.mBusiness;
        if (bVar != null) {
            bVar.a();
            this.mBusiness = null;
        }
        this.recyclerView.setOnScrollListener(null);
        this.recyclerView = null;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            processErr(i, mtopResponse, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            processErr(i, mtopResponse, obj);
        }
    }

    private void processErr(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ae07", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (this.mIsDestory) {
        } else {
            if (this.errorPageManager == null) {
                this.errorPageManager = new ixd(this.mContext, this.mRootView);
                this.errorPageManager.a();
            }
            this.errorPageManager.a(mtopResponse, null, null, new View.OnClickListener() { // from class: com.taobao.android.shop.features.category.MCategoryController.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        MCategoryController.access$100(MCategoryController.this).b();
                    }
                }
            });
            this.mProgressBar.setVisibility(8);
            this.mIsLoaded = false;
            a aVar = this.mAdapter;
            if (aVar == null) {
                return;
            }
            aVar.a((List<c>) null);
            this.mAdapter.notifyDataSetChanged();
            TBTimingUserTrack.instance().end("Page_Shop_Search", "Page_Shop_Search_Show_Empty");
            TBS.Ext.commitEvent("Shop", 4, "ShopCategory", mtopResponse.getRetCode(), Constants.AVAILABLE_ERROR, this.mUTArgs);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.mIsDestory) {
        } else {
            this.mProgressBar.setVisibility(8);
            if (!(baseOutDo instanceof CategoryResponse)) {
                return;
            }
            CategoryResponse categoryResponse = (CategoryResponse) baseOutDo;
            ixd ixdVar = this.errorPageManager;
            if (ixdVar != null) {
                ixdVar.c();
            }
            this.mIsLoaded = true;
            if (this.mAdapter == null) {
                return;
            }
            if (categoryResponse.mo2429getData() == null) {
                ixd ixdVar2 = this.errorPageManager;
                if (ixdVar2 == null) {
                    return;
                }
                ixdVar2.d();
                return;
            }
            processData(categoryResponse.mo2429getData());
        }
    }

    private void addView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22906d", new Object[]{this});
            return;
        }
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.SD_44dp);
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.shop_category_group_item_1, (ViewGroup) null);
        inflate.setLayoutParams(new AbsListView.LayoutParams(-1, dimensionPixelSize));
        this.recyclerView.setPinnedHeaderView(inflate);
    }

    @Override // com.taobao.android.shop.features.category.a.b
    public void OnItemClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680cb626", new Object[]{this, new Integer(i)});
        } else if (this.mCategoryListener == null) {
        } else {
            if (this.listdata.get(i).f != 2) {
                String str = "一级:" + this.listdata.get(i).h;
                TBS.Adv.itemSelectedOnPage("ShopCategory", CT.ListItem, "FirstCategorys", this.listdata.get(i).h);
            } else {
                TBS.Adv.itemSelectedOnPage("ShopCategory", CT.ListItem, "SecCategorys", this.listdata.get(i).h);
            }
            c cVar = this.listdata.get(i);
            this.mCategoryListener.a(cVar.f15114a, cVar.b);
        }
    }

    private void processData(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab343c2", new Object[]{this, categoryData});
        } else if (categoryData == null) {
        } else {
            int i = AnonymousClass5.f15106a[DataUtil.a(categoryData).ordinal()];
            if (i == 1) {
                showNativeContainer(true);
                showWeexContainer(false);
                onNativeData(categoryData);
            } else if (i != 2) {
            } else {
                showNativeContainer(false);
                showWeexContainer(true);
                onWeexData(categoryData);
            }
        }
    }

    private void onNativeData(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1269429", new Object[]{this, categoryData});
            return;
        }
        this.mCatInfos = categoryData.cats;
        CategoryDataItem categoryDataItem = new CategoryDataItem();
        categoryDataItem.id = "-1";
        categoryDataItem.name = "全部宝贝";
        CategoryDataItem[] categoryDataItemArr = this.mCatInfos;
        if (categoryDataItemArr != null && categoryDataItemArr.length > 0) {
            TBTimingUserTrack.instance().end("Page_Shop_Search", "load");
            ArrayList arrayList = new ArrayList();
            arrayList.add(categoryDataItem);
            for (CategoryDataItem categoryDataItem2 : this.mCatInfos) {
                arrayList.add(categoryDataItem2);
            }
            this.mCatInfos = (CategoryDataItem[]) arrayList.toArray(new CategoryDataItem[0]);
        } else {
            TBTimingUserTrack.instance().end("Page_Shop_Search", "Page_Shop_Search_Show_Empty");
            this.mCatInfos = new CategoryDataItem[1];
            this.mCatInfos[0] = categoryDataItem;
        }
        this.listdata = e.a(this.mCatInfos);
        this.mAdapter.a(this.listdata);
        this.mAdapter.notifyDataSetChanged();
        this.recyclerView.notifyDataChanged(this.listdata);
    }

    private void onWeexData(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9e37d3", new Object[]{this, categoryData});
            return;
        }
        d dVar = this.mCategoryListener;
        if (dVar == null) {
            return;
        }
        dVar.a(categoryData.url);
    }

    private void showNativeContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d371e0", new Object[]{this, new Boolean(z)});
        } else {
            ixj.a(this.mRootView, R.id.native_container, z);
        }
    }

    private void showWeexContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4806a38a", new Object[]{this, new Boolean(z)});
        } else {
            ixj.a(this.mRootView, R.id.weex_container, z);
        }
    }

    private void updateErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2d88b", new Object[]{this});
            return;
        }
        if (this.errorPageManager == null) {
            this.errorPageManager = new ixd(this.mContext, this.mRootView);
            this.errorPageManager.a();
        }
        this.errorPageManager.a(null, null, null, new View.OnClickListener() { // from class: com.taobao.android.shop.features.category.MCategoryController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    MCategoryController.access$100(MCategoryController.this).b();
                }
            }
        });
    }
}
