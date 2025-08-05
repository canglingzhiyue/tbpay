package com.taobao.android.detail.alicom.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.FetchComponentData;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class PhonenumNetworkAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context ctx;
    private List<FetchComponentData.FetchModel.ComponentData.Network> list;
    private int selectItem = -1;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9330a;

        static {
            kge.a(-1797506922);
        }

        public a() {
        }
    }

    static {
        kge.a(-1000946406);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public PhonenumNetworkAdapter(Context context, List<FetchComponentData.FetchModel.ComponentData.Network> list) {
        this.ctx = context;
        this.list = list;
    }

    public void update(List<FetchComponentData.FetchModel.ComponentData.Network> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28dd1dc1", new Object[]{this, list});
            return;
        }
        this.list = list;
        this.selectItem = -1;
        notifyDataSetChanged();
    }

    public void setSelectItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785c29cb", new Object[]{this, new Integer(i)});
        } else {
            this.selectItem = i;
        }
    }

    public FetchComponentData.FetchModel.ComponentData.Network getSelectedItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData.FetchModel.ComponentData.Network) ipChange.ipc$dispatch("a422bd8e", new Object[]{this});
        }
        int i = this.selectItem;
        if (i != -1 && i < this.list.size()) {
            return this.list.get(this.selectItem);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<FetchComponentData.FetchModel.ComponentData.Network> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public FetchComponentData.FetchModel.ComponentData.Network mo840getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData.FetchModel.ComponentData.Network) ipChange.ipc$dispatch("63a0ec66", new Object[]{this, new Integer(i)});
        }
        if (i != -1 && i < this.list.size()) {
            return this.list.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.ctx).inflate(R.layout.detail_phonenum_network_item, (ViewGroup) null);
            aVar = new a();
            aVar.f9330a = (TextView) view.findViewById(R.id.detail_phonenumber_network_item_tv);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f9330a.setText(this.list.get(i) == null ? "" : this.list.get(i).name);
        if (i == this.selectItem) {
            aVar.f9330a.setTextColor(-1);
            view.setBackgroundResource(R.drawable.detail_phonenum_red_bg);
        } else {
            aVar.f9330a.setTextColor(Color.parseColor("#555555"));
            view.setBackgroundResource(R.drawable.detail_phonenum_gray_bg);
        }
        return view;
    }
}
