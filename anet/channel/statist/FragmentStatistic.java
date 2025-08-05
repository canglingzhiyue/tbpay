package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "fragmentation")
/* loaded from: classes2.dex */
public class FragmentStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public int actualPathType;
    @Dimension
    public int actualSessionType;
    @Dimension
    public int deviceLevel;
    @Dimension
    public int firstErrorCode;
    @Dimension
    public String harmonyVersion;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public int ipStackType;
    @Dimension
    public int isHarmonyOS;
    @Dimension
    public int planPathType;
    @Dimension
    public int planSessionType;
    @Dimension
    public int port;
    @Dimension
    public String protocolType;
    @Dimension
    public int requestIndex;
    @Dimension
    public int retryTimes;
    @Dimension
    public int retryType;
    @Dimension
    public long sinceInitTime;
    @Dimension
    public long sinceLastLaunchTime;
    @Dimension
    public String unit;
    @Dimension
    public String url;
    @Dimension
    public int userPathType;
    @Dimension
    public String xqcConnEnv;
    @Dimension
    public int startType = 0;
    @Dimension
    public String isBg = "";
    @Dimension
    public String mnc = "0";
    @Dimension
    public String contentEncoding = null;
    @Dimension
    public String errorMessage = "";
    @Dimension
    public int isFromExternal = 0;
    @Dimension
    public int ret = 0;
    @Dimension
    public int statusCode = 0;
    @Dimension
    public int getLongMultiPathRet = 0;
    @Dimension
    public int priorityLevel = -1;
    @Dimension
    public String scene = null;
    @Dimension
    public int deprecatedSessionType = 0;
    @Dimension
    public boolean isNetworkChangeThresholdTime = false;
    @Measure
    public long traffic = 0;
    @Measure
    public long retryCostTime = 0;
    @Measure
    public long firstDataTime = 0;
    @Measure
    public long totalTime = 0;
    @Measure
    public long srtt = 0;
    public long startTimestamp = 0;
    public long retryTimestamp = 0;
    public long finishTimestamp = 0;

    /* loaded from: classes2.dex */
    public interface GetLongMultiPathRet {
        public static final int ACTUAL_NOT = 2;
        public static final int EXCEPTION = 4;
        public static final int FAILED = 3;
        public static final int NONE = 0;
        public static final int SUCCESS = 1;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(1317626600);
    }

    public void setBaseInfo(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24f2f40", new Object[]{this, requestStatistic});
            return;
        }
        this.startType = requestStatistic.startType;
        this.ipStackType = requestStatistic.ipStackType;
        this.xqcConnEnv = requestStatistic.xqcConnEnv;
        this.isBg = requestStatistic.isBg;
        this.url = requestStatistic.url;
        this.mnc = requestStatistic.mnc;
        this.contentEncoding = requestStatistic.contentEncoding;
        this.host = requestStatistic.host;
        this.ip = requestStatistic.ip;
        this.port = requestStatistic.port;
        this.isHarmonyOS = requestStatistic.isHarmonyOS;
        this.harmonyVersion = requestStatistic.harmonyVersion;
        this.deviceLevel = requestStatistic.deviceLevel;
        this.protocolType = requestStatistic.protocolType;
        this.errorMessage = requestStatistic.msg;
        this.isFromExternal = requestStatistic.isFromExternal;
        this.unit = requestStatistic.unit;
        this.sinceInitTime = requestStatistic.sinceInitTime;
        this.sinceLastLaunchTime = requestStatistic.sinceLastLaunchTime;
        this.firstDataTime = requestStatistic.firstDataTime;
        this.srtt = requestStatistic.srtt;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[FragmentStatistic] ret=");
        sb.append(this.ret);
        sb.append(",statusCode=");
        sb.append(this.statusCode);
        sb.append(",errorMessage=");
        sb.append(this.errorMessage);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",ip=");
        sb.append(this.ip);
        sb.append(",port=");
        sb.append(this.port);
        sb.append(",protocolType=");
        sb.append(this.protocolType);
        sb.append(",userPathType=");
        sb.append(this.userPathType);
        if (this.retryTimes > 0) {
            sb.append(",firstErrorCode=");
            sb.append(this.firstErrorCode);
        }
        sb.append(",sinceInitTime=");
        sb.append(this.sinceInitTime);
        sb.append(",sinceLastLaunchTime=");
        sb.append(this.sinceLastLaunchTime);
        sb.append(",startType=");
        sb.append(this.startType);
        sb.append(",retryTime=");
        sb.append(this.retryTimes);
        sb.append(",retryCostTime=");
        sb.append(this.retryCostTime);
        sb.append(",firstDataTime=");
        sb.append(this.firstDataTime);
        sb.append(",srtt=");
        sb.append(this.srtt);
        sb.append(",totalTime=");
        sb.append(this.totalTime);
        sb.append(",xqcConnEnv=");
        sb.append(this.xqcConnEnv);
        sb.append(",ipStackType=");
        sb.append(this.ipStackType);
        sb.append(",isHarmonyOS=");
        sb.append(this.isHarmonyOS);
        sb.append(",isFromExternal=");
        sb.append(this.isFromExternal);
        sb.append(",contentEncoding=");
        sb.append(this.contentEncoding);
        sb.append(",deprecatedSessionType=");
        sb.append(this.deprecatedSessionType);
        sb.append(",url=");
        sb.append(this.url);
        return sb.toString();
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue() : this.statusCode != -200;
    }
}
