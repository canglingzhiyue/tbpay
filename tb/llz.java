package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;
import com.taobao.android.s;
import com.taobao.infoflow.core.engine.env.protocol.g;

/* loaded from: classes.dex */
public class llz implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AliMonitorInterface f30700a = s.a();

    static {
        kge.a(53093006);
        kge.a(1002792077);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.g
    public void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{this, str, str2, str3, new Double(d)});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f30700a;
        if (aliMonitorInterface == null) {
            return;
        }
        aliMonitorInterface.a(str, str2, str3, d);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.g
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f30700a;
        if (aliMonitorInterface == null) {
            return;
        }
        aliMonitorInterface.a(str, str2, str3);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.g
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f30700a;
        if (aliMonitorInterface == null) {
            return;
        }
        aliMonitorInterface.a(str, str2, str3, str4, str5);
    }
}
