package tb;

import android.content.Context;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.f;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public final class hyq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMB_FEATURE_CAINIAO_ERROR = "cainiaoError";
    public static final String UMB_FEATURE_CATAPULT_ERROR = "catapultError";
    public static final String UMB_FEATURE_COMPONENT_ERROR = "componentError";
    public static final String UMB_FEATURE_DOWN_GRADE = "downGrade";
    public static final String UMB_FEATURE_DX_ERROR = "dxError";
    public static final String UMB_FEATURE_EVENT_ERROR = "eventError";
    public static final String UMB_FEATURE_LOGISTIC_MAP_ERROR = "logisticMapError";
    public static final String UMB_FEATURE_ORDER_MONITOR = "orderMonitor";
    public static final String UMB_FEATURE_PAGE_ERROR = "pageError";
    public static final String UMB_FEATURE_PAY_ERROR = "payError";
    public static final String UMB_FEATURE_RECOMMEND_ERROR = "recommendError";
    public static final String UMB_FEATURE_RENDER_ERROE = "renderError";
    public static final String UMB_FEATURE_REQUEST_ERROR = "requestError";
    public static final String UMB_FEATURE_REQUEST_SUCCESS = "requestSuccess";

    static {
        kge.a(-798149798);
    }

    public static void a(Context context, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d414a76f", new Object[]{context, str, mtopResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        if (mtopResponse == null || mtopResponse.getHeaderFields() == null) {
            return;
        }
        hashMap.put("ultronRequestSource", String.valueOf(mtopResponse.getHeaderFields().get("MTOP-ultronRequestSource")));
        hashMap.put("eagleeye-traceid", String.valueOf(mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)));
        if (mtopResponse.getMtopStat() != null) {
            hashMap.put(arz.KEY_FULL_TRACE_ID, String.valueOf(mtopResponse.getMtopStat().fullTraceId));
        }
        a(context, str, "requestError", mtopResponse.getApi() + "-" + mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), hashMap);
    }

    public static void b(Context context, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6118e", new Object[]{context, str, mtopResponse});
            return;
        }
        a(context, str, UMB_FEATURE_REQUEST_SUCCESS, mtopResponse.getApi() + "-" + mtopResponse.getV(), "loadOrderDetail", "订单详情接口data结构为空", null);
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{context, str, str2, str3, str4});
            return;
        }
        a(context, str, UMB_FEATURE_PAGE_ERROR, str2, str3 + "- Error", "核心参数 = " + str3 + " 错误原因 = " + str4, null);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e1ce4d", new Object[]{context, str, str2, str3, str4, mtopResponse});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tabName", str4);
        if (mtopResponse != null && mtopResponse.getHeaderFields() != null) {
            hashMap.put("ultronRequestSource", String.valueOf(mtopResponse.getHeaderFields().get("MTOP-ultronRequestSource")));
            hashMap.put("eagleeye-traceid", String.valueOf(mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)));
            if (mtopResponse.getMtopStat() != null) {
                hashMap.put(arz.KEY_FULL_TRACE_ID, String.valueOf(mtopResponse.getMtopStat().fullTraceId));
            }
        }
        a(context, str, UMB_FEATURE_DOWN_GRADE, str2, str3, null, hashMap);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a(null, str, UMB_FEATURE_ORDER_MONITOR, str, str2, str3, null);
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773e7c9d", new Object[]{context, str, str2, str3});
            return;
        }
        a(context, str, UMB_FEATURE_CATAPULT_ERROR, "dataError", str2 + "- Error", "核心参数 = " + str2 + " 错误原因 = " + str3, null);
    }

    public static void b(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b40f148", new Object[]{context, str, str2, str3, map});
        } else {
            a(context, str, UMB_FEATURE_CATAPULT_ERROR, "catapultCallback", str2, str3, map);
        }
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("info", str2);
        a(context, str, UMB_FEATURE_CATAPULT_ERROR, "renderView", "loadView", "系统异常", hashMap);
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
        } else {
            a(context, str, UMB_FEATURE_PAY_ERROR, "init ", "doPay 事件为空", str2, null);
        }
    }

    public static void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
        } else {
            a(context, str, UMB_FEATURE_PAY_ERROR, "init ", "解析参数异常", null, map);
        }
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c81d1", new Object[]{context, str, str2});
        } else {
            a(context, str, UMB_FEATURE_PAY_ERROR, "init ", "支付失败", str2, null);
        }
    }

    public static void c(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3ddafc", new Object[]{context, str, str2, str3});
            return;
        }
        a(context, str, UMB_FEATURE_PAY_ERROR, "dataError", str2 + "- Error", "核心参数 = " + str2 + " 错误原因 = " + str3, null);
    }

    public static void c(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fb2909", new Object[]{context, str, str2, str3, map});
        } else {
            a(context, str, UMB_FEATURE_PAY_ERROR, str2, "bindPay Error", str3, map);
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcc5fd", new Object[]{context, str, str2, str3, str4, map});
        } else {
            a(context, str, UMB_FEATURE_PAY_ERROR, str2, str3, str4, map);
        }
    }

    public static void b(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548aef7e", new Object[]{context, str, str2, str3, str4, map});
        } else {
            a(context, str, "dxError", str2, str3, str4, map);
        }
    }

    public static void c(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13918ff", new Object[]{context, str, str2, str3, str4, map});
        } else {
            a(context, str, UMB_FEATURE_LOGISTIC_MAP_ERROR, str2, str3, str4, map);
        }
    }

    public static void a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        hzz a2 = f.a();
        if (a2 == null) {
            return;
        }
        a2.a(str, map);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d0e0f3", new Object[]{context, str, str2, str3, str4, str5, map});
            return;
        }
        d(context, str2, str3, str4, str5, map);
        hyn.a(str, str3, str4, str5, new String[0]);
    }

    private static void d(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede74280", new Object[]{context, str, str2, str3, str4, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        hzz a2 = f.a();
        if (a2 == null) {
            return;
        }
        a2.a(str, str2, str3, str4, map2);
    }
}
