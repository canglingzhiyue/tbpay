package tb;

import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* loaded from: classes2.dex */
public class arz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_API = "apiName";
    public static final String KEY_EAGLE_EYE_TRACE_ID = "eagleEyeTraceId";
    public static final String KEY_FULL_TRACE_ID = "fullTraceId";
    public static final String KEY_MAPPING_CODE = "mappingCode";
    public static final String KEY_REQUEST_PARAMS = "requestParams";
    public static final String KEY_RESPONSE_STATUS_CODE = "responseStatusCode";
    public static final String KEY_RET_CODE = "retCode";
    public static final String KEY_RET_MSG = "retMsg";
    public static final String KEY_VERSION = "apiVersion";

    static {
        kge.a(2102944184);
    }

    public void a(aqq<AURAParseIO> aqqVar, AURANextRPCIO aURANextRPCIO, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d870082f", new Object[]{this, aqqVar, aURANextRPCIO, aVar});
            return;
        }
        b bVar = new b(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "Mtop mainResponse failed. see extParams.NextRPCRemoteResponse NextRPCRemoteResponse");
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            hashMap.put("NextRPCRemoteResponse", aVar);
        }
        a(aURANextRPCIO.nextRPCEndpoint, aVar, hashMap);
        bVar.a(hashMap);
        aqqVar.a(bVar);
    }

    private void a(AURANextRPCEndpoint aURANextRPCEndpoint, a aVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b98a374", new Object[]{this, aURANextRPCEndpoint, aVar, map});
            return;
        }
        if (aURANextRPCEndpoint != null) {
            map.putAll(a(aURANextRPCEndpoint));
        }
        if (aVar == null || aVar.g() == null) {
            return;
        }
        map.putAll(a(aVar.g()));
    }

    private Map<String, Object> a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cdfd51c0", new Object[]{this, aURANextRPCEndpoint});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apiName", aURANextRPCEndpoint.getApi());
        hashMap.put("apiVersion", aURANextRPCEndpoint.getVersion());
        hashMap.put("requestParams", aURANextRPCEndpoint.getDataParams());
        return hashMap;
    }

    private Map<String, String> a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8bf0da2", new Object[]{this, mtopResponse});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("retCode", mtopResponse.getRetCode());
        hashMap.put(KEY_MAPPING_CODE, mtopResponse.getMappingCode());
        hashMap.put(KEY_RET_MSG, mtopResponse.getRetMsg());
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            hashMap.put(KEY_RESPONSE_STATUS_CODE, String.valueOf(mtopStat.statusCode));
            hashMap.put(KEY_FULL_TRACE_ID, mtopStat.fullTraceId);
            hashMap.put("eagleEyeTraceId", mtopStat.eagleEyeTraceId);
        }
        return hashMap;
    }
}
