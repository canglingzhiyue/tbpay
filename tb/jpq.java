package tb;

import android.content.Context;
import anet.channel.util.HttpConstant;
import com.alibaba.android.nextrpc.stream.internal.response.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.android.ultron.performence.model.a;
import com.taobao.android.ultron.performence.model.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public class jpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1507069574);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            jpo.b(context).a("apmClientBeforeNetworkLogicProcess", false, (Map<String, String>) null);
        } catch (Exception e) {
            UnifyLog.d("DMRequesterStagePerformance", "rightBeforeRequest exception:" + e.getMessage());
        }
    }

    public static void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae8c825", new Object[]{context, mtopResponse});
            return;
        }
        try {
            jpo.b(context).a("apmClientAfterNetworkLogicProcess", (String) null);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, boolean z, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72cb939", new Object[]{context, new Boolean(z), mtopResponse});
        } else if (!z) {
        } else {
            try {
                jpo.b(context).b(mtopResponse.getApi(), true, (Map<String, String>) null);
            } catch (Exception unused) {
            }
        }
    }

    public static void b(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5949cc04", new Object[]{context, mtopResponse});
            return;
        }
        try {
            jpo.b(context).a("apmClientUltronProcess", "apmClientAfterNetworkLogicProcess");
        } catch (Exception e) {
            UnifyLog.d("DMRequesterStagePerformance", "rightBeforeDataParse exception:" + e.getMessage());
        }
    }

    public static void a(Context context, MtopResponse mtopResponse, JSONObject jSONObject, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95f752b", new Object[]{context, mtopResponse, jSONObject, new Long(j), new Long(j2)});
        } else {
            a(context, mtopResponse, jSONObject, j, j2, null);
        }
    }

    public static void a(Context context, MtopResponse mtopResponse, JSONObject jSONObject, long j, long j2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f8485", new Object[]{context, mtopResponse, jSONObject, new Long(j), new Long(j2), bVar});
            return;
        }
        try {
            jpo b = jpo.b(context);
            if (!b.a()) {
                return;
            }
            a(b, mtopResponse);
            a aVar = new a(jSONObject);
            Map<String, String> b2 = aVar.b();
            if (b2 != null) {
                b.a(b2);
            }
            b.a("apmClientUltronProcess", false, (Map<String, String>) null);
            UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("apmClientNetwork");
            ultronPerformanceStageModel.setStartMills(j);
            ultronPerformanceStageModel.setEndMills(j2);
            b.a(ultronPerformanceStageModel, (String) null, false);
            a(b, bVar);
            List<c> a2 = aVar.a();
            if (a2 == null || a2.isEmpty()) {
                return;
            }
            for (c cVar : a2) {
                Map<String, String> d = cVar.d();
                if (d == null) {
                    d = new HashMap<>();
                }
                a(b, cVar.a(), "apmClientNetwork", 0L, cVar.c() - cVar.b(), true, d);
            }
        } catch (Exception e) {
            jqg.a("DMRequesterStagePerformance", "rightAfterDataParse exception:" + e.getMessage());
        }
    }

    private static void a(jpo jpoVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6496b1a9", new Object[]{jpoVar, bVar});
        } else if (bVar == null) {
        } else {
            a(jpoVar, "nextRPCParseJsonStage", "apmClientNetwork", bVar.b(), bVar.c(), true, null);
            a(jpoVar, "nextRPCSwitchThreadStage", "apmClientNetwork", bVar.d(), bVar.e(), true, null);
            if (!bVar.a()) {
                return;
            }
            jpoVar.b("isHitMTopStreamJson", "true");
        }
    }

    private static void a(jpo jpoVar, String str, String str2, long j, long j2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40843d4", new Object[]{jpoVar, str, str2, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel(str);
        ultronPerformanceStageModel.setStartMills(j);
        ultronPerformanceStageModel.setEndMills(j2);
        ultronPerformanceStageModel.setArgs(map);
        ultronPerformanceStageModel.setFreeStage(z);
        jpoVar.a(ultronPerformanceStageModel, str2, false);
    }

    private static void a(jpo jpoVar, MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fc8654", new Object[]{jpoVar, mtopResponse});
        } else if (mtopResponse == null || (headerFields = mtopResponse.getHeaderFields()) == null) {
        } else {
            List<String> list = headerFields.get(HttpConstant.EAGLE_EYE_ID_2);
            if (list != null && !list.isEmpty()) {
                jpoVar.b(HttpConstant.EAGLE_EYE_ID_2, list.get(0));
            }
            List<String> list2 = headerFields.get(HttpHeaderConstant.X_BIN_LENGTH);
            if (list2 != null && !list2.isEmpty()) {
                jpoVar.b("downloadBodyDataSize", list2.get(0));
            }
            List<String> list3 = headerFields.get("x-used-stream");
            if (list3 == null || list3.isEmpty()) {
                return;
            }
            jpoVar.b("streamMode", list3.get(0));
        }
    }

    public static void c(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7aacfe3", new Object[]{context, mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            try {
                jpo.b(context).b(mtopResponse.getApi(), true, (Map<String, String>) null);
            } catch (Exception e) {
                UnifyLog.d("DMRequesterStagePerformance", "rightAfterRequestError exception:" + e.getMessage());
            }
        }
    }
}
