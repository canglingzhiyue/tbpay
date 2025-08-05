package tb;

import android.net.Uri;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.c;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.utils.o;
import kotlin.jvm.internal.q;
import tb.tle;

/* loaded from: classes9.dex */
public final class tld implements tle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1096739631);
        kge.a(67334940);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            tle.a.b(this);
        }
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        tle.a.a(this, instance);
        s sVar = s.f18233a;
        q.b(sVar, "ProcedureManagerProxy.PROXY");
        sVar.d().a("TMS_globalContainerOptimization", Boolean.valueOf(c.a(instance.o())));
        Uri b = o.b(instance.g());
        s sVar2 = s.f18233a;
        q.b(sVar2, "ProcedureManagerProxy.PROXY");
        sVar2.d().a("isThemis", "true");
        s sVar3 = s.f18233a;
        q.b(sVar3, "ProcedureManagerProxy.PROXY");
        sVar3.d().a("tmsSDKVersion", "1.1");
        if (m.b(b)) {
            s sVar4 = s.f18233a;
            q.b(sVar4, "ProcedureManagerProxy.PROXY");
            sVar4.d().a("tmsAppId", m.a(b));
        }
        if (i.a(b)) {
            s sVar5 = s.f18233a;
            q.b(sVar5, "ProcedureManagerProxy.PROXY");
            g d = sVar5.d();
            i iVar = i.INSTANCE;
            String uri = b.toString();
            q.b(uri, "uri.toString()");
            i.a a2 = iVar.a(uri);
            d.a("uniAppId", a2 != null ? a2.b() : null);
        }
        s sVar6 = s.f18233a;
        q.b(sVar6, "ProcedureManagerProxy.PROXY");
        sVar6.d().a("tmsBizType", MspGlobalDefine.TINY_APP);
        s sVar7 = s.f18233a;
        q.b(sVar7, "ProcedureManagerProxy.PROXY");
        sVar7.d().a("tmsBizType", MspGlobalDefine.TINY_APP);
        TMSSolutionType type = TMSSolutionType.getType(b);
        if (type == null) {
            return;
        }
        s sVar8 = s.f18233a;
        q.b(sVar8, "ProcedureManagerProxy.PROXY");
        sVar8.d().a("tmsSolutionType", type.name());
    }
}
