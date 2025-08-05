package com.taobao.message.sp.framework.model;

import android.support.v4.app.NotificationCompat;
import android.util.Log;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.sur;

/* loaded from: classes7.dex */
public class SimpleMessage implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "channelType")
    private int channelType;
    @JSONField(name = "code")
    private SimpleMsgCode code;
    @JSONField(name = "conversationCode")
    private String conversationCode;
    @JSONField(name = SimpleProfile.KEY_MODIFY_TIME)
    private long modifyTime;
    @JSONField(name = "msgType")
    private int msgType;
    @JSONField(name = sur.KEY_RECEIVER)
    private SimpleTarget receiver;
    @JSONField(name = "receiverState")
    private SimpleMessageReceiverState receiverState;
    @JSONField(name = NotificationCompat.CATEGORY_REMINDER)
    private SimpleMessageReminder reminder;
    @JSONField(name = "selfState")
    private int selfState;
    @JSONField(name = RemoteMessageConst.SEND_TIME)
    private long sendTime;
    @JSONField(name = "sender")
    private SimpleTarget sender;
    @JSONField(name = "sortTimeMicrosecond")
    private long sortTimeMicrosecond;
    @JSONField(name = "status")
    private int status;
    @JSONField(name = "summary")
    private String summary;
    @JSONField(name = "tag")
    private String tag;
    @JSONField(name = "originalData")
    private Map<String, Object> originalData = new HashMap();
    @JSONField(name = "ext")
    private Map<String, Object> ext = new HashMap();
    @JSONField(name = "localExt")
    private Map<String, Object> localExt = new HashMap();
    @JSONField(name = "viewMap")
    private Map<String, Object> viewMap = new ConcurrentHashMap();

    static {
        kge.a(1569776615);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public SimpleMessage() {
    }

    public SimpleMessage(SimpleMsgCode simpleMsgCode) {
        this.code = simpleMsgCode;
    }

    public String getConversationCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c7f233", new Object[]{this}) : this.conversationCode;
    }

    public void setConversationCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df78e2a3", new Object[]{this, str});
        } else {
            this.conversationCode = str;
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

    public SimpleTarget getReceiver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("57c5ac08", new Object[]{this}) : this.receiver;
    }

    public void setReceiver(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb77656", new Object[]{this, simpleTarget});
        } else {
            this.receiver = simpleTarget;
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

    public Map<String, Object> getOriginalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b5d36bcd", new Object[]{this}) : this.originalData;
    }

    public void setOriginalData(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d8e661", new Object[]{this, map});
        } else if (this.originalData == null) {
        } else {
            this.originalData = map;
        }
    }

    public long getSortTimeMicrosecond() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("796d4372", new Object[]{this})).longValue() : this.sortTimeMicrosecond;
    }

    public void setSortTimeMicrosecond(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64086c12", new Object[]{this, new Long(j)});
        } else {
            this.sortTimeMicrosecond = j;
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

    public long getModifyTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8999f898", new Object[]{this})).longValue() : this.modifyTime;
    }

    public void setModifyTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07c2c14", new Object[]{this, new Long(j)});
        } else {
            this.modifyTime = j;
        }
    }

    public String getSummary() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9114d189", new Object[]{this}) : this.summary;
    }

    public void setSummary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9888e875", new Object[]{this, str});
        } else {
            this.summary = str;
        }
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.tag;
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.tag = str;
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

    public SimpleMessageReminder getReminder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMessageReminder) ipChange.ipc$dispatch("940b9ec7", new Object[]{this}) : this.reminder;
    }

    public void setReminder(SimpleMessageReminder simpleMessageReminder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5aa08d", new Object[]{this, simpleMessageReminder});
        } else {
            this.reminder = simpleMessageReminder;
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

    public int getSelfState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1c1ae9", new Object[]{this})).intValue() : this.selfState;
    }

    public void setSelfState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5e1ed9", new Object[]{this, new Integer(i)});
        } else {
            this.selfState = i;
        }
    }

    public Map<String, Object> getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this});
        }
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public void setExt(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ccc35f", new Object[]{this, map});
        } else {
            this.ext = map;
        }
    }

    public void setExtValue(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7ab07f", new Object[]{this, str, obj});
            return;
        }
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, obj);
    }

    public Map<String, Object> getLocalExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a66f1fa8", new Object[]{this});
        }
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        return this.localExt;
    }

    public void setLocalExt(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274e87e6", new Object[]{this, map});
        } else {
            this.localExt = map;
        }
    }

    public void setLocalExtValue(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4f4a46", new Object[]{this, str, obj});
            return;
        }
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.put(str, obj);
    }

    public Map<String, Object> getViewMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("258c607d", new Object[]{this});
        }
        if (this.viewMap == null) {
            this.viewMap = new ConcurrentHashMap();
        }
        return this.viewMap;
    }

    public void setViewMap(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73800c49", new Object[]{this, map});
            return;
        }
        if (this.viewMap == null) {
            this.viewMap = new ConcurrentHashMap();
        }
        this.viewMap.putAll(map);
    }

    public void setViewMapValue(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63d48e9", new Object[]{this, str, obj});
        } else if (str != null && obj != null) {
            if (this.viewMap == null) {
                this.viewMap = new ConcurrentHashMap();
            }
            this.viewMap.put(str, obj);
        } else {
            Log.e("messagesdkwrapper", "invalid parameters");
        }
    }

    /* renamed from: clone */
    public SimpleMessage m1148clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleMessage) ipChange.ipc$dispatch("6281eb8e", new Object[]{this});
        }
        try {
            return (SimpleMessage) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SimpleMessage simpleMessage = (SimpleMessage) obj;
            SimpleMsgCode simpleMsgCode = this.code;
            if (simpleMsgCode != null) {
                return simpleMsgCode.equals(simpleMessage.code);
            }
            if (simpleMessage.code == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        SimpleMsgCode simpleMsgCode = this.code;
        if (simpleMsgCode == null) {
            return 0;
        }
        return simpleMsgCode.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Message{conversationCode='" + this.conversationCode + "', code=" + this.code + ", sender=" + this.sender + ", receiver=" + this.receiver + ", msgType=" + this.msgType + ", sortTimeMicrosecond=" + this.sortTimeMicrosecond + ", sendTime=" + this.sendTime + ", modifyTime=" + this.modifyTime + ", summary='" + this.summary + "', tag='" + this.tag + "', status=" + this.status + ", reminder=" + this.reminder + ", receiverState=" + this.receiverState + ", selfState=" + this.selfState + ", channelType=" + this.channelType + '}';
    }

    public int getChannelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7e5e6a1", new Object[]{this})).intValue() : this.channelType;
    }

    public void setChannelType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d3f721", new Object[]{this, new Integer(i)});
        } else {
            this.channelType = i;
        }
    }
}
