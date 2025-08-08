package com.taobao.android.detail.core.detail.kit.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.detail.kit.view.widget.SelectableImageView;
import com.taobao.android.detail.datasdk.model.datamodel.node.PropsNode;
import com.taobao.taobao.R;
import java.util.List;
import tb.dzh;
import tb.emu;
import tb.epm;
import tb.kge;

/* loaded from: classes4.dex */
public class BundleProductInfoFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<PropsNode.a> mBundleProps;
    private b mImgAdapter;
    private RecyclerView mImgViewList;
    private List<Pair<String, String>> mInfoList;
    private BundleProductAdapter mProductAdapter;
    private View mSelectedProductImgView;

    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9505a;
        public TextView b;

        static {
            kge.a(-602421609);
        }

        public d() {
        }
    }

    static {
        kge.a(150089374);
    }

    public static /* synthetic */ Object ipc$super(BundleProductInfoFragment bundleProductInfoFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != 1860817453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ List access$000(BundleProductInfoFragment bundleProductInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b339d2ff", new Object[]{bundleProductInfoFragment}) : bundleProductInfoFragment.mInfoList;
    }

    public static /* synthetic */ List access$100(BundleProductInfoFragment bundleProductInfoFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6bc6935e", new Object[]{bundleProductInfoFragment}) : bundleProductInfoFragment.mBundleProps;
    }

    public static /* synthetic */ void access$200(BundleProductInfoFragment bundleProductInfoFragment, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f628f48", new Object[]{bundleProductInfoFragment, view});
        } else {
            bundleProductInfoFragment.doSelectProduct(view);
        }
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, List<PropsNode.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807925", new Object[]{fragmentActivity, str, list});
        } else if (fragmentActivity == null || StringUtils.isEmpty(str) || list == null || list.size() == 0) {
        } else {
            FloatFragment.startFragment(fragmentActivity, newInstance(str, list));
            dzh.j(fragmentActivity);
        }
    }

    public static BundleProductInfoFragment newInstance(String str, List<PropsNode.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleProductInfoFragment) ipChange.ipc$dispatch("73ccaa70", new Object[]{str, list});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        BundleProductInfoFragment bundleProductInfoFragment = new BundleProductInfoFragment();
        bundleProductInfoFragment.setArguments(bundle);
        bundleProductInfoFragment.mBundleProps = list;
        return bundleProductInfoFragment;
    }

    public BundleProductInfoFragment() {
        emu.a("com.taobao.android.detail.core.detail.kit.fragment.BundleProductInfoFragment");
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : layoutInflater.inflate(R.layout.x_detail_float_dialog_production_params, viewGroup, false);
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.mProductAdapter == null) {
            this.mProductAdapter = new BundleProductAdapter();
            this.lvData.setAdapter((ListAdapter) this.mProductAdapter);
        }
        this.mImgViewList = (RecyclerView) view.findViewById(R.id.pro_imgs);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        this.mImgViewList.setLayoutManager(linearLayoutManager);
        this.mImgViewList.addItemDecoration(new a(((int) getResources().getDisplayMetrics().density) * 12));
        if (this.mImgViewList == null || this.mImgAdapter != null) {
            return;
        }
        this.mImgAdapter = new b();
        this.mImgViewList.setAdapter(this.mImgAdapter);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    /* loaded from: classes4.dex */
    public class BundleProductAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-94880024);
        }

        public static /* synthetic */ Object ipc$super(BundleProductAdapter bundleProductAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public BundleProductAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (BundleProductInfoFragment.access$000(BundleProductInfoFragment.this) != null) {
                return BundleProductInfoFragment.access$000(BundleProductInfoFragment.this).size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : BundleProductInfoFragment.access$000(BundleProductInfoFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            d dVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_detail_main_product_info_item, (ViewGroup) null);
                dVar = new d();
                dVar.f9505a = (TextView) view.findViewById(R.id.name);
                dVar.b = (TextView) view.findViewById(R.id.value);
                view.setTag(dVar);
            } else {
                dVar = (d) view.getTag();
            }
            bindData(i, viewGroup.getContext(), dVar);
            return view;
        }

        private void bindData(int i, Context context, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfda7144", new Object[]{this, new Integer(i), context, dVar});
                return;
            }
            Pair pair = (Pair) BundleProductInfoFragment.access$000(BundleProductInfoFragment.this).get(i);
            if (pair == null) {
                return;
            }
            if (pair.first != null) {
                dVar.f9505a.setText((CharSequence) pair.first);
            }
            if (pair.second == null) {
                return;
            }
            dVar.b.setText((CharSequence) pair.second);
        }
    }

    private void doSelectProduct(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa8e63", new Object[]{this, view});
        } else if (view == null || (view2 = this.mSelectedProductImgView) == view) {
        } else {
            if (view2 != null) {
                view2.setSelected(false);
            }
            this.mSelectedProductImgView = view;
            view.setSelected(true);
            this.mInfoList = this.mBundleProps.get(((Integer) view.getTag()).intValue()).f9989a;
            this.mProductAdapter.notifyDataSetChanged();
            this.lvData.setVisibility(0);
        }
    }

    /* loaded from: classes4.dex */
    public class b extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b = true;

        static {
            kge.a(-1576563787);
        }

        public b() {
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
            }
            SelectableImageView selectableImageView = (SelectableImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_detail_main_bundle_product_info_img, viewGroup, false);
            c cVar = new c(selectableImageView);
            cVar.f9504a = selectableImageView;
            return cVar;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            c cVar = (c) viewHolder;
            epm epmVar = new epm();
            epmVar.c = true;
            f.a(cVar.f9504a.getContext()).a(cVar.f9504a, ((PropsNode.a) BundleProductInfoFragment.access$100(BundleProductInfoFragment.this).get(i)).c, epmVar);
            cVar.f9504a.setTag(Integer.valueOf(i));
            if (i != 0 || !this.b) {
                return;
            }
            this.b = false;
            BundleProductInfoFragment.access$200(BundleProductInfoFragment.this, cVar.f9504a);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            if (BundleProductInfoFragment.access$100(BundleProductInfoFragment.this) == null) {
                return 0;
            }
            return BundleProductInfoFragment.access$100(BundleProductInfoFragment.this).size();
        }
    }

    /* loaded from: classes4.dex */
    public class c extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public SelectableImageView f9504a;

        static {
            kge.a(1312932720);
            kge.a(-1201612728);
        }

        public c(SelectableImageView selectableImageView) {
            super(selectableImageView);
            selectableImageView.setOnClickListener(this);
            this.f9504a = selectableImageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                BundleProductInfoFragment.access$200(BundleProductInfoFragment.this, view);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class a extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        static {
            kge.a(470068821);
        }

        public a(int i) {
            this.b = i;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else if (((Integer) view.getTag()).intValue() <= 0) {
            } else {
                rect.left += this.b;
            }
        }
    }
}
