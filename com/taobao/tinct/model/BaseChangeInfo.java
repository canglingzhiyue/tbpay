package com.taobao.tinct.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "biz")
    public String bizName;
    @JSONField(name = "changeType")
    public ChangeType changeType;
    @JSONField(name = "time")
    public long updateTime;

    public abstract String getTinctTag();

    public BaseChangeInfo() {
        this(ChangeType.UNKNOWN);
    }

    public BaseChangeInfo(ChangeType changeType) {
        this.changeType = changeType;
        this.bizName = null;
        this.updateTime = System.currentTimeMillis();
    }

    public ChangeType getChangeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChangeType) ipChange.ipc$dispatch("dc839d10", new Object[]{this}) : this.changeType;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this}) : this.bizName;
    }

    public void setUpdateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626d0ce5", new Object[]{this, new Long(j)});
        } else {
            this.updateTime = j;
        }
    }

    public long getUpdateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a69139a7", new Object[]{this})).longValue() : this.updateTime;
    }
}
