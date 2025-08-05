package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcConversationCreateRequest;
import com.taobao.message.sp.framework.mtop.MtopTaobaoWirelessAmp2BcConversationCreateResponse;
import com.taobao.message.sp.framework.service.SimpleConversationCache;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBCConversationService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseConversationService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "createConversation", "", "targetId", "observer", "Lcom/taobao/message/kit/core/IObserver;", "", "getListConversationsChannelList", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleBCConversationService extends SimpleBaseConversationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        kge.a(1831824811);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBCConversationService(String mIdentifier, String mChannelType) {
        super(mIdentifier, mChannelType);
        q.c(mIdentifier, "mIdentifier");
        q.c(mChannelType, "mChannelType");
        this.mIdentifier = mIdentifier;
        this.mChannelType = mChannelType;
    }

    @Override // com.taobao.message.sp.framework.implement.SimpleBaseConversationService, com.taobao.message.sp.framework.service.ISimpleConversationService
    public void createConversation(final String targetId, final IObserver<Boolean> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5d578e", new Object[]{this, targetId, observer});
            return;
        }
        q.c(targetId, "targetId");
        q.c(observer, "observer");
        MtopTaobaoWirelessAmp2BcConversationCreateRequest mtopTaobaoWirelessAmp2BcConversationCreateRequest = new MtopTaobaoWirelessAmp2BcConversationCreateRequest();
        mtopTaobaoWirelessAmp2BcConversationCreateRequest.setReceiverMainNick(targetId);
        RemoteBusiness.build((IMTOPDataObject) mtopTaobaoWirelessAmp2BcConversationCreateRequest).registerListener(new IRemoteListener() { // from class: com.taobao.message.sp.framework.implement.SimpleBCConversationService$createConversation$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse != null && (dataJsonObject = mtopResponse.getDataJsonObject()) != null && dataJsonObject.optBoolean("result")) {
                    SimpleConversationCache.INSTANCE.markCreated(targetId);
                    observer.onNext(true);
                    observer.onComplete();
                } else {
                    observer.onNext(false);
                    observer.onComplete();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TLog.loge("createSimpleConversation", (mtopResponse == null || (dataJsonObject = mtopResponse.getDataJsonObject()) == null) ? null : dataJsonObject.toString());
                observer.onNext(false);
                observer.onComplete();
            }
        }).startRequest(MtopTaobaoWirelessAmp2BcConversationCreateResponse.class);
    }

    @Override // com.taobao.message.sp.framework.implement.SimpleBaseConversationService
    public List<String> getListConversationsChannelList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4c553bb", new Object[]{this}) : p.a("bc");
    }
}
