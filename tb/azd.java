package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import tb.bap;

/* loaded from: classes2.dex */
public class azd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25712a;
    private JSONObject b;
    private AURAGlobalData c;
    private boolean d = bar.a("enableNewJSTracker", true);

    static {
        kge.a(-1674356410);
    }

    public azd(String str) {
        this.f25712a = str;
    }

    public void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{this, aURAGlobalData});
        } else {
            this.c = aURAGlobalData;
        }
    }

    public void a(b bVar) {
        HashMap hashMap;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
        } else if (this.d) {
            e(bVar);
        } else {
            int a2 = a(bVar.d(), this.f25712a, 100);
            if (a2 == 0 || !bap.a(a2)) {
                return;
            }
            String format = String.format("%s_%s_%s", bVar.f(), Integer.valueOf(bVar.d()), bVar.a());
            String b = bVar.b();
            HashMap hashMap2 = new HashMap();
            if ("AURANextRPCServiceDomain".equals(bVar.f())) {
                hashMap = d(bVar);
                str2 = b(bVar);
                str = "mtop_perf";
            } else {
                hashMap = hashMap2;
                str = "error";
                str2 = format;
            }
            a(hashMap, bVar);
            String format2 = String.format("taobao.%s.monitor", this.f25712a);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errorMsg", b);
            a(hashMap, a.ATOM_stack, bap.a(hashMap3.toString()));
            bap.a("AURA监控", str, "26900-tracker", format2, format, String.valueOf(a2), hashMap, str2);
        }
    }

    private void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c60184", new Object[]{this, bVar});
            return;
        }
        com.alibaba.android.aura.datamodel.nextrpc.a f = f(bVar);
        String a2 = baq.a(f);
        if (!"AURANextRPCServiceDomain".equals(bVar.f())) {
            String format = String.format("%s_%s", bVar.a(), bVar.b());
            if (bVar.d() == 0) {
                bap.a(bap.a.b("abortErrorMonitor").c(format).a(a2).c("c1", this.f25712a).a(1.0f));
            } else {
                bap.a(bap.a.b("loggerErrorMonitor").c(format).a(a2).c("c1", this.f25712a).a(0.001f));
            }
        } else if (f == null) {
        } else {
            d i = f.i();
            bap.a(bap.b.a(this.f25712a + "#" + f.c(), false).a(a2).a(i != null ? i.c() : 0L).b(f.a()).a(1.0f));
        }
    }

    private com.alibaba.android.aura.datamodel.nextrpc.a f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.datamodel.nextrpc.a) ipChange.ipc$dispatch("ecde3a57", new Object[]{this, bVar});
        }
        if (this.c == null) {
            return null;
        }
        com.alibaba.android.aura.datamodel.nextrpc.a aVar = (com.alibaba.android.aura.datamodel.nextrpc.a) bbc.a(bVar.c(), "NextRPCRemoteResponse", com.alibaba.android.aura.datamodel.nextrpc.a.class, null);
        return aVar == null ? (com.alibaba.android.aura.datamodel.nextrpc.a) this.c.get("aura_data_response", com.alibaba.android.aura.datamodel.nextrpc.a.class) : aVar;
    }

    private void a(Map<String, String> map, b bVar) {
        com.alibaba.android.aura.datamodel.nextrpc.a aVar;
        MtopStatistics mtopStat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537fc5b5", new Object[]{this, map, bVar});
            return;
        }
        AURAGlobalData aURAGlobalData = this.c;
        if (aURAGlobalData != null && (aVar = (com.alibaba.android.aura.datamodel.nextrpc.a) aURAGlobalData.get("aura_data_response", com.alibaba.android.aura.datamodel.nextrpc.a.class)) != null && (mtopStat = aVar.g().getMtopStat()) != null) {
            map.put("eagleEyeTraceId", mtopStat.eagleEyeTraceId);
        }
        Map<String, Object> c = bVar.c();
        if (c == null) {
            return;
        }
        for (String str : c.keySet()) {
            if (c.get(str) instanceof String) {
                map.put(str, (String) c.get(str));
            }
        }
    }

    private String b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8251b93f", new Object[]{this, bVar});
        }
        MtopResponse c = c(bVar);
        if (c != null) {
            return c.getRetCode();
        }
        return null;
    }

    private MtopResponse c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("eb9b9219", new Object[]{this, bVar});
        }
        com.alibaba.android.aura.datamodel.nextrpc.a aVar = (com.alibaba.android.aura.datamodel.nextrpc.a) bbc.a(bVar.c(), "NextRPCRemoteResponse", com.alibaba.android.aura.datamodel.nextrpc.a.class, null);
        if (aVar != null) {
            return aVar.g();
        }
        return null;
    }

    private Map<String, String> d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("420af678", new Object[]{this, bVar});
        }
        MtopResponse c = c(bVar);
        if (c == null) {
            return null;
        }
        Map<String, Object> c2 = bVar.c();
        HashMap hashMap = new HashMap();
        try {
            a(hashMap, "api", c.getApi());
            a(hashMap, "success", String.valueOf(c.isApiSuccess()));
            a(hashMap, "headers", bap.a(bba.b(c.getHeaderFields())));
            a(hashMap, "traceId", bap.a((String) bbc.a(c2, "eagleEyeTraceId", String.class, null)));
            a(hashMap, "status", c.getRetCode());
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    private void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{this, map, str, str2});
        } else if (map == null || str == null || str2 == null) {
        } else {
            map.put(str, str2);
        }
    }

    private int a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd34daf1", new Object[]{this, new Integer(i), str, new Integer(i2)})).intValue();
        }
        if (i == 1) {
            return 100;
        }
        JSONObject a2 = a();
        if (a2 == null) {
            return i2;
        }
        try {
            return Integer.parseInt(a2.getString(str));
        } catch (Throwable unused) {
            return i2;
        }
    }

    private JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.b = bba.a(baz.a("auraMonitorSamplingConfig", "{\n\t\"purchase\": \"1\",\n\t\"confirmOrder\": \"1\",\n\t\"tbwaitpay\": \"1\",\n\t\"tbwaitpayfloat\": \"1\"\n\t\"tmgDeliveryConfirmOrder\": \"1\"\n\t\"tmgDeliveryPurchase\": \"1\"\n}", true));
        return this.b;
    }
}
