package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberData;
import java.text.DecimalFormat;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.ssrcore.MtopSsrStatistics;
import mtopsdk.ssrcore.c;

/* loaded from: classes9.dex */
public class rza implements rzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "ssr.SsrAppConfigBeforeFilter";
    }

    @Override // tb.rzk
    public String a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("352515cf", new Object[]{this, cVar});
        }
        Mtop mtop = cVar.j;
        MtopSsrStatistics mtopSsrStatistics = cVar.d;
        MtopNetworkProp mtopNetworkProp = cVar.f25036a;
        try {
            if (StringUtils.isNotBlank(mtopSsrStatistics.N) && SwitchConfig.getInstance().getEnableFullTraceId()) {
                mtopNetworkProp.clientTraceId = mtopSsrStatistics.N;
            } else {
                StringBuilder sb = new StringBuilder(64);
                sb.append(mtop.getMtopConfig().utdid);
                sb.append(System.currentTimeMillis());
                sb.append(new DecimalFormat(PreholdingPhoneNumberData.PRE_SUCCESS).format(mtopSsrStatistics.J % 10000));
                sb.append("1");
                sb.append(mtop.getMtopConfig().processId);
                mtopNetworkProp.clientTraceId = sb.toString();
            }
        } catch (Exception e) {
            TBSdkLog.e("ssr.SsrAppConfigBeforeFilter", cVar.b, "generate client-trace-id failed.", e);
        }
        mtopNetworkProp.falcoId = mtopSsrStatistics.N;
        return FilterResult.CONTINUE;
    }
}
