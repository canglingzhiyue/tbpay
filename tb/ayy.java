package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

@AURAExtensionImpl(code = "aura.impl.aspect.error.logger")
/* loaded from: classes2.dex */
public final class ayy extends arm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(927160923);
    }

    public static /* synthetic */ Object ipc$super(ayy ayyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1219783041) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
    }

    @Override // tb.arm, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        arc.a(aza.a());
    }

    @Override // tb.arm, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.aro
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        try {
            arc.a a2 = arc.a.a();
            arc.a a3 = a2.b("AURAAspectErrorLoggerExtension").a("AURA/error").a("bizName", a().c()).a("event", "CORE_EXCEPTION");
            a3.a("AURA_error_code", bVar.f() + "_" + bVar.a()).a("ext", bba.a(bVar.c())).a("errorMsg", bVar.b());
            if (baw.a()) {
                a2.a("ext", bba.a(bVar.c()));
            }
            a aVar = (a) bbc.a(bVar.c(), "NextRPCRemoteResponse", a.class, null);
            if (aVar != null) {
                String a4 = aVar.a();
                String b = aVar.b();
                a2.a("retCode", a4).a(arz.KEY_RET_MSG, b).a(ZimMessageChannel.K_RPC_RES_CODE, azb.b(aVar)).a(arz.KEY_MAPPING_CODE, azb.c(aVar)).a("eagleeye-traceid", azb.a(aVar));
            }
            arc.a().a("onError", a2.b());
        } catch (Throwable unused) {
        }
    }
}
