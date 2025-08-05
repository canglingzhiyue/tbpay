package com.taobao.message.lab.comfrm.ext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getBindEvent", "Lcom/taobao/message/lab/comfrm/core/Event;", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "message_comfrm_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class EventHandlerExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(825585178);
    }

    public static final Event getBindEvent(EventHandler getBindEvent, Action action) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("70fae93e", new Object[]{getBindEvent, action});
        } else {
            q.d(getBindEvent, "$this$getBindEvent");
            q.d(action, "action");
            obj = action.getContext().get("event");
        }
        return (Event) obj;
    }
}
