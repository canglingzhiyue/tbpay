package com.taobao.taolive.message_sdk.mtop.heart;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;

/* loaded from: classes8.dex */
public class HeartbeatReportRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, String> extra;
    private Map<String, Object> receiveMsg;
    private String topic;
    private Map<String, String> utParam;
    private String API_NAME = "mtop.taobao.content.log.live.heartbeat.report";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private long stage = 0;
    private String statusList = null;
    private long bizCode = 0;
    private String sessionId = null;
    private long timestamp = 0;
    private long incRemainTime = 0;
    private long remainTime = 0;

    public String getAPI_NAME() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad3bbbb3", new Object[]{this}) : this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85191523", new Object[]{this, str});
        } else {
            this.API_NAME = str;
        }
    }

    public String getVERSION() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a81d7b97", new Object[]{this}) : this.VERSION;
    }

    public void setVERSION(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62958027", new Object[]{this, str});
        } else {
            this.VERSION = str;
        }
    }

    public boolean isNEED_ECODE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35834a7e", new Object[]{this})).booleanValue() : this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6759b162", new Object[]{this, new Boolean(z)});
        } else {
            this.NEED_ECODE = z;
        }
    }

    public boolean isNEED_SESSION() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64348f02", new Object[]{this})).booleanValue() : this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf9ab5e", new Object[]{this, new Boolean(z)});
        } else {
            this.NEED_SESSION = z;
        }
    }

    public long getStage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6cd809c3", new Object[]{this})).longValue() : this.stage;
    }

    public void setStage(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4df4e1", new Object[]{this, new Long(j)});
        } else {
            this.stage = j;
        }
    }

    public String getStatusList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7148af13", new Object[]{this}) : this.statusList;
    }

    public void setStatusList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb6bac3", new Object[]{this, str});
        } else {
            this.statusList = str;
        }
    }

    public long getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("842ad8e5", new Object[]{this})).longValue() : this.bizCode;
    }

    public void setBizCode(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3779b6ff", new Object[]{this, new Long(j)});
        } else {
            this.bizCode = j;
        }
    }

    public String getSessionId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this}) : this.sessionId;
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.sessionId = str;
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

    public long getTimestamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue() : this.timestamp;
    }

    public void setTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcccc9", new Object[]{this, new Long(j)});
        } else {
            this.timestamp = j;
        }
    }

    public long getIncRemainTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8ec721c", new Object[]{this})).longValue() : this.incRemainTime;
    }

    public void setIncRemainTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdcba8", new Object[]{this, new Long(j)});
        } else {
            this.incRemainTime = j;
        }
    }

    public long getRemainTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bdd5704a", new Object[]{this})).longValue() : this.remainTime;
    }

    public void setRemainTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33afaaa2", new Object[]{this, new Long(j)});
        } else {
            this.remainTime = j;
        }
    }

    public Map<String, String> getUtParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("38f9f174", new Object[]{this}) : this.utParam;
    }

    public void setUtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc49a32", new Object[]{this, map});
        } else {
            this.utParam = map;
        }
    }

    public Map<String, String> getExtra() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9fb6b656", new Object[]{this}) : this.extra;
    }

    public void setExtra(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feae8490", new Object[]{this, map});
        } else {
            this.extra = map;
        }
    }

    public Map<String, Object> getReceiveMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f0104710", new Object[]{this}) : this.receiveMsg;
    }

    public void setReceiveMsg(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfd407e", new Object[]{this, map});
        } else {
            this.receiveMsg = map;
        }
    }
}
