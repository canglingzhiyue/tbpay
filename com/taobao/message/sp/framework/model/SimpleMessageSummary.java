package com.taobao.message.sp.framework.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMessageSummary implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "code")
    private SimpleMsgCode code;
    @JSONField(name = "content")
    private String content;
    @JSONField(name = "msgType")
    private int msgType;
    @JSONField(name = "receiverState")
    private SimpleMessageReceiverState receiverState;
    @JSONField(name = "selfStatus")
    private int selfStatus;
    @JSONField(name = RemoteMessageConst.SEND_TIME)
    private long sendTime;
    @JSONField(name = "sender")
    private SimpleTarget sender;
    @JSONField(name = "status")
    private int status;

    static {
        kge.a(-1679263297);
        kge.a(1028243835);
    }

    public String getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : this.content;
    }

    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
        }
    }

    public long getSendTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe3a66e6", new Object[]{this})).longValue() : this.sendTime;
    }

    public void setSendTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be95486", new Object[]{this, new Long(j)});
        } else {
            this.sendTime = j;
        }
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public int getSelfStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9683d4ce", new Object[]{this})).intValue() : this.selfStatus;
    }

    public void setSelfStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cdd2fc", new Object[]{this, new Integer(i)});
        } else {
            this.selfStatus = i;
        }
    }

    public SimpleMessageReceiverState getReceiverState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMessageReceiverState) ipChange.ipc$dispatch("11a08ed7", new Object[]{this}) : this.receiverState;
    }

    public void setReceiverState(SimpleMessageReceiverState simpleMessageReceiverState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fca193b", new Object[]{this, simpleMessageReceiverState});
        } else {
            this.receiverState = simpleMessageReceiverState;
        }
    }

    public int getMsgType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f35281f", new Object[]{this})).intValue() : this.msgType;
    }

    public void setMsgType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db94b63", new Object[]{this, new Integer(i)});
        } else {
            this.msgType = i;
        }
    }

    public SimpleMsgCode getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMsgCode) ipChange.ipc$dispatch("95525a6d", new Object[]{this}) : this.code;
    }

    public void setCode(SimpleMsgCode simpleMsgCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926338dd", new Object[]{this, simpleMsgCode});
        } else {
            this.code = simpleMsgCode;
        }
    }

    public SimpleTarget getSender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("e050f82", new Object[]{this}) : this.sender;
    }

    public void setSender(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c551c", new Object[]{this, simpleTarget});
        } else {
            this.sender = simpleTarget;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageSummary{content='" + this.content + "', sendTime=" + this.sendTime + ", status=" + this.status + ", selfStatus=" + this.selfStatus + ", receiverState=" + this.receiverState + ", msgType=" + this.msgType + ", code=" + this.code + ", sender=" + this.sender + '}';
    }
}
