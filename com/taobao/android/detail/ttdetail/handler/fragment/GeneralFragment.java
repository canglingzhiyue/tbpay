package com.taobao.android.detail.ttdetail.handler.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class GeneralFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<Pair<String, String>> mInfoList;
    private GeneralAdapter mProductAdapter;
    private a styleInfo;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10747a;

        static {
            kge.a(-332195412);
        }
    }

    /* loaded from: classes5.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public TextView f10748a;
        public TextView b;
        public View c;

        static {
            kge.a(285390500);
        }

        public b() {
        }
    }

    static {
        kge.a(-2032352079);
    }

    public static /* synthetic */ Object ipc$super(GeneralFragment generalFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ ArrayList access$000(GeneralFragment generalFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9205e133", new Object[]{generalFragment}) : generalFragment.mInfoList;
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60a2df6", new Object[]{fragmentActivity, str, arrayList});
        } else {
            startFragment(fragmentActivity, str, arrayList, null);
        }
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, ArrayList<Pair<String, String>> arrayList, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a829e5d", new Object[]{fragmentActivity, str, arrayList, aVar});
        } else if (fragmentActivity == null || TextUtils.isEmpty(str) || arrayList == null || arrayList.size() == 0) {
        } else {
            FloatFragment.startFragment(fragmentActivity, newInstance(str, arrayList, aVar));
        }
    }

    public static GeneralFragment newInstance(String str, ArrayList<Pair<String, String>> arrayList, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GeneralFragment) ipChange.ipc$dispatch("aef3596f", new Object[]{str, arrayList, aVar});
        }
        Bundle bundle = new Bundle();
        bundle.putString("titleTextView", str);
        GeneralFragment generalFragment = new GeneralFragment();
        generalFragment.setArguments(bundle);
        generalFragment.setProductInfoList(arrayList);
        generalFragment.setStyleInfo(aVar);
        return generalFragment;
    }

    public void setProductInfoList(ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b931ea", new Object[]{this, arrayList});
        } else {
            this.mInfoList = arrayList;
        }
    }

    public void setStyleInfo(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572232cf", new Object[]{this, aVar});
        } else {
            this.styleInfo = aVar;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.mProductAdapter == null) {
            this.mProductAdapter = new GeneralAdapter();
            this.lvData.setAdapter((ListAdapter) this.mProductAdapter);
        }
        a aVar = this.styleInfo;
        if (aVar == null || aVar.f10747a) {
            return;
        }
        this.lvData.setDivider(null);
    }

    /* loaded from: classes5.dex */
    public class GeneralAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1598209466);
        }

        public static /* synthetic */ Object ipc$super(GeneralAdapter generalAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public GeneralAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (GeneralFragment.access$000(GeneralFragment.this) != null) {
                return GeneralFragment.access$000(GeneralFragment.this).size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : GeneralFragment.access$000(GeneralFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = LayoutInflater.from(y.a(viewGroup)).inflate(R.layout.tt_detail_main_general_info_item, (ViewGroup) null);
                bVar = new b();
                bVar.f10748a = (TextView) view.findViewById(R.id.name);
                bVar.b = (TextView) view.findViewById(R.id.value);
                bVar.c = view.findViewById(R.id.space);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            bindData(i, y.a(viewGroup), bVar);
            return view;
        }

        private void bindData(int i, Context context, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f90072df", new Object[]{this, new Integer(i), context, bVar});
                return;
            }
            Pair pair = (Pair) GeneralFragment.access$000(GeneralFragment.this).get(i);
            if (pair == null) {
                return;
            }
            if (pair.first != null && !TextUtils.isEmpty((CharSequence) pair.first)) {
                bVar.f10748a.setText((CharSequence) pair.first);
            } else {
                bVar.c.setVisibility(8);
                bVar.f10748a.setVisibility(8);
            }
            if (pair.second == null) {
                return;
            }
            bVar.b.setText((CharSequence) pair.second);
        }
    }
}
