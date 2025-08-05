package tb;

import android.util.Log;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ewn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f27611a;
    private static String b;

    static {
        kge.a(-585963860);
        f27611a = "detail";
        b = "1.0";
        tpc.a("com.taobao.android.detail.sdk.model.track.UmbrellaMonitor");
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        f27611a = "detail";
        a("pageRender", "DowngradeNative", b, map, "90017", "老Native详情容器渲染");
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("errorTrace", Log.getStackTraceString(th));
        a("downgrade", "DowngradeH5Exception", str2, hashMap, "90015", "客户端异常进入H5详情");
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorTrace", Log.getStackTraceString(th));
        if (str == null) {
            str = "";
        }
        hashMap.put("itemId", str);
        a("dataProcess", "LoadDescDate", b, hashMap, "80023", "图文详情数据解析异常");
    }

    private static void a(String str, String str2, String str3, Map<String, String> map, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce21d813", new Object[]{str, str2, str3, map, str4, str5});
        } else {
            a(str, str2, str3, "Page_Detail", "", map, str4, str5);
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        map.put("ttid", euz.c());
        map.put("detail_v", "3.1.8");
        map.put("containerType", f27611a);
        try {
            UmbrellaTracker.commitFailureStability(str, str2, str3, str4, str5, map, str6, str7);
        } catch (Throwable unused) {
        }
    }
}
