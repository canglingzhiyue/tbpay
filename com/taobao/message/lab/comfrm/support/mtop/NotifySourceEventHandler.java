package com.taobao.message.lab.comfrm.support.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class NotifySourceEventHandler implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(137381673);
        kge.a(778700337);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        Map map = (Map) action.getData();
        if (map == null) {
            return;
        }
        String string = ValueUtil.getString(map, "sourceName");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 9; i++) {
            String string2 = ValueUtil.getString(map, "argKey" + i);
            String string3 = ValueUtil.getString(map, "argValue" + i);
            if (string2 != null) {
                hashMap.put(string2, string3);
            }
        }
        commandHandler.handle(new Command.Build(string, ValueUtil.getString(map, "commandName")).data(hashMap).build());
    }
}
