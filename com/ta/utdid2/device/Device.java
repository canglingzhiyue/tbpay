package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes4.dex */
public class Device {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String imei = "";
    private String imsi = "";
    private String deviceId = "";
    private String utdid = "";
    private long mCreateTimestamp = 0;
    private long mCheckSum = 0;

    static {
        kge.a(70974342);
    }

    public long getCheckSum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee7e3194", new Object[]{this})).longValue() : this.mCheckSum;
    }

    public void setCheckSum(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741edf98", new Object[]{this, new Long(j)});
        } else {
            this.mCheckSum = j;
        }
    }

    public long getCreateTimestamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32b817bf", new Object[]{this})).longValue() : this.mCreateTimestamp;
    }

    public void setCreateTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9e8765", new Object[]{this, new Long(j)});
        } else {
            this.mCreateTimestamp = j;
        }
    }

    public String getImei() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fb5387b", new Object[]{this}) : this.imei;
    }

    public void setImei(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71175b", new Object[]{this, str});
        } else {
            this.imei = str;
        }
    }

    public String getImsi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e6b9a09", new Object[]{this}) : this.imsi;
    }

    public void setImsi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386e78d", new Object[]{this, str});
        } else {
            this.imsi = str;
        }
    }

    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : this.deviceId;
    }

    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
        } else {
            this.deviceId = str;
        }
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.utdid;
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }
}
