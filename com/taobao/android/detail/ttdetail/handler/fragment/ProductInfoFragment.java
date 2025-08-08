package com.taobao.android.detail.ttdetail.handler.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.odg;

@Deprecated
/* loaded from: classes5.dex */
public class ProductInfoFragment extends GeneralFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<Pair<String, String>> mInfoList;
    private ProductAdapter mProductAdapter;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f10749a;
        public TextView b;

        static {
            kge.a(1687313327);
        }

        public a() {
        }
    }

    static {
        kge.a(1749145734);
    }

    public static /* synthetic */ Object ipc$super(ProductInfoFragment productInfoFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.GeneralFragment, com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ ArrayList access$000(ProductInfoFragment productInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("5bd74cbe", new Object[]{productInfoFragment}) : productInfoFragment.mInfoList;
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60a2df6", new Object[]{fragmentActivity, str, arrayList});
        } else if (fragmentActivity == null || StringUtils.isEmpty(str) || arrayList == null || arrayList.size() == 0) {
        } else {
            FloatFragment.startFragment(fragmentActivity, newInstance(str, arrayList));
        }
    }

    public static ProductInfoFragment newInstance(String str, ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProductInfoFragment) ipChange.ipc$dispatch("ed89caf", new Object[]{str, arrayList});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        ProductInfoFragment productInfoFragment = new ProductInfoFragment();
        productInfoFragment.setArguments(bundle);
        productInfoFragment.setProductInfoList(arrayList);
        return productInfoFragment;
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.GeneralFragment
    public void setProductInfoList(ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b931ea", new Object[]{this, arrayList});
        } else {
            this.mInfoList = arrayList;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.GeneralFragment, com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.mProductAdapter != null) {
            return;
        }
        this.mProductAdapter = new ProductAdapter();
        this.lvData.setAdapter((ListAdapter) this.mProductAdapter);
    }

    /* loaded from: classes5.dex */
    public class ProductAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(767679326);
        }

        public static /* synthetic */ Object ipc$super(ProductAdapter productAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public ProductAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ProductInfoFragment.access$000(ProductInfoFragment.this) != null) {
                return ProductInfoFragment.access$000(ProductInfoFragment.this).size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : ProductInfoFragment.access$000(ProductInfoFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = LayoutInflater.from(y.a(viewGroup)).inflate(R.layout.tt_detail_main_product_info_item, (ViewGroup) null);
                aVar = new a();
                aVar.f10749a = (TextView) view.findViewById(R.id.name);
                if (odg.o().a()) {
                    ViewGroup.LayoutParams layoutParams = aVar.f10749a.getLayoutParams();
                    layoutParams.width = f.a(120.0f);
                    aVar.f10749a.setLayoutParams(layoutParams);
                }
                aVar.b = (TextView) view.findViewById(R.id.value);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            bindData(i, y.a(viewGroup), aVar);
            return view;
        }

        private void bindData(int i, Context context, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3618c4cb", new Object[]{this, new Integer(i), context, aVar});
                return;
            }
            Pair pair = (Pair) ProductInfoFragment.access$000(ProductInfoFragment.this).get(i);
            if (pair == null) {
                return;
            }
            if (pair.first != null) {
                aVar.f10749a.setText((CharSequence) pair.first);
            }
            if (pair.second == null) {
                return;
            }
            aVar.b.setText((CharSequence) pair.second);
        }
    }
}
