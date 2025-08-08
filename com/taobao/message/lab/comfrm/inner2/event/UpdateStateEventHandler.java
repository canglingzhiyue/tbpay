package com.taobao.message.lab.comfrm.inner2.event;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.aura.INeedContainer;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.ext.ActionExtKt;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.uikit.util.ApplicationUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class UpdateStateEventHandler implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1057673342);
        kge.a(778700337);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        Event event = (Event) action.getContext().get("event");
        if (event == null) {
            return;
        }
        String stringFromData = ActionExtKt.getStringFromData(action, "updateActionName");
        if (StringUtils.isEmpty(stringFromData)) {
            stringFromData = event.getName();
        }
        Action build = new Action.Build(stringFromData).data(event.getData()).context(event.getContext()).build();
        if ("1".equals(ActionExtKt.getStringFromData(action, "useContainerUpdate"))) {
            if (((PageService) serviceProvider.service(PageService.class)).getActivity() instanceof INeedContainer) {
                INeedContainer iNeedContainer = (INeedContainer) ((PageService) serviceProvider.service(PageService.class)).getActivity();
                if (iNeedContainer.getContainer() == null) {
                    return;
                }
                iNeedContainer.getContainer().updateState(build);
                return;
            } else if (ApplicationUtil.isDebug()) {
                throw new RuntimeException();
            } else {
                return;
            }
        }
        actionDispatcher.dispatch(build);
    }
}
