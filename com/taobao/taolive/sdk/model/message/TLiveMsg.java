package com.taobao.taolive.sdk.model.message;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes8.dex */
public class TLiveMsg implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bizCode;
    public byte[] data;
    public String from;
    public String messageId;
    public boolean needAck;
    public int priority;
    public int qosLevel;
    public boolean sendFullTags;
    public String source;
    public String[] tags;
    public long timestamp;
    public String to;
    public String topic;
    public String userId;
    public int type = -1;
    public boolean needDeduplication = true;

    static {
        kge.a(-772754120);
        kge.a(1028243835);
    }

    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
        }
    }

    public void toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695e56cc", new Object[]{this});
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TLiveMsg{type=" + this.type + ", messageId='" + this.messageId + "', priority=" + this.priority + ", qosLevel=" + this.qosLevel + ", userId='" + this.userId + "', needAck=" + this.needAck + ", bizCode=" + this.bizCode + ", topic='" + this.topic + "', from='" + this.from + "', to='" + this.to + "', timestamp=" + this.timestamp + ", sendFullTags=" + this.sendFullTags + ", tags=" + Arrays.toString(this.tags) + ", data=" + Arrays.toString(this.data) + ", needDeduplication=" + this.needDeduplication + '}';
    }
}
