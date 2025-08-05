package com.taobao.tao.shop.track;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.kge;

/* loaded from: classes8.dex */
public class d implements IShopRouterMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f21104a = 0;

    static {
        kge.a(-317232917);
        kge.a(1212255215);
    }

    @Override // com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af8827c", new Object[]{this, new Integer(i), monitorException});
            return;
        }
        switch (i) {
            case 1000:
                AppMonitor.Counter.commit("shop_router", "cache-hit", "hit", 1.0d);
                return;
            case 1001:
                AppMonitor.Counter.commit("shop_router", "cache-hit", "total", 1.0d);
                return;
            case 1002:
                this.f21104a = System.currentTimeMillis();
                return;
            case 1003:
                a(this.f21104a);
                return;
            case 1004:
                a("cache", (IShopRouterMonitor.MonitorException) null);
                return;
            case 1005:
                a("cache", monitorException);
                return;
            case 1006:
                a("mtop-process", (IShopRouterMonitor.MonitorException) null);
                return;
            case 1007:
                a("mtop-process", monitorException);
                return;
            default:
                return;
        }
    }

    private void a(String str, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f61305", new Object[]{this, str, monitorException});
        } else if (monitorException == null) {
            AppMonitor.Alarm.commitSuccess("shop_router", str);
        } else {
            AppMonitor.Alarm.commitFail("shop_router", str, monitorException.getErrorCode(), monitorException.getErrorMsg());
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("type", "mtop_process");
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("cost", System.currentTimeMillis() - j);
        AppMonitor.Stat.commit("shop_router", "cost", create, create2);
    }
}
