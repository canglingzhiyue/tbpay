package com.taobao.android.order.bundle.search.common;

import android.app.Activity;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.hxl;
import tb.hyn;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class OrderAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = OrderAdapter.class.getSimpleName();
    public Activity mAct;
    public List<hxl> mDatas;

    static {
        kge.a(-2085943305);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public OrderAdapter(Activity activity) {
        this.mAct = activity;
    }

    public boolean setData(List<hxl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28ddf4a8", new Object[]{this, list})).booleanValue();
        }
        if (list == null) {
            hyn.a(this.TAG, "setData data is null", new String[0]);
            return false;
        }
        List<hxl> list2 = this.mDatas;
        if (list2 != null) {
            list2.clear();
        }
        this.mDatas = list;
        notifyDataSetChanged();
        hyn.a(this.TAG, "setData notifyDataSetChanged", new String[0]);
        return true;
    }

    public boolean addData(hxl hxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7521b08a", new Object[]{this, hxlVar})).booleanValue();
        }
        if (hxlVar == null) {
            hyn.a(this.TAG, "addData data is null", new String[0]);
            return false;
        }
        if (this.mDatas == null) {
            this.mDatas = new ArrayList();
        }
        this.mDatas.add(hxlVar);
        notifyDataSetChanged();
        hyn.a(this.TAG, "addData notifyDataSetChanged", new String[0]);
        return true;
    }

    public boolean addData(List<? extends hxl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc4ca3e7", new Object[]{this, list})).booleanValue();
        }
        addData(list, -1);
        return true;
    }

    public boolean addData(List<? extends hxl> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad484b84", new Object[]{this, list, new Integer(i)})).booleanValue();
        }
        if (list == null) {
            hyn.a(this.TAG, "addData data is null", new String[0]);
            return false;
        }
        if (this.mDatas == null) {
            this.mDatas = new ArrayList();
        }
        if (i > this.mDatas.size()) {
            return false;
        }
        if (i < 0) {
            this.mDatas.addAll(list);
        } else {
            this.mDatas.addAll(i, list);
        }
        notifyDataSetChanged();
        hyn.a(this.TAG, "addData notifyDataSetChanged", new String[0]);
        return true;
    }

    public List<hxl> getDatas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("23d823ad", new Object[]{this}) : this.mDatas;
    }

    public boolean removeData(List<? extends hxl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69d6aca", new Object[]{this, list})).booleanValue();
        }
        List<hxl> list2 = this.mDatas;
        if (list2 == null || list == null) {
            hyn.a(this.TAG, "removeData mDatas is null", new String[0]);
            return false;
        }
        list2.removeAll(list);
        notifyDataSetChanged();
        hyn.a(this.TAG, "removeData", new String[0]);
        return true;
    }

    public void clearData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
            return;
        }
        List<hxl> list = this.mDatas;
        if (list == null) {
            return;
        }
        list.clear();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<hxl> list = this.mDatas;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<hxl> list = this.mDatas;
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return this.mDatas.get(i);
    }
}
