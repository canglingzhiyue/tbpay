package com.taobao.message.sp.chat.handler;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.ext.ActionExtKt;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleLoadMessageEventHandler implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-535283430);
        kge.a(778700337);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else {
            commandHandler.handle(new Command.Build(ActionExtKt.getStringFromData(action, "sourceInstance"), SimpleMessageListData.SOURCE_NAME_MESSAGE, "loadMessage").data(action.getData()).build());
        }
    }
}
