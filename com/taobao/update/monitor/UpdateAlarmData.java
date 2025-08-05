package com.taobao.update.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class UpdateAlarmData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String arg;
    public String disk_size;
    public long elapsed_time;
    public String errorCode;
    public String errorMsg;
    public String fromVersion;
    public boolean success;
    public String toVersion;
    public String url;

    static {
        kge.a(-2039520342);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAlarmData)) {
            return false;
        }
        UpdateAlarmData updateAlarmData = (UpdateAlarmData) obj;
        if (this.success != updateAlarmData.success || !this.arg.equals(updateAlarmData.arg) || !this.fromVersion.equals(updateAlarmData.fromVersion)) {
            return false;
        }
        return this.toVersion.equals(updateAlarmData.toVersion);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return ((((((this.success ? 1 : 0) * 31) + this.arg.hashCode()) * 31) + this.fromVersion.hashCode()) * 31) + this.toVersion.hashCode();
    }
}
