package com.taobao.android.order.bundle.widget.recycle;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import java.util.ArrayList;
import tb.hyk;
import tb.hyq;
import tb.kge;
import tb.nkj;
import tb.nkk;

/* loaded from: classes6.dex */
public class c extends nkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private OrderConfigs.BizNameType f14606a;

    static {
        kge.a(629621051);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 305564974) {
            return super.mo1596onCreateViewHolder((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(ArrayList<nkk> arrayList, ArrayList<nkk> arrayList2, RecyclerView.Adapter adapter, OrderConfigs.BizNameType bizNameType) {
        super(arrayList, arrayList2, adapter);
        this.f14606a = bizNameType;
        a(hyk.t());
    }

    @Override // tb.nkj, android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        RecyclerView.ViewHolder mo1596onCreateViewHolder = super.mo1596onCreateViewHolder(viewGroup, i);
        if (this.f14606a == OrderConfigs.BizNameType.ORDER_DETAIL && (mo1596onCreateViewHolder instanceof nkj.a) && mo1596onCreateViewHolder.itemView != null && (mo1596onCreateViewHolder.itemView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) mo1596onCreateViewHolder.itemView.getParent()).removeView(mo1596onCreateViewHolder.itemView);
            hyq.a("OrderFixedAdapter", "RvAddedViewHasParent", mo1596onCreateViewHolder.itemView.getClass().getName());
        }
        return mo1596onCreateViewHolder;
    }
}
