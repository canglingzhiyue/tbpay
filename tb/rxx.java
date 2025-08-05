package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.network.NetworkCallbackAdapter;
import mtopsdk.mtop.network.StreamNetworkCallbackAdapter;
import mtopsdk.mtop.stat.IMtopMonitor;
import mtopsdk.mtop.stat.MtopMonitor;
import mtopsdk.mtop.util.ErrorConstant;
import tb.ryn;

/* loaded from: classes.dex */
public class rxx implements rxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(780588995);
        kge.a(178679831);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.ExecuteCallBeforeFilter";
    }

    @Override // tb.rxn
    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d3d918c", new Object[]{this, aVar});
        }
        try {
            if (MtopMonitor.getInstance() != null) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(IMtopMonitor.DATA_REQUEST, aVar.b.getRequestLog());
                hashMap.put(IMtopMonitor.DATA_SEQ, aVar.h);
                MtopMonitor.getInstance().onCommit(IMtopMonitor.MtopMonitorType.TYPE_REQUEST, hashMap);
            }
            aVar.g.netSendStartTime = aVar.g.currentTimeMillis();
            ryn.a aVar2 = aVar.f25000a.getMtopConfig().callFactory;
            if (aVar2 == null) {
                String str = aVar.h;
                TBSdkLog.e("mtopsdk.ExecuteCallBeforeFilter", str, "call Factory of mtopInstance is null.instanceId=" + aVar.f25000a.getInstanceId());
                MtopResponse mtopResponse = new MtopResponse(ErrorConstant.ERRCODE_MTOP_MISS_CALL_FACTORY, ErrorConstant.ERRMSG_MTOP_MISS_CALL_FACTORY);
                mtopResponse.setApi(aVar.b.getApiName());
                mtopResponse.setV(aVar.b.getVersion());
                aVar.c = mtopResponse;
                ryl.a(aVar);
                return "STOP";
            }
            ryn a2 = aVar2.a(aVar.k);
            if (aVar.k != null && aVar.k.w) {
                a2.a(new StreamNetworkCallbackAdapter(aVar));
            } else {
                a2.a(new NetworkCallbackAdapter(aVar));
            }
            if (aVar.f == null) {
                return FilterResult.CONTINUE;
            }
            aVar.f.setCall(a2);
            return FilterResult.CONTINUE;
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.ExecuteCallBeforeFilter", aVar.h, "invoke call.enqueue of mtopInstance error,apiKey=" + aVar.b.getKey(), e);
            return "STOP";
        }
    }
}
