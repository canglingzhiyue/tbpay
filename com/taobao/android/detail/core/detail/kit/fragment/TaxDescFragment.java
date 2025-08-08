package com.taobao.android.detail.core.detail.kit.fragment;

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
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.dzh;
import tb.emu;
import tb.kge;

@Deprecated
/* loaded from: classes4.dex */
public class TaxDescFragment extends GeneralFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TagDescAdapter mTagDescAdapter;
    private List<Map<String, List<Pair<String, String>>>> mTaxDescList;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9529a;
        public TextView b;
        public TextView c;

        static {
            kge.a(1515732150);
        }

        public a() {
        }
    }

    static {
        kge.a(1065244127);
    }

    public static /* synthetic */ Object ipc$super(TaxDescFragment taxDescFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.GeneralFragment, com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ List access$000(TaxDescFragment taxDescFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a674fe80", new Object[]{taxDescFragment}) : taxDescFragment.mTaxDescList;
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, List<Map<String, List<Pair<String, String>>>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807925", new Object[]{fragmentActivity, str, list});
        } else if (fragmentActivity == null || StringUtils.isEmpty(str) || list == null || list.size() == 0) {
        } else {
            FloatFragment.startFragment(fragmentActivity, newInstance(str, list));
            dzh.j(fragmentActivity);
        }
    }

    public TaxDescFragment() {
        emu.a("com.taobao.android.detail.core.detail.kit.fragment.TaxDescFragment");
    }

    public static TaxDescFragment newInstance(String str, List<Map<String, List<Pair<String, String>>>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaxDescFragment) ipChange.ipc$dispatch("1a2170f", new Object[]{str, list});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        TaxDescFragment taxDescFragment = new TaxDescFragment();
        taxDescFragment.setArguments(bundle);
        taxDescFragment.setProductInfoList(list);
        return taxDescFragment;
    }

    public void setProductInfoList(List<Map<String, List<Pair<String, String>>>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd3ccb1", new Object[]{this, list});
        } else {
            this.mTaxDescList = list;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.GeneralFragment, com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.mTagDescAdapter != null) {
            return;
        }
        this.mTagDescAdapter = new TagDescAdapter();
        this.lvData.setAdapter((ListAdapter) this.mTagDescAdapter);
    }

    /* loaded from: classes4.dex */
    public class TagDescAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(208533769);
        }

        public static /* synthetic */ Object ipc$super(TagDescAdapter tagDescAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public TagDescAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (TaxDescFragment.access$000(TaxDescFragment.this) != null) {
                return TaxDescFragment.access$000(TaxDescFragment.this).size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : TaxDescFragment.access$000(TaxDescFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x_detail_main_tax_desc_item, (ViewGroup) null);
                aVar = new a();
                aVar.f9529a = (TextView) view.findViewById(R.id.name);
                aVar.b = (TextView) view.findViewById(R.id.value);
                aVar.c = (TextView) view.findViewById(R.id.desc);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            bindData(i, aVar);
            return view;
        }

        private void bindData(int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("597f1f88", new Object[]{this, new Integer(i), aVar});
                return;
            }
            Map map = (Map) TaxDescFragment.access$000(TaxDescFragment.this).get(i);
            for (String str : map.keySet()) {
                if (!StringUtils.isEmpty(str) && map.get(str) != null && ((List) map.get(str)).size() > 0) {
                    aVar.f9529a.setText(str);
                    Pair pair = (Pair) ((List) map.get(str)).get(0);
                    if (pair == null) {
                        return;
                    }
                    if (!StringUtils.isEmpty((CharSequence) pair.first)) {
                        aVar.b.setText((CharSequence) pair.first);
                        aVar.b.setVisibility(0);
                    } else {
                        aVar.b.setVisibility(8);
                    }
                    if (!StringUtils.isEmpty((CharSequence) pair.second)) {
                        aVar.c.setText((CharSequence) pair.second);
                        aVar.c.setVisibility(0);
                    } else {
                        aVar.c.setVisibility(8);
                    }
                }
            }
        }
    }
}
