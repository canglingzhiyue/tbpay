package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements IShopRouterMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<IShopRouterMonitor> f21103a = Collections.newSetFromMap(new ConcurrentHashMap());

    static {
        kge.a(-1315140797);
        kge.a(1212255215);
    }

    public c a(IShopRouterMonitor... iShopRouterMonitorArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("dc899af8", new Object[]{this, iShopRouterMonitorArr});
        }
        Collections.addAll(this.f21103a, iShopRouterMonitorArr);
        return this;
    }

    @Override // com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af8827c", new Object[]{this, new Integer(i), monitorException});
            return;
        }
        for (IShopRouterMonitor iShopRouterMonitor : this.f21103a) {
            iShopRouterMonitor.a(i, monitorException);
        }
    }
}
