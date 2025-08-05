package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class rxu implements rxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1746872845);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.SignDegradedErrorAfterFilter";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        if (!ErrorConstant.isIllegelSign(aVar.c.getRetCode()) || !aVar.g.isSignDegraded) {
            return FilterResult.CONTINUE;
        }
        aVar.g.isSignDegradedRetry = true;
        ryh ryhVar = aVar.f25000a.getMtopConfig().filterManager;
        if (ryhVar == null) {
            return FilterResult.CONTINUE;
        }
        ryhVar.a(new rxz(null).a(), aVar);
        return "STOP";
    }
}
