package com.taobao.tao.shop;

import com.taobao.tao.shop.track.IShopRouterMonitor;
import tb.ouu;

/* loaded from: classes8.dex */
public enum TBSRCtx {
    INSTANCE;
    
    private IShopRouterMonitor routerMonitor;

    public static void safeMonitor(int i, IShopRouterMonitor.MonitorException monitorException) {
        IShopRouterMonitor iShopRouterMonitor = INSTANCE.routerMonitor;
        if (iShopRouterMonitor == null) {
            ouu.c("IShopRouterMonitor has not init !!!");
        } else {
            iShopRouterMonitor.a(i, monitorException);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRouterMonitor(IShopRouterMonitor iShopRouterMonitor) {
        this.routerMonitor = iShopRouterMonitor;
    }
}
