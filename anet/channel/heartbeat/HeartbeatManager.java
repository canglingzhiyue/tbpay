package anet.channel.heartbeat;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class HeartbeatManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(559761859);
    }

    public static IHeartbeat getDefaultHeartbeat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHeartbeat) ipChange.ipc$dispatch("bd8fe1c4", new Object[0]) : new DefaultHeartbeatImpl();
    }

    public static IHeartbeat getDefaultBackgroundAccsHeartbeat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHeartbeat) ipChange.ipc$dispatch("8fcd8284", new Object[0]) : new DefaultBgAccsHeartbeatImpl();
    }
}
