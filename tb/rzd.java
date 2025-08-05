package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.ssrcore.c;

/* loaded from: classes.dex */
public class rzd implements rzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ssr.SsrExecuteCallBeforeFilter";
    }

    @Override // tb.rzk
    public String a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("352515cf", new Object[]{this, cVar});
        }
        try {
            cVar.d.x = cVar.d.a();
            ryn a2 = cVar.j.getMtopConfig().callFactory.a(cVar.e);
            a2.a(new rzu(cVar));
            if (cVar.i == null) {
                return FilterResult.CONTINUE;
            }
            cVar.i.a(a2);
            return FilterResult.CONTINUE;
        } catch (Exception e) {
            TBSdkLog.e("ssr.SsrExecuteCallBeforeFilter", cVar.b, "invoke call.enqueue of mtopInstance error,apiKey=" + cVar.g.f31244a, e);
            return "STOP";
        }
    }
}
