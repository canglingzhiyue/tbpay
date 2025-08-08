package tb;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* loaded from: classes2.dex */
public class baq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1175561415);
    }

    public static String a(a aVar) {
        MtopResponse g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dfa4f92", new Object[]{aVar});
        }
        if (aVar == null || (g = aVar.g()) == null) {
            return null;
        }
        String a2 = a(g);
        if (!StringUtils.isEmpty(a2)) {
            return a2;
        }
        MtopStatistics mtopStat = g.getMtopStat();
        if (mtopStat == null) {
            return null;
        }
        return mtopStat.eagleEyeTraceId;
    }

    public static String a(MtopResponse mtopResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse});
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        if (headerFields != null && (list = headerFields.get(HttpConstant.EAGLE_EYE_ID_2)) != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
