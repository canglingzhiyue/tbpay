package com.taobao.message.lab.comfrm.inner2.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.lab.comfrm.inner2.WeakDependence;
import tb.kge;

/* loaded from: classes7.dex */
public class FinishPageEventHandler implements EventHandler, WeakDependence {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(467517992);
        kge.a(778700337);
        kge.a(-1306136720);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        PageService pageService = (PageService) serviceProvider.service(PageService.class);
        if (pageService == null) {
            return;
        }
        pageService.finish();
    }
}
