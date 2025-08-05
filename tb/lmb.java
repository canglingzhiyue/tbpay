package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.n;
import com.taobao.infoflow.core.engine.env.protocol.j;

/* loaded from: classes.dex */
public class lmb implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AliLogInterface f30701a = n.a();

    static {
        kge.a(-1928860334);
        kge.a(198880145);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.j
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f30701a;
        if (aliLogInterface == null) {
            return;
        }
        aliLogInterface.a(str, str2, str3);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.j
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f30701a;
        if (aliLogInterface == null) {
            return;
        }
        aliLogInterface.b(str, str2, str3);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.j
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f30701a;
        if (aliLogInterface == null) {
            return;
        }
        aliLogInterface.c(str, str2, str3);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.j
    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc3689", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f30701a;
        if (aliLogInterface == null) {
            return;
        }
        aliLogInterface.d(str, str2, str3);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.j
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
            return;
        }
        AliLogInterface aliLogInterface = this.f30701a;
        if (aliLogInterface == null) {
            return;
        }
        aliLogInterface.a(str, str2, th);
    }
}
