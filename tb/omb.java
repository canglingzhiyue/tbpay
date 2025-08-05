package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.b;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;

/* loaded from: classes8.dex */
public class omb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(a aVar);

        boolean c();
    }

    static {
        kge.a(1579771978);
    }

    public static oma a(int i, int i2, List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oma) ipChange.ipc$dispatch("522daeca", new Object[]{new Integer(i), new Integer(i2), list});
        }
        MsgLog.a("MonitorTaskFactory", "createMonitorTask type= ", Integer.valueOf(i));
        if (i == 1) {
            return new olz(i2);
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                } else if (list != null) {
                    return new omd(i2, list);
                }
                if (list == null) {
                    return null;
                }
                return new oly(list);
            }
        } else if (list != null) {
            return new omc(list);
        }
        return new ome(i2);
    }
}
