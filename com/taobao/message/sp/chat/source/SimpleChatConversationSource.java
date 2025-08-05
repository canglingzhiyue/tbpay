package com.taobao.message.sp.chat.source;

import com.alibaba.security.realidentity.p1;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleConversationContent;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J0\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/message/sp/chat/source/SimpleChatConversationSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/taobao/message/sp/framework/model/SimpleMessageListData;", "Lcom/taobao/message/lab/comfrm/support/UserIdentifier;", "()V", "identifier", "", "dispatchConversation", "", "data", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "dispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "p0", "subscribe", "updateOriginalData", "Lcom/taobao/message/lab/comfrm/core/Action;", p1.d, "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "props", "", "", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleChatConversationSource implements Source<SimpleMessageListData>, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String identifier;

    static {
        kge.a(-943034628);
        kge.a(-915263556);
        kge.a(451726918);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public SimpleMessageListData updateOriginalData(Action action, SimpleMessageListData simpleMessageListData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMessageListData) ipChange.ipc$dispatch("a9837232", new Object[]{this, action, simpleMessageListData}) : simpleMessageListData;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, ActionDispatcher dispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, dispatcher});
            return;
        }
        q.c(dispatcher, "dispatcher");
        Object obj = map != null ? map.get("conversation") : null;
        if (!(obj instanceof SimpleConversation)) {
            return;
        }
        dispatchConversation((SimpleConversation) obj, dispatcher);
    }

    public final void dispatchConversation(SimpleConversation data, ActionDispatcher dispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16ad716", new Object[]{this, data, dispatcher});
            return;
        }
        q.c(data, "data");
        q.c(dispatcher, "dispatcher");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SimpleProfile simpleProfile = new SimpleProfile();
        SimpleConversationContent conversationContent = data.getConversationContent();
        q.a((Object) conversationContent, "data.conversationContent");
        simpleProfile.setAvatarURL(conversationContent.getHeadUrl());
        SimpleConversationContent conversationContent2 = data.getConversationContent();
        q.a((Object) conversationContent2, "data.conversationContent");
        simpleProfile.setDisplayName(conversationContent2.getConversationName());
        linkedHashMap.put("profile", simpleProfile);
        dispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(new ResultData(data, linkedHashMap)).build());
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String p0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, p0});
            return;
        }
        q.c(p0, "p0");
        this.identifier = p0;
    }
}
