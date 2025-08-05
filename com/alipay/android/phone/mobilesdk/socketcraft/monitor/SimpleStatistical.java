package com.alipay.android.phone.mobilesdk.socketcraft.monitor;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SimpleStatistical {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long startConnAllTime = 0;
    public long endConnAllTime = 0;
    public long connectedTime = 0;
    public long disconnectedTime = 0;
    public long recvMsgCount = 0;
    public long sendMsgCount = 0;
    public String recvMsgLenArray = "";
    public String sendMsgLenArray = "";
    public String targetHost = "";
    public long dnsTime = -1;
    public long tcpTime = -1;
    public long sslTime = -1;
    public long wsHsTime = -1;

    public long getConnAllTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fea2c87", new Object[]{this})).longValue();
        }
        long j = this.startConnAllTime;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.endConnAllTime;
        if (j2 <= j) {
            return -1L;
        }
        return j2 - j;
    }

    public long getLinkLiveTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65cb5664", new Object[]{this})).longValue();
        }
        long j = this.connectedTime;
        if (j <= 0) {
            return -1L;
        }
        long j2 = this.disconnectedTime;
        if (j2 <= j) {
            return -1L;
        }
        return j2 - j;
    }
}
