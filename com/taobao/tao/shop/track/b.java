package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.kge;

/* loaded from: classes8.dex */
public class b implements IShopRouterMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1884396076);
        kge.a(1212255215);
    }

    @Override // com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af8827c", new Object[]{this, new Integer(i), monitorException});
        }
    }
}
