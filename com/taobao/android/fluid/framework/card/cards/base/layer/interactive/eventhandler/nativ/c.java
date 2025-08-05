package com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import tb.kge;
import tb.ogb;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2091534999);
    }

    public static boolean a(FluidContext fluidContext, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1b6f70", new Object[]{fluidContext, activity})).booleanValue();
        }
        f pageInterface = ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface();
        com.taobao.android.layoutmanager.container.secondpage.biz.b bVar = null;
        if (pageInterface != null) {
            bVar = com.taobao.android.layoutmanager.container.secondpage.biz.a.a((ogb) pageInterface);
        } else if (activity instanceof ogb) {
            bVar = com.taobao.android.layoutmanager.container.secondpage.biz.a.a((ogb) activity);
        }
        return bVar != null && bVar.k();
    }
}
