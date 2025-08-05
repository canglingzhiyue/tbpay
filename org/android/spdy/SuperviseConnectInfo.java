package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class SuperviseConnectInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int tunnelInitValue = -1;
    public int congControlKind;
    public long connLastRdEventIdleTime;
    public long connRecvSize;
    public long connSendSize;
    public int connectTime;
    public int currStrategySeq;
    public int currStrategyStatus;
    public String dcid;
    public int doHandshakeTime;
    public int fecSendCount;
    public int handshakeStat;
    public int handshakeTime;
    public int isForceCellular;
    public int isQuicTry0RTT;
    public int keepalive_period_second;
    public double lossRate;
    public String mpquicPathInfo;
    public int mpquicStatus;
    public int multiNetStatus;
    public int pubkeyRetry;
    public int recvCount;
    public int recvPacketCount;
    public int recvPacketMax;
    public double retransmissionRate;
    public int retryTimes;
    public int reused_counter;
    public int rtoCount;
    public String scid;
    public int sendCount;
    public int sendPacketCount;
    public int sessionTicketReused;
    public long srtt;
    public double standbyPathWeight;
    public int timeout;
    public int tlpCount;
    public int tunnelConnectTime;
    public String tunnelDcid;
    public double tunnelLossRate;
    public double tunnelRetransmissionRate;
    public String tunnelScid;
    public long tunnelSrtt;
    public int xqc0RttStatus;
    public StrategyInfo tunnelInfo = null;
    public long bgForbiddenTime = 0;
    public double defaultPathSendWeight = 1.0d;
    public double defaultPathRecvWeight = 1.0d;
    public int tunnel0RTTStatus = -1;
    public int tunnelErrorCode = -1;
    public int tunnelDegraded = -1;
    public int tunnelRetryTimes = -1;
    public int tunnelType = 0;

    public StrategyInfo getCurrStrategyInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StrategyInfo) ipChange.ipc$dispatch("8cdfba8e", new Object[]{this}) : this.tunnelInfo;
    }
}
