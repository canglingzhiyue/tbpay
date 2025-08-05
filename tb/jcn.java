package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.ifz;

@AURAExtensionImpl(code = "alibuy.impl.aspect.error.alarm.monitor.handler")
/* loaded from: classes4.dex */
public final class jcn extends hih {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1509344749);
    }

    public static /* synthetic */ Object ipc$super(jcn jcnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.hih
    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c671184", new Object[]{this, bVar})).booleanValue();
        }
        String d = a().d();
        if (!"purchase".equals(d) && !"confirmOrder".equals(d)) {
            return false;
        }
        return a(d, bVar);
    }

    private boolean a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c36be4e", new Object[]{this, str, bVar})).booleanValue();
        }
        if ("AURANextRPCServiceDomain".equals(bVar.f())) {
            a b = b(bVar);
            if (b == null) {
                return false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("openFrom", (String) a().a("purchaseFrom", String.class));
            ifz.a(ifz.b.a(b.c(), false).a(baq.a(b)).a(b.i().c()).b(b.a()).a(hashMap).a(1.0f));
            return true;
        }
        ifz.a(ifz.a.b(bVar.d() == 0 ? "abortErrorMonitor" : "loggerErrorMonitor").a(bVar.b()).c(String.format("%s#%s（%s）", str, bVar.a(), bVar.b())).c("c1", a().d()).a(0.001f));
        return true;
    }

    private a b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("88d8f3db", new Object[]{this, bVar});
        }
        a aVar = (a) bbc.a(bVar.c(), "NextRPCRemoteResponse", a.class, null);
        return aVar == null ? (a) c().get("aura_data_response", a.class) : aVar;
    }
}
