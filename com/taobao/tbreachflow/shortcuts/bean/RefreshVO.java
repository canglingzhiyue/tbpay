package com.taobao.tbreachflow.shortcuts.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class RefreshVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long nextRefreshTime;

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue() : this.nextRefreshTime;
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }
}
