package com.taobao.android.order.bundle.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.c;
import com.taobao.android.order.core.g;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.hyn;
import tb.kge;
import tb.myf;

/* loaded from: classes6.dex */
public abstract class BaseFragment extends Fragment implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "BaseFragment";
    public LinearLayout bottom;
    public View contentView;
    public g orderCoreEngine;
    public OrderRecyclerView recyclerView;
    public TBSwipeRefreshLayout refreshLayout;
    public TBErrorView tbErrorView;
    public LinearLayout top;
    public String traceId;

    static {
        kge.a(649724358);
        kge.a(-1056043576);
    }

    public static /* synthetic */ Object ipc$super(BaseFragment baseFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract OrderConfigs buildOrderConfig();

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.contentView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_list_container, viewGroup, false);
        this.refreshLayout = (TBSwipeRefreshLayout) this.contentView.findViewById(R.id.order_list_uikit);
        this.recyclerView = (OrderRecyclerView) this.contentView.findViewById(R.id.recycler_view);
        this.recyclerView.setLayoutManager(new myf(getContext()).a(this.recyclerView));
        this.bottom = (LinearLayout) this.contentView.findViewById(R.id.bottom_layout);
        this.top = (LinearLayout) this.contentView.findViewById(R.id.top_layout);
        ViewStub viewStub = (ViewStub) this.contentView.findViewById(R.id.order_list_view_stub);
        if (viewStub == null) {
            this.tbErrorView = (TBErrorView) this.contentView.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view);
        } else {
            this.tbErrorView = (TBErrorView) viewStub.inflate().findViewById(R.id.tb_order_error_view);
        }
        this.traceId = UemAnalysis.getTraceId();
        return this.contentView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (buildOrderConfig() == null) {
            return;
        }
        this.orderCoreEngine = g.a(buildOrderConfig());
        g gVar = this.orderCoreEngine;
        if (gVar == null) {
            return;
        }
        gVar.a();
        hyn.a("BaseFragment", i.b.MEASURE_ONCREATE, new String[0]);
    }

    public g getOrderCoreEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("f61749e6", new Object[]{this}) : this.orderCoreEngine;
    }
}
