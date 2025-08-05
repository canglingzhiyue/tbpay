package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice;
import com.taobao.tao.homepage.launcher.g;

/* loaded from: classes.dex */
public class llw implements IInfoFlowDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1951810210);
        kge.a(1012614339);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : g.b();
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.IInfoFlowDevice
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : (int) akt.b();
    }
}
