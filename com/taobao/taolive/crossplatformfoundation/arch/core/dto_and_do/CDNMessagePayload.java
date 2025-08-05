package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uniinfra_kmp.common_utils.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\u0018\u0000 /2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00060\u0005j\u0002`\u0004:\u0001/Bg\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010-\u001a\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010.\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001c\u0010*\u001a\u0004\u0018\u00010\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015¨\u00060"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/CDNMessagePayload;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/IMessagePayload;", "", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "data", RemoteMessageConst.MSGID, "pushTime", "", "subType", "topic", "undroppable", "", "senderId", aw.PARAM_OPEN_REWARD_SENDER_USER_NICK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getMsgId", "setMsgId", "getPushTime", "()Ljava/lang/Long;", "setPushTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSubType", "setSubType", "getTopic", "setTopic", "getUndroppable", "()Ljava/lang/Boolean;", "setUndroppable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSenderId", "setSenderId", "getSenderNick", "setSenderNick", "uuid", "getUuid", "setUuid", "fetchMsgId", "fetchType", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CDNMessagePayload implements c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private String data;
    private String msgId;
    private Long pushTime;
    private String senderId;
    private String senderNick;
    private Long subType;
    private String topic;
    private Boolean undroppable;
    private String uuid;

    static {
        kge.a(-297495476);
        kge.a(2070572424);
        kge.a(239485178);
        kge.a(1028243835);
        Companion = new a(null);
    }

    public CDNMessagePayload() {
        this(null, null, null, null, null, null, null, null, 255, null);
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

    public CDNMessagePayload(String str, String str2, Long l, Long l2, String str3, Boolean bool, String str4, String str5) {
        this.data = str;
        this.msgId = str2;
        this.pushTime = l;
        this.subType = l2;
        this.topic = str3;
        this.undroppable = bool;
        this.senderId = str4;
        this.senderNick = str5;
    }

    public /* synthetic */ CDNMessagePayload(String str, String str2, Long l, Long l2, String str3, Boolean bool, String str4, String str5, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? str5 : null);
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public void setData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427970bd", new Object[]{this, str});
        } else {
            this.data = str;
        }
    }

    public final String getMsgId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ab64bf3", new Object[]{this}) : this.msgId;
    }

    public final void setMsgId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ebc84b", new Object[]{this, str});
        } else {
            this.msgId = str;
        }
    }

    public final Long getPushTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("7f304c11", new Object[]{this}) : this.pushTime;
    }

    public final void setPushTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5389a7cf", new Object[]{this, l});
        } else {
            this.pushTime = l;
        }
    }

    public final Long getSubType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("ef1eb5ca", new Object[]{this}) : this.subType;
    }

    public final void setSubType(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee971d9e", new Object[]{this, l});
        } else {
            this.subType = l;
        }
    }

    public String getTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this}) : this.topic;
    }

    public void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
        }
    }

    public final Boolean getUndroppable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("4bd531d0", new Object[]{this}) : this.undroppable;
    }

    public final void setUndroppable(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c145a366", new Object[]{this, bool});
        } else {
            this.undroppable = bool;
        }
    }

    public final String getSenderId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e603eb13", new Object[]{this}) : this.senderId;
    }

    public final void setSenderId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6556d1c3", new Object[]{this, str});
        } else {
            this.senderId = str;
        }
    }

    public final String getSenderNick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("86d1dc8b", new Object[]{this}) : this.senderNick;
    }

    public final void setSenderNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca533c4b", new Object[]{this, str});
        } else {
            this.senderNick = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/CDNMessagePayload$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-770666348);
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

    public String fetchMsgId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b358e57", new Object[]{this}) : this.msgId;
    }

    public Long fetchType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("beb2781a", new Object[]{this}) : this.subType;
    }
}
