package com.taobao.message.sp.framework.service;

import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleConversation;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J$\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/sp/framework/service/ISimpleConversationService;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "createConversation", "", "targetId", "", "observer", "Lcom/taobao/message/kit/core/IObserver;", "", "listConversations", "count", "", "", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface ISimpleConversationService extends ISimpleDataService {
    void createConversation(String str, IObserver<Boolean> iObserver);

    void listConversations(int i, IObserver<List<SimpleConversation>> iObserver);
}
