package tb;

import com.alibaba.android.aura.b;
import com.alibaba.android.aura.c;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class jtn extends jte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1107050873);
    }

    public abstract void a(boolean z, String str);

    @Override // tb.aro
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        String a2 = bVar.a();
        if ("AURANextRPCServiceDomain".equals(bVar.f())) {
            a aVar = (a) bbc.a(bVar.c(), "NextRPCRemoteResponse", a.class, null);
            if (aVar == null) {
                a().a(new b(1, jte.ERROR_DOMAIN, "emptyRemoteResponse", "RemoteResponse为空"));
                return;
            }
            aVar.a();
            if (aVar.g() == null) {
                a().a(new b(1, jte.ERROR_DOMAIN, "emptyMtopResponse", "MtopResponse为空"));
                return;
            }
            c e = bVar.e();
            if (e == null) {
                return;
            }
            String d = e.d();
            if ("aura.workflow.adjust".equals(d) || com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_MAIN_FLOW.equals(d) || "aura.workflow.request".equals(d)) {
                a(true, "serviceError");
                return;
            }
        }
        if ("-3000_EMPTY_PROTOCOL_VERSION_BELOW_4".equals(a2) || "-3001_BUY2_DOWNGRADE".equals(a2)) {
            a(true, "protocolDegrade");
            return;
        }
        String f = bVar.f();
        if (bVar.d() != 0 || "AURANextRPCServiceDomain".equals(f)) {
            return;
        }
        if ("confirmOrder".equals(b().d()) && "-1000_EMPTY_RENDER_TREE".equals(a2)) {
            return;
        }
        a(false, "auraError");
    }
}
