package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.a;
import com.taobao.android.launch.turbo.profile.e;
import com.taobao.android.launch.turbo.profile.g;
import com.taobao.android.launch.turbo.profile.i;
import com.taobao.android.launch.turbo.profile.j;

/* loaded from: classes5.dex */
public class gta implements gsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f28436a;

    static {
        kge.a(-266868315);
        kge.a(-2112197540);
    }

    @Override // tb.gsx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "WriteProfile";
    }

    public gta(e eVar) {
        this.f28436a = eVar;
    }

    @Override // tb.gsx
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce40c78", new Object[]{this, aVar});
            return;
        }
        j d = aVar.d();
        d.a(this.f28436a.a());
        d.b(102);
        if (g.a(aVar.e(), this.f28436a)) {
            if (aVar.c().c == 0) {
                i iVar = new i();
                iVar.a(aVar.c().c);
                iVar.a(-1L, -1L, -1L, 0);
                aVar.a(new gsz(this, "POLICY_COPY_ONLY")).f();
                return;
            }
            aVar.a(new gsw()).f();
            return;
        }
        aVar.a(new gsy(this, new Exception("write profile failed"))).f();
    }
}
