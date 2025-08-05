package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.h;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(362519372);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 1526235772) {
            super.a(((Number) objArr[0]).intValue(), (IShopRouterMonitor.MonitorException) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.shop.track.b, com.taobao.tao.shop.track.IShopRouterMonitor
    public void a(int i, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af8827c", new Object[]{this, new Integer(i), monitorException});
            return;
        }
        super.a(i, monitorException);
        if (i == 1005) {
            a("dowloadCache", "dowloadCache", monitorException);
        } else if (i == 1004) {
            a("dowloadCache", "dowloadCache", null);
        } else if (i == 1007) {
            a("mtop.taobao.wireless.shop.route.process", "mtop-process", monitorException);
        } else if (i != 1006) {
        } else {
            a("mtop.taobao.wireless.shop.route.process", "mtop-process", null);
        }
    }

    private void a(String str, String str2, IShopRouterMonitor.MonitorException monitorException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4bd07b", new Object[]{this, str, str2, monitorException});
        } else if (monitorException != null && monitorException.getErrorParam() != null && !"-10901".equals(monitorException.getErrorCode()) && !"-10902".equals(monitorException.getErrorCode())) {
            h.a(str2, str, monitorException.getErrorParam(), monitorException.getErrorCode(), monitorException.getErrorMsg());
        } else if (monitorException != null && !"-10901".equals(monitorException.getErrorCode()) && !"-10902".equals(monitorException.getErrorCode())) {
            h.a(str2, str, monitorException.getErrorParam(), monitorException.getErrorCode(), monitorException.getErrorMsg());
        } else {
            h.a(str2, str, null);
        }
    }
}
