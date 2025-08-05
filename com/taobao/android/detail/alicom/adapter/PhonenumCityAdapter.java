package com.taobao.android.detail.alicom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.ContractCityInfo;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class PhonenumCityAdapter extends BaseAdapter implements SectionIndexer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ContractCityInfo> list;
    private Context mContext;
    private long selectItem = -1;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9329a;
        public TextView b;
        public ImageView c;
        public View d;

        static {
            kge.a(-1377155862);
        }
    }

    static {
        kge.a(-1470142933);
        kge.a(1085462021);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("dc4d8fcc", new Object[]{this});
        }
        return null;
    }

    public PhonenumCityAdapter(Context context, List<ContractCityInfo> list) {
        this.list = null;
        this.mContext = context;
        this.list = list;
    }

    public void setSelectItem(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785c2d8c", new Object[]{this, new Long(j)});
        } else {
            this.selectItem = j;
        }
    }

    public long getSelectItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6d77e820", new Object[]{this})).longValue() : this.selectItem;
    }

    public void updateListView(List<ContractCityInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7852a9c4", new Object[]{this, list});
            return;
        }
        this.list = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<ContractCityInfo> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public ContractCityInfo mo839getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContractCityInfo) ipChange.ipc$dispatch("a7c1e632", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.list.size()) {
            return this.list.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        ContractCityInfo contractCityInfo = this.list.get(i);
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.mContext).inflate(R.layout.detail_phonenum_city_item, (ViewGroup) null);
            aVar.b = (TextView) view2.findViewById(R.id.detail_phonenum_city_item_name);
            aVar.c = (ImageView) view2.findViewById(R.id.detail_phonenum_city_item_select);
            aVar.f9329a = (TextView) view2.findViewById(R.id.detail_phonenum_city_item_catagory);
            aVar.d = view2.findViewById(R.id.detail_phonenum_city_item_divider);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        int sectionForPosition = getSectionForPosition(i);
        if (sectionForPosition != -1 && i == getPositionForSection(sectionForPosition)) {
            aVar.f9329a.setVisibility(0);
            aVar.f9329a.setText(contractCityInfo.sortLetters);
        } else {
            aVar.f9329a.setVisibility(8);
        }
        if (sectionForPosition != -1 && sectionForPosition == getSectionForPosition(i + 1)) {
            aVar.d.setVisibility(0);
        } else {
            aVar.d.setVisibility(8);
        }
        if (i == this.selectItem) {
            aVar.c.setVisibility(0);
        } else {
            aVar.c.setVisibility(8);
        }
        aVar.b.setText(this.list.get(i).city.name);
        return view2;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efc76a4c", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            return this.list.get(i).sortLetters.charAt(0);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0637254", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < getCount(); i2++) {
            try {
                if (this.list.get(i2).sortLetters.toUpperCase().charAt(0) == i) {
                    return i2;
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }
}
