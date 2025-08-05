package com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;
import tb.xpf;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\u0018\u0000 52\u00060\u0002j\u0002`\u00012\u00020\u0003:\u00015Bm\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u00066"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageContext;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "pmContext", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", "cdnContext", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext;", "compensationContexts", "", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CompensationMessageProcessorContext;", "messageListener", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchMessageListener;", "entityIdentifier", "", "topic", "disableMessageDispatch", "", "needHeartBeat", "<init>", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext;Ljava/util/List;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchMessageListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getPmContext", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", "setPmContext", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;)V", "getCdnContext", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext;", "setCdnContext", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext;)V", "getCompensationContexts", "()Ljava/util/List;", "setCompensationContexts", "(Ljava/util/List;)V", "getMessageListener", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchMessageListener;", "setMessageListener", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchMessageListener;)V", "getEntityIdentifier", "()Ljava/lang/String;", "setEntityIdentifier", "(Ljava/lang/String;)V", "getTopic", "setTopic", "getDisableMessageDispatch", "()Ljava/lang/Boolean;", "setDisableMessageDispatch", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNeedHeartBeat", "setNeedHeartBeat", "uuid", "getUuid", "setUuid", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenArchMessageContext implements c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a cdnContext;
    private List<b> compensationContexts;
    private Boolean disableMessageDispatch;
    private String entityIdentifier;
    private xpf messageListener;
    private Boolean needHeartBeat;
    private com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a pmContext;
    private String topic;
    private String uuid;

    static {
        kge.a(1940120766);
        kge.a(1028243835);
        kge.a(239485178);
        Companion = new a(null);
    }

    public OpenArchMessageContext() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public OpenArchMessageContext(com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a aVar, com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a aVar2, List<b> list, xpf xpfVar, String str, String str2, Boolean bool, Boolean bool2) {
        this.pmContext = aVar;
        this.cdnContext = aVar2;
        this.compensationContexts = list;
        this.messageListener = xpfVar;
        this.entityIdentifier = str;
        this.topic = str2;
        this.disableMessageDispatch = bool;
        this.needHeartBeat = bool2;
        com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a aVar3 = this.pmContext;
        if (aVar3 != null && aVar3.a() == null) {
            aVar3.a(this.topic);
        }
        com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a aVar4 = this.cdnContext;
        if (aVar4 != null && aVar4.a() == null) {
            aVar4.a(this.topic);
        }
        List<b> list2 = this.compensationContexts;
        if (list2 != null) {
            for (b bVar : list2) {
                if (bVar.a() == null) {
                    bVar.a(this.topic);
                }
            }
        }
    }

    public c keepObj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("892207ae", new Object[]{this}) : c.a.a(this);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            c.a.b(this);
        }
    }

    public /* synthetic */ OpenArchMessageContext(com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a aVar, com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a aVar2, List list, xpf xpfVar, String str, String str2, Boolean bool, Boolean bool2, int i, o oVar) {
        this((i & 1) != 0 ? com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a.Companion.a() : aVar, (i & 2) != 0 ? com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a.Companion.a() : aVar2, (i & 4) != 0 ? b.Companion.a() : list, (i & 8) != 0 ? null : xpfVar, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? false : bool, (i & 128) != 0 ? true : bool2);
    }

    public final com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a getPmContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a) ipChange.ipc$dispatch("6caa4b58", new Object[]{this}) : this.pmContext;
    }

    public final void setPmContext(com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc313bce", new Object[]{this, aVar});
        } else {
            this.pmContext = aVar;
        }
    }

    public final com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a getCdnContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a) ipChange.ipc$dispatch("efc8d83b", new Object[]{this}) : this.cdnContext;
    }

    public final void setCdnContext(com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed387c8f", new Object[]{this, aVar});
        } else {
            this.cdnContext = aVar;
        }
    }

    public final List<b> getCompensationContexts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("941852cc", new Object[]{this}) : this.compensationContexts;
    }

    public final void setCompensationContexts(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88bd4e18", new Object[]{this, list});
        } else {
            this.compensationContexts = list;
        }
    }

    public final xpf getMessageListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xpf) ipChange.ipc$dispatch("9309ecac", new Object[]{this}) : this.messageListener;
    }

    public final void setMessageListener(xpf xpfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b706862", new Object[]{this, xpfVar});
        } else {
            this.messageListener = xpfVar;
        }
    }

    public final String getEntityIdentifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this}) : this.entityIdentifier;
    }

    public final void setEntityIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.entityIdentifier = str;
        }
    }

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this}) : this.topic;
    }

    public final void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
        }
    }

    public final Boolean getDisableMessageDispatch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("71214d93", new Object[]{this}) : this.disableMessageDispatch;
    }

    public final void setDisableMessageDispatch(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1eac6b", new Object[]{this, bool});
        } else {
            this.disableMessageDispatch = bool;
        }
    }

    public final Boolean getNeedHeartBeat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("e025efb4", new Object[]{this}) : this.needHeartBeat;
    }

    public final void setNeedHeartBeat(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373a4f02", new Object[]{this, bool});
        } else {
            this.needHeartBeat = bool;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\f"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageContext$Companion;", "", "<init>", "()V", "fetchSubscribeOnlyContext", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageContext;", "topic", "", "messageListener", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchMessageListener;", "fetchContext", "fetchContextWithoutHeartBeat", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(845380230);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public String getUuid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this}) : this.uuid;
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }
}
