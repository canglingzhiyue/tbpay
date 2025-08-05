package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.achieve.b;
import com.tanx.exposer.c;
import com.taobao.tao.log.statistics.d;
import java.util.Map;

/* loaded from: classes4.dex */
public class dgy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f26743a;

    static {
        kge.a(1537854946);
        f26743a = ConnectionResult.SERVICE_UPDATING;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f26743a;
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            f26743a = i;
        }
    }

    public static void a(c cVar, AdMonitorType adMonitorType) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889a8d06", new Object[]{cVar, adMonitorType});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str = "tanx_click_invoke_success";
        } else {
            str = adMonitorType == AdMonitorType.EXPOSE ? "tanx_expose_invoke_success" : "tanx_interact_invoke_success";
        }
        if (cVar == null) {
            dha.a(str, "AdMonitorExtraParams is null");
        } else {
            dgx.a(str, dhb.a(cVar), true);
        }
    }

    public static void a(c cVar, AdMonitorType adMonitorType, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b4c150", new Object[]{cVar, adMonitorType, str});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str2 = "tanx_click_invoke_error";
        } else {
            str2 = adMonitorType == AdMonitorType.EXPOSE ? "tanx_expose_invoke_error" : "tanx_interact_invoke_error";
        }
        if (cVar == null) {
            dha.a(str2, "AdMonitorExtraParams is null");
            return;
        }
        Map<String, Object> a2 = dhb.a(cVar);
        a2.put("errorMsg", str);
        dgx.a(str2, a2, true);
    }

    public static void b(c cVar, AdMonitorType adMonitorType, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a309b11", new Object[]{cVar, adMonitorType, str});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str2 = "tanx_click_invalid_url";
        } else {
            str2 = adMonitorType == AdMonitorType.EXPOSE ? "tanx_expose_invalid_url" : "tanx_interact_invalid_url";
        }
        if (cVar == null) {
            dha.a(str2, "AdMonitorExtraParams is null");
            return;
        }
        Map<String, Object> a2 = dhb.a(cVar);
        a2.put("errorMsg", str);
        dgx.a(str2, a2, true);
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749a1b9f", new Object[]{cVar});
        } else if (cVar == null) {
            dha.a("tanx_expose_request_duplicated", "AdMonitorExtraParams is null");
        } else {
            dgx.a("tanx_expose_request_duplicated", dhb.a(cVar), true);
        }
    }

    public static void a(c cVar, AdMonitorType adMonitorType, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96a371a", new Object[]{cVar, adMonitorType, str, str2});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str3 = "tanx_click_request";
        } else {
            str3 = adMonitorType == AdMonitorType.EXPOSE ? "tanx_expose_request" : "tanx_interact_request";
        }
        if (cVar == null) {
            dha.a(str3, "AdMonitorExtraParams is null");
            return;
        }
        Map<String, Object> a2 = dhb.a(cVar);
        a2.put("host", str);
        a2.put("url_hash", str2);
        dgx.a(str3, a2, true);
    }

    public static void a(b bVar, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f187ca0", new Object[]{bVar, new Boolean(z), str});
        } else if (bVar == null || bVar.d() == null) {
            dha.a("exposeRequestSuccess", "wrapper is null");
        } else {
            if (bVar.d() == AdMonitorType.CLICK) {
                str2 = "tanx_click_request_success";
            } else {
                str2 = bVar.d() == AdMonitorType.EXPOSE ? "tanx_expose_request_success" : "tanx_interact_request_success";
            }
            if (bVar.k() == null) {
                dha.a(str2, "AdMonitorExtraParams is null");
                return;
            }
            Map<String, Object> a2 = dhb.a(bVar.k());
            a2.put("host", bVar.f());
            a2.put("url_hash", bVar.e());
            a2.put(d.PARAM_IS_RETRY, String.valueOf(z));
            a2.put("retryType", str);
            dgx.a(str2, a2, false);
        }
    }

    public static void a(b bVar, int i, String str, boolean z, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bd502f", new Object[]{bVar, new Integer(i), str, new Boolean(z), str2});
        } else if (bVar == null || bVar.d() == null) {
            dha.a("exposeRequestFail", "wrapper is null");
        } else {
            if (bVar.d() == AdMonitorType.CLICK) {
                str3 = "tanx_click_request_fail";
            } else {
                str3 = bVar.d() == AdMonitorType.EXPOSE ? "tanx_expose_request_fail" : "tanx_interact_request_fail";
            }
            if (bVar.k() == null) {
                dha.a(str3, "AdMonitorExtraParams is null");
                return;
            }
            Map<String, Object> a2 = dhb.a(bVar.k());
            a2.put("host", bVar.f());
            a2.put("url_hash", bVar.e());
            a2.put(d.PARAM_IS_RETRY, String.valueOf(z));
            a2.put("retryType", str2);
            a2.put("url", bVar.b());
            a2.put("errorCode", String.valueOf(i));
            a2.put("errorMsg", str);
            dgx.a(str3, a2, false);
        }
    }
}
