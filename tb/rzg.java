package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.network.domain.Request;
import mtopsdk.ssrcore.c;
import mtopsdk.ssrcore.util.b;
import tb.mtk;

/* loaded from: classes.dex */
public class rzg implements rzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rzx f33432a;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ssr.SsrNetworkConvertBeforeFilter";
    }

    public rzg(rzx rzxVar) {
        this.f33432a = rzxVar;
    }

    @Override // tb.rzk
    public String a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("352515cf", new Object[]{this, cVar});
        }
        Request a2 = this.f33432a.a(cVar);
        if (a2 == null) {
            cVar.f = new mtk.a().a(417).a("SSER_NETWORK_REQUEST_CONVERT_ERROR").b(ErrorConstant.ERRMSG_NETWORK_REQUEST_CONVERT_ERROR).a();
            b.a(cVar);
            return "STOP";
        }
        cVar.e = a2;
        cVar.d.O = a2.f25005a;
        a2.s = cVar.d.N;
        return FilterResult.CONTINUE;
    }
}
