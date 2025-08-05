package tb;

import com.alibaba.appmonitor.event.EventType;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aou {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TNET_REQUEST_SEND_OFFLINE = "tnet_request_send";
    public static final String UPLOAD_TRAFFIC_OFFLINE = "upload_traffic";
    public static final String module = "AppMonitor";

    /* renamed from: a  reason: collision with root package name */
    public String f25484a;
    public EventType b;
    public String c;
    public Double d;
    public DimensionValueSet e;
    public MeasureValueSet f;

    static {
        kge.a(948253363);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SelfMonitorEvent{arg='" + this.c + "', monitorPoint='" + this.f25484a + "', type=" + this.b + ", value=" + this.d + ", dvs=" + this.e + ", mvs=" + this.f + '}';
    }
}
