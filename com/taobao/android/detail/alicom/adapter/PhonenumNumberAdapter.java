package com.taobao.android.detail.alicom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.network.QueryContractPhoneNumberData;
import com.taobao.taobao.R;
import java.util.List;
import tb.dwf;
import tb.kge;

/* loaded from: classes4.dex */
public class PhonenumNumberAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context ctx;
    private List<QueryContractPhoneNumberData.PhoneNumberList> list;
    private int selectItem = -1;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9331a;

        static {
            kge.a(1044948355);
        }

        public a() {
        }
    }

    static {
        kge.a(2061588685);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public PhonenumNumberAdapter(Context context, List<QueryContractPhoneNumberData.PhoneNumberList> list) {
        this.ctx = context;
        this.list = list;
    }

    public void setSelectItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785c29cb", new Object[]{this, new Integer(i)});
        } else {
            this.selectItem = i;
        }
    }

    public void update(List<QueryContractPhoneNumberData.PhoneNumberList> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28dd1dc1", new Object[]{this, list});
            return;
        }
        this.list = list;
        this.selectItem = -1;
        notifyDataSetChanged();
    }

    public QueryContractPhoneNumberData.PhoneNumberList getSelectItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QueryContractPhoneNumberData.PhoneNumberList) ipChange.ipc$dispatch("dfb599bd", new Object[]{this});
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
        List<QueryContractPhoneNumberData.PhoneNumberList> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public QueryContractPhoneNumberData.PhoneNumberList mo841getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryContractPhoneNumberData.PhoneNumberList) ipChange.ipc$dispatch("bb594284", new Object[]{this, new Integer(i)}) : this.list.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.ctx).inflate(R.layout.detail_phonenum_number_item, (ViewGroup) null);
            aVar = new a();
            aVar.f9331a = (TextView) view.findViewById(R.id.detail_phonenum_number_item_tv);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f9331a.setText(dwf.a(this.list.get(i).phoneNum));
        if (i == this.selectItem) {
            aVar.f9331a.setTextColor(-1);
            view.setBackgroundResource(R.drawable.detail_phonenum_red_bg);
        } else {
            aVar.f9331a.setTextColor(-16777216);
            view.setBackgroundResource(R.drawable.detail_phonenum_gray_bg);
        }
        return view;
    }
}
