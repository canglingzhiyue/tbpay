package mtopsdk.network.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.common.util.StringUtils;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class NetworkStats implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -3538602124202475612L;
    public String netStatSum;
    public int retryTimes;
    public String connectionType = "";
    public boolean isRequestSuccess = false;
    public int resultCode = 0;
    public String host = "";
    public String ip_port = "";
    public boolean isSSL = false;
    public long oneWayTime_ANet = 0;
    public long sendWaitTime = 0;
    public long firstDataTime = 0;
    public long recDataTime = 0;
    public long processTime = 0;
    public long serverRT = 0;
    public long sendSize = 0;
    public long recvSize = 0;
    public long dataSpeed = 0;
    public long streamParseTime = 0;
    public long streamParseSize = 0;
    public boolean streamParseException = false;

    static {
        kge.a(633069086);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public String sumNetStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2b2b9f3", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("oneWayTime_ANet=");
        sb.append(this.oneWayTime_ANet);
        sb.append(",resultCode=");
        sb.append(this.resultCode);
        sb.append(",isRequestSuccess=");
        sb.append(this.isRequestSuccess);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",ip_port=");
        sb.append(this.ip_port);
        sb.append(",isSSL=");
        sb.append(this.isSSL);
        sb.append(",connType=");
        sb.append(this.connectionType);
        sb.append(",processTime=");
        sb.append(this.processTime);
        sb.append(",firstDataTime=");
        sb.append(this.firstDataTime);
        sb.append(",recDataTime=");
        sb.append(this.recDataTime);
        sb.append(",sendWaitTime=");
        sb.append(this.sendWaitTime);
        sb.append(",serverRT=");
        sb.append(this.serverRT);
        sb.append(",sendSize=");
        sb.append(this.sendSize);
        sb.append(",recvSize=");
        sb.append(this.recvSize);
        sb.append(",dataSpeed=");
        sb.append(this.dataSpeed);
        sb.append(",retryTimes=");
        sb.append(this.retryTimes);
        sb.append(",streamParseTime=");
        sb.append(this.streamParseTime);
        sb.append(",streamParseSize=");
        sb.append(this.streamParseSize);
        sb.append(",streamParseException=");
        sb.append(this.streamParseException);
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
        StringBuilder sb = new StringBuilder(128);
        sb.append("NetworkStats [");
        sb.append(this.netStatSum);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
