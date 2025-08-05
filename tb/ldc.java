package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice;

/* loaded from: classes.dex */
public class ldc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IInfoFlowDevice f30491a;

    static {
        kge.a(-1168293918);
    }

    public static void a(IInfoFlowDevice iInfoFlowDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49a0334", new Object[]{iInfoFlowDevice});
        } else {
            f30491a = iInfoFlowDevice;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        IInfoFlowDevice iInfoFlowDevice = f30491a;
        if (iInfoFlowDevice == null) {
            ldf.b("InfoFlowDevice", "getDeviceLevel gDevice == null");
            return null;
        }
        try {
            return iInfoFlowDevice.a();
        } catch (Throwable th) {
            ldf.a("InfoFlowDevice", "getDeviceLevel error", th);
            return null;
        }
    }

    public static Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("50145ad0", new Object[0]);
        }
        IInfoFlowDevice iInfoFlowDevice = f30491a;
        if (iInfoFlowDevice == null) {
            ldf.b("InfoFlowDevice", "getDeviceScore gDevice == null");
            return null;
        }
        try {
            return Integer.valueOf(iInfoFlowDevice.b());
        } catch (Throwable th) {
            ldf.a("InfoFlowDevice", "getDeviceScore error", th);
            return null;
        }
    }
}
