package tb;

import com.alibaba.android.ultron.engine.protocol.EndPoint;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1406486750);
    }

    public static EndPoint a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EndPoint) ipChange.ipc$dispatch("218b1640", new Object[0]);
        }
        EndPoint endPoint = new EndPoint();
        endPoint.protocolVersion = "3.0";
        return endPoint;
    }
}
