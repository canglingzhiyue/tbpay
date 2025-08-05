package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpImbaMessageSessionListRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmpImbaMessageSessionListResponse;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J6\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J6\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J&\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016J&\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleIMBAMessageService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseMessageService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "listMessages", "", "targetId", "cursor", "", "forward", "", "count", "", "observer", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "listMessagesByCCode", "ccode", "listMessagesByNick", "nick", "sendMessage", "receiverId", "msgBody", "sendMessageByNick", "receiverNick", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleIMBAMessageService extends SimpleBaseMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        kge.a(1500938039);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleIMBAMessageService(String mIdentifier, String mChannelType) {
        super(mIdentifier, mChannelType);
        q.c(mIdentifier, "mIdentifier");
        q.c(mChannelType, "mChannelType");
        this.mIdentifier = mIdentifier;
        this.mChannelType = mChannelType;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void sendMessage(String receiverId, String msgBody, IObserver<Boolean> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bffac4", new Object[]{this, receiverId, msgBody, observer});
            return;
        }
        q.c(receiverId, "receiverId");
        q.c(msgBody, "msgBody");
        q.c(observer, "observer");
        observer.onError(new IllegalAccessException("not impl"));
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void sendMessageByNick(String receiverNick, String msgBody, IObserver<Boolean> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea48b24a", new Object[]{this, receiverNick, msgBody, observer});
            return;
        }
        q.c(receiverNick, "receiverNick");
        q.c(msgBody, "msgBody");
        q.c(observer, "observer");
        observer.onError(new IllegalAccessException("not impl"));
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void listMessages(String targetId, long j, boolean z, int i, IObserver<SimpleMessageListResult> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a3e806", new Object[]{this, targetId, new Long(j), new Boolean(z), new Integer(i), observer});
            return;
        }
        q.c(targetId, "targetId");
        q.c(observer, "observer");
        observer.onError(new IllegalAccessException("not impl"));
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void listMessagesByNick(String nick, long j, boolean z, int i, IObserver<SimpleMessageListResult> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22396900", new Object[]{this, nick, new Long(j), new Boolean(z), new Integer(i), observer});
            return;
        }
        q.c(nick, "nick");
        q.c(observer, "observer");
        observer.onError(new IllegalAccessException("not impl"));
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleMessageService
    public void listMessagesByCCode(String ccode, long j, boolean z, int i, IObserver<SimpleMessageListResult> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cfc36b", new Object[]{this, ccode, new Long(j), new Boolean(z), new Integer(i), observer});
            return;
        }
        q.c(ccode, "ccode");
        q.c(observer, "observer");
        MtopTaobaoWirelessAmpImbaMessageSessionListRequest mtopTaobaoWirelessAmpImbaMessageSessionListRequest = new MtopTaobaoWirelessAmpImbaMessageSessionListRequest();
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setAccessKey("taobao-app");
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setAccessToken("taobao-app-secret");
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setLastMsgTime(j);
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setConversationId(ccode);
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setPageSize(i);
        mtopTaobaoWirelessAmpImbaMessageSessionListRequest.setDirection(z ? 0L : 1L);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmpImbaMessageSessionListRequest).registerListener((IRemoteListener) new SimpleIMBAMessageService$listMessagesByCCode$1(observer)).startRequest(MtopTaobaoWirelessAmpImbaMessageSessionListResponse.class);
    }
}
