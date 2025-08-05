package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;
import tb.sad;

/* loaded from: classes.dex */
public class SuperviseData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bodyDeflatedType;
    public int bodySize;
    public int compressSize;
    public double defaultPathRecvWeight;
    public double defaultPathSendWeight;
    public int fecProtected;
    public int fecRecoverCnt;
    private int fecStreamDownSize;
    private int fecStreamUpSize;
    public int maxPto;
    public int originContentLength;
    public long rateLimit;
    public int recvBodySize;
    public int recvBodyUncompressSize;
    public int recvCompressSize;
    public int recvUncompressSize;
    public int reqMultipathStatus;
    public long requestStart;
    private long responseBodyCbStart;
    public long responseBodyStart;
    public long responseEnd;
    private long responseHeadCbStart;
    public long responseHeaderEnd;
    public long responseStart;
    public long rspDecompressionTime;
    public long sendEnd;
    public long sendStart;
    public SpdySession spdySession;
    public long streamFinRecvTime;
    public int streamId;
    private String streamInfo;
    public long streamPktRecvStart;
    public int streamPktRetrans;
    public int streamPktSend;
    public long streamPktSendStart;
    public long streamRecvBodyStart;
    public long streamRecvStart;
    public long streamRecvTime;
    public int uncompressSize;
    public int unreliableChannelMss;
    public int waitConnectStat;
    public long srtt = -1;
    public long minRtt = -1;
    public long connInFlight = -1;
    private long connSendSize = -1;
    private long connRecvSize = -1;
    private int recvPacketCount = -1;
    private int sendPacketCount = -1;
    private long connLastRdEventIdleTime = -1;
    public int tunnel0RTTStatus = -1;
    public int tunnelErrorCode = -1;
    public int tunnelDegraded = -1;
    public int tunnelRetryTimes = -1;
    public int tunnelType = 0;

    public String getExternStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8a3972f", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("qcStat=");
        sb.append(SoInstallMgrSdk.loadQuicStat);
        sb.append(",qcTime=");
        sb.append(SoInstallMgrSdk.getFetchQuicTime());
        sb.append(",zstdRso=");
        sb.append(SoInstallMgrSdk.loadZstdStat);
        sb.append(",zstdTime=");
        sb.append(SoInstallMgrSdk.getFetchZstdTime());
        sb.append(",network=");
        sb.append(NetWorkStatusUtil.g());
        sb.append(",thread=");
        sb.append(sad.I());
        sb.append(",rspHeadCb=");
        sb.append(this.responseHeadCbStart - this.responseStart);
        sb.append(",rspBodyCb=");
        sb.append(this.responseBodyCbStart - this.responseStart);
        sb.append(",");
        sb.append(NetWorkStatusUtil.d());
        sb.append(",streamInfo=");
        sb.append(this.streamInfo);
        return sb.toString();
    }

    public String getConnInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95bbe589", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("sendSize=");
        sb.append(this.connSendSize);
        sb.append(",recvSize=");
        sb.append(this.connRecvSize);
        sb.append(",sendPkt=");
        sb.append(this.sendPacketCount);
        sb.append(",recvPkt=");
        sb.append(this.recvPacketCount);
        sb.append(",lastRdIdleTime=");
        sb.append(this.connLastRdEventIdleTime);
        sb.append(",srtt=");
        sb.append(this.srtt);
        sb.append(",minRtt=");
        sb.append(this.minRtt);
        sb.append(",inFlight=");
        sb.append(this.connInFlight);
        SpdySession spdySession = this.spdySession;
        if (spdySession != null && spdySession.isTunnel()) {
            sb.append(",tlType=");
            sb.append(this.tunnelType);
            sb.append(",tl0RTTStatus=");
            sb.append(this.tunnel0RTTStatus);
            sb.append(",tlErrorCode=");
            sb.append(this.tunnelErrorCode);
            sb.append(",tlDegraded=");
            sb.append(this.tunnelDegraded);
            sb.append(",tlRetryTimes=");
            sb.append(this.tunnelRetryTimes);
        }
        return sb.toString();
    }

    public String superviseDataToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c78223", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(400);
        sb.append("tnetProcessTime=");
        sb.append(this.sendStart - this.requestStart);
        sb.append(",sendCostTime=");
        sb.append(this.sendEnd - this.sendStart);
        sb.append(",firstDateTime=");
        sb.append(this.responseStart - this.sendEnd);
        sb.append(",recvHeaderTime=");
        sb.append(this.responseHeaderEnd - this.responseStart);
        sb.append(",recvBodyTime=");
        sb.append(this.responseEnd - this.responseBodyStart);
        sb.append(",reqEnd2BeginTime=");
        sb.append(this.streamFinRecvTime - this.requestStart);
        sb.append(",streamH2b=");
        sb.append(this.streamRecvBodyStart - this.streamRecvStart);
        sb.append(",rspH2b=");
        sb.append(this.responseBodyStart - this.responseStart);
        sb.append(",rspHeadCb=");
        sb.append(this.responseHeadCbStart - this.responseStart);
        sb.append(",rspBodyCb=");
        sb.append(this.responseBodyCbStart - this.responseStart);
        sb.append(",rspStartTs=");
        sb.append(this.responseStart);
        sb.append(",reqHeadInflate=");
        sb.append(this.uncompressSize);
        sb.append(",reqHeadDeflate=");
        sb.append(this.compressSize);
        sb.append(",reqBodySize=");
        sb.append(this.bodySize);
        sb.append(",rspHeadDeflate=");
        sb.append(this.recvCompressSize);
        sb.append(",rspHeadInflate=");
        sb.append(this.recvUncompressSize);
        sb.append(",rspBodyDeflate=");
        sb.append(this.recvBodySize);
        sb.append(",rspBodyInflate=");
        sb.append(this.recvBodyUncompressSize);
        sb.append(",contentLength=");
        sb.append(this.originContentLength);
        sb.append(",bodyDeflatedType=");
        sb.append(this.bodyDeflatedType);
        sb.append(",streamId=");
        sb.append(this.streamId);
        sb.append(",reqMpStatus=");
        sb.append(this.reqMultipathStatus);
        sb.append(",rateLimit=");
        sb.append(this.rateLimit);
        sb.append(",fecDownSz=");
        sb.append(this.fecStreamDownSize);
        sb.append(",fecUpSz=");
        sb.append(this.fecStreamUpSize);
        if (this.spdySession != null) {
            sb.append(",scid=");
            sb.append(this.spdySession.mSuperviseConnectInfo.scid);
            sb.append(",forceCellular=");
            sb.append(this.spdySession.isForceUseCellular());
            if ((this.spdySession.getMode() & 256) != 0 && (this.spdySession.getMode() & 16) != 0) {
                sb.append(",mss=");
                sb.append(this.spdySession.unreliableChannelMss);
            }
        }
        sb.append(",sendWt=");
        sb.append(this.defaultPathSendWeight);
        sb.append(",recvWt=");
        sb.append(this.defaultPathRecvWeight);
        sb.append(",exStat=");
        sb.append(getExternStat());
        sb.append(",connInfo=[");
        sb.append(getConnInfo());
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
