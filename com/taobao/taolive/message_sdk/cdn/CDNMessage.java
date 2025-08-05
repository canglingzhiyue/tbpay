package com.taobao.taolive.message_sdk.cdn;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;

/* loaded from: classes8.dex */
public class CDNMessage implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String data;
    private String msgId;
    private long pushTime;
    private int subType;
    private String topic;

    public String getMsgId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ab64bf3", new Object[]{this}) : this.msgId;
    }

    public void setMsgId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ebc84b", new Object[]{this, str});
        } else {
            this.msgId = str;
        }
    }

    public int getSubType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ffce0fde", new Object[]{this})).intValue() : this.subType;
    }

    public void setSubType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303d5b84", new Object[]{this, new Integer(i)});
        } else {
            this.subType = i;
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

    public long getPushTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4bf19478", new Object[]{this})).longValue() : this.pushTime;
    }

    public void setPushTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c517d934", new Object[]{this, new Long(j)});
        } else {
            this.pushTime = j;
        }
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
}
