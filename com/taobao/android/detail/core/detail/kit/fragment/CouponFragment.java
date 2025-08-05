package com.taobao.android.detail.core.detail.kit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.coupon.BasicFetchCouponResult;
import com.taobao.android.detail.core.request.coupon.CouponListRequestClient;
import com.taobao.android.detail.core.request.coupon.CouponListRequestParams;
import com.taobao.android.detail.core.request.coupon.CouponListResult;
import com.taobao.android.detail.core.request.coupon.FetchCouponRequestClient;
import com.taobao.android.detail.core.request.coupon.FetchCouponRequestParams;
import com.taobao.android.detail.core.request.coupon.FetchShopCouponRequestClient;
import com.taobao.android.detail.core.request.coupon.FetchShopCouponRequestParams;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dzh;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_ITEM_ID = "item_id";
    public static final String EXTRA_SELLER_ID = "seller_id";
    public static final String EXTRA_SHOP_ID = "shop_id";
    private CouponAdapter couponAdapter;
    private ArrayList<CouponListResult.CouponItem> couponList;
    private CouponListRequestClient couponListRequestClient;
    private FetchCouponRequestClient fetchCouponClient;
    private FetchShopCouponRequestClient fetchShopCouponClient;
    private CouponListResult.CouponItem gettingCoupon;
    private com.taobao.android.trade.boost.request.mtop.a<CouponListResult> mtopRequestListener;
    private String sellerId = "-1";
    private String mShopId = "";
    private String mItemId = "";

    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9510a;
        public TextView b;
        public TextView c;
        public Button d;

        static {
            kge.a(-891659150);
        }

        public b() {
        }
    }

    static {
        kge.a(663925667);
        kge.a(1569893752);
    }

    public static /* synthetic */ Object ipc$super(CouponFragment couponFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1860817453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ CouponListResult.CouponItem access$000(CouponFragment couponFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CouponListResult.CouponItem) ipChange.ipc$dispatch("cd43ef00", new Object[]{couponFragment}) : couponFragment.gettingCoupon;
    }

    public static /* synthetic */ ArrayList access$100(CouponFragment couponFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("87d0a620", new Object[]{couponFragment}) : couponFragment.couponList;
    }

    public static /* synthetic */ void access$200(CouponFragment couponFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2865a53e", new Object[]{couponFragment, new Integer(i)});
        } else {
            couponFragment.getCoupon(i);
        }
    }

    public CouponFragment() {
        emu.a("com.taobao.android.detail.core.detail.kit.fragment.CouponFragment");
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e712", new Object[]{fragmentActivity, str, str2, str3, str4});
        } else if (fragmentActivity == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            startFragment(fragmentActivity, newInstance(str, str2, str3, str4));
        }
    }

    public static CouponFragment newInstance(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CouponFragment) ipChange.ipc$dispatch("915782f2", new Object[]{str, str2, str3, str4});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        bundle.putString("seller_id", str2);
        bundle.putString("shop_id", str3);
        bundle.putString("item_id", str4);
        CouponFragment couponFragment = new CouponFragment();
        couponFragment.setArguments(bundle);
        return couponFragment;
    }

    public void update(ArrayList<CouponListResult.CouponItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c280ada", new Object[]{this, arrayList});
            return;
        }
        this.couponList = arrayList;
        dismissLoading();
        CouponAdapter couponAdapter = this.couponAdapter;
        if (couponAdapter == null) {
            this.couponAdapter = new CouponAdapter();
            this.lvData.setAdapter((ListAdapter) this.couponAdapter);
        } else {
            couponAdapter.notifyDataSetChanged();
        }
        ArrayList<CouponListResult.CouponItem> arrayList2 = this.couponList;
        if (arrayList2 == null) {
            showErrorView();
        } else if (arrayList2.size() == 0) {
            showEmptyView();
        } else {
            dismissLoading();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.sellerId = arguments.getString("seller_id", "-1");
        this.mShopId = arguments.getString("shop_id", "-1");
        this.mItemId = arguments.getString("item_id", "-1");
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        CouponListRequestClient couponListRequestClient = this.couponListRequestClient;
        if (couponListRequestClient != null) {
            couponListRequestClient.cancel();
        }
        FetchCouponRequestClient fetchCouponRequestClient = this.fetchCouponClient;
        if (fetchCouponRequestClient != null) {
            fetchCouponRequestClient.cancel();
        }
        FetchShopCouponRequestClient fetchShopCouponRequestClient = this.fetchShopCouponClient;
        if (fetchShopCouponRequestClient == null) {
            return;
        }
        fetchShopCouponRequestClient.cancel();
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
            return;
        }
        showLoading();
        CouponListRequestParams couponListRequestParams = new CouponListRequestParams(String.valueOf(this.sellerId));
        if (this.mtopRequestListener == null) {
            this.mtopRequestListener = new com.taobao.android.trade.boost.request.mtop.a<CouponListResult>() { // from class: com.taobao.android.detail.core.detail.kit.fragment.CouponFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.boost.request.mtop.c
                public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                    } else {
                        a(mtopResponse);
                    }
                }

                @Override // com.taobao.android.trade.boost.request.mtop.c
                public /* synthetic */ void onSuccess(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    } else {
                        a((CouponListResult) obj);
                    }
                }

                @Override // com.taobao.android.trade.boost.request.mtop.a
                public void onSystemFailure(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                    } else {
                        a(mtopResponse);
                    }
                }

                public void a(CouponListResult couponListResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("61145692", new Object[]{this, couponListResult});
                        return;
                    }
                    ArrayList<CouponListResult.CouponItem> arrayList = couponListResult.result;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        Collections.sort(arrayList, new Comparator<CouponListResult.CouponItem>() { // from class: com.taobao.android.detail.core.detail.kit.fragment.CouponFragment.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.util.Comparator
                            public /* synthetic */ int compare(CouponListResult.CouponItem couponItem, CouponListResult.CouponItem couponItem2) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("6a9be197", new Object[]{this, couponItem, couponItem2})).intValue() : a(couponItem, couponItem2);
                            }

                            public int a(CouponListResult.CouponItem couponItem, CouponListResult.CouponItem couponItem2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Number) ipChange3.ipc$dispatch("36b7aabb", new Object[]{this, couponItem, couponItem2})).intValue();
                                }
                                if (couponItem.discountFee < couponItem2.discountFee) {
                                    return -1;
                                }
                                return couponItem.discountFee == couponItem2.discountFee ? 0 : 1;
                            }
                        });
                        CouponFragment.this.update(arrayList);
                        return;
                    }
                    CouponFragment.this.update(null);
                }

                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    } else {
                        CouponFragment.this.update(null);
                    }
                }
            };
        }
        if (this.couponListRequestClient == null) {
            this.couponListRequestClient = new CouponListRequestClient();
        }
        this.couponListRequestClient.execute(couponListRequestParams, this.mtopRequestListener, epo.f());
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        queryData();
    }

    private void getCoupon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0e15c0", new Object[]{this, new Integer(i)});
        } else if (!epo.g().b()) {
            epo.g().a(true);
            Toast.makeText(getActivity(), getActivity().getString(R.string.tm_str_pls_login), 0).show();
        } else {
            CouponListResult.CouponItem couponItem = this.couponList.get(i);
            this.gettingCoupon = couponItem;
            if (couponItem.type == 1) {
                dzh.h(getActivity());
                FetchCouponRequestParams fetchCouponRequestParams = new FetchCouponRequestParams(String.valueOf(this.sellerId), String.valueOf(this.gettingCoupon.activityId));
                this.fetchCouponClient = new FetchCouponRequestClient();
                this.fetchCouponClient.execute(fetchCouponRequestParams, new a(), epo.f());
            } else if (couponItem.type != 2) {
            } else {
                dzh.i(getActivity());
                FetchShopCouponRequestParams fetchShopCouponRequestParams = new FetchShopCouponRequestParams(String.valueOf(this.sellerId), String.valueOf(this.gettingCoupon.activityId), "103");
                this.fetchShopCouponClient = new FetchShopCouponRequestClient();
                this.fetchShopCouponClient.execute(fetchShopCouponRequestParams, new a(), epo.f());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class a<E extends BasicFetchCouponResult> implements com.taobao.android.trade.boost.request.mtop.a<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1870426547);
            kge.a(1595456606);
        }

        public a() {
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
            } else {
                a(mtopResponse);
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                a((a<E>) ((BasicFetchCouponResult) obj));
            }
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a18d984", new Object[]{this, e});
            } else if (e == null) {
            } else {
                if (e.isSuccess()) {
                    if (CouponFragment.access$000(CouponFragment.this) != null) {
                        CouponFragment.access$000(CouponFragment.this).canApply = false;
                    }
                    CouponFragment couponFragment = CouponFragment.this;
                    couponFragment.update(CouponFragment.access$100(couponFragment));
                }
                if (TextUtils.isEmpty(e.retMsg)) {
                    return;
                }
                Toast.makeText(CouponFragment.this.context, e.retMsg, 0).show();
            }
        }

        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            } else if (TextUtils.isEmpty(mtopResponse.getRetMsg())) {
            } else {
                Toast.makeText(CouponFragment.this.context, mtopResponse.getRetMsg(), 0).show();
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.a
        public void onSystemFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
            } else if (TextUtils.isEmpty(mtopResponse.getRetMsg())) {
            } else {
                Toast.makeText(CouponFragment.this.context, mtopResponse.getRetMsg(), 0).show();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class CouponAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1622298392);
        }

        public static /* synthetic */ Object ipc$super(CouponAdapter couponAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
            if (CouponFragment.access$100(CouponFragment.this) != null) {
                return CouponFragment.access$100(CouponFragment.this).size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : CouponFragment.access$100(CouponFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_detail_main_coupon_item, (ViewGroup) null);
                bVar = new b();
                bVar.f9510a = (TextView) view.findViewById(R.id.tm_mcart_coupon_amount_textview);
                bVar.b = (TextView) view.findViewById(R.id.tm_mcart_coupon_desc_textview);
                bVar.c = (TextView) view.findViewById(R.id.tm_mcart_coupon_valid_time_textview);
                bVar.d = (Button) view.findViewById(R.id.tm_mcart_coupon_get_btn);
                try {
                    bVar.d.setBackgroundResource(R.drawable.detail_border_btn);
                } catch (Exception unused) {
                }
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            bindData(i, viewGroup.getContext(), bVar);
            return view;
        }

        private void bindData(final int i, Context context, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e968bcad", new Object[]{this, new Integer(i), context, bVar});
                return;
            }
            CouponListResult.CouponItem couponItem = (CouponListResult.CouponItem) CouponFragment.access$100(CouponFragment.this).get(i);
            double d = couponItem.discountFee;
            SpannableString amountSpannableString = getAmountSpannableString(context, d);
            int amountColorRes = getAmountColorRes(d);
            bVar.f9510a.setText(amountSpannableString);
            bVar.f9510a.setTextColor(context.getResources().getColor(amountColorRes));
            bVar.b.setText(couponItem.desc);
            bVar.c.setText(couponItem.validTime);
            bVar.d.setEnabled(true);
            bVar.d.setText(R.string.tm_mcart_str_coupon_get);
            bVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.fragment.CouponFragment.CouponAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        CouponFragment.access$200(CouponFragment.this, i);
                    }
                }
            });
        }

        private SpannableString getAmountSpannableString(Context context, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpannableString) ipChange.ipc$dispatch("b9e8529a", new Object[]{this, context, new Double(d)});
            }
            String num = Integer.toString((int) d);
            String str = num + " 元";
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.detail_f12_dp);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.detail_f18_dp);
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.detail_f14_dp);
            SpannableString spannableString = new SpannableString(str);
            int indexOf = str.indexOf(".");
            if (indexOf > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), 0, indexOf, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize3), indexOf, num.length(), 33);
            } else {
                spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), 0, num.length(), 33);
            }
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), num.length(), str.length(), 33);
            return spannableString;
        }

        private int getAmountColorRes(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6ee1a3bf", new Object[]{this, new Double(d)})).intValue();
            }
            int i = R.color.detail_theme_color;
            if (d > 30.0d && d <= 50.0d) {
                return R.color.tm_mcart_color_amount_middle;
            }
            return d > 50.0d ? R.color.tm_mcart_color_amount_high : i;
        }
    }
}
