package com.taobao.android.weex.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexApmCustomData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long wxCustomContainerStartTimeStamp;
    private long wxCustomStartTimeStamp;

    static {
        kge.a(-795922522);
        kge.a(1028243835);
    }

    public long getWxCustomStartTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("70ad0677", new Object[]{this})).longValue() : this.wxCustomStartTimeStamp;
    }

    public void setWxCustomStartTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0c4c15", new Object[]{this, new Long(j)});
        } else {
            this.wxCustomStartTimeStamp = j;
        }
    }

    public long getWxCustomContainerStartTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("38450f48", new Object[]{this})).longValue() : this.wxCustomContainerStartTimeStamp;
    }

    public void setWxCustomContainerStartTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c68e8fc", new Object[]{this, new Long(j)});
        } else {
            this.wxCustomContainerStartTimeStamp = j;
        }
    }
}
