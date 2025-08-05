package com.taobao.android.order.bundle.search.common;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.hxl;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OrderAdapter b;

    static {
        kge.a(-1955500475);
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    public c(Activity activity, OrderAdapter orderAdapter) {
        super(activity);
        this.b = orderAdapter;
    }

    public void a(List<? extends hxl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        OrderAdapter orderAdapter = this.b;
        if (orderAdapter == null) {
            return;
        }
        orderAdapter.addData(list);
    }

    public void a(List<? extends hxl> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        OrderAdapter orderAdapter = this.b;
        if (orderAdapter == null) {
            return;
        }
        orderAdapter.addData(list, i);
    }

    public List<hxl> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        OrderAdapter orderAdapter = this.b;
        if (orderAdapter == null) {
            return null;
        }
        return orderAdapter.getDatas();
    }

    public void b(List<? extends hxl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        OrderAdapter orderAdapter = this.b;
        if (orderAdapter == null) {
            return;
        }
        orderAdapter.removeData(list);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        OrderAdapter orderAdapter = this.b;
        if (orderAdapter == null) {
            return;
        }
        orderAdapter.clearData();
    }
}
