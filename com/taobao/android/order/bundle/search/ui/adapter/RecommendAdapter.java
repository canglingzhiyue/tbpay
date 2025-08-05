package com.taobao.android.order.bundle.search.ui.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.common.OrderAdapter;
import com.taobao.android.order.bundle.search.common.b;
import com.taobao.android.order.bundle.search.factory.RecommendHolderFactory;
import tb.kge;

/* loaded from: classes6.dex */
public class RecommendAdapter extends OrderAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mItemTypeCont;

    static {
        kge.a(-2088972032);
    }

    public RecommendAdapter(Activity activity) {
        super(activity);
        this.mItemTypeCont = RecommendHolderFactory.RecommendViewHolderType.values().length;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        b bVar = null;
        if (view == null) {
            bVar = RecommendHolderFactory.a(this.mAct, this.mDatas.get(i).getClass());
            if (bVar != null && (view = bVar.a()) != null) {
                view.setTag(bVar);
            }
        } else if (view != null && (view.getTag() instanceof b)) {
            bVar = (b) view.getTag();
        }
        if (bVar == null || view == null) {
            return new View(this.mAct);
        }
        bVar.a(this.mDatas.get(i));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : this.mItemTypeCont;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mDatas != null && i >= 0 && i < this.mDatas.size()) {
            return RecommendHolderFactory.a(this.mDatas.get(i).getClass());
        }
        return -1;
    }
}
