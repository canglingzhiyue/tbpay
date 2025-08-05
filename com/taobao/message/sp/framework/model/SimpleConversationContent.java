package com.taobao.message.sp.framework.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleConversationContent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "atMessageType")
    private int atMessageType;
    @JSONField(name = "conversationName")
    private String conversationName;
    @JSONField(name = "draft")
    private String draft;
    @JSONField(name = "headUrl")
    private String headUrl;
    @JSONField(name = "lastAtMeMessageCode")
    private SimpleMsgCode lastAtMeMessageCode;
    @JSONField(name = "lastMessageSummary")
    private SimpleMessageSummary lastMessageSummary;
    @JSONField(name = "readOffsetTime")
    private long readOffsetTime;
    @JSONField(name = "unReadNumber")
    private int unReadNumber;

    static {
        kge.a(-427066794);
        kge.a(1028243835);
    }

    public String getConversationName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9783d455", new Object[]{this}) : this.conversationName;
    }

    public void setConversationName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953944c1", new Object[]{this, str});
        } else {
            this.conversationName = str;
        }
    }

    public String getHeadUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4248ad60", new Object[]{this}) : this.headUrl;
    }

    public void setHeadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0877e", new Object[]{this, str});
        } else {
            this.headUrl = str;
        }
    }

    public SimpleMessageSummary getLastMessageSummary() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMessageSummary) ipChange.ipc$dispatch("5148be94", new Object[]{this}) : this.lastMessageSummary;
    }

    public void setLastMessageSummary(SimpleMessageSummary simpleMessageSummary) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4161ee", new Object[]{this, simpleMessageSummary});
        } else {
            this.lastMessageSummary = simpleMessageSummary;
        }
    }

    public int getUnReadNumber() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("418b87e8", new Object[]{this})).intValue() : this.unReadNumber;
    }

    public void setUnReadNumber(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7bf622", new Object[]{this, new Integer(i)});
        } else {
            this.unReadNumber = i;
        }
    }

    public long getReadOffsetTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c86e37a7", new Object[]{this})).longValue() : this.readOffsetTime;
    }

    public void setReadOffsetTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939df4e5", new Object[]{this, new Long(j)});
        } else {
            this.readOffsetTime = j;
        }
    }

    public String getDraft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("add2bfee", new Object[]{this}) : this.draft;
    }

    public void setDraft(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95dd3b0", new Object[]{this, str});
        } else {
            this.draft = str;
        }
    }

    public int getAtMessageType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e57f3a72", new Object[]{this})).intValue() : this.atMessageType;
    }

    public void setAtMessageType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61940a70", new Object[]{this, new Integer(i)});
        } else {
            this.atMessageType = i;
        }
    }

    public SimpleMsgCode getLastAtMeMessageCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMsgCode) ipChange.ipc$dispatch("b0ff71c7", new Object[]{this}) : this.lastAtMeMessageCode;
    }

    public void setLastAtMeMessageCode(SimpleMsgCode simpleMsgCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b7795b", new Object[]{this, simpleMsgCode});
        } else {
            this.lastAtMeMessageCode = simpleMsgCode;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConversationContent{conversationName='" + this.conversationName + "', headUrl='" + this.headUrl + "', lastMessageSummary=" + this.lastMessageSummary + ", unReadNumber=" + this.unReadNumber + ", readOffsetTime=" + this.readOffsetTime + ", draft='" + this.draft + "', atMessageType=" + this.atMessageType + ", lastAtMeMessageCode=" + this.lastAtMeMessageCode + '}';
    }
}
