package com.taobao.android.detail.core.detail.fragment.weex;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.fragment.FloatFragment;
import com.taobao.android.detail.core.detail.kit.utils.LoginChecker;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.kit.utils.j;
import com.taobao.android.detail.core.detail.kit.view.widget.base.DetailIconFontTextView;
import com.taobao.android.detail.core.detail.widget.coupon.TMThreeRowToast;
import com.taobao.android.detail.core.detail.widget.coupon.TMTicket;
import com.taobao.android.detail.core.model.datamodel.coupon.CouponInfoModel;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.coupon.CouponInfoListClient;
import com.taobao.android.detail.core.request.coupon.CouponInfoListParams;
import com.taobao.android.detail.core.request.coupon.FetchCouponInfoClient;
import com.taobao.android.detail.core.request.coupon.FetchCouponInfoModel;
import com.taobao.android.detail.core.request.coupon.FetchCouponInfoParams;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecf;
import tb.emu;
import tb.enu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponInfoFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FROM_FIELD_VALUE_FOR_TAOBAO = "detail";
    private static final String QUERY_COUPON_FOR_DETAIL_MTOP_URL_FOR_TAOBAO = "mtop.macao.market.activity.applycoupon.applycouponsfordetail";
    public static final String UNKNOWN_ERROR_MSG = "小二很忙，系统很累，请稍后重试";
    private static final String YUAN_LOGO = "둫";
    private CouponInfoListClient couponInfoListRequestClient;
    private String fetchMtop;
    private List<CouponInfoModel.FullItem> fullItems;
    private boolean isExternal;
    private float mDensity;
    private String mItemId;
    private ProgressBar mLoading;
    private String mMtopUrl;
    private String mSellerId;
    private MtopRequestListener<CouponInfoModel> mtopRequestListener;
    private int point;
    private String pointText;
    private String sellerType;
    private CouponAdapter mAdapter = null;
    private boolean useCalculate = false;
    private View.OnClickListener externalCloseListener = new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                CouponInfoFragment.access$000(CouponInfoFragment.this);
            }
        }
    };

    static {
        kge.a(1941884268);
    }

    public static /* synthetic */ Object ipc$super(CouponInfoFragment couponInfoFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -426086497) {
            return super.getActivity();
        } else {
            if (hashCode != 1860817453) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    private void updataCouponBy2017(TMTicket tMTicket, FetchCouponInfoModel.ApplyDo applyDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b984d9bb", new Object[]{this, tMTicket, applyDo});
        }
    }

    public static /* synthetic */ void access$000(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d905eb3a", new Object[]{couponInfoFragment});
        } else {
            couponInfoFragment.externalClose();
        }
    }

    public static /* synthetic */ List access$100(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6e58ff6c", new Object[]{couponInfoFragment}) : couponInfoFragment.fullItems;
    }

    public static /* synthetic */ FragmentActivity access$1001(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("892f0efd", new Object[]{couponInfoFragment}) : super.getActivity();
    }

    public static /* synthetic */ List access$102(CouponInfoFragment couponInfoFragment, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f249cb19", new Object[]{couponInfoFragment, list});
        }
        couponInfoFragment.fullItems = list;
        return list;
    }

    public static /* synthetic */ Context access$1100(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bdf4a4a2", new Object[]{couponInfoFragment}) : couponInfoFragment.context;
    }

    public static /* synthetic */ String access$1200(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24f82215", new Object[]{couponInfoFragment}) : couponInfoFragment.mSellerId;
    }

    public static /* synthetic */ String access$1300(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("579e9f4", new Object[]{couponInfoFragment}) : couponInfoFragment.sellerType;
    }

    public static /* synthetic */ Context access$1400(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8827f265", new Object[]{couponInfoFragment}) : couponInfoFragment.context;
    }

    public static /* synthetic */ void access$1500(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f1acae", new Object[]{couponInfoFragment});
        } else {
            couponInfoFragment.dismissFetchLoading();
        }
    }

    public static /* synthetic */ Context access$1600(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ef4d0e7", new Object[]{couponInfoFragment}) : couponInfoFragment.context;
    }

    public static /* synthetic */ void access$1700(CouponInfoFragment couponInfoFragment, TMTicket tMTicket, FetchCouponInfoModel.ApplyDo applyDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efd06be", new Object[]{couponInfoFragment, tMTicket, applyDo});
        } else {
            couponInfoFragment.updateCoupon(tMTicket, applyDo);
        }
    }

    public static /* synthetic */ void access$1800(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376c5371", new Object[]{couponInfoFragment});
        } else {
            couponInfoFragment.showFetchLoading();
        }
    }

    public static /* synthetic */ String access$200(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f783464", new Object[]{couponInfoFragment}) : couponInfoFragment.pointText;
    }

    public static /* synthetic */ String access$202(CouponInfoFragment couponInfoFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14c00298", new Object[]{couponInfoFragment, str});
        }
        couponInfoFragment.pointText = str;
        return str;
    }

    public static /* synthetic */ int access$300(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee8091f0", new Object[]{couponInfoFragment})).intValue() : couponInfoFragment.point;
    }

    public static /* synthetic */ int access$302(CouponInfoFragment couponInfoFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1394c3d7", new Object[]{couponInfoFragment, new Integer(i)})).intValue();
        }
        couponInfoFragment.point = i;
        return i;
    }

    public static /* synthetic */ String access$400(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f07bc422", new Object[]{couponInfoFragment}) : couponInfoFragment.fetchMtop;
    }

    public static /* synthetic */ String access$402(CouponInfoFragment couponInfoFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c125ed6", new Object[]{couponInfoFragment, str});
        }
        couponInfoFragment.fetchMtop = str;
        return str;
    }

    public static /* synthetic */ CouponAdapter access$500(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CouponAdapter) ipChange.ipc$dispatch("24714415", new Object[]{couponInfoFragment}) : couponInfoFragment.mAdapter;
    }

    public static /* synthetic */ boolean access$600(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fb38c4", new Object[]{couponInfoFragment})).booleanValue() : couponInfoFragment.isExternal;
    }

    public static /* synthetic */ Context access$700(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5b7fc6f9", new Object[]{couponInfoFragment}) : couponInfoFragment.context;
    }

    public static /* synthetic */ boolean access$800(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("124cfd46", new Object[]{couponInfoFragment})).booleanValue() : couponInfoFragment.useCalculate;
    }

    public static /* synthetic */ boolean access$802(CouponInfoFragment couponInfoFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69560114", new Object[]{couponInfoFragment, new Boolean(z)})).booleanValue();
        }
        couponInfoFragment.useCalculate = z;
        return z;
    }

    public static /* synthetic */ float access$900(CouponInfoFragment couponInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1975df73", new Object[]{couponInfoFragment})).floatValue() : couponInfoFragment.mDensity;
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e712", new Object[]{fragmentActivity, str, str2, str3, str4});
            return;
        }
        CouponInfoFragment couponInfoFragment = new CouponInfoFragment(false);
        couponInfoFragment.mMtopUrl = str;
        couponInfoFragment.mSellerId = str2;
        couponInfoFragment.mItemId = str3;
        couponInfoFragment.sellerType = str4;
        startFragment(fragmentActivity, couponInfoFragment);
    }

    public static CouponInfoFragment getFragment(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CouponInfoFragment) ipChange.ipc$dispatch("c3efbd84", new Object[]{str, str2, str3, str4});
        }
        CouponInfoFragment couponInfoFragment = new CouponInfoFragment(true);
        couponInfoFragment.mMtopUrl = str;
        couponInfoFragment.mSellerId = str2;
        couponInfoFragment.mItemId = str3;
        couponInfoFragment.sellerType = str4;
        return couponInfoFragment;
    }

    public CouponInfoFragment(boolean z) {
        this.isExternal = false;
        this.isExternal = z;
        emu.a("com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment");
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.mDensity = getResources().getDisplayMetrics().density;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.x_detail_float_dialog2, viewGroup, false);
        this.mLoading = (ProgressBar) inflate.findViewById(R.id.loading_view);
        return inflate;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.lvData.setDivider(null);
        this.lvData.setPadding(this.lvData.getPaddingLeft(), this.lvData.getPaddingTop() + ((int) (this.mDensity * 12.0f)), this.lvData.getPaddingRight(), this.lvData.getPaddingBottom());
        this.mAdapter = new CouponAdapter();
        this.lvData.setAdapter((ListAdapter) this.mAdapter);
        if (this.isExternal) {
            this.tvClose.setOnClickListener(this.externalCloseListener);
            this.llContainer.setOnClickListener(this.externalCloseListener);
        }
        queryData();
    }

    private void externalClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4076f4", new Object[]{this});
            return;
        }
        dismiss();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
            return;
        }
        showLoading();
        CouponInfoListParams couponInfoListParams = new CouponInfoListParams();
        couponInfoListParams.setSellerId(this.mSellerId);
        couponInfoListParams.setTtid(epo.f());
        couponInfoListParams.setItemId(this.mItemId);
        if (!c.b()) {
            couponInfoListParams.setFrom("detail");
        }
        String str = this.sellerType;
        if (str != null) {
            couponInfoListParams.setSellerType(str);
        }
        if (this.mtopRequestListener == null) {
            this.mtopRequestListener = new MtopRequestListener<CouponInfoModel>() { // from class: com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.request.c
                public /* synthetic */ void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    } else {
                        a((CouponInfoModel) obj);
                    }
                }

                public void a(CouponInfoModel couponInfoModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388c472", new Object[]{this, couponInfoModel});
                        return;
                    }
                    CouponInfoFragment.this.dismissLoading();
                    if (couponInfoModel == null) {
                        return;
                    }
                    CouponInfoFragment.access$102(CouponInfoFragment.this, couponInfoModel.coupons);
                    if (CouponInfoFragment.access$100(CouponInfoFragment.this) == null || CouponInfoFragment.access$100(CouponInfoFragment.this).size() == 0) {
                        CouponInfoFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    CouponInfoFragment.this.showEmptyView();
                                }
                            }
                        });
                        return;
                    }
                    CouponInfoFragment.access$202(CouponInfoFragment.this, couponInfoModel.pointText);
                    CouponInfoFragment.access$302(CouponInfoFragment.this, couponInfoModel.point);
                    if (!c.b()) {
                        CouponInfoFragment.access$402(CouponInfoFragment.this, CouponInfoFragment.QUERY_COUPON_FOR_DETAIL_MTOP_URL_FOR_TAOBAO);
                    } else {
                        CouponInfoFragment.access$402(CouponInfoFragment.this, couponInfoModel.mtop);
                    }
                    CouponInfoFragment.access$500(CouponInfoFragment.this).notifyDataSetChanged();
                }

                @Override // com.taobao.android.detail.core.request.c
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                        return;
                    }
                    CouponInfoFragment.this.dismissLoading();
                    if (CouponInfoFragment.access$600(CouponInfoFragment.this) && mtopResponse != null && (mtopResponse.isSessionInvalid() || "ANDROID_SYS_LOGIN_CANCEL".equals(mtopResponse.getRetCode()))) {
                        CouponInfoFragment.access$000(CouponInfoFragment.this);
                    } else {
                        CouponInfoFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    CouponInfoFragment.this.showErrorView();
                                }
                            }
                        });
                    }
                }
            };
        }
        if (this.couponInfoListRequestClient == null) {
            CouponInfoListClient.mtopUrl = this.mMtopUrl;
            this.couponInfoListRequestClient = new CouponInfoListClient(couponInfoListParams, epo.f(), this.mtopRequestListener);
        }
        this.couponInfoListRequestClient.execute();
    }

    /* loaded from: classes4.dex */
    public class CouponAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private HashMap<Integer, View> cacheView = new HashMap<>();

        static {
            kge.a(689993457);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public CouponAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (CouponInfoFragment.access$100(CouponInfoFragment.this) == null) {
                return 0;
            }
            return CouponInfoFragment.access$100(CouponInfoFragment.this).size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            if (CouponInfoFragment.access$100(CouponInfoFragment.this) == null) {
                return null;
            }
            return (CouponInfoModel.FullItem) CouponInfoFragment.access$100(CouponInfoFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            boolean z;
            int indexOf;
            IpChange ipChange = $ipChange;
            int i3 = 4;
            int i4 = 0;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            View view2 = this.cacheView.get(Integer.valueOf(i));
            if (view2 == null) {
                view2 = LayoutInflater.from(CouponInfoFragment.access$700(CouponInfoFragment.this)).inflate(R.layout.x_detail_coupon_info, viewGroup, false);
                a aVar = new a();
                aVar.f9498a = (TextView) view2.findViewById(R.id.detail_coupon_title);
                aVar.b = (DetailIconFontTextView) view2.findViewById(R.id.detail_coupon_help);
                aVar.c = (TextView) view2.findViewById(R.id.detail_coupon_right_text);
                aVar.d = (LinearLayout) view2.findViewById(R.id.coupon_container);
                CouponInfoModel.FullItem fullItem = (CouponInfoModel.FullItem) CouponInfoFragment.access$100(CouponInfoFragment.this).get(i);
                aVar.f9498a.setText(fullItem.title);
                if (!TextUtils.isEmpty(fullItem.helpUrl)) {
                    aVar.b.setText(R.string.taodetail_iconfont_question);
                    aVar.b.setVisibility(0);
                    aVar.b.setTag(fullItem.helpUrl);
                    aVar.b.setOnClickListener(aVar);
                } else {
                    aVar.b.setVisibility(8);
                }
                if (!TextUtils.isEmpty(CouponInfoFragment.access$200(CouponInfoFragment.this)) && i == 0) {
                    aVar.c.setVisibility(0);
                    if (CouponInfoFragment.access$800(CouponInfoFragment.this)) {
                        aVar.c.setText(CouponInfoFragment.access$200(CouponInfoFragment.this).replace("%d", "计算中"));
                    } else {
                        aVar.c.setText(String.format(CouponInfoFragment.access$200(CouponInfoFragment.this), Integer.valueOf(CouponInfoFragment.access$300(CouponInfoFragment.this))));
                    }
                } else {
                    aVar.c.setVisibility(8);
                }
                aVar.e = fullItem;
                if (fullItem.couponList != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = (int) (CouponInfoFragment.access$900(CouponInfoFragment.this) * 15.0f);
                    for (CouponInfoModel.CouponInfo couponInfo : fullItem.couponList) {
                        TMTicket tMTicket = new TMTicket(viewGroup.getContext());
                        tMTicket.setCouponType(fullItem.type);
                        tMTicket.setType(couponInfo.displayType);
                        tMTicket.setOnTicketClickListener(aVar);
                        if (couponInfo.displayType != i3) {
                            tMTicket.setPadding((int) (CouponInfoFragment.access$900(CouponInfoFragment.this) * 10.0f), (int) (CouponInfoFragment.access$900(CouponInfoFragment.this) * 10.0f), (int) (CouponInfoFragment.access$900(CouponInfoFragment.this) * 10.0f), i4);
                        }
                        tMTicket.setTag(couponInfo);
                        aVar.d.addView(tMTicket, layoutParams);
                        if (couponInfo.styles != null) {
                            if (couponInfo.displayType == 4) {
                                tMTicket.setWatermarkUrl(couponInfo.styles.bgImage);
                            } else {
                                tMTicket.setWatermarkUrl("http:" + couponInfo.styles.bgImage);
                            }
                            if (!TextUtils.isEmpty(couponInfo.styles.bgColor)) {
                                try {
                                    tMTicket.setBgColor(Color.parseColor(couponInfo.styles.bgColor));
                                } catch (Exception unused) {
                                }
                            }
                            if (!TextUtils.isEmpty(couponInfo.styles.textColor)) {
                                try {
                                    tMTicket.setTextColor(Color.parseColor(couponInfo.styles.textColor));
                                } catch (Exception unused2) {
                                }
                            }
                            if (!TextUtils.isEmpty(couponInfo.styles.bottomTextColor)) {
                                try {
                                    tMTicket.setBottomTextColor(Color.parseColor(couponInfo.styles.bottomTextColor));
                                } catch (Exception unused3) {
                                }
                            }
                            if (!TextUtils.isEmpty(couponInfo.styles.dashColor)) {
                                try {
                                    tMTicket.setDashColor(Color.parseColor(couponInfo.styles.dashColor));
                                } catch (Exception unused4) {
                                }
                            }
                            if (!TextUtils.isEmpty(couponInfo.styles.bgBottomColor)) {
                                try {
                                    tMTicket.setBottomBgColor(Color.parseColor(couponInfo.styles.bgBottomColor));
                                } catch (Exception unused5) {
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(couponInfo.titleLeftText)) {
                            tMTicket.setLeftPrefTitle(Html.fromHtml(couponInfo.titleLeftText));
                        }
                        if (!TextUtils.isEmpty(couponInfo.title)) {
                            try {
                                Float.parseFloat(couponInfo.title);
                                i2 = 30;
                            } catch (Exception unused6) {
                                i2 = 20;
                            }
                            tMTicket.setLeftTitle(couponInfo.title, i2);
                        }
                        if (!TextUtils.isEmpty(couponInfo.promotionUrl)) {
                            tMTicket.setleftTitleSuffixImage(couponInfo.promotionUrl);
                        }
                        if (couponInfo.promotionList != null && couponInfo.promotionList.size() > 0) {
                            tMTicket.setLeftIcon(couponInfo.promotionList);
                        }
                        if (couponInfo.subtitles != null && couponInfo.subtitles.size() > 0) {
                            tMTicket.setLeftDesc(couponInfo.subtitles);
                        }
                        if (!TextUtils.isEmpty(couponInfo.applyText)) {
                            if (!TextUtils.isEmpty(CouponInfoFragment.access$200(CouponInfoFragment.this))) {
                                CouponInfoFragment.access$300(CouponInfoFragment.this);
                            }
                            TextUtils.isEmpty(couponInfo.countText);
                            boolean equals = "true".equals(couponInfo.enabled);
                            String str = couponInfo.applyText;
                            Object[] objArr = new Object[1];
                            objArr[i4] = Integer.valueOf(couponInfo.pointConsume);
                            tMTicket.setRightTitle(String.format(str, objArr), equals);
                        }
                        if (couponInfo.displayType == 1) {
                            tMTicket.setRightTitle(Html.fromHtml(CouponInfoFragment.YUAN_LOGO), true);
                            tMTicket.setRightTitleSize(20);
                        }
                        if (!TextUtils.isEmpty(couponInfo.countText)) {
                            if (couponInfo.displayType == 1) {
                                tMTicket.setRightSubTitle(couponInfo.countText, true);
                                tMTicket.setRightSubTitleSize(16);
                            } else {
                                String str2 = couponInfo.countText;
                                Object[] objArr2 = new Object[1];
                                objArr2[i4] = Integer.valueOf(couponInfo.count);
                                SpannableString spannableString = new SpannableString(String.format(str2, objArr2));
                                if (couponInfo.count > 0 && (indexOf = couponInfo.countText.indexOf("%d")) >= 0) {
                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(tMTicket.getTextColor());
                                    spannableString.setSpan(foregroundColorSpan, indexOf, (couponInfo.count + "").length() + indexOf, 33);
                                }
                                tMTicket.setRightSubTitle(spannableString, false);
                            }
                        }
                        if (!TextUtils.isEmpty(couponInfo.bottomButtonText)) {
                            tMTicket.setBottomButton(couponInfo.bottomButtonText);
                        }
                        if (!TextUtils.isEmpty(couponInfo.bottomButtonJumpUrl)) {
                            tMTicket.setBottomJumpUrl(couponInfo.bottomButtonJumpUrl);
                        }
                        if (!TextUtils.isEmpty(couponInfo.bottomTitle)) {
                            tMTicket.setBottomText(couponInfo.bottomTitle);
                        }
                        if (couponInfo.displayType == 1) {
                            z = false;
                            tMTicket.hasMiddlePit(false);
                            tMTicket.hasRightFilter(true);
                            tMTicket.setMarginRightTitleSubTitle(0);
                        } else {
                            z = false;
                        }
                        if (couponInfo.displayType == 4) {
                            tMTicket.hasMiddlePit(z);
                            if (!TextUtils.isEmpty(couponInfo.leftIcon)) {
                                tMTicket.setLeftMoneyIconUrl(couponInfo.leftIcon);
                            }
                            if (!TextUtils.isEmpty(couponInfo.styles.rightBgImg)) {
                                tMTicket.setRightBgUrl(couponInfo.styles.rightBgImg);
                            }
                        }
                        if (!TextUtils.isEmpty(couponInfo.styles.applyTextColor)) {
                            try {
                                tMTicket.setApplyTextColor(Color.parseColor(couponInfo.styles.applyTextColor));
                            } catch (Exception unused7) {
                            }
                        }
                        if (!TextUtils.isEmpty(couponInfo.styles.countTextColor)) {
                            try {
                                tMTicket.setCountTextColor(Color.parseColor(couponInfo.styles.countTextColor));
                            } catch (Exception unused8) {
                            }
                        }
                        i3 = 4;
                        i4 = 0;
                    }
                }
                this.cacheView.put(Integer.valueOf(i), view2);
            }
            return view2;
        }
    }

    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener, TMTicket.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TextView f9498a;
        public DetailIconFontTextView b;
        public TextView c;
        public LinearLayout d;
        public CouponInfoModel.FullItem e;

        /* renamed from: com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment$a$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements LoginChecker.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CouponInfoModel.CouponInfo f9499a;
            public final /* synthetic */ TMTicket b;

            public AnonymousClass1(CouponInfoModel.CouponInfo couponInfo, TMTicket tMTicket) {
                this.f9499a = couponInfo;
                this.b = tMTicket;
            }

            @Override // com.taobao.android.detail.core.detail.kit.utils.LoginChecker.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                this.f9499a.isLoading = true;
                FetchCouponInfoParams fetchCouponInfoParams = new FetchCouponInfoParams();
                fetchCouponInfoParams.setSellerId(CouponInfoFragment.access$1200(CouponInfoFragment.this));
                fetchCouponInfoParams.setTtid(epo.f());
                fetchCouponInfoParams.setType(a.this.e.type);
                fetchCouponInfoParams.setUuid(this.f9499a.uuid);
                fetchCouponInfoParams.setAsac(a.this.e.asac);
                if (!c.b()) {
                    fetchCouponInfoParams.setFrom("detail");
                    if (CouponInfoFragment.access$1300(CouponInfoFragment.this) != null) {
                        fetchCouponInfoParams.setSellerType(CouponInfoFragment.access$1300(CouponInfoFragment.this));
                    }
                }
                fetchCouponInfoParams.setDisplayType(this.f9499a.displayType + "");
                fetchCouponInfoParams.setLotteryId(a.this.e.lotteryId);
                if (this.f9499a.fetchCouponInfoListener == null) {
                    this.f9499a.fetchCouponInfoListener = new MtopRequestListener<FetchCouponInfoModel>() { // from class: com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment.a.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail.core.request.c
                        public /* synthetic */ void b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                            } else {
                                a((FetchCouponInfoModel) obj);
                            }
                        }

                        public void a(final FetchCouponInfoModel fetchCouponInfoModel) {
                            String str;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("dba49a78", new Object[]{this, fetchCouponInfoModel});
                                return;
                            }
                            AnonymousClass1.this.f9499a.isLoading = false;
                            ecf.c(CouponInfoFragment.access$1400(CouponInfoFragment.this), String.valueOf(a.this.e.type));
                            CouponInfoFragment.access$1500(CouponInfoFragment.this);
                            if (fetchCouponInfoModel == null || fetchCouponInfoModel.applyDo == null) {
                                return;
                            }
                            final String string = CouponInfoFragment.this.getResources().getString(fetchCouponInfoModel.applyDo.success ? R.string.taodetail_iconfont_check : R.string.taodetail_iconfont_warn);
                            if (fetchCouponInfoModel.applyDo.count != null) {
                                AnonymousClass1.this.f9499a.count = fetchCouponInfoModel.applyDo.count.intValue();
                            }
                            if (fetchCouponInfoModel.applyDo.needNewPoint) {
                                if (fetchCouponInfoModel.applyDo.point == null) {
                                    CouponInfoFragment.access$802(CouponInfoFragment.this, true);
                                } else {
                                    CouponInfoFragment.access$302(CouponInfoFragment.this, fetchCouponInfoModel.applyDo.point.intValue());
                                    CouponInfoFragment.access$802(CouponInfoFragment.this, false);
                                }
                            }
                            if (!j.a(CouponInfoFragment.access$1600(CouponInfoFragment.this))) {
                                if (!TextUtils.isEmpty(fetchCouponInfoModel.applyDo.title)) {
                                    str = "" + fetchCouponInfoModel.applyDo.title;
                                } else {
                                    str = "";
                                }
                                if (!TextUtils.isEmpty(fetchCouponInfoModel.applyDo.subtitle)) {
                                    str = str + ":" + fetchCouponInfoModel.applyDo.subtitle;
                                }
                                if ("".equals(str)) {
                                    str = "小二很忙，系统很累，请稍后重试";
                                }
                                CouponInfoFragment.access$1700(CouponInfoFragment.this, AnonymousClass1.this.b, fetchCouponInfoModel.applyDo);
                                epo.a(str);
                                return;
                            }
                            CouponInfoFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.core.detail.fragment.weex.CouponInfoFragment.a.1.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    CouponInfoFragment.access$1700(CouponInfoFragment.this, AnonymousClass1.this.b, fetchCouponInfoModel.applyDo);
                                    TMThreeRowToast.a(CouponInfoFragment.this.getActivity(), string, fetchCouponInfoModel.applyDo.title, fetchCouponInfoModel.applyDo.subtitle, 0).b();
                                }
                            });
                        }

                        @Override // com.taobao.android.detail.core.request.c
                        public void a(MtopResponse mtopResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                                return;
                            }
                            CouponInfoFragment.access$1500(CouponInfoFragment.this);
                            AnonymousClass1.this.f9499a.isLoading = false;
                            String retMsg = mtopResponse.getRetMsg();
                            if (TextUtils.isEmpty(retMsg)) {
                                retMsg = "小二很忙，系统很累，请稍后重试";
                            }
                            Toast.makeText(CouponInfoFragment.this.getActivity(), retMsg, 0).show();
                        }
                    };
                }
                FetchCouponInfoClient.mtopUrl = CouponInfoFragment.access$400(CouponInfoFragment.this);
                if (this.f9499a.fetchCouponInfoClient == null) {
                    this.f9499a.fetchCouponInfoClient = new FetchCouponInfoClient(fetchCouponInfoParams, epo.f(), this.f9499a.fetchCouponInfoListener, a.this.e.type);
                }
                this.f9499a.fetchCouponInfoClient.execute();
                CouponInfoFragment.access$1800(CouponInfoFragment.this);
            }
        }

        static {
            kge.a(-825263351);
            kge.a(-567080311);
            kge.a(-1201612728);
        }

        public a() {
        }

        @Override // com.taobao.android.detail.core.detail.widget.coupon.TMTicket.c
        public void a(TMTicket tMTicket) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d4aa65b", new Object[]{this, tMTicket});
                return;
            }
            String bottomJumpUrl = tMTicket.getBottomJumpUrl();
            if (TextUtils.isEmpty(bottomJumpUrl)) {
                return;
            }
            f.a(CouponInfoFragment.access$1001(CouponInfoFragment.this), new enu(bottomJumpUrl));
            if (this.e == null) {
                return;
            }
            ecf.d(CouponInfoFragment.access$1100(CouponInfoFragment.this), String.valueOf(this.e.type));
        }

        @Override // com.taobao.android.detail.core.detail.widget.coupon.TMTicket.c
        public void b(TMTicket tMTicket) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("190c221c", new Object[]{this, tMTicket});
                return;
            }
            Object tag = tMTicket.getTag();
            if (tag == null) {
                return;
            }
            CouponInfoModel.CouponInfo couponInfo = (CouponInfoModel.CouponInfo) tag;
            if (couponInfo.isLoading) {
                return;
            }
            LoginChecker.a(CouponInfoFragment.this.getContext(), new AnonymousClass1(couponInfo, tMTicket));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Object tag = view.getTag();
            if (tag == null || !(tag instanceof String)) {
                return;
            }
            f.a(CouponInfoFragment.this.getActivity(), new enu((String) tag));
        }
    }

    private void showFetchLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8170f5c6", new Object[]{this});
        } else {
            this.mLoading.setVisibility(0);
        }
    }

    private void dismissFetchLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e01353", new Object[]{this});
        } else {
            this.mLoading.setVisibility(4);
        }
    }

    private void updateCoupon(TMTicket tMTicket, FetchCouponInfoModel.ApplyDo applyDo) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c88564", new Object[]{this, tMTicket, applyDo});
            return;
        }
        int type = tMTicket.getType();
        if (applyDo.applyText != null) {
            tMTicket.setRightTitle(applyDo.applyText, "true".equals(applyDo.enabled));
        }
        if (!TextUtils.isEmpty(applyDo.countText)) {
            if (type == 1) {
                tMTicket.setRightSubTitle(applyDo.countText, true);
                tMTicket.setRightSubTitleSize(16);
            } else {
                SpannableString spannableString = new SpannableString(String.format(applyDo.countText, applyDo.count));
                if (applyDo.count != null && applyDo.count.intValue() > 0 && (indexOf = applyDo.countText.indexOf("%d")) >= 0) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(tMTicket.getTextColor());
                    spannableString.setSpan(foregroundColorSpan, indexOf, (applyDo.count + "").length() + indexOf, 33);
                }
                tMTicket.setRightSubTitle(spannableString, false);
            }
        } else if (applyDo.countText != null) {
            tMTicket.setRightSubTitle(applyDo.countText, false);
        }
        if (!TextUtils.isEmpty(applyDo.applyTextColor)) {
            try {
                tMTicket.setApplyTextColor(Color.parseColor(applyDo.applyTextColor));
            } catch (Exception unused) {
            }
        }
        if (!TextUtils.isEmpty(applyDo.countTextColor)) {
            try {
                tMTicket.setCountTextColor(Color.parseColor(applyDo.countTextColor));
            } catch (Exception unused2) {
            }
        }
        if ("false".equals(applyDo.enabled)) {
            tMTicket.updateDisenabled();
        }
        if (type != 4) {
            return;
        }
        updataCouponBy2017(tMTicket, applyDo);
    }
}
