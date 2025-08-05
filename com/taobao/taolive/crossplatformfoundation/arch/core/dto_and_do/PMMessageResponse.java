package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.detail.core.detail.widget.listview.TRecyclerView;
import com.taobao.uniinfra_kmp.common_utils.c;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b;\u0018\u0000 L2\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00012\u00020\u00052\u00060\u0007j\u0002`\u0006:\u0001LBÉ\u0001\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010J\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010K\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010%R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b?\u0010%\"\u0004\b@\u0010'R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\bC\u00105\"\u0004\bD\u00107R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010!\"\u0004\bF\u0010#R\u001c\u0010G\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010#¨\u0006M"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/IMessagePayload;", "", "", "", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "data", "topic", "type", "", "from", "to", "messageId", "needAck", "", "priority", "", "qosLevel", "sendFullTags", "tags", "timestamp", "userId", "errorCode", "errorMsg", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getData", "()Ljava/util/Map;", "setData", "(Ljava/util/Map;)V", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", NetworkAbility.API_GET_TYPE, "()Ljava/lang/Long;", "setType", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFrom", "setFrom", "getTo", "setTo", "getMessageId", "setMessageId", "getNeedAck", "()Ljava/lang/Boolean;", "setNeedAck", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPriority", "()Ljava/lang/Integer;", "setPriority", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getQosLevel", "setQosLevel", "getSendFullTags", "setSendFullTags", "getTags", "setTags", "getTimestamp", "setTimestamp", "getUserId", "setUserId", "getErrorCode", "setErrorCode", "getErrorMsg", "setErrorMsg", "uuid", "getUuid", "setUuid", "fetchMsgId", "fetchType", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PMMessageResponse implements c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private Map<String, ? extends Object> data;
    private Integer errorCode;
    private String errorMsg;
    private String from;
    private String messageId;
    private Boolean needAck;
    private Integer priority;
    private Integer qosLevel;
    private Boolean sendFullTags;
    private String tags;
    private Long timestamp;
    private String to;
    private String topic;
    private Long type;
    private String userId;
    private String uuid;

    static {
        kge.a(-1415511805);
        kge.a(2070572424);
        kge.a(239485178);
        kge.a(1028243835);
        Companion = new a(null);
    }

    public PMMessageResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TRecyclerView.ITEM_POSITION_MASK, null);
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

    public PMMessageResponse(Map<String, ? extends Object> map, String str, Long l, String str2, String str3, String str4, Boolean bool, Integer num, Integer num2, Boolean bool2, String str5, Long l2, String str6, Integer num3, String str7) {
        this.data = map;
        this.topic = str;
        this.type = l;
        this.from = str2;
        this.to = str3;
        this.messageId = str4;
        this.needAck = bool;
        this.priority = num;
        this.qosLevel = num2;
        this.sendFullTags = bool2;
        this.tags = str5;
        this.timestamp = l2;
        this.userId = str6;
        this.errorCode = num3;
        this.errorMsg = str7;
    }

    public /* synthetic */ PMMessageResponse(Map map, String str, Long l, String str2, String str3, String str4, Boolean bool, Integer num, Integer num2, Boolean bool2, String str5, Long l2, String str6, Integer num3, String str7, int i, o oVar) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : num3, (i & 16384) == 0 ? str7 : null);
    }

    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }

    public void setData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.data = map;
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

    public final Long getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("eed7fffe", new Object[]{this}) : this.type;
    }

    public final void setType(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbbd782", new Object[]{this, l});
        } else {
            this.type = l;
        }
    }

    public final String getFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this}) : this.from;
    }

    public final void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.from = str;
        }
    }

    public final String getTo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79c0f328", new Object[]{this}) : this.to;
    }

    public final void setTo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12eac54e", new Object[]{this, str});
        } else {
            this.to = str;
        }
    }

    public final String getMessageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this}) : this.messageId;
    }

    public final void setMessageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68101fd1", new Object[]{this, str});
        } else {
            this.messageId = str;
        }
    }

    public final Boolean getNeedAck() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("8e761261", new Object[]{this}) : this.needAck;
    }

    public final void setNeedAck(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccffbaf5", new Object[]{this, bool});
        } else {
            this.needAck = bool;
        }
    }

    public final Integer getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("4790b788", new Object[]{this}) : this.priority;
    }

    public final void setPriority(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6cbfaa", new Object[]{this, num});
        } else {
            this.priority = num;
        }
    }

    public final Integer getQosLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("74313e13", new Object[]{this}) : this.qosLevel;
    }

    public final void setQosLevel(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5dd0a7f", new Object[]{this, num});
        } else {
            this.qosLevel = num;
        }
    }

    public final Boolean getSendFullTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("7121b2a", new Object[]{this}) : this.sendFullTags;
    }

    public final void setSendFullTags(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a752b4", new Object[]{this, bool});
        } else {
            this.sendFullTags = bool;
        }
    }

    public final String getTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("335251ca", new Object[]{this}) : this.tags;
    }

    public final void setTags(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7727ec", new Object[]{this, str});
        } else {
            this.tags = str;
        }
    }

    public final Long getTimestamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("62937f4e", new Object[]{this}) : this.timestamp;
    }

    public final void setTimestamp(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e6779a", new Object[]{this, l});
        } else {
            this.timestamp = l;
        }
    }

    public final String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public final void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public final Integer getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("a5caf00d", new Object[]{this}) : this.errorCode;
    }

    public final void setErrorCode(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c25635d", new Object[]{this, num});
        } else {
            this.errorCode = num;
        }
    }

    public final String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
    }

    public final void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(2001847435);
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b358e57", new Object[]{this}) : this.messageId;
    }

    public Long fetchType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("beb2781a", new Object[]{this}) : this.type;
    }
}
