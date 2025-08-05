package anet.channel.statist;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "conn_stat")
/* loaded from: classes.dex */
public class SessionConnStat extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String errorCode;
    @Dimension
    public String errorMsg;
    @Dimension
    public StringBuilder errorTrace;
    @Dimension
    public JSONObject extra;
    @Dimension
    public int firstIpType;
    @Dimension
    public int forceCellular;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public int ipStackType;
    @Dimension
    public String isBg;
    @Dimension
    public boolean isComplex;
    @Dimension
    public boolean isComplexEnable;
    @Dimension
    public boolean isCreated;
    @Dimension
    public boolean isTicketStore;
    @Dimension
    public boolean isTunnel;
    @Dimension
    public int port;
    @Dimension
    public String protocolType;
    @Dimension
    public int ret;
    @Dimension
    public int sessionCount;
    @Dimension
    public String unit;
    @Dimension
    public int ipRefer = 0;
    @Dimension
    public int ipType = 1;
    @Dimension
    public double lng = 90000.0d;
    @Dimension
    public double lat = 90000.0d;
    @Dimension
    public float accuracy = -1.0f;
    @Dimension
    public int isProxy = 0;
    @Dimension
    public int xquicErrorCode = -1;
    @Measure(max = 60000.0d)
    public long totalTime = 0;
    @Measure(max = 60000.0d)
    public long authTime = 0;
    public volatile boolean isCommited = false;
    public volatile long start = 0;
    public volatile long startConnect = 0;
    @Dimension
    public String netType = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public String bssid = NetworkStatusHelper.getWifiBSSID();
    @Dimension
    public int roaming = NetworkStatusHelper.isRoaming() ? 1 : 0;
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public int retryTimes = -1;

    static {
        kge.a(1394055262);
    }

    public SessionConnStat() {
        this.isBg = GlobalAppRuntimeInfo.isAppBackground() ? "bg" : "fg";
        this.ipStackType = Inet64Util.getStackType();
        this.isComplexEnable = AwcnConfig.isComplexConnectEnable();
        this.isTicketStore = AwcnConfig.isTicketStoreUpgrade();
    }

    public void syncValueFromSession(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de104f5", new Object[]{this, session});
            return;
        }
        SessionStatistic sessionStatistic = session.mSessionStat;
        this.ip = sessionStatistic.ip;
        this.port = sessionStatistic.port;
        this.ipRefer = sessionStatistic.ipRefer;
        this.ipType = sessionStatistic.ipType;
        this.protocolType = sessionStatistic.conntype;
        this.host = sessionStatistic.host;
        this.isProxy = sessionStatistic.isProxy;
        this.authTime = sessionStatistic.authTime;
        this.unit = session.getUnit();
        this.isTunnel = sessionStatistic.isTunnel;
        this.forceCellular = sessionStatistic.forceCellular;
        if (this.unit != null || this.ipRefer != 1) {
            return;
        }
        this.unit = "LocalDNS";
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        if (this.isCommited) {
            return false;
        }
        this.isCommited = true;
        return true;
    }

    public void appendErrorTrace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d4e6e5", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        if (this.errorTrace.length() > 0) {
            this.errorTrace.append(",");
        }
        StringBuilder sb = this.errorTrace;
        sb.append(i);
        sb.append("=");
        sb.append(System.currentTimeMillis() - this.startConnect);
    }

    public void putExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a756e", new Object[]{this, str, obj});
            return;
        }
        try {
            if (this.extra == null) {
                this.extra = new JSONObject();
            }
            this.extra.put(str, obj);
        } catch (JSONException unused) {
        }
    }
}
