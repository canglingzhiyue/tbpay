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
public class PhonenumPlanAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LayoutInflater inflater;
    private List<FetchComponentData.FetchModel.ComponentData.Plan> plans;
    private long selectItem = -1;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9332a;
        public TextView b;

        static {
            kge.a(-1591049432);
        }
    }

    static {
        kge.a(-1659395411);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public PhonenumPlanAdapter(List<FetchComponentData.FetchModel.ComponentData.Plan> list, Context context) {
        this.plans = list;
        this.inflater = LayoutInflater.from(context);
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

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<FetchComponentData.FetchModel.ComponentData.Plan> list = this.plans;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public FetchComponentData.FetchModel.ComponentData.Plan mo842getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData.FetchModel.ComponentData.Plan) ipChange.ipc$dispatch("1bea4839", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.plans.size()) {
            return this.plans.get(i);
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
            view = this.inflater.inflate(R.layout.detail_phonenum_plan_item, viewGroup, false);
            aVar = new a();
            aVar.f9332a = (TextView) view.findViewById(R.id.detail_phonenum_plan_item_name);
            aVar.b = (TextView) view.findViewById(R.id.detail_phonenum_plan_item_descrip);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f9332a.setText(this.plans.get(i).name);
        aVar.b.setText(this.plans.get(i).nativeDesc);
        if (i == this.selectItem) {
            aVar.f9332a.setTextColor(-1);
            aVar.b.setTextColor(-1);
            view.setBackgroundResource(R.drawable.detail_phonenum_red_bg);
        } else {
            aVar.f9332a.setTextColor(Color.parseColor("#555555"));
            aVar.b.setTextColor(Color.parseColor("#555555"));
            view.setBackgroundResource(R.drawable.detail_phonenum_gray_bg);
        }
        return view;
    }
}
