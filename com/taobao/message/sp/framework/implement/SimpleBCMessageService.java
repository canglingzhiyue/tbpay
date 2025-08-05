package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageListRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageListResponse;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageSendRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcMessageSendResponse;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J6\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J6\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J&\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016J.\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002J&\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBCMessageService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseMessageService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "listMessages", "", "targetId", "cursor", "", "forward", "", "count", "", "observer", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "isNick", "listMessagesByCCode", "ccode", "listMessagesByNick", "nick", "sendMessage", "receiverId", "msgBody", "receiverNick", "sendMessageByNick", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleBCMessageService extends SimpleBaseMessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        kge.a(31075349);
    }

    public static /* synthetic */ Object ipc$super(SimpleBCMessageService simpleBCMessageService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBCMessageService(String mIdentifier, String mChannelType) {
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
        sendMessage(receiverId, msgBody, false, observer);
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
        sendMessage(receiverNick, msgBody, true, observer);
    }

    private final void sendMessage(String str, String str2, boolean z, final IObserver<Boolean> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b6e1a4", new Object[]{this, str, str2, new Boolean(z), iObserver});
            return;
        }
        MtopTaobaoWirelessAmp2BcMessageSendRequest mtopTaobaoWirelessAmp2BcMessageSendRequest = new MtopTaobaoWirelessAmp2BcMessageSendRequest();
        if (z) {
            mtopTaobaoWirelessAmp2BcMessageSendRequest.setReceiverNick(str);
        } else {
            mtopTaobaoWirelessAmp2BcMessageSendRequest.setReceiverId(Long.parseLong(str));
        }
        mtopTaobaoWirelessAmp2BcMessageSendRequest.setMessage(str2);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmp2BcMessageSendRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.sp.framework.implement.SimpleBCMessageService$sendMessage$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                String str3;
                JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                IObserver iObserver2 = IObserver.this;
                if (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null || (str3 = dataJsonObject.getString("result")) == null) {
                    str3 = "false";
                }
                iObserver2.onNext(Boolean.valueOf(q.a((Object) "true", (Object) str3)));
                IObserver.this.onComplete();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    IObserver.this.onError(new IllegalStateException(String.valueOf(i)));
                }
            }
        }).startRequest(MtopTaobaoWirelessAmp2BcMessageSendResponse.class);
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
        listMessages(targetId, j, z, i, false, observer);
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
        listMessages(nick, j, z, i, true, observer);
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
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    private final void listMessages(String str, long j, boolean z, int i, boolean z2, IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a509ca2", new Object[]{this, str, new Long(j), new Boolean(z), new Integer(i), new Boolean(z2), iObserver});
            return;
        }
        MtopTaobaoWirelessAmp2BcMessageListRequest mtopTaobaoWirelessAmp2BcMessageListRequest = new MtopTaobaoWirelessAmp2BcMessageListRequest();
        if (z2) {
            mtopTaobaoWirelessAmp2BcMessageListRequest.setTargetUserNick(str);
        } else {
            mtopTaobaoWirelessAmp2BcMessageListRequest.setTargetUserId(Long.parseLong(str));
        }
        if (j == 0) {
            AmpTimeStampManager instance = AmpTimeStampManager.instance();
            q.a((Object) instance, "AmpTimeStampManager.instance()");
            j = instance.getCurrentTimeStamp();
        }
        mtopTaobaoWirelessAmp2BcMessageListRequest.setCursor(j);
        mtopTaobaoWirelessAmp2BcMessageListRequest.setForward(z);
        mtopTaobaoWirelessAmp2BcMessageListRequest.setCount(i);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmp2BcMessageListRequest).registerListener((IRemoteListener) new SimpleBCMessageService$listMessages$1(z2, iObserver)).startRequest(MtopTaobaoWirelessAmp2BcMessageListResponse.class);
    }
}
