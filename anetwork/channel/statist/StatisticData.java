package anetwork.channel.statist;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class StatisticData implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -3538602124202475612L;
    public String cid;
    public String locationUrl;
    public String netStatSum;
    @Deprecated
    public String quicConnectionID;
    @Deprecated
    public int redirectTime;
    public int retryTime;
    public String connectionType = "";
    public boolean isRequestSuccess = false;
    public int resultCode = 0;
    public String host = "";
    @Deprecated
    public String api_v = "";
    public String ip_port = "";
    @Deprecated
    public boolean isSpdy = false;
    public boolean isSSL = false;
    @Deprecated
    public int dnsTime = 0;
    @Deprecated
    public int isDNSTimeout = 0;
    @Deprecated
    public long tcpLinkDate = 0;
    @Deprecated
    public long tcpConnTime = 0;
    public long oneWayTime_ANet = 0;
    public long cacheTime = 0;
    @Deprecated
    public long oneWayTime_AEngine = 0;
    @Deprecated
    public long oneWayTime_Jni = 0;
    public long postBodyTime = 0;
    @Deprecated
    public long spdyWaitTime = 0;
    public long processTime = 0;
    public long sendBeforeTime = 0;
    public long firstDataTime = 0;
    public long recDataTime = 0;
    @Deprecated
    public long receiveDataTime = 0;
    public long serverRT = 0;
    public long rtt = 0;
    @Deprecated
    public long netTime = 0;
    public long sendSize = 0;
    public long totalSize = 0;
    @Deprecated
    public long responseBodySize = 0;
    public long dataSpeed = 0;
    @Deprecated
    public String timeoutType = "";
    public long srtt = -1;
    public long minRtt = -1;
    public long connInFlight = -1;

    static {
        kge.a(543109235);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public void filledBy(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79d5488", new Object[]{this, requestStatistic});
        } else if (requestStatistic == null) {
        } else {
            this.resultCode = requestStatistic.statusCode;
            this.connectionType = requestStatistic.protocolType;
            this.isRequestSuccess = requestStatistic.ret == 1;
            this.host = requestStatistic.host;
            if (requestStatistic.ip != null && requestStatistic.port != 0) {
                this.ip_port = String.format("%s:%d", requestStatistic.ip, Integer.valueOf(requestStatistic.port));
            }
            this.retryTime = requestStatistic.retryTimes;
            this.isSSL = requestStatistic.isSSL;
            this.oneWayTime_ANet = requestStatistic.oneWayTime;
            this.cacheTime = requestStatistic.cacheTime;
            this.processTime = requestStatistic.processTime;
            this.sendBeforeTime = requestStatistic.sendBeforeTime;
            this.firstDataTime = requestStatistic.firstDataTime;
            this.recDataTime = requestStatistic.recDataTime;
            this.sendSize = requestStatistic.sendDataSize;
            this.totalSize = requestStatistic.recDataSize;
            this.serverRT = requestStatistic.serverRT;
            long j = this.recDataTime;
            this.dataSpeed = j != 0 ? this.totalSize / j : this.totalSize;
            this.locationUrl = requestStatistic.locationUrl;
            this.cid = requestStatistic.cid;
            this.srtt = requestStatistic.srtt;
            this.minRtt = requestStatistic.minRtt;
            this.connInFlight = requestStatistic.connInFlight;
        }
    }

    public String sumNetStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2b2b9f3", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("isSuccess=");
        sb.append(this.isRequestSuccess);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",resultCode=");
        sb.append(this.resultCode);
        sb.append(",connType=");
        sb.append(this.connectionType);
        sb.append(",oneWayTime_ANet=");
        sb.append(this.oneWayTime_ANet);
        sb.append(",ip_port=");
        sb.append(this.ip_port);
        sb.append(",isSSL=");
        sb.append(this.isSSL);
        sb.append(",cacheTime=");
        sb.append(this.cacheTime);
        sb.append(",processTime=");
        sb.append(this.processTime);
        sb.append(",sendBeforeTime=");
        sb.append(this.sendBeforeTime);
        sb.append(",postBodyTime=");
        sb.append(this.postBodyTime);
        sb.append(",firstDataTime=");
        sb.append(this.firstDataTime);
        sb.append(",recDataTime=");
        sb.append(this.recDataTime);
        sb.append(",serverRT=");
        sb.append(this.serverRT);
        sb.append(",rtt=");
        sb.append(this.rtt);
        sb.append(",sendSize=");
        sb.append(this.sendSize);
        sb.append(",totalSize=");
        sb.append(this.totalSize);
        sb.append(",dataSpeed=");
        sb.append(this.dataSpeed);
        sb.append(",retryTime=");
        sb.append(this.retryTime);
        sb.append(",cid=");
        sb.append(this.cid);
        sb.append(",srtt=");
        sb.append(this.srtt);
        sb.append(",minRtt=");
        sb.append(this.minRtt);
        sb.append(",connInFlight=");
        sb.append(this.connInFlight);
        return sb.toString();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (StringUtils.isBlank(this.netStatSum)) {
            this.netStatSum = sumNetStat();
        }
        return "StatisticData [" + this.netStatSum + riy.ARRAY_END_STR;
    }
}
