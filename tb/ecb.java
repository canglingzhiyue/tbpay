package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ecb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_GETDETAIL_NETWORK = "90003";
    public static final String ERR_GETDETAIL_TIME_OUT = "90002";
    public static final String ERR_ULTRON_PROCESS = "90004";

    static {
        kge.a(802477866);
        emu.a("com.taobao.android.detail.core.detail.profile.RequestMonitor");
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        ecg.e(context, ecg.PERFORMANCE_BIZ_NAME, "netRequest", "RequestData", hashMap);
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mtopError", str3);
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "netRequest", "RequestData", hashMap, "90001", "主接口数据接口失败");
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("info", str2);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "netRequest", "RequestData", hashMap, ERR_GETDETAIL_TIME_OUT, "主接口数据接口耗时太长");
    }

    public static void a(Context context, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb59444", new Object[]{context, bVar, str});
        } else if (bVar == null || bVar.i() == 0) {
        } else {
            int i = bVar.i();
            if (i == -2) {
                b(context, "JSON_DATA_PARSE_ERROR", str);
            } else if (i != -1) {
            } else {
                c(context, "EMPTY_DATA_ERROR", str);
            }
        }
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str);
        hashMap.put("pageType", str2);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "dataProcess", "LoadDetail", hashMap, "90011", "主接口数据接口动态数据为空");
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", str);
        hashMap.put("pageType", str2);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "dataProcess", "LoadDetail", hashMap, "90025", "主接口全部数据为空");
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773e7c9d", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mtopError", str3);
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "netRequest", "RequestData", hashMap, ERR_GETDETAIL_NETWORK, "主接口网络异常或限流");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "netRequest", "LoadDetail", null, "90000", "itemId为空");
        }
    }

    public static void a(Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b06cf3e", new Object[]{context, new Boolean(z), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageType", z ? eca.TYPE_DETAIL_AURA : eca.TYPE_DETAIL2);
        hashMap.put("errorMsg", str);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "dataProcess", "LoadDetail", hashMap, ERR_ULTRON_PROCESS, "奥创数据解析异常");
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c81d1", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("reason", str2);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "netRequest", "RequestData", hashMap, ecg.UMB_FEATURE_NEW_MTOP_DOWNGRADE, "详情接口降级老接口getDetail/6.0");
    }
}
