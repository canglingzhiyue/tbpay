package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.f;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public class iaa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMB_FEATURE_CAINIAO_ERROR = "cainiaoError";
    public static final String UMB_FEATURE_CATCH_EXCEPTION = "umbCatchException";
    public static final String UMB_FEATURE_CATCH_MAP_EXCEPTION = "umbCatchMApException";
    public static final String UMB_FEATURE_CONTAINER_CREATE_ERROR = "listContainerCreateError";
    public static final String UMB_FEATURE_DX_ERROR = "dxError";
    public static final String UMB_FEATURE_REQUEST_ERROR = "requestError";

    static {
        kge.a(-934711050);
    }

    public static void a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
        } else {
            a(context, str, UMB_FEATURE_CATCH_EXCEPTION, "exception", "executeWithException", str2, map);
        }
    }

    public static void a(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c86b987", new Object[]{context, str, str2, str3, map});
        } else {
            a(context, str, "dxError", "parser", str2, str3, map);
        }
    }

    public static void b(Context context, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b40f148", new Object[]{context, str, str2, str3, map});
        } else {
            a(context, str, UMB_FEATURE_CONTAINER_CREATE_ERROR, "container View", str2, str3, map);
        }
    }

    public static void a(Context context, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d414a76f", new Object[]{context, str, mtopResponse});
            return;
        }
        a(context, str, "requestError", mtopResponse.getApi() + "-" + mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            a(context, str, "cainiaoError", "init ", " star cainiao native error", str2, null);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        a(context, str, "cainiaoError", "dataError", str2 + "- Error", "核心参数 = " + str2 + " 错误原因 = " + str3, null);
    }

    private static void a(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d0e0f3", new Object[]{context, str, str2, str3, str4, str5, map});
            return;
        }
        a(context, str2, str3, str4, str5, map);
        hzy.a(str, str3, str4, str5, new String[0]);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcc5fd", new Object[]{context, str, str2, str3, str4, map});
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
