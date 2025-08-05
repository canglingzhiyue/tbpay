package com.taobao.message.sp.framework.service;

import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J6\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J6\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J&\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH&J&\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH&¨\u0006\u0018"}, d2 = {"Lcom/taobao/message/sp/framework/service/ISimpleMessageService;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "listMessages", "", "targetId", "", "cursor", "", "forward", "", "count", "", "observer", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "listMessagesByCCode", "ccode", "listMessagesByNick", "nick", "sendMessage", "receiverId", "msgBody", "sendMessageByNick", "receiverNick", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface ISimpleMessageService extends ISimpleDataService {
    void listMessages(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver);

    void listMessagesByCCode(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver);

    void listMessagesByNick(String str, long j, boolean z, int i, IObserver<SimpleMessageListResult> iObserver);

    void sendMessage(String str, String str2, IObserver<Boolean> iObserver);

    void sendMessageByNick(String str, String str2, IObserver<Boolean> iObserver);
}
