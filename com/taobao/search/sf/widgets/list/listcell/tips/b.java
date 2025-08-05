package com.taobao.search.sf.widgets.list.listcell.tips;

import android.app.Activity;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.mmd.datasource.bean.AuctionListTipBean;
import com.taobao.taobao.R;
import tb.itd;
import tb.ium;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class b extends itd<TipsCellBean, com.taobao.search.sf.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f19531a;

    static {
        kge.a(-948306545);
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TipsCellWidget";
    }

    public b(int i, Activity activity, ium iumVar, ViewGroup viewGroup, ListStyle listStyle, int i2, com.taobao.search.sf.a aVar) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, iumVar, listStyle, i2, aVar);
        this.f19531a = (TextView) this.itemView.findViewById(R.id.tv_tips);
    }

    public void a(AuctionListTipBean auctionListTipBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817261ea", new Object[]{this, auctionListTipBean, new Integer(i)});
            return;
        }
        this.f19531a.setText(auctionListTipBean.title);
        j().d().setParam(noa.KEY_RCMD_TIPS_SHOWED, "true");
    }

    @Override // tb.itd
    public void a(int i, TipsCellBean tipsCellBean) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42c372f", new Object[]{this, new Integer(i), tipsCellBean});
            return;
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) this.itemView.getLayoutParams();
        if (!tipsCellBean.fullSpan && u() != ListStyle.LIST) {
            z = false;
        }
        layoutParams.setFullSpan(z);
        a(tipsCellBean.listTipBean, i);
    }
}
